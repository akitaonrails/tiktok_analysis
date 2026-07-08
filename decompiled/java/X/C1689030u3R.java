package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0u3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689030u3R<T> implements Serializable {
    public static final int $stable = 0;
    public final T data;
    public final long expireTime;
    public final int version;

    public C1689030u3R(long j, int i, T t) {
        this.expireTime = j;
        this.version = i;
        this.data = t;
    }
}
