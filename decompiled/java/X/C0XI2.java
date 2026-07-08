package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0XI2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XI2 extends IOException {
    public static final long serialVersionUID = -5596590843227115865L;

    public C0XI2() {
    }

    public C0XI2(Throwable th) {
        initCause(th);
    }

    public C0XI2(String str) {
        super(str);
    }

    public C0XI2(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
