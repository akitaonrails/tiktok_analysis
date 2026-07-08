package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0y7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845200y7K {
    public static InterfaceC1845190y7J LIZ;
    public static final Set<Class<?>> LIZIZ = new LinkedHashSet();

    public static void LIZ(Activity activity) {
        String str;
        InterfaceC1845190y7J interfaceC1845190y7J;
        Pair<String, String> pairLIZIZ;
        if (LIZIZ.contains(activity.getClass())) {
            return;
        }
        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(activity);
        if (c1847740yBQLIZIZ != null) {
            str = c1847740yBQLIZIZ.LIZIZ;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && (interfaceC1845190y7J = LIZ) != null && (pairLIZIZ = interfaceC1845190y7J.LIZIZ(activity)) != null && pairLIZIZ.getFirst().length() > 0) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Activity oid downgraded. Activity=");
                sbLIZ.append(activity);
                sbLIZ.append(", oid=");
                sbLIZ.append(pairLIZIZ.getFirst());
                sbLIZ.append(", type=");
                sbLIZ.append(pairLIZIZ.getSecond());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C1848530yCh.LIZLLL(activity, pairLIZIZ.getFirst(), new AwS606S0100000_27(pairLIZIZ, (Pair<String, String>) 593));
        }
    }

    public static void LIZIZ(Fragment fragment) {
        String str;
        InterfaceC1845190y7J interfaceC1845190y7J;
        Pair<String, String> pairLIZ;
        if (LIZIZ.contains(fragment.getClass())) {
            return;
        }
        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(fragment);
        if (c1847740yBQLIZIZ != null) {
            str = c1847740yBQLIZIZ.LIZIZ;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && (interfaceC1845190y7J = LIZ) != null && (pairLIZ = interfaceC1845190y7J.LIZ(fragment)) != null && pairLIZ.getFirst().length() > 0) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fragment oid downgraded. fragment=");
                sbLIZ.append(fragment.getClass().getSimpleName());
                sbLIZ.append(", oid=");
                sbLIZ.append(pairLIZ.getFirst());
                sbLIZ.append(", type=");
                sbLIZ.append(pairLIZ.getSecond());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C1848530yCh.LIZLLL(fragment, pairLIZ.getFirst(), new AwS606S0100000_27(pairLIZ, (Pair<String, String>) 594));
        }
    }
}
