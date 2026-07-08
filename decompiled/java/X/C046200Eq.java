package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C046200Eq implements InterfaceC1891350zJl, InterfaceC046300Er {
    public final ECBillboard LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;
    public final C0128001u LLILZ;
    public final Function0<String> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C046200Eq)) {
            return false;
        }
        C046200Eq c046200Eq = (C046200Eq) obj;
        return Intrinsics.LJFF(this.LL, c046200Eq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c046200Eq.LLILLJJLI) && this.LLILLL == c046200Eq.LLILLL && Intrinsics.LJFF(this.LLILZ, c046200Eq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c046200Eq.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31;
        Function0<String> function0 = this.LLILZIL;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECBillboardAuctionNoteItem(ecBillboard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventTrackerCallback=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayState=");
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

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C046200Eq) {
            C046200Eq c046200Eq = (C046200Eq) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c046200Eq.LL) && this.LLILLL == c046200Eq.LLILLL && Intrinsics.LJFF(this.LLILZ, c046200Eq.LLILZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C046200Eq)) {
            return false;
        }
        InterfaceC046300Er interfaceC046300Er = (InterfaceC046300Er) interfaceC1891350zJl;
        if ((interfaceC046300Er == null || !C123100dR.LIZ(LIZ().billboardId) || !Intrinsics.LJFF(interfaceC046300Er.LIZ().billboardId, LIZ().billboardId)) && !Intrinsics.LJFF(this.LL, ((C046200Eq) interfaceC1891350zJl).LL)) {
            return false;
        }
        return true;
    }

    public C046200Eq(ECBillboard eCBillboard, Function0<Unit> function0, int i, C0128001u c0128001u, Function0<String> function02) {
        this.LL = eCBillboard;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
        this.LLILZ = c0128001u;
        this.LLILZIL = function02;
    }
}
