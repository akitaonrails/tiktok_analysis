package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423730n9X {
    public final TemplateCategoryData LIZ;
    public final C1423690n9T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423730n9X)) {
            return false;
        }
        C1423730n9X c1423730n9X = (C1423730n9X) obj;
        return Intrinsics.LJFF(this.LIZ, c1423730n9X.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1423730n9X.LIZIZ);
    }

    public C1423730n9X(TemplateCategoryData templateCategoryData, C1423690n9T c1423690n9T) {
        this.LIZ = templateCategoryData;
        this.LIZIZ = c1423690n9T;
    }
}
