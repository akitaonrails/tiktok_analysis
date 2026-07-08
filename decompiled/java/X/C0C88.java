package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0C88, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C88 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(7));
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(Context context) {
        Iterator it2 = ((List) LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC308150C6b) it2.next()).run(context);
        }
    }
}
