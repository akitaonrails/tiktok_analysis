package X;

import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552310qUv extends AbstractC1552000qUQ<UpdatePackage, UpdatePackage> {
    @Override // X.AbstractC1552000qUQ
    public final void LIZLLL(Object obj, Throwable th, String str) {
        UpdatePackage updatePackage = (UpdatePackage) obj;
        if ("patch".equals(str)) {
            updatePackage.setUpdateWithPatch(false);
            C1553130qWF.LIZ("gecko-debug-tag", "start full update", updatePackage.toString());
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("full update failed, caused by:");
            sbLIZ.append(th.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th);
        }
    }
}
