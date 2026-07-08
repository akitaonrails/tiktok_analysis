package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2265908uH extends AbstractC1921407fo {
    public final String LIZ;
    public final long LIZIZ = 0;
    public final long LIZJ;

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C2265908uH)) {
            return false;
        }
        C2265908uH c2265908uH = (C2265908uH) abstractC1921407fo;
        if (Intrinsics.LJFF(this.LIZ, c2265908uH.LIZ) && this.LIZIZ == c2265908uH.LIZIZ) {
            return true;
        }
        return false;
    }

    public C2265908uH(String str, long j) {
        this.LIZ = str;
        this.LIZJ = j;
    }
}
