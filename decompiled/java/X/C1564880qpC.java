package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564880qpC {
    public final Context LIZ;
    public final Activity LIZIZ;
    public final Fragment LIZJ;
    public final FlexibleComponentAbility LIZLLL;
    public final IViewPagerComponentAbility LJ;
    public final IPlayerComponentAbility LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1564880qpC)) {
            return false;
        }
        C1564880qpC c1564880qpC = (C1564880qpC) obj;
        return Intrinsics.LJFF(this.LIZ, c1564880qpC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1564880qpC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1564880qpC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1564880qpC.LIZLLL) && Intrinsics.LJFF(this.LJ, c1564880qpC.LJ) && Intrinsics.LJFF(this.LJFF, c1564880qpC.LJFF);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        int iHashCode = (context == null ? 0 : context.hashCode()) * 31;
        Activity activity = this.LIZIZ;
        int iHashCode2 = (iHashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Fragment fragment = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (fragment == null ? 0 : fragment.hashCode())) * 31;
        FlexibleComponentAbility flexibleComponentAbility = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (flexibleComponentAbility == null ? 0 : flexibleComponentAbility.hashCode())) * 31;
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LJ;
        int iHashCode5 = (iHashCode4 + (iViewPagerComponentAbility == null ? 0 : iViewPagerComponentAbility.hashCode())) * 31;
        IPlayerComponentAbility iPlayerComponentAbility = this.LJFF;
        return iHashCode5 + (iPlayerComponentAbility != null ? iPlayerComponentAbility.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexibleLandingPageHostContext(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fragment=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", flexibleComponentAbility=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pagerAbility=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", playerAbility=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1564880qpC(Context context, Activity activity, Fragment fragment, FlexibleComponentAbility flexibleComponentAbility, IViewPagerComponentAbility iViewPagerComponentAbility, IPlayerComponentAbility iPlayerComponentAbility) {
        this.LIZ = context;
        this.LIZIZ = activity;
        this.LIZJ = fragment;
        this.LIZLLL = flexibleComponentAbility;
        this.LJ = iViewPagerComponentAbility;
        this.LJFF = iPlayerComponentAbility;
    }
}
