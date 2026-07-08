package X;

/* JADX INFO: renamed from: X.05HW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05HW implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;

    public C05HW(boolean z, int i) {
        this.LL = z;
        this.LLILLJJLI = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ProfileStatistics@a865.reportPrivateTabVideoList$1");
        try {
            C0LAB c0lab = new C0LAB();
            c0lab.LJFF("is_success", this.LL);
            c0lab.LIZ(this.LLILLJJLI, "list_count");
            C20684815ws.LJIILLIIL("profile_private_video_list", c0lab.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileStatistics@a865.reportPrivateTabVideoList$1");
    }
}
