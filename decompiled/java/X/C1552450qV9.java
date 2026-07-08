package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552450qV9 extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552450qV9(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        UpdatePackage updatePackage;
        try {
            updatePackage = (UpdatePackage) c1552250qUp.getOutputForType(C1552310qUv.class);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            updatePackage = (UpdatePackage) c1552250qUp.getInputForType(C1550820qSW.class);
        }
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null && updatePackage != null) {
            abstractC1552040qUU.LJ(updatePackage, th);
        }
    }
}
