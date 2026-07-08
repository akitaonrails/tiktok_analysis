package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E08, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E08 implements InterfaceC1428350nGz {
    public final InterfaceC1428340nGy LIZ;
    public final C1424090nA7 LIZIZ;
    public PhotoTemplateAsset LIZJ;
    public SingleImageData LIZLLL;
    public volatile boolean LJ;

    @Override // X.InterfaceC1428350nGz
    public final String LIZ(NLEModel nLEModel) {
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZJ() {
        this.LJ = true;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LJFF() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1428350nGz
    public final NLEModel LJI(PhotoTemplateAsset photoTemplateAsset) {
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final PhotoTemplateAsset LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZIZ(SingleImageData singleImageData) {
        this.LIZLLL = singleImageData;
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1428350nGz
    public final boolean LJII(PhotoTemplateAsset photoTemplateAsset) {
        return C1413020msG.LIZIZ(photoTemplateAsset);
    }

    public C0E08(InterfaceC1428340nGy interfaceC1428340nGy, C1424090nA7 c1424090nA7) {
        this.LIZ = interfaceC1428340nGy;
        this.LIZIZ = c1424090nA7;
    }

    @Override // X.InterfaceC1428350nGz
    public final AbstractC19484711Kz<NLEModel> LJ(int i, PhotoTemplateAsset photoTemplateAsset, NLETrackSlot nLETrackSlot, final NLEModel nLEModel, final LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        this.LIZJ = photoTemplateAsset;
        this.LJ = false;
        final AwS601S0100000_22 awS601S0100000_22 = (AwS601S0100000_22) function1;
        awS601S0100000_22.invoke(30);
        return C1424090nA7.LIZIZ(this.LIZIZ, photoTemplateAsset, i, 1, "").LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0E09
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str = (String) obj;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_debug_tool", true, false) && C2272641DxO.LJII.length() > 0) {
                    final String str2 = C2272641DxO.LJII;
                    C2272641DxO.LJII = "";
                    C0E08 c0e08 = this.LL;
                    final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    c0e08.getClass();
                    return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0LB8
                        @Override // X.InterfaceC300801Eo
                        public final void subscribe(InterfaceC2329309At<NLETemplateModel> interfaceC2329309At) {
                            final C11KT c11kt = (C11KT) interfaceC2329309At;
                            C0LB9.LIZ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class), C0CHQ.LIZ, new CutSource(str2, CutSourceType.JSON), new C1428840nHm((String) null, (Boolean) null, false, (NLEModelDownloader) null, EnumC539100LCi.UGC, (ICutReporter) null, false, false, new NLEPrepareListener() { // from class: X.0E4m
                                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                                }

                                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                                public final void onProgress(float f, String str3) {
                                }

                                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                                    if (nLETemplateModel == null) {
                                        c11kt.onError(new RuntimeException("downloadTemplate: null nleModel", new RuntimeException(String.valueOf(EnumC358710E4n.DOWNLOAD_NLE_FAIL.getValue()))));
                                    } else {
                                        c11kt.onSuccess(nLETemplateModel);
                                    }
                                }

                                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                                public final void onError(int i2, String str3) {
                                    InterfaceC2329309At<NLETemplateModel> interfaceC2329309At2 = c11kt;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("downloadTemplate failed, code:");
                                    sbLIZ.append(i2);
                                    sbLIZ.append(", message:");
                                    sbLIZ.append(str3);
                                    interfaceC2329309At2.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), new RuntimeException(String.valueOf(EnumC358710E4n.DOWNLOAD_NLE_FAIL.getValue()))));
                                }
                            }, 475), lifecycleOwner2, 16);
                        }
                    });
                }
                C0E08 c0e082 = this.LL;
                final LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                c0e082.getClass();
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0LB8
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<NLETemplateModel> interfaceC2329309At) {
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        C0LB9.LIZ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class), C0CHQ.LIZ, new CutSource(str, CutSourceType.JSON), new C1428840nHm((String) null, (Boolean) null, false, (NLEModelDownloader) null, EnumC539100LCi.UGC, (ICutReporter) null, false, false, new NLEPrepareListener() { // from class: X.0E4m
                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onProgress(float f, String str3) {
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                                if (nLETemplateModel == null) {
                                    c11kt.onError(new RuntimeException("downloadTemplate: null nleModel", new RuntimeException(String.valueOf(EnumC358710E4n.DOWNLOAD_NLE_FAIL.getValue()))));
                                } else {
                                    c11kt.onSuccess(nLETemplateModel);
                                }
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onError(int i2, String str3) {
                                InterfaceC2329309At<NLETemplateModel> interfaceC2329309At2 = c11kt;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("downloadTemplate failed, code:");
                                sbLIZ.append(i2);
                                sbLIZ.append(", message:");
                                sbLIZ.append(str3);
                                interfaceC2329309At2.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), new RuntimeException(String.valueOf(EnumC358710E4n.DOWNLOAD_NLE_FAIL.getValue()))));
                            }
                        }, 475), lifecycleOwner3, 16);
                    }
                });
            }
        }).LJIL(new InterfaceC1487280oo2() { // from class: X.0E07
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                float f;
                long endTime;
                NLESegment mainSegment;
                boolean z;
                NLETrackSlot nLETrackSlot2;
                NLESegment mainSegment2;
                NLETrackSlot nLETrackSlot3;
                NLESegment mainSegment3;
                NLETemplateModel nLETemplateModel = (NLETemplateModel) obj;
                awS601S0100000_22.invoke(80);
                SingleImageData singleImageData = this.LIZLLL;
                C371780Ehs.LIZLLL(singleImageData);
                float fMax = Math.max(singleImageData.getImageRatio(), C1450870nrJ.LIZJ);
                float canvasRatio = nLEModel.getCanvasRatio();
                float imageRatio = 1.0f;
                if (fMax > canvasRatio) {
                    f = canvasRatio / fMax;
                } else {
                    f = 1.0f;
                }
                SingleImageData singleImageData2 = this.LIZLLL;
                C371780Ehs.LIZLLL(singleImageData2);
                if (singleImageData2.getImageRatio() < canvasRatio) {
                    SingleImageData singleImageData3 = this.LIZLLL;
                    C371780Ehs.LIZLLL(singleImageData3);
                    imageRatio = singleImageData3.getImageRatio() / canvasRatio;
                }
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null) {
                    endTime = mainTrack.getEndTime();
                } else {
                    endTime = ((long) 10000) * 1000;
                }
                C01TT.LIZLLL(new AwS406S0200000_5(this, nLEModel, 131));
                VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                C0E08 c0e08 = this;
                for (NLETrack nLETrack : tracks) {
                    if (!c0e08.LJ && !nLETrack.getMainTrack()) {
                        for (NLETrackSlot nLETrackSlot4 : nLETrack.getSlots()) {
                            nLETrackSlot4.setEndTime(endTime);
                            nLETrackSlot4.setTransformX(nLETrackSlot4.getTransformX() * imageRatio);
                            nLETrackSlot4.setTransformY(nLETrackSlot4.getTransformY() * f);
                        }
                        nLETrack.setEndTime(endTime);
                        NLETrackSlot nLETrackSlot5 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                        if (nLETrackSlot5 != null && (mainSegment = nLETrackSlot5.getMainSegment()) != null) {
                            NLETrackType trackType = nLETrack.getTrackType();
                            NLETrackType nLETrackType = NLETrackType.FILTER;
                            if (trackType == nLETrackType) {
                                nLETrack.setExtraTrackType(nLETrackType);
                                nLETrack.setExtra("track_type", "type_filter");
                                NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment);
                                if (nLESegmentComposerFilterDynamicCast != null) {
                                    nLETrack.setExtra("FilterTrackType", "COLOR");
                                    VecNLEStringFloatPairSPtr effectNodeKeyValuePairs = nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs();
                                    if (effectNodeKeyValuePairs != null) {
                                        Iterator<NLEStringFloatPair> it2 = effectNodeKeyValuePairs.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            NLEStringFloatPair next = it2.next();
                                            if (Intrinsics.LJFF(next.getFirst(), "Filter_intensity")) {
                                                if (next == null) {
                                                }
                                            }
                                        }
                                    }
                                    NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                                    nLEStringFloatPair.setFirst("Filter_intensity");
                                    nLEStringFloatPair.setSecond(nLESegmentComposerFilterDynamicCast.getIntensity());
                                    nLESegmentComposerFilterDynamicCast.addEffectNodeKeyValuePair(nLEStringFloatPair);
                                } else {
                                    nLETrack.setExtra("FilterTrackType", "COLOR_NO_COMPOSER");
                                }
                            } else {
                                NLETrackType trackType2 = nLETrack.getTrackType();
                                NLETrackType nLETrackType2 = NLETrackType.STICKER;
                                if (trackType2 == nLETrackType2) {
                                    nLETrack.setExtraTrackType(nLETrackType2);
                                    nLETrack.setExtra("track_type", "sticker");
                                    if (nLETrack.getTrackType() == nLETrackType2 && (nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment3 = nLETrackSlot3.getMainSegment()) != null && NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment3) != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        nLETrack.setExtra("StickerTrackType", "INFO");
                                    } else if ((nLETrack.getTrackType() == nLETrackType2 && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment2 = nLETrackSlot2.getMainSegment()) != null && NLESegmentTextSticker.dynamicCast((NLENode) mainSegment2) != null) || C371780Ehs.LJIILL(nLETrack)) {
                                        nLETrack.setExtra("StickerTrackType", "TEXT");
                                    }
                                }
                            }
                        }
                    }
                }
                this.LIZ.dn(nLEModel, nLETemplateModel, new C5183020f((Function1) awS601S0100000_22, (Function1<? super Long, Object>) 239));
                awS601S0100000_22.invoke(100);
                return nLEModel;
            }
        });
    }
}
