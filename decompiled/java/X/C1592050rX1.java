package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592050rX1 {
    public static final List<WeakReference<InterfaceC1592060rX2>> LIZ = new ArrayList();

    public static void LIZ(Function1 function1) {
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj == null) {
                it2.remove();
            } else {
                function1.invoke(obj);
            }
        }
    }

    public static void LIZIZ(InterfaceC1592060rX2 interfaceC1592060rX2) {
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(interfaceC1592060rX2, ((Reference) it2.next()).get())) {
                it2.remove();
                return;
            }
        }
    }
}
