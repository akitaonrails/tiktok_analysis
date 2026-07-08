package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B3P, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3P implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1B3P() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1B3P)) {
            return false;
        }
        C1B3P c1b3p = (C1B3P) obj;
        return Intrinsics.LJFF(this.LIZ, c1b3p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1b3p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1b3p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1b3p.LIZLLL) && Intrinsics.LJFF(this.LJ, c1b3p.LJ) && Intrinsics.LJFF(this.LJFF, c1b3p.LJFF) && Intrinsics.LJFF(this.LJI, c1b3p.LJI) && Intrinsics.LJFF(this.LJII, c1b3p.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1b3p.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1b3p.LJIIIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.LJI;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJIIIZ;
        return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenPlatformAuthEvent(authCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scopes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ttoclid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", autoAuth=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", netErrorMessage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", netErrorCode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", netErrorStatusCode=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1B3P(String str, String str2, String str3, String str4, Integer num, Integer num2, int i) {
        Integer num3 = num2;
        String str5 = str4;
        String str6 = str3;
        Integer num4 = num;
        String str7 = str2;
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str7, (i & 8) != 0 ? null : str6, null, (i & 32) != 0 ? null : str5, (i & 4) != 0 ? null : num4, (i & 64) != 0 ? null : num3, null, null, null);
    }

    public C1B3P(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = num2;
        this.LJII = str6;
        this.LJIIIIZZ = num3;
        this.LJIIIZ = num4;
    }
}
