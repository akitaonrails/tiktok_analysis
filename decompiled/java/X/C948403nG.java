package X;

import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C948403nG<T> {
    public T LIZ;
    public final ConcurrentHashMap<InterfaceC2217241BqE<T, ?>, Function2<T, T, Unit>> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1508));

    public C948403nG(T t) {
        this.LIZ = t;
    }

    public final void LIZ(Function1<? super T, ? extends T> function1) {
        T tInvoke = function1.invoke(this.LIZ);
        if (Intrinsics.LJFF(this.LIZ, tInvoke)) {
            return;
        }
        synchronized (this) {
            T t = this.LIZ;
            Iterator<Map.Entry<InterfaceC2217241BqE<T, ?>, Function2<T, T, Unit>>> it2 = this.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().invoke(t, tInvoke);
            }
            this.LIZ = tInvoke;
            ((MutableLiveData) this.LIZJ.getValue()).setValue(this.LIZ);
        }
    }
}
