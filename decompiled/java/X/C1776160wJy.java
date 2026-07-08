package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselLynxAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPromotionBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776160wJy extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static C1776160wJy get$arr$(int i) {
        C1776160wJy c1776160wJy = (C1776160wJy) arr$.get(i);
        if (c1776160wJy != null) {
            return c1776160wJy;
        }
        arr$.compareAndSet(i, null, new C1776160wJy(i));
        return (C1776160wJy) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776160wJy(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C1776160wJy c1776160wJy, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        ((Boolean) obj4).booleanValue();
        ((PdpCarouselLynxAssem) obj).sp();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1776160wJy c1776160wJy, Object obj, Object obj2, Object obj3, Object obj4) {
        EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = (EcSearchNoCartFeedVideoGuideAssem) obj;
        if (obj2 != null || obj3 != null || obj4 != null) {
            ecSearchNoCartFeedVideoGuideAssem.Qp(new C1770380wAe(1, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1776160wJy c1776160wJy, Object obj, Object obj2, Object obj3, Object obj4) {
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = (EcSearchNoCartFypBottomButtonAssem) obj;
        C1770340wAa c1770340wAa = C1770340wAa.LIZ;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(ecSearchNoCartFypBottomButtonAssem)).getAweme();
        String strBp = ecSearchNoCartFypBottomButtonAssem.Bp();
        c1770340wAa.getClass();
        if (C1770340wAa.LIZ(aweme, strBp) && ecSearchNoCartFypBottomButtonAssem.LLLIIL && (obj2 != null || obj3 != null || obj4 != null)) {
            ecSearchNoCartFypBottomButtonAssem.Jp(new C1770380wAe(1, 2), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1776160wJy c1776160wJy, Object obj, Object obj2, Object obj3, Object obj4) {
        EcVideoGuideAssem ecVideoGuideAssem = (EcVideoGuideAssem) obj;
        if (obj2 != null || obj3 != null || obj4 != null) {
            C324990Cob.LIZ(new Pair(1, 2), ecVideoGuideAssem.LLLJL);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.jvm.internal.AwS427S0200000_26] */
    public static final Object invoke$4(C1776160wJy c1776160wJy, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Object obj5;
        PromotionWaistUIConfig promotionWaistUIConfig;
        Integer num;
        PromotionWaist promotionWaist;
        View childAt;
        C1762380vxk c1762380vxk;
        Integer num2;
        Integer num3;
        PdpCarouselPromotionBannerAssem pdpCarouselPromotionBannerAssem = (PdpCarouselPromotionBannerAssem) obj;
        if (!((List) obj2).isEmpty()) {
            C1762010vx9 c1762010vx9 = (C1762010vx9) C631370Opb.LIZ(pdpCarouselPromotionBannerAssem);
            PromotionWaist promotionWaist2 = c1762010vx9.LLIZ;
            int iIntValue = 0;
            if (promotionWaist2 != null && promotionWaist2.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !Intrinsics.LJFF(c1762010vx9.LLILZLL, Boolean.TRUE)) {
                C0H1U.LIZIZ(pdpCarouselPromotionBannerAssem.LLJLL);
                pdpCarouselPromotionBannerAssem.d8();
            } else {
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = pdpCarouselPromotionBannerAssem.LLJLL;
                if (viewOnAttachStateChangeListenerC20631115oD != null) {
                    if (viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
                        viewOnAttachStateChangeListenerC20631115oD.endFakeDrag();
                    }
                    C1202350hOT c1202350hOT = pdpCarouselPromotionBannerAssem.LLJLLIL;
                    if (c1202350hOT != null) {
                        pdpCarouselPromotionBannerAssem.tp().Qj(c1202350hOT);
                    }
                    C12ES.LJIILL(0, viewOnAttachStateChangeListenerC20631115oD);
                    C1202350hOT c1202350hOT2 = pdpCarouselPromotionBannerAssem.LLJLLIL;
                    if (c1202350hOT2 != null) {
                        c1202350hOT2.LLILLL = true;
                    }
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new AwS427S0200000_26(viewOnAttachStateChangeListenerC20631115oD, pdpCarouselPromotionBannerAssem, 96);
                    C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState();
                    C724270Sb3 c724270Sb3 = pdpCarouselPromotionBannerAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj5 = c724270Sb3.LL;
                    } else {
                        obj5 = null;
                    }
                    state.LJIILL(((C1762010vx9) obj5).LL, new RunnableC514801zW(c259800zU, 177));
                    C1202350hOT c1202350hOT3 = pdpCarouselPromotionBannerAssem.LLJLLIL;
                    if (c1202350hOT3 != null) {
                        pdpCarouselPromotionBannerAssem.tp().Qj(c1202350hOT3);
                        pdpCarouselPromotionBannerAssem.tp().m9(c1202350hOT3);
                    }
                }
            }
            PromotionWaist promotionWaist3 = c1762010vx9.LLIZ;
            if (promotionWaist3 == null) {
                promotionWaist3 = null;
            }
            if (!Intrinsics.LJFF(promotionWaist3, pdpCarouselPromotionBannerAssem.LLJL)) {
                pdpCarouselPromotionBannerAssem.LLJL = promotionWaist3;
                boolean z2 = promotionWaist3 instanceof PromotionWaist;
                if (z2) {
                    promotionWaist = promotionWaist3;
                } else {
                    promotionWaist = null;
                }
                FrameLayout frameLayout = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                if (frameLayout != null) {
                    childAt = frameLayout.getChildAt(0);
                } else {
                    childAt = null;
                }
                if (childAt instanceof C1762380vxk) {
                    c1762380vxk = (C1762380vxk) childAt;
                } else {
                    c1762380vxk = null;
                }
                if (promotionWaist != null && (num3 = promotionWaist.bannerType) != null && num3.intValue() == 100 && c1762380vxk != null) {
                    FrameLayout frameLayout2 = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                    if (frameLayout2 != null) {
                        C786410Ut5.LJLLLLLL(0, frameLayout2);
                    }
                    c1762380vxk.LIZ(promotionWaist, pdpCarouselPromotionBannerAssem.yp().lX().getProductId());
                    pdpCarouselPromotionBannerAssem.LLJLIL = c1762380vxk;
                    C1760970vvT c1760970vvT = pdpCarouselPromotionBannerAssem.yp().lX().LLJLLL;
                    if (c1760970vvT != null) {
                        c1762380vxk.V2(c1760970vvT.LIZIZ);
                    }
                } else {
                    FrameLayout frameLayout3 = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                    if (frameLayout3 != null) {
                        C786410Ut5.LJJJJIZL(frameLayout3);
                    }
                    if (z2 && promotionWaist3 != null && (num2 = promotionWaist3.bannerType) != null && num2.intValue() == 100) {
                        C1762380vxk c1762380vxk2 = new C1762380vxk(pdpCarouselPromotionBannerAssem.getContentView().getContext());
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1762380vxk2);
                        c1762380vxk2.setLayoutParams(layoutParams);
                        c1762380vxk2.setListener(pdpCarouselPromotionBannerAssem.LLJZ);
                        c1762380vxk2.LIZ(promotionWaist3, pdpCarouselPromotionBannerAssem.yp().lX().getProductId());
                        pdpCarouselPromotionBannerAssem.LLJLIL = c1762380vxk2;
                        C1760970vvT c1760970vvT2 = pdpCarouselPromotionBannerAssem.yp().lX().LLJLLL;
                        if (c1760970vvT2 != null) {
                            c1762380vxk2.V2(c1760970vvT2.LIZIZ);
                        }
                        FrameLayout frameLayout4 = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                        if (frameLayout4 != null) {
                            C786410Ut5.LJLLLLLL(0, frameLayout4);
                        }
                        FrameLayout frameLayout5 = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                        if (frameLayout5 != null) {
                            frameLayout5.addView(c1762380vxk2);
                        }
                    } else {
                        FrameLayout frameLayout6 = pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL;
                        if (frameLayout6 != null) {
                            C786410Ut5.LJLLLLLL(8, frameLayout6);
                        }
                    }
                }
            }
            if ((promotionWaist3 instanceof PromotionWaist) && promotionWaist3 != null && (promotionWaistUIConfig = promotionWaist3.uiConfig) != null && (num = promotionWaistUIConfig.topMargin) != null) {
                iIntValue = num.intValue();
            }
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), pdpCarouselPromotionBannerAssem.LLJLILLLLZIIL);
        }
        return Unit.LIZ;
    }
}
