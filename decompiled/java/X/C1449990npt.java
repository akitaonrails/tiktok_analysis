package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.NLECompileLevel;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0npt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449990npt {
    public static final C1449990npt LIZ = new C1449990npt();

    public static boolean LJFF(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        if (nLEModel.getTracks().size() > 1) {
            return true;
        }
        NLETrack nLETrack = (NLETrack) C13LP.LJJJLZIJ(0, nLEModel.getTracks());
        if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
            C21665819qi c21665819qiLIZ = C389780FQa.LIZ(nLETrackSlot);
            Boolean boolLJJII = C351220Dpo.LJJII(nLETrackSlot, "crop_is_photo_cropped", null);
            if (boolLJJII != null) {
                zBooleanValue = boolLJJII.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (c21665819qiLIZ.LIZLLL == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            boolean z4 = c21665819qiLIZ.LJI;
            if (c21665819qiLIZ.LJFF % 360 == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = !z2;
            if (zBooleanValue && z3 && z4 && z5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Bitmap.CompressFormat LJIIIIZZ(VEVideoEncodeSettings.COMPILE_TYPE compile_type) {
        int i = C1439400nYo.LIZIZ[compile_type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Bitmap.CompressFormat.JPEG;
                }
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static BaseStickerModel LJIIIZ(BaseStickerModel baseStickerModel) {
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, baseStickerModel.getContainerWidth(), baseStickerModel.getContainerHeight(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null);
    }

    public static BaseStickerModel LJIIJ(BaseStickerModel baseStickerModel, int i) {
        if (i == 0) {
            return baseStickerModel;
        }
        return BaseStickerModel.copy$default(baseStickerModel, 0, baseStickerModel.getZIndex() + i, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -3, 15, null);
    }

    public static void LIZ(C1463670oBx c1463670oBx, SingleImageData singleImageData, FilterBean filterBean) {
        C348880Dm2 c348880Dm2 = new C348880Dm2(c1463670oBx);
        float filterIntensityRatio = singleImageData.getFilterInfo().getFilterIntensityRatio();
        c348880Dm2.LIZJ();
        c348880Dm2.LIZ(filterBean.getFilterFolder(), Collections.singletonList(new Pair(C1643880ssc.LIZJ(filterBean), Float.valueOf(filterIntensityRatio))), filterBean.getCategoryKey(), filterBean.getName(), filterBean.getId(), filterBean.getResId(), filterBean.getExtra(), filterIntensityRatio, false);
    }

    public static void LJI(C1463670oBx c1463670oBx, NLEModel nLEModel, SingleImageData singleImageData) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LJII(next), "COLOR")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replaceFilterIfNeeded findTrack = ");
        sbLIZ.append(nLETrack);
        sbLIZ.append(" filterId = ");
        sbLIZ.append(singleImageData.getFilterInfo().getFilterId());
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (singleImageData.getFilterInfo().getFilterId().length() == 0 && nLETrack != null) {
            c1463670oBx.LIZJ().removeTrack(nLETrack);
            c1463670oBx.jg();
        }
        FilterBean filterBeanLJIIIIZZ = C574070MfN.LJIIIIZZ(singleImageData.getFilterInfo());
        if (filterBeanLJIIIIZZ == null) {
            return;
        }
        if (nLETrack == null) {
            C1450070nq1.LIZ("replaceFilterIfNeeded addFilter");
            LIZ(c1463670oBx, singleImageData, filterBeanLJIIIIZZ);
            return;
        }
        if (Intrinsics.LJFF("", filterBeanLJIIIIZZ.getFilterFolder())) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("replaceFilterIfNeeded addFilter  latestFilter.filterFolder = ");
        sbLIZ2.append(filterBeanLJIIIIZZ.getFilterFolder());
        sbLIZ2.append(" latestFilter.id = ");
        sbLIZ2.append(filterBeanLJIIIIZZ.getId());
        sbLIZ2.append(' ');
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c1463670oBx.LIZJ().removeTrack(nLETrack);
        LIZ(c1463670oBx, singleImageData, filterBeanLJIIIIZZ);
    }

    public static final void LIZJ(C1463670oBx c1463670oBx, final String str, VEVideoEncodeSettings vEVideoEncodeSettings, final INLEListenerCompile iNLEListenerCompile) {
        NLECompileLevel compileLevel;
        int iSwigValue;
        LIZ.getClass();
        C201955140j.LIZIZ("ImageNLECompileUtils", "compileFrameV1 start");
        if (((Boolean) C259800AGc.LIZ.getValue()).booleanValue()) {
            boolean zCompile = c1463670oBx.LIZLLL().LIZIZ.getExporterApi().compile(str, C1776260wK8.LJ(vEVideoEncodeSettings), new INLEListenerCompile() { // from class: X.0npw
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    iNLEListenerCompile.onCompileDone();
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i, int i2, float f, String str2) {
                    Boolean boolValueOf;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCompileError error: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ext = ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", f = ");
                    sbLIZ.append(f);
                    sbLIZ.append(" msg = ");
                    sbLIZ.append(str2);
                    sbLIZ.append(" path exists = ");
                    File parentFile = new C0VSJ(str).getParentFile();
                    if (parentFile != null) {
                        boolValueOf = Boolean.valueOf(parentFile.exists());
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ.append(boolValueOf);
                    C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            NLECompileResult compileResult = c1463670oBx.LIZLLL().LIZIZ.getExporterApi().getCompileResult();
            Boolean boolValueOf = null;
            if (compileResult != null) {
                compileLevel = compileResult.getCompileLevel();
            } else {
                compileLevel = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compileFrame: can compile = ");
            sbLIZ.append(zCompile);
            sbLIZ.append(", compileLevel = ");
            sbLIZ.append(compileLevel);
            sbLIZ.append(" path exists = ");
            File parentFile = new C0VSJ(str).getParentFile();
            if (parentFile != null) {
                boolValueOf = Boolean.valueOf(parentFile.exists());
            }
            sbLIZ.append(boolValueOf);
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (!zCompile) {
                if (compileLevel == NLECompileLevel.NLECompileLevelPicUploadDirectly) {
                    iSwigValue = -558;
                } else if (compileLevel != null) {
                    iSwigValue = compileLevel.swigValue();
                } else {
                    iSwigValue = 200001;
                }
                iNLEListenerCompile.onCompileError(200001, iSwigValue, -1.0f, "cannot compile");
                return;
            }
            return;
        }
        if (c1463670oBx.LIZLLL().LIZIZ.getExporterApi().compile(str, C1776260wK8.LJ(vEVideoEncodeSettings), iNLEListenerCompile)) {
            return;
        }
        C1450070nq1.LIZ("compileFrame: can't compile");
        iNLEListenerCompile.onCompileError(200001, 200001, -1.0f, "cannot compile");
    }

    public static final void LJ(boolean z, SingleImageData singleImageData, InterfaceC1450050npz interfaceC1450050npz, C817403Hg c817403Hg, int i, int i2) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        String path;
        SrcLiveVideoInfo srcLiveInfo;
        if (C295670BiP.LIZ() && z) {
            String path2 = singleImageData.getSrcImageInfo().getPath();
            SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
            ImageSynthesisResult imageSynthesisResult = null;
            if (srcLiveInfo2 != null) {
                livePhotoPreviewMode = srcLiveInfo2.getLivePhotoPreviewMode();
            } else {
                livePhotoPreviewMode = null;
            }
            if (livePhotoPreviewMode != LivePhotoPreviewMode.LIVE_PHOTO || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null || (path = srcLiveInfo.getPath()) == null) {
                path = "";
            }
            NLECompileLevel nLECompileLevel = NLECompileLevel.NLECompileLevelPicUploadDirectly;
            int iSwigValue = nLECompileLevel.swigValue();
            if (path.length() != 0) {
                imageSynthesisResult = new ImageSynthesisResult(path, i, i2, Integer.valueOf(nLECompileLevel.swigValue()), null, Float.valueOf(c817403Hg.element), null, null, null, 464, null);
            }
            interfaceC1450050npz.LIZIZ(new ImageSynthesisResult(path2, i, i2, Integer.valueOf(iSwigValue), null, null, imageSynthesisResult, null, null, 432, null));
            return;
        }
        interfaceC1450050npz.LIZIZ(new ImageSynthesisResult(singleImageData.getSrcImageInfo().getPath(), singleImageData.getSrcImageInfo().getWidth(), singleImageData.getSrcImageInfo().getHeight(), Integer.valueOf(NLECompileLevel.NLECompileLevelPicUploadDirectly.swigValue()), null, null, null, null, null, 496, null));
    }

    public static final void LIZLLL(C1463670oBx c1463670oBx, SingleImageData singleImageData, int i, int i2, final String str, final VEVideoEncodeSettings vEVideoEncodeSettings, final INLEListenerCompile iNLEListenerCompile) {
        boolean z;
        LIZ.getClass();
        NLETrack firstTrackWithType = c1463670oBx.LIZJ().getFirstTrackWithType(NLETrackType.FILTER);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compileNleDisplayFrameV2 start, hasFilter: ");
        if (firstTrackWithType != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (firstTrackWithType == null && !singleImageData.hasImageAltered()) {
            VecLongLong vecLongLong = new VecLongLong(Collections.singletonList(0L));
            final C557050Lt1 c557050Lt1 = new C557050Lt1(false);
            int images = c1463670oBx.LIZLLL().LIZIZ.getMediaRuntimeApi().getImages(vecLongLong, i, i2, NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL, new INLEListenerGetImage() { // from class: X.0npv
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
                public final int onGetImageData(byte[] bArr, int i3, int i4, int i5, float f) {
                    if (i3 >= 0 && !c557050Lt1.LIZIZ()) {
                        if (bArr == null) {
                            C1450070nq1.LIZ("getNLEDisplayFrame failed with null data");
                            c557050Lt1.LIZJ(true);
                            iNLEListenerCompile.onCompileError(200002, 200002, -1.0f, "NleSessionGetImages null data");
                            return 0;
                        }
                        try {
                            try {
                                C1449990npt c1449990npt = C1449990npt.LIZ;
                                VEVideoEncodeSettings.COMPILE_TYPE compile_type = vEVideoEncodeSettings.compileType;
                                c1449990npt.getClass();
                                Bitmap.CompressFormat compressFormatLJIIIIZZ = C1449990npt.LJIIIIZZ(compile_type);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                                C0VSV c0vsv = new C0VSV(str);
                                bitmapCreateBitmap.compress(compressFormatLJIIIIZZ, C13LZ.LJ((int) vEVideoEncodeSettings.getImageCompileQuality().floatValue(), 0, 100), c0vsv);
                                c0vsv.flush();
                                c0vsv.close();
                                iNLEListenerCompile.onCompileDone();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                iNLEListenerCompile.onCompileError(200003, 200003, -1.0f, "NleSessionGetImages compress failed");
                            }
                            c557050Lt1.LIZJ(true);
                            return 0;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c557050Lt1.LIZJ(true);
                            throw th;
                        }
                    }
                    C201955140j.LIZIZ("ImageNLECompileUtils", "ignore invalid callback");
                    return 0;
                }
            });
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getNLEDisplayFrame: return ");
            sbLIZ2.append(images);
            C201955140j.LIZIZ("ImageNLECompileUtils", C2188811AlT.LIZIZ(sbLIZ2));
            if (images != 0) {
                iNLEListenerCompile.onCompileError(200002, 200002, -1.0f, "NleSessionGetImages failed");
                return;
            }
            return;
        }
        iNLEListenerCompile.onCompileError(200004, 200004, -1.0f, "GetImages not support filters");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1463670oBx LIZIZ(final com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r36, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r37, com.ss.android.ugc.aweme.creative.model.CreativeModel r38, X.C1432030nMv r39, final java.lang.String r40, final X.InterfaceC1450050npz r41, java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449990npt.LIZIZ(com.ss.android.ugc.aweme.creative.model.edit.SingleImageData, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0nMv, java.lang.String, X.0npz, java.lang.String):X.0oBx");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022d  */
    /* JADX WARN: Type inference failed for: r3v59, types: [T, X.0nqD] */
    /* JADX WARN: Type inference failed for: r3v63, types: [T, X.0nqD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LJII(X.C1449990npt r30, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r31, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r32, com.ss.android.ugc.aweme.creative.model.CreativeModel r33, X.C1432030nMv r34, X.C1463670oBx r35, boolean r36, java.lang.String r37, int r38) {
        /*
            Method dump skipped, instruction units count: 2329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449990npt.LJII(X.0npt, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0nMv, X.0oBx, boolean, java.lang.String, int):X.0HZe");
    }
}
