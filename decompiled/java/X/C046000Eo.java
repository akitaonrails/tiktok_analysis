package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C046000Eo implements InterfaceC1891350zJl, InterfaceC046300Er {
    public final ECBillboard LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Function0<String> LLILZIL;

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
        if (!(obj instanceof C046000Eo)) {
            return false;
        }
        C046000Eo c046000Eo = (C046000Eo) obj;
        return Intrinsics.LJFF(this.LL, c046000Eo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c046000Eo.LLILLJJLI) && this.LLILLL == c046000Eo.LLILLL && this.LLILZ == c046000Eo.LLILZ && Intrinsics.LJFF(this.LLILZIL, c046000Eo.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECBillboardUserRightItem(ecBillboard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventTrackerCallback=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", clickSchemaProvider=");
        sbLIZ.append(this.LLILZIL);
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

    public C046000Eo(ECBillboard eCBillboard, Function0<Unit> function0, int i, int i2, Function0<String> function02) {
        this.LL = eCBillboard;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = function02;
    }
}
