package X;

import Y.ATListenerS333S0200000_1;
import android.content.Context;
import android.content.res.Resources;
import android.text.method.NumberKeyListener;
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

/* JADX INFO: renamed from: X.03lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C939703lr extends LinearLayout implements InterfaceC1748810vbr {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public C0I7D LLILLL;
    public LinearLayout LLILZ;
    public int LLILZIL;
    public C7735030j LLILZLL;
    public String LLIZ;
    public Map<String, ? extends Object> LLIZLLLIL;
    public Map<String, ? extends Object> LLJ;
    public Map<String, ? extends Object> LLJI;
    public Function2<? super Integer, ? super String, Unit> LLJIJIL;
    public Function2<? super Boolean, ? super Integer, Unit> LLJILJIL;
    public Function1<? super C939703lr, Unit> LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public C719102rN LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

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

    public final List<View> getCounterViews() {
        return (List) this.LLJJIII.getValue();
    }

    public final LinearLayout getRootViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void LIZLLL() {
        getCounterPlusFromXml().setClickable(false);
        getCounterMinusFromXml().setClickable(false);
        getCounterInputFromXml().setClickable(false);
        getCounterInputFromXml().setEnabled(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            getCounterPlusFromXml().setTintColor(iIntValue);
            getCounterMinusFromXml().setTintColor(iIntValue);
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 34), this);
        this.LLJJIJI = true;
    }

    public final void LJ() {
        int iLIZ = C960203pA.LIZ(R.attr.a1p, getContext());
        int iLIZ2 = C960203pA.LIZ(R.attr.a1h, getContext());
        getCounterPlusFromXml().setTintColor(this.LLILZIL >= this.LLILZLL.LIZIZ ? iLIZ : iLIZ2);
        TuxIconView counterMinusFromXml = getCounterMinusFromXml();
        if (this.LLILZIL > this.LLILZLL.LIZ) {
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
        C719102rN c719102rN = this.LLJJI;
        if (c719102rN == null || (quantityControlInfo = c719102rN.LLLF) == null || (strJ4 = quantityControlInfo.hitMaxToast) == null) {
            strJ4 = C786410Ut5.j4(C20642515q3.LJI(2131832583), Arrays.copyOf(new Object[]{Integer.valueOf(this.LLILZLL.LIZIZ)}, 1));
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(strJ4);
        c1389890mGx.LJIIJJI();
        C1748720vbi.LIZIZ(this, new AnonymousClass0481(), new AwS115S1100000_1(this, str, 22));
    }

    public final void LIZIZ(String str) {
        String quantityString;
        QuantityControlInfo quantityControlInfo;
        C719102rN c719102rN = this.LLJJI;
        if (c719102rN == null || (quantityControlInfo = c719102rN.LLLF) == null || (quantityString = quantityControlInfo.hitMinToast) == null) {
            Resources resources = getContext().getResources();
            int i = this.LLILZLL.LIZ;
            quantityString = resources.getQuantityString(2131755286, i, Integer.valueOf(i));
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(quantityString);
        c1389890mGx.LJIIJJI();
        C1748720vbi.LIZIZ(this, new AnonymousClass0481(), new AwS115S1100000_1(this, str, 23));
    }

    public final void LIZJ(Integer num) {
        if (num != null) {
            num.intValue();
        }
        if (!this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
            C1748720vbi.LIZIZ(this, new C049X(), AFwS228S0000000_1.get$arr$(675));
            C1748720vbi.LIZIZ(this, new C049X(), AFwS228S0000000_1.get$arr$(676));
        }
    }

    public final void LJFF(boolean z) {
        getCounterPlusFromXml().setClickable(z);
        getCounterMinusFromXml().setClickable(z);
        getCounterInputFromXml().setClickable(z);
        getCounterInputFromXml().setEnabled(z);
    }

    public final void LJI(boolean z) {
        if (z) {
            LJ();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ != null) {
                getCounterInputFromXml().setTextColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ2 == null) {
            return;
        }
        int iIntValue = numLIZJ2.intValue();
        getCounterPlusFromXml().setTintColor(iIntValue);
        getCounterMinusFromXml().setTintColor(iIntValue);
        getCounterInputFromXml().setTextColor(iIntValue);
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 336));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJI) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAvailable(boolean z) {
        if (z) {
            getRootViewFromXml().setBackgroundResource(R.drawable.b4t);
        } else {
            getRootViewFromXml().setBackgroundResource(R.drawable.b4v);
        }
    }

    public final void setClickListener(Function1<? super C939703lr, Unit> function1) {
        this.LLJILJILJ = function1;
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

    public final void setKeyBoardHeightListener(Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LLJILJIL = function2;
    }

    public final void setQuantity(int i) {
        this.LLILZIL = i;
        getCounterInputFromXml().setText(String.valueOf(this.LLILZIL));
        if (getCounterInputFromXml().hasFocus()) {
            getCounterInputFromXml().setSelection(String.valueOf(this.LLILZIL).length());
        }
        LJ();
    }

    public final void setQuantityChangeListener(Function2<? super Integer, ? super String, Unit> function2) {
        this.LLJIJIL = function2;
    }

    public final void setQuantityLimit(C7735030j c7735030j) {
        this.LLILZLL = c7735030j;
    }

    public final void setRootViewFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setSku(C719102rN c719102rN) {
        this.LLJJI = c719102rN;
    }

    public final void setSkuId(String str) {
        this.LLIZ = str;
    }

    public C939703lr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new C7735030j(1, 200);
        this.LLIZ = "";
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = new LinkedHashMap();
        this.LLJIJIL = AFwS284S0000000_1.get$arr$(47);
        this.LLJILJILJ = AFwS228S0000000_1.get$arr$(674);
        this.LLJILLL = -1L;
        this.LLJJ = -1;
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1652));
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.auh, this, true);
        if (context instanceof C19GS) {
            new KeyBoardVisibilityUtil((C19FO) context, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 194));
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 101), getCounterPlusFromXml());
        C786410Ut5.I7(new AjS60S0100000_1(this, 102), getCounterMinusFromXml());
        C0I7D counterInputFromXml = getCounterInputFromXml();
        counterInputFromXml.setOnTouchListener(new ATListenerS333S0200000_1(this, counterInputFromXml, 5));
        counterInputFromXml.addTextChangedListener(new C04JZ(this, 2));
        counterInputFromXml.setKeyListener(new NumberKeyListener() { // from class: X.03lt
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
