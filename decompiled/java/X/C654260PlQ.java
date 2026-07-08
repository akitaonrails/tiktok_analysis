package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.mob.SearchNativeHubMobHelper$mobShootShow$1", f = "SearchNativeHubMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C654260PlQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C654080Pl8 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C654260PlQ(C654080Pl8 c654080Pl8, String str, InterfaceC1364105Vn<? super C654260PlQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c654080Pl8;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C654260PlQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SearchNativeHubMobHelper@4d2e.mobShootShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C650460PfI<C654390Pld> c650460PfI = new C650460PfI<C654390Pld>() { // from class: X.0Pld
        };
        C654080Pl8 c654080Pl8 = this.LL;
        String str2 = this.LLILLJJLI;
        if (c654080Pl8 != null) {
            str = c654080Pl8.LIZ;
        } else {
            str = null;
        }
        c650460PfI.LJ("music_id", str);
        c650460PfI.LJ("is_show", "1");
        c650460PfI.LJ("is_music_chart", "1");
        c650460PfI.LJ("search_source", str2);
        c650460PfI.LJ("enter_from", "general_search");
        c650460PfI.LJ("shoot_way", "music_chart");
        c650460PfI.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNativeHubMobHelper@4d2e.mobShootShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
