package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548910Lft {
    public static final InterfaceC548750Lfd LIZ(Object obj) {
        if (obj instanceof InterfaceC548750Lfd) {
            return (InterfaceC548750Lfd) obj;
        }
        Function1 function1 = (Function1) ((LinkedHashMap) C548920Lfu.LIZ).get(obj.getClass());
        if (function1 != null) {
            return (InterfaceC548750Lfd) function1.invoke(obj);
        }
        return null;
    }
}
