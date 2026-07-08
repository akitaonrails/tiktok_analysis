package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01TC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostMobEvent$sendNoMoreItemEvent$1", f = "RepostMobEvent.kt", l = {}, m = "invokeSuspend")
public final class C01TC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TC(Boolean bool, String str, String str2, Long l, InterfaceC1364105Vn<? super C01TC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bool;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TC(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("RepostMobEvent@22f7.sendNoMoreItemEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (this.LL.booleanValue()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("previous_page", this.LLILLL);
        c2344009Gk.LJ(this.LLILZ, "profile_entrance_id");
        c2344009Gk.LJIIIIZZ("tab_name", "repost_history");
        C20684815ws.LJIILLIIL("profile_no_more_videos_prompt_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostMobEvent@22f7.sendNoMoreItemEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
