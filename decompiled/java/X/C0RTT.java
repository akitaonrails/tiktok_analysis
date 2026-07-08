package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RTT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<AbstractC738140SxQ> LL;
    public final /* synthetic */ AssemSupervisor LLILLJJLI;
    public final /* synthetic */ C0RTL LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RTT(List<? extends AbstractC738140SxQ> list, AssemSupervisor assemSupervisor, C0RTL c0rtl, Object obj, long j, Function0<Unit> function0) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = assemSupervisor;
        this.LLILLL = c0rtl;
        this.LLILZ = obj;
        this.LLILZIL = j;
        this.LLILZLL = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        for (AbstractC738140SxQ abstractC738140SxQ : this.LL) {
            if ((abstractC738140SxQ instanceof ReusedAssem) && this.LLILLJJLI.LJII(abstractC738140SxQ, this.LLILLL.LIZ())) {
                if (C725080ScM.LJIJ.contains(C13LE.LIZ(abstractC738140SxQ.getClass()))) {
                    ?? r3 = this.LLILZ;
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("checkAndTriggerLazyLoad from ");
                            sbLIZ.append((Object) r3);
                            sbLIZ.append(", assem: ");
                            sbLIZ.append(abstractC738140SxQ);
                            sbLIZ.append(", proxy: ");
                            sbLIZ.append(r3.LLJI);
                            sbLIZ.append(", item: ");
                            C724270Sb3 c724270Sb3 = r3.LLJI;
                            sbLIZ.append(c724270Sb3 != null ? c724270Sb3.LL : null);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("AssemList", strLIZIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C724270Sb3 c724270Sb32 = this.LLILZ.LLJI;
                if (c724270Sb32 != null) {
                    c724270Sb32.LIZLLL((ReusedAssem) abstractC738140SxQ, this.LLILZIL);
                }
                this.LLILLJJLI.LIZIZ(abstractC738140SxQ);
            }
        }
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
