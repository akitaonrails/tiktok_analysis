package X;

import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552510qVF extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552510qVF(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        AbstractC1552040qUU abstractC1552040qUU;
        UpdatePackage updatePackageLIZJ = C1551820qU8.LIZJ(c1552250qUp);
        if (updatePackageLIZJ.compressEnd && (abstractC1552040qUU = this.LIZ) != null) {
            abstractC1552040qUU.LJJ(updatePackageLIZJ.getVersion(), updatePackageLIZJ.getChannel());
            this.LIZ.LJIL(updatePackageLIZJ.getVersion(), updatePackageLIZJ);
        }
    }
}
