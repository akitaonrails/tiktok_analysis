package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697240RWo implements InterfaceC697640RYc {
    public final ConcurrentHashMap<String, Function1<Boolean, Unit>> LL = new ConcurrentHashMap<>();

    public final void LIZ(String str, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (str == null) {
            Iterator<Map.Entry<String, Function1<Boolean, Unit>>> it2 = this.LL.entrySet().iterator();
            while (it2.hasNext()) {
                Function1<Boolean, Unit> value = it2.next().getValue();
                if (!z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                value.invoke(Boolean.valueOf(z2));
            }
            this.LL.clear();
            return;
        }
        Function1<Boolean, Unit> function1Remove = this.LL.remove(str);
        if (function1Remove != null) {
            if (z) {
                z3 = false;
            }
            function1Remove.invoke(Boolean.valueOf(z3));
        }
    }

    @Override // X.InterfaceC697640RYc
    public final void rk(C0RZK c0rzk, Function1<? super Boolean, Unit> function1) {
        this.LL.put(c0rzk.LLLII(), function1);
    }
}
