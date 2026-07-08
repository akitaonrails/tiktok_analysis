package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceCell$reportOnShow$1", f = "SourceSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C1783710wW9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1781740wSy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783710wW9(C1781740wSy c1781740wSy, InterfaceC1364105Vn<? super C1783710wW9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1781740wSy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783710wW9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SourceCell@ae7f.reportOnShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1508705vR c1508705vR = C1508705vR.LL;
        C1781740wSy c1781740wSy = this.LL;
        String str = c1781740wSy.LLIZLLLIL;
        String str2 = c1781740wSy.LLJI;
        String str3 = c1781740wSy.LLJIJIL;
        String str4 = c1781740wSy.LLJILJIL;
        String strLIZIZ = C0ZO8.LIZIZ(c1781740wSy.LLIZ);
        String strLIZ = C0ZO8.LIZ(this.LL.LLIZ);
        C1781740wSy c1781740wSy2 = this.LL;
        String str5 = c1781740wSy2.LLILLL;
        String str6 = c1781740wSy2.LLJILJILJ;
        String str7 = c1781740wSy2.LLJILLL;
        c1508705vR.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498705tp(str, str5, str2, str3, str4, strLIZIZ, strLIZ, str6, str7, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SourceCell@ae7f.reportOnShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
