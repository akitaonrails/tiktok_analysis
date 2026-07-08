package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20237414Gm implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20237414Gm)) {
            return false;
        }
        C20237414Gm c20237414Gm = (C20237414Gm) obj;
        return Intrinsics.LJFF(this.LL, c20237414Gm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20237414Gm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20237414Gm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20237414Gm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c20237414Gm.LLILZIL) && this.LLILZLL == c20237414Gm.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterBotCenterData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", takoChatId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", fromSheet=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20237414Gm(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = z;
    }
}
