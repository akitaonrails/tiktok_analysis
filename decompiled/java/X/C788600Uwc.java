package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788600Uwc extends AbstractC788620Uwe {
    public final List<TemplateSearchTrendingItem> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788600Uwc) && Intrinsics.LJFF(this.LIZ, ((C788600Uwc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788600Uwc(List<TemplateSearchTrendingItem> list) {
        this.LIZ = list;
    }
}
