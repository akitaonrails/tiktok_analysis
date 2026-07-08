package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAProductAnchorStateApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.resp.SubsAnchorConsumptionResponse;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.modeo.ttep.moderation.PreviewMaterials;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12Yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774512Yl implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            case 15:
                return then$15(this, c15o7);
            case 16:
                return then$16(this, c15o7);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return then$17(this, c15o7);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return then$18(this, c15o7);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19774512Yl(Object obj, MutableLiveData<RecommendHashTagResponse> mutableLiveData) {
        this.$t = mutableLiveData;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$0(C19774512Yl c19774512Yl, C15O7 c15o7) {
        C19557811fU c19557811fU = (C19557811fU) c19774512Yl.l0;
        c19557811fU.getClass();
        C1C7U.LIZ("FTCVEEffectHelper@5fc7.prepareVideoReverseGenerator$1L");
        if (c15o7.LJIILJJIL() && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            c19557811fU.LJFF.setValue(Boolean.TRUE);
            EffectPointModel effectPointModel = c19557811fU.LJJIJIL;
            if (effectPointModel != null && TextUtils.equals("1", effectPointModel.getKey()) && c19557811fU.LJJIJIIJI) {
                C0EYM c0eym = (C0EYM) c19557811fU.LIZJ.getValue();
                if (c0eym != null && c0eym.LJI == 0) {
                    C0EYM c0eymLIZJ = C0EYM.LIZJ(c19557811fU.LJJI.LLL());
                    c0eymLIZJ.LJII = c19557811fU.LJJIFFI.LIZ;
                    c19557811fU.LIZJ.setValue(c0eymLIZJ);
                }
                c19557811fU.LJIIIZ();
                C1452720nuI c1452720nuILJII = C1452720nuI.LJII();
                c19557811fU.LJIIIIZZ.setOverlayColor(c19557811fU.LJJIIJ);
                c19557811fU.LJ.setValue(c1452720nuILJII);
                c19557811fU.LJIIJ();
            }
        } else {
            c19557811fU.LJFF.setValue(Boolean.FALSE);
        }
        C1C7U.LIZIZ("FTCVEEffectHelper@5fc7.prepareVideoReverseGenerator$1L");
        return null;
    }

    public static final Object then$1(C19774512Yl c19774512Yl, C15O7 c15o7) {
        TextStickerCompileResult textStickerCompileResult;
        C1C7U.LIZ("EditTextStickerComponent@10da.compileWithPNG$1$1");
        if (c15o7.LJIIL() != null) {
            textStickerCompileResult = new TextStickerCompileResult(((C196925122x) c19774512Yl.l0).LJIIJ(), (C384910F7h) c15o7.LJIIL());
        } else {
            textStickerCompileResult = null;
        }
        C1C7U.LIZIZ("EditTextStickerComponent@10da.compileWithPNG$1$1");
        return textStickerCompileResult;
    }

    public static final Object then$10(C19774512Yl c19774512Yl, C15O7 c15o7) {
        return MvChooseCoverBitmapCreator.lambda$getCoverWithoutSeek$2((C0MBV) c19774512Yl.l0, c15o7);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$11(X.C19774512Yl r21, X.C15O7 r22) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19774512Yl.then$11(X.12Yl, X.15O7):java.lang.Object");
    }

    public static final Object then$12(C19774512Yl c19774512Yl, C15O7 c15o7) {
        Object obj;
        C1C7U.LIZ("TTEPAbilityServiceImpl@9eb0.fetchTTEPMaterials$1");
        if (AnonymousClass1186.LIZIZ(c15o7)) {
            try {
                obj = (PreviewMaterials) c15o7.LJIIL();
                if (obj != null) {
                    ((Function2) c19774512Yl.l0).invoke(obj, null);
                } else {
                    ((Function2) c19774512Yl.l0).invoke(null, new Exception("Empty result."));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((Function2) c19774512Yl.l0).invoke(null, e);
                obj = Unit.LIZ;
            }
        } else {
            ((Function2) c19774512Yl.l0).invoke(null, c15o7.LJIIJJI());
            obj = Unit.LIZ;
        }
        C1C7U.LIZIZ("TTEPAbilityServiceImpl@9eb0.fetchTTEPMaterials$1");
        return obj;
    }

    public static final Object then$13(C19774512Yl c19774512Yl, C15O7 c15o7) {
        boolean z;
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) c19774512Yl.l0;
        mediaPlayerModule.getClass();
        C1C7U.LIZ("MediaPlayerModule@3962.startDirectly$2L");
        int iIntValue = ((Integer) c15o7.LJIIL()).intValue();
        MutableLiveData<C19764312Un> mutableLiveData = mediaPlayerModule.LLIZLLLIL;
        if (iIntValue >= 0) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C19764312Un(1, z));
        Integer numValueOf = Integer.valueOf(iIntValue);
        C1C7U.LIZIZ("MediaPlayerModule@3962.startDirectly$2L");
        return numValueOf;
    }

    public static final Object then$14(C19774512Yl c19774512Yl, C15O7 c15o7) {
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) c19774512Yl.l0;
        mediaPlayerModule.getClass();
        C1C7U.LIZ("MediaPlayerModule@3962.startDirectly$4L");
        mediaPlayerModule.LLIZLLLIL.setValue(new C19764312Un(2, ((Boolean) c15o7.LJIIL()).booleanValue()));
        C1C7U.LIZIZ("MediaPlayerModule@3962.startDirectly$4L");
        return null;
    }

    public static final Object then$15(C19774512Yl c19774512Yl, C15O7 c15o7) {
        C1C7U.LIZ("FTCPinHelper@6e9d.startPin$1$onSuccess$2");
        C196878121c c196878121c = (C196878121c) c19774512Yl.l0;
        c196878121c.getClass();
        Integer numValueOf = null;
        if (C2286708xd.LIZJ(null)) {
            C2354709Kn.LJIJJLI(null);
        }
        String strLIZ = C2239408q0.LIZ(c196878121c.LIZ);
        c196878121c.LJ = strLIZ;
        C2354709Kn.LJFF(strLIZ, true);
        if (C2286708xd.LIZJ(null)) {
            C2354709Kn.LJIJJLI(null);
        }
        String strLIZIZ = C2239408q0.LIZIZ(c196878121c.LIZ);
        c196878121c.LJFF = strLIZIZ;
        C2354709Kn.LJFF(strLIZIZ, true);
        C196878121c c196878121c2 = (C196878121c) c19774512Yl.l0;
        c196878121c2.LJIIIIZZ = c196878121c2.LIZIZ.LLL();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(((C196878121c) c19774512Yl.l0).LIZIZ);
        if (c348100DkmLIZIZ != null) {
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(((C196878121c) c19774512Yl.l0).LIZLLL);
            if (c348440DlKLJJIIJZLJL != null) {
                C196878121c c196878121c3 = (C196878121c) c19774512Yl.l0;
                c196878121c3.getClass();
                c348440DlKLJJIIJZLJL.LIZLLL = 0L;
                c348440DlKLJJIIJZLJL.LJ = -2L;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                numValueOf = Integer.valueOf(c348100DkmLIZIZ.LJIIIZ().LIZ().beginInfoStickerPin(c196878121c3.LIZLLL));
            }
            if (numValueOf.intValue() < 0) {
                C196878121c c196878121c4 = (C196878121c) c19774512Yl.l0;
                c196878121c4.LJII = false;
                c196878121c4.LIZ();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FTCPinHelper@6e9d.startPin$1$onSuccess$2");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object then$16(C19774512Yl c19774512Yl, C15O7 c15o7) {
        String str;
        Integer num;
        C1C7U.LIZ("SubscriptionAnchorMaker@6ef0.setupAnchorWithApi$1");
        ((C11W7) c19774512Yl.l0).LLJILJIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("API came back 1- ");
        sbLIZ.append(c15o7.LJIIJJI());
        sbLIZ.append(c15o7.LJIIL());
        C2188811AlT.LIZIZ(sbLIZ);
        SubsAnchorConsumptionResponse subsAnchorConsumptionResponse = (SubsAnchorConsumptionResponse) c15o7.LJIIL();
        if (subsAnchorConsumptionResponse != null && (num = subsAnchorConsumptionResponse.subscribeStatus) != null) {
            C11W7 c11w7 = (C11W7) c19774512Yl.l0;
            String strLJIJ = c11w7.LLJ.LJIJ(Integer.valueOf(num.intValue()));
            if (strLJIJ != null) {
                c11w7.LJJIJIIJI(strLJIJ);
                c11w7.LLJIJIL = strLJIJ;
            }
        }
        C11W7 c11w72 = (C11W7) c19774512Yl.l0;
        SubsAnchorConsumptionResponse subsAnchorConsumptionResponse2 = (SubsAnchorConsumptionResponse) c15o7.LJIIL();
        if (subsAnchorConsumptionResponse2 != null) {
            str = subsAnchorConsumptionResponse2.jumpUrl;
        } else {
            str = null;
        }
        c11w72.LLJI = str;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionAnchorMaker@6ef0.setupAnchorWithApi$1");
        return unit;
    }

    public static final Object then$17(C19774512Yl c19774512Yl, C15O7 c15o7) {
        String str;
        String str2;
        long j;
        long j2;
        StickerItemModel stickerItemModel;
        String str3;
        StickerItemModel stickerItemModel2;
        StickerItemModel stickerItemModel3;
        StickerItemModel stickerItemModel4;
        String str4;
        StickerItemModel stickerItemModel5;
        StickerItemModel stickerItemModel6;
        C1C7U.LIZ("PinHelper@7698.startPin$1$onSuccess$2");
        AnonymousClass1214 anonymousClass1214 = (AnonymousClass1214) c19774512Yl.l0;
        C196874120y c196874120y = anonymousClass1214.LJI;
        Integer numValueOf = null;
        if (c196874120y != null && (stickerItemModel6 = c196874120y.LLILLL) != null) {
            str = stickerItemModel6.pinAlgorithmFile;
        } else {
            str = null;
        }
        if (C2286708xd.LIZJ(str)) {
            C196874120y c196874120y2 = anonymousClass1214.LJI;
            if (c196874120y2 != null && (stickerItemModel5 = c196874120y2.LLILLL) != null) {
                str4 = stickerItemModel5.pinAlgorithmFile;
            } else {
                str4 = null;
            }
            C2354709Kn.LJIJJLI(str4);
        }
        String strLIZ = C2239408q0.LIZ(anonymousClass1214.LIZ);
        anonymousClass1214.LJ = strLIZ;
        C2354709Kn.LJFF(strLIZ, true);
        C196874120y c196874120y3 = anonymousClass1214.LJI;
        if (c196874120y3 != null && (stickerItemModel4 = c196874120y3.LLILLL) != null) {
            stickerItemModel4.setPinAlgorithmFile(anonymousClass1214.LJ);
        }
        C196874120y c196874120y4 = anonymousClass1214.LJI;
        if (c196874120y4 != null && (stickerItemModel3 = c196874120y4.LLILLL) != null) {
            str2 = stickerItemModel3.pinAlgorithmMappingFile;
        } else {
            str2 = null;
        }
        if (C2286708xd.LIZJ(str2)) {
            C196874120y c196874120y5 = anonymousClass1214.LJI;
            if (c196874120y5 != null && (stickerItemModel2 = c196874120y5.LLILLL) != null) {
                str3 = stickerItemModel2.pinAlgorithmMappingFile;
            } else {
                str3 = null;
            }
            C2354709Kn.LJIJJLI(str3);
        }
        String strLIZIZ = C2239408q0.LIZIZ(anonymousClass1214.LIZ);
        anonymousClass1214.LJFF = strLIZIZ;
        C2354709Kn.LJFF(strLIZIZ, true);
        C196874120y c196874120y6 = anonymousClass1214.LJI;
        if (c196874120y6 != null && (stickerItemModel = c196874120y6.LLILLL) != null) {
            stickerItemModel.pinAlgorithmMappingFile = anonymousClass1214.LJFF;
        }
        AnonymousClass1214 anonymousClass12142 = (AnonymousClass1214) c19774512Yl.l0;
        anonymousClass12142.LJIIIZ = anonymousClass12142.LIZIZ.LLL();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(((AnonymousClass1214) c19774512Yl.l0).LIZIZ);
        if (c348100DkmLIZIZ != null) {
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(((AnonymousClass1214) c19774512Yl.l0).LIZLLL);
            if (c348440DlKLJJIIJZLJL != null) {
                AnonymousClass1214 anonymousClass12143 = (AnonymousClass1214) c19774512Yl.l0;
                C196874120y c196874120y7 = anonymousClass12143.LJI;
                if (c196874120y7 != null) {
                    j = c196874120y7.LLILLL.startTime;
                } else {
                    j = 0;
                }
                c348440DlKLJJIIJZLJL.LIZLLL = j;
                if (c196874120y7 != null) {
                    j2 = c196874120y7.LLILLL.endTime;
                } else {
                    j2 = -2;
                }
                c348440DlKLJJIIJZLJL.LJ = j2;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                numValueOf = Integer.valueOf(c348100DkmLIZIZ.LJIIIZ().LIZ().beginInfoStickerPin(anonymousClass12143.LIZLLL));
            }
            if (numValueOf.intValue() < 0) {
                ((AnonymousClass1214) c19774512Yl.l0).LIZIZ();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PinHelper@7698.startPin$1$onSuccess$2");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object then$18(C19774512Yl c19774512Yl, C15O7 c15o7) {
        C2208361Bbu c2208361Bbu;
        C1C7U.LIZ("ImageCompressUtil@7985.compressImage$2");
        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null && (c2208361Bbu = (C2208361Bbu) c15o7.LJIIL()) != null) {
            ((InterfaceC19728212Gq) c19774512Yl.l0).LIZ(c2208361Bbu);
        } else {
            ((InterfaceC19728212Gq) c19774512Yl.l0).LIZJ();
        }
        C1C7U.LIZIZ("ImageCompressUtil@7985.compressImage$2");
        return null;
    }

    public static final Object then$2(C19774512Yl c19774512Yl, C15O7 c15o7) {
        TextStickerCompileResult textStickerCompileResult;
        C1C7U.LIZ("EditTextStickerComponent@10da.compileWithPNG$2$1");
        if (c15o7.LJIIL() != null) {
            textStickerCompileResult = new TextStickerCompileResult(((C196925122x) c19774512Yl.l0).getData(), (C384910F7h) c15o7.LJIIL());
        } else {
            textStickerCompileResult = null;
        }
        C1C7U.LIZIZ("EditTextStickerComponent@10da.compileWithPNG$2$1");
        return textStickerCompileResult;
    }

    public static final Object then$3(C19774512Yl c19774512Yl, C15O7 c15o7) {
        List<RecommendHashTagData> list;
        C1C7U.LIZ("RecommendHashTagApi@4156.fetchRecommendHashTags$1");
        if (c15o7.LJIILJJIL()) {
            RecommendHashTagResponse recommendHashTagResponse = (RecommendHashTagResponse) c15o7.LJIIL();
            if (recommendHashTagResponse != null && (list = recommendHashTagResponse.data) != null) {
                C08XD.LJJ(list, new Comparator() { // from class: X.117j
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((RecommendHashTagData) obj).pos - ((RecommendHashTagData) obj2).pos;
                    }
                });
            }
            ((MutableLiveData) c19774512Yl.l0).setValue(c15o7.LJIIL());
        }
        C1C7U.LIZIZ("RecommendHashTagApi@4156.fetchRecommendHashTags$1");
        return null;
    }

    public static final Object then$4(C19774512Yl c19774512Yl, C15O7 c15o7) {
        C1C7U.LIZ("BAProductAnchorStateApi@ff0.getBAProductLinkState$1$1");
        if (((BAProductAnchorStateApi.ProductLinkStateResponse) c15o7.LJIIL()).getStatusCode() == 0) {
            ((AnchorPublishStruct) c19774512Yl.l0).baProductLinkState = ((BAProductAnchorStateApi.ProductLinkStateResponse) c15o7.LJIIL()).getLinkStatus();
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) c19774512Yl.l0;
            boolean z = false;
            if (!BAProductAnchorStateApi.LIZIZ.getBoolean("clicked", false) && ((AnchorPublishStruct) c19774512Yl.l0).baProductLinkState == 5) {
                z = true;
            }
            anchorPublishStruct.isNew = z;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BAProductAnchorStateApi@ff0.getBAProductLinkState$1$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$5(X.C19774512Yl r18, X.C15O7 r19) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19774512Yl.then$5(X.12Yl, X.15O7):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$6(C19774512Yl c19774512Yl, C15O7 c15o7) {
        C19557511fR c19557511fR = (C19557511fR) c19774512Yl.l0;
        c19557511fR.getClass();
        C1C7U.LIZ("VEEffectHelper@574b.prepareVideoReverseGenerator$1L");
        MutableLiveData<Boolean> mutableLiveData = c19557511fR.LJI;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        if (c15o7.LJIILJJIL() && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            c19557511fR.LJFF.setValue(Boolean.TRUE);
            EffectPointModel effectPointModel = c19557511fR.LJJJ;
            if (effectPointModel != null && TextUtils.equals("1", effectPointModel.getKey()) && c19557511fR.LJJIJL) {
                C0EYM c0eym = (C0EYM) c19557511fR.LIZJ.getValue();
                if (c0eym != null && c0eym.LJI == 0) {
                    C0EYM c0eymLIZJ = C0EYM.LIZJ(c19557511fR.LJJIII.LLL());
                    c0eymLIZJ.LJII = c19557511fR.LJJIIJ.LIZ;
                    c19557511fR.LIZJ.setValue(c0eymLIZJ);
                }
                c19557511fR.LJIIIZ();
                C1452720nuI c1452720nuILJII = C1452720nuI.LJII();
                c19557511fR.LJIIIZ.setOverlayColor(c19557511fR.LJJIIZI);
                c19557511fR.LJ.setValue(c1452720nuILJII);
                c19557511fR.LJIIJ();
            }
        } else {
            c19557511fR.LJFF.setValue(bool);
        }
        C1C7U.LIZIZ("VEEffectHelper@574b.prepareVideoReverseGenerator$1L");
        return null;
    }

    public static final Object then$7(C19774512Yl c19774512Yl, C15O7 c15o7) {
        TextStickerCompileResult textStickerCompileResult;
        C1C7U.LIZ("FTCEditTextStickerViewModel@3862.compile$1");
        if (c15o7.LJIIL() != null) {
            textStickerCompileResult = new TextStickerCompileResult(((C196925122x) c19774512Yl.l0).LJIIJ(), (C384910F7h) c15o7.LJIIL());
        } else {
            textStickerCompileResult = null;
        }
        C1C7U.LIZIZ("FTCEditTextStickerViewModel@3862.compile$1");
        return textStickerCompileResult;
    }

    public static final Object then$8(C19774512Yl c19774512Yl, C15O7 c15o7) {
        TextStickerCompileResult textStickerCompileResult;
        C1C7U.LIZ("FTCEditTextStickerViewModel@3862.compile$2$1");
        if (c15o7.LJIIL() != null) {
            textStickerCompileResult = new TextStickerCompileResult(((C196925122x) c19774512Yl.l0).LJIIJ(), (C384910F7h) c15o7.LJIIL());
        } else {
            textStickerCompileResult = null;
        }
        C1C7U.LIZIZ("FTCEditTextStickerViewModel@3862.compile$2$1");
        return textStickerCompileResult;
    }

    public static final Object then$9(C19774512Yl c19774512Yl, C15O7 c15o7) {
        return MvChooseCoverBitmapCreator.lambda$getCoverWithSeekWithResult$10((C0MBV) c19774512Yl.l0, c15o7);
    }
}
