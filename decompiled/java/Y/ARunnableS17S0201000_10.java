package Y;

import X.AbstractC21673719rz;
import X.C01GW;
import X.C098200Yq;
import X.C0GYM;
import X.C0PN2;
import X.C0PN8;
import X.C0PSG;
import X.C0QER;
import X.C0QVQ;
import X.C0QWQ;
import X.C1161970gLL;
import X.C128Y;
import X.C12ES;
import X.C1537410q6t;
import X.C1537720q7O;
import X.C1826520xdC;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C2341109Fh;
import X.C2399609ak;
import X.C259800zU;
import X.C643810PNb;
import X.C645130PSd;
import X.C652600Pik;
import X.C679270Qkf;
import X.C679540Ql6;
import X.C686930Qx1;
import X.C686940Qx2;
import X.C687740QyK;
import X.C687890QyZ;
import X.C687920Qyc;
import X.EnumC674310Qcf;
import X.InterfaceC1891350zJl;
import X.InterfaceC648120PbW;
import X.InterfaceC660150Puv;
import X.InterfaceC671770QWp;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceContainerFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS17S0201000_10 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Activity activity = ((C687920Qyc) this.l0).LJIIJJI.get();
        try {
            SearchLocationCacheData.LIZ.LJII(null, activity instanceof C19EG ? activity : null, this.i2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C687890QyZ c687890QyZ = (C687890QyZ) this.l1;
        C687920Qyc c687920Qyc = (C687920Qyc) this.l0;
        c687890QyZ.getClass();
        C687890QyZ.LIZJ(c687920Qyc);
    }

    public final void LIZ$1() {
        String strLIZJ;
        try {
            if (this.i2 > 0) {
                C12ES.LJIILL(0, (View) this.l0);
                ((C0GYM) ((View) this.l0)).setCount(this.i2);
            } else {
                C12ES.LJIILL(4, (View) this.l0);
            }
            SearchResultParam searchResultParam = ((MixFloatingLayerAssem) this.l1).LLJILLL;
            C0QER searchEnterParam = searchResultParam != null ? searchResultParam.getSearchEnterParam() : null;
            int i = this.i2;
            n value = ((MixFloatingLayerAssem) this.l1).No().LLJI.getValue();
            if (value == null || (strLIZJ = C2399609ak.LIZJ(value, "search_id")) == null) {
                strLIZJ = "";
            }
            C679270Qkf.LIZ(searchEnterParam, i, strLIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(e, 93);
            c2341109Fh.getClass();
            C2341109Fh.LIZLLL(awS554S0100000_10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        Unit unit;
        C259800zU c259800zU = (C259800zU) this.l0;
        Integer num = (Integer) this.l1;
        int i = this.i2;
        try {
            C686930Qx1 c686930Qx1 = (C686930Qx1) c259800zU.element;
            if (c686930Qx1 != null) {
                C686940Qx2 c686940Qx2 = new C686940Qx2(c686930Qx1);
                c686940Qx2.LIZ(num.intValue(), i);
                C686940Qx2.LIZIZ(c686940Qx2);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$3() {
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) this.l0;
        C643810PNb<SearchJediMixFeedFragment> c643810PNb = searchJediMixFeedFragment.LLLLZI;
        T t = c643810PNb.LL;
        if (t != 0) {
            ((C0PN2) t).LLJILJIL = 0;
        }
        String str = searchJediMixFeedFragment.LLJJIJI;
        if (t != 0) {
            ((C0PN2) t).LLJILLL = str;
        }
        c643810PNb.LIZJ(1, ((SearchJediMixFeedFragment) this.l0).dS(), Integer.valueOf(this.i2), 0, 0, Integer.valueOf(((SearchJediMixFeedFragment) this.l0).LLJJJJJIL), (C0PSG) this.l1, ((SearchJediMixFeedFragment) this.l0).PS());
        ((SearchJediMixFeedFragment) this.l0).GS().setIsRefreshingData(true);
        ((C645130PSd) ((SearchJediMixFeedFragment) this.l0).NS()).LLJJIJI.LIZLLL.LIZJ(4);
        ((SearchJediMixFeedFragment) this.l0).LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:4:0x000c, B:6:0x0012, B:8:0x0018, B:10:0x001e, B:12:0x0024, B:16:0x002e, B:29:0x006b, B:31:0x0073, B:32:0x0075, B:34:0x0080, B:23:0x0055, B:25:0x005d, B:26:0x0060, B:28:0x0068, B:33:0x007a), top: B:39:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            r11 = this;
            java.lang.Object r6 = r11.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            int r7 = r11.i2
            java.lang.Object r5 = r11.l1
            android.content.Context r5 = (android.content.Context) r5
            if (r6 == 0) goto L7a
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r6)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L7a
            boolean r0 = X.C662290PyN.LJ(r6)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r6.getPhotoModeImageInfo()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L29
            java.util.List r0 = r0.getImageList()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L29
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L83
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r7 < 0) goto L7a
            if (r7 >= r0) goto L7a
            X.1EE2 r3 = X.C1EE2.LIZIZ     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "general_search"
            X.0PyM r0 = X.C662280PyM.LIZ     // Catch: java.lang.Throwable -> L83
            r0.getClass()     // Catch: java.lang.Throwable -> L83
            X.01GW r0 = X.C662280PyM.LIZJ     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L83
            com.ss.android.ugc.aweme.search.abtest.SearchPhotoCoverConfig r0 = (com.ss.android.ugc.aweme.search.abtest.SearchPhotoCoverConfig) r0     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r0.preloadPriority     // Catch: java.lang.Throwable -> L83
            int r1 = r2.hashCode()     // Catch: java.lang.Throwable -> L83
            r0 = -2024701067(0xffffffff87518375, float:-1.5762044E-34)
            if (r1 == r0) goto L60
            r0 = -383989871(0xffffffffe91cc791, float:-1.1845928E25)
            if (r1 == r0) goto L55
            r0 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r1 != r0) goto L80
            goto L6b
        L55:
            java.lang.String r0 = "IMMEDIATE"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L80
            X.0kpO r8 = X.EnumC1334360kpO.IMMEDIATE     // Catch: java.lang.Throwable -> L83
            goto L75
        L60:
            java.lang.String r0 = "MEDIUM"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L80
            X.0kpO r8 = X.EnumC1334360kpO.MEDIUM     // Catch: java.lang.Throwable -> L83
            goto L75
        L6b:
            java.lang.String r0 = "HIGH"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L80
            X.0kpO r8 = X.EnumC1334360kpO.HIGH     // Catch: java.lang.Throwable -> L83
        L75:
            r9 = 0
            r10 = r9
            r3.LJJIIZ(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
        L7a:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L83
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L83
            goto L8f
        L80:
            X.0kpO r8 = X.EnumC1334360kpO.IMMEDIATE     // Catch: java.lang.Throwable -> L83
            goto L75
        L83:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L8f:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS17S0201000_10.LIZ$4():void");
    }

    public static final void run$0(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchGpsPopupCoordinator@3b75.refreshLocationAndPage$3$1$onError$$inlined$runOnMain$1");
        try {
            aRunnableS17S0201000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchGpsPopupCoordinator@3b75.refreshLocationAndPage$3$1$onError$$inlined$runOnMain$1");
    }

    public static final void run$1(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MixFloatingLayerAssem@4df5.onReceiveJsEvent$1$1");
        try {
            aRunnableS17S0201000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixFloatingLayerAssem@4df5.onReceiveJsEvent$1$1");
    }

    public static final void run$10(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SparkMultiViewsManager@2f75.commonPostHandle$1");
        try {
            Function2<? super C1537720q7O, ? super Integer, Unit> function2 = ((C679540Ql6) aRunnableS17S0201000_10.l0).LIZJ;
            if (function2 != null) {
                function2.invoke((C1537720q7O) aRunnableS17S0201000_10.l1, Integer.valueOf(aRunnableS17S0201000_10.i2));
            }
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            if (C1161970gLL.LIZIZ().LIZ) {
                ((C1537720q7O) aRunnableS17S0201000_10.l1).getClass();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkMultiViewsManager@2f75.commonPostHandle$1");
    }

    public static final void run$11(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("GeneralHorizontalGroupCardAgent@49e4.locateToTargetSubCard$1$1$1");
        try {
            ((C652600Pik) aRunnableS17S0201000_10.l0).LJIIJ(aRunnableS17S0201000_10.i2, (InterfaceC648120PbW) aRunnableS17S0201000_10.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeneralHorizontalGroupCardAgent@49e4.locateToTargetSubCard$1$1$1");
    }

    public static final void run$12(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        InterfaceC671770QWp interfaceC671770QWp;
        C1C7U.LIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$2$2$onPageExpose$1");
        try {
            EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = (EcSearchMiddlePagerContainerFragment) aRunnableS17S0201000_10.l0;
            C128Y c128yLLLILZLLLI = null;
            if (ecSearchMiddlePagerContainerFragment.LLJJJJJIL != null) {
                c128yLLLILZLLLI = C0QWQ.LLLILZLLLI(C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment), aRunnableS17S0201000_10.i2);
            }
            if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                interfaceC671770QWp.Ec((EnumC674310Qcf) aRunnableS17S0201000_10.l1, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$2$2$onPageExpose$1");
    }

    public static final void run$13(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoPreloadHelper@ba1b.preloadHighResImage$1");
        try {
            aRunnableS17S0201000_10.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoPreloadHelper@ba1b.preloadHighResImage$1");
    }

    public static final void run$14(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSkylightRerankAssem@3a3b.scrollToTargetPosition$1");
        try {
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS17S0201000_10.l0).setItemAnimator(null);
            ((LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS17S0201000_10.l0).getLayoutManager()).scrollToPositionWithOffset(aRunnableS17S0201000_10.i2, 0);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) aRunnableS17S0201000_10.l0;
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS79S0200000_10(viewOnAttachStateChangeListenerC20604515jv, (AbstractC21673719rz) aRunnableS17S0201000_10.l1, 104));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSkylightRerankAssem@3a3b.scrollToTargetPosition$1");
    }

    public static final void run$2(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("LSAsyncInflater@681e.preload$3$1");
        try {
            aRunnableS17S0201000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LSAsyncInflater@681e.preload$3$1");
    }

    public static final void run$3(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        C19EG c19eg;
        C0PN8 c0pn8 = (C0PN8) aRunnableS17S0201000_10.l0;
        Object[] objArr = (Object[]) aRunnableS17S0201000_10.l1;
        int i = aRunnableS17S0201000_10.i2;
        c0pn8.getClass();
        C1C7U.LIZ("SearchTopMixModel@4b99.loadMoreList$1L");
        try {
            String strLJIILIIL = c0pn8.LJIILIIL(objArr);
            String str = c0pn8.LLJJI;
            int iIntValue = ((Integer) objArr[5]).intValue();
            C0PSG c0psg = (C0PSG) objArr[6];
            String strLJIILLIIL = c0pn8.LJIILLIIL();
            String str2 = c0pn8.LLJJIJIIJIL;
            WeakReference<C19EG> weakReference = c0pn8.LLIZ;
            if (weakReference == null) {
                c19eg = null;
            } else {
                c19eg = weakReference.get();
            }
            c0pn8.LJJJJ(strLJIILIIL, i, 10, 0, str, iIntValue, c0psg, strLJIILLIIL, str2, c19eg, c0pn8.LJIILJJIL());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
        C1C7U.LIZIZ("SearchTopMixModel@4b99.loadMoreList$1L");
    }

    public static final void run$4(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchBottomSheetBehavior@c506.setState$2");
        try {
            ((SearchBottomSheetBehavior) aRunnableS17S0201000_10.l1).startSettlingAnimation((View) aRunnableS17S0201000_10.l0, aRunnableS17S0201000_10.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchBottomSheetBehavior@c506.setState$2");
    }

    public static final void run$5(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPlaceContainerFragment@afb2.applyInitialAnchor$1");
        try {
            SearchPlaceContainerFragment searchPlaceContainerFragment = (SearchPlaceContainerFragment) aRunnableS17S0201000_10.l0;
            C1826520xdC c1826520xdC = (C1826520xdC) aRunnableS17S0201000_10.l1;
            int i = aRunnableS17S0201000_10.i2;
            searchPlaceContainerFragment.getClass();
            SearchPlaceContainerFragment.hS(c1826520xdC, i);
            ((SearchPlaceContainerFragment) aRunnableS17S0201000_10.l0).LLJJJJLIIL = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPlaceContainerFragment@afb2.applyInitialAnchor$1");
    }

    public static final void run$6(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPlaceContainerFragment@afb2.setupTabBarSegments$2$2");
        try {
            SearchPlaceContainerFragment searchPlaceContainerFragment = (SearchPlaceContainerFragment) aRunnableS17S0201000_10.l0;
            C1826520xdC c1826520xdC = (C1826520xdC) aRunnableS17S0201000_10.l1;
            int i = aRunnableS17S0201000_10.i2;
            searchPlaceContainerFragment.getClass();
            SearchPlaceContainerFragment.hS(c1826520xdC, i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPlaceContainerFragment@afb2.setupTabBarSegments$2$2");
    }

    public static final void run$7(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSkylightLocalRerankUtils@3ac7.scrollToTarget$1");
        try {
            ((LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS17S0201000_10.l0).getLayoutManager()).scrollToPositionWithOffset(aRunnableS17S0201000_10.i2, 0);
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS17S0201000_10.l0).setItemAnimator((AbstractC21673719rz) aRunnableS17S0201000_10.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSkylightLocalRerankUtils@3ac7.scrollToTarget$1");
    }

    public static final void run$8(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.handleSearchRequestAsync$1");
        try {
            aRunnableS17S0201000_10.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.handleSearchRequestAsync$1");
    }

    public static final void run$9(ARunnableS17S0201000_10 aRunnableS17S0201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAdMixedCreativeCardAssem@c3bc.onBind$2$onItemViewAttachedToWindow$1");
        try {
            InterfaceC660150Puv interfaceC660150PuvYp = ((SearchAdMixedCreativeCardAssem) aRunnableS17S0201000_10.l0).yp(aRunnableS17S0201000_10.i2, (InterfaceC1891350zJl) aRunnableS17S0201000_10.l1);
            if (interfaceC660150PuvYp != null) {
                interfaceC660150PuvYp.onViewAttachedToWindow();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAdMixedCreativeCardAssem@c3bc.onBind$2$onItemViewAttachedToWindow$1");
    }

    public ARunnableS17S0201000_10(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS17S0201000_10(C687920Qyc c687920Qyc, C687740QyK c687740QyK, C687890QyZ c687890QyZ, int i, int i2) {
        this.$t = i2;
        this.l0 = c687920Qyc;
        this.l1 = c687890QyZ;
        this.i2 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS17S0201000_10(C259800zU c259800zU, C259800zU<C686930Qx1> c259800zU2, Integer num, int i, String str, int i2) {
        this.$t = i2;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i2 = num;
    }
}
