package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.monitor.FriendsV3LoadMoreReporter$onLoadingHidden$1", f = "FriendsV3LoadMoreReporter.kt", l = {}, m = "invokeSuspend")
public final class C1582350rHN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1582370rHP LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1582380rHQ LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582350rHN(C1582370rHP c1582370rHP, long j, long j2, int i, C1582380rHQ c1582380rHQ, long j3, boolean z, int i2, String str, InterfaceC1364105Vn<? super C1582350rHN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1582370rHP;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = c1582380rHQ;
        this.LLILZLL = j3;
        this.LLIZ = z;
        this.LLIZLLLIL = i2;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1582350rHN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("FriendsV3LoadMoreReporter@fa6a.onLoadingHidden$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJFF = this.LL.LIZ.LJFF();
        long j = this.LLILLJJLI - this.LLILLL;
        C1582370rHP c1582370rHP = this.LL;
        if (this.LLILZ > this.LLILZIL.LJFF) {
            i = 1;
        } else {
            i = 0;
        }
        c1582370rHP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("previous_page", "homepage_friends");
        c2344009Gk.LJIIIIZZ("tag", "social_friends_tab_v3");
        c2344009Gk.LIZLLL(this.LLILZIL.LIZLLL, "session_id");
        c2344009Gk.LIZJ(this.LLILZIL.LJ, "index");
        c2344009Gk.LIZJ(this.LLILZIL.LIZIZ, "prf_cnt");
        c2344009Gk.LIZLLL(this.LLILZIL.LIZJ, "duration_from_last");
        c2344009Gk.LIZLLL(j, "start_duration");
        c2344009Gk.LIZLLL(this.LLILZLL, "duration");
        c2344009Gk.LJIIIIZZ("network_status", strLJFF);
        C1582370rHP c1582370rHP2 = this.LL;
        boolean z = this.LLIZ;
        c1582370rHP2.getClass();
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LIZJ(i, "is_has_new_data");
        Integer num = this.LLILZIL.LJI;
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "scroll_level");
        }
        if (!this.LLIZ) {
            c2344009Gk.LIZJ(this.LLIZLLLIL, "status_code");
            c2344009Gk.LJFF("status_msg", this.LLJ);
        }
        C20684815ws.LJIILLIIL("prf_feed_loading_time_friends", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3LoadMoreReporter@fa6a.onLoadingHidden$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
