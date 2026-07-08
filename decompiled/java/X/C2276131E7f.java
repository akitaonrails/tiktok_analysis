package X;

import com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1E7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276131E7f {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(C1E7L c1e7l) {
        int i = C1E7M.LIZ[c1e7l.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            ((IAuthFrequencyService) C2276121E7e.LIZ.getValue()).LJIILJJIL();
                            return;
                        }
                        return;
                    }
                    ((IAuthFrequencyService) C2276121E7e.LIZ.getValue()).LJIILIIL();
                    return;
                }
                ((IEmailFrequencyService) C2276121E7e.LIZLLL.getValue()).LIZLLL();
                return;
            }
            ((IBigCardFrequencyService) C2276121E7e.LIZJ.getValue()).LJIIL();
            return;
        }
        ((IBigCardFrequencyService) C2276121E7e.LIZJ.getValue()).LJII();
    }

    public static void LIZLLL(C1E7L c1e7l) {
        int i = C1E7M.LIZ[c1e7l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            ((IEmailFrequencyService) C2276121E7e.LIZLLL.getValue()).LIZ();
                            return;
                        }
                        return;
                    }
                    ((IBigCardFrequencyService) C2276121E7e.LIZJ.getValue()).LJ();
                    return;
                }
                ((IBigCardFrequencyService) C2276121E7e.LIZJ.getValue()).LJIIJJI();
                return;
            }
            ((IRecUserPopFrequencyService) C2276121E7e.LIZIZ.getValue()).LIZ();
            return;
        }
        ((IAuthFrequencyService) C2276121E7e.LIZ.getValue()).LIZ();
    }

    public static boolean LIZ(C1E7L c1e7l, InterfaceC995310c0X interfaceC995310c0X) {
        List listLJIIJJI;
        if (interfaceC995310c0X != null) {
            int i = C1E7T.LIZ[c1e7l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ((IBigCardFrequencyService) C2276081E7a.LIZIZ.getValue()).LJFF(interfaceC995310c0X);
                        }
                    } else {
                        ((IBigCardFrequencyService) C2276081E7a.LIZIZ.getValue()).LJIIIIZZ(interfaceC995310c0X);
                    }
                } else {
                    ((IAuthFrequencyService) C2276081E7a.LIZ.getValue()).LJIIJJI(interfaceC995310c0X);
                }
            } else {
                ((IAuthFrequencyService) C2276081E7a.LIZ.getValue()).LJIILLIIL(interfaceC995310c0X);
            }
        }
        switch (C1E7N.LIZ[c1e7l.ordinal()]) {
            case 1:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7i
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(617));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(618));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7Q.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IEmailFrequencyService) this.LIZIZ.getValue()).LIZJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIIZZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIZ();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7j
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276181E7k());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276221E7o());
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C2276191E7l());
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276211E7n());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7P.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            return false;
                                        }
                                        return ((IEmailFrequencyService) this.LIZLLL.getValue()).LIZIZ();
                                    }
                                    return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJIIJ();
                                }
                                return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJI();
                            }
                            return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LIZIZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7h
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(619));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(620));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7S.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7Y
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(621));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7U.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return false;
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJI();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJFF();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7X
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(616));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        IAuthFrequencyService iAuthFrequencyService;
                        if (C1E7W.LIZ[c1e7l2.ordinal()] != 1 || (iAuthFrequencyService = (IAuthFrequencyService) this.LIZ.getValue()) == null) {
                            return true;
                        }
                        return iAuthFrequencyService.LJIILL();
                    }
                });
                break;
            case 2:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7i
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(617));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(618));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7Q.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IEmailFrequencyService) this.LIZIZ.getValue()).LIZJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIIZZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIZ();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7h
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(619));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(620));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7S.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7Y
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(621));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7U.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return false;
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJI();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJFF();
                    }
                });
                break;
            case 3:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7j
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276181E7k());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276221E7o());
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C2276191E7l());
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276211E7n());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7P.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            return false;
                                        }
                                        return ((IEmailFrequencyService) this.LIZLLL.getValue()).LIZIZ();
                                    }
                                    return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJIIJ();
                                }
                                return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJI();
                            }
                            return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LIZIZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7g
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276231E7p());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276201E7m());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7R.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                            }
                            return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                        }
                        return ((IRecUserPopFrequencyService) this.LIZ.getValue()).LIZLLL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7h
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(619));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(620));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7S.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJ();
                    }
                });
                break;
            case 4:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7j
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276181E7k());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276221E7o());
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C2276191E7l());
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276211E7n());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7P.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            return false;
                                        }
                                        return ((IEmailFrequencyService) this.LIZLLL.getValue()).LIZIZ();
                                    }
                                    return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJIIJ();
                                }
                                return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJI();
                            }
                            return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LIZIZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7g
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276231E7p());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276201E7m());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7R.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                            }
                            return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                        }
                        return ((IRecUserPopFrequencyService) this.LIZ.getValue()).LIZLLL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7b
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276101E7c());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7V.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return false;
                            }
                            return ((IBigCardFrequencyService) this.LIZ.getValue()).LJIIIZ();
                        }
                        return ((IBigCardFrequencyService) this.LIZ.getValue()).LJIILIIL();
                    }
                });
                break;
            case 5:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7j
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276181E7k());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276221E7o());
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C2276191E7l());
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276211E7n());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7P.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            return false;
                                        }
                                        return ((IEmailFrequencyService) this.LIZLLL.getValue()).LIZIZ();
                                    }
                                    return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJIIJ();
                                }
                                return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJI();
                            }
                            return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LIZIZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7g
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276231E7p());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276201E7m());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7R.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                            }
                            return ((IBigCardFrequencyService) this.LIZIZ.getValue()).LIZLLL();
                        }
                        return ((IRecUserPopFrequencyService) this.LIZ.getValue()).LIZLLL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7b
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276101E7c());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7V.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return false;
                            }
                            return ((IBigCardFrequencyService) this.LIZ.getValue()).LJIIIZ();
                        }
                        return ((IBigCardFrequencyService) this.LIZ.getValue()).LJIILIIL();
                    }
                });
                break;
            case 6:
                listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC2276241E7q() { // from class: X.1E7j
                    public final C01GW LIZ = C452501pT.LIZIZ(new C2276181E7k());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276221E7o());
                    public final C01GW LIZJ = C452501pT.LIZIZ(new C2276191E7l());
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276211E7n());

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7P.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            return false;
                                        }
                                        return ((IEmailFrequencyService) this.LIZLLL.getValue()).LIZIZ();
                                    }
                                    return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJIIJ();
                                }
                                return ((IBigCardFrequencyService) this.LIZJ.getValue()).LJI();
                            }
                            return ((IRecUserPopFrequencyService) this.LIZIZ.getValue()).LIZIZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIL();
                    }
                }, new InterfaceC2276241E7q() { // from class: X.1E7i
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(617));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(618));

                    @Override // X.InterfaceC2276241E7q
                    public final boolean LIZ(C1E7L c1e7l2) {
                        int i2 = C1E7Q.LIZ[c1e7l2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                return ((IEmailFrequencyService) this.LIZIZ.getValue()).LIZJ();
                            }
                            return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIIZZ();
                        }
                        return ((IAuthFrequencyService) this.LIZ.getValue()).LJIIIZ();
                    }
                });
                break;
            default:
                listLJIIJJI = C13BV.INSTANCE;
                break;
        }
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!((InterfaceC2276241E7q) it2.next()).LIZ(c1e7l)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZIZ(C1E7L c1e7l, InterfaceC1156820gD2 interfaceC1156820gD2) {
        int i = C1E7M.LIZ[c1e7l.ordinal()];
        if (i != 2) {
            if (i == 8) {
                ((IBigCardFrequencyService) C2276121E7e.LIZJ.getValue()).LIZJ(interfaceC1156820gD2);
                return;
            }
            return;
        }
        ((IRecUserPopFrequencyService) C2276121E7e.LIZIZ.getValue()).LIZJ(interfaceC1156820gD2);
    }
}
