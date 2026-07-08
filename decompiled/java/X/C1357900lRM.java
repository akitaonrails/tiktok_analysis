package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357900lRM implements InterfaceC0148002o {
    public final C1357810lRD LL;
    public final C1357870lRJ LLILLJJLI;
    public final C1359520lTy LLILLL;
    public final C1357860lRI LLILZ;

    public C1357900lRM() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357900lRM)) {
            return false;
        }
        C1357900lRM c1357900lRM = (C1357900lRM) obj;
        return Intrinsics.LJFF(this.LL, c1357900lRM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1357900lRM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1357900lRM.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1357900lRM.LLILZ);
    }

    public final int hashCode() {
        C1357810lRD c1357810lRD = this.LL;
        int iHashCode = (c1357810lRD == null ? 0 : c1357810lRD.hashCode()) * 31;
        C1357870lRJ c1357870lRJ = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1357870lRJ == null ? 0 : c1357870lRJ.hashCode())) * 31;
        C1359520lTy c1359520lTy = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1359520lTy == null ? 0 : c1359520lTy.hashCode())) * 31;
        C1357860lRI c1357860lRI = this.LLILZ;
        return iHashCode3 + (c1357860lRI != null ? c1357860lRI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostSyncState(publishEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", deleteEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", likeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", replyCountEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1357900lRM(C1357810lRD c1357810lRD, C1357870lRJ c1357870lRJ, C1359520lTy c1359520lTy, C1357860lRI c1357860lRI) {
        this.LL = c1357810lRD;
        this.LLILLJJLI = c1357870lRJ;
        this.LLILLL = c1359520lTy;
        this.LLILZ = c1357860lRI;
    }

    public static C1357900lRM LIZ(C1357900lRM c1357900lRM, C1357810lRD c1357810lRD, C1357870lRJ c1357870lRJ, C1359520lTy c1359520lTy, C1357860lRI c1357860lRI, int i) {
        if ((i & 1) != 0) {
            c1357810lRD = c1357900lRM.LL;
        }
        if ((i & 2) != 0) {
            c1357870lRJ = c1357900lRM.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1359520lTy = c1357900lRM.LLILLL;
        }
        if ((i & 8) != 0) {
            c1357860lRI = c1357900lRM.LLILZ;
        }
        c1357900lRM.getClass();
        return new C1357900lRM(c1357810lRD, c1357870lRJ, c1359520lTy, c1357860lRI);
    }
}
