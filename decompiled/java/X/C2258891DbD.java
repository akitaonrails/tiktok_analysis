package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1DbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258891DbD {
    public static final int LIZIZ(C19980813Fu c19980813Fu) {
        if (Intrinsics.LJFF(c19980813Fu.LJ.get("is_current_dup"), 1)) {
            return 1;
        }
        if (Intrinsics.LJFF(c19980813Fu.LJ.get("is_consistency_broken"), 1)) {
            return 2;
        }
        return 0;
    }

    public static final void LJ(C19980813Fu c19980813Fu, int i, String str) {
        if (i > 0) {
            c19980813Fu.LIZLLL.put("view_progress_produce_size", Integer.valueOf(i));
        }
        if (!a0.LJJJIL(str)) {
            c19980813Fu.LIZLLL.put("position_range", str);
        }
    }

    public static final void LIZLLL(C19980813Fu c19980813Fu, long j, long j2, String str) {
        c19980813Fu.LIZLLL.put("elapsed_gap", Long.valueOf(j));
        c19980813Fu.LIZLLL.put("elapsed_position_gap", Long.valueOf(j2));
        c19980813Fu.LIZLLL.put("position_range", str);
    }

    public static void LIZ(C19980813Fu c19980813Fu, long j, long j2, int i, String str, String str2) {
        int iLIZIZ = LIZIZ(c19980813Fu);
        c19980813Fu.LIZLLL.put("video_length", Long.valueOf(j));
        c19980813Fu.LIZLLL.put("duration", Long.valueOf(j2));
        c19980813Fu.LIZLLL.put("player_duration", Long.valueOf(j2));
        c19980813Fu.LIZLLL.put("play_order", Integer.valueOf(i));
        c19980813Fu.LIZLLL.put("page_from", str);
        if (!a0.LJJJIL(str2)) {
            c19980813Fu.LIZLLL.put("from", str2);
        }
        c19980813Fu.LIZLLL.put("should_drop", Integer.valueOf(iLIZIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static void LIZJ(C19980813Fu c19980813Fu, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, List list3, int i) {
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        ?? r4 = 0;
        ?? r17 = z;
        if ((i & 4) != 0) {
            r17 = 0;
        }
        ?? r18 = z2;
        if ((i & 8) != 0) {
            r18 = 0;
        }
        ?? r19 = z3;
        if ((i & 16) != 0) {
            r19 = 0;
        }
        if ((i & 32) == 0) {
            r4 = z4;
        }
        if ((i & 64) != 0) {
            list6 = C13BV.INSTANCE;
        }
        if ((i & 128) != 0) {
            list5 = C13BV.INSTANCE;
        }
        if ((i & 256) != 0) {
            list4 = C13BV.INSTANCE;
        }
        c19980813Fu.LIZLLL.put("refer_bits", str);
        c19980813Fu.LIZLLL.put("order_bits", str2);
        c19980813Fu.LJ.put("is_current_dup", Integer.valueOf((int) r17));
        c19980813Fu.LJ.put("is_missing_pre", Integer.valueOf((int) r18));
        c19980813Fu.LJ.put("is_order_error", Integer.valueOf((int) r19));
        c19980813Fu.LJ.put("is_consistency_broken", Integer.valueOf((int) r4));
        if (!list6.isEmpty()) {
            c19980813Fu.LJ.put("consistency_dup_events", C13LP.LJJLIIIJ(C13LP.LL(list6, 30), ",", null, null, 0, null, null, 62));
        }
        if (!list5.isEmpty()) {
            c19980813Fu.LJ.put("consistency_broken_events", C13LP.LJJLIIIJ(C13LP.LL(list5, 30), ",", null, null, 0, null, null, 62));
        }
        if (!list4.isEmpty()) {
            c19980813Fu.LJ.put("lost_events", C13LP.LJJLIIIJ(list4, ",", null, null, 0, null, null, 62));
        }
    }
}
