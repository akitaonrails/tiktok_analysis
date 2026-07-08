package X;

import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200820hM0 extends AbstractC1200800hLy {
    public final String LIZLLL;
    public final String LJ;

    public C1200820hM0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200820hM0)) {
            return false;
        }
        C1200820hM0 c1200820hM0 = (C1200820hM0) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1200820hM0.LIZLLL) && Intrinsics.LJFF(this.LJ, c1200820hM0.LJ);
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadImagePage(schema=");
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

    public C1200820hM0(int i) {
        super("aweme://roma_redirect/?spark_page=poi_claim_upload_image_page", "upload_image_page");
        this.LIZLLL = "aweme://roma_redirect/?spark_page=poi_claim_upload_image_page";
        this.LJ = "upload_image_page";
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZJ(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        IPoiClaimFragmentAbility iPoiClaimFragmentAbility;
        if (interfaceC665370Q7z != null && (iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiClaimFragmentAbility.class, null)) != null) {
            iPoiClaimFragmentAbility.Dc();
        }
    }

    @Override // X.AbstractC1200800hLy
    public final void LIZLLL(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        c1200750hLt.LIZJ(new C1200840hM2(0), false);
    }
}
