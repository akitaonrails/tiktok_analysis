package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296970jr5 extends AbstractC1296960jr4<Object> {
    public final /* synthetic */ AbstractC1296960jr4 LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".lenient()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296970jr5(AbstractC1296960jr4 abstractC1296960jr4) {
        this.LIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        boolean z = abstractC1296450jqF.LLILZIL;
        abstractC1296450jqF.LLILZIL = true;
        try {
            Object objLIZ = this.LIZ.LIZ(abstractC1296450jqF);
            abstractC1296450jqF.LLILZIL = z;
            return objLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            abstractC1296450jqF.LLILZIL = z;
            throw th;
        }
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        boolean z = abstractC1297000jr8.LLILZIL;
        abstractC1297000jr8.LLILZIL = true;
        try {
            this.LIZ.LIZIZ(abstractC1297000jr8, obj);
            abstractC1297000jr8.LLILZIL = z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            abstractC1297000jr8.LLILZIL = z;
            throw th;
        }
    }
}
