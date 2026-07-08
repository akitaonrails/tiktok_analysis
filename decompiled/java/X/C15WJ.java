package X;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15WJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WJ {
    public static final void LIZ(List list, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new C15WK(function1));
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
