package X;

import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846720XJm extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C846690XJj LL;
    public final /* synthetic */ InterfaceC846700XJk LLILLJJLI;
    public final /* synthetic */ C1288950je9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C846720XJm(C846690XJj c846690XJj, InterfaceC846700XJk interfaceC846700XJk, C1288950je9 c1288950je9) {
        super(1);
        this.LL = c846690XJj;
        this.LLILLJJLI = interfaceC846700XJk;
        this.LLILLL = c1288950je9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132 = c1533790q13;
        InputStream inputStreamLJIIJJI = c1533790q132.LJIIJJI(false);
        if (inputStreamLJIIJJI != null) {
            C846690XJj c846690XJj = this.LL;
            c846690XJj.LIZJ = inputStreamLJIIJJI;
            InterfaceC846700XJk interfaceC846700XJk = this.LLILLJJLI;
            if (interfaceC846700XJk != null) {
                interfaceC846700XJk.LIZ(c846690XJj);
            }
        } else {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request ");
            sbLIZ.append(this.LLILLL.LIZ);
            sbLIZ.append(" failed, ");
            sbLIZ.append(c1533790q132.LIZLLL);
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "DefaultLynxRequestProvider");
            InterfaceC846700XJk interfaceC846700XJk2 = this.LLILLJJLI;
            if (interfaceC846700XJk2 != null) {
                interfaceC846700XJk2.LIZIZ(this.LL);
            }
        }
        return Unit.LIZ;
    }
}
