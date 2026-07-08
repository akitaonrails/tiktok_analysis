package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Igt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473090Igt {
    public static final boolean LIZ(List<TranslatedRegion> list, List<TranslatedRegion> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(((TranslatedRegion) ListProtector.get(list, i)).code, ((TranslatedRegion) ListProtector.get(list2, i)).code)) {
                return false;
            }
        }
        return true;
    }
}
