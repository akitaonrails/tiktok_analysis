package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.12cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C19796712cv {
    public static InterfaceC19797112cz LIZ(InterfaceC19797012cy interfaceC19797012cy, C19797512d3 c19797512d3, C19795712cl c19795712cl, List list) {
        if (interfaceC19797012cy.LJIIIZ(c19797512d3.LL)) {
            InterfaceC19797112cz interfaceC19797112czLJIIIIZZ = interfaceC19797012cy.LJIIIIZZ(c19797512d3.LL);
            if (interfaceC19797112czLJIIIIZZ instanceof AbstractC19795912cn) {
                return ((AbstractC19795912cn) interfaceC19797112czLJIIIIZZ).LIZ(c19795712cl, list);
            }
            throw new IllegalArgumentException(C786410Ut5.j4("%s is not a function", new Object[]{c19797512d3.LL}));
        }
        if ("hasOwnProperty".equals(c19797512d3.LL)) {
            C19796312cr.LJ(1, "hasOwnProperty", list);
            if (interfaceC19797012cy.LJIIIZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF())) {
                return InterfaceC19797112cz.LJIJ;
            }
            return InterfaceC19797112cz.LJIJI;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Object has no function %s", new Object[]{c19797512d3.LL}));
    }
}
