package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0Vul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812930Vul extends IOException {
    public static final long serialVersionUID = -1098012010869697449L;
    public final int LL;
    public final long LLILLJJLI;

    public long getLength() {
        return this.LLILLJJLI;
    }

    public int getMaxSize() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C812930Vul(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download file too large: ");
        sbLIZ.append(j);
        sbLIZ.append(" exceed maxsize: ");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = j;
    }
}
