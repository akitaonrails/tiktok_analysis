package X;

import Y.AObjectS406S0100000_32;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.publish.DraftPanelModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.19LP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LP extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LP(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212219183d) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("assistant", null, 0);
        }
    }

    public static final void LIZ$1(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212219183d) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("assistant", null, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.18kS, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static final void LIZ$10(C19LP c19lp, View view) throws Throwable {
        boolean z;
        ?? c21372018kQ;
        C0KWL.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_button_panel_type", true) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((VideoPublishContainerScene) c19lp.l0).LLLLLL()) {
            if (Long.valueOf(((VideoPublishContainerScene) c19lp.l0).LLLLIILL.creativeModel.postPageModel.draftPanelModel.currentDraftSize).longValue() <= 0) {
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) c19lp.l0;
                videoPublishContainerScene.w();
                C1402600mbS c1402600mbS = C1402600mbS.LIZ;
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
                c1402600mbS.getClass();
                C1402600mbS.LIZ(videoPublishEditModel, null, null);
                return;
            }
            C19EG c19egRequireFragmentActivity = ((VideoPublishContainerScene) c19lp.l0).requireFragmentActivity();
            VideoPublishEditModel videoPublishEditModel2 = ((VideoPublishContainerScene) c19lp.l0).LLLLIILL;
            AObjectS406S0100000_32 aObjectS406S0100000_32 = new AObjectS406S0100000_32(c19lp, 0);
            AObjectS406S0100000_32 aObjectS406S0100000_322 = new AObjectS406S0100000_32(c19lp, 1);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_button_panel_type", true) > 0) {
                int iLJI = C0KWL.LJI();
                if (iLJI == 1) {
                    c21372018kQ = new C21372318kT(c19egRequireFragmentActivity);
                } else if (iLJI == 2) {
                    c21372018kQ = new C21372118kR(c19egRequireFragmentActivity);
                } else if (iLJI == 3) {
                    c21372018kQ = new C21372418kU(c19egRequireFragmentActivity);
                } else if (iLJI != 4) {
                    return;
                } else {
                    c21372018kQ = new C21372018kQ(c19egRequireFragmentActivity);
                }
                c21372018kQ.LIZ(videoPublishEditModel2, aObjectS406S0100000_322, aObjectS406S0100000_32);
                DraftPanelModel draftPanelModel = videoPublishEditModel2.creativeModel.postPageModel.draftPanelModel;
                long j = draftPanelModel.currentDraftSize;
                long j2 = draftPanelModel.draftBoxSize;
                c21372018kQ.LIZJ(Long.valueOf(j), Long.valueOf(j2));
                IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) C0KWL.LIZIZ.getValue();
                if (iPublishGuideDraftService != null) {
                    iPublishGuideDraftService.LIZJ(new AwS581S0100000_2((Object) c21372018kQ, (Object) 403));
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJLILLLLZIIL = false;
                c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1e, c19egRequireFragmentActivity);
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIII = c21372018kQ;
                tuxSheet.show(c19egRequireFragmentActivity.getSupportFragmentManager(), "guide_save_draft_and_post");
                C1402600mbS c1402600mbS2 = C1402600mbS.LIZ;
                Long lValueOf = Long.valueOf(j);
                Long lValueOf2 = Long.valueOf(j2);
                c1402600mbS2.getClass();
                C1402600mbS.LIZ(videoPublishEditModel2, lValueOf, lValueOf2);
                return;
            }
            return;
        }
        VideoPublishContainerScene videoPublishContainerScene2 = (VideoPublishContainerScene) c19lp.l0;
        videoPublishContainerScene2.w();
        C1402600mbS c1402600mbS3 = C1402600mbS.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = videoPublishContainerScene2.LLLLIILL;
        c1402600mbS3.getClass();
        C1402600mbS.LIZ(videoPublishEditModel3, null, null);
    }

    public static final void LIZ$11(C19LP c19lp, View view) {
        C181I c181i;
        if (view != null && (c181i = (C181I) c19lp.l0) != null) {
            c181i.LIZ("flip_card_upper_area", null, 0);
        }
    }

    public static final void LIZ$12(C19LP c19lp, View view) {
        C181I c181i;
        if (view != null && (c181i = (C181I) c19lp.l0) != null) {
            c181i.LIZ("flip_card_lower_area", null, 0);
        }
    }

    public static final void LIZ$13(C19LP c19lp, View view) {
        Function2<Product, Integer, Unit> function2;
        if (view != null && (function2 = ((C212183181t) c19lp.l0).LIZLLL) != null) {
            function2.invoke(null, 0);
        }
    }

    public static final void LIZ$14(C19LP c19lp, View view) {
        Function2<Product, Integer, Unit> function2;
        if (view != null && (function2 = ((C212189181z) c19lp.l0).LIZLLL) != null) {
            function2.invoke(null, 0);
        }
    }

    public static final void LIZ$15(C19LP c19lp, View view) {
        C181I popCardViewCallback;
        if (view != null && (popCardViewCallback = ((AnonymousClass1853) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("assistant", null, 0);
        }
    }

    public static final void LIZ$16(C19LP c19lp, View view) {
        C181I popCardViewCallback;
        if (view != null && (popCardViewCallback = ((AnonymousClass1853) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("assistant", null, 0);
        }
    }

    public static final void LIZ$17(C19LP c19lp, View view) {
        C181I popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212181181r) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("title", null, 0);
        }
    }

    public static final void LIZ$18(C19LP c19lp, View view) {
        if (view != null) {
            C212181181r c212181181r = (C212181181r) c19lp.l0;
            if (c212181181r.LLJJIJIIJIL && c212181181r.LLJJIJIL == 1) {
                C181I popCardViewCallback = c212181181r.getPopCardViewCallback();
                if (popCardViewCallback != null) {
                    popCardViewCallback.LIZ("pin_button", null, 0);
                    return;
                }
                return;
            }
            C181I popCardViewCallback2 = c212181181r.getPopCardViewCallback();
            if (popCardViewCallback2 == null) {
                return;
            }
            popCardViewCallback2.LIZ("button", null, 0);
        }
    }

    public static final void LIZ$19(C19LP c19lp, View view) {
        C181I popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212181181r) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("other", null, 0);
        }
    }

    public static final void LIZ$2(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212219183d) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("title", null, 0);
        }
    }

    public static final void LIZ$3(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212219183d) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("other", null, 0);
        }
    }

    public static final void LIZ$4(C19LP c19lp, View view) {
        Function2 function2;
        if (view != null && (function2 = (Function2) c19lp.l0) != null) {
            function2.invoke(Boolean.FALSE, "user_close");
        }
    }

    public static final void LIZ$5(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212174181k) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("title", null, 0);
        }
    }

    public static final void LIZ$6(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212174181k) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("button", null, 0);
        }
    }

    public static final void LIZ$7(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C212174181k) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("other", null, 0);
        }
    }

    public static final void LIZ$8(C19LP c19lp, View view) {
        InterfaceC212166181c popCardViewCallback;
        if (view != null && (popCardViewCallback = ((C181R) c19lp.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.LIZ("other", null, 0);
        }
    }

    public static final void LIZ$9(C19LP c19lp, View view) {
        C181U c181u;
        String strLJIIIIZZ;
        if (view != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("surprise set pop card", "on click");
            UsBidViewModel bidVM = ((C181Z) c19lp.l0).getBidVM();
            if (bidVM != null && (c181u = bidVM.LLJIJIL) != null) {
                int i2 = c181u.LJI;
                List<Integer> list = ((C181Z) c19lp.l0).LLJJJ;
                if (list != null && list.contains(Integer.valueOf(i2))) {
                    final C181Z c181z = (C181Z) c19lp.l0;
                    c181z.getClass();
                    try {
                        String str = c181z.LLJJJIL;
                        if (str != null) {
                            final int i3 = (int) (c181z.getContext().getResources().getDisplayMetrics().heightPixels * 0.7f);
                            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                            Context context = c181z.getContext();
                            SparkContext sparkContext = new SparkContext();
                            sparkContext.LJJLIIJ(str);
                            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.06Ml
                                @Override // X.InterfaceC1554220qY0
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJII() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIIIZZ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIIZ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIJ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIILIIL(SparkPopup sparkPopup, View view2) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIILJJIL(SparkPopup sparkPopup) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIILL(SparkPopup sparkPopup, int i4) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIILLIIL() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIJ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final boolean LJIJI(SparkPopup sparkPopup) {
                                    return false;
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final boolean LJIJJ(SparkPopup sparkPopup) {
                                    return false;
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJI(SparkPopup sparkPopup) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJIFFI(SparkPopup sparkPopup) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJII() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                                    return false;
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJIIJ(SparkPopup sparkPopup) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJIIZ() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJJIIZI() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void onViewAttachedToWindow() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void onViewDetachedFromWindow() {
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIIZILJ(SparkPopup sparkPopup) {
                                    C181Z c181z2 = c181z;
                                    int i4 = i3;
                                    c181z2.getClass();
                                    ILiveStreamAdaptService.LIZ.getClass();
                                    C04UA.LIZ().LIZ(i4, "ttec_us_auction_surprise_set", false);
                                }

                                @Override // X.InterfaceC1554220qY0
                                public final void LJIL(SparkPopup sparkPopup) {
                                    C181Z c181z2 = c181z;
                                    int i4 = i3;
                                    c181z2.getClass();
                                    ILiveStreamAdaptService.LIZ.getClass();
                                    C04UA.LIZ().LIZ(i4, "ttec_us_auction_surprise_set", true);
                                }
                            });
                            try {
                                Pair[] pairArr = new Pair[1];
                                UsBidViewModel bidVM2 = c181z.getBidVM();
                                if (bidVM2 == null) {
                                    strLJIIIIZZ = null;
                                } else {
                                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(bidVM2.xQ2(null, null, true));
                                }
                                pairArr[0] = new Pair("track_params", strLJIIIIZZ);
                                C1547280qMo.LJFF(sparkContext, pairArr);
                            } catch (CancellationException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw e;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c1537900q7g.getClass();
                            new C1541950qED(context, sparkContext).LIZIZ();
                        }
                    } catch (CancellationException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw e2;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    UsBidViewModel bidVM3 = ((C181Z) c19lp.l0).getBidVM();
                    if (bidVM3 != null) {
                        Map<String, String> mapXQ2 = bidVM3.xQ2(null, null, true);
                        Map<String, String> mapLIZIZ = C1739720vNC.LIZIZ(new C1741520vQ6("c5876").LIZ("d03192"), PageFinder.via((View) c19lp.l0));
                        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                        mapXQ2.put("click_area", "others");
                        mapXQ2.putAll(mapLIZIZ);
                        c1507790pL7.getClass();
                        C1507790pL7.LIZJ("livesdk_tiktokec_product_click", mapXQ2);
                        mapXQ2.putAll(mapLIZIZ);
                        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_click", mapXQ2);
                    }
                    C21198117xT c21198117xT = C21198117xT.LIZ;
                    UsBidViewModel bidVM4 = ((C181Z) c19lp.l0).getBidVM();
                    c21198117xT.getClass();
                    C21198117xT.LIZ("auction_card_click_enabled", bidVM4, null);
                    return;
                }
                C21198117xT c21198117xT2 = C21198117xT.LIZ;
                UsBidViewModel bidVM5 = ((C181Z) c19lp.l0).getBidVM();
                c21198117xT2.getClass();
                C21198117xT.LIZ("auction_card_click_disabled", bidVM5, null);
                return;
            }
            C21198117xT c21198117xT3 = C21198117xT.LIZ;
            UsBidViewModel bidVM6 = ((C181Z) c19lp.l0).getBidVM();
            c21198117xT3.getClass();
            C21198117xT.LIZ("auction_card_click_disabled", bidVM6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LP(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LP(Object obj, int i, int i2, int i3) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }
}
