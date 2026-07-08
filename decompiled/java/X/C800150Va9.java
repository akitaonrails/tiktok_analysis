package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Va9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800150Va9 implements InterfaceC473930IiF {
    public final List<C800160VaA> LIZ = new ArrayList();
    public final List<C800160VaA> LIZIZ = new ArrayList();
    public final List<C800160VaA> LIZJ = new ArrayList();
    public final InterfaceC800110Va5 LIZLLL;

    public C800150Va9(InterfaceC800110Va5 interfaceC800110Va5) {
        this.LIZLLL = interfaceC800110Va5;
    }

    @Override // X.InterfaceC473930IiF
    public final C799890VZj LIZ(EnumC800210VaF enumC800210VaF) {
        C799890VZj c799890VZj = new C799890VZj();
        synchronized (this) {
            try {
                if (C800220VaG.LIZ[enumC800210VaF.ordinal()] == 2) {
                    Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                    while (it2.hasNext()) {
                        c799890VZj.LIZ(((C800160VaA) it2.next()).LIZ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c799890VZj;
    }

    public final List<C800160VaA> LIZIZ(EnumC800210VaF enumC800210VaF) throws Throwable {
        synchronized (this) {
            try {
                try {
                    try {
                        int i = C800220VaG.LIZ[enumC800210VaF.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    try {
                                        List<C800160VaA> listEmptyList = Collections.emptyList();
                                        try {
                                            return listEmptyList;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    try {
                                        try {
                                            try {
                                                ArrayList arrayList = new ArrayList(this.LIZIZ);
                                                try {
                                                    return arrayList;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                }
                            } else {
                                try {
                                    try {
                                        try {
                                            ArrayList arrayList2 = new ArrayList(this.LIZJ);
                                            try {
                                                return arrayList2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            }
                        } else {
                            try {
                                try {
                                    try {
                                        ArrayList arrayList3 = new ArrayList(this.LIZ);
                                        try {
                                            return arrayList3;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                            }
                        }
                    } catch (Throwable th15) {
                        th = th15;
                    }
                } catch (Throwable th16) {
                    th = th16;
                }
            } catch (Throwable th17) {
                th = th17;
            }
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th18) {
                        th = th18;
                    }
                } catch (Throwable th19) {
                    th = th19;
                }
            }
        }
    }

    public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2 == null) {
            return;
        }
        synchronized (this) {
            try {
                List<C800160VaA> list = this.LIZIZ;
                String strKey = interfaceC800080Va2.key();
                interfaceC800080Va2.triggerType();
                ((ArrayList) list).add(new C800160VaA(strKey));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2 == null) {
            return;
        }
        synchronized (this) {
            try {
                List<C800160VaA> list = this.LIZ;
                String strKey = interfaceC800080Va2.key();
                interfaceC800080Va2.triggerType();
                ((ArrayList) list).add(new C800160VaA(strKey));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2 == null) {
            return;
        }
        synchronized (this) {
            try {
                ((ArrayList) this.LIZJ).add(new C800160VaA(interfaceC800080Va2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
