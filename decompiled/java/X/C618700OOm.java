package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618700OOm {
    public static final <T> boolean LIZ(List<? extends T> list, List<? extends T> list2) {
        boolean zLJFF;
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            Object obj2 = ListProtector.get(list2, i);
            if (obj instanceof InterfaceC618710OOn) {
                zLJFF = ((InterfaceC618710OOn) obj).isSame(obj2);
            } else if ((obj instanceof User) && (obj2 instanceof User)) {
                User user = (User) obj;
                User user2 = (User) obj2;
                if (!Intrinsics.LJFF(user.getUid(), user2.getUid()) || !Intrinsics.LJFF(user.getShortId(), user2.getShortId()) || !Intrinsics.LJFF(user.getNickname(), user2.getNickname())) {
                    return false;
                }
            } else {
                zLJFF = Intrinsics.LJFF(obj, obj2);
            }
            if (!zLJFF) {
                return false;
            }
        }
        return true;
    }
}
