package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0uTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705090uTL {
    public static final boolean LIZ(Effect effect, List list) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1705100uTM) it2.next()).LIZ(effect);
        }
        return true;
    }
}
