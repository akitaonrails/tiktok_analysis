package X;

import Y.ARunnableS18S0210000_17;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760810vvD extends AbstractC1743840vTq implements GenericLifecycleObserver {
    public Activity LL;
    public FrameLayout LLILLJJLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public SparkContext LLILZ;
    public InterfaceC1541990qEH LLILZIL;
    public BottomSheetDialogFragment LLILZLL;
    public boolean LLIZ;
    public final AtomicBoolean LLIZLLLIL;
    public final AtomicBoolean LLJ;
    public final int LLJI;
    public EnumC1549900qR2 LLJIJIL;
    public long LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // X.AbstractC1743840vTq
    public final void LIZIZ(Activity activity, Bundle bundle) {
    }

    @Override // X.AbstractC1743840vTq
    public final void LIZJ(Activity activity, Bundle bundle) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.AbstractC1743840vTq
    public final boolean LIZ() {
        SparkContext sparkContext = this.LLILZ;
        if (sparkContext == null || !this.LLJILLL) {
            return false;
        }
        int status = this.LLJIJIL.getStatus();
        String str = this.LLJILJILJ;
        Map mapLIZ = C1523090pjn.LIZ(sparkContext);
        mapLIZ.put("load_status", Integer.valueOf(status));
        mapLIZ.put("is_offline", str);
        C1018703yb.LIZIZ("rd_spark_user_back", mapLIZ);
        return false;
    }

    public final Activity getActivity() {
        Activity activity = this.LL;
        if (activity != null) {
            return activity;
        }
        return null;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        }
        return null;
    }

    public final FrameLayout getSparkViewContainer() {
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LLILLL != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(getSparkView());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC1541990qEH kitView;
        this.LLIZLLLIL.getAndSet(false);
        if (this.LLILLL == null || !this.LLJ.compareAndSet(true, true) || (kitView = getSparkView().getKitView()) == null) {
            return;
        }
        kitView.onHide();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC1541990qEH kitView;
        this.LLIZLLLIL.getAndSet(true);
        if (this.LLILLL == null || !this.LLJ.compareAndSet(true, true) || (kitView = getSparkView().getKitView()) == null) {
            return;
        }
        kitView.onShow();
    }

    public final boolean getDraggable() {
        return this.LLJJ;
    }

    public C1760810vvD(Context context) {
        super(context);
        this.LLIZLLLIL = new AtomicBoolean(false);
        this.LLJ = new AtomicBoolean(false);
        this.LLJI = C497820Jfg.LIZJ(context);
        this.LLJIJIL = EnumC1549900qR2.LOAD_INIT;
        this.LLJILJILJ = CardStruct.IStatusCode.DEFAULT;
        this.LLJJ = true;
    }

    @Override // X.AbstractC1743840vTq
    public final void LIZLLL(BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.LLILZLL = bottomSheetDialogFragment;
    }

    public final void setActivity(Activity activity) {
        this.LL = activity;
    }

    public final void setDraggable(boolean z) {
        this.LLJJ = z;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public final void setSparkViewContainer(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void LJ(final C19EG c19eg, Uri uri, boolean z, Lifecycle lifecycle) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        String str;
        boolean z2;
        String name;
        setActivity(c19eg);
        this.LLJILJIL = System.currentTimeMillis();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        } else {
            c19eg.getLifecycle().addObserver(this);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (z) {
            marginLayoutParams.topMargin = this.LLJI;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        C786410Ut5.Td(c19eg.getLayoutInflater(), R.layout.bpt, this, true);
        setSparkViewContainer((FrameLayout) findViewById(R.id.vsu));
        final C1749280vcc c1749280vcc = (C1749280vcc) findViewById(R.id.hc6);
        AbstractC1542100qES abstractC1542100qES = new AbstractC1542100qES() { // from class: X.0vvE
            /* JADX WARN: Type inference failed for: r2v1, types: [X.0vvH] */
            @Override // X.AbstractC1537870q7d
            public final void LJLILLLLZI() {
                final C1760810vvD c1760810vvD = this.LL;
                EnumC1549900qR2 enumC1549900qR2 = EnumC1549900qR2.LOAD_INIT;
                c1760810vvD.LLJIJIL = enumC1549900qR2;
                final BottomSheetDialogFragment bottomSheetDialogFragment = c1760810vvD.LLILZLL;
                if (bottomSheetDialogFragment != null) {
                    View view = bottomSheetDialogFragment.getView();
                    Object parent = view != null ? view.getParent() : null;
                    View view2 = parent instanceof View ? (View) parent : null;
                    final C118300cf c118300cf = new C118300cf();
                    final ?? r2 = new InterfaceC1760870vvJ() { // from class: X.0vvH
                        @Override // X.InterfaceC1760870vvJ
                        public final void a3(int i) {
                            c118300cf.element = i;
                        }
                    };
                    InterfaceC1541990qEH kitView = c1760810vvD.getSparkView().getKitView();
                    if ((kitView != null ? kitView.e1() : null) instanceof WebView) {
                        InterfaceC1541990qEH kitView2 = c1760810vvD.getSparkView().getKitView();
                        c1760810vvD.LLILZIL = kitView2;
                        if (kitView2 instanceof WebKitView) {
                            ((WebKitView) kitView2).setWebScrollListener(new InterfaceC1038890d8p() { // from class: X.0vvG
                                @Override // X.InterfaceC1038890d8p
                                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                                    r2.a3(i2);
                                }
                            });
                            if (view2 != null) {
                                final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2);
                                bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0vvF
                                    @Override // X.AbstractC1177930gl5
                                    public final void LIZJ(View view3, float f) {
                                    }

                                    @Override // X.AbstractC1177930gl5
                                    public final void LIZLLL(int i, View view3) {
                                        View view4;
                                        if (i != 1) {
                                            if (i == 5) {
                                                bottomSheetDialogFragment.dismiss();
                                            }
                                        } else {
                                            if (c1760810vvD.getDraggable() && c118300cf.element <= 0) {
                                                Object obj = c1760810vvD.LLILZIL;
                                                if (!(obj instanceof View) || (view4 = (View) obj) == null) {
                                                    return;
                                                }
                                                view4.scrollBy(0, 1);
                                                return;
                                            }
                                            bottomSheetBehaviorFrom.setState(3);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                C1760810vvD c1760810vvD2 = this.LL;
                SparkContext sparkContext = c1760810vvD2.LLILZ;
                if (sparkContext == null || !c1760810vvD2.LLJILLL) {
                    return;
                }
                C1523090pjn.LIZJ(sparkContext, enumC1549900qR2.getStatus(), 0, null, c1760810vvD2.LLJILJIL, 124);
            }

            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                this.LL.LLJ.getAndSet(false);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                C1760810vvD c1760810vvD = this.LL;
                EnumC1549900qR2 enumC1549900qR2 = EnumC1549900qR2.LOAD_FINISH;
                c1760810vvD.LLJIJIL = enumC1549900qR2;
                c1760810vvD.LLIZ = false;
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
                C1760810vvD c1760810vvD2 = this.LL;
                SparkContext sparkContext = c1760810vvD2.LLILZ;
                if (sparkContext != null && c1760810vvD2.LLJILLL) {
                    C1523090pjn.LIZJ(sparkContext, enumC1549900qR2.getStatus(), 0, null, c1760810vvD2.LLJILJIL, 124);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                this.LL.LLJ.getAndSet(true);
                if (this.LL.LLIZLLLIL.get()) {
                    this.LL.onResume();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                C1760810vvD c1760810vvD = this.LL;
                c1760810vvD.LLIZ = true;
                EnumC1549900qR2 enumC1549900qR2 = EnumC1549900qR2.LOAD_START;
                c1760810vvD.LLJIJIL = enumC1549900qR2;
                SparkContext sparkContext = c1760810vvD.LLILZ;
                if (sparkContext != null && c1760810vvD.LLJILLL) {
                    C1523090pjn.LIZJ(sparkContext, enumC1549900qR2.getStatus(), 0, null, c1760810vvD.LLJILJIL, 124);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                int iIntValue;
                C1760810vvD c1760810vvD = this.LL;
                SparkContext sparkContext = c1760810vvD.LLILZ;
                if (sparkContext != null && c1760810vvD.LLJILLL) {
                    int status = c1760810vvD.LLJIJIL.getStatus();
                    Integer num = c1542120qEU.LIZ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str3 = c1542120qEU.LIZIZ;
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    C1523090pjn.LIZJ(sparkContext, status, iIntValue, str3, 0L, 132);
                }
                this.LL.LLIZ = false;
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        C1749280vcc c1749280vcc2 = c1749280vcc;
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LJFF(c1722300uv6, new AwS570S0100000_26(this.LL, 648));
                        c1749280vcc2.setStatus(c1722300uv6);
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131848087);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1749280vcc c1749280vcc3 = c1749280vcc;
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv62, new AwS570S0100000_26(this.LL, 649));
                c1749280vcc3.setStatus(c1722300uv62);
            }
        };
        Uri uriLIZ = C1943307jL.LIZ(uri, "aweme");
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        this.LLILZ = sparkContext;
        sparkContext.LJJLIIJ(uriLIZ.toString());
        sparkContext.LJJJJLL(abstractC1542100qES);
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(c19eg, sparkContext).LIZ(false);
        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(-1, -1));
        setSparkView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        getSparkViewContainer().addView(getSparkView());
        getSparkView().LJIIIIZZ();
        HandlerHook.viewPost(getSparkView(), new ARunnableS18S0210000_17(this, uri, z, 1));
        SparkContext sparkContext2 = this.LLILZ;
        if (sparkContext2 != null && Intrinsics.LJFF(AnonymousClass0188.LIZ(sparkContext2.LJIJI()), "fe_teu_lynx_order_center")) {
            this.LLJILLL = true;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        if (((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).isGeckoBundleExists("fe_teu_lynx_order_center")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLJILJILJ = str;
        SparkContext sparkContext3 = this.LLILZ;
        if (sparkContext3 != null) {
            sparkContext3.LJJLIIIJ(str, "offline");
        }
    }
}
