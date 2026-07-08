package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11BJ extends LinearLayout {
    public final C11BM LL;
    public EnumC19360310oj LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public C09BN LLILZLL;
    public Function0<Unit> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public Function1<? super Integer, Unit> LLJ;
    public Function1<? super Integer, Unit> LLJI;
    public Function1<? super Integer, Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;

    public final void LIZIZ() {
        if (this.LLJJI && isEnabled()) {
            EnumC19360310oj enumC19360310oj = this.LLILLJJLI;
            EnumC19360310oj enumC19360310oj2 = EnumC19360310oj.LLILLJJLI;
            if (enumC19360310oj != enumC19360310oj2) {
                this.LLILLJJLI = enumC19360310oj2;
                int i = this.LLJILJILJ;
                this.LLILZ = i;
                this.LLILZIL = false;
                setInputText(String.valueOf(i));
                LJI();
                this.LL.LIZJ.requestFocus();
                HandlerHook.viewPost(this.LL.LIZJ, new ARunnableS129S0100000_29(this, 24));
                Function1<? super Integer, Unit> function1 = this.LLJI;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(this.LLJILJILJ));
                }
            }
        }
    }

    public final void LIZLLL() throws Throwable {
        if (this.LLILLJJLI != EnumC19360310oj.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = EnumC19360310oj.LL;
        this.LLILZIL = true;
        this.LL.LIZJ.clearFocus();
        LJ();
        int i = this.LLJILJILJ;
        this.LLILZ = i;
        setInputText(String.valueOf(i));
        LJI();
        Function0<Unit> function0 = this.LLJILJIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LJI() {
        boolean z;
        String strValueOf;
        if (this.LLILLJJLI == EnumC19360310oj.LLILLJJLI) {
            z = true;
            Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LL.LIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6aAgW6u1xBqR/9ZTDkQqXXHHZAL983wMvS3nfQ8wmVwe+T5BSjCazOBY=", null));
            if (editableLLLLJI == null || (strValueOf = editableLLLLJI.toString()) == null) {
                strValueOf = "";
            }
        } else {
            z = false;
            strValueOf = String.valueOf(this.LLJILJILJ);
        }
        setInputText(strValueOf);
        this.LL.LIZJ.setFocusable(z);
        this.LL.LIZJ.setFocusableInTouchMode(z);
        this.LL.LIZJ.setCursorVisible(z);
        this.LL.LIZJ.setLongClickable(z);
        this.LL.LIZJ.setClickable(true);
        this.LL.LIZJ.setEnabled(isEnabled());
        this.LL.LIZJ.setGravity(17);
        this.LL.LIZJ.setTextAlignment(4);
        float f = isEnabled() ? 1.0f : 0.5f;
        C786410Ut5.T4(this.LL.LIZLLL, f);
        C786410Ut5.T4(this.LL.LJ, f);
        C786410Ut5.T4(this.LL.LJFF, f);
        C0I7D c0i7d = this.LL.LIZJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0i7d);
        c0i7d.setAlpha(f);
        LIZ(this.LL.LIZ, this.LLJILJILJ <= this.LLJILLL);
        TuxIconView tuxIconView = this.LL.LIZIZ;
        int i = this.LLJILJILJ;
        int i2 = this.LLJJ;
        int i3 = this.LLJILLL;
        if (i2 < i3) {
            i2 = i3;
        }
        LIZ(tuxIconView, i >= i2);
    }

    public final void LJII() {
        int i = this.LLJJ;
        int i2 = this.LLJILLL;
        if (i < i2) {
            i = i2;
        }
        int length = String.valueOf(Math.abs(i)).length();
        if (length < 1) {
            length = 1;
        }
        this.LL.LIZJ.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(length)});
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws Throwable {
        C09BN c09bn = this.LLILZLL;
        if (c09bn != null && c09bn.LL.getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(c09bn.LL.getViewTreeObserver(), c09bn);
        }
        this.LLILZLL = null;
        if (this.LLILLJJLI == EnumC19360310oj.LLILLJJLI) {
            LIZLLL();
        }
        super.onDetachedFromWindow();
    }

    public final boolean LIZJ() {
        return isEnabled() && this.LLILLJJLI == EnumC19360310oj.LL;
    }

    public final void LJ() {
        InputMethodManager inputMethodManager;
        Object objH2 = C786410Ut5.H2(getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.LL.LIZJ.getWindowToken(), 0);
    }

    public C11BM LJFF() {
        C786410Ut5.Sd(R.layout.i5s, C786410Ut5.ne(getContext()), this);
        int i = R.id.cm_;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.cm_, this);
        if (tuxIconView != null) {
            i = R.id.cma;
            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.cma, this);
            if (tuxIconView2 != null) {
                i = R.id.hcj;
                C0I7D c0i7d = (C0I7D) C1616006Uk.LIZ(R.id.hcj, this);
                if (c0i7d != null) {
                    i = R.id.skv;
                    View viewLIZ = C1616006Uk.LIZ(R.id.skv, this);
                    if (viewLIZ != null) {
                        i = R.id.w41;
                        View viewLIZ2 = C1616006Uk.LIZ(R.id.w41, this);
                        if (viewLIZ2 != null) {
                            i = R.id.w42;
                            View viewLIZ3 = C1616006Uk.LIZ(R.id.w42, this);
                            if (viewLIZ3 != null) {
                                return new C11BM(viewLIZ, viewLIZ3, viewLIZ2, tuxIconView, tuxIconView2, c0i7d);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZLL == null) {
            this.LLILZLL = new C09BN(this, new AwS643S0100000_29(this, 18));
        }
    }

    public final int getMaxQuantity() {
        return this.LLJJ;
    }

    public final int getMinQuantity() {
        return this.LLJILLL;
    }

    public final Function1<Integer, Unit> getOnBeginInput() {
        return this.LLJI;
    }

    public final Function0<Unit> getOnCancelInput() {
        return this.LLJILJIL;
    }

    public final Function1<Integer, Unit> getOnCommitInput() {
        return this.LLJIJIL;
    }

    public final Function1<Integer, Unit> getOnQuantityChanged() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnTapMinus() {
        return this.LLIZLLLIL;
    }

    public final Function0<Unit> getOnTapPlus() {
        return this.LLIZ;
    }

    public final int getQuantity() {
        return this.LLJILJILJ;
    }

    private final void setInputText(String str) throws Throwable {
        String string = null;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LL.LIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6aAgW6u1xBqR/9ZTDkQqXXHHZAL983wMvS3nfQ8wmVwe+T5BSjCazOBY=", null));
        if (editableLLLLJI != null) {
            string = editableLLLLJI.toString();
        }
        if (Intrinsics.LJFF(string, str)) {
            return;
        }
        this.LLILLL = true;
        this.LL.LIZJ.setText(str);
        this.LLILLL = false;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        boolean z2;
        if (z != isEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setEnabled(z);
        if (z2) {
            LJI();
        }
    }

    public final void setInputEnabled(boolean z) throws Throwable {
        boolean z2;
        if (this.LLILLJJLI == EnumC19360310oj.LLILLJJLI) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJI = z;
        if (!z && z2) {
            LIZLLL();
        } else {
            LJI();
        }
    }

    public final void setMaxQuantity(int i) {
        this.LLJJ = i;
        setQuantity(this.LLJILJILJ);
        LJII();
    }

    public final void setMinQuantity(int i) {
        this.LLJILLL = i;
        setQuantity(this.LLJILJILJ);
        LJII();
    }

    public final void setOnBeginInput(Function1<? super Integer, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setOnCancelInput(Function0<Unit> function0) {
        this.LLJILJIL = function0;
    }

    public final void setOnCommitInput(Function1<? super Integer, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setOnQuantityChanged(Function1<? super Integer, Unit> function1) {
        this.LLJ = function1;
    }

    public final void setOnTapMinus(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOnTapPlus(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setQuantity(int i) {
        int i2 = this.LLJILLL;
        int i3 = this.LLJJ;
        if (i3 < i2) {
            i3 = i2;
        }
        int iLJ = C13LZ.LJ(i, i2, i3);
        this.LLJILJILJ = iLJ;
        if (this.LLILLJJLI != EnumC19360310oj.LLILLJJLI) {
            this.LLILZ = iLJ;
            setInputText(String.valueOf(iLJ));
        }
        LJI();
    }

    public C11BJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(TuxIconView tuxIconView, boolean z) {
        float f;
        int i;
        int iIntValue;
        boolean zLIZJ = LIZJ();
        tuxIconView.setEnabled(zLIZJ);
        if (zLIZJ) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.x5(tuxIconView, f);
        if (zLIZJ && !z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, tuxIconView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxIconView.setTintColor(iIntValue);
    }

    public C11BJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11BM c11bmLJFF = LJFF();
        this.LL = c11bmLJFF;
        this.LLILLJJLI = EnumC19360310oj.LL;
        this.LLILZ = 1;
        this.LLJILJILJ = 1;
        this.LLJILLL = 1;
        this.LLJJ = 9999;
        setOrientation(0);
        setGravity(16);
        setBackgroundResource(R.drawable.fhb);
        setMinimumHeight((int) (28 * getResources().getDisplayMetrics().density));
        C786410Ut5.a9(c11bmLJFF.LIZ, new ACListenerS163S0100000_29(this, 27));
        C786410Ut5.a9(c11bmLJFF.LIZIZ, new ACListenerS163S0100000_29(this, 28));
        final TuxIconView tuxIconView = c11bmLJFF.LIZ;
        final C11BK c11bk = new C11BK(this);
        tuxIconView.setOnTouchListener(new View.OnTouchListener() { // from class: X.06Yo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1 && actionMasked != 3) {
                        return false;
                    }
                    TuxIconView tuxIconView2 = tuxIconView;
                    if (c11bk.invoke().booleanValue()) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    C786410Ut5.x5(tuxIconView2, f);
                    return false;
                }
                if (!c11bk.invoke().booleanValue()) {
                    return false;
                }
                C786410Ut5.x5(tuxIconView, 0.7f);
                return false;
            }
        });
        final TuxIconView tuxIconView2 = c11bmLJFF.LIZIZ;
        final C11BL c11bl = new C11BL(this);
        tuxIconView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.06Yo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1 && actionMasked != 3) {
                        return false;
                    }
                    TuxIconView tuxIconView22 = tuxIconView2;
                    if (c11bl.invoke().booleanValue()) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    C786410Ut5.x5(tuxIconView22, f);
                    return false;
                }
                if (!c11bl.invoke().booleanValue()) {
                    return false;
                }
                C786410Ut5.x5(tuxIconView2, 0.7f);
                return false;
            }
        });
        c11bmLJFF.LIZJ.setOnTouchListener(new ATListenerS461S0100000_29(this, 2));
        c11bmLJFF.LIZJ.addTextChangedListener(new C19773412Ya(this, 1));
        c11bmLJFF.LIZJ.setOnEditorActionListener(new C12YA(this, 1));
        LJII();
        c11bmLJFF.LIZJ.setText(String.valueOf(this.LLJILJILJ));
        LJI();
    }
}
