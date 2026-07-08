package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423910n9p {
    public final C1DRG LIZ;
    public final List<TemplateSearchTrendingItem> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423910n9p)) {
            return false;
        }
        C1423910n9p c1423910n9p = (C1423910n9p) obj;
        return Intrinsics.LJFF(this.LIZ, c1423910n9p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1423910n9p.LIZIZ);
    }

    public C1423910n9p(C1DRG c1drg, List<TemplateSearchTrendingItem> list) {
        this.LIZ = c1drg;
        this.LIZIZ = list;
    }
}
