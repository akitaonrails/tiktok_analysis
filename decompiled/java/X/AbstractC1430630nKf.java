package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0nKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1430630nKf extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public VideoPublishEditModel LLIZ;

    public abstract void LJIILL(AbstractImageUploader abstractImageUploader, UploadImageConfig uploadImageConfig, VideoPublishEditModel videoPublishEditModel);

    public abstract boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel);

    public abstract String LJIJI(VideoPublishEditModel videoPublishEditModel);

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.COVER_TEXT_UPLOAD;
    }

    public final void LJIIZILJ(C1430650nKh c1430650nKh) {
        boolean z;
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN != null && c1431070nLN.LIZJ < C1430640nKg.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        C1431070nLN c1431070nLN2 = null;
        if (z) {
            C1431070nLN c1431070nLN3 = this.LLILZLL;
            if (c1431070nLN3 == null) {
                c1431070nLN3 = null;
            }
            c1431070nLN3.LIZ.LIZIZ(null);
            try {
                c1431070nLN3.LIZIZ.invoke();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C1431070nLN c1431070nLN4 = this.LLILZLL;
        if (c1431070nLN4 != null) {
            c1431070nLN2 = c1431070nLN4;
        }
        c1431070nLN2.LIZLLL(c1430650nKh.getErrorCode(), c1430650nKh);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    @Override // X.AbstractC1434490nQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1404610meh r8, X.C1431070nLN r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1430630nKf.LJII(X.0meh, X.0nLN):void");
    }

    public final void LJIJ(Object obj, boolean z) {
        C1431070nLN c1431070nLN = this.LLILZLL;
        C1431070nLN c1431070nLN2 = null;
        if (c1431070nLN != null && c1431070nLN.LIZJ != C1430640nKg.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "mock_upload_cover_error_until_retry_max", true, false)) {
            LJIIZILJ(new C1430650nKh(null, null));
            return;
        }
        C1431070nLN c1431070nLN3 = this.LLILZLL;
        if (c1431070nLN3 != null) {
            c1431070nLN2 = c1431070nLN3;
        }
        c1431070nLN2.LJ(obj, z);
    }

    public final void LJIILJJIL(final VideoPublishEditModel videoPublishEditModel, final String str, UploadImageConfig uploadImageConfig) throws Exception {
        final AbstractImageUploader c2207811Bb1;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            c2207811Bb1 = new C2207831Bb3(uploadImageConfig);
        } else {
            c2207811Bb1 = new C2207811Bb1(uploadImageConfig);
        }
        try {
            c2207811Bb1.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nKe
                @Override // X.InterfaceC2207871Bb7
                public final void onLog(int i, int i2, String str2) {
                }

                @Override // X.InterfaceC2207871Bb7
                public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                    EffectTextModel effectTextModel;
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    StickerItemModel textSticker;
                    Long lValueOf;
                    int i2;
                    String str2;
                    boolean zLJJIIZI;
                    c2207811Bb1.LJ();
                    if (i == 6) {
                        c2207811Bb1.LIZJ();
                        if (imageUploadInfo != null && (str2 = imageUploadInfo.mImageToskey) != null && str2.length() != 0) {
                            String str3 = str;
                            if (str3 != null) {
                                zLJJIIZI = a0.LJJIIZI(str3, "_custom", false);
                            } else {
                                zLJJIIZI = false;
                            }
                            String str4 = "";
                            if (zLJJIIZI && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                AbstractC1430630nKf abstractC1430630nKf = this;
                                String str5 = imageUploadInfo.mImageToskey;
                                if (str5 != null) {
                                    str4 = str5;
                                }
                                abstractC1430630nKf.LJIJ(new C1153330g7P(str4), false);
                                return;
                            }
                            AbstractC1430630nKf abstractC1430630nKf2 = this;
                            String str6 = imageUploadInfo.mImageToskey;
                            if (str6 != null) {
                                str4 = str6;
                            }
                            abstractC1430630nKf2.LJIJ(new C1430030nJh(str4), false);
                            return;
                        }
                        AbstractC1430630nKf abstractC1430630nKf3 = this;
                        C1430650nKh c1430650nKh = new C1430650nKh(null, null);
                        c1430650nKh.setErrorCode(-235);
                        abstractC1430630nKf3.LJIIZILJ(c1430650nKh);
                        return;
                    }
                    c2207811Bb1.LJFF();
                    if (i == 7) {
                        c2207811Bb1.LIZJ();
                        C0VSJ c0vsj = new C0VSJ(str);
                        if (!c0vsj.exists() || c0vsj.length() == 0) {
                            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                            if (coverPublishModel != null) {
                                effectTextModel = coverPublishModel.getEffectTextModel();
                            } else {
                                effectTextModel = null;
                            }
                            C1431070nLN c1431070nLN = this.LLILZLL;
                            if (c1431070nLN == null) {
                                c1431070nLN = null;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("hasCoverText: ");
                            if (effectTextModel != null) {
                                boolValueOf = Boolean.valueOf(effectTextModel.getHasCoverText());
                            } else {
                                boolValueOf = null;
                            }
                            sbLIZ.append(boolValueOf);
                            sbLIZ.append(", isCoverTextValid: ");
                            if (effectTextModel != null) {
                                boolValueOf2 = Boolean.valueOf(effectTextModel.isCoverTextValid());
                            } else {
                                boolValueOf2 = null;
                            }
                            sbLIZ.append(boolValueOf2);
                            sbLIZ.append(", coverTextInfo: ");
                            if (effectTextModel != null) {
                                textSticker = effectTextModel.getTextSticker();
                            } else {
                                textSticker = null;
                            }
                            sbLIZ.append(textSticker);
                            sbLIZ.append(", model: ");
                            sbLIZ.append(C1416310mxZ.LJIIJ(videoPublishEditModel));
                            c1431070nLN.LIZIZ(new C1404990mfJ("CoverUploadTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("cover text image upload failed ... error code : ");
                        if (imageUploadInfo != null) {
                            lValueOf = Long.valueOf(imageUploadInfo.mErrorCode);
                        } else {
                            lValueOf = null;
                        }
                        sbLIZ2.append(lValueOf);
                        sbLIZ2.append(",image info: path=");
                        sbLIZ2.append(str);
                        sbLIZ2.append("&exist=");
                        sbLIZ2.append(c0vsj.exists());
                        sbLIZ2.append("&length=");
                        sbLIZ2.append(c0vsj.length());
                        sbLIZ2.append(", error msg : ");
                        sbLIZ2.append(new JSONArray());
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                        AbstractC1430630nKf abstractC1430630nKf4 = this;
                        C1430650nKh c1430650nKh2 = new C1430650nKh(null, illegalArgumentException);
                        if (imageUploadInfo != null) {
                            i2 = (int) imageUploadInfo.mErrorCode;
                        } else {
                            i2 = 14;
                        }
                        c1430650nKh2.setErrorCode(i2);
                        abstractC1430630nKf4.LJIIZILJ(c1430650nKh2);
                        return;
                    }
                    c2207811Bb1.LJI();
                }
            });
            LJIILL(c2207811Bb1, uploadImageConfig, videoPublishEditModel);
            c2207811Bb1.LJIIIZ(1, new String[]{str});
            c2207811Bb1.LJIIJJI(C19221910Hx.LJFF());
            c2207811Bb1.LJIILIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c2207811Bb1.LIZJ();
            throw e;
        }
    }
}
