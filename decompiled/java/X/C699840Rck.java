package X;

import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699840Rck {
    public static final boolean LIZ(BottomBarPriorityAbility bottomBarPriorityAbility) {
        List<String> listLLLZIIL;
        if (bottomBarPriorityAbility != null && (listLLLZIIL = bottomBarPriorityAbility.LLLZIIL()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : listLLLZIIL) {
                if (!Intrinsics.LJFF(str, "bottom_banner_retag_poi")) {
                    arrayList.add(str);
                }
            }
            return !arrayList.isEmpty();
        }
        return false;
    }
}
