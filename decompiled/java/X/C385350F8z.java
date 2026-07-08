package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0F8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385350F8z extends C0I7D {
    public Function0<Unit> LLIZ;

    public final int LJIIIIZZ() {
        String string;
        Editable editableR = C2204961BRm.R(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphScXvBvw9zH56IB2nyV21T+Cyl/QOlEdbhT2siDYXT+XC9Clhz/SHO5mNqCF8oCX0aMw==", null));
        if (editableR == null || (string = editableR.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        }
        Layout layout = getLayout();
        if (layout != null) {
            return ((layout.getLineBottom(0) - layout.getLineTop(0)) * layout.getLineCount()) + getPaddingTop() + getPaddingBottom();
        }
        Integer numValueOf = Integer.valueOf(getMeasuredHeight());
        return numValueOf.intValue() > 0 ? numValueOf.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    public final Function0<Unit> getOnBackPressedPreIme() {
        return this.LLIZ;
    }

    public final void setOnBackPressedPreIme(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public C385350F8z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Function0<Unit> function0;
        if (i == 4 && (function0 = this.LLIZ) != null) {
            if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                function0.invoke();
            }
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
