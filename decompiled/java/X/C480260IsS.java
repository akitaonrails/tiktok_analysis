package X;

import android.view.KeyEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480260IsS {
    public static void LIZ(List list, Function1 function1) {
        InterfaceC480120IsE interfaceC480120IsE;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                KeyEvent.Callback callback = (View) it2.next();
                if ((callback instanceof InterfaceC480120IsE) && (interfaceC480120IsE = (InterfaceC480120IsE) callback) != null) {
                    interfaceC480120IsE.setEventClickListener(function1);
                }
            }
        }
    }
}
