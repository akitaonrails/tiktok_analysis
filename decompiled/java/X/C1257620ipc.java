package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ipc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257620ipc extends C1257950iq9 {
    public final int LIZLLL;
    public final View LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final ProfileTabBaseBusiness LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257620ipc)) {
            return false;
        }
        C1257620ipc c1257620ipc = (C1257620ipc) obj;
        return this.LIZLLL == c1257620ipc.LIZLLL && Intrinsics.LJFF(this.LJ, c1257620ipc.LJ) && this.LJFF == c1257620ipc.LJFF && this.LJI == c1257620ipc.LJI && this.LJII == c1257620ipc.LJII && this.LJIIIIZZ == c1257620ipc.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1257620ipc.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZLLL * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        ProfileTabBaseBusiness profileTabBaseBusiness = this.LJIIIZ;
        return iHashCode + (profileTabBaseBusiness == null ? 0 : profileTabBaseBusiness.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileTabCustomViewData(customType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", indicatorWidth=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", shouldReplaceStandard=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isCustomViewHasStandardType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1257950iq9
    public final /* bridge */ /* synthetic */ ITabBusinessListener LIZ() {
        return this.LJIIIZ;
    }

    public C1257620ipc(int i, C1257530ipT c1257530ipT, int i2, int i3, boolean z, boolean z2, ProfileTabBaseBusiness profileTabBaseBusiness) {
        super(i, (ITabBusinessListener) null, 6);
        this.LIZLLL = i;
        this.LJ = c1257530ipT;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = profileTabBaseBusiness;
    }
}
