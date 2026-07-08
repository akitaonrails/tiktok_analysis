package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422430n7R {
    public final TemplateCategoryData LIZ;
    public final C1419590n2r LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final int hashCode() {
        TemplateCategoryData templateCategoryData = this.LIZ;
        return ((((((templateCategoryData == null ? 0 : templateCategoryData.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final boolean LIZ(C1422430n7R c1422430n7R) {
        if (Intrinsics.LJFF(this.LIZ, c1422430n7R.LIZ) && Intrinsics.LJFF(this.LIZIZ.LIZ.getAsset_id(), c1422430n7R.LIZIZ.LIZ.getAsset_id()) && this.LIZJ == c1422430n7R.LIZJ) {
            return true;
        }
        return false;
    }

    public C1422430n7R(int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, boolean z) {
        this.LIZ = templateCategoryData;
        this.LIZIZ = c1419590n2r;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
