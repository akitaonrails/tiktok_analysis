package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0htp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221790htp implements InterfaceC0148002o {
    public final EnumC1221770htn LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final Integer LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1221790htp)) {
            return false;
        }
        C1221790htp c1221790htp = (C1221790htp) obj;
        return this.LL == c1221790htp.LL && this.LLILLJJLI == c1221790htp.LLILLJJLI && this.LLILLL == c1221790htp.LLILLL && Intrinsics.LJFF(this.LLILZ, c1221790htp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1221790htp.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILZIL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcProgressPageState(avatarStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", percentage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorShowMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", waitingTime=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1221790htp(EnumC1221770htn enumC1221770htn) {
        this(enumC1221770htn, 0, 0, null, null);
    }

    public C1221790htp(EnumC1221770htn enumC1221770htn, int i, int i2, String str, Integer num) {
        this.LL = enumC1221770htn;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = num;
    }
}
