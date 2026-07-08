package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296950jr3 extends AbstractC1296960jr4<Object> {
    public final /* synthetic */ AbstractC1296960jr4 LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".failOnUnknown()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296950jr3(AbstractC1296960jr4 abstractC1296960jr4) {
        this.LIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        boolean z = abstractC1296450jqF.LLILZLL;
        abstractC1296450jqF.LLILZLL = true;
        try {
            Object objLIZ = this.LIZ.LIZ(abstractC1296450jqF);
            abstractC1296450jqF.LLILZLL = z;
            return objLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            abstractC1296450jqF.LLILZLL = z;
            throw th;
        }
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        this.LIZ.LIZIZ(abstractC1297000jr8, obj);
    }
}
