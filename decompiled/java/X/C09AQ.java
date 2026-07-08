package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.09AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AQ {
    public static final C09AU LIZ = new C09AU("NO_THREAD_ELEMENTS");
    public static final C09AP LIZIZ = new C09AP();
    public static final C09A2 LIZJ = new C09A2();
    public static final C09AR LIZLLL = new C09AR();

    public static final Object LIZIZ(CoroutineContext coroutineContext) {
        return coroutineContext.fold(0, LIZIZ);
    }

    public static final void LIZ(CoroutineContext coroutineContext, Object obj) {
        if (obj == LIZ) {
            return;
        }
        if (obj instanceof C09AS) {
            C09AS c09as = (C09AS) obj;
            int length = c09as.LIZJ.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                c09as.LIZJ[length].LJIJJ(c09as.LIZIZ[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        } else {
            ((C09AT) coroutineContext.fold(null, LIZJ)).LJIJJ(obj);
        }
    }

    public static final Object LIZJ(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = LIZIZ(coroutineContext);
        }
        if (obj == 0) {
            return LIZ;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new C09AS(coroutineContext, ((Number) obj).intValue()), LIZLLL);
        }
        return ((C09AT) obj).LJJLIIIJ(coroutineContext);
    }
}
