package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.08pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2239008pw {
    public static final CancellationException LIZ(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
