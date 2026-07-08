package X;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RO1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RO1 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZIZ(C2189821An6 c2189821An6) {
        String from = c2189821An6.getFrom();
        if (from == null) {
            return -1;
        }
        switch (from.hashCode()) {
            case -1834114051:
                if (!from.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW")) {
                    return -1;
                }
                return 2;
            case -796330400:
                if (!from.equals("STORY_ENTRANCE_INBOX_TOP_LIST")) {
                    return -1;
                }
                return 3;
            case 417626225:
                if (!from.equals("STORY_ENTRANCE_FRIENDS_TOP_LIST")) {
                    return -1;
                }
                return 0;
            case 615467145:
                if (!from.equals("STORY_ENTRANCE_FYP_TOP_LIST")) {
                    return -1;
                }
                return 1;
            default:
                return -1;
        }
    }

    public static final boolean LIZ(C2189821An6 c2189821An6, C19EG c19eg) {
        if (c2189821An6 == null || ((Number) C0AAO.LIZ.getValue()).intValue() != 1 || !c2189821An6.isStoryPage() || !C1600750rl3.LJFF(c2189821An6.getFrom())) {
            return false;
        }
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_ARCHIVE") && Intrinsics.LJFF(c2189821An6.getEventType(), "story_archive") && !C1189504l3.LIZ()) {
            return false;
        }
        if (!Intrinsics.LJFF(c2189821An6.getEventType(), "story") || !Intrinsics.LJFF(C1609930rzr.LJIL(c2189821An6), "video_cover")) {
            return true;
        }
        if (c19eg != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C05FN(c19eg, null), 3);
        }
        if (((Number) C0AAP.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }
}
