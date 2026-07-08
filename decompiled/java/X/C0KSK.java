package X;

import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KSK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSK<API_RESPONSE_TYPE> implements InterfaceC509200Jy2 {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final int LJ = 0;
    public final String LJFF;
    public final long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final C0KSU<API_RESPONSE_TYPE> LJIIJ;
    public final String LJIIJJI;
    public boolean LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KSK)) {
            return false;
        }
        C0KSK c0ksk = (C0KSK) obj;
        return this.LIZ == c0ksk.LIZ && this.LIZIZ == c0ksk.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ksk.LIZJ) && this.LIZLLL == c0ksk.LIZLLL && this.LJ == c0ksk.LJ && Intrinsics.LJFF(this.LJFF, c0ksk.LJFF) && this.LJI == c0ksk.LJI && Intrinsics.LJFF(this.LJII, c0ksk.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ksk.LJIIIIZZ) && this.LJIIIZ == c0ksk.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0ksk.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "FansProductFetchParam(audienceUid=" + this.LIZ + ", anchorUid=" + this.LIZIZ + ", secAnchorId=" + this.LIZJ + ", roomId=" + this.LIZLLL + ", requestScene=" + this.LJ + ", trackSource=" + this.LJFF + ", panelExpGroup=" + this.LJI + ", pcsMonitorSourcePage=" + this.LJII + ", pcsMonitorEnterFrom=" + this.LJIIIIZZ + ", privilegeQueryScene=" + this.LJIIIZ + ", fetchCallback=" + this.LJIIJ + ')';
    }

    public C0KSK(long j, long j2, String str, long j3, String str2, long j4, String str3, String str4, int i, C0KSU c0ksu) {
        String strLIZ;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = j3;
        this.LJFF = str2;
        this.LJI = j4;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = i;
        this.LJIIJ = c0ksu;
        ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
        if (iSubscribeService != null && iSubscribeService.Ae() != null) {
            strLIZ = C516700KOe.LIZ();
        } else {
            strLIZ = "";
        }
        this.LJIIJJI = strLIZ;
        this.LJIIL = true;
    }
}
