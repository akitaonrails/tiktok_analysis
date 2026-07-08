package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0oY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1477410oY7 implements InterfaceC1475640oVG {
    public final InterfaceC1477480oYE LIZ;
    public List<? extends InterfaceC1477700oYa> LIZIZ;
    public List<? extends InterfaceC1477690oYZ> LIZJ;
    public InterfaceC1475360oUo LIZLLL;

    public AbstractC1477410oY7(InterfaceC1477480oYE interfaceC1477480oYE) {
        this.LIZ = interfaceC1477480oYE;
    }

    @Override // X.InterfaceC1475640oVG
    public final void LIZ(InterfaceC1475360oUo interfaceC1475360oUo) {
        this.LIZLLL = interfaceC1475360oUo;
    }

    public final <T extends InterfaceC1477220oXo> List<T> LIZJ(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.LIZ != null && !list.isEmpty()) {
            Pair<Double, Double> pairLIZLLL = this.LIZ.LIZLLL();
            Set<String> setLIZ = this.LIZ.LIZ();
            if (pairLIZLLL != null && this.LIZ.LIZJ() > 0.0d) {
                z = true;
            } else {
                z = false;
            }
            for (T t : list) {
                if (z) {
                    double bitRate = t.getBitRate();
                    if (bitRate >= ((Double) pairLIZLLL.first).doubleValue() && bitRate <= ((Double) pairLIZLLL.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (setLIZ != null && setLIZ.contains(t.getGearName())) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 == null || Math.abs(((double) t3.getBitRate()) - this.LIZ.LIZJ()) < Math.abs(((double) t2.getBitRate()) - this.LIZ.LIZJ())) {
                            t2 = t3;
                        }
                    }
                    arrayList.add(t2);
                    return arrayList;
                }
                arrayList.add(ListProtector.get(list, 0));
            }
        }
        return arrayList;
    }
}
