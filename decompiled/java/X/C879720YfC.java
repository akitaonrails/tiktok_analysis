package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879720YfC {
    public static FilterTabType LIZ(String str) {
        for (FilterTabType filterTabType : FilterTabType.values()) {
            if (Intrinsics.LJFF(filterTabType.getSerializedName(), str)) {
                return filterTabType;
            }
        }
        return null;
    }
}
