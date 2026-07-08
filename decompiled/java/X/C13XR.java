package X;

import android.credentials.ClearCredentialStateException;
import android.os.OutcomeReceiver;

/* JADX INFO: renamed from: X.13XR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13XR implements OutcomeReceiver<Void, C13XS> {
    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        C13XS c13xs = (C13XS) th;
        new ClearCredentialStateException(c13xs.getType(), c13xs.getMessage());
        throw null;
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Void r2) {
        throw null;
    }
}
