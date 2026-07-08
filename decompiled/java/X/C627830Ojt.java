package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ojt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627830Ojt implements Serializable, InterfaceC111300bX {
    public static final int $stable = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final EnumC627880Ojy LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final long LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public final C627830Ojt copy(String str, String str2, EnumC627880Ojy enumC627880Ojy, String str3, int i, long j, String str4, String str5) {
        return new C627830Ojt(str, str2, enumC627880Ojy, str3, i, j, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C627830Ojt)) {
            return false;
        }
        C627830Ojt c627830Ojt = (C627830Ojt) obj;
        return Intrinsics.LJFF(this.LL, c627830Ojt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c627830Ojt.LLILLJJLI) && this.LLILLL == c627830Ojt.LLILLL && Intrinsics.LJFF(this.LLILZ, c627830Ojt.LLILZ) && this.LLILZIL == c627830Ojt.LLILZIL && this.LLILZLL == c627830Ojt.LLILZLL && Intrinsics.LJFF(this.LLIZ, c627830Ojt.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c627830Ojt.LLIZLLLIL);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeToolIntentData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fromGroupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", businessType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clickStartTime=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC627880Ojy getBusinessType() {
        return this.LLILLL;
    }

    public final long getClickStartTime() {
        return this.LLILZLL;
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final String getExtra() {
        return this.LLIZLLLIL;
    }

    public final String getFromGroupId() {
        return this.LLILLJJLI;
    }

    public final String getId() {
        return this.LLILZ;
    }

    public final String getResourceId() {
        return this.LLIZ;
    }

    public final int getType() {
        return this.LLILZIL;
    }

    public C627830Ojt(String str, String str2, EnumC627880Ojy enumC627880Ojy, String str3, int i, long j, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC627880Ojy;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = j;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
    }
}
