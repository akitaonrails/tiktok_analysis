package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915880ZwQ implements InterfaceC918290a0J {
    public final EnumC918870a1F LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C915880ZwQ() {
        this(null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C915880ZwQ)) {
            return false;
        }
        C915880ZwQ c915880ZwQ = (C915880ZwQ) obj;
        return this.LIZ == c915880ZwQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c915880ZwQ.LIZIZ) && this.LIZJ == c915880ZwQ.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedBatchInvite(entryType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", batchInviteSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromJsbCall=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC918290a0J
    public final EnumC918870a1F LIZIZ() {
        return this.LIZ;
    }

    public C915880ZwQ(String str, boolean z, int i) {
        EnumC918870a1F enumC918870a1F;
        if ((i & 1) != 0) {
            enumC918870a1F = EnumC918870a1F.BATCH_INVITE;
        } else {
            enumC918870a1F = null;
        }
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = enumC918870a1F;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
