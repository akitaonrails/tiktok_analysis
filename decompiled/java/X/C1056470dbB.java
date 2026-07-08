package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056470dbB extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC1070410dxf LIZLLL;
    public final boolean LJ;
    public final EnumC1056390db3 LJFF;
    public final String LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056470dbB)) {
            return false;
        }
        C1056470dbB c1056470dbB = (C1056470dbB) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1056470dbB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1056470dbB.LIZJ) && this.LIZLLL == c1056470dbB.LIZLLL && this.LJ == c1056470dbB.LJ && this.LJFF == c1056470dbB.LJFF && Intrinsics.LJFF(this.LJI, c1056470dbB.LJI);
    }

    public final int hashCode() {
        String str = this.LIZIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        EnumC1070410dxf enumC1070410dxf = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (enumC1070410dxf == null ? 0 : enumC1070410dxf.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        EnumC1056390db3 enumC1056390db3 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (enumC1056390db3 == null ? 0 : enumC1056390db3.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReasonMonitorTracker(recType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showSuccess=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJIIIIZZ;
    }

    public static C1056470dbB LJ(C1056470dbB c1056470dbB, EnumC1070410dxf enumC1070410dxf, boolean z, EnumC1056390db3 enumC1056390db3, int i) {
        String str;
        String str2;
        EnumC1056390db3 enumC1056390db32 = enumC1056390db3;
        boolean z2 = z;
        EnumC1070410dxf enumC1070410dxf2 = enumC1070410dxf;
        String str3 = null;
        if ((i & 1) != 0) {
            str = c1056470dbB.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c1056470dbB.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            enumC1070410dxf2 = c1056470dbB.LIZLLL;
        }
        if ((i & 8) != 0) {
            z2 = c1056470dbB.LJ;
        }
        if ((i & 16) != 0) {
            enumC1056390db32 = c1056470dbB.LJFF;
        }
        if ((i & 32) != 0) {
            str3 = c1056470dbB.LJI;
        }
        return new C1056470dbB(str, str2, enumC1070410dxf2, z2, enumC1056390db32, str3);
    }

    public C1056470dbB(String str, String str2, EnumC1070410dxf enumC1070410dxf, boolean z, EnumC1056390db3 enumC1056390db3, String str3) {
        String lowerCase;
        String strName;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = enumC1070410dxf;
        this.LJ = z;
        this.LJFF = enumC1056390db3;
        this.LJI = str3;
        this.LJII = "external_reason_monitor";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("rec_type", str);
        c2344009Gk.LJIIIIZZ("type", str2);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, AbstractC1223210hw7.LIZJ(z));
        if (enumC1070410dxf != null && (strName = enumC1070410dxf.name()) != null) {
            lowerCase = strName.toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = null;
        }
        c2344009Gk.LJIIIIZZ("platform", lowerCase);
        c2344009Gk.LJ(enumC1056390db3 != null ? Integer.valueOf(enumC1056390db3.getValue()) : null, "reason");
        if (str3 != null) {
            c2344009Gk.LJFF("position", str3);
        }
        this.LJIIIIZZ = c2344009Gk.LIZ;
    }

    public /* synthetic */ C1056470dbB(String str, String str2, EnumC1070410dxf enumC1070410dxf, boolean z, EnumC1056390db3 enumC1056390db3, int i) {
        this(str, str2, (i & 4) != 0 ? null : enumC1070410dxf, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : enumC1056390db3, (String) null);
    }
}
