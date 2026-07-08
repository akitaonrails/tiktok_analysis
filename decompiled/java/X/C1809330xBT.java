package X;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809330xBT {
    public static final void LIZ(List list, final Function1 function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new Predicate() { // from class: X.0xBU
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
    }
}
