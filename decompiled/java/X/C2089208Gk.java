package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.08Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089208Gk extends IOException {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2089208Gk(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No space left on device ; ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
