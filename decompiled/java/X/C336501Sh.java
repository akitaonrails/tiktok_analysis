package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.avatar.StoryAvatarPreloadFunnel$log$1", f = "StoryAvatarPreloadFunnel.kt", l = {}, m = "invokeSuspend")
public final class C336501Sh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336501Sh(String str, String str2, String str3, long j, String str4, Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super C336501Sh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = str4;
        this.LLILZLL = bool;
        this.LLIZ = bool2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C336501Sh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryAvatarPreloadFunnel@6584.log$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("step", this.LL);
        c2344009Gk.LJIIIIZZ("aid", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("author_id", this.LLILLL);
        c2344009Gk.LIZLLL(this.LLILZ, "cost_ms");
        String str = this.LLILZIL;
        if (str != null) {
            c2344009Gk.LJFF("reason", str);
        }
        Boolean bool = this.LLILZLL;
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "stories_empty");
        }
        Boolean bool2 = this.LLIZ;
        if (bool2 != null) {
            c2344009Gk.LIZJ(bool2.booleanValue() ? 1 : 0, "timed_out");
        }
        C20684815ws.LJIILLIIL("story_avatar_preload_funnel", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryAvatarPreloadFunnel@6584.log$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
