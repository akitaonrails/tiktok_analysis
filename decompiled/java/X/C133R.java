package X;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.133R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C133R {
    public static /* synthetic */ boolean LIZ(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!C133Q.LIZ(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
