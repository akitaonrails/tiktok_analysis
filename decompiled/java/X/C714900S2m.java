package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0S2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714900S2m implements InterfaceC714910S2n, InterfaceC714920S2o {
    public final ArrayList<InterfaceC714910S2n> LIZ = new ArrayList<>();
    public final ArrayList<Integer> LIZIZ = new ArrayList<>();
    public boolean LIZJ;

    @Override // X.InterfaceC714910S2n
    public final void LIZ() {
        if (this.LIZJ) {
            Iterator<InterfaceC714910S2n> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            this.LIZJ = false;
        }
    }

    @Override // X.InterfaceC714920S2o
    public final void LIZLLL() {
        for (InterfaceC714910S2n interfaceC714910S2n : this.LIZ) {
            if (interfaceC714910S2n instanceof InterfaceC714920S2o) {
                ((InterfaceC714920S2o) interfaceC714910S2n).LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC714910S2n
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    public final void LJFF(InterfaceC714910S2n interfaceC714910S2n) {
        this.LIZ.add(interfaceC714910S2n);
        this.LIZIZ.add(0);
    }

    @Override // X.InterfaceC714920S2o
    public final void LIZIZ(C690380R6e c690380R6e, InterfaceC715010S2x interfaceC715010S2x) {
        for (InterfaceC714910S2n interfaceC714910S2n : this.LIZ) {
            if (interfaceC714910S2n instanceof InterfaceC714920S2o) {
                ((InterfaceC714920S2o) interfaceC714910S2n).LIZIZ(c690380R6e, interfaceC715010S2x);
            }
        }
    }

    @Override // X.InterfaceC714910S2n
    public final void LJ(InterfaceC690390R6f interfaceC690390R6f, View view, InterfaceC715010S2x interfaceC715010S2x) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            Integer num = (Integer) ListProtector.get(this.LIZIZ, i);
            if (num != null && num.intValue() == 0) {
                ((InterfaceC714910S2n) ListProtector.get(this.LIZ, i)).LJ(interfaceC690390R6f, view, interfaceC715010S2x);
            } else {
                ((InterfaceC714910S2n) ListProtector.get(this.LIZ, i)).LJ(interfaceC690390R6f, view.findViewById(((Number) ListProtector.get(this.LIZIZ, i)).intValue()), interfaceC715010S2x);
            }
        }
        this.LIZJ = true;
    }
}
