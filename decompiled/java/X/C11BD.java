package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11BD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BD extends LinearLayout implements View.OnClickListener {
    public C11BC LL;
    public final BPEAHandler LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public C427280GpC LLILZLL;
    public C427280GpC LLIZ;
    public LinearLayout LLIZLLLIL;
    public C0I7D LLJ;

    public final void LIZ() {
        InputMethodManager inputMethodManager = (InputMethodManager) C446980Hfs.LIZIZ(getContext(), InputMethodManager.class);
        C0I7D c0i7d = this.LLJ;
        inputMethodManager.hideSoftInputFromWindow(c0i7d != null ? c0i7d.getWindowToken() : null, 0);
    }

    private final void setSearchBarOnFocusChangeListener(final boolean z) {
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            c0i7d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.11BB
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) throws Throwable {
                    int i;
                    C427280GpC c427280GpC = this.LL.LLIZ;
                    if (c427280GpC != null) {
                        if (z && z2) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        int visibility = c427280GpC.getVisibility();
                        c427280GpC.setVisibility(i);
                        C1602160rnK.LIZIZ(visibility, i, c427280GpC);
                    }
                    if (!z2) {
                        this.LL.LIZ();
                    }
                    C11BD c11bd = this.LL;
                    C11BC c11bc = c11bd.LL;
                    if (c11bc != null) {
                        C0I7D c0i7d2 = c11bd.LLJ;
                        Editable editableLLLLJI = null;
                        if (c0i7d2 != null) {
                            editableLLLLJI = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUhjGZ6OXWH0EJ8tvnQws1v9A88=", null));
                        }
                        c11bc.LJIILL(String.valueOf(editableLLLLJI), z2);
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.bn2) {
            C11BC c11bc = this.LL;
            if (c11bc != null) {
                c11bc.LLILII();
                return;
            }
            return;
        }
        if (view.getId() == R.id.coo) {
            C0I7D c0i7d = this.LLJ;
            if (c0i7d != null) {
                c0i7d.setText("");
            }
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C11BC c11bc2 = this.LL;
            if (c11bc2 == null) {
                return;
            }
            c11bc2.LJJLIIIJLJLI();
            return;
        }
        if (view.getId() == R.id.u7r) {
            C11BC c11bc3 = this.LL;
            if (c11bc3 == null) {
                return;
            }
            c11bc3.LJIILJJIL();
            return;
        }
        if (!Intrinsics.LJFF(view, this.LLIZ)) {
            return;
        }
        C0I7D c0i7d2 = this.LLJ;
        if (c0i7d2 != null) {
            c0i7d2.setText("");
        }
        C0I7D c0i7d3 = this.LLJ;
        if (c0i7d3 != null) {
            c0i7d3.clearFocus();
        }
        C11BC c11bc4 = this.LL;
        if (c11bc4 == null) {
            return;
        }
        c11bc4.LLILZLL();
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            c0i7d.setOnKeyListener(onKeyListener);
        }
    }

    public final void setSearchBarEventHandler(C11BC c11bc) {
        this.LL = c11bc;
    }

    public C11BD(Context context, AttributeSet attributeSet) {
        Integer numLIZJ;
        Integer numLIZJ2;
        int i;
        Integer numLIZJ3;
        int i2;
        super(context, attributeSet, 0);
        this.LLILLJJLI = new BPEAHandler();
        C786410Ut5.LJLLJ(context, R.layout.ia4, this);
        this.LLILLL = (TuxIconView) findViewById(R.id.bn2);
        this.LLILZ = (TuxIconView) findViewById(R.id.uaj);
        this.LLILZIL = (TuxIconView) findViewById(R.id.coo);
        this.LLILZLL = (C427280GpC) findViewById(R.id.u7r);
        this.LLIZ = (C427280GpC) findViewById(R.id.db1);
        this.LLJ = (C0I7D) findViewById(R.id.hdh);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.i6q);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SearchBar, 0, 0);
        try {
            LIZIZ(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SearchBar_search_bar_hint), typedArrayObtainStyledAttributes.getBoolean(R$styleable.SearchBar_show_cancel_btn, false));
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SearchBar_show_back_btn, false);
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, this);
            }
            TuxIconView tuxIconView2 = this.LLILLL;
            if (tuxIconView2 != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
            }
            if (C960203pA.LIZIZ(getContext()) && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, getContext())) != null) {
                int iIntValue = numLIZJ3.intValue();
                TuxIconView tuxIconView3 = this.LLILLL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setTintColor(iIntValue);
                }
            }
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SearchBar_show_search_btn, false);
            C427280GpC c427280GpC = this.LLILZLL;
            if (c427280GpC != null) {
                C786410Ut5.M8(c427280GpC, this);
            }
            C427280GpC c427280GpC2 = this.LLILZLL;
            if (c427280GpC2 != null) {
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                int visibility = c427280GpC2.getVisibility();
                c427280GpC2.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c427280GpC2);
            }
            if (C960203pA.LIZIZ(getContext()) && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext())) != null) {
                int iIntValue2 = numLIZJ2.intValue();
                C427280GpC c427280GpC3 = this.LLILZLL;
                if (c427280GpC3 != null) {
                    c427280GpC3.setTextColor(iIntValue2);
                }
                TuxIconView tuxIconView4 = this.LLILZ;
                if (tuxIconView4 != null) {
                    tuxIconView4.setTintColor(iIntValue2);
                }
            }
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.SearchBar_show_clear_btn, true)) {
                TuxIconView tuxIconView5 = this.LLILZIL;
                if (tuxIconView5 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
                }
                TuxIconView tuxIconView6 = this.LLILZIL;
                if (tuxIconView6 != null) {
                    C786410Ut5.a9(tuxIconView6, this);
                }
            } else {
                TuxIconView tuxIconView7 = this.LLILZIL;
                if (tuxIconView7 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
                }
            }
            C427280GpC c427280GpC4 = this.LLIZ;
            if (c427280GpC4 != null) {
                C786410Ut5.M8(c427280GpC4, this);
            }
            if (C960203pA.LIZIZ(getContext()) && (numLIZJ = C1308910kAL.LIZJ(R.attr.u_, getContext())) != null) {
                int iIntValue3 = numLIZJ.intValue();
                C427280GpC c427280GpC5 = this.LLIZ;
                if (c427280GpC5 != null) {
                    c427280GpC5.setTextColor(iIntValue3);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            setOrientation(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void LIZIZ(String str, boolean z) {
        C0I7D c0i7d;
        if (str != null && str.length() > 0 && (c0i7d = this.LLJ) != null) {
            c0i7d.setHint(str);
        }
        C0I7D c0i7d2 = this.LLJ;
        if (c0i7d2 != null) {
            c0i7d2.addTextChangedListener(new C19773412Ya(this, 11));
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C436180H8m.LIZ(4.0f, getContext()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null) {
            linearLayout.setBackground(gradientDrawable);
        }
        if (C960203pA.LIZIZ(getContext())) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
            if (numLIZJ2 != null) {
                int iIntValue = numLIZJ2.intValue();
                C0I7D c0i7d3 = this.LLJ;
                if (c0i7d3 != null) {
                    c0i7d3.setHintTextColor(iIntValue);
                }
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.u_, getContext());
            if (numLIZJ3 != null) {
                int iIntValue2 = numLIZJ3.intValue();
                C0I7D c0i7d4 = this.LLJ;
                if (c0i7d4 != null) {
                    c0i7d4.setTextColor(iIntValue2);
                }
            }
        }
        setSearchBarOnFocusChangeListener(z);
    }
}
