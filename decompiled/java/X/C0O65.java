package X;

import android.util.LruCache;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O65, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O65 {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final C0O64 LIZIZ = new LruCache<String, IMotaCache>() { // from class: X.0O64
    };
    public static final C0O63 LIZJ = new LruCache<String, IMotaCache>() { // from class: X.0O63
    };
    public static final CopyOnWriteArrayList<C613800O5q<?>> LIZLLL = new CopyOnWriteArrayList<>();

    public static void LIZ(String str, IMotaCache iMotaCache, EnumC614120O6w enumC614120O6w) {
        Field field;
        Field[] declaredFields = iMotaCache.getClass().getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field2 : declaredFields) {
            if (Intrinsics.LJFF(field2.getDeclaringClass(), iMotaCache.getClass())) {
                arrayList.add(field2);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            linkedHashMap.put(((Field) obj).getName(), obj);
        }
        for (C613800O5q<?> c613800O5q : LIZLLL) {
            if (c613800O5q.LIZ.LIZIZ(iMotaCache) && (field = (Field) linkedHashMap.get(c613800O5q.LIZIZ)) != null) {
                boolean zIsAccessible = field.isAccessible();
                try {
                    field.setAccessible(true);
                    c613800O5q.LIZJ.invoke(str, field.get(iMotaCache), enumC614120O6w);
                    field.setAccessible(zIsAccessible);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    field.setAccessible(zIsAccessible);
                    throw th;
                }
            }
        }
    }
}
