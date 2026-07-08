package X;

import android.content.Context;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360570lVf extends C0I7D {
    public KeyListener LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public final boolean getCanToast() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnEditCallback() {
        return this.LLIZLLLIL;
    }

    public final KeyListener getOriginalKeyListener() {
        return this.LLIZ;
    }

    public static int LJIIIIZZ(String str) {
        int i = 0;
        if (str.length() == 0) {
            return 0;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(str);
        int iFirst = characterInstance.first();
        while (iFirst != -1 && (iFirst = characterInstance.next()) != -1) {
            i++;
        }
        return i;
    }

    public final void LJIIIZ(String str) {
        if (this.LLJ && !this.LLJI) {
            this.LLJ = false;
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions = 6;
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0lVg
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    KeyboardUtils.LIZIZ(this.LL);
                    return true;
                }
                return false;
            }
        });
        return inputConnectionOnCreateInputConnection;
    }

    public final void setCanToast(boolean z) {
        this.LLJ = z;
    }

    public final void setOnEditCallback(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOriginalKeyListener(KeyListener keyListener) {
        this.LLIZ = keyListener;
    }

    public C1360570lVf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLJ = true;
        setTextAlignment(5);
        setIncludeFontPadding(false);
        setElegantTextHeight(false);
        setBackgroundColor(0);
        if (Build.VERSION.SDK_INT >= 35) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.LLIZ = getKeyListener();
        addTextChangedListener(new C1402120mag(this, 12));
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.LLJI = true;
        try {
            super.setText(charSequence, bufferType);
            this.LLJI = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJI = false;
            throw th;
        }
    }
}
