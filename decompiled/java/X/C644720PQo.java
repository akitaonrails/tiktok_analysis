package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.mob.SearchNativeHubMobHelper$mobHeaderClick$1", f = "SearchNativeHubMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C644720PQo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C654080Pl8 LL;
    public final /* synthetic */ GameInfo LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644720PQo(C654080Pl8 c654080Pl8, GameInfo gameInfo, Boolean bool, String str, String str2, InterfaceC1364105Vn<? super C644720PQo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c654080Pl8;
        this.LLILLJJLI = gameInfo;
        this.LLILLL = bool;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C644720PQo(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNativeHubMobHelper@4d2e.mobHeaderClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C654740PmC c654740PmC = new C654740PmC(null);
        C654080Pl8 c654080Pl8 = this.LL;
        GameInfo gameInfo = this.LLILLJJLI;
        Boolean bool = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        C654050Pl5.LIZ.getClass();
        C654050Pl5.LIZIZ(c654740PmC, c654080Pl8, gameInfo, bool, str);
        c654740PmC.LJIIZILJ("button_type", str2);
        c654740PmC.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNativeHubMobHelper@4d2e.mobHeaderClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
