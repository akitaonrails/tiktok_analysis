package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624800sNq {
    public final C1DRG LIZ;
    public final InterfaceC1650230t2r LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 40));

    public C1624800sNq(C1DRG c1drg, InterfaceC1650230t2r interfaceC1650230t2r, AwS569S0100000_25 awS569S0100000_25) {
        this.LIZ = c1drg;
        this.LIZIZ = interfaceC1650230t2r;
        this.LIZJ = awS569S0100000_25;
    }

    public final void LIZ(int i, long j, long j2, String str) {
        String str2 = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Client --> Effect]: msgID(");
        sbLIZ.append(i);
        sbLIZ.append("), arg1(");
        sbLIZ.append(j);
        sbLIZ.append("), arg2(");
        sbLIZ.append(j2);
        sbLIZ.append("), arg3(");
        sbLIZ.append(str2);
        sbLIZ.append(')');
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = this.LIZIZ.St2();
        if (str2 == null) {
            str2 = "empty_message";
        }
        interfaceC2254081DKkSt2.sendEffectMsg(i, j, j2, str2);
    }
}
