package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iGB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235650iGB implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1631620sYq<String, String, Integer, Unit> LLILZ;
    public final InterfaceC1631630sYr<String, String, Integer, String, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235650iGB)) {
            return false;
        }
        C1235650iGB c1235650iGB = (C1235650iGB) obj;
        return Intrinsics.LJFF(this.LL, c1235650iGB.LL) && this.LLILLJJLI == c1235650iGB.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1235650iGB.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1235650iGB.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1235650iGB.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        InterfaceC1631630sYr<String, String, Integer, String, Unit> interfaceC1631630sYr = this.LLILZIL;
        return iHashCode2 + (interfaceC1631630sYr != null ? interfaceC1631630sYr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnBoardingQueryItem(query=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", wordId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cellShowMob=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1235650iGB(String str, int i, String str2, C1863040ya6 c1863040ya6, C1863080yaA c1863080yaA) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = c1863040ya6;
        this.LLILZIL = c1863080yaA;
    }
}
