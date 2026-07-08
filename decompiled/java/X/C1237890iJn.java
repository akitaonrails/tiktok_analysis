package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0iJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237890iJn extends C1237690iJT {
    public C1237890iJn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1748440vbG inputBox = getInputBox();
        inputBox.LJIILLIIL(true);
        inputBox.LJIILIIL(128, true);
        inputBox.LJIIZILJ(false);
        inputBox.LJIILLIIL(true);
        if (C426750GoL.LIZLLL(context)) {
            getInputBox().LLJLILLLLZIIL.setGravity(8388613);
            getInputBox().setEditTextTextAlignment(5);
        }
    }
}
