package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.mob.SearchMusicMiddlePerfMobHelper$sendHistoryMob$1", f = "SearchMusicMiddlePerfMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C681600QoQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C681610QoR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681600QoQ(C681610QoR c681610QoR, InterfaceC1364105Vn<? super C681600QoQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c681610QoR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681600QoQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("SearchMusicMiddlePerfMobHelper@2b04.sendHistoryMob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C681610QoR c681610QoR = this.LL;
        long j = c681610QoR.LJIIJ - c681610QoR.LJIIJJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
        c2344009Gk.LJIIIIZZ("search_entrance", C15IK.LIZ);
        c2344009Gk.LJIIIIZZ("shoot_way", C15IK.LJIIJJI);
        c2344009Gk.LJIIIIZZ("perf_type", "history");
        c2344009Gk.LIZLLL(j, "total_cost");
        c2344009Gk.LIZJ(this.LL.LJIIIIZZ, "count");
        String str3 = "1";
        if (this.LL.LJIILIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_preload", str);
        if (this.LL.LJIIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_reused", str2);
        if (!C682080QpC.LIZIZ()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_lynx", str3);
        C20684815ws.LJIILLIIL("search_music_middle_monitor", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.sendHistoryMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
