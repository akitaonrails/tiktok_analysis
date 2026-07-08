package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.monitor.FriendsV3LoadMoreReporter$reportShown$1", f = "FriendsV3LoadMoreReporter.kt", l = {}, m = "invokeSuspend")
public final class C1582360rHO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1582370rHP LL;
    public final /* synthetic */ C1582390rHR LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582360rHO(C1582370rHP c1582370rHP, C1582390rHR c1582390rHR, Integer num, InterfaceC1364105Vn<? super C1582360rHO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1582370rHP;
        this.LLILLJJLI = c1582390rHR;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1582360rHO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3LoadMoreReporter@fa6a.reportShown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJI = this.LL.LIZ.LJI();
        String strLIZJ = this.LL.LIZ.LIZJ();
        String strLJFF = this.LL.LIZ.LJFF();
        C1582390rHR c1582390rHR = this.LLILLJJLI;
        long j = c1582390rHR.LIZIZ - c1582390rHR.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("previous_page", "homepage_friends");
        c2344009Gk.LJIIIIZZ("tag", "social_friends_tab_v3");
        c2344009Gk.LIZJ(this.LLILLJJLI.LJI, "current_index");
        c2344009Gk.LIZJ(this.LLILLJJLI.LJII, "item_count_before");
        C1582370rHP c1582370rHP = this.LL;
        boolean z = this.LLILLJJLI.LJIIIIZZ;
        c1582370rHP.getClass();
        c2344009Gk.LIZJ(z ? 1 : 0, "has_more_before");
        c2344009Gk.LIZLLL(this.LLILLJJLI.LJFF, "session_id");
        c2344009Gk.LJIIIIZZ("internet_speed", strLJI);
        c2344009Gk.LJIIIIZZ("access_type", strLIZJ);
        c2344009Gk.LJIIIIZZ("network_status", strLJFF);
        c2344009Gk.LIZJ(this.LLILLJJLI.LIZLLL, "prf_cnt");
        c2344009Gk.LIZLLL(this.LLILLJJLI.LJ, "duration_from_last");
        c2344009Gk.LIZLLL(j, "start_duration");
        Integer num = this.LLILLL;
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "scroll_level");
        }
        C20684815ws.LJIILLIIL("prf_feed_loading_friends", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3LoadMoreReporter@fa6a.reportShown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
