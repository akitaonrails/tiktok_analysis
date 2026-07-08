package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729300SjA {
    public final ConcurrentHashMap<Object, InterfaceC729460SjQ> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(Function1<? super InterfaceC729460SjQ, Unit> function1) {
        Iterator it2 = new HashMap(this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            function1.invoke(((Map.Entry) it2.next()).getValue());
        }
    }
}
