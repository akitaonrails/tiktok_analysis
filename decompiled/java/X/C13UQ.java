package X;

import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UQ {
    public static final C13UQ LIZ = new C13UQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(215));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(214));

    public static void LIZ(int i, long j, String str, long j2, long j3, long j4, long j5, int i2, long j6, int i3, long j7, int i4, long j8, int i5, long j9, int i6) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "clean_type");
        c0lab.LIZIZ(j, "cost_time");
        c0lab.LJ("custom_cache_name", str);
        c0lab.LIZIZ(j2, "cache_size_before");
        c0lab.LIZIZ(j3, "cache_size_after");
        c0lab.LIZIZ(j4, "cache_clean_size");
        c0lab.LIZ(i2, "remove_unused_count");
        c0lab.LIZIZ(j5, "remove_unused_size");
        c0lab.LIZ(i3, "trim_size_count");
        c0lab.LIZIZ(j6, "trim_size_size");
        c0lab.LIZ(i4, "remove_dead_files_count");
        c0lab.LIZIZ(j7, "remove_dead_files_size");
        c0lab.LIZ(i5, "remove_allow_list_count");
        c0lab.LIZIZ(j8, "remove_allow_list_size");
        c0lab.LIZ(i6, "clean_total_count");
        c0lab.LIZIZ(j9, "clean_total_size");
        C20684815ws.LJIILLIIL("tools_disk_lru_cache_clean_storage", c0lab.LIZ);
    }
}
