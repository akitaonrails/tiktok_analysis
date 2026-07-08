package X;

import X.AbstractC1664490tPr;
import X.C05YF;
import Y.AObjectS240S0100000_5;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ETX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0ETX<API_COMPONENT extends C05YF, SCENE extends AbstractC1664490tPr<STATE, ACTION>, STATE, ACTION> extends C0ETZ<API_COMPONENT, SCENE, STATE, ACTION> {
    public static final int LLJJJJ = 8;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final boolean LLJJJIL;

    public boolean D5() {
        return true;
    }

    public String O4() {
        return null;
    }

    public boolean d5() {
        return false;
    }

    public final InterfaceC357900E1k H4() {
        return (InterfaceC357900E1k) this.LLJJJ.getValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final C0ETQ P4() {
        return (C0ETQ) this.LLJJIJIL.getValue();
    }

    public final C0E2R T4() {
        return (C0E2R) this.LLJJIJIIJIL.getValue();
    }

    public final void C5() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.LLFII().LJI().resetHead();
            C0E55 player = c0e48F4.getPlayer();
            player.LJIJJLI();
            player.pause(false);
        }
    }

    public void Xi() {
        LiveEvent<Unit> liveEventP70;
        LiveEvent<Unit> liveEventVD1;
        Z4();
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventVD1 = interfaceC357900E1kH4.VD1()) != null) {
            liveEventVD1.LIZ(this, new AObjectS240S0100000_5(this, 128));
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 == null || (liveEventP70 = c0etqP4.p70()) == null) {
            return;
        }
        liveEventP70.LIZ(this, new AObjectS240S0100000_5(this, 129));
    }

    public void Z4() {
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 == null) {
            return;
        }
        LiveEvent<Unit> liveEventGV0 = c0e2rT4.gV0();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        liveEventGV0.LJII(this, state, new AObjectS240S0100000_5(this, 130));
        c0e2rT4.B50().LJII(this, state, new AObjectS240S0100000_5(this, 131));
    }

    public void k5() {
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.Ra2(true);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLJJIJI) {
            Xi();
        }
    }

    public void x5() {
        if (D5()) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null) {
                c0e48F4.getPlayer().LJIJJLI();
                C350410DoV.LIZLLL(c0e48F4.LLFII().LJI(), true, O4(), true, true);
            }
        } else {
            C5();
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    public boolean K4() {
        return this.LLJJJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public void n5() {
        C5();
    }

    public void t5(boolean z) {
        String uuid;
        NLECommit head;
        String uuid2;
        NLECommit headPrev;
        if (D5()) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null) {
                C0E55 player = c0e48F4.getPlayer();
                player.LJIJJLI();
                player.pause(false);
                NLEBranch branch = c0e48F4.LLFII().LJI().getBranch();
                String str = "";
                if (branch == null || (headPrev = branch.getHeadPrev()) == null || (uuid = headPrev.getUUID()) == null) {
                    uuid = "";
                }
                C350410DoV.LIZLLL(c0e48F4.LLFII().LJI(), true, O4(), true, true);
                if (!z) {
                    NLEBranch branch2 = c0e48F4.LLFII().LJI().getBranch();
                    if (branch2 != null && (head = branch2.getHead()) != null && (uuid2 = head.getUUID()) != null) {
                        str = uuid2;
                    }
                    c0e48F4.LLFII().LJI().trimRange(uuid, str);
                }
            }
        } else {
            C5();
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    public C0ETX(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5((C0ETX) this, 821));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5((C0ETX) this, 820));
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5((C0ETX) this, 819));
    }
}
