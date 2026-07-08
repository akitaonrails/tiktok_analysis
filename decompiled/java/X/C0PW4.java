package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PW4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PW4 {
    public static void LIZ(String str, C0PW2 c0pw2) {
        C0PWF c0pwfPutIfAbsent;
        if (str != null) {
            ConcurrentHashMap<String, C0PWF> concurrentHashMap = C0PW2.LJFF;
            C0PWF c0pwf = concurrentHashMap.get(str);
            if (c0pwf == null && (c0pwfPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c0pwf = new C0PWF()))) != null) {
                c0pwf = c0pwfPutIfAbsent;
            }
            List<C0PW2<?>> list = c0pwf.LIZIZ;
            if (list != null) {
                list.add(c0pw2);
                return;
            }
            C0PW2<?> c0pw22 = c0pwf.LIZ;
            if (c0pw22 != null) {
                if (Intrinsics.LJFF(c0pw22, c0pw2)) {
                    return;
                }
                c0pwf.LIZIZ = C1697810uHb.LJIILJJIL(c0pw22, c0pw2);
                c0pwf.LIZ = null;
                return;
            }
            c0pwf.LIZ = c0pw2;
        }
    }

    public static void LIZIZ(C0PWT c0pwt, C0PWA c0pwa) {
        C0PWF c0pwf = C0PW2.LJFF.get(C13LE.LIZ(c0pwt.getClass()).LIZLLL());
        if (c0pwf != null) {
            List<C0PW2<?>> list = c0pwf.LIZIZ;
            if (list != null) {
                Iterator<C0PW2<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(c0pwt, c0pwa);
                }
                return;
            } else {
                C0PW2<?> c0pw2 = c0pwf.LIZ;
                if (c0pw2 != null) {
                    c0pw2.LIZJ(c0pwt, c0pwa);
                    return;
                }
                return;
            }
        }
        Iterator<? extends C0PW2<?>> it3 = C0PW2.LJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZJ(c0pwt, c0pwa);
        }
    }
}
