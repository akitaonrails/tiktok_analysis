package X;

/* JADX INFO: renamed from: X.01Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC351701Yd implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    public RunnableC351701Yd(int i, long j, long j2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
    }

    public final void LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LL, "aweme_size");
        c2344009Gk.LIZLLL(this.LLILLJJLI - this.LLILLL, "preload_post_image_cost");
        c2344009Gk.LJ(Boolean.valueOf(this.LLILZ), "is_my_profile");
        C20684815ws.LJIILLIIL("profile_create_and_post_api_cost_time", c2344009Gk.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ProfilePlatformStatistics@1051.statisticPreloadImageCostTime$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.statisticPreloadImageCostTime$1");
    }
}
