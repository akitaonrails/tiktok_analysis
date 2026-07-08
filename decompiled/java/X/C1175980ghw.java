package X;

import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175980ghw implements C14NM {
    public final SlashCellModel LL;
    public final Object LLILLJJLI;
    public final Function2<C1175980ghw, C1175980ghw, Boolean> LLILLL;
    public final int LLILZ;

    public C1175980ghw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175980ghw)) {
            return false;
        }
        C1175980ghw c1175980ghw = (C1175980ghw) obj;
        return Intrinsics.LJFF(this.LL, c1175980ghw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1175980ghw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1175980ghw.LLILLL) && this.LLILZ == c1175980ghw.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Object obj = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Function2<C1175980ghw, C1175980ghw, Boolean> function2 = this.LLILLL;
        return ((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSlashCellModel(slashCellModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", areItemTheSame=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Function2<C1175980ghw, C1175980ghw, Boolean> function2 = this.LLILLL;
        if (function2 != null) {
            if (!(interfaceC1891350zJl instanceof C1175980ghw)) {
                interfaceC1891350zJl = null;
            }
            return function2.invoke(this, (C1175980ghw) interfaceC1891350zJl).booleanValue();
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1175980ghw(SlashCellModel slashCellModel, C1175580ghI c1175580ghI, AFwS302S0000000_18 aFwS302S0000000_18, int i) {
        int iLIZ;
        c1175580ghI = (i & 2) != 0 ? null : c1175580ghI;
        aFwS302S0000000_18 = (i & 4) != 0 ? null : aFwS302S0000000_18;
        if ((i & 8) != 0) {
            C1176010ghz c1176010ghz = C1176000ghy.LIZ;
            String str = slashCellModel.cellId;
            iLIZ = C1176010ghz.LIZ(c1176010ghz, str == null ? "" : str);
        } else {
            iLIZ = 0;
        }
        this.LL = slashCellModel;
        this.LLILLJJLI = c1175580ghI;
        this.LLILLL = aFwS302S0000000_18;
        this.LLILZ = iLIZ;
    }
}
