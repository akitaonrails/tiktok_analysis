package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262060iwm extends AbstractC1262180iwy {
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;

    public C1262060iwm() {
        this(null, 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262060iwm)) {
            return false;
        }
        C1262060iwm c1262060iwm = (C1262060iwm) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1262060iwm.LLILLJJLI) && this.LLILLL == c1262060iwm.LLILLL && this.LLILZ == c1262060iwm.LLILZ && this.LLILZIL == c1262060iwm.LLILZIL && this.LLILZLL == c1262060iwm.LLILZLL;
    }

    public final int hashCode() {
        String str = this.LLILLJJLI;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewRecMoreListTitle(targetUserNickname=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", colorLight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", tuxFont=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", colorDark=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LLIZ;
    }

    public C1262060iwm(String str, int i, int i2) {
        int i3;
        int i4;
        str = (i2 & 1) != 0 ? null : str;
        i = (i2 & 2) != 0 ? 2131845976 : i;
        if ((i2 & 4) != 0) {
            i3 = R.attr.zn;
        } else {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            i4 = 62;
        } else {
            i4 = 0;
        }
        int i5 = (i2 & 16) != 0 ? R.attr.zn : 0;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = i5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewRecMore_Title_");
        sbLIZ.append(str);
        this.LLIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
