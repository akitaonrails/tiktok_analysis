package X;

import java.util.List;

/* JADX INFO: renamed from: X.1AR1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AR1 {
    public static C1AR8 LIZ(C1AQY c1aqy) {
        int i = C1AQZ.LIZ[c1aqy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new C1AR8() { // from class: X.1AR3
                    @Override // X.C1AR8
                    public final InterfaceC2179261AQq LIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                        List<InterfaceC2179261AQq> listLIZIZ;
                        if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                            return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL(), listLIZIZ);
                        }
                        return null;
                    }

                    @Override // X.C1AR8
                    public final InterfaceC2179261AQq LIZIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                        List<InterfaceC2179261AQq> listLIZIZ;
                        if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                            return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL() + 1, listLIZIZ);
                        }
                        return null;
                    }

                    @Override // X.C1AR8
                    public final InterfaceC2179261AQq LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
                        List<InterfaceC2179261AQq> listLIZIZ;
                        if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                            return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL() - 1, listLIZIZ);
                        }
                        return null;
                    }
                };
            }
            return new C1AR8() { // from class: X.1AR2
                @Override // X.C1AR8
                public final InterfaceC2179261AQq LIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                    List<InterfaceC2179261AQq> listLIZIZ;
                    if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                        return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL(), listLIZIZ);
                    }
                    return null;
                }

                @Override // X.C1AR8
                public final InterfaceC2179261AQq LIZIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                    int iLJLJJL;
                    if (interfaceC2179131AQd == null) {
                        return null;
                    }
                    if (interfaceC2179131AQd.LJLJJL() + 1 > C1697810uHb.LJIIJ(interfaceC2179131AQd.LIZIZ())) {
                        iLJLJJL = 0;
                    } else {
                        iLJLJJL = interfaceC2179131AQd.LJLJJL() + 1;
                    }
                    return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(iLJLJJL, interfaceC2179131AQd.LIZIZ());
                }

                @Override // X.C1AR8
                public final InterfaceC2179261AQq LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
                    int iLJLJJL;
                    if (interfaceC2179131AQd == null) {
                        return null;
                    }
                    if (interfaceC2179131AQd.LJLJJL() - 1 < 0) {
                        iLJLJJL = C1697810uHb.LJIIJ(interfaceC2179131AQd.LIZIZ());
                    } else {
                        iLJLJJL = interfaceC2179131AQd.LJLJJL() - 1;
                    }
                    return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(iLJLJJL, interfaceC2179131AQd.LIZIZ());
                }
            };
        }
        return new C1AR8() { // from class: X.1AR4
            @Override // X.C1AR8
            public final InterfaceC2179261AQq LIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                List<InterfaceC2179261AQq> listLIZIZ;
                if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                    return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL(), listLIZIZ);
                }
                return null;
            }

            @Override // X.C1AR8
            public final InterfaceC2179261AQq LIZIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
                List<InterfaceC2179261AQq> listLIZIZ;
                if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                    return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL() + 1, listLIZIZ);
                }
                return null;
            }

            @Override // X.C1AR8
            public final InterfaceC2179261AQq LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
                List<InterfaceC2179261AQq> listLIZIZ;
                if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
                    return (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQd.LJLJJL() - 1, listLIZIZ);
                }
                return null;
            }
        };
    }
}
