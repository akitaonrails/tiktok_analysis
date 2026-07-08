package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y3A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3A extends C0Y7K {
    public final EnumC868890Y6t LJ;
    public final String LJFF;
    public final Integer LJI;
    public final Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y3A)) {
            return false;
        }
        C0Y3A c0y3a = (C0Y3A) obj;
        return this.LJ == c0y3a.LJ && Intrinsics.LJFF(this.LJFF, c0y3a.LJFF) && Intrinsics.LJFF(this.LJI, c0y3a.LJI) && Intrinsics.LJFF(this.LJII, c0y3a.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LJ.hashCode() * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJII;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", subMessageType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Y7K
    public final Integer LIZ() {
        return this.LJII;
    }

    public static C0Y3A LIZIZ(C0Y3A c0y3a, Integer num) {
        EnumC868890Y6t enumC868890Y6t = c0y3a.LJ;
        String str = c0y3a.LJFF;
        Integer num2 = c0y3a.LJI;
        c0y3a.getClass();
        return new C0Y3A(enumC868890Y6t, str, num2, num);
    }

    public /* synthetic */ C0Y3A(EnumC868890Y6t enumC868890Y6t, String str, Integer num, int i) {
        this(enumC868890Y6t, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (Integer) null);
    }

    public C0Y3A(EnumC868890Y6t enumC868890Y6t, String str, Integer num, Integer num2) {
        super(num, num2, str, 1);
        this.LJ = enumC868890Y6t;
        this.LJFF = str;
        this.LJI = num;
        this.LJII = num2;
    }
}
