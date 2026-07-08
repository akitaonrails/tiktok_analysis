package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704790Rkj {
    public static boolean LIZ(List list) {
        if (list != null && (!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "comments_update_payload")) {
            return true;
        }
        return false;
    }
}
