package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0MCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564690MCt extends IOException {
    public static final int $stable = 8;
    public final int LL;
    public final String LLILLJJLI;

    public final int getStatusCode() {
        return this.LL;
    }

    public final String getStatusMsg() {
        return this.LLILLJJLI;
    }

    public C564690MCt(int i, String str, String str2, Throwable th) {
        super(str2, th);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
