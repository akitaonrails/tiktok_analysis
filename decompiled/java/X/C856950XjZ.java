package X;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: X.0XjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C856950XjZ implements TextWatcher {
    public final String LL;

    public C856950XjZ(String str) {
        this.LL = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> afterTextChanged: current text = ");
        Object obj = editable;
        if (editable == null) {
            obj = "";
        }
        sbLIZ.append(obj);
        C201955140j.LIZIZ("CaptionTextWatcher", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> beforeTextChanged: current text = ");
        if (charSequence == null) {
            charSequence = "";
        }
        sbLIZ.append((Object) charSequence);
        sbLIZ.append(", start = ");
        sbLIZ.append(i);
        sbLIZ.append(", count = ");
        sbLIZ.append(i2);
        sbLIZ.append(", after = ");
        sbLIZ.append(i3);
        C201955140j.LIZIZ("CaptionTextWatcher", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> onTextChanged: current text = ");
        if (charSequence == null) {
            charSequence = "";
        }
        sbLIZ.append((Object) charSequence);
        sbLIZ.append(", start = ");
        sbLIZ.append(i);
        sbLIZ.append(", before = ");
        sbLIZ.append(i2);
        sbLIZ.append(", count = ");
        sbLIZ.append(i3);
        C201955140j.LIZIZ("CaptionTextWatcher", C2188811AlT.LIZIZ(sbLIZ));
    }
}
