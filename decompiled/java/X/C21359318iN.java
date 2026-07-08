package X;

import Y.ACListenerS166S0100000_32;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.18iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21359318iN extends FrameLayout {
    public static final /* synthetic */ int LLJIJIL = 0;
    public EditText LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public final InputMethodManager LLILZIL;
    public InterfaceC21359018iK LLILZLL;
    public final String LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public Function0<Integer> LLJI;

    public void LJ(int i) {
    }

    public int getLayout() {
        return R.layout.d7u;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public final void LIZ() {
        InputMethodManager inputMethodManager;
        EditText editText = this.LL;
        if (editText == null || (inputMethodManager = this.LLILZIL) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void LIZLLL() {
        EditText editText = this.LL;
        if (editText != null) {
            editText.requestFocus();
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public String getText() {
        EditText editText = this.LL;
        if (editText == null || C2204961BRm.LLJILJILJ(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVx4PdVwanvVPp9ICZFM+3Ame8ghEgpPG", null)) == null) {
            return null;
        }
        return C2204961BRm.LLJILJILJ(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVx4PdVwanvVPp9ICZFM+3Ame8ghEgpPG", null)).toString();
    }

    public void LIZJ() {
        LIZ();
    }

    public void LIZIZ(C19GS c19gs) {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLILLL = C786410Ut5.Sd(getLayout(), C786410Ut5.ne(c19gs), this);
        this.LL = (EditText) findViewById(R.id.gut);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.LL.addTextChangedListener(textWatcher);
        }
        View viewFindViewById = findViewById(R.id.wpw);
        this.LLILLJJLI = viewFindViewById;
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 101), viewFindViewById);
        this.LLILZ = findViewById(R.id.y1z);
        View.OnClickListener aCListenerS166S0100000_32 = new ACListenerS166S0100000_32(this, 102);
        if (C1848410yCV.LIZ) {
            aCListenerS166S0100000_32 = new f(aCListenerS166S0100000_32);
        }
        a aVar = new a(aCListenerS166S0100000_32);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public void setEffectTextChangeListener(InterfaceC21359018iK interfaceC21359018iK) {
        this.LLILZLL = interfaceC21359018iK;
    }

    public void setHintText(String str) {
        if (this.LL != null && !TextUtils.isEmpty(str)) {
            this.LL.setHint(str);
        }
    }

    public void setMaxTextCount(int i) {
        this.LLIZLLLIL = i;
    }

    public void setText(String str) {
        EditText editText = this.LL;
        if (editText != null && str != null) {
            editText.setText(str);
            int length = str.length();
            if (length <= C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVx4PdVwanvVPp9ICZFM+3Ame8ghEgpPG", null)).length()) {
                this.LL.setSelection(length);
            }
        }
    }

    public void setTopMarginSupplier(Function0<Integer> function0) {
        this.LLJI = function0;
    }

    public C21359318iN(C19GS c19gs, AttributeSet attributeSet) {
        super(c19gs, attributeSet);
        this.LLIZLLLIL = -1;
        LIZIZ(c19gs);
        this.LLILZIL = (InputMethodManager) C786410Ut5.H2(c19gs, "input_method");
        this.LLIZ = c19gs.getResources().getString(2131845840);
    }
}
