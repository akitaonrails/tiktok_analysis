package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21167117sT implements C0ZHD<C21171417tA> {
    public final C21171417tA LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21167117sT)) {
            return false;
        }
        C21167117sT c21167117sT = (C21167117sT) obj;
        return Intrinsics.LJFF(this.LIZ, c21167117sT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c21167117sT.LIZIZ);
    }

    public final int hashCode() {
        C21171417tA c21171417tA = this.LIZ;
        int iHashCode = (c21171417tA == null ? 0 : c21171417tA.hashCode()) * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiChatDraft(draftContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZHD
    public final C0I3B LIZ() {
        return new C0I3B(C051M.LJ(this.LIZ, false), null, null, this.LIZIZ);
    }

    public C21167117sT(C21171417tA c21171417tA, Long l) {
        this.LIZ = c21171417tA;
        this.LIZIZ = l;
    }
}
