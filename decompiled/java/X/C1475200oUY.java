package X;

import android.util.Pair;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475200oUY implements InterfaceC1475560oV8 {
    public final /* synthetic */ SimVideoUrlModel LIZ;
    public final /* synthetic */ C0NI4 LIZIZ;
    public final /* synthetic */ C1475090oUN LIZJ;

    @Override // X.InterfaceC1475560oV8
    public final void LIZ(C1475490oV1 c1475490oV1) {
        InterfaceC1475420oUu interfaceC1475420oUu;
        if (this.LIZ != null) {
            int i = c1475490oV1.LIZ;
            if (i != 2) {
                if (i != 3) {
                    if (i == 5) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.LIZ);
                        Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ.LIZ.LJIILLIIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1475290oUh) it2.next()).LIZLLL(arrayList);
                        }
                    }
                } else {
                    Iterator it3 = ((CopyOnWriteArrayList) this.LIZJ.LIZ.LJIILLIIL).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1475290oUh) it3.next()).LJFF(this.LIZ);
                    }
                }
            } else {
                C1475430oUv c1475430oUv = c1475490oV1.LIZIZ;
                if (c1475430oUv != null && c1475430oUv.LJ >= 102400) {
                    Iterator it4 = ((CopyOnWriteArrayList) this.LIZJ.LIZ.LJIILLIIL).iterator();
                    while (it4.hasNext()) {
                        ((InterfaceC1475290oUh) it4.next()).LIZJ(Pair.create(this.LIZ, c1475490oV1.LIZIZ.LIZJ));
                    }
                }
            }
        }
        C0NI4 c0ni4 = this.LIZIZ;
        if (c0ni4 != null && (interfaceC1475420oUu = c0ni4.LIZLLL) != null) {
            C1475430oUv c1475430oUv2 = c1475490oV1.LIZIZ;
            if (c1475430oUv2 == null) {
                interfaceC1475420oUu.LIZ(c1475490oV1.LIZ, 0L, 0L, c1475490oV1.LIZLLL);
                this.LIZIZ.LIZLLL.LIZIZ(c1475490oV1.LIZ, 0L, c1475490oV1.LIZLLL, "");
            } else {
                interfaceC1475420oUu.LIZ(c1475490oV1.LIZ, c1475430oUv2.LIZLLL, c1475430oUv2.LJ, c1475490oV1.LIZLLL);
                this.LIZIZ.LIZLLL.LIZIZ(c1475490oV1.LIZ, c1475430oUv2.LIZLLL, c1475490oV1.LIZLLL, c1475430oUv2.LIZJ);
            }
        }
    }

    public C1475200oUY(C1475090oUN c1475090oUN, SimVideoUrlModel simVideoUrlModel, C0NI4 c0ni4) {
        this.LIZJ = c1475090oUN;
        this.LIZ = simVideoUrlModel;
        this.LIZIZ = c0ni4;
    }
}
