package X;

import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ipd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257630ipd extends C1257950iq9 {
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final ProfileTabBaseBusiness LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257630ipd)) {
            return false;
        }
        C1257630ipd c1257630ipd = (C1257630ipd) obj;
        return this.LIZLLL == c1257630ipd.LIZLLL && Intrinsics.LJFF(this.LJ, c1257630ipd.LJ) && this.LJFF == c1257630ipd.LJFF && this.LJI == c1257630ipd.LJI && this.LJII == c1257630ipd.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1257630ipd.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZLLL * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        ProfileTabBaseBusiness profileTabBaseBusiness = this.LJIIIIZZ;
        return iHashCode + (profileTabBaseBusiness == null ? 0 : profileTabBaseBusiness.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileTabStandardData(standardType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", supportAlert=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", textModeSupportIcon=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1257950iq9
    public final /* bridge */ /* synthetic */ ITabBusinessListener LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1257950iq9
    public final boolean LIZIZ() {
        return this.LJI;
    }

    public C1257630ipd(int i, String str, int i2, boolean z, boolean z2, ProfileTabBaseBusiness profileTabBaseBusiness) {
        super(i, profileTabBaseBusiness, 4);
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = i2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = profileTabBaseBusiness;
    }
}
