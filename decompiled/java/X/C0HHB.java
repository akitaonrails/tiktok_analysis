package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HHB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHB {
    public static final C0HHB LIZ = new C0HHB();
    public static final Map<C0HFK, C0HHS> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<C0HFK, Function2<C19EG, Function0<Unit>, Unit>> LIZJ = Collections.synchronizedMap(new LinkedHashMap());

    public final synchronized void LIZ(C0HFK c0hfk, C0HHK c0hhk) {
        Map<C0HFK, C0HHS> map = LIZIZ;
        if (map.get(c0hfk) == null) {
            map.put(c0hfk, c0hhk);
        }
    }
}
