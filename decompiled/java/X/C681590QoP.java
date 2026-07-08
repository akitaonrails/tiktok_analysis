package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.mob.SearchMusicMiddlePerfMobHelper$sendTrendingMob$1", f = "SearchMusicMiddlePerfMobHelper.kt", l = {219}, m = "invokeSuspend")
public final class C681590QoP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C681610QoR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681590QoP(C681610QoR c681610QoR, InterfaceC1364105Vn<? super C681590QoP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c681610QoR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681590QoP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("SearchMusicMiddlePerfMobHelper@2b04.sendTrendingMob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099F c099f = this.LLILLJJLI.LJIILJJIL;
            this.LL = 1;
            if (c099f.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.sendTrendingMob$1");
                return objLJFF;
            }
        }
        C681610QoR c681610QoR = this.LLILLJJLI;
        long j = c681610QoR.LJI - c681610QoR.LJIIJJI;
        long j2 = j - (c681610QoR.LJFF - c681610QoR.LJ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
        c2344009Gk.LJIIIIZZ("search_entrance", C15IK.LIZ);
        c2344009Gk.LJIIIIZZ("shoot_way", C15IK.LJIIJJI);
        c2344009Gk.LJIIIIZZ("perf_type", "guess_search");
        c2344009Gk.LIZJ(this.LLILLJJLI.LIZLLL, "count");
        c2344009Gk.LIZLLL(j, "total_cost");
        c2344009Gk.LIZLLL(j2, "client_cost");
        c2344009Gk.LJIIIIZZ("server_cost", String.valueOf(this.LLILLJJLI.LJII));
        String str3 = "1";
        if (this.LLILLJJLI.LJIILIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_preload", str);
        if (this.LLILLJJLI.LJIIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_reused", str2);
        if (!C682080QpC.LIZ()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_lynx", str3);
        C20684815ws.LJIILLIIL("search_music_middle_monitor", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.sendTrendingMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
