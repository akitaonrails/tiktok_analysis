package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.11vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19655911vJ extends C0I7D {
    public InterfaceC19655811vI LLIZ;

    public final InterfaceC19655811vI getCallback() {
        return this.LLIZ;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC19655811vI interfaceC19655811vI;
        if (i == 16908322 && (interfaceC19655811vI = this.LLIZ) != null) {
            interfaceC19655811vI.LIZ();
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setCallback(InterfaceC19655811vI interfaceC19655811vI) {
        this.LLIZ = interfaceC19655811vI;
    }

    public C19655911vJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        InterfaceC19655811vI interfaceC19655811vI = this.LLIZ;
        if (interfaceC19655811vI != null) {
            interfaceC19655811vI.LJLILLLLZI(charSequence);
        }
    }
}
