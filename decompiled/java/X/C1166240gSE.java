package X;

import android.os.SystemClock;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gSE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166240gSE extends C1161750gKz {
    public final String LJFF;
    public RouteIntent LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public InterfaceC1166330gSN<C0POE<ShopChunkResponse>> LJIIJJI;

    public C1166240gSE() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166240gSE)) {
            return false;
        }
        C1166240gSE c1166240gSE = (C1166240gSE) obj;
        return Intrinsics.LJFF(this.LJFF, c1166240gSE.LJFF) && Intrinsics.LJFF(this.LJI, c1166240gSE.LJI) && Intrinsics.LJFF(this.LJII, c1166240gSE.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1166240gSE.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1166240gSE.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1166240gSE.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1166240gSE.LJIIJJI);
    }

    public final int hashCode() {
        String str = this.LJFF;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RouteIntent routeIntent = this.LJI;
        int iHashCode2 = (iHashCode + (routeIntent == null ? 0 : routeIntent.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        InterfaceC1166330gSN<C0POE<ShopChunkResponse>> interfaceC1166330gSN = this.LJIIJJI;
        return iHashCode6 + (interfaceC1166330gSN != null ? interfaceC1166330gSN.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreContext(shopId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1166240gSE(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(SystemClock.elapsedRealtime());
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = str;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
    }
}
