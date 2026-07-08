package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Saa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723980Saa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ AssemSupervisor LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723980Saa(AbstractC738140SxQ abstractC738140SxQ, AssemSupervisor assemSupervisor) {
        super(0);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = assemSupervisor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL == null) {
            if (this.LLILLJJLI.LLJILJIL) {
                this.LLILLJJLI.LJI().removeObserver(this.LLILLJJLI);
                this.LLILLJJLI.LJI().addObserver(this.LLILLJJLI);
            } else {
                this.LLILLJJLI.LLJILJIL = true;
                this.LLILLJJLI.LJI().addObserver(this.LLILLJJLI);
            }
        } else if (!this.LLILLJJLI.LLJILJIL) {
            this.LLILLJJLI.LLJILJIL = true;
            AssemSupervisor assemSupervisor = this.LLILLJJLI;
            String str = assemSupervisor.LLIZ;
            AbstractC738140SxQ abstractC738140SxQ = this.LL;
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("add Observer for ");
                        sbLIZ.append(abstractC738140SxQ);
                        sbLIZ.append(", dstState: ");
                        sbLIZ.append(assemSupervisor.LJI().getCurrentState());
                        sbLIZ.append(", assem state: ");
                        sbLIZ.append(abstractC738140SxQ.getLifecycle().getCurrentState().name());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log(str, strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LLILLJJLI.LJI().addObserver(this.LLILLJJLI);
        } else if (C725080ScM.LJIIJJI) {
            if (this.LLILLJJLI.LJI().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                AssemSupervisor assemSupervisor2 = this.LLILLJJLI;
                String str2 = assemSupervisor2.LLIZ;
                AbstractC738140SxQ abstractC738140SxQ2 = this.LL;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("handleLifecycleState for ");
                            sbLIZ2.append(abstractC738140SxQ2);
                            sbLIZ2.append(", dstState: ");
                            sbLIZ2.append(assemSupervisor2.LJI().getCurrentState());
                            sbLIZ2.append(", assem state: ");
                            sbLIZ2.append(abstractC738140SxQ2.getLifecycle().getCurrentState().name());
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log(str2, strLIZIZ2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                C723990Sab.LIZ(this.LLILLJJLI.LJI().getCurrentState(), this.LL);
            }
        } else if (this.LLILLJJLI.LJI().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            AssemSupervisor assemSupervisor3 = this.LLILLJJLI;
            String str3 = assemSupervisor3.LLIZ;
            AbstractC738140SxQ abstractC738140SxQ3 = this.LL;
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA3 = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA3 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("handleLifecycleState for ");
                        sbLIZ3.append(abstractC738140SxQ3);
                        sbLIZ3.append(", dstState: ");
                        sbLIZ3.append(assemSupervisor3.LJI().getCurrentState());
                        sbLIZ3.append(", assem state: ");
                        sbLIZ3.append(abstractC738140SxQ3.getLifecycle().getCurrentState().name());
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        int i3 = C2187451AjH.LIZ;
                        interfaceC723720SaA3.log(str3, strLIZIZ3);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            C723990Sab.LIZ(this.LLILLJJLI.LJI().getCurrentState(), this.LL);
        } else {
            AssemSupervisor assemSupervisor4 = this.LLILLJJLI;
            String str4 = assemSupervisor4.LLIZ;
            AbstractC738140SxQ abstractC738140SxQ4 = this.LL;
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA4 = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA4 != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("remove and add observer for ");
                        sbLIZ4.append(abstractC738140SxQ4);
                        sbLIZ4.append(", dstState: ");
                        sbLIZ4.append(assemSupervisor4.LJI().getCurrentState());
                        sbLIZ4.append(", assem state: ");
                        sbLIZ4.append(abstractC738140SxQ4.getLifecycle().getCurrentState().name());
                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                        int i4 = C2187451AjH.LIZ;
                        interfaceC723720SaA4.log(str4, strLIZIZ4);
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
            this.LLILLJJLI.LJI().removeObserver(this.LLILLJJLI);
            this.LLILLJJLI.LJI().addObserver(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
