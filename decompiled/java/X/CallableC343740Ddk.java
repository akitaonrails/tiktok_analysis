package X;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ddk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC343740Ddk<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    public CallableC343740Ddk(String str, String str2, String str3, String str4, long j) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("LynxTabMobUtils@a7eb.mobContainerLoadResult$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("top_tab_key", this.LL);
        c2344009Gk.LJIIIIZZ("activity_id", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("code", this.LLILLL);
        c2344009Gk.LJIIIIZZ("msg", this.LLILZ);
        c2344009Gk.LIZLLL(this.LLILZIL, "total_duration");
        C20684815ws.LJIILLIIL("rd_tab_lynx_container_load_result", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxTabMobUtils@a7eb.mobContainerLoadResult$1");
        return unit;
    }
}
