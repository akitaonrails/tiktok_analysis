package X;

import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781880wTC extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final long LL;
    public final String LLILLJJLI;
    public final SMBCourse LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final EnumC1785280wYg LLIZLLLIL = EnumC1785280wYg.COURSE;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781880wTC)) {
            return false;
        }
        C1781880wTC c1781880wTC = (C1781880wTC) obj;
        return this.LL == c1781880wTC.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781880wTC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781880wTC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781880wTC.LLILZ) && this.LLILZIL == c1781880wTC.LLILZIL && this.LLILZLL == c1781880wTC.LLILZLL && this.LLIZ == c1781880wTC.LLIZ;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        SMBCourse sMBCourse = this.LLILLL;
        return ((((((((iY2 + (sMBCourse == null ? 0 : sMBCourse.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Course(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", courseDetail=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", courseIndex=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", submitButtonRes=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", useMockIllustrator=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLILZLL);
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLIZLLLIL;
    }

    public C1781880wTC(long j, String str, SMBCourse sMBCourse, String str2, int i, int i2, boolean z) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = sMBCourse;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = z;
    }
}
