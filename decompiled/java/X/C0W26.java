package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0W26, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W26 implements C0W2I {
    public final C0W2Q LIZ;
    public final C01GW LIZIZ;

    public C0W26(C0W2Q c0w2q) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(c0w2q, 85));
        this.LIZ = c0w2q;
        this.LIZIZ = c01gwLIZIZ;
    }

    @Override // X.InterfaceC816920W2w
    public final Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
        boolean z;
        long jLongValue = ((Number) obj).longValue();
        try {
            int iLIZ = this.LIZ.LIZLLL.LIZIZ().LIZ(jLongValue);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete version: ");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" row, delete row cnt: ");
            sbLIZ.append(iLIZ);
            C1327105Hh.LIZIZ("UserOperator", C2188811AlT.LIZIZ(sbLIZ));
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1327105Hh.LIZ("UserOperator", "delete old version fail", th);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
