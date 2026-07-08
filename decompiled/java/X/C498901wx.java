package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.01wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C498901wx implements InterfaceC498501wt {
    public List<? extends InterfaceC1381610m3b> LIZ;
    public final InterfaceC499101wz LIZIZ;
    public final InterfaceC499001wy LIZJ;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ()));

    @Override // X.InterfaceC498501wt
    public final void LIZ(String str, C498401ws c498401ws) {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C498801ww(this, str, c498401ws, null), 3);
    }

    public C498901wx(List list, InterfaceC499101wz interfaceC499101wz, C1385690mAB c1385690mAB) {
        this.LIZ = C13BV.INSTANCE;
        this.LIZIZ = interfaceC499101wz;
        this.LIZJ = c1385690mAB;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String itemId = ((InterfaceC1381610m3b) obj).getItemId();
            if (itemId != null && linkedHashSet.add(itemId)) {
                arrayList.add(obj);
            }
        }
        this.LIZ = arrayList;
    }
}
