package X;

import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552520qVG extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552520qVG(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        UpdatePackage updatePackage = (UpdatePackage) c1552250qUp.getInputForType(C1552310qUv.class);
        C1553130qWF.LIZ("gecko-debug-tag", "downloadListener onEnd", updatePackage.toString());
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null) {
            abstractC1552040qUU.LJIILL(updatePackage);
        }
    }
}
