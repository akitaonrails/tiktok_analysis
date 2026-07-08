package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C092100Wh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object obj, Map map) {
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Map.Entry) it2.next()).getValue(), obj)) {
                it2.remove();
            }
        }
    }
}
