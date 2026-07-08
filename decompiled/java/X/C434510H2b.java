package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434510H2b extends AbstractC434530H2d {
    public final int LL;
    public final int LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public final List<String> LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL = 106;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434510H2b)) {
            return false;
        }
        C434510H2b c434510H2b = (C434510H2b) obj;
        return this.LL == c434510H2b.LL && this.LLILLJJLI == c434510H2b.LLILLJJLI && this.LLILLL == c434510H2b.LLILLL && Intrinsics.LJFF(this.LLILZ, c434510H2b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c434510H2b.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c434510H2b.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c434510H2b.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceProductRenderItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", img=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", productRating=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC434530H2d
    public final int LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC434580H2i
    public final int getIndex() {
        return this.LL;
    }

    @Override // X.InterfaceC434580H2i
    public final int getItemCount() {
        return this.LLILLJJLI;
    }

    public C434510H2b(int i, int i2, long j, String str, String str2, String str3, List list) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }
}
