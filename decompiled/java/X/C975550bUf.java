package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975550bUf {
    public AbstractC986700bme LIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public EnumC919170a1j LJI;
    public InterfaceC963620bBQ LJIIIIZZ;
    public final List<InterfaceC975560bUg> LIZIZ = new ArrayList();
    public final List<InterfaceC975560bUg> LIZJ = new ArrayList();
    public EnumC976700bWW LJII = EnumC976700bWW.NONE;

    public final List<InterfaceC975560bUg> LIZJ() {
        return C13LP.LJLIL(this.LIZJ, this.LIZIZ);
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearComponents, p0=");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        sbLIZ.append(", p1=");
        sbLIZ.append(((ArrayList) this.LIZJ).size());
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<InterfaceC975560bUg> it2 = LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZJ).clear();
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = null;
        this.LJII = EnumC976700bWW.NONE;
        this.LJIIIIZZ = null;
        this.LIZ = null;
    }

    public final void LIZ(List<? extends InterfaceC975560bUg> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addComponents, components=");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC975560bUg interfaceC975560bUg : (ArrayList) list) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addComponent, component=");
            sbLIZ2.append(interfaceC975560bUg);
            sbLIZ2.append(", priority=");
            sbLIZ2.append(interfaceC975560bUg.getPriority());
            C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ2));
            int i = C976710bWX.LIZ[interfaceC975560bUg.getPriority().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ((ArrayList) this.LIZJ).add(interfaceC975560bUg);
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((ArrayList) this.LIZIZ).add(interfaceC975560bUg);
            }
        }
    }

    public final void LIZLLL(EnumC919170a1j enumC919170a1j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Initialized match type: ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJI = enumC919170a1j;
        Iterator<InterfaceC975560bUg> it2 = LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJI(enumC919170a1j);
        }
    }

    public final void LJ(MatchBaseWidget matchBaseWidget) {
        if (this.LIZLLL) {
            C20441214yg.LIZIZ("InteractiveModeComponentManager", "loadP0Components, already loaded, skip");
            return;
        }
        this.LIZLLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadP0Components, count=");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC975560bUg interfaceC975560bUg : this.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadComponent: ");
            sbLIZ2.append(interfaceC975560bUg.getClass().getSimpleName());
            sbLIZ2.append(", priority=P0, timing=INIT");
            C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC975560bUg.LIZLLL(matchBaseWidget);
        }
    }

    public final void LJFF(MatchBaseWidget matchBaseWidget) {
        if (this.LJ) {
            C20441214yg.LIZIZ("InteractiveModeComponentManager", "loadP1Components, already loaded, skip");
            return;
        }
        this.LJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadP1Components, count=");
        sbLIZ.append(((ArrayList) this.LIZJ).size());
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC975560bUg interfaceC975560bUg : this.LIZJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadComponent: ");
            sbLIZ2.append(interfaceC975560bUg.getClass().getSimpleName());
            sbLIZ2.append(", priority=P1, timing=DELAYED");
            C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC975560bUg.LIZLLL(matchBaseWidget);
        }
        if (this.LJII != EnumC976700bWW.NONE) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reDispatchCurrentStateToP1Components, status=");
            sbLIZ3.append(this.LJII);
            C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ3));
            for (InterfaceC975560bUg interfaceC975560bUg2 : (ArrayList) this.LIZJ) {
                int i = C976710bWX.LIZIZ[this.LJII.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    interfaceC975560bUg2.LJIIIIZZ(this.LJIIIIZZ);
                                }
                            } else {
                                interfaceC975560bUg2.LJIIIZ(this.LJIIIIZZ);
                            }
                        } else {
                            interfaceC975560bUg2.LJ(this.LJIIIIZZ);
                        }
                    } else {
                        interfaceC975560bUg2.LJFF(this.LJIIIIZZ);
                    }
                } else {
                    interfaceC975560bUg2.LJIIJJI(this.LJIIIIZZ);
                }
            }
        }
    }

    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIMMessage, message=");
        sbLIZ.append(abstractC1136060ffY);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<InterfaceC975560bUg> it2 = LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJII(abstractC1136060ffY);
        }
    }

    public final void LJI(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudienceInfo info: ");
        sbLIZ.append(abstractC970850bN5);
        sbLIZ.append(", scene: ");
        sbLIZ.append(enumC970440bMQ);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((ArrayList) LIZJ()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC975560bUg) it2.next()).LJIIL(abstractC970850bN5, enumC970440bMQ);
        }
    }

    public final void LJIIIIZZ(List<C954460awe> list, List<C954460awe> list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserListChange, list=");
        sbLIZ.append(list);
        sbLIZ.append(", oldList=");
        sbLIZ.append(list2);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((ArrayList) LIZJ()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC975560bUg) it2.next()).vc(list, list2);
        }
    }

    public final void LJIIIZ(EnumC976700bWW enumC976700bWW, InterfaceC963620bBQ interfaceC963620bBQ) {
        if (this.LJII == enumC976700bWW) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("already in ");
            sbLIZ.append(this.LJII);
            sbLIZ.append(", not repeat enter");
            C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJII = enumC976700bWW;
        this.LJIIIIZZ = interfaceC963620bBQ;
        for (InterfaceC975560bUg interfaceC975560bUg : LIZJ()) {
            int i = C976710bWX.LIZIZ[enumC976700bWW.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                interfaceC975560bUg.LJIIIIZZ(interfaceC963620bBQ);
                            }
                        } else {
                            interfaceC975560bUg.LJIIIZ(interfaceC963620bBQ);
                        }
                    } else {
                        interfaceC975560bUg.LJ(interfaceC963620bBQ);
                    }
                } else {
                    interfaceC975560bUg.LJFF(interfaceC963620bBQ);
                }
            } else {
                interfaceC975560bUg.LJIIJJI(interfaceC963620bBQ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("State did enter: ");
        sbLIZ2.append(enumC976700bWW);
        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
