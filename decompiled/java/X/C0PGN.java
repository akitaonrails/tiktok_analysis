package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PGN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.mob.SearchNativeHubMobHelper$mobTabShow$1", f = "SearchNativeHubMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C0PGN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SearchLabel LLILLL;
    public final /* synthetic */ GameInfo LLILZ;
    public final /* synthetic */ EnumC654440Pli LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PGN(String str, int i, SearchLabel searchLabel, GameInfo gameInfo, EnumC654440Pli enumC654440Pli, InterfaceC1364105Vn<? super C0PGN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = searchLabel;
        this.LLILZ = gameInfo;
        this.LLILZIL = enumC654440Pli;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PGN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNativeHubMobHelper@4d2e.mobTabShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C654760PmE c654760PmE = new C654760PmE(null);
        String str = this.LL;
        int i = this.LLILLJJLI;
        SearchLabel searchLabel = this.LLILLL;
        GameInfo gameInfo = this.LLILZ;
        EnumC654440Pli enumC654440Pli = this.LLILZIL;
        C654050Pl5.LIZ.getClass();
        C654050Pl5.LIZJ(c654760PmE, str, i, searchLabel, gameInfo, enumC654440Pli);
        c654760PmE.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNativeHubMobHelper@4d2e.mobTabShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
