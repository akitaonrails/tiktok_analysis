package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292114ad extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20292114ad(long j, long j2, boolean z, String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C14ZW c14zw = C14ZW.LIZ;
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        c14zw.getClass();
        C14ZG c14zgLJII = C14ZW.LJII(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("aid", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("survey_key", this.LL);
        c2344009Gk.LIZJ(c14zgLJII != null ? c14zgLJII.LIZJ : -1, "survey_style_group");
        c2344009Gk.LIZLLL(c14zgLJII != null ? c14zgLJII.LJ : 0L, "long_interval_config_time");
        c2344009Gk.LJ(Boolean.valueOf(this.LLILLL), "in_long_Interval");
        c2344009Gk.LIZLLL(this.LLILZ, "last_show_time");
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "current_time");
        c2344009Gk.LIZLLL(this.LLILZIL, "long_Interval_next_show_time");
        C20684815ws.LJIILLIIL("check_frequency_check_status", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
