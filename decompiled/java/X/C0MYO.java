package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0MYO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MYO extends IOException {
    public C0MYO(String str) {
        super(str);
    }

    public C0MYO(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
