package X;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19TK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19TK extends C19T9 {
    public final C21544419Te LIZLLL;
    public final C19TO LJ;
    public final C19TV LJFF;

    @Override // X.C19T9
    public final void LIZ() {
        this.LIZ.setEndIconDrawable(C14MI.LIZ(this.LIZIZ, R.drawable.bgj));
        C21543419Su c21543419Su = this.LIZ;
        c21543419Su.setEndIconContentDescription(c21543419Su.getResources().getText(2131839123));
        this.LIZ.setEndIconOnClickListener(new View.OnClickListener() { // from class: X.19TN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText = this.LL.LIZ.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (this.LL.LIZLLL()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C21543419Su c21543419Su2 = this.LL.LIZ;
                c21543419Su2.LJIIJ(c21543419Su2.LLLJIL, c21543419Su2.LLLL);
            }
        });
        C21543419Su c21543419Su2 = this.LIZ;
        C19TO c19to = this.LJ;
        c21543419Su2.LLLILZLLLI.add(c19to);
        if (c21543419Su2.LLILZIL != null) {
            c19to.LIZ(c21543419Su2);
        }
        C21543419Su c21543419Su3 = this.LIZ;
        c21543419Su3.LLLJL.add(this.LJFF);
        EditText editText = this.LIZ.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public final boolean LIZLLL() {
        EditText editText = this.LIZ.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19Te] */
    public C19TK(C21543419Su c21543419Su) {
        super(c21543419Su);
        this.LIZLLL = new C0DL6() { // from class: X.19Te
            @Override // X.C0DL6, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LL.LIZJ.setChecked(!r0.LIZLLL());
            }
        };
        this.LJ = new C19TO(this);
        this.LJFF = new C19TV(this);
    }
}
