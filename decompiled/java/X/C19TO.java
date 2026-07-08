package X;

import android.widget.EditText;

/* JADX INFO: renamed from: X.19TO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TO implements C19TE {
    public final /* synthetic */ C19TK LIZ;

    public C19TO(C19TK c19tk) {
        this.LIZ = c19tk;
    }

    @Override // X.C19TE
    public final void LIZ(C21543419Su c21543419Su) {
        EditText editText = c21543419Su.getEditText();
        c21543419Su.setEndIconVisible(true);
        c21543419Su.setEndIconCheckable(true);
        this.LIZ.LIZJ.setChecked(!r0.LIZLLL());
        editText.removeTextChangedListener(this.LIZ.LIZLLL);
        editText.addTextChangedListener(this.LIZ.LIZLLL);
    }
}
