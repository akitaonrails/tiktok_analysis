package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894700Z8a {
    public static final C894700Z8a LJI = new C894700Z8a("", EnumC896490ZEx.NO_STATUS, null, null, 0, 0, 60);
    public final String LIZ;
    public final EnumC896490ZEx LIZIZ;
    public final EnumC894710Z8b LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C894700Z8a)) {
            return false;
        }
        C894700Z8a c894700Z8a = (C894700Z8a) obj;
        return Intrinsics.LJFF(this.LIZ, c894700Z8a.LIZ) && this.LIZIZ == c894700Z8a.LIZIZ && this.LIZJ == c894700Z8a.LIZJ && Intrinsics.LJFF(this.LIZLLL, c894700Z8a.LIZLLL) && this.LJ == c894700Z8a.LJ && this.LJFF == c894700Z8a.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusTextWithType(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventTypeEnum=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", activityLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", minimumMinute=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", groupActiveMemberCnt=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C894700Z8a(String str, EnumC896490ZEx enumC896490ZEx, EnumC894710Z8b enumC894710Z8b, String str2, int i, int i2, int i3) {
        enumC894710Z8b = (i3 & 4) != 0 ? EnumC894710Z8b.DEFAULT : enumC894710Z8b;
        str2 = (i3 & 8) != 0 ? "" : str2;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.LIZ = str;
        this.LIZIZ = enumC896490ZEx;
        this.LIZJ = enumC894710Z8b;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
    }
}
