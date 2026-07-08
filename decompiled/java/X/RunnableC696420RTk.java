package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC696420RTk implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    public RunnableC696420RTk(long j, int i, String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = str2;
        this.LLILZIL = z;
    }

    public final void LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJIIIIZZ("element_type", this.LL);
        String str = this.LL;
        int i = this.LLILLJJLI;
        long j = this.LLILLL;
        String str2 = this.LLILZ;
        boolean z = this.LLILZIL;
        if (!Intrinsics.LJFF(str, "manage")) {
            c2344009Gk.LIZJ(i, "subtab_position");
            c2344009Gk.LIZLLL(j, "explore_topic_id");
            C15TA c15ta = C15TA.LIZ;
            String strValueOf = String.valueOf(j);
            c15ta.getClass();
            c2344009Gk.LJFF("explore_topic", C15TA.LIZIZ(strValueOf, str2));
            c2344009Gk.LIZJ(z ? 1 : 0, "has_red_dot");
        }
        C20684815ws.LJIILLIIL("ttexp_subtab_bar_element_click", c2344009Gk.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logSubTabBarElementClick$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logSubTabBarElementClick$1");
    }
}
