package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0NPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593400NPe {
    public final ConcurrentHashMap<String, C0OBB> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str, LifecycleOwner lifecycleOwner) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (lifecycleOwner != null) {
            numValueOf = Integer.valueOf(lifecycleOwner.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
