package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.18qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21410318qb extends EditText implements InterfaceC20096913kF, InterfaceC21412618qy {
    public final C21411318ql LL;
    public final w LLILLJJLI;
    public final C20175113wr LLILLL;
    public final C14XY LLILZ;
    public final C21401818pE LLILZIL;
    public C21411018qi LLILZLL;

    public C21410318qb() {
        throw null;
    }

    private C21411018qi getSuperCaller() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new C21411018qi(this);
        }
        return this.LLILZLL;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LLILLJJLI.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LLILLJJLI.LJ();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C20175113wr c20175113wr;
        if (Build.VERSION.SDK_INT >= 28 || (c20175113wr = this.LLILLL) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c20175113wr.LIZIZ;
        return textClassifier == null ? C20175013wq.LIZ(c20175113wr.LIZ) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C21382118m3.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) C786410Ut5.H2(getContext(), "input_method")).isActive(this);
    }

    @Override // X.InterfaceC20096913kF
    public final C20098713kX LJFF(C20098713kX c20098713kX) {
        return this.LLILZ.LIZ(this, c20098713kX);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrLJIIIZ;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.LLILLJJLI.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            C1695010uD5.LIZIZ(editorInfo, getText());
        }
        C21412318qv.LIZ(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrLJIIIZ = q0.LJIIIZ(this)) != null) {
            C1695010uD5.LIZ(editorInfo, strArrLJIIIZ);
            inputConnectionOnCreateInputConnection = C0I79.LIZ(inputConnectionOnCreateInputConnection, editorInfo, new C0I77() { // from class: X.0I7B
                @Override // X.C0I77
                public final boolean LIZ(C0I70 c0i70, int i2, Bundle bundle) {
                    View view = this;
                    if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
                        try {
                            c0i70.LIZ.LIZLLL();
                            Parcelable parcelable = (Parcelable) c0i70.LIZ.LIZ();
                            if (bundle == null) {
                                bundle = new Bundle();
                            } else {
                                bundle = new Bundle(bundle);
                            }
                            C786410Ut5.LJJIJL(bundle, "androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return false;
                        }
                    }
                    C462560IBy c462560IBy = new C462560IBy(new ClipData(c0i70.LIZ.getDescription(), new ClipData.Item(c0i70.LIZ.LIZIZ())), 2);
                    c462560IBy.LIZ.LIZ(c0i70.LIZ.LIZJ());
                    c462560IBy.LIZ.setExtras(bundle);
                    if (q0.LJIILIIL(view, c462560IBy.LIZ.build()) == null) {
                        return true;
                    }
                    return false;
                }
            });
        }
        return this.LLILZIL.LIZJ(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && q0.LJIIIZ(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null && dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && C0I7L.LIZ(dragEvent, this, activity)) {
                        return true;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || q0.LJIIIZ(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) C786410Ut5.H2(getContext(), "clipboard");
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            C462560IBy c462560IBy = new C462560IBy(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            c462560IBy.LIZ.LIZIZ(i2);
            q0.LJIILIIL(this, c462560IBy.LIZ.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C21382118m3.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.LLILZIL.LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.LLILZIL.LIZ(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.LLILLJJLI.LJIIJ(colorStateList);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.LLILLJJLI.LJIIJJI(mode);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C20175113wr c20175113wr;
        if (Build.VERSION.SDK_INT < 28 && (c20175113wr = this.LLILLL) != null) {
            c20175113wr.LIZIZ = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public C21410318qb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bq6);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LJI(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21410318qb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        C786410Ut5.t3(getContext());
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LL = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        w wVar = new w(this);
        this.LLILLJJLI = wVar;
        this.LLILLJJLI.LJFF(attributeSet, i);
        wVar.LIZIZ();
        this.LLILLL = new C20175113wr(this);
        this.LLILZ = new C14XY();
        C21401818pE c21401818pE = new C21401818pE(this);
        this.LLILZIL = c21401818pE;
        c21401818pE.LIZIZ(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerLIZ = c21401818pE.LIZ(keyListener);
            if (keyListenerLIZ != keyListener) {
                super.setKeyListener(keyListenerLIZ);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }
}
