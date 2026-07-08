package X;

import Y.ARunnableS134S0100000_34;
import android.os.Message;

/* JADX INFO: renamed from: X.1B5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2199131B5b implements C0T95 {
    public final /* synthetic */ C1B5Z LIZ;

    public C2199131B5b(C1B5Z c1b5z) {
        this.LIZ = c1b5z;
    }

    @Override // X.C0T95
    public final void handleMsg(Message message) {
        if (message.what == 1) {
            C2199681B7e.LJI().execute(new ARunnableS134S0100000_34(this, 61));
        }
    }
}
