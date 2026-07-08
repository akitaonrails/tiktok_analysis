package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1167304hT implements InterfaceC1167504hV {
    public final String LIZ;
    public int LIZIZ;
    public final AbstractC1167104hR LIZJ;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1167304hT)) {
            return false;
        }
        return Intrinsics.LJFF(((C1167304hT) obj).LIZ, this.LIZ);
    }

    public C1167304hT(String str, int i, AbstractC1167104hR abstractC1167104hR, int i2) {
        i = (i2 & 2) != 0 ? -1 : i;
        abstractC1167104hR = (i2 & 4) != 0 ? new AbstractC1167104hR() { // from class: X.04hS
        } : abstractC1167104hR;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = abstractC1167104hR;
    }
}
