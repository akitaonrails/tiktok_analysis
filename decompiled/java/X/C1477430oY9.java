package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0oY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1477430oY9 extends AbstractC1477470oYD {
    public InterfaceC1475640oVG LIZ() {
        C1477370oY3 c1477370oY3 = new C1477370oY3(this.LIZ);
        List<? extends InterfaceC1477700oYa> list = this.LIZIZ;
        c1477370oY3.LIZIZ = list;
        c1477370oY3.LIZJ = this.LIZJ;
        c1477370oY3.LIZLLL = this.LIZLLL;
        if (list != null && !list.isEmpty()) {
            c1477370oY3.LJ = new C08FP[list.size()];
            for (int i = 0; i < list.size(); i++) {
                InterfaceC1477700oYa interfaceC1477700oYa = (InterfaceC1477700oYa) ListProtector.get(list, i);
                c1477370oY3.LJ[i] = new C08FP(interfaceC1477700oYa.getBitRate(), ((double) interfaceC1477700oYa.getNetworkLower()) * 8000.0d, 8000.0d * ((double) interfaceC1477700oYa.getNetworkUpper()));
            }
        }
        return c1477370oY3;
    }

    public C1477430oY9(InterfaceC1477480oYE interfaceC1477480oYE) {
        super(interfaceC1477480oYE);
    }
}
