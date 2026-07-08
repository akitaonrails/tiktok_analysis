package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.017C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017C implements C017D {
    public final List<InterfaceC1282004zy> LIZ = new ArrayList();

    @Override // X.C017D
    public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
        List<InterfaceC1282004zy> list2 = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (C13LP.LJJJJ(obj.getClass(), list)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LIZIZ(InterfaceC1282004zy interfaceC1282004zy) {
        if (interfaceC1282004zy != null) {
            ((ArrayList) this.LIZ).add(interfaceC1282004zy);
        }
    }
}
