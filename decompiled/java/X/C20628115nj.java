package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20628115nj<T> {
    public final Function0<T> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C20628115nj(Function0<? extends T> function0) {
        this.LIZ = function0;
    }

    public final T LIZ(AbstractC20628015ni abstractC20628015ni, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return (T) abstractC20628015ni.LIZIZ(interfaceC2217461Bqa.getName(), this.LIZ);
    }

    public final void LIZIZ(AbstractC20628015ni abstractC20628015ni, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        Function2 function2;
        String name = interfaceC2217461Bqa.getName();
        Function0<T> function0 = this.LIZ;
        Object objLIZIZ = abstractC20628015ni.LIZIZ(name, function0);
        abstractC20628015ni.LLILLJJLI.put(name, t);
        Object objLIZIZ2 = abstractC20628015ni.LIZIZ(name, function0);
        if (!Intrinsics.LJFF(objLIZIZ, objLIZIZ2)) {
            Object obj = ((LinkedHashMap) abstractC20628015ni.LLILLL).get(name);
            if (C19719512Dh.LJFF(2, obj) && (function2 = (Function2) obj) != null) {
                function2.invoke(objLIZIZ, objLIZIZ2);
            }
            Iterator<View> it2 = new C09RD(abstractC20628015ni).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    AbstractC20628015ni.LIZ((View) c09re.next(), name, objLIZIZ, objLIZIZ2);
                } else {
                    return;
                }
            }
        }
    }
}
