package X;

import Y.ATListenerS335S0200000_6;
import android.content.Context;
import android.text.Editable;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS255S0000000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: renamed from: X.0hDV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195550hDV extends LinearLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C166U LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public Function2<? super Integer, ? super String, Unit> LLJ;
    public Function1<? super C1193540hAG, Unit> LLJI;
    public Function0<Unit> LLJIJIL;
    public boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1195550hDV.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiSkuCounterViewBinding;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1195570hDX getBinding() {
        C166U c166u = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (C1195570hDX) c166u.LIZ(this);
    }

    public final void LIZIZ() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ == null || numLIZJ2 == null) {
            return;
        }
        getBinding().LLILZ.setTintColor(this.LLILLL >= this.LLILZLL ? numLIZJ.intValue() : numLIZJ2.intValue());
        getBinding().LLILLL.setTintColor(this.LLILLL <= this.LLILZIL ? numLIZJ.intValue() : numLIZJ2.intValue());
    }

    public final EditText getInputView() {
        return getBinding().LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleOwner lifecycleOwnerLJFF;
        super.onAttachedToWindow();
        AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(this);
        if (abstractC1387200mCcLIZ == null || (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) == null) {
            return;
        }
        new KeyBoardMonitor(lifecycleOwnerLJFF).LIZ(this, new InterfaceC459810I1j() { // from class: X.0hDW
            @Override // X.InterfaceC459810I1j
            public final void V3() {
                this.LL.LLJILJIL = true;
            }

            @Override // X.InterfaceC459810I1j
            public final void ub() {
                C1195550hDV c1195550hDV = this.LL;
                if (c1195550hDV.LLJILJIL && c1195550hDV.getBinding().LLILLJJLI.hasFocus()) {
                    this.LL.LIZ(true);
                    this.LL.getBinding().LLILLJJLI.clearFocus();
                }
                this.LL.LLJILJIL = false;
            }
        });
    }

    public final void LIZ(boolean z) {
        if (z) {
            int i = this.LLILLJJLI;
            int i2 = this.LLILZLL;
            if (i > i2) {
                this.LLILLL = i2;
                this.LLILLJJLI = i2;
                this.LLJI.invoke(new C1193540hAG(true, false));
            } else {
                int i3 = this.LLILZIL;
                if (i < i3) {
                    this.LLILLL = i3;
                    this.LLILLJJLI = i3;
                    this.LLJI.invoke(new C1193540hAG(false, true));
                } else {
                    int i4 = this.LLIZ;
                    this.LLILLL = (i / i4) * i4;
                    this.LLJI.invoke(new C1193540hAG(false, false));
                }
            }
            getBinding().LLILLJJLI.setText(String.valueOf(this.LLILLL));
            if (getBinding().LLILLJJLI.hasFocus()) {
                getBinding().LLILLJJLI.setSelection(String.valueOf(this.LLILLL).length());
            }
            LIZIZ();
            int i5 = this.LLILLL;
            if (i5 != this.LLILZ) {
                this.LLJ.invoke(Integer.valueOf(i5), this.LLIZLLLIL);
                this.LLILZ = this.LLILLL;
                return;
            }
            return;
        }
        this.LLILLL = this.LLILLJJLI;
        this.LLJI.invoke(new C1193540hAG(false, false));
        getBinding().LLILLJJLI.setText(String.valueOf(this.LLILLL));
        if (getBinding().LLILLJJLI.hasFocus()) {
            getBinding().LLILLJJLI.setSelection(String.valueOf(this.LLILLL).length());
        }
        LIZIZ();
        int i6 = this.LLILLL;
        if (i6 == this.LLILZ) {
            return;
        }
        this.LLJ.invoke(Integer.valueOf(i6), this.LLIZLLLIL);
        this.LLILZ = this.LLILLL;
    }

    public final void setClickProductQuantityListener(Function0<Unit> function0) {
        this.LLJIJIL = function0;
    }

    public final void setQuantityChangeListener(Function2<? super Integer, ? super String, Unit> function2) {
        this.LLJ = function2;
    }

    public final void setQuantityHitLimitListener(Function1<? super C1193540hAG, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setSkuId(String str) {
        this.LLIZLLLIL = str;
    }

    public C1195550hDV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C166U(new AwS255S0000000_18(1));
        this.LLILZIL = 1;
        this.LLILZLL = 100;
        this.LLIZ = 1;
        this.LLIZLLLIL = "";
        this.LLJ = AFwS285S0000000_2.get$arr$(38);
        this.LLJI = AFwS256S0000000_18.get$arr$(863);
        this.LLJIJIL = AFwS206S0000000_18.get$arr$(669);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e9a, this, true);
        setBackgroundResource(R.drawable.cvq);
        C786410Ut5.I7(new AbS699S0100000_18(this, 41, 42), getBinding().LLILZ);
        C786410Ut5.I7(new AbS699S0100000_18(this, 42, 42), getBinding().LLILLL);
        C0I7D c0i7d = getBinding().LLILLJJLI;
        c0i7d.setOnTouchListener(new ATListenerS335S0200000_6(c0i7d, this, 0));
        c0i7d.addTextChangedListener(new C0DL6() { // from class: X.0hCO
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                C1195550hDV c1195550hDV = this.LL;
                int i = 0;
                if (string.length() != 0) {
                    i = CastIntegerProtector.parseInt(string);
                }
                c1195550hDV.LLILLJJLI = i;
            }
        });
        c0i7d.setKeyListener(new NumberKeyListener() { // from class: X.047Q
            @Override // android.text.method.KeyListener
            public final int getInputType() {
                return 3;
            }

            @Override // android.text.method.NumberKeyListener
            public final char[] getAcceptedChars() {
                return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            }
        });
    }
}
