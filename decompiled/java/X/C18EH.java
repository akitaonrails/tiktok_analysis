package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18EH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EH<T> {
    public static boolean LJ;
    public static final C01GW<Integer> LJFF = C452501pT.LIZIZ(new AnonymousClass1898());
    public static final C01GW<Boolean> LJI = C452501pT.LIZIZ(new C1866400yfW());
    public static final C01GW<Boolean> LJII = C452501pT.LIZIZ(new C1866390yfV());
    public static final C01GW<Boolean> LJIIIIZZ = C452501pT.LIZIZ(new C1866380yfU());
    public final Function1<T, String> LIZ;
    public final Function1<String, T> LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    public final void LIZ(String str) {
        if (C18GB.LIZIZ()) {
            ((Keva) this.LIZLLL.getValue()).erase(str);
            return;
        }
        C18G6 c18g6 = (C18G6) this.LIZJ.getValue();
        if (c18g6 == null) {
            return;
        }
        c18g6.LIZIZ.remove(str);
        c18g6.LIZIZ.apply();
    }

    public final T LIZIZ(String str) {
        String strLIZIZ;
        if (C18GB.LIZIZ()) {
            return this.LIZIZ.invoke(((Keva) this.LIZLLL.getValue()).getString(str, ""));
        }
        Function1<String, T> function1 = this.LIZIZ;
        C18G6 c18g6 = (C18G6) this.LIZJ.getValue();
        if (c18g6 != null) {
            strLIZIZ = c18g6.LIZIZ(str, "");
        } else {
            strLIZIZ = null;
        }
        return function1.invoke(strLIZIZ);
    }

    public final boolean LIZJ(Map<String, ? super T> map) {
        Map<String, ?> all;
        String str;
        String str2;
        boolean z = false;
        try {
            Unit unit = null;
            if (C18GB.LIZIZ()) {
                for (Map.Entry<String, ?> entry : ((Keva) this.LIZLLL.getValue()).getAll().entrySet()) {
                    Function1<String, T> function1 = this.LIZIZ;
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        str2 = (String) value;
                    } else {
                        str2 = null;
                    }
                    T tInvoke = function1.invoke(str2);
                    if (tInvoke != null) {
                        map.put(entry.getKey(), tInvoke);
                        z = true;
                    }
                }
                unit = Unit.LIZ;
            } else {
                C18G6 c18g6 = (C18G6) this.LIZJ.getValue();
                if (c18g6 != null && (all = c18g6.LIZ.getAll()) != null) {
                    for (Map.Entry<String, ?> entry2 : all.entrySet()) {
                        Function1<String, T> function12 = this.LIZIZ;
                        Object value2 = entry2.getValue();
                        if (value2 instanceof String) {
                            str = (String) value2;
                        } else {
                            str = null;
                        }
                        T tInvoke2 = function12.invoke(str);
                        if (tInvoke2 != null) {
                            map.put(entry2.getKey(), tInvoke2);
                            z = true;
                        }
                    }
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return z;
        }
    }

    public final void LJFF(Object obj, String str) {
        if (C18GB.LIZIZ()) {
            Keva keva = (Keva) this.LIZLLL.getValue();
            if (keva != null) {
                keva.storeString(str, this.LIZ.invoke(obj));
                return;
            }
            return;
        }
        C18G6 c18g6 = (C18G6) this.LIZJ.getValue();
        if (c18g6 == null) {
            return;
        }
        c18g6.LIZJ(str, this.LIZ.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18EH(String str, Function1<? super T, String> function1, Function1<? super String, ? extends T> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = C452501pT.LIZIZ(new C18DM(str));
        this.LIZLLL = C452501pT.LIZIZ(new C21256218Gi(str));
    }

    public final void LIZLLL(Object obj, String str, boolean z) {
        if (C18GB.LIZ() && !z) {
            C18GQ.LL.getClass();
            try {
                ((LinkedBlockingDeque) C18GQ.LLILLJJLI.getValue()).offer(new C18GR(this, str, obj));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        LJFF(obj, str);
    }
}
