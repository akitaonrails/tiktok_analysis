package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179620gno implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiListApi.PoiDetailResponse> LL;
    public final EnumC1179630gnp LLILLJJLI;
    public final EnumC1179610gnn LLILLL;
    public final C1177960gl8 LLILZ;
    public final Float LLILZIL;
    public final Integer LLILZLL;

    public C1179620gno() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179620gno)) {
            return false;
        }
        C1179620gno c1179620gno = (C1179620gno) obj;
        return Intrinsics.LJFF(this.LL, c1179620gno.LL) && this.LLILLJJLI == c1179620gno.LLILLJJLI && this.LLILLL == c1179620gno.LLILLL && Intrinsics.LJFF(this.LLILZ, c1179620gno.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1179620gno.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1179620gno.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C1177960gl8 c1177960gl8 = this.LLILZ;
        int iHashCode2 = (iHashCode + (c1177960gl8 == null ? 0 : c1177960gl8.hashCode())) * 31;
        Float f = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiMapType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", latLon=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", zoomLevel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1179620gno(int i) {
        this(C491101vh.LIZ, EnumC1179630gnp.STATUS_NONE, EnumC1179610gnn.TYPE_NONE, null, null, null);
    }

    public C1179620gno(AbstractC1623806Xk<PoiListApi.PoiDetailResponse> abstractC1623806Xk, EnumC1179630gnp enumC1179630gnp, EnumC1179610gnn enumC1179610gnn, C1177960gl8 c1177960gl8, Float f, Integer num) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = enumC1179630gnp;
        this.LLILLL = enumC1179610gnn;
        this.LLILZ = c1177960gl8;
        this.LLILZIL = f;
        this.LLILZLL = num;
    }

    public static C1179620gno LIZ(C1179620gno c1179620gno, AbstractC1623806Xk abstractC1623806Xk, EnumC1179630gnp enumC1179630gnp, EnumC1179610gnn enumC1179610gnn, Float f, Integer num, int i) {
        C1177960gl8 c1177960gl8;
        Integer num2 = num;
        Float f2 = f;
        EnumC1179610gnn enumC1179610gnn2 = enumC1179610gnn;
        EnumC1179630gnp enumC1179630gnp2 = enumC1179630gnp;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1179620gno.LL;
        }
        if ((i & 2) != 0) {
            enumC1179630gnp2 = c1179620gno.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC1179610gnn2 = c1179620gno.LLILLL;
        }
        if ((i & 8) != 0) {
            c1177960gl8 = c1179620gno.LLILZ;
        } else {
            c1177960gl8 = null;
        }
        if ((i & 16) != 0) {
            f2 = c1179620gno.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1179620gno.LLILZLL;
        }
        c1179620gno.getClass();
        return new C1179620gno(abstractC1623806Xk2, enumC1179630gnp2, enumC1179610gnn2, c1177960gl8, f2, num2);
    }
}
