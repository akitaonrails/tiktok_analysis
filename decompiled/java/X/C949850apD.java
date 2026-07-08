package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: renamed from: X.0apD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949850apD {
    public final long LIZ;
    public final long LIZIZ;
    public final BizInviteParams LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final int LJII;
    public final Map<String, Object> LJIIIIZZ;
    public final EnumC919140a1g LJIIIZ;
    public final List<C918740a12> LJIIJ;

    public C949850apD() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949850apD)) {
            return false;
        }
        C949850apD c949850apD = (C949850apD) obj;
        return this.LIZ == c949850apD.LIZ && this.LIZIZ == c949850apD.LIZIZ && Intrinsics.LJFF(this.LIZJ, c949850apD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c949850apD.LIZLLL) && this.LJ == c949850apD.LJ && this.LJFF == c949850apD.LJFF && this.LJI == c949850apD.LJI && this.LJII == c949850apD.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c949850apD.LJIIIIZZ) && this.LJIIIZ == c949850apD.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c949850apD.LJIIJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        BizInviteParams bizInviteParams = this.LIZJ;
        int iHashCode = (iY2 + (bizInviteParams == null ? 0 : bizInviteParams.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII) * 31;
        Map<String, Object> map = this.LJIIIIZZ;
        return ((((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "InviteParam(roomId=" + this.LIZ + ", userId=" + this.LIZIZ + ", bizInviteParams=" + this.LIZJ + ", layoutId=" + this.LIZLLL + ", strategy=" + this.LJ + ", position=" + this.LJFF + ", expireTimeInSeconds=" + this.LJI + ", source=" + this.LJII + ", custom=" + this.LJIIIIZZ + ", inviteType=" + this.LJIIIZ + ", inviteeList=" + this.LJIIJ + ')';
    }

    public C949850apD(long j, long j2, BizInviteParams bizInviteParams, String str, int i, long j3, int i2, EnumC919140a1g enumC919140a1g, List list, int i3) {
        int i4 = i2;
        EnumC919140a1g enumC919140a1g2 = enumC919140a1g;
        List arrayList = list;
        bizInviteParams = (i3 & 4) != 0 ? null : bizInviteParams;
        str = (i3 & 8) != 0 ? null : str;
        i = (i3 & 32) != 0 ? 0 : i;
        j3 = (i3 & 64) != 0 ? 0L : j3;
        i4 = (i3 & 128) != 0 ? 0 : i4;
        enumC919140a1g2 = (i3 & 512) != 0 ? EnumC919140a1g.LegacyInvitee : enumC919140a1g2;
        arrayList = (i3 & 1024) != 0 ? new ArrayList() : arrayList;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = bizInviteParams;
        this.LIZLLL = str;
        this.LJ = 0;
        this.LJFF = i;
        this.LJI = j3;
        this.LJII = i4;
        this.LJIIIIZZ = null;
        this.LJIIIZ = enumC919140a1g2;
        this.LJIIJ = arrayList;
    }
}
