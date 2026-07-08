package Y;

import X.AbstractC325730Cpn;
import X.AbstractC334960DBe;
import X.C098200Yq;
import X.C0C7T;
import X.C0CJ2;
import X.C0CM8;
import X.C0CMA;
import X.C0CME;
import X.C1018320cbe;
import X.C118300cf;
import X.C12ES;
import X.C13EQ;
import X.C13LP;
import X.C13LQ;
import X.C14NF;
import X.C14NX;
import X.C1601380rm4;
import X.C1877207Ww;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C292330Bd1;
import X.C311520CJa;
import X.C311590CJh;
import X.C311600CJi;
import X.C318400Cdy;
import X.C325750Cpp;
import X.C325780Cps;
import X.C334970DBf;
import X.C339190DRl;
import X.C339330DRz;
import X.C341940Daq;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC311620CJk;
import X.EnumC311630CJl;
import X.InterfaceC342000Daw;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Message;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.control.NetControlImpl;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS37S0300000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int right;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l0;
        boolean z = (layoutParams.gravity & 8388613) == 8388613;
        ((FrameLayout.LayoutParams) this.l1).topMargin = layoutParams.topMargin;
        if (z) {
            TextView textView = ((C1018320cbe) this.l2).LLJZ;
            right = textView != null ? textView.getWidth() : 0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.l1;
            layoutParams2.gravity = 8388661;
            layoutParams2.setMarginEnd(((FrameLayout.LayoutParams) this.l0).getMarginEnd() + right + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        } else {
            TextView textView2 = ((C1018320cbe) this.l2).LLJZ;
            right = textView2 != null ? textView2.getRight() : 0;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.l1;
            layoutParams3.gravity = 8388659;
            layoutParams3.setMarginStart(right + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        TextView textView3 = ((C1018320cbe) this.l2).LLJZIJLIL;
        if (textView3 != null) {
            C786410Ut5.g6(textView3, (FrameLayout.LayoutParams) this.l1);
        }
    }

    public final void LIZ$1() {
        if (!((PollCreateFragment) this.l0).isAdded() || ((PollCreateFragment) this.l0).getView() == null || ((View) this.l1).getParent() == null || ((View) this.l2).getVisibility() != 0) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.l2).getHitRect(rect);
        rect.top = 0;
        rect.bottom = ((View) this.l1).getHeight();
        rect.right = ((View) this.l1).getWidth();
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l2));
    }

    public final void LIZ$2() throws JSONException {
        int iLIZIZ = C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(C13EQ.LJJIJLIJ((Set) this.l0), ",", null, null, 0, null, null, 62)));
        Integer num = (Integer) this.l1;
        if (num == null || iLIZIZ != num.intValue()) {
            C311520CJa.LIZ.getClass();
            C311520CJa.LIZIZ();
            C0CJ2.LJI("{}");
            C311600CJi c311600CJi = (C311600CJi) this.l2;
            if (c311600CJi != null) {
                c311600CJi.LJ(1);
                c311600CJi.LJI(EnumC311620CJk.HASH_CHECK_FAILED);
                c311600CJi.LIZJ();
            }
        }
    }

    public final void LIZ$3() throws JSONException {
        int iLIZIZ = C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(C13EQ.LJJIJLIJ((Set) this.l0), ",", null, null, 0, null, null, 62)));
        Integer num = (Integer) this.l1;
        if (num == null || iLIZIZ != num.intValue()) {
            C311520CJa.LIZ.getClass();
            C311520CJa.LIZIZ();
            C0CJ2.LJI("{}");
            C311600CJi c311600CJi = (C311600CJi) this.l2;
            if (c311600CJi != null) {
                c311600CJi.LJ(1);
                c311600CJi.LJI(EnumC311620CJk.HASH_CHECK_FAILED);
                c311600CJi.LIZJ();
            }
        }
    }

    public final void LIZ$4() {
        Object c098200Yq;
        try {
            Iterator it2 = ((Iterable) ((Function1) this.l0).invoke((Aweme) this.l1)).iterator();
            while (it2.hasNext()) {
                C325750Cpp.LIZ((AbstractC325730Cpn) it2.next(), (C325780Cps) this.l2);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public final void LIZ$5() throws JSONException {
        int iLIZIZ = C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(C13EQ.LJJIJLIJ((Set) this.l0), ",", null, null, 0, null, null, 62)));
        Integer num = (Integer) this.l1;
        if (num == null || iLIZIZ != num.intValue()) {
            C311520CJa.LIZ.getClass();
            C311520CJa.LIZIZ();
            C0CJ2.LJI("{}");
            C311600CJi c311600CJi = (C311600CJi) this.l2;
            if (c311600CJi != null) {
                c311600CJi.LJ(1);
                c311600CJi.LJI(EnumC311620CJk.HASH_CHECK_FAILED);
                c311600CJi.LIZJ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS37S0300000_4.LIZ$6():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$7() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            X.0DEX r0 = (X.C0DEX) r0
            android.widget.TextView r0 = r0.LIZJ
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.Object r0 = r5.l0
            X.0DEX r0 = (X.C0DEX) r0
            java.lang.String r1 = r0.LJI
            java.lang.Object r0 = r5.l1
            X.0D3c r0 = (X.C332860D3c) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.l0
            X.0DEX r0 = (X.C0DEX) r0
            java.lang.Boolean r1 = r0.LJII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L65
            java.lang.Object r0 = r5.l0
            X.0DEX r0 = (X.C0DEX) r0
            android.widget.TextView r0 = r0.LIZJ
            android.text.Layout r2 = r0.getLayout()
            if (r2 == 0) goto L68
            int r0 = r2.getLineCount()
            if (r0 <= 0) goto L68
            int r0 = r2.getLineCount()
            r1 = 1
            int r0 = r0 - r1
            int r0 = r2.getEllipsisCount(r0)
            if (r0 <= 0) goto L68
        L4b:
            java.lang.Object r0 = r5.l0
            X.0DEX r0 = (X.C0DEX) r0
            android.widget.TextView r4 = r0.LIZJ
            if (r1 == 0) goto L66
            Y.ACListenerS108S0200000_4 r3 = new Y.ACListenerS108S0200000_4
            java.lang.Object r2 = r5.l2
            X.0DEW r2 = (X.C0DEW) r2
            java.lang.Object r1 = r5.l1
            X.0D3c r1 = (X.C332860D3c) r1
            r0 = 23
            r3.<init>(r1, r2, r0)
        L62:
            X.C786410Ut5.T7(r4, r3)
        L65:
            return
        L66:
            r3 = 0
            goto L62
        L68:
            r1 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS37S0300000_4.LIZ$7():void");
    }

    public final void LIZ$8() {
        InterfaceC342000Daw interfaceC342000Daw;
        View view = (View) ((WeakReference) this.l0).get();
        if (view == null || (interfaceC342000Daw = (InterfaceC342000Daw) ((Function0) this.l1).invoke()) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS73S0200000_4((Function1) this.l2, interfaceC342000Daw, 55));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content.markdown performance = ");
        C1877207Ww c1877207WwLJI = interfaceC342000Daw.LJI();
        sbLIZ.append(c1877207WwLJI != null ? c1877207WwLJI.toString() : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void run$0(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AnolePlayerComponent@d1a9.ensureLabels$3");
        try {
            aRunnableS37S0300000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnolePlayerComponent@d1a9.ensureLabels$3");
    }

    public static final void run$1(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PollCreateFragment@b279.expandDeleteTouchArea$1");
        try {
            aRunnableS37S0300000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollCreateFragment@b279.expandDeleteTouchArea$1");
    }

    public static final void run$10(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonTask@c5b4.run$result$5$runnable$1$1$9");
        try {
            aRunnableS37S0300000_4.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.run$result$5$runnable$1$1$9");
    }

    public static final void run$11(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("StoryPreloaderV2Impl@f0d7.preloadResources$lambda$5$$inlined$runIsolatedOnIo$1");
        try {
            aRunnableS37S0300000_4.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryPreloaderV2Impl@f0d7.preloadResources$lambda$5$$inlined$runIsolatedOnIo$1");
    }

    public static final void run$12(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ABSettingsImpl@5aa8.handleFetchResult$7");
        try {
            aRunnableS37S0300000_4.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ABSettingsImpl@5aa8.handleFetchResult$7");
    }

    public static final void run$13(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        View view;
        int width;
        C1C7U.LIZ("PoiVerifiedDisplayHelper@858d.apply$$inlined$doOnPreDraw$1");
        try {
            if (((TextView) aRunnableS37S0300000_4.l1).getVisibility() == 0) {
                Object parent = ((TextView) aRunnableS37S0300000_4.l1).getParent();
                if ((parent instanceof View) && (view = (View) parent) != null && (width = view.getWidth() - view.getPaddingRight()) > 0 && ((TextView) aRunnableS37S0300000_4.l1).getRight() > width) {
                    C339190DRl.LIZIZ((TextView) aRunnableS37S0300000_4.l1);
                    View view2 = (View) aRunnableS37S0300000_4.l2;
                    if (view2 != null) {
                        C339190DRl.LIZIZ(view2);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiVerifiedDisplayHelper@858d.apply$$inlined$doOnPreDraw$1");
    }

    public static final void run$14(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("VideoLoadMoreAction@5255.processEvent$1$1$onLoadMore$1$3");
        try {
            ((C14NX) aRunnableS37S0300000_4.l0).LJIILJJIL((Map) aRunnableS37S0300000_4.l1, (C14NF) aRunnableS37S0300000_4.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoLoadMoreAction@5255.processEvent$1$1$onLoadMore$1$3");
    }

    public static final void run$15(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ExtensionsKt@820.triggerAll$1");
        try {
            Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> function2 = C0CMA.LIZIZ;
            if (function2 != null) {
                function2.invoke((CopyOnWriteArrayList) aRunnableS37S0300000_4.l0, (C0CME) aRunnableS37S0300000_4.l1);
            }
            Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> function22 = C0CMA.LIZ;
            if (function22 != null) {
                function22.invoke((CopyOnWriteArrayList) aRunnableS37S0300000_4.l2, (C0CME) aRunnableS37S0300000_4.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExtensionsKt@820.triggerAll$1");
    }

    public static final void run$16(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("StoryHighlightsFirstConsumePopupTask@65e4.magicSetPanelBackground$1");
        try {
            aRunnableS37S0300000_4.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryHighlightsFirstConsumePopupTask@65e4.magicSetPanelBackground$1");
    }

    public static final void run$17(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PdpDealsRender@25e7.applyDealStateImmediately$2");
        try {
            aRunnableS37S0300000_4.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpDealsRender@25e7.applyDealStateImmediately$2");
    }

    public static final void run$18(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.transitionAnimation$1$1$onAnimationEnd$1");
        try {
            ViewGroup viewGroup = (ViewGroup) aRunnableS37S0300000_4.l0;
            ImageView imageView = (ImageView) aRunnableS37S0300000_4.l1;
            Bitmap bitmap = (Bitmap) aRunnableS37S0300000_4.l2;
            try {
                if (viewGroup.isAttachedToWindow()) {
                    C786410Ut5.LJJJLZIJ(imageView, viewGroup);
                    C786410Ut5.LJJJJ(bitmap);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewGuestLayoutZoomSurfaceWidget@44fd.transitionAnimation$1$1$onAnimationEnd$1");
    }

    public static final void run$19(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        C1601380rm4 c1601380rm4 = (C1601380rm4) aRunnableS37S0300000_4.l0;
        Message message = (Message) aRunnableS37S0300000_4.l1;
        Message message2 = (Message) aRunnableS37S0300000_4.l2;
        c1601380rm4.getClass();
        C1C7U.LIZ("FeedFetchModel@3835.sendFeedCacheMsg$2L");
        if (message.getData().getBoolean("key_cache_success_completed", false)) {
            C1C7U.LIZIZ("FeedFetchModel@3835.sendFeedCacheMsg$2L");
            return;
        }
        message.getData().putBoolean("key_cache_success_completed", true);
        c1601380rm4.mHandler.handleMessage(message);
        if (C292330Bd1.LIZ && message2 != null) {
            message2.obj = null;
        }
        C1C7U.LIZIZ("FeedFetchModel@3835.sendFeedCacheMsg$2L");
    }

    public static final void run$2(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CheckoutFragment@f43c.onPaymentContainerAvailable$2");
        try {
            if (((FrameLayout) aRunnableS37S0300000_4.l0).getParent() != null && ((CheckoutFragment) aRunnableS37S0300000_4.l1).isAdded()) {
                ((CheckoutFragment) aRunnableS37S0300000_4.l1).MR().xQ2(((C334970DBf) ((AbstractC334960DBe) aRunnableS37S0300000_4.l2)).LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckoutFragment@f43c.onPaymentContainerAvailable$2");
    }

    public static final void run$20(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        C1601380rm4 c1601380rm4 = (C1601380rm4) aRunnableS37S0300000_4.l0;
        Message message = (Message) aRunnableS37S0300000_4.l1;
        Message message2 = (Message) aRunnableS37S0300000_4.l2;
        c1601380rm4.getClass();
        C1C7U.LIZ("FeedFetchModel@3835.sendFeedCacheMsg$3L");
        c1601380rm4.mHandler.handleMessage(message);
        if (C292330Bd1.LIZ && message2 != null) {
            message2.obj = null;
        }
        C1C7U.LIZIZ("FeedFetchModel@3835.sendFeedCacheMsg$3L");
    }

    public static final void run$21(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MarkdownTextViewExt@7986.setContent$1");
        try {
            aRunnableS37S0300000_4.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarkdownTextViewExt@7986.setContent$1");
    }

    public static final void run$22(ARunnableS37S0300000_4 aRunnableS37S0300000_4) throws JSONException {
        Integer numValueOf;
        n nVar = (n) aRunnableS37S0300000_4.l0;
        C0C7T c0c7t = (C0C7T) aRunnableS37S0300000_4.l1;
        C311590CJh c311590CJh = (C311590CJh) aRunnableS37S0300000_4.l2;
        C1C7U.LIZ("ConfigurationFetchManager@5001.storeValue$1L");
        Integer numValueOf2 = null;
        if (nVar != null) {
            try {
                q qVarLJJIJIIJI = nVar.LJJIJIIJI("group_num");
                if (qVarLJJIJIIJI != null) {
                    numValueOf2 = Integer.valueOf(qVarLJJIJIIJI.LJIIJJI());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0c7t.LJ.LIZ();
                if (c311590CJh != null) {
                    c311590CJh.LIZJ(1);
                    c311590CJh.LJ(EnumC311630CJl.HASH_CHECK_FAILED);
                    c311590CJh.LIZLLL(e.toString());
                    c311590CJh.LIZIZ();
                }
            }
        }
        q qVarLJJIJIIJI2 = nVar.LJJIJIIJI("key_set_hash");
        if (qVarLJJIJIIJI2 != null && (numValueOf = Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI())) != null && numValueOf2 != null && numValueOf2.intValue() != 0) {
            TreeSet treeSet = new TreeSet();
            C13LQ.LJJLIIIJL(treeSet, new String[0]);
            int iIntValue = numValueOf2.intValue();
            for (int i = 0; i < iIntValue; i++) {
                Set<String> setLIZJ = c0c7t.LJ.LIZJ(i);
                if (setLIZJ != null) {
                    treeSet.addAll(setLIZJ);
                }
            }
            Set<String> setLIZJ2 = c0c7t.LJ.LIZJ(Integer.MAX_VALUE);
            if (setLIZJ2 != null) {
                treeSet.addAll(setLIZJ2);
            }
            if (C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(treeSet, ",", null, null, 0, null, null, 62))) != numValueOf.intValue()) {
                c0c7t.LJ.LIZ();
                if (c311590CJh != null) {
                    c311590CJh.LIZJ(1);
                    c311590CJh.LJ(EnumC311630CJl.HASH_CHECK_FAILED);
                    c311590CJh.LIZIZ();
                }
            }
        }
        C1C7U.LIZIZ("ConfigurationFetchManager@5001.storeValue$1L");
    }

    public static final void run$3(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        CheckoutViewModel checkoutViewModel;
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.onPaymentContainerAvailable$2");
        try {
            if (((FrameLayout) aRunnableS37S0300000_4.l0).getParent() != null && ((OnestepCheckoutFragment) aRunnableS37S0300000_4.l1).isAdded() && (checkoutViewModel = ((OnestepCheckoutFragment) aRunnableS37S0300000_4.l1).LLILLL) != null) {
                checkoutViewModel.xQ2(((C334970DBf) ((AbstractC334960DBe) aRunnableS37S0300000_4.l2)).LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.onPaymentContainerAvailable$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$4(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("NetControlImpl@cec9.exitScene$2");
        try {
            NetControlImpl netControlImpl = (NetControlImpl) aRunnableS37S0300000_4.l0;
            NetDispatchConfig netDispatchConfig = (NetDispatchConfig) aRunnableS37S0300000_4.l1;
            DispatchConfig dispatchConfig = (DispatchConfig) ((C259800zU) aRunnableS37S0300000_4.l2).element;
            netControlImpl.getClass();
            NetControlImpl.LJI(netDispatchConfig, dispatchConfig);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetControlImpl@cec9.exitScene$2");
    }

    public static final void run$5(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ShootButtonBottomComponent@1d41.handleShootText$1");
        try {
            int width = ((ViewGroup) aRunnableS37S0300000_4.l0).getWidth();
            int iLIZ = C341940Daq.LIZ(150.0d);
            if (width > iLIZ) {
                int width2 = width - ((TextView) aRunnableS37S0300000_4.l1).getWidth();
                ShootButtonBottomComponent shootButtonBottomComponent = (ShootButtonBottomComponent) aRunnableS37S0300000_4.l2;
                TextView textView = (TextView) aRunnableS37S0300000_4.l1;
                shootButtonBottomComponent.getClass();
                textView.setTextSize(1, 13);
                if (((int) textView.getPaint().measureText(textView.getText().toString())) + width2 > iLIZ) {
                    ShootButtonBottomComponent shootButtonBottomComponent2 = (ShootButtonBottomComponent) aRunnableS37S0300000_4.l2;
                    TextView textView2 = (TextView) aRunnableS37S0300000_4.l1;
                    shootButtonBottomComponent2.getClass();
                    textView2.setTextSize(1, 12);
                    if (((int) textView2.getPaint().measureText(textView2.getText().toString())) + width2 > iLIZ) {
                        ((TextView) aRunnableS37S0300000_4.l1).setMaxWidth(iLIZ - width2);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShootButtonBottomComponent@1d41.handleShootText$1");
    }

    public static final void run$6(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        int width;
        ShootFeedPanel shootFeedPanel = (ShootFeedPanel) aRunnableS37S0300000_4.l0;
        ViewGroup viewGroup = (ViewGroup) aRunnableS37S0300000_4.l1;
        TextView textView = (TextView) aRunnableS37S0300000_4.l2;
        shootFeedPanel.getClass();
        C1C7U.LIZ("ShootFeedPanel@c5f8.handleShootText$1L");
        int width2 = viewGroup.getWidth();
        int iLIZ = C341940Daq.LIZ(150.0d);
        if (width2 > iLIZ && (width = width2 - textView.getWidth()) < iLIZ) {
            textView.setTextSize(1, 13);
            if (((int) textView.getPaint().measureText(textView.getText().toString())) + width > iLIZ) {
                textView.setTextSize(1, 12);
                if (((int) textView.getPaint().measureText(textView.getText().toString())) + width > iLIZ) {
                    textView.setMaxWidth(iLIZ - width);
                }
            }
        }
        C1C7U.LIZIZ("ShootFeedPanel@c5f8.handleShootText$1L");
    }

    public static final void run$7(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MixVideosViewModel@67cc.doRefresh$1");
        try {
            ((MixVideosViewModel) aRunnableS37S0300000_4.l0).FQ2((MixVideosResponse) aRunnableS37S0300000_4.l1, ((C118300cf) aRunnableS37S0300000_4.l2).element, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doRefresh$1");
    }

    public static final void run$8(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MixVideosDialog@fefc.initView$9$1$1");
        try {
            RecyclerView.LayoutManager layoutManager = (RecyclerView.LayoutManager) aRunnableS37S0300000_4.l1;
            MixVideosDialog mixVideosDialog = (MixVideosDialog) aRunnableS37S0300000_4.l2;
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(mixVideosDialog.LLJLLIL, (int) (((double) C12ES.LIZJ(101.0f, mixVideosDialog.getContext())) * 1.5d));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixVideosDialog@fefc.initView$9$1$1");
    }

    public static final void run$9(ARunnableS37S0300000_4 aRunnableS37S0300000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonRequest@87b9.request$result$5$runnable$1$1$9");
        try {
            aRunnableS37S0300000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonRequest@87b9.request$result$5$runnable$1$1$9");
    }

    public ARunnableS37S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ARunnableS37S0300000_4(C339330DRz c339330DRz, ViewGroup viewGroup, ImageView imageView, Bitmap bitmap, int i) {
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = imageView;
        this.l2 = bitmap;
    }

    public ARunnableS37S0300000_4(String str, Function1 function1, Aweme aweme, C325780Cps c325780Cps, int i) {
        this.$t = i;
        this.l0 = function1;
        this.l1 = aweme;
        this.l2 = c325780Cps;
    }
}
