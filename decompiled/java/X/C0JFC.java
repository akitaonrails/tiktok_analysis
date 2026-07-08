package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS251S0300000_7;

/* JADX INFO: renamed from: X.0JFC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1605720rt4 LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JFC(int i, LifecycleOwner lifecycleOwner, C1605720rt4 c1605720rt4) {
        super(0);
        this.LL = c1605720rt4;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer numValueOf;
        C1605720rt4 c1605720rt4 = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        int i = this.LLILLL;
        try {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            Iterator<T> it2 = c1605720rt4.LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                MutableLiveData mutableLiveData = (MutableLiveData) entry.getValue();
                synchronized (((ArrayList) c1605720rt4.LIZLLL.getValue())) {
                    try {
                        ((ArrayList) c1605720rt4.LIZLLL.getValue()).remove(Integer.valueOf(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                mutableLiveData.removeObservers(lifecycleOwner);
                if (!mutableLiveData.hasObservers()) {
                    linkedHashSet.add(entry.getKey());
                }
            }
            if (!linkedHashSet.isEmpty()) {
                C118300cf c118300cf = new C118300cf();
                for (String str : linkedHashSet) {
                    c1605720rt4.LIZIZ().remove(str);
                    C727780Sgi c727780Sgi = c1605720rt4.LIZJ().get(str);
                    if (c727780Sgi != null && (numValueOf = Integer.valueOf(c727780Sgi.LIZ)) != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == -1)) {
                        c1605720rt4.LIZJ().remove(str);
                        c118300cf.element++;
                    }
                }
                C01GW c01gw = C1605690rt1.LIZ;
                C1605690rt1.LIZ(new AwS251S0300000_7(c1605720rt4, (C1605720rt4) linkedHashSet, (Set<String>) c118300cf, (C118300cf) 20));
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        return Unit.LIZ;
    }
}
