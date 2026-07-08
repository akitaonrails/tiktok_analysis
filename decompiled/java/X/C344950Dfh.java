package X;

import dtj.u7;

/* JADX INFO: renamed from: X.0Dfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C344950Dfh {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static final void LIZIZ(long j, long j2, boolean z, boolean z2) {
        if (u7.LIZ() && !u7.LIZLLL()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j / ((long) 52428800), "available_size");
        long j3 = 1024;
        c0lab.LIZIZ((j2 / j3) / j3, "min_size");
        c0lab.LJFF("is_sd", z);
        c0lab.LJFF("enable_shoot", z2);
        C20684815ws.LJIILLIIL("tool_performance_record_check", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.util.concurrent.atomic.AtomicLong] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC497601wk r12, android.content.Context r13, boolean r14, boolean r15, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Long, java.lang.Long>> r16) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344950Dfh.LIZ(X.01wk, android.content.Context, boolean, boolean, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(EnumC344990Dfl enumC344990Dfl, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = z2;
        boolean z5 = false;
        if ((i & 256) != 0) {
            z4 = false;
        }
        if ((i & 512) == 0) {
            z5 = z3;
        }
        if (u7.LIZ() && !u7.LIZLLL()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j / ((long) 52428800), "available_size");
        long j6 = 1024;
        c0lab.LIZIZ((j2 / j6) / j6, "min_size");
        c0lab.LJFF("is_sd", true);
        c0lab.LJFF("enable_shoot", z);
        c0lab.LIZ(enumC344990Dfl.getValue(), "storage_clean_type");
        c0lab.LIZIZ((j3 / j6) / j6, "storage_clean_limit");
        c0lab.LIZIZ((j4 / j6) / j6, "storage_clean_size");
        c0lab.LIZIZ(j5, "storage_clean_time");
        c0lab.LJFF("open_cache_settings", z4);
        c0lab.LJFF("storage_clean_fail", z5);
        C20684815ws.LJIILLIIL("tool_performance_record_check", c0lab.LIZ);
    }
}
