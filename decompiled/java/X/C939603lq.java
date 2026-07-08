package X;

import Y.ATListenerS333S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.method.NumberKeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: renamed from: X.03lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C939603lq extends LinearLayout implements InterfaceC1748810vbr {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public C0I7D LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public C7735030j LLIZ;
    public String LLIZLLLIL;
    public Map<String, ? extends Object> LLJ;
    public Map<String, ? extends Object> LLJI;
    public Map<String, ? extends Object> LLJIJIL;
    public Function2<? super Integer, ? super String, Unit> LLJILJIL;
    public Function2<? super Boolean, ? super Integer, Unit> LLJILJILJ;
    public Function1<? super C939603lq, Unit> LLJILLL;
    public long LLJJ;
    public int LLJJI;
    public C719102rN LLJJIII;
    public C801903Bh LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public Map<String, ? extends Object> LLJJJIL;

    public final C0I7D getCounterInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f18);
            this.LLILLL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final TuxIconView getCounterMinusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f19);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getCounterPlusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1a);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getCounterViewLeftDividerFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f1d);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final View getCounterViewRightDividerFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f1e);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final List<View> getCounterViews() {
        return (List) this.LLJJIJIIJIL.getValue();
    }

    public final void LIZLLL() {
        int iLIZ = C960203pA.LIZ(R.attr.a1p, getContext());
        int iLIZ2 = C960203pA.LIZ(R.attr.a1h, getContext());
        getCounterPlusFromXml().setTintColor(this.LLILZLL >= this.LLIZ.LIZIZ ? iLIZ : iLIZ2);
        TuxIconView counterMinusFromXml = getCounterMinusFromXml();
        if (this.LLILZLL > this.LLIZ.LIZ) {
            iLIZ = iLIZ2;
        }
        counterMinusFromXml.setTintColor(iLIZ);
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    public final EditText getInput() {
        return getCounterInputFromXml();
    }

    @Override // X.InterfaceC1748810vbr
    public List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    public final void LIZ(String str) {
        String strJ4;
        QuantityControlInfo quantityControlInfo;
        C719102rN c719102rN = this.LLJJIII;
        if (c719102rN == null || (quantityControlInfo = c719102rN.LLLF) == null || (strJ4 = quantityControlInfo.hitMaxToast) == null) {
            strJ4 = C786410Ut5.j4(C20642515q3.LJI(2131832583), Arrays.copyOf(new Object[]{Integer.valueOf(this.LLIZ.LIZIZ)}, 1));
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(strJ4);
        c1389890mGx.LJIIJJI();
        C1748720vbi.LIZIZ(this, new AnonymousClass0481(), new AwS115S1100000_1(this, str, 24));
    }

    public final void LIZIZ(String str) {
        boolean z;
        String quantityString;
        String str2;
        Integer num;
        QuantityControlInfo quantityControlInfo;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "select_atleast_x";
        C719102rN c719102rN = this.LLJJIII;
        if (c719102rN == null || (quantityControlInfo = c719102rN.LLLF) == null || (quantityString = quantityControlInfo.hitMinToast) == null) {
            if (c719102rN != null && (num = c719102rN.LLJJIJI) != null && num.intValue() > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c259800zU.element = "min_quantity_limitation";
                Resources resources = getContext().getResources();
                int i = this.LLIZ.LIZ;
                quantityString = resources.getQuantityString(2131755286, i, Integer.valueOf(i));
                C801903Bh c801903Bh = this.LLJJIJI;
                if (c801903Bh != null && (str2 = c801903Bh.LJIIIZ) != null) {
                    quantityString = C799803Am.LIZ(this.LLIZ.LIZ, str2);
                }
            } else {
                Resources resources2 = getContext().getResources();
                int i2 = this.LLIZ.LIZ;
                quantityString = resources2.getQuantityString(2131755286, i2, Integer.valueOf(i2));
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(quantityString);
        c1389890mGx.LJIIJJI();
        C1748720vbi.LIZIZ(this, new AnonymousClass0481(), new AwS86S1200000_1(c259800zU, (C259800zU<String>) this, (C939603lq) str, (String) 11));
    }

    public final void LIZJ(boolean z) {
        C0I7D counterInputFromXml = getCounterInputFromXml();
        getCounterPlusFromXml().setClickable(false);
        getCounterMinusFromXml().setClickable(false);
        counterInputFromXml.setClickable(false);
        counterInputFromXml.setEnabled(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2204961BRm.LLLLJI(counterInputFromXml, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LQRh/Q5yecSiUwy8hlJ1+1Dbtr37kB27T1gcw==", null)));
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder.length(), 33);
                counterInputFromXml.setText(spannableStringBuilder);
            }
            getCounterPlusFromXml().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
            getCounterMinusFromXml().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 35), this);
        this.LLJJIJIL = true;
    }

    public final void LJ(boolean z) {
        getCounterPlusFromXml().setClickable(false);
        getCounterMinusFromXml().setClickable(false);
        getCounterInputFromXml().setClickable(false);
        getCounterInputFromXml().setEnabled(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            getCounterPlusFromXml().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
            getCounterMinusFromXml().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 337));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setClickListener(Function1<? super C939603lq, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setCounterBg(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = R.drawable.b4s;
        } else {
            i = R.drawable.b4r;
        }
        setBackground(C800703Av.LIZ(i, context));
    }

    public final void setCounterInputFromXml(C0I7D c0i7d) {
        this.LLILLL = c0i7d;
    }

    public final void setCounterMinusFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setCounterPlusFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setCounterStyle(boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, getCounterViewLeftDividerFromXml());
            C786410Ut5.LJLLLLLL(0, getCounterViewRightDividerFromXml());
            setBackground(C800703Av.LIZ(R.drawable.b4r, getContext()));
            C1744700vVE.LJIIL(getCounterPlusFromXml(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), getCounterPlusFromXml());
            getCounterPlusFromXml().setBackground(null);
            C1744700vVE.LJIIL(getCounterMinusFromXml(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), getCounterMinusFromXml());
            getCounterMinusFromXml().setBackground(null);
            C1744700vVE.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), getCounterInputFromXml());
            C1744700vVE.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), getCounterInputFromXml());
            getCounterInputFromXml().setBackground(null);
            return;
        }
        C786410Ut5.LJLLLLLL(8, getCounterViewLeftDividerFromXml());
        C786410Ut5.LJLLLLLL(8, getCounterViewRightDividerFromXml());
        setBackground(null);
        C1744700vVE.LJIIL(getCounterPlusFromXml(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), getCounterPlusFromXml());
        getCounterPlusFromXml().setBackground(C800703Av.LIZ(R.drawable.b4y, getContext()));
        C1744700vVE.LJIIL(getCounterMinusFromXml(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), getCounterMinusFromXml());
        getCounterMinusFromXml().setBackground(C800703Av.LIZ(R.drawable.b4x, getContext()));
        C1744700vVE.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), getCounterInputFromXml());
        C1744700vVE.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), getCounterInputFromXml());
        getCounterInputFromXml().setBackground(C800703Av.LIZ(R.drawable.b4w, getContext()));
    }

    public final void setCounterViewLeftDividerFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setCounterViewRightDividerFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setExtraInfo(HashMap<String, Object> map) {
        if (map != null) {
            this.LLJJJIL = map;
        }
    }

    public final void setKeyBoardHeightListener(Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LLJILJILJ = function2;
    }

    public final void setPurchaseNoticeHelper(C801903Bh c801903Bh) {
        this.LLJJIJI = c801903Bh;
    }

    public final void setQuantity(int i) {
        this.LLILZLL = i;
        getCounterInputFromXml().setText(String.valueOf(this.LLILZLL));
        if (getCounterInputFromXml().hasFocus()) {
            getCounterInputFromXml().setSelection(String.valueOf(this.LLILZLL).length());
        }
        LIZLLL();
    }

    public final void setQuantityChangeListener(Function2<? super Integer, ? super String, Unit> function2) {
        this.LLJILJIL = function2;
    }

    public final void setQuantityLimit(C7735030j c7735030j) {
        this.LLIZ = c7735030j;
    }

    public final void setSku(C719102rN c719102rN) {
        this.LLJJIII = c719102rN;
    }

    public final void setSkuId(String str) {
        this.LLIZLLLIL = str;
    }

    public C939603lq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = new C7735030j(1, 200);
        this.LLIZLLLIL = "";
        this.LLJ = new LinkedHashMap();
        this.LLJI = new LinkedHashMap();
        this.LLJILJIL = AFwS284S0000000_1.get$arr$(46);
        this.LLJILLL = AFwS228S0000000_1.get$arr$(677);
        this.LLJJ = -1L;
        this.LLJJI = -1;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1653));
        this.LLJJJIL = new LinkedHashMap();
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.auc, this, true);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ instanceof C19GS) {
            new KeyBoardVisibilityUtil((C19FO) activityLIZ, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 195));
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 103), getCounterPlusFromXml());
        C786410Ut5.I7(new AjS60S0100000_1(this, 104), getCounterMinusFromXml());
        C0I7D counterInputFromXml = getCounterInputFromXml();
        counterInputFromXml.setOnTouchListener(new ATListenerS333S0200000_1(this, counterInputFromXml, 4));
        counterInputFromXml.addTextChangedListener(new C04JZ(this, 1));
        counterInputFromXml.setKeyListener(new NumberKeyListener() { // from class: X.03ls
            @Override // android.text.method.KeyListener
            public final int getInputType() {
                return 3;
            }

            @Override // android.text.method.NumberKeyListener
            public final char[] getAcceptedChars() {
                return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            }
        });
        if (C1744760vVK.LIZ()) {
            getCounterMinusFromXml().setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.b24));
            getCounterPlusFromXml().setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.b23));
        }
    }
}
