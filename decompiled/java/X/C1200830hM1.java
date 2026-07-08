package X;

import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSearchAssemAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200830hM1 extends AbstractC1200800hLy {
    public final String LIZLLL;
    public final String LJ;

    public C1200830hM1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200830hM1)) {
            return false;
        }
        C1200830hM1 c1200830hM1 = (C1200830hM1) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1200830hM1.LIZLLL) && Intrinsics.LJFF(this.LJ, c1200830hM1.LJ);
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiListPage(schema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pageKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1200800hLy
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1200800hLy
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    public C1200830hM1(int i) {
        super(null, "poi_list_page");
        this.LIZLLL = null;
        this.LJ = "poi_list_page";
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZJ(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        if (interfaceC665370Q7z != null) {
            IPoiClaimSearchAssemAbility iPoiClaimSearchAssemAbility = (IPoiClaimSearchAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiClaimSearchAssemAbility.class, null);
            if (iPoiClaimSearchAssemAbility != null) {
                iPoiClaimSearchAssemAbility.iC1();
            }
            IPoiClaimListAssemAbility iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiClaimListAssemAbility.class, null);
            if (iPoiClaimListAssemAbility != null) {
                iPoiClaimListAssemAbility.mt0();
            }
        }
        c1200750hLt.LIZJ(new C1200840hM2(0), false);
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZLLL(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        IPoiClaimListAssemAbility iPoiClaimListAssemAbility;
        IPoiClaimSearchAssemAbility iPoiClaimSearchAssemAbility;
        if (interfaceC665370Q7z != null && (iPoiClaimSearchAssemAbility = (IPoiClaimSearchAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiClaimSearchAssemAbility.class, null)) != null) {
            iPoiClaimSearchAssemAbility.iC1();
        }
        if (interfaceC665370Q7z != null && (iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiClaimListAssemAbility.class, null)) != null) {
            iPoiClaimListAssemAbility.nE0(false);
            iPoiClaimListAssemAbility.mt0();
        }
        if (C1200810hLz.LIZ()) {
            c1200750hLt.LIZJ(new C1200850hM3(0), false);
        } else {
            c1200750hLt.LIZJ(new C1200870hM5(0), false);
        }
    }
}
