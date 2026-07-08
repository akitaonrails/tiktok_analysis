package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857910yRp implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final TakoProductItem LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857910yRp)) {
            return false;
        }
        C1857910yRp c1857910yRp = (C1857910yRp) obj;
        return this.LL == c1857910yRp.LL && this.LLILLJJLI == c1857910yRp.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1857910yRp.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showSup=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLL);
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

    public C1857910yRp(int i, boolean z, TakoProductItem takoProductItem) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = takoProductItem;
    }
}
