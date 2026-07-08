package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0grd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181990grd implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiListApi.PoiDetailResponse> LL;
    public final boolean LLILLJJLI;
    public final EnumC1181950grZ LLILLL;

    public C1181990grd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1181990grd)) {
            return false;
        }
        C1181990grd c1181990grd = (C1181990grd) obj;
        return Intrinsics.LJFF(this.LL, c1181990grd.LL) && this.LLILLJJLI == c1181990grd.LLILLJJLI && this.LLILLL == c1181990grd.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailHeaderState(detailResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isReusedAnchorName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", regionHeaderType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1181990grd(int i) {
        this(C491101vh.LIZ, false, EnumC1181950grZ.PURE_TEXT);
    }

    public C1181990grd(AbstractC1623806Xk<PoiListApi.PoiDetailResponse> abstractC1623806Xk, boolean z, EnumC1181950grZ enumC1181950grZ) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1181950grZ;
    }

    public static C1181990grd LIZ(C1181990grd c1181990grd, AbstractC1623806Xk abstractC1623806Xk, boolean z, EnumC1181950grZ enumC1181950grZ, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1181990grd.LL;
        }
        if ((i & 2) != 0) {
            z = c1181990grd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC1181950grZ = c1181990grd.LLILLL;
        }
        c1181990grd.getClass();
        return new C1181990grd(abstractC1623806Xk, z, enumC1181950grZ);
    }
}
