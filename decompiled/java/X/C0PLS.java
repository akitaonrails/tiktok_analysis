package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0PLS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLS implements Serializable {
    public static final int $stable = 0;
    public final boolean isEnd;
    public final boolean isStart;

    public C0PLS() {
        this(false, false);
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final boolean isStart() {
        return this.isStart;
    }

    public C0PLS(boolean z, boolean z2) {
        this.isStart = z;
        this.isEnd = z2;
    }
}
