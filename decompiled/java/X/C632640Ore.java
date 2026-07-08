package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ore, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.report.compose.ReportComposablesKt$MusicList$1$1", f = "ReportComposables.kt", l = {}, m = "invokeSuspend")
public final class C632640Ore extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC636240OxS<C632560OrW> LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632640Ore(InterfaceC636240OxS<C632560OrW> interfaceC636240OxS, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C632640Ore> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC636240OxS;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632640Ore(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportComposablesKt@2869.MusicList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setValue(Boolean.valueOf(this.LL.getLoadMoreState() instanceof C636180OxM));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReportComposablesKt@2869.MusicList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
