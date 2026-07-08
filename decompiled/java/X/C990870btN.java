package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0btN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990870btN {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(LruCache lruCache, Object obj, Function0 function0) {
        Object obj2 = lruCache.get(obj);
        if (obj2 == null) {
            Object objInvoke = function0.invoke();
            lruCache.put(obj, objInvoke);
            return objInvoke;
        }
        return obj2;
    }
}
