package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176530gip {
    public static final boolean LIZ(List<PoiFeedFilterOption> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<PoiFeedFilterOption> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().isEmptyOption(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
}
