package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.LoadingCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.LoadingCell$startGenerateMore$1$3", f = "ResultV1Cell.kt", l = {}, m = "invokeSuspend")
public final class C440960HQw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LoadingCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440960HQw(LoadingCell loadingCell, InterfaceC1364105Vn<? super C440960HQw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = loadingCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440960HQw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadingCell@1835.startGenerateMore$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.itemView);
        c1389890mGx.LJIIJ("Something went wrong. Please try again later");
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadingCell@1835.startGenerateMore$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
