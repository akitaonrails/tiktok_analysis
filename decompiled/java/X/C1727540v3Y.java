package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.SMBFormDisclaimer;

/* JADX INFO: renamed from: X.0v3Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727540v3Y implements InterfaceC1891350zJl {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final SMBFormDisclaimer LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1727540v3Y)) {
            return false;
        }
        C1727540v3Y c1727540v3Y = (C1727540v3Y) obj;
        return this.LL == c1727540v3Y.LL && Intrinsics.LJFF(this.LLILLJJLI, c1727540v3Y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1727540v3Y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1727540v3Y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1727540v3Y.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        SMBFormDisclaimer sMBFormDisclaimer = this.LLILZIL;
        return iZ2 + (sMBFormDisclaimer == null ? 0 : sMBFormDisclaimer.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsFormPrivacyPolicyItem(isBa=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", companyName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ppCompanyLink=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", ppTiktokLink=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", disclaimer=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (!(interfaceC1891350zJl instanceof C1727540v3Y)) {
            return false;
        }
        C1727540v3Y c1727540v3Y = (C1727540v3Y) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1727540v3Y.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1727540v3Y.LLILLL) || !Intrinsics.LJFF(this.LLILZ, c1727540v3Y.LLILZ)) {
            return false;
        }
        SMBFormDisclaimer sMBFormDisclaimer = this.LLILZIL;
        String str2 = null;
        if (sMBFormDisclaimer != null) {
            str = sMBFormDisclaimer.text;
        } else {
            str = null;
        }
        SMBFormDisclaimer sMBFormDisclaimer2 = c1727540v3Y.LLILZIL;
        if (sMBFormDisclaimer2 != null) {
            str2 = sMBFormDisclaimer2.text;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1727540v3Y;
    }

    public C1727540v3Y(boolean z, String str, String str2, String str3, SMBFormDisclaimer sMBFormDisclaimer) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = sMBFormDisclaimer;
    }
}
