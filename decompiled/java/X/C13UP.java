package X;

import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13UP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UP {
    public static final C13UP LIZ = new C13UP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(261));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(263));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(262));

    public static C13S6 LIZ() {
        return (C13S6) LIZIZ.getValue();
    }

    public static void LIZIZ(int i, long j, String str, long j2, long j3, long j4, long j5, int i2, long j6, int i3, long j7, int i4, long j8, int i5, long j9, int i6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "clean_type");
        c2344009Gk.LIZLLL(j, "cost_time");
        c2344009Gk.LJIIIIZZ("custom_cache_name", str);
        c2344009Gk.LIZLLL(j2, "cache_size_before");
        c2344009Gk.LIZLLL(j3, "cache_size_after");
        c2344009Gk.LIZLLL(j4, "cache_clean_size");
        c2344009Gk.LIZJ(i2, "remove_unused_count");
        c2344009Gk.LIZLLL(j5, "remove_unused_size");
        c2344009Gk.LIZJ(i3, "trim_size_count");
        c2344009Gk.LIZLLL(j6, "trim_size_size");
        c2344009Gk.LIZJ(i4, "remove_dead_files_count");
        c2344009Gk.LIZLLL(j7, "remove_dead_files_size");
        c2344009Gk.LIZJ(i5, "remove_allow_list_count");
        c2344009Gk.LIZLLL(j8, "remove_allow_list_size");
        c2344009Gk.LIZJ(i6, "clean_total_count");
        c2344009Gk.LIZLLL(j9, "clean_total_size");
        C20684815ws.LJIILLIIL("tools_disk_lru_cache_clean_storage", c2344009Gk.LIZ);
    }
}
