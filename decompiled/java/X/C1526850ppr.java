package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0ppr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526850ppr extends IOException implements InterfaceC1526740ppg {
    public final int LL;

    @Override // X.InterfaceC1526740ppg
    public String getErrorMsg() {
        return getMessage();
    }

    @Override // X.InterfaceC1526740ppg
    public int getErrorCode() {
        return this.LL;
    }

    public C1526850ppr(int i, String str, Throwable th) {
        super(str, th);
        this.LL = i;
    }
}
