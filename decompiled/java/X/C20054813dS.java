package X;

import androidx.compose.ui.focus.FocusTargetNode;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import p2.j1;

/* JADX INFO: renamed from: X.13dS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20054813dS {
    public static final C20028313Yb<Object> LIZ = C1691440u7K.LIZ();

    public static final boolean LJI(int i) {
        return (i & 128) != 0;
    }

    public static final void LIZJ(AbstractC20055413dY abstractC20055413dY) {
        if (!abstractC20055413dY.LLJILLL) {
            C1696250uF5.LIZIZ("autoInvalidateUpdatedNode called on unattached node");
        }
        LIZ(abstractC20055413dY, -1, 0);
    }

    public static final int LIZLLL(InterfaceC1672410tcd interfaceC1672410tcd) {
        int i;
        if (interfaceC1672410tcd instanceof InterfaceC20056613dk) {
            i = 3;
        } else {
            i = 1;
        }
        if (interfaceC1672410tcd instanceof InterfaceC1686360tz8) {
            i |= 4;
        }
        if (interfaceC1672410tcd instanceof InterfaceC20057713dv) {
            i |= 8;
        }
        if (interfaceC1672410tcd instanceof InterfaceC1672570tct) {
            i |= 16;
        }
        if ((interfaceC1672410tcd instanceof InterfaceC1697560uHC) || (interfaceC1672410tcd instanceof InterfaceC1685780tyC)) {
            i |= 32;
        }
        if (interfaceC1672410tcd instanceof InterfaceC20057513dt) {
            i |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        if (interfaceC1672410tcd instanceof InterfaceC20057613du) {
            i |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        if (interfaceC1672410tcd instanceof InterfaceC20058313e1) {
            i |= 256;
        }
        if (interfaceC1672410tcd instanceof InterfaceC20058213e0) {
            i |= 64;
        }
        if ((interfaceC1672410tcd instanceof InterfaceC20058013dy) || (interfaceC1672410tcd instanceof InterfaceC20058113dz)) {
            i |= 128;
        }
        if (interfaceC1672410tcd instanceof InterfaceC1696300uFA) {
            return i | 524288;
        }
        return i;
    }

    public static final int LJ(AbstractC20055413dY abstractC20055413dY) {
        int i;
        int i2;
        int i3 = abstractC20055413dY.LLILLL;
        if (i3 != 0) {
            return i3;
        }
        C20028313Yb<Object> c20028313Yb = LIZ;
        Class<?> cls = abstractC20055413dY.getClass();
        int iLIZ = c20028313Yb.LIZ(cls);
        if (iLIZ >= 0) {
            return c20028313Yb.LIZJ[iLIZ];
        }
        if (abstractC20055413dY instanceof InterfaceC20052813d8) {
            i = 3;
        } else {
            i = 1;
        }
        if (abstractC20055413dY instanceof InterfaceC1695680uEA) {
            i |= 4;
        }
        if (abstractC20055413dY instanceof InterfaceC20051113cr) {
            i |= 8;
        }
        if (abstractC20055413dY instanceof InterfaceC20056213dg) {
            i |= 16;
        }
        if (abstractC20055413dY instanceof InterfaceC1697440uH0) {
            i |= 32;
        }
        if (abstractC20055413dY instanceof InterfaceC20057313dr) {
            i |= 64;
        }
        if (abstractC20055413dY instanceof InterfaceC20056813dm) {
            i |= 128;
        }
        if (abstractC20055413dY instanceof InterfaceC20051913cz) {
            i |= 256;
        }
        if (abstractC20055413dY instanceof InterfaceC20052913d9) {
            i |= 512;
        }
        if (abstractC20055413dY instanceof FocusTargetNode) {
            i |= 1024;
        }
        if (abstractC20055413dY instanceof InterfaceC20057413ds) {
            i |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        if (abstractC20055413dY instanceof InterfaceC20051413cu) {
            i |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        if (abstractC20055413dY instanceof InterfaceC20062113ed) {
            i |= 8192;
        }
        if (abstractC20055413dY instanceof InterfaceC19369910qH) {
            i |= 16384;
        }
        if (abstractC20055413dY instanceof InterfaceC1693210uAB) {
            i |= 32768;
        }
        if (abstractC20055413dY instanceof InterfaceC20062613ei) {
            i |= 131072;
        }
        if (abstractC20055413dY instanceof InterfaceC1697480uH4) {
            i |= 262144;
        }
        if (abstractC20055413dY instanceof InterfaceC1696300uFA) {
            i |= 524288;
        }
        if (abstractC20055413dY instanceof InterfaceC20057913dx) {
            i2 = 1048576 | i;
        } else {
            i2 = i;
        }
        c20028313Yb.LJII(i2, cls);
        return i2;
    }

    public static final int LJFF(AbstractC20055413dY abstractC20055413dY) {
        if (abstractC20055413dY instanceof AbstractC20055313dX) {
            AbstractC20055313dX abstractC20055313dX = (AbstractC20055313dX) abstractC20055413dY;
            int iLJFF = abstractC20055313dX.LLJJ;
            for (AbstractC20055413dY abstractC20055413dY2 = abstractC20055313dX.LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                iLJFF |= LJFF(abstractC20055413dY2);
            }
            return iLJFF;
        }
        return LJ(abstractC20055413dY);
    }

    public static final void LIZ(AbstractC20055413dY abstractC20055413dY, int i, int i2) {
        if (abstractC20055413dY instanceof AbstractC20055313dX) {
            AbstractC20055313dX abstractC20055313dX = (AbstractC20055313dX) abstractC20055413dY;
            LIZIZ(abstractC20055413dY, abstractC20055313dX.LLJJ & i, i2);
            int i3 = (~abstractC20055313dX.LLJJ) & i;
            for (AbstractC20055413dY abstractC20055413dY2 = abstractC20055313dX.LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                LIZ(abstractC20055413dY2, i3, i2);
            }
            return;
        }
        LIZIZ(abstractC20055413dY, i & abstractC20055413dY.LLILLL, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(AbstractC20055413dY abstractC20055413dY, int i, int i2) {
        boolean z;
        if (i2 == 0 && !abstractC20055413dY.LLILLJJLI()) {
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (abstractC20055413dY instanceof InterfaceC20052813d8)) {
            C20052513d5.LJFF(abstractC20055413dY).LJJJJI();
            if (i2 == 2) {
                j1 j1VarLIZLLL = C20052513d5.LIZLLL(abstractC20055413dY, 2);
                j1VarLIZLLL.LLJJIJI = true;
                j1VarLIZLLL.LLJLLL.invoke();
                if (j1VarLIZLLL.LLJZIJLIL != null) {
                    if (j1VarLIZLLL.LLL != null) {
                        j1VarLIZLLL.LLL = null;
                    }
                    j1VarLIZLLL.LLJJ(null, false);
                    j1VarLIZLLL.LLJILJILJ.LJJL(false);
                }
            }
        }
        if ((i & 128) != 0 && (abstractC20055413dY instanceof InterfaceC20056813dm) && i2 != 2) {
            C20052513d5.LJFF(abstractC20055413dY).LJJJJI();
        }
        if ((i & 256) != 0 && (abstractC20055413dY instanceof InterfaceC20051913cz) && i2 != 2) {
            C20053713dH c20053713dHLJFF = C20052513d5.LJFF(abstractC20055413dY);
            if (!c20053713dHLJFF.LJJIIZI() && !c20053713dHLJFF.LJJIJ() && !c20053713dHLJFF.LLLI) {
                C1696120uEs.LIZ(c20053713dHLJFF).LJJIFFI(c20053713dHLJFF);
            }
        }
        if ((i & 4) != 0 && (abstractC20055413dY instanceof InterfaceC1695680uEA)) {
            C1691800u7u.LIZ((InterfaceC1695680uEA) abstractC20055413dY);
        }
        if ((i & 8) != 0 && (abstractC20055413dY instanceof InterfaceC20051113cr)) {
            C20052513d5.LJFF(abstractC20055413dY).LLJJIJI = true;
        }
        if ((i & 64) != 0 && (abstractC20055413dY instanceof InterfaceC20057313dr)) {
            C20054013dK c20054013dK = C20052513d5.LJFF(abstractC20055413dY).LLJLLL;
            c20054013dK.LJIILL.LLJJIJI = true;
            C20053613dG c20053613dG = c20054013dK.LJIILLIIL;
            if (c20053613dG != null) {
                c20053613dG.LLJJJJ = true;
            }
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 && (abstractC20055413dY instanceof InterfaceC20057413ds)) {
            InterfaceC20057413ds interfaceC20057413ds = (InterfaceC20057413ds) abstractC20055413dY;
            C20055513dZ c20055513dZ = C20055513dZ.LIZ;
            C20055513dZ.LIZIZ = null;
            interfaceC20057413ds.LJZL(c20055513dZ);
            if (C20055513dZ.LIZIZ != null) {
                if (!interfaceC20057413ds.LJIJJ().LLJILLL) {
                    C1696250uF5.LIZIZ("visitChildren called on an unattached node");
                }
                C19968013Aw c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                AbstractC20055413dY abstractC20055413dY2 = interfaceC20057413ds.LJIJJ().LLILZLL;
                if (abstractC20055413dY2 == null) {
                    C20052513d5.LIZ(c19968013Aw, interfaceC20057413ds.LJIJJ());
                } else {
                    c19968013Aw.LIZLLL(abstractC20055413dY2);
                }
                while (true) {
                    int i3 = c19968013Aw.LLILLL;
                    if (i3 == 0) {
                        break;
                    }
                    AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw.LJIILIIL(i3 - 1);
                    if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                        C20052513d5.LIZ(c19968013Aw, abstractC20055413dYLIZIZ);
                    } else {
                        while (true) {
                            if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                                C19968013Aw c19968013Aw2 = null;
                                do {
                                    if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) abstractC20055413dYLIZIZ;
                                        C20052513d5.LJI(focusTargetNode).getFocusOwner().LJIIIZ(focusTargetNode);
                                    } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                        int i4 = 0;
                                        for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                            if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    abstractC20055413dYLIZIZ = abstractC20055413dY3;
                                                } else {
                                                    if (c19968013Aw2 == null) {
                                                        c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                    }
                                                    if (abstractC20055413dYLIZIZ != null) {
                                                        c19968013Aw2.LIZLLL(abstractC20055413dYLIZIZ);
                                                        abstractC20055413dYLIZIZ = null;
                                                    }
                                                    c19968013Aw2.LIZLLL(abstractC20055413dY3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
                                } while (abstractC20055413dYLIZIZ != null);
                            } else {
                                abstractC20055413dYLIZIZ = abstractC20055413dYLIZIZ.LLILZLL;
                                if (abstractC20055413dYLIZIZ != null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 && (abstractC20055413dY instanceof InterfaceC20051413cu)) {
            InterfaceC20051413cu interfaceC20051413cu = (InterfaceC20051413cu) abstractC20055413dY;
            C20052513d5.LJI(interfaceC20051413cu).getFocusOwner().LJIILLIIL(interfaceC20051413cu);
        }
    }
}
