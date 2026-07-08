package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664960tQc {
    public final C1668880tWw LIZ;
    public final int LIZIZ;
    public final InterfaceC1685750ty9 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1664960tQc)) {
            return false;
        }
        C1664960tQc c1664960tQc = (C1664960tQc) obj;
        return Intrinsics.LJFF(this.LIZ, c1664960tQc.LIZ) && this.LIZIZ == c1664960tQc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1664960tQc.LIZJ);
    }

    public C1664960tQc(C1668880tWw c1668880tWw, int i) {
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        this.LIZ = c1668880tWw;
        this.LIZIZ = i;
        this.LIZJ = c1685760tyA;
    }
}
