package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import iyl.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1651610t55 implements InterfaceC1657840tF8 {
    public final LifecycleOwner LL;
    public final Map<Integer, Pair<Integer, i3>> LLILLJJLI = new LinkedHashMap();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(433));
    public List<i3> LLILZ;

    @Override // X.InterfaceC1657840tF8
    public final C19475711Hn LIZ() {
        C11NZ c11nz = (C11NZ) this.LLILLL.getValue();
        c11nz.getClass();
        return new C19475711Hn(c11nz);
    }

    @Override // X.InterfaceC1657840tF8
    public final void LJ() {
        List<i3> list = this.LLILZ;
        if (list != null) {
            LIZJ(list, false, null);
        }
    }

    public final i3 LJFF() {
        List<i3> list = this.LLILZ;
        if (list == null) {
            return null;
        }
        Pair pair = (Pair) ((LinkedHashMap) this.LLILLJJLI).get(1800);
        if (pair != null) {
            return (i3) pair.getSecond();
        }
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((i3) it2.next()).LLILLL.getType() == 1800) {
                if (i < 0) {
                    return null;
                }
                i3 i3Var = (i3) ListProtector.get(list, i);
                this.LLILLJJLI.put(1800, new Pair<>(Integer.valueOf(i), i3Var));
                return i3Var;
            }
            i++;
        }
        return null;
    }

    @Override // X.InterfaceC1657840tF8
    public final List<i3> LIZLLL() {
        return this.LLILZ;
    }

    public AbstractC1651610t55(Scene scene) {
        this.LL = scene;
    }

    public final void LJI(int i, Function1<? super i3, i3> function1) {
        List<i3> list = this.LLILZ;
        if (list == null) {
            return;
        }
        Map<Integer, Pair<Integer, i3>> map = this.LLILLJJLI;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object pair = linkedHashMap.get(numValueOf);
        if (pair == null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((i3) it2.next()).LLILLL.getType() == i) {
                    if (i2 >= 0) {
                        pair = new Pair(Integer.valueOf(i2), ListProtector.get(list, i2));
                    }
                } else {
                    i2++;
                }
            }
            pair = null;
            linkedHashMap.put(numValueOf, pair);
        }
        Pair pair2 = (Pair) pair;
        if (pair2 != null) {
            i3 i3VarInvoke = function1.invoke(pair2.getSecond());
            if (!Intrinsics.LJFF(i3VarInvoke, ListProtector.get(list, ((Number) pair2.getFirst()).intValue()))) {
                ListProtector.set(list, ((Number) pair2.getFirst()).intValue(), function1.invoke(pair2.getSecond()));
                this.LLILLJJLI.put(Integer.valueOf(i), new Pair<>(pair2.getFirst(), i3VarInvoke));
                LIZJ(list, false, null);
            }
        }
    }

    @Override // X.InterfaceC1657840tF8
    public final void LIZJ(List<i3> list, boolean z, C1460190o6L c1460190o6L) {
        if (!Intrinsics.LJFF(this.LLILZ, list)) {
            this.LLILZ = new ArrayList(list);
            ((LinkedHashMap) this.LLILLJJLI).clear();
        }
        ((C11PQ) this.LLILLL.getValue()).onNext(new C1651600t54(list, z, c1460190o6L));
    }
}
