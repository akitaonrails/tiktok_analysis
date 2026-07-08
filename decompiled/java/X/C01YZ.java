package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.01YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01YZ implements Runnable {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ = "homepage_hot";

    public C01YZ(String str, String str2, Aweme aweme) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    public final void LIZ() {
        String str = (String) C705402pA.LIZIZ(this.LL).getFirst();
        if (str.length() == 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("request_id", this.LLILLL);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZ);
        c2344009Gk.LJIIIIZZ("server_return_component_ids", str);
        C20684815ws.LJIILLIIL("record_component_parse_delete", c2344009Gk.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RecordComponentMobReporter@b928.reportComponentDelete$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordComponentMobReporter@b928.reportComponentDelete$1");
    }
}
