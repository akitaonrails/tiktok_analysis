package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357160DzO implements InterfaceC358840E5a {
    public final C0E48 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1147));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1145));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1146));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(314));
    public InterfaceC357170DzP LJFF;

    public final NLEEditor LJII() {
        return (NLEEditor) this.LIZJ.getValue();
    }

    public final ArrayList<InterfaceC357170DzP> LJIIIIZZ() {
        return (ArrayList) this.LJ.getValue();
    }

    public final C0E55 LJIIIZ() {
        return (C0E55) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC358840E5a
    public final boolean LIZ() {
        return LJII().canUndo();
    }

    @Override // X.InterfaceC358840E5a
    public final boolean LJFF() {
        return LJII().canRedo();
    }

    @Override // X.InterfaceC358840E5a
    public final boolean LJI() {
        if (!LJII().canRedo()) {
            return false;
        }
        LJIIIZ().pause(false);
        Iterator<InterfaceC357170DzP> it2 = LJIIIIZZ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(EnumC357140DzM.REDO);
        }
        InterfaceC357170DzP interfaceC357170DzP = this.LJFF;
        if (interfaceC357170DzP != null) {
            interfaceC357170DzP.LIZJ(EnumC357140DzM.REDO);
        }
        LJIIIZ().skipNextSeek(true);
        boolean zRedo = LJII().redo();
        LJIIIZ().skipNextSeek(false);
        long jJh = LJIIIZ().Jh();
        long jQq = LJIIIZ().qq();
        if (jJh > jQq) {
            jJh = jQq;
        }
        if (zRedo) {
            Iterator<InterfaceC357170DzP> it3 = LJIIIIZZ().iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(EnumC357140DzM.REDO, zRedo);
            }
            InterfaceC357170DzP interfaceC357170DzP2 = this.LJFF;
            if (interfaceC357170DzP2 != null) {
                interfaceC357170DzP2.LIZIZ(EnumC357140DzM.REDO, zRedo);
            }
            LJIIIZ().LJIJI(C352310DrZ.LIZLLL(jJh), C351110Dpd.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NleModel: ");
            sbLIZ.append(((NLENode) this.LIZLLL.getValue()).toJsonString());
            C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return true;
    }

    public C357160DzO(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    @Override // X.InterfaceC358840E5a
    public final boolean LIZIZ(boolean z) {
        if (!LJII().canUndo()) {
            return false;
        }
        LJIIIZ().pause(false);
        if (z) {
            try {
                Iterator<InterfaceC357170DzP> it2 = LJIIIIZZ().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(EnumC357140DzM.UNDO);
                }
                InterfaceC357170DzP interfaceC357170DzP = this.LJFF;
                if (interfaceC357170DzP != null) {
                    interfaceC357170DzP.LIZJ(EnumC357140DzM.UNDO);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NleModel: undo:");
                sbLIZ.append(e.getMessage());
                C355090Dw3.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJIIIZ().skipNextSeek(true);
        boolean zUndo = LJII().undo();
        LJIIIZ().skipNextSeek(false);
        if (z) {
            Iterator<InterfaceC357170DzP> it3 = LJIIIIZZ().iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(EnumC357140DzM.UNDO, zUndo);
            }
            InterfaceC357170DzP interfaceC357170DzP2 = this.LJFF;
            if (interfaceC357170DzP2 != null) {
                interfaceC357170DzP2.LIZIZ(EnumC357140DzM.UNDO, zUndo);
            }
        }
        long jJh = LJIIIZ().Jh();
        long jQq = LJIIIZ().qq();
        if (jJh > jQq) {
            jJh = jQq;
        }
        LJIIIZ().LJIJI(C352310DrZ.LIZLLL(jJh), C351110Dpd.LIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("NleModel: ");
        sbLIZ2.append(((NLENode) this.LIZLLL.getValue()).toJsonString());
        C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    @Override // X.InterfaceC358840E5a
    public final void LIZJ(InterfaceC357170DzP interfaceC357170DzP) {
        if (LJIIIIZZ().contains(interfaceC357170DzP)) {
            LJIIIIZZ().remove(interfaceC357170DzP);
        }
    }

    @Override // X.InterfaceC358840E5a
    public final void LIZLLL(InterfaceC357170DzP interfaceC357170DzP) {
        if (!LJIIIIZZ().contains(interfaceC357170DzP)) {
            LJIIIIZZ().add(interfaceC357170DzP);
        }
    }

    @Override // X.InterfaceC358840E5a
    public final void LJ(InterfaceC357170DzP interfaceC357170DzP) {
        this.LJFF = interfaceC357170DzP;
    }
}
