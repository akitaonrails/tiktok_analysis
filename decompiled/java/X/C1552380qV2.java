package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552380qV2 extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552380qV2(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        Pair pair = (Pair) c1552250qUp.getInputForType(C1551010qSp.class);
        UpdatePackage updatePackage = (UpdatePackage) pair.first;
        String channel = updatePackage.getChannel();
        AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
        if (abstractC1552040qUU != null) {
            abstractC1552040qUU.LJJ(((Long) pair.second).longValue(), channel);
            this.LIZ.LJIL(((Long) pair.second).longValue(), updatePackage);
        }
    }
}
