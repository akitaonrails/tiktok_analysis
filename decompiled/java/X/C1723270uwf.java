package X;

import com.ss.android.ugc.aweme.pipo.auth.PipoAuthResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723270uwf implements InterfaceC0148002o {
    public final EnumC1723290uwh LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final PipoAuthResponse LLILZ;

    public C1723270uwf() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1723270uwf)) {
            return false;
        }
        C1723270uwf c1723270uwf = (C1723270uwf) obj;
        return this.LL == c1723270uwf.LL && Intrinsics.LJFF(this.LLILLJJLI, c1723270uwf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1723270uwf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1723270uwf.LLILZ);
    }

    public final int hashCode() {
        EnumC1723290uwh enumC1723290uwh = this.LL;
        int iHashCode = (enumC1723290uwh == null ? 0 : enumC1723290uwh.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PipoAuthResponse pipoAuthResponse = this.LLILZ;
        return iHashCode3 + (pipoAuthResponse != null ? pipoAuthResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoAuthState(authStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", authResult=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1723270uwf(EnumC1723290uwh enumC1723290uwh, String str, String str2, PipoAuthResponse pipoAuthResponse) {
        this.LL = enumC1723290uwh;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = pipoAuthResponse;
    }

    public static C1723270uwf LIZ(C1723270uwf c1723270uwf, EnumC1723290uwh enumC1723290uwh, String str, String str2, int i) {
        PipoAuthResponse pipoAuthResponse;
        if ((i & 1) != 0) {
            enumC1723290uwh = c1723270uwf.LL;
        }
        if ((i & 2) != 0) {
            str = c1723270uwf.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str2 = c1723270uwf.LLILLL;
        }
        if ((i & 8) != 0) {
            pipoAuthResponse = c1723270uwf.LLILZ;
        } else {
            pipoAuthResponse = null;
        }
        c1723270uwf.getClass();
        return new C1723270uwf(enumC1723290uwh, str, str2, pipoAuthResponse);
    }
}
