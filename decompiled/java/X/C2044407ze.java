package X;

import android.os.Build;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2044407ze {
    public static final void LIZ(String str) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method ");
        sbLIZ.append(str);
        sbLIZ.append(" must be called on the main thread");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final <T> boolean LIZIZ(Collection<T> collection, final Function1<? super T, Boolean> function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            return collection.removeIf(new Predicate() { // from class: X.07zf
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
        }
        Iterator<T> it2 = collection.iterator();
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
