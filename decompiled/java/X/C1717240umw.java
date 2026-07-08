package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0umw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717240umw implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717240umw)) {
            return false;
        }
        C1717240umw c1717240umw = (C1717240umw) obj;
        return Intrinsics.LJFF(this.LL, c1717240umw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1717240umw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717240umw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1717240umw.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1717240umw.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1717240umw.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1717240umw.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1717240umw.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        String str2 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Source(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needCallback=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", trulyScene=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bizEntrance=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1717240umw(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        str5 = (i & 16) != 0 ? "default" : str5;
        str6 = (i & 32) != 0 ? "" : str6;
        str7 = (i & 64) != 0 ? null : str7;
        str8 = (i & 128) != 0 ? null : str8;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
    }
}
