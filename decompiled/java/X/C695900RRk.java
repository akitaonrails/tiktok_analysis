package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695900RRk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C699950Rcv LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C701040Reg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695900RRk(C699950Rcv c699950Rcv, ReusedAssem reusedAssem, boolean z, C701040Reg c701040Reg) {
        super(0);
        this.LL = c699950Rcv;
        this.LLILLJJLI = reusedAssem;
        this.LLILLL = z;
        this.LLILZ = c701040Reg;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0RRl] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C699950Rcv c699950Rcv = this.LL;
        final AbstractC738140SxQ abstractC738140SxQ = this.LLILLJJLI;
        boolean zMp = this.LLILLL;
        final C701040Reg c701040Reg = this.LLILZ;
        c699950Rcv.getClass();
        if (abstractC738140SxQ instanceof BaseCellTriggerComponent) {
            final C013C c013c = new C013C();
            c013c.element = zMp;
            final ?? r5 = new Runnable(c699950Rcv, c013c, c701040Reg) { // from class: X.0RRl
                public final /* synthetic */ C699950Rcv LLILLJJLI;
                public final /* synthetic */ C013C LLILLL;

                public final void LIZ() {
                    CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
                    AssemSupervisor assemSupervisorLJI = C695930RRn.LJI(this.LL);
                    if (assemSupervisorLJI == null || (copyOnWriteArrayList = assemSupervisorLJI.LLJILLL) == null) {
                        return;
                    }
                    ArrayList<ReusedAssem> arrayList = new ArrayList();
                    for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                        if (abstractC738140SxQ2 instanceof ReusedAssem) {
                            arrayList.add(abstractC738140SxQ2);
                        }
                    }
                    C699950Rcv c699950Rcv2 = this.LLILLJJLI;
                    C013C c013c2 = this.LLILLL;
                    for (ReusedAssem reusedAssem : arrayList) {
                        boolean z = c013c2.element;
                        c699950Rcv2.getClass();
                        C699950Rcv.LJII(reusedAssem, z);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FcpAssemBridgeKt@1817.buildModifier$1$doModifyAssemActiveInternal$childActiveModifierAction$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FcpAssemBridgeKt@1817.buildModifier$1$doModifyAssemActiveInternal$childActiveModifierAction$1");
                }
            };
            Runnable runnable = new Runnable() { // from class: X.0RRj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FcpAssemBridgeKt@1817.buildModifier$1$doModifyAssemActiveInternal$loadChildAction$1");
                    try {
                        AssemSupervisor assemSupervisorLJI = C695930RRn.LJI(abstractC738140SxQ);
                        if (assemSupervisorLJI != null) {
                            ((List) assemSupervisorLJI.LLILLL.getValue()).add(new C0RK4(true));
                        }
                        AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
                        C723830SaL.LJ((ReusedAssem) abstractC738140SxQ2, ((BaseCellTriggerComponent) abstractC738140SxQ2).getType(), true, new C695920RRm(r5));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FcpAssemBridgeKt@1817.buildModifier$1$doModifyAssemActiveInternal$loadChildAction$1");
                }
            };
            if ((((Number) C299490BoZ.LIZ.getValue()).intValue() & 2) == 2) {
                if (!C0RJE.LIZIZ(abstractC738140SxQ, true)) {
                    zMp = ((BaseCellTriggerComponent) abstractC738140SxQ).mp();
                }
                c013c.element = zMp;
                C699950Rcv.LJII((ReusedAssem) abstractC738140SxQ, zMp);
                if (C695930RRn.LIZIZ((BaseCellTriggerComponent) abstractC738140SxQ) || !c013c.element) {
                    r5.run();
                } else {
                    runnable.run();
                }
            } else {
                boolean z = C0RJE.LIZIZ(abstractC738140SxQ, true) ? zMp : true;
                c013c.element = z;
                C699950Rcv.LJII((ReusedAssem) abstractC738140SxQ, z);
                BaseCellTriggerComponent baseCellTriggerComponent = (BaseCellTriggerComponent) abstractC738140SxQ;
                if (C695930RRn.LIZIZ(baseCellTriggerComponent)) {
                    r5.run();
                } else if ((C0RJE.LIZIZ(abstractC738140SxQ, true) && zMp) || baseCellTriggerComponent.mp()) {
                    runnable.run();
                }
            }
        } else {
            ReusedAssem reusedAssem = null;
            if (abstractC738140SxQ instanceof ReusedAssem) {
                ReusedAssem reusedAssem2 = (ReusedAssem) abstractC738140SxQ;
                if (C695930RRn.LIZJ(reusedAssem2)) {
                    C699950Rcv.LJII(reusedAssem2, true);
                } else {
                    reusedAssem = (ReusedAssem) abstractC738140SxQ;
                    C699950Rcv.LJII(reusedAssem, zMp);
                }
            } else {
                C699950Rcv.LJII(reusedAssem, zMp);
            }
        }
        return Unit.LIZ;
    }
}
