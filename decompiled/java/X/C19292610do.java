package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19292610do extends AbstractC19293010ds {
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Object LLIZ;
    public final String LLIZLLLIL;

    public C19292610do() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19292610do)) {
            return false;
        }
        C19292610do c19292610do = (C19292610do) obj;
        return this.LLILZIL == c19292610do.LLILZIL && this.LLILZLL == c19292610do.LLILZLL && Intrinsics.LJFF(this.LLIZ, c19292610do.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c19292610do.LLIZLLLIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        Object obj = this.LLIZ;
        int iHashCode = (iZ2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingHeaderItem(divider=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLILZLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19292610do(String str, int i) {
        boolean z;
        super(false, null, 15);
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        str = (i & 8) != 0 ? null : str;
        this.LLILZIL = false;
        this.LLILZLL = z;
        this.LLIZ = null;
        this.LLIZLLLIL = str;
    }
}
