package X;

/* JADX INFO: renamed from: X.0J8R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J8R implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI = "top_right";
    public final /* synthetic */ String LLILLL = "2s";

    public C0J8R(String str) {
        this.LL = str;
    }

    public final void LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        c2344009Gk.LJIIIIZZ("ind_pos", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("display_setting", this.LLILLL);
        C20684815ws.LJIILLIIL("show_photo_page_indicator", c2344009Gk.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logNumIndicatorShow$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logNumIndicatorShow$1");
    }
}
