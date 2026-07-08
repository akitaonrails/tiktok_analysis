package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.network.NetworkConnectivityUtil$createLifeCycleObserver$1;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F65, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F65 extends AbstractC1664490tPr<C378600Ess, C378560Eso> {
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public View LLJJJJJIL;
    public C0I7D LLJJJJLIIL;
    public View LLJJL;
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public InputMethodManager LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final C0F68 LLLFF;
    public Integer LLLFFI;
    public KeyListener LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;

    public final void LLLLLJLJLL() {
        View currentFocus;
        InputMethodManager inputMethodManager;
        if (this.LLLF) {
            return;
        }
        this.LLLF = true;
        Activity activity = this.mActivity;
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null && this.LLL && (inputMethodManager = this.LLJZIJLIL) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        LLLLIL().LIZ.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0F68] */
    public C0F65() {
        setTheme(R.style.y0);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 297));
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 298));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 299));
        this.LLJLLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(102));
        this.LLLFF = new InputFilter() { // from class: X.0F68
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return "";
            }
        };
        this.LLLI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(101));
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    public final void LLLLLJIL(String str) {
        if (str.length() > 2000) {
            ((TextView) this.LLJLILLLLZIIL.getValue()).setText(String.valueOf(str.length()));
            ((TextView) this.LLJLL.getValue()).setText("/2000");
            if (((View) this.LLJLLIL.getValue()).getVisibility() == 8) {
                C383990F3t c383990F3t = C383990F3t.LIZ;
                Activity activityRequireActivity = requireActivity();
                C377760ErW c377760ErW = new C377760ErW(-5, null, 2000, null, null, 21);
                c383990F3t.getClass();
                C383990F3t.LJ(activityRequireActivity, c377760ErW);
            }
            C786410Ut5.LJZL(0, (LinearLayout) this.LLJLLIL.getValue());
            return;
        }
        C786410Ut5.LJZL(8, (LinearLayout) this.LLJLLIL.getValue());
    }

    public final void LLLLLL(String str) {
        this.LLJZ = true;
        C0I7D c0i7d = this.LLJJJJLIIL;
        if (c0i7d != null) {
            c0i7d.setText(str);
        }
        C0I7D c0i7d2 = this.LLJJJJLIIL;
        if (c0i7d2 != null) {
            c0i7d2.setSelection(str.length());
        }
        if (str.length() > 2000) {
            C786410Ut5.LJZL(0, (LinearLayout) this.LLJLLIL.getValue());
        }
        LLLLLJIL(str);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Object objH2;
        Object objH22;
        ConnectivityManager connectivityManager;
        final Context context;
        Integer numValueOf;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        super.onActivityCreated(bundle);
        InputMethodManager inputMethodManager = null;
        if (this.LLLFFI == null) {
            Activity activity = this.mActivity;
            if (activity != null && (window2 = activity.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
                numValueOf = Integer.valueOf(attributes.softInputMode);
            } else {
                numValueOf = null;
            }
            this.LLLFFI = numValueOf;
            Activity activity2 = this.mActivity;
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
        }
        final View view = this.mView;
        if (view != null && (context = view.getContext()) != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0F69
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            view.getLayoutParams().height = C390810FTz.LIZIZ(context).y;
            this.LLJJJIL = findViewById(R.id.ha8);
            this.LLJLIL = findViewById(R.id.ha7);
            this.LLJJJJ = (TuxIconView) findViewById(R.id.ha9);
            this.LLJJJJJIL = findViewById(R.id.h9j);
            this.LLJJJJLIIL = (C0I7D) findViewById(R.id.ha_);
            this.LLJJL = findViewById(R.id.h9n);
            this.LLJJLIIIJLLLLLLLZ = (RecyclerView) findViewById(R.id.haa);
            this.LLJL = findViewById(R.id.hab);
            View view2 = this.LLJJL;
            if (view2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                view2.setBackground(c384050F3z.LIZ(context));
            }
            RecyclerView recyclerView = this.LLJJLIIIJLLLLLLLZ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                recyclerView.setAdapter((AbstractC21673619ry) this.LLJLLL.getValue());
                recyclerView.addItemDecoration((C0DXR) this.LLLI.getValue());
                ((C0F1G) this.LLJLLL.getValue()).LLILLL = new AwS371S0200000_5(this, context, 53);
            }
            C0I7D c0i7d = this.LLJJJJLIIL;
            if (c0i7d != null) {
                c0i7d.setImeOptions(6);
                c0i7d.setRawInputType(1);
                c0i7d.addTextChangedListener(new C0FX5(this, 2));
            }
            View view3 = this.LLJJJIL;
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 27), view3);
            }
            View view4 = this.LLJJJJJIL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 28), view4);
            }
            C0I7D c0i7d2 = this.LLJJJJLIIL;
            if (c0i7d2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                c0i7d2.setBackground(c384050F3z2.LIZ(context));
            }
            View view5 = this.LLJJL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            View view6 = this.LLJL;
            if (view6 != null) {
                view6.setOnTouchListener(new View.OnTouchListener() { // from class: X.0F6A
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view7, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
            C14K9.LJIJJ(view, new C0F76(new C0F77() { // from class: X.0F66
                @Override // X.C0F77
                public final void El(int i, boolean z) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    ViewPropertyAnimator viewPropertyAnimatorAlpha;
                    ViewPropertyAnimator duration;
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
                    int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
                    C0F65 c0f65 = this;
                    int translationY = 0;
                    if (c0f65.LLL == z) {
                        View view7 = c0f65.LLJJL;
                        if (view7 != null) {
                            C786410Ut5.ed(view7, -(i + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight));
                        }
                        C0F65 c0f652 = this;
                        View view8 = c0f652.LLJLIL;
                        if (view8 != null) {
                            ViewGroup.LayoutParams layoutParams = view8.getLayoutParams();
                            if (layoutParams != null) {
                                View view9 = c0f652.LLJJL;
                                if (view9 != null) {
                                    translationY = (int) view9.getTranslationY();
                                }
                                layoutParams.height = Math.abs(translationY);
                            }
                            view8.requestLayout();
                            return;
                        }
                        return;
                    }
                    c0f65.LLL = z;
                    View view10 = c0f65.LLJJL;
                    if (view10 != null) {
                        C786410Ut5.ed(view10, -(i + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight));
                    }
                    if (z) {
                        View view11 = this.LLJJL;
                        if (view11 != null) {
                            C786410Ut5.LJLLLLLL(0, view11);
                        }
                        View view12 = this.LLJJL;
                        if (view12 != null) {
                            C786410Ut5.T4(view12, 0.0f);
                        }
                        View view13 = this.LLJJL;
                        if (view13 != null && (viewPropertyAnimatorAnimate = view13.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(250L)) != null && (viewPropertyAnimatorWithEndAction = duration.withEndAction(new ARunnableS74S0200000_5(view, this, 19))) != null) {
                            viewPropertyAnimatorWithEndAction.start();
                            return;
                        }
                        return;
                    }
                    this.LLLLLJLJLL();
                }
            }));
            getSceneContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                View view7 = this.LLJJJIL;
                if (view7 != null) {
                    C786410Ut5.T4(view7, 0.4f);
                }
            } else {
                View view8 = this.LLJJJIL;
                if (view8 != null) {
                    C786410Ut5.T4(view8, 1.0f);
                }
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Esz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C378600Ess) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 301));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Esv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C378600Ess) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 302));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Esw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C378600Ess) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 303));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Et0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C378600Ess) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 306));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Est
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C378600Ess) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 299));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Esu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C378600Ess) obj).LIZJ;
            }
        }, new AwS584S0100000_5(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            objH2 = C786410Ut5.H2(sceneContext, "connectivity");
        } else {
            objH2 = null;
        }
        if ((objH2 instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) objH2) != null) {
            getLifecycle().addObserver(new NetworkConnectivityUtil$createLifeCycleObserver$1(connectivityManager, new InterfaceC565580MGe() { // from class: X.0F67
                @Override // X.InterfaceC565580MGe
                public final void LIZ(EnumC565560MGc enumC565560MGc) {
                    C0F65 c0f65 = this.LIZ;
                    C12WG.LIZJ(c0f65, new ARunnableS74S0200000_5(enumC565560MGc, c0f65, 18));
                }
            }));
        }
        C0I7D c0i7d3 = this.LLJJJJLIIL;
        if (c0i7d3 != null) {
            c0i7d3.requestFocus();
        }
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 != null) {
            objH22 = C786410Ut5.H2(sceneContext2, "input_method");
        } else {
            objH22 = null;
        }
        if (objH22 instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) objH22;
        }
        this.LLJZIJLIL = inputMethodManager;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.LLJJJJLIIL, 1);
        }
        C12WG.LIZJ(this, new ARunnableS105S0100000_5(this, 40));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mk, viewGroup, false);
    }
}
