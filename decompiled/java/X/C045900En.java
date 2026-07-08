package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00En, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C045900En implements InterfaceC1891350zJl, InterfaceC046300Er {
    public final ECBillboard LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;
    public final Function0<String> LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C045900En)) {
            return false;
        }
        C045900En c045900En = (C045900En) obj;
        return Intrinsics.LJFF(this.LL, c045900En.LL) && Intrinsics.LJFF(this.LLILLJJLI, c045900En.LLILLJJLI) && this.LLILLL == c045900En.LLILLL && Intrinsics.LJFF(this.LLILZ, c045900En.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31;
        Function0<String> function0 = this.LLILZ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECBillboardTextItem(ecBillboard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventTrackerCallback=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", clickSchemaProvider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC046300Er
    public final ECBillboard LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC046300Er
    public final Function0<Unit> LIZIZ() {
        return this.LLILLJJLI;
    }

    public C045900En(ECBillboard eCBillboard, Function0<Unit> function0, int i, Function0<String> function02) {
        this.LL = eCBillboard;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
        this.LLILZ = function02;
    }
}
