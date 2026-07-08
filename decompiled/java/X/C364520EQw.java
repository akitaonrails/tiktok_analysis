package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364520EQw {
    public static final void LIZ(List list, Function1 function1) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
    }
}
