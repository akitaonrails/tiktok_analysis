package X;

import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0pOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509900pOW {
    public static final Set<String> LIZ = Collections.synchronizedSet(new HashSet());
    public static final List<C1509920pOY> LIZIZ = Collections.synchronizedList(new ArrayList());
    public static boolean LIZJ;

    public static void LIZ() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(C1509960pOc.LIZ);
        FeatureServiceManager.Companion.getClass();
        hashSet.addAll(C1510050pOl.LIZ().events());
        LIZ.addAll(hashSet);
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0pOJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppLogFeatureProducerHandler@144b.updateListenAppLogEvents$1");
                try {
                    C1509900pOW.LIZ.addAll(C15442062u.LJIIIIZZ(C1509790pOL.LIZ().triggerEvent, C15442062u.LJIIIZ(C609920Nw6.LIZ().triggerEvents, C609920Nw6.LIZ().triggerEventsForBusiness)));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.updateListenAppLogEvents$1");
            }
        });
    }
}
