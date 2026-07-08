package X;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: X.0oGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466740oGu implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C1466740oGu c1466740oGu, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1466740oGu c1466740oGu, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1466740oGu c1466740oGu, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1466740oGu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1466740oGu c1466740oGu, Editable editable) {
        ((C1427290nFH) c1466740oGu.l0).LLLLIL().LIZLLL.invoke(String.valueOf(editable));
    }

    public static final void afterTextChanged$1(C1466740oGu c1466740oGu, Editable editable) {
        ((C1427280nFG) c1466740oGu.l0).LLLLIL().LIZLLL.invoke(String.valueOf(editable));
    }

    public static final void onTextChanged$0(C1466740oGu c1466740oGu, CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 > 0 && charSequence != null && charSequence.length() == i3) {
            ((C1427290nFH) c1466740oGu.l0).LLLLIL();
        }
    }
}
