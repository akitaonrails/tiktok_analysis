package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567300qt6 implements InterfaceC0148002o {
    public int LL;
    public String LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final String LLIZ;

    public C1567300qt6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567300qt6)) {
            return false;
        }
        C1567300qt6 c1567300qt6 = (C1567300qt6) obj;
        return this.LL == c1567300qt6.LL && Intrinsics.LJFF(this.LLILLJJLI, c1567300qt6.LLILLJJLI) && this.LLILLL == c1567300qt6.LLILLL && this.LLILZ == c1567300qt6.LLILZ && this.LLILZIL == c1567300qt6.LLILZIL && this.LLILZLL == c1567300qt6.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1567300qt6.LLIZ);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (((((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31;
        String str2 = this.LLIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushTopState(topType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", topImageUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topImageRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", topImageWidth=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", topImageHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", topImageRadius=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", topSchemaUrl=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1567300qt6(int i) {
        this(0, 0, null, null, 0, 0, 0);
    }

    public C1567300qt6(int i, int i2, String str, String str2, int i3, int i4, int i5) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = i5;
        this.LLIZ = str2;
    }
}
