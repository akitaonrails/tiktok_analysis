package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584400rKg {
    public static final C1584400rKg LIZ = new C1584400rKg();

    public static boolean LIZ(Fragment fragment) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List<BottomTabProtocol> listSz;
        MainActivityScope mainActivityScopeLIZJ2;
        HomeTabAbility homeTabAbilityLIZ2;
        List<TopTabProtocol> listB9;
        C19EG activity = fragment.getActivity();
        boolean z = false;
        if (activity != null && (mainActivityScopeLIZJ2 = C0S4U.LIZJ(activity)) != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null && (listB9 = homeTabAbilityLIZ2.b9()) != null) {
            Iterator<TopTabProtocol> it2 = listB9.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LLJIJIL(), fragment.getClass())) {
                    z = true;
                }
            }
        }
        C19EG activity2 = fragment.getActivity();
        if (activity2 != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity2)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (listSz = homeTabAbilityLIZ.Sz()) != null) {
            Iterator<BottomTabProtocol> it3 = listSz.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().LLJIJIL(), fragment.getClass())) {
                    z = true;
                }
            }
        }
        return z;
    }
}
