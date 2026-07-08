package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01HM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HM implements InterfaceC951240arS<Object> {
    public final ShowListUser LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01HM)) {
            return false;
        }
        C01HM c01hm = (C01HM) obj;
        return Intrinsics.LJFF(this.LIZ, c01hm.LIZ) && this.LIZIZ == c01hm.LIZIZ && this.LIZJ == c01hm.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowUserData(showListUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isOnline=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userVersion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C01HM)) {
            return false;
        }
        C01HM c01hm = (C01HM) obj;
        if (!C01HA.LIZJ(c01hm.LIZ, this.LIZ) || c01hm.LIZIZ != this.LIZIZ || c01hm.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C01HM;
    }

    public C01HM(ShowListUser showListUser, boolean z, int i) {
        this.LIZ = showListUser;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
