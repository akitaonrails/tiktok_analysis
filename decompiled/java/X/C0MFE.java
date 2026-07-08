package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MFE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MFE<T> extends FrameLayout implements InterfaceC1391500mJY, InterfaceC565110MEj<T> {
    public final EditText LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxTextView LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public int LLJIJIL;

    public void LIZ(boolean z) {
    }

    public void LIZIZ() {
    }

    public final void LIZJ() {
        this.LLIZ = true;
        LIZLLL(this.LLJI);
        EditText editText = this.LL;
        if (editText != null) {
            C786410Ut5.LJLLLLLL(0, editText);
        }
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C337180DJs.LIZ(linearLayout);
        }
        EditText editText2 = this.LL;
        if (editText2 != null) {
            editText2.requestFocus();
        }
        EditText editText3 = this.LL;
        if (editText3 != null) {
            HandlerHook.viewPost(editText3, new ARunnableS108S0100000_8(this, 138));
        }
        EditText editText4 = this.LL;
        if (editText4 != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJbNyTs+JgqzRrRM8bi2EHa0X/tpSRRWK2fxEes6aG6fhdE=", null));
            editText4.setSelection(editableLLJILLL != null ? editableLLJILLL.length() : 0);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C337180DJs.LIZ(tuxIconView);
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
        }
    }

    @Override // X.InterfaceC565110MEj
    public final View LLLILZJ() {
        return this;
    }

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
    }

    public abstract /* synthetic */ T getInputResult();

    public final String getCurrentContent() {
        return this.LLJI;
    }

    public final boolean getEdited() {
        return this.LLIZLLLIL;
    }

    public final String getHint() {
        return this.LLJ;
    }

    public final int getTextLengthLimit() {
        return this.LLJIJIL;
    }

    public final void LIZLLL(String str) {
        int length;
        EditText editText = this.LL;
        if (editText != null) {
            editText.setText(str);
        }
        EditText editText2 = this.LL;
        if (editText2 != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJbNyTs+JgqzRrRM8bi2EHa0X/tpSRRWK2fxEes6aG6fhdE=", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            editText2.setSelection(length);
        }
        String str2 = this.LLJ;
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str2);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(str);
        }
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        LIZJ();
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        LIZLLL(this.LLJI);
        EditText editText = this.LL;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = this.LL;
        if (editText2 != null) {
            C337180DJs.LIZ(editText2);
        }
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C786410Ut5.LJLLLLLL(0, linearLayout);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(0, tuxIconView);
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C337180DJs.LIZ(tuxTextView);
        }
    }

    public final void setEditTextHint(String str) {
        EditText editText = this.LL;
        if (editText != null) {
            editText.setHint(str);
        }
    }

    public final void setEdited(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setHint(String str) {
        this.LLJ = str;
    }

    public final void setTextLengthLimit(int i) {
        this.LLJIJIL = i;
    }

    public C0MFE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = "default hint";
        this.LLJI = "";
        this.LLJIJIL = 200;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d25, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.va3);
        this.LLILLJJLI = linearLayout;
        this.LLILZLL = (TuxTextView) findViewById(R.id.yhf);
        this.LLILLL = (TuxTextView) findViewById(R.id.scz);
        this.LLILZ = (TuxTextView) findViewById(R.id.jow);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS143S0100000_8(this, 140));
        }
        EditText editText = (EditText) findViewById(R.id.grz);
        this.LL = editText;
        if (editText != null) {
            editText.setNestedScrollingEnabled(true);
            editText.setTextSize(1, 16.0f);
            C426750GoL.LJIIL(editText, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29))), 16);
            editText.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, null, 0.0f, 0, null, 249));
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: X.0MFF
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.canScrollVertically(1) || view.canScrollVertically(-1)) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        if ((motionEvent.getAction() & 255) == 1 || (motionEvent.getAction() & 255) == 3) {
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    return false;
                }
            });
            editText.addTextChangedListener(new C581030Mqb(this, 5));
        }
        this.LLILZIL = (TuxIconView) findViewById(R.id.yhe);
    }
}
