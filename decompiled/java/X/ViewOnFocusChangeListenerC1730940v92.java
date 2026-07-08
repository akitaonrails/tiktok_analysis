package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0v92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ViewOnFocusChangeListenerC1730940v92 extends FrameLayout implements View.OnFocusChangeListener, TextWatcher {
    public C0I7D LL;
    public TuxIconView LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TextWatcher LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final View getDivideLineFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.xq);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final C0I7D getEtInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xr);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final TuxIconView getIvClearFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xt);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvLimitFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xu);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C0I7D getEditText() {
        return getEtInputFromXml();
    }

    public final void LIZ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, getIvClearFromXml());
            if (this.LLIZ) {
                C12ES.LJIILL(0, getTvLimitFromXml());
            }
            TuxTextView tvLimitFromXml = getTvLimitFromXml();
            StringBuilder sb = new StringBuilder();
            sb.append(C2204961BRm.LLLLJ(getEtInputFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJVHDt7yAflBbyFbBZHjObXkgyiPndyVqefep+IcRhP4Goc=", null)).length());
            sb.append('/');
            sb.append(this.LLILZLL);
            tvLimitFromXml.setText(sb.toString());
            return;
        }
        C0H1U.LIZIZ(getIvClearFromXml());
        C0H1U.LIZIZ(getTvLimitFromXml());
        getTvLimitFromXml().setText("");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        boolean z;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ(z);
        TextWatcher textWatcher = this.LLILZIL;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    public final void setDivideLineFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setEtInputFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setHint(String str) {
        getEtInputFromXml().setHint(str);
    }

    public final void setIvClearFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setMaxLines(int i) {
        getEtInputFromXml().setMaxLines(i);
    }

    public final void setText(String str) {
        getEtInputFromXml().setText(str);
    }

    public final void setTextLimitLength(int i) {
        this.LLILZLL = i;
        InputFilter[] filters = getEtInputFromXml().getFilters();
        C0I7D etInputFromXml = getEtInputFromXml();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.LLILZLL);
        int length = filters.length;
        Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
        objArrCopyOf[length] = lengthFilter;
        etInputFromXml.setFilters((InputFilter[]) objArrCopyOf);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        this.LLILZIL = textWatcher;
    }

    public final void setTvLimitFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public ViewOnFocusChangeListenerC1730940v92(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.bv1, this);
        getEtInputFromXml().setOnFocusChangeListener(this);
        C786410Ut5.I7(new AjS70S0100000_26(this, 80), getIvClearFromXml());
        C1731050v9D.LIZIZ(getEtInputFromXml());
        this.LLILZLL = Integer.MAX_VALUE;
        this.LLIZ = true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = false;
        if (z && C2204961BRm.LLLLJ(getEtInputFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJVHDt7yAflBbyFbBZHjObXkgyiPndyVqefep+IcRhP4Goc=", null)).length() > 0) {
            z2 = true;
        }
        LIZ(z2);
        if (z) {
            getEtInputFromXml().addTextChangedListener(this);
        } else {
            getEtInputFromXml().removeTextChangedListener(this);
        }
    }
}
