package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.18rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21414318rF extends C21411218qk {
    public int LLILZIL;
    public C21414718rJ LLILZLL;
    public boolean LLIZ;
    public final ARunnableS129S0100000_29 LLIZLLLIL;

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.LLILZIL <= 0 || super.enoughToFilter();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 960 ? (configuration.screenHeightDp < 720 || configuration.orientation != 2) ? 192 : 256 : i < 600 ? 160 : 192;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // X.C21411218qk, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.LLIZ) {
            removeCallbacks(this.LLIZLLLIL);
            post(this.LLIZLLLIL);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.LLILZLL.hasFocus() && getVisibility() == 0) {
            this.LLIZ = true;
            if (getContext().getResources().getConfiguration().orientation == 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C21414518rH.LIZIZ(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                        return;
                    }
                    return;
                }
                C21414418rG c21414418rG = C21414718rJ.LLJJJJLIIL;
                c21414418rG.getClass();
                C21414418rG.LIZ();
                Method method = c21414418rG.LIZ;
                if (method == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(getContext(), "input_method");
        if (!z) {
            this.LLIZ = false;
            removeCallbacks(this.LLIZLLLIL);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.LLIZ = false;
                removeCallbacks(this.LLIZLLLIL);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.LLIZ = true;
        }
    }

    public void setSearchView(C21414718rJ c21414718rJ) {
        this.LLILZLL = c21414718rJ;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.LLILZIL = i;
    }

    public C21414318rF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = new ARunnableS129S0100000_29(this, 2);
        this.LLILZIL = getThreshold();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.LLILZLL.clearFocus();
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C21414718rJ c21414718rJ = this.LLILZLL;
        c21414718rJ.LLJJIJI = c21414718rJ.LLJJIJI;
        throw null;
    }
}
