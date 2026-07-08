package X;

import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem$onBind$1", f = "SearchNimbleDocListAssem.kt", l = {115, 116}, m = "invokeSuspend")
public final class C621830OaD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchNimbleDocListAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC685060Qu0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621830OaD(SearchNimbleDocListAssem searchNimbleDocListAssem, InterfaceC685060Qu0 interfaceC685060Qu0, InterfaceC1364105Vn<? super C621830OaD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchNimbleDocListAssem;
        this.LLILLL = interfaceC685060Qu0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621830OaD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNimbleDocListAssem@d326.onBind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.Fp(this.LLILLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchNimbleDocListAssem@d326.onBind$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SearchNimbleDocListAssem searchNimbleDocListAssem = this.LLILLJJLI;
            this.LL = 1;
            searchNimbleDocListAssem.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C0P4U c0p4u = new C0P4U(c2252611DEt, 0);
            C786410Ut5.v2().postFrameCallback(c0p4u);
            c2252611DEt.LJJII(new AwS588S0100000_9(c0p4u, 19));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("SearchNimbleDocListAssem@d326.onBind$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (C2252671DEz.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("SearchNimbleDocListAssem@d326.onBind$1");
            return objLJFF;
        }
        this.LLILLJJLI.Fp(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchNimbleDocListAssem@d326.onBind$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
