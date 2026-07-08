package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552770qVf extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552770qVf(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZIZ(String str) {
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null) {
            abstractC1552040qUU.LJIIJ(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1552800qVi
    public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        if (abstractC1552240qUo instanceof C1550780qSS) {
            IN in = abstractC1552240qUo.LIZIZ;
            if (in instanceof Pair) {
                Object obj = ((Pair) in).first;
                if (obj instanceof UpdatePackage) {
                    UpdatePackage updatePackage = (UpdatePackage) obj;
                    AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
                    if (abstractC1552040qUU != null) {
                        abstractC1552040qUU.LJFF(updatePackage);
                    }
                }
            }
        }
    }
}
