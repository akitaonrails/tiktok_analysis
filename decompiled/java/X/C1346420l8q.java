package X;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346420l8q {
    public static final boolean LIZ(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LIZIZ(Boolean bool) {
        return !Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LIZJ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final int LJ(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final long LJFF(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final <E> boolean LIZLLL(List<E> list, final Function1<? super E, Boolean> function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            return list.removeIf(new Predicate() { // from class: X.0l8r
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
        }
        Iterator<E> it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
