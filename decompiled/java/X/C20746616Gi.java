package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.16Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20746616Gi extends C21410318qb {
    public final Rect LLIZ;
    public boolean LLIZLLLIL;

    private CharSequence getHintFromLayout() {
        C21543419Su textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private C21543419Su getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C21543419Su) {
                return (C21543419Su) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        C21543419Su textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.LLJJLIIIJLLLLLLLZ) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21543419Su textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.LLJJLIIIJLLLLLLLZ && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        C21543419Su textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LLIZLLLIL && rect != null) {
            textInputLayout.getFocusedRect(this.LLIZ);
            rect.bottom = this.LLIZ.bottom;
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        C21543419Su textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LLIZLLLIL) {
            this.LLIZ.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.a9w), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.LLIZ, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C20746616Gi(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.bq6, 0), attributeSet, R.attr.bq6);
        this.LLIZ = new Rect();
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.TextInputEditText, R.attr.bq6, R.style.a2n, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayLIZLLL.getBoolean(R$styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayLIZLLL.recycle();
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        C21543419Su textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LLIZLLLIL && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.LLIZ, point);
            rect.bottom = this.LLIZ.bottom;
        }
        return globalVisibleRect;
    }
}
