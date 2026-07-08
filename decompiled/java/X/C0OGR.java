package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OGR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGR implements InterfaceC111300bX, Serializable {
    public static final int $stable = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final C0OGR copy(String str, String str2, String str3, String str4, String str5) {
        return new C0OGR(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OGR)) {
            return false;
        }
        C0OGR c0ogr = (C0OGR) obj;
        return Intrinsics.LJFF(this.LL, c0ogr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ogr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0ogr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0ogr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0ogr.LLILZIL);
    }

    public int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoRecordMobParams(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", takoChatId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OGR() {
        this("", "", "", "", "");
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final String getEnterMethod() {
        return this.LLILLJJLI;
    }

    public final String getProcessId() {
        return this.LLILLL;
    }

    public final String getTakoChatId() {
        return this.LLILZIL;
    }

    public final String getTakoSessionId() {
        return this.LLILZ;
    }

    public C0OGR(String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }
}
