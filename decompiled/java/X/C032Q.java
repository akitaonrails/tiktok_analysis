package X;

import X.C033V;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.032Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C032Q<BO extends C033V> implements AnonymousClass0329 {
    public final String LIZ;
    public Function1<? super String, Boolean> LIZIZ;

    public abstract BO LIZIZ(C033V c033v);

    public abstract List<AbstractC723102s1> LIZJ(C032F c032f, BO bo);

    public abstract Map<Class<?>, Function2<String, String, C033T<?>>> LJ();

    public C032Q(String str) {
        this.LIZ = str;
    }

    public static C033T LIZLLL(C032Q c032q, C033V c033v) {
        C033T<?> c033tInvoke;
        c032q.getClass();
        String name = c033v.getName();
        Function1<? super String, Boolean> function1 = c032q.LIZIZ;
        if (function1 == null || function1.invoke(name).booleanValue()) {
            Function2<String, String, C033T<?>> function2 = c032q.LJ().get(c033v.getClass());
            if (function2 != null) {
                c033tInvoke = function2.invoke(c032q.LIZ, name);
            } else {
                c033tInvoke = null;
            }
            if (c033tInvoke instanceof C033T) {
                return c033tInvoke;
            }
        }
        return null;
    }

    @Override // X.AnonymousClass0329
    public final List<AbstractC723102s1> LIZ(C032F c032f, C033V c033v, Function1<? super String, Boolean> function1, Function1<? super String, Boolean> function12) {
        if (function1 != null && !function1.invoke(this.LIZ).booleanValue()) {
            return C13BV.INSTANCE;
        }
        if (c033v == null) {
            C035T c035t = C035T.LIZ;
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1553);
            c035t.getClass();
            C035T.LIZ(awS545S0100000_1);
            return C13BV.INSTANCE;
        }
        C033V c033vLIZIZ = LIZIZ(c033v);
        if (c033vLIZIZ == null) {
            C035T c035t2 = C035T.LIZ;
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(this, 1554);
            c035t2.getClass();
            C035T.LIZ(awS545S0100000_12);
            return C13BV.INSTANCE;
        }
        C032J c032jLIZ = c032f.LIZJ.LIZ(this.LIZ);
        if (c032jLIZ != null) {
            c032jLIZ.LIZ = c033v;
        }
        this.LIZIZ = function12;
        List<AbstractC723102s1> listLIZJ = LIZJ(c032f, c033vLIZIZ);
        this.LIZIZ = null;
        return listLIZJ;
    }
}
