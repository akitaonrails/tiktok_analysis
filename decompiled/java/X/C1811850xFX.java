package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0xFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811850xFX extends IOException {
    public final int LL;
    public final String LLILLJJLI;
    public int statusCode;

    public int getCronetError() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public C1811850xFX(int i, int i2, String str) {
        this.statusCode = i;
        this.LL = i2;
        this.LLILLJJLI = str;
    }

    public C1811850xFX(int i, int i2, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i;
        this.LL = i2;
        this.LLILLJJLI = str;
    }
}
