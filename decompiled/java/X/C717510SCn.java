package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717510SCn implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;

    public C717510SCn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C717510SCn)) {
            return false;
        }
        C717510SCn c717510SCn = (C717510SCn) obj;
        return this.LL == c717510SCn.LL && this.LLILLJJLI == c717510SCn.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c717510SCn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c717510SCn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c717510SCn.LLILZIL) && this.LLILZLL == c717510SCn.LLILZLL;
    }

    public final int hashCode() {
        int i = ((this.LL * 31) + this.LLILLJJLI) * 31;
        Integer num = this.LLILLL;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILZIL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotedTagState(promotedTagVisibility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", transPromotedTagView=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", useTransparent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C717510SCn(int i) {
        this(8, 8, null, null, null, false);
    }

    public C717510SCn(int i, int i2, Integer num, Integer num2, String str, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = str;
        this.LLILZLL = z;
    }
}
