package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423010n8N {
    public final TemplateCategoryData LIZ;
    public final C1422880n8A LIZIZ;
    public final TemplateCategoryData LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1423010n8N() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423010n8N)) {
            return false;
        }
        C1423010n8N c1423010n8N = (C1423010n8N) obj;
        return Intrinsics.LJFF(this.LIZ, c1423010n8N.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1423010n8N.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1423010n8N.LIZJ) && this.LIZLLL == c1423010n8N.LIZLLL;
    }

    public /* synthetic */ C1423010n8N(TemplateCategoryData templateCategoryData, C1422880n8A c1422880n8A, int i) {
        this((i & 1) != 0 ? null : templateCategoryData, (i & 2) != 0 ? null : c1422880n8A, null, false);
    }

    public C1423010n8N(TemplateCategoryData templateCategoryData, C1422880n8A c1422880n8A, TemplateCategoryData templateCategoryData2, boolean z) {
        this.LIZ = templateCategoryData;
        this.LIZIZ = c1422880n8A;
        this.LIZJ = templateCategoryData2;
        this.LIZLLL = z;
    }
}
