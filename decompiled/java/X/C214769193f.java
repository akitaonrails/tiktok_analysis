package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214769193f implements C193T {
    public int LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public C214769193f() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 304));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 305));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 303));
    }

    @Override // X.C193T
    public final int LIZ(InterfaceC1738600vLO interfaceC1738600vLO, InterfaceC1738600vLO interfaceC1738600vLO2, InterfaceC214777193n interfaceC214777193n) {
        Pair pair;
        if (Intrinsics.LJFF(interfaceC214777193n, C193F.LIZ)) {
            pair = new Pair(((Map) this.LJ.getValue()).get(interfaceC1738600vLO.getKey()), ((Map) this.LJ.getValue()).get(interfaceC1738600vLO2.getKey()));
        } else if (Intrinsics.LJFF(interfaceC214777193n, C193I.LIZ)) {
            pair = new Pair(((Map) this.LIZJ.getValue()).get(interfaceC1738600vLO.getKey()), ((Map) this.LIZJ.getValue()).get(interfaceC1738600vLO2.getKey()));
        } else if (Intrinsics.LJFF(interfaceC214777193n, C193J.LIZ)) {
            pair = new Pair(((Map) this.LIZLLL.getValue()).get(interfaceC1738600vLO.getKey()), ((Map) this.LIZLLL.getValue()).get(interfaceC1738600vLO2.getKey()));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported position: ");
            sbLIZ.append(interfaceC214777193n);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        Integer num = (Integer) pair.getFirst();
        Integer num2 = (Integer) pair.getSecond();
        if (num != null && num2 != null) {
            return Intrinsics.LJI(num.intValue(), num2.intValue());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("option(");
        sbLIZ2.append(interfaceC1738600vLO.getKey());
        sbLIZ2.append(") index=");
        sbLIZ2.append(num);
        sbLIZ2.append(" or option(");
        sbLIZ2.append(interfaceC1738600vLO2.getKey());
        sbLIZ2.append(") index=");
        sbLIZ2.append(num2);
        sbLIZ2.append(" order is not registered in position(");
        sbLIZ2.append(interfaceC214777193n);
        sbLIZ2.append(')');
        C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        return 0;
    }
}
