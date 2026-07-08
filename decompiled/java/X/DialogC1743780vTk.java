package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: renamed from: X.0vTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class DialogC1743780vTk extends DialogC1743790vTl {
    @Override // X.DialogC1743790vTl, X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(48);
        }
    }

    public DialogC1743780vTk(Context context, int i) {
        super(context, i);
    }
}
