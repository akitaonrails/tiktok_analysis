package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296980jr6 extends AbstractC1296960jr4<Object> {
    public final /* synthetic */ AbstractC1296960jr4 LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".serializeNulls()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296980jr6(AbstractC1296960jr4 abstractC1296960jr4) {
        this.LIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        return this.LIZ.LIZ(abstractC1296450jqF);
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        boolean z = abstractC1297000jr8.LLILZLL;
        abstractC1297000jr8.LLILZLL = true;
        try {
            this.LIZ.LIZIZ(abstractC1297000jr8, obj);
            abstractC1297000jr8.LLILZLL = z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            abstractC1297000jr8.LLILZLL = z;
            throw th;
        }
    }
}
