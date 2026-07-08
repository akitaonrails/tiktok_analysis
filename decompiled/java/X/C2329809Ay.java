package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.09Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2329809Ay extends IOException {
    public static final long serialVersionUID = 1;

    public C2329809Ay(Throwable th) {
        initCause(th);
    }

    public C2329809Ay(String str) {
        super(str);
    }

    public C2329809Ay(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
