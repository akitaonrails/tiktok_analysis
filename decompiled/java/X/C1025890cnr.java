package X;

import Y.ATListenerS449S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025890cnr extends FrameLayout implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public FrameLayout LL;
    public C1025960cny LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C1025910cnt LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public ProgressBar LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C1000290c8Z LLJILJIL;
    public boolean LLJILJILJ;
    public C1025930cnv LLJILLL;
    public InterfaceC989850brj LLJJ;
    public InterfaceC1025940cnw LLJJI;
    public InterfaceC990250bsN LLJJIII;
    public Function0<? extends Object> LLJJIJI;
    public final C138P LLJJIJIIJIL;
    public C1025310cmv LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1025900cns LLJJJIL;
    public final C1026010co3 LLJJJJ;
    public final C1002200cBe LLJJJJJIL;

    public final InterfaceC1037450d6V getWebView() {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final TuxTextView getDebugWebviewTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fh_);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1025950cnx getLoadListener() {
        return (C1025950cnx) this.LLJJJ.getValue();
    }

    public final FrameLayout getPaddingLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.py6);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ProgressBar getPopUpNavLoadingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhf);
            this.LLJ = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final C1025960cny getPopUpWebBottomSheetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhg);
            this.LLILLJJLI = (C1025960cny) callbackFindViewById;
        }
        return (C1025960cny) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebMarkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhk);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebNetworkErrorViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhq);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebRetryBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rht);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebRoundLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhu);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhw);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1025910cnt getPopUpWebTitleBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhy);
            this.LLILZLL = (C1025910cnt) callbackFindViewById;
        }
        return (C1025910cnt) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhx);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1025920cnu getActionMode() {
        return getPopUpWebBottomSheetFromXml().getActionMode();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0c8Z] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Bundle bundle;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onAttachedToWindow();
        C1025930cnv c1025930cnv = this.LLJILLL;
        if (c1025930cnv == null || (bundle = c1025930cnv.LIZLLL) == null) {
            return;
        }
        bundle.putBoolean("show_load_dialog", false);
        C786410Ut5.LJLLJ(getContext(), R.layout.cv5, this);
        FrameLayout paddingLayoutFromXml = getPaddingLayoutFromXml();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) paddingLayoutFromXml.getLayoutParams();
        C1025930cnv c1025930cnv2 = this.LLJILLL;
        marginLayoutParams2.topMargin = c1025930cnv2 != null ? c1025930cnv2.LIZJ : 0;
        paddingLayoutFromXml.requestLayout();
        C14KQ.LJIIIIZZ(getContext());
        C14KQ.LJ(getContext());
        C497820Jfg.LIZJ(getContext());
        C1025960cny popUpWebBottomSheetFromXml = getPopUpWebBottomSheetFromXml();
        FrameLayout popUpWebRoundLayoutFromXml = getPopUpWebRoundLayoutFromXml();
        popUpWebBottomSheetFromXml.getClass();
        ((C16G1) popUpWebRoundLayoutFromXml.getLayoutParams()).LIZIZ(popUpWebBottomSheetFromXml.LLJJL);
        C10VO.LIZIZ(getPopUpWebRetryBtnFromXml());
        TuxTextView debugWebviewTagFromXml = getDebugWebviewTagFromXml();
        if (debugWebviewTagFromXml != null) {
            C786410Ut5.LLLLZLL(debugWebviewTagFromXml, 8);
        }
        final Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ != null) {
            this.LLJILJIL = new AbstractC1038410d83(activityLIZ, this) { // from class: X.0c8Z
                public final /* synthetic */ C1025890cnr LLILLL;

                {
                    this.LLILLL = this;
                }

                @Override // X.InterfaceC1399350mWD
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                    C1025960cny popUpWebBottomSheetFromXml2;
                    int i2;
                    if (i != 4 || (((popUpWebBottomSheetFromXml2 = this.LLILLL.getPopUpWebBottomSheetFromXml()) == null || ((i2 = popUpWebBottomSheetFromXml2.LLJJL.LJIIIIZZ) != 3 && i2 != 4)) && !this.LLILLL.LLJILJILJ)) {
                        return false;
                    }
                    InterfaceC990250bsN keyDownCallBack = this.LLILLL.getKeyDownCallBack();
                    if (keyDownCallBack != null) {
                        keyDownCallBack.onBackPress();
                    }
                    C1025890cnr.LIZ(this.LLILLL);
                    return true;
                }
            };
            getPopUpWebBottomSheetFromXml().setCallback(this.LLJJJIL);
            getPopUpWebBottomSheetFromXml().getBehavior().LJIJJLI = true;
            getPopUpWebTitleBarFromXml().setTitleBarListener(this.LLJJJJJIL);
            getPopUpWebTitleBarFromXml().setOnTouchListener(new ATListenerS449S0100000_16(this, 9));
            int iLIZ = C341940Daq.LIZ(52.5d);
            FrameLayout popUpWebNetworkErrorViewFromXml = getPopUpWebNetworkErrorViewFromXml();
            ViewGroup.LayoutParams layoutParams = popUpWebNetworkErrorViewFromXml.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = iLIZ;
                C786410Ut5.W5(popUpWebNetworkErrorViewFromXml, marginLayoutParams);
            }
        }
        Function0<? extends Object> function0 = this.LLJJIJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1000290c8Z c1000290c8Z = this.LLJILJIL;
        if (c1000290c8Z != null) {
            c1000290c8Z.enable(false);
        }
        this.LLJILJIL = null;
    }

    public final InterfaceC990250bsN getKeyDownCallBack() {
        return this.LLJJIII;
    }

    public final InterfaceC1025940cnw getMBehaviorCallback() {
        return this.LLJJI;
    }

    public final C1025930cnv getParams() {
        return this.LLJILLL;
    }

    public final InterfaceC989850brj getTitleBarCallback() {
        return this.LLJJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0cns] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0co3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0cBe] */
    public C1025890cnr(final C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJJIJIIJIL = new C138P();
        this.LLJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 832));
        this.LLJJJIL = new InterfaceC1025980co0() { // from class: X.0cns
            public int LIZ;

            @Override // X.InterfaceC1025980co0
            public final void LJJJIL() {
                if (this.LIZ == 5) {
                    return;
                }
                this.LIZ = 5;
                InterfaceC1026000co2 interfaceC1026000co2 = this.getLoadListener().LIZ;
                if (interfaceC1026000co2 != null) {
                    System.currentTimeMillis();
                    interfaceC1026000co2.LJIJJLI();
                }
                C1000290c8Z c1000290c8Z = this.LLJILJIL;
                if (c1000290c8Z != null) {
                    c1000290c8Z.enable(false);
                }
                C786410Ut5.LJZ(8, this.getPopUpWebMarkFromXml());
                C786410Ut5.O7(this.getPopUpWebMarkFromXml(), null);
                this.getPopUpWebMarkFromXml().setClickable(false);
                InterfaceC1025940cnw mBehaviorCallback = this.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.LJJJIL();
                }
                C1025890cnr c1025890cnr = this;
                C1025310cmv c1025310cmv = c1025890cnr.LLJJIJIL;
                if (c1025310cmv != null) {
                    String str = c1025310cmv.LIZIZ.get("EVENT_NAME_FOR_STAY");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : c1025310cmv.LIZIZ.entrySet()) {
                        if (!Intrinsics.LJFF(entry.getKey(), "EVENT_NAME_WHEN_REQUEST") && !Intrinsics.LJFF(entry.getKey(), "EVENT_NAME_FOR_STAY")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.put("duration", String.valueOf(c1025890cnr.LLJJIJIIJIL.LIZIZ(TimeUnit.MILLISECONDS)));
                    if (C703302op.LIZ(str)) {
                        C20684815ws.LJIILLIIL(str, linkedHashMap);
                    }
                }
                this.getClass();
                C1025890cnr c1025890cnr2 = this;
                c1025890cnr2.LLJILJILJ = false;
                c1025890cnr2.getLoadListener().getClass();
            }

            @Override // X.InterfaceC1025980co0
            public final void LLLFF() {
                Activity activityLIZ;
                Window window;
                View decorView;
                if (C1025960cny.LLJLIL) {
                    Context context = c19eg;
                    C1069330dvv.LIZ(context, (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findFocus());
                }
            }

            @Override // X.InterfaceC1025980co0
            public final void LLLFFI() {
                if (this.LIZ == 4) {
                    return;
                }
                this.LIZ = 4;
            }

            @Override // X.InterfaceC1025980co0
            public final void LLLFZ() {
                if (this.LIZ == 3) {
                    return;
                }
                this.LIZ = 3;
            }

            @Override // X.InterfaceC1025980co0
            public final void LJJJI(float f) {
                if (Float.isNaN(f)) {
                    C786410Ut5.U4(this.getPopUpWebMarkFromXml(), 1.0f);
                } else {
                    if (f >= 0.0f) {
                        return;
                    }
                    C786410Ut5.U4(this.getPopUpWebMarkFromXml(), 1.0f - Math.abs(f));
                }
            }
        };
        this.LLJJJJ = new InterfaceC1026000co2() { // from class: X.0co3
            @Override // X.InterfaceC1026000co2
            public final void LJIJJLI() {
            }
        };
        this.LLJJJJJIL = new InterfaceC1025990co1() { // from class: X.0cBe
            @Override // X.InterfaceC1025990co1
            public final void LIZIZ() {
                this.LIZ.getClass();
                C1025890cnr.LIZ(this.LIZ);
                InterfaceC989850brj titleBarCallback = this.LIZ.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.LIZ();
                }
            }
        };
    }

    public static void LIZ(C1025890cnr c1025890cnr) {
        View viewFindFocus;
        Activity activityLIZ;
        Window window;
        View decorView;
        AdPopUpWebBottomSheetBehavior<C1025960cny> adPopUpWebBottomSheetBehavior = c1025890cnr.getPopUpWebBottomSheetFromXml().LLJJL;
        int i = adPopUpWebBottomSheetBehavior.LJIIIIZZ;
        if (i == 3 || i == 4) {
            adPopUpWebBottomSheetBehavior.setState(5);
        }
        Context context = c1025890cnr.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindFocus = decorView.findFocus();
        } else {
            viewFindFocus = null;
        }
        C1069330dvv.LIZ(context, viewFindFocus);
    }

    public final void setDebugWebviewTagFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setKeyDownCallBack(InterfaceC990250bsN interfaceC990250bsN) {
        this.LLJJIII = interfaceC990250bsN;
    }

    public final void setMBehaviorCallback(InterfaceC1025940cnw interfaceC1025940cnw) {
        this.LLJJI = interfaceC1025940cnw;
    }

    public final void setPaddingLayoutFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setParams(C1025930cnv c1025930cnv) {
        this.LLJILLL = c1025930cnv;
    }

    public final void setPopUpNavLoadingFromXml(ProgressBar progressBar) {
        this.LLJ = progressBar;
    }

    public final void setPopUpWebBottomSheetFromXml(C1025960cny c1025960cny) {
        this.LLILLJJLI = c1025960cny;
    }

    public final void setPopUpWebMarkFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setPopUpWebNetworkErrorViewFromXml(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setPopUpWebRetryBtnFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setPopUpWebRoundLayoutFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setPopUpWebSubtitleFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setPopUpWebTitleBarFromXml(C1025910cnt c1025910cnt) {
        this.LLILZLL = c1025910cnt;
    }

    public final void setPopUpWebTitleFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setTitleBarCallback(InterfaceC989850brj interfaceC989850brj) {
        this.LLJJ = interfaceC989850brj;
    }
}
