package X;

import X.C20131713pr;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13q7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20133313q7<D extends C20131713pr> {
    public AbstractC20133613qA LIZ;
    public boolean LIZIZ;

    public abstract D LIZ();

    public C20131713pr LIZJ(D d, Bundle bundle, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
        return d;
    }

    public void LJ(Bundle bundle) {
    }

    public Bundle LJFF() {
        return null;
    }

    public boolean LJII() {
        return true;
    }

    public final AbstractC20133613qA LIZIZ() {
        AbstractC20133613qA abstractC20133613qA = this.LIZ;
        if (abstractC20133613qA != null) {
            return abstractC20133613qA;
        }
        "You cannot access the Navigator's state until the Navigator is attached".toString();
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void LJI(NavBackStackEntry navBackStackEntry, boolean z) {
        List list = (List) LIZIZ().LJ.getValue();
        if (list.contains(navBackStackEntry)) {
            ListIterator listIterator = list.listIterator(list.size());
            NavBackStackEntry navBackStackEntry2 = null;
            while (LJII()) {
                navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
                if (Intrinsics.LJFF(navBackStackEntry2, navBackStackEntry)) {
                    break;
                }
            }
            if (navBackStackEntry2 != null) {
                LIZIZ().LIZJ(navBackStackEntry2, z);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popBackStack was called with ");
        sbLIZ.append(navBackStackEntry);
        sbLIZ.append(" which does not exist in back stack ");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public void LIZLLL(List<NavBackStackEntry> list, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
        C08QT c08qt = new C08QT(C09RB.LJIIJJI(new C08LY(new C1939607ik(list), new AwS239S0300000_30((AbstractC20133313q7) this, c20133813qC, (C20133813qC) interfaceC20133413q8, (InterfaceC20133413q8) 8))));
        while (c08qt.hasNext()) {
            LIZIZ().LJ((NavBackStackEntry) c08qt.next());
        }
    }
}
