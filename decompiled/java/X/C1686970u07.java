package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686970u07 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C1692220u8a LIZ;
    public final long LIZIZ;
    public final C1692280u8g LIZJ;

    static {
        new C1687100u0K(new C1687080u0I(), new C1687090u0J());
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        long j = this.LIZIZ;
        int i = C1692280u8g.LIZJ;
        int iY2 = (iHashCode + C786410Ut5.Y2(j)) * 31;
        C1692280u8g c1692280u8g = this.LIZJ;
        return iY2 + (c1692280u8g != null ? C786410Ut5.Y2(c1692280u8g.LIZ) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextFieldValue(text='");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append("', selection=");
        sbLIZ.append((Object) C1692280u8g.LJIIIIZZ(this.LIZIZ));
        sbLIZ.append(", composition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686970u07)) {
            return false;
        }
        C1686970u07 c1686970u07 = (C1686970u07) obj;
        if (C1692280u8g.LIZIZ(this.LIZIZ, c1686970u07.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1686970u07.LIZJ) && Intrinsics.LJFF(this.LIZ, c1686970u07.LIZ)) {
            return true;
        }
        return false;
    }

    public C1686970u07(C1692220u8a c1692220u8a, long j, C1692280u8g c1692280u8g) {
        C1692280u8g c1692280u8g2;
        this.LIZ = c1692220u8a;
        this.LIZIZ = C1680680tpy.LIZIZ(c1692220u8a.LLILLJJLI.length(), j);
        if (c1692280u8g != null) {
            c1692280u8g2 = new C1692280u8g(C1680680tpy.LIZIZ(c1692220u8a.LLILLJJLI.length(), c1692280u8g.LIZ));
        } else {
            c1692280u8g2 = null;
        }
        this.LIZJ = c1692280u8g2;
    }

    public C1686970u07(String str, long j, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C1692280u8g.LIZIZ : j, (C1692280u8g) null);
    }

    public C1686970u07(String str, long j, C1692280u8g c1692280u8g) {
        this(new C1692220u8a(str), j, c1692280u8g);
    }

    public static C1686970u07 LIZ(C1686970u07 c1686970u07, String str, long j, int i) {
        C1692280u8g c1692280u8g;
        if ((i & 2) != 0) {
            j = c1686970u07.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1692280u8g = c1686970u07.LIZJ;
        } else {
            c1692280u8g = null;
        }
        c1686970u07.getClass();
        return new C1686970u07(new C1692220u8a(str), j, c1692280u8g);
    }

    public static C1686970u07 LIZIZ(C1686970u07 c1686970u07, C1692220u8a c1692220u8a, long j, int i) {
        C1692280u8g c1692280u8g;
        if ((i & 1) != 0) {
            c1692220u8a = c1686970u07.LIZ;
        }
        if ((i & 2) != 0) {
            j = c1686970u07.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1692280u8g = c1686970u07.LIZJ;
        } else {
            c1692280u8g = null;
        }
        c1686970u07.getClass();
        return new C1686970u07(c1692220u8a, j, c1692280u8g);
    }
}
