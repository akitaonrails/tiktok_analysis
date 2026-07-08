package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1753740vjo<V, R> extends C1753750vjp<V, R> {
    public C1753740vjo(int i, Function2<? super Context, ? super V, ? extends R> function2) {
        super(i, new AwS640S0100000_26((Function2) function2, 102));
    }

    public final R LIZJ(Context context, V v) {
        R rInvoke;
        C1753760vjq<V, R> next;
        int iIntValue;
        synchronized (this) {
            rInvoke = null;
            if (v != null) {
                Iterator<C1753760vjq<V, R>> it2 = this.LIZJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, v)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1753760vjq<V, R> c1753760vjq = next;
                if (c1753760vjq != null) {
                    this.LIZJ.remove(c1753760vjq);
                }
                if (c1753760vjq != null) {
                    rInvoke = c1753760vjq.LIZIZ;
                }
                if (rInvoke != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MainIdlePreloader get: ");
                    sbLIZ.append(v.getClass());
                    sbLIZ.append(' ');
                    sbLIZ.append(c1753760vjq.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    rInvoke = c1753760vjq.LIZIZ;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MainIdlePreloader get: miss ");
                    sbLIZ2.append(v.getClass());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    HashMap<V, Integer> map = this.LIZLLL;
                    Integer num = map.get(v);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(v, Integer.valueOf(Math.max(0, iIntValue) + 1));
                    rInvoke = this.LIZIZ.invoke(context, v);
                }
            }
        }
        if (v != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("MainIdlePreloader getView: ");
            sbLIZ3.append(v.getClass());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        return rInvoke;
    }
}
