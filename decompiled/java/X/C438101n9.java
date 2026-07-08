package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01n9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C438101n9 {
    public static final void LIZ(C259800zU<Long> c259800zU, Function1<? super Long, Unit> function1, C11NJ c11nj) {
        long jCurrentTimeMillis;
        Long l = c259800zU.element;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        function1.invoke(Long.valueOf(jCurrentTimeMillis2));
        c11nj.dispose();
        new C020S(jCurrentTimeMillis2, 11);
    }

    public static final void LIZIZ(C259800zU<WeakReference<AbstractC1387200mCc>> c259800zU, AbstractC1387200mCc abstractC1387200mCc, Function0<Unit> function0) {
        AbstractC1387200mCc abstractC1387200mCc2;
        WeakReference<AbstractC1387200mCc> weakReference = c259800zU.element;
        if (weakReference != null) {
            abstractC1387200mCc2 = weakReference.get();
        } else {
            abstractC1387200mCc2 = null;
        }
        if (Intrinsics.LJFF(abstractC1387200mCc2, abstractC1387200mCc)) {
            function0.invoke();
        }
    }
}
