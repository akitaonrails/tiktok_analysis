package X;

import java.util.List;

/* JADX INFO: renamed from: X.0d5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1037060d5s implements InterfaceC1037120d5y {
    public abstract List<InterfaceC1037120d5y> LIZJ();

    @Override // X.InterfaceC1037120d5y
    public C0CFU getType() {
        return C0CFU.COMMON;
    }

    @Override // X.InterfaceC1037120d5y
    public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
        if (LIZJ().isEmpty()) {
            return EnumC1002230cBh.DONE;
        }
        for (InterfaceC1037120d5y interfaceC1037120d5y : LIZJ()) {
            EnumC1002230cBh enumC1002230cBhLIZ = interfaceC1037120d5y.LIZ(c1037110d5x);
            EnumC1002230cBh enumC1002230cBh = EnumC1002230cBh.PENDING;
            if (enumC1002230cBhLIZ == enumC1002230cBh) {
                return enumC1002230cBh;
            }
            EnumC1002230cBh enumC1002230cBhLIZ2 = interfaceC1037120d5y.LIZ(c1037110d5x);
            EnumC1002230cBh enumC1002230cBh2 = EnumC1002230cBh.READY;
            if (enumC1002230cBhLIZ2 == enumC1002230cBh2) {
                return enumC1002230cBh2;
            }
        }
        return EnumC1002230cBh.DONE;
    }

    @Override // X.InterfaceC1037120d5y
    public final String LIZIZ(C1037110d5x c1037110d5x) {
        for (InterfaceC1037120d5y interfaceC1037120d5y : LIZJ()) {
            if (interfaceC1037120d5y.LIZ(c1037110d5x) == EnumC1002230cBh.PENDING) {
                return "";
            }
            if (interfaceC1037120d5y.LIZ(c1037110d5x) == EnumC1002230cBh.READY) {
                return interfaceC1037120d5y.LIZIZ(c1037110d5x);
            }
        }
        return "";
    }
}
