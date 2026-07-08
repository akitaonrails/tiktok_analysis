package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EV8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EV8 {
    public static final boolean LIZ(String str, Iterable<? extends C0EVA> iterable) {
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<? extends C0EVA> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getValue(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
