package X;

import android.content.Context;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class DialogC1743800vTm extends DialogC1743790vTl {
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.DialogC1389100mFg, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.LLJILLL) {
            super.cancel();
        }
    }

    public DialogC1743800vTm(Context context, int i) {
        super(context, i);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 400));
        this.LLJILLL = true;
    }
}
