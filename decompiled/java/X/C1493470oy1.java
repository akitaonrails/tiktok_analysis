package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0oy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493470oy1 extends IOException {
    public static final long serialVersionUID = -5588326043064908201L;

    public C1493470oy1() {
    }

    public C1493470oy1(Throwable th) {
        initCause(th);
    }

    public C1493470oy1(String str) {
        super(str);
    }

    public C1493470oy1(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
