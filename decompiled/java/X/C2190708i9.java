package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.08i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2190708i9 extends IOException {
    public static final long serialVersionUID = -210264743726619965L;

    public C2190708i9() {
    }

    public C2190708i9(Throwable th) {
        initCause(th);
    }

    public C2190708i9(String str) {
        super(str);
    }

    public C2190708i9(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
