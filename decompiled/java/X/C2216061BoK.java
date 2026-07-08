package X;

import Y.ARunnableS134S0100000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.storage.allowlist.provider.OperationReadAll;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216061BoK implements InterfaceC580040Mp0 {
    public final Set<String> LIZ = C1664790tQL.LIZJ();
    public final ExecutorService LIZIZ;
    public final ConcurrentLinkedDeque<InterfaceC1212660hf6> LIZJ;
    public final C571770Mbf LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC580040Mp0
    public final boolean LIZJ() {
        return true;
    }

    public C2216061BoK() {
        this.LIZIZ = C04TS.LIZ() ? new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 1) : C786410Ut5.h4();
        ConcurrentLinkedDeque<InterfaceC1212660hf6> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.offer(new OperationReadAll());
        this.LIZJ = concurrentLinkedDeque;
        this.LIZLLL = new C571770Mbf();
    }

    @Override // X.InterfaceC580050Mp1
    public final Set<String> LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1212660hf6 interfaceC1212660hf6PeekLast = this.LIZJ.peekLast();
        if (interfaceC1212660hf6PeekLast != null) {
            if (interfaceC1212660hf6PeekLast instanceof C1212680hf8) {
                ((C1212680hf8) interfaceC1212660hf6PeekLast).LIZ.LIZ(new AwS613S0100000_34(this, 89));
            } else {
                C2216071BoL c2216071BoL = new C2216071BoL();
                c2216071BoL.LIZ(new AwS400S0200000_34(this, c2216071BoL, 21));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C12ER c12erLIZ = C571810Mbj.LIZ();
        int size = this.LIZ.size();
        c12erLIZ.getClass();
        C12ER.LIZIZ(size, jCurrentTimeMillis2, "DraftAllowListWithIncrementOpt");
        return this.LIZ;
    }

    public final void LJ(InterfaceC1212660hf6 interfaceC1212660hf6) {
        if (interfaceC1212660hf6 == null) {
            return;
        }
        if (interfaceC1212660hf6 instanceof OperationReadAll) {
            Set setLIZ = C571790Mbh.LIZ("DraftAllowListWithIncrementOpt");
            this.LIZ.clear();
            this.LIZ.addAll(setLIZ);
        } else if (interfaceC1212660hf6 instanceof C1212670hf7) {
            C571770Mbf c571770Mbf = this.LIZLLL;
            c571770Mbf.LIZ = ((C1212670hf7) interfaceC1212660hf6).LIZ;
            this.LIZ.addAll(c571770Mbf.LIZ());
        } else if (interfaceC1212660hf6 instanceof C1212680hf8) {
            ((C1212680hf8) interfaceC1212660hf6).LIZ.LIZ(AFwS281S0000000_34.get$arr$(43));
        } else if (!(interfaceC1212660hf6 instanceof C1212650hf5)) {
            throw new C1954807lC();
        }
        C12ER c12erLIZ = C571810Mbj.LIZ();
        int size = this.LIZ.size();
        c12erLIZ.getClass();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleOperation: thread: ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(", allowListSize: ");
        sbLIZ.append(size);
        sbLIZ.append(", operation: ");
        sbLIZ.append(interfaceC1212660hf6.getClass().getName());
        C201955140j.LJIILL(c0may, "DraftAllowListWithIncrementOpt", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(InterfaceC1212660hf6 interfaceC1212660hf6) {
        if (C2428509fP.LIZ()) {
            LJI(interfaceC1212660hf6);
            return;
        }
        try {
            LJI(interfaceC1212660hf6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(new Throwable(e), "DraftAllowListWithIncrementOpt");
        }
    }

    public final void LJI(InterfaceC1212660hf6 interfaceC1212660hf6) {
        if (C2428509fP.LIZ()) {
            if (!this.LJ && !(interfaceC1212660hf6 instanceof C1212680hf8)) {
                C571810Mbj.LIZ().getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filterOperation: thread: ");
                sbLIZ.append(C786410Ut5.u3());
                sbLIZ.append(", operation: ");
                sbLIZ.append(interfaceC1212660hf6.getClass().getName());
                C201955140j.LJIILIIL("DraftAllowListWithIncrementOpt", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.LJ = true;
        }
        C571810Mbj.LIZ().getClass();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("postOperation: thread: ");
        sbLIZ2.append(C786410Ut5.u3());
        sbLIZ2.append(", operation: ");
        sbLIZ2.append(interfaceC1212660hf6.getClass().getName());
        C201955140j.LJIILL(c0may, "DraftAllowListWithIncrementOpt", C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZJ.offer(interfaceC1212660hf6);
        this.LIZIZ.execute(new ARunnableS134S0100000_34(this, 47));
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(final AwemeDraft awemeDraft) {
        LJFF(new InterfaceC1212660hf6(awemeDraft) { // from class: X.0hf5
            public final AwemeDraft LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1212650hf5) && Intrinsics.LJFF(this.LIZ, ((C1212650hf5) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OperationDelete(awemeDraft=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = awemeDraft;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        LJFF(new C1212670hf7(updateParams.draft));
    }
}
