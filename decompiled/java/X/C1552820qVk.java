package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552820qVk extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552820qVk(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        IN in = abstractC1552240qUo.LIZIZ;
        if (in instanceof Pair) {
            Object obj = ((Pair) in).second;
            if (obj instanceof UpdatePackage) {
                UpdatePackage updatePackage = (UpdatePackage) obj;
                AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
                if (abstractC1552040qUU != null) {
                    abstractC1552040qUU.LJ(updatePackage, th);
                }
            }
        }
    }
}
