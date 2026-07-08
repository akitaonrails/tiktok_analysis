package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting.AIMattingFetcher$innerFetchResource$2", f = "AIMattingFetcher.kt", l = {}, m = "invokeSuspend")
public final class C353510DtV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0E48 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353510DtV(C0E48 c0e48, InterfaceC1364105Vn<? super C353510DtV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0e48;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353510DtV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIMattingFetcher@f0c9.innerFetchResource$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C569610MVr.LIZIZ().LJIIJ(C1697810uHb.LJ("7301210488958882306", "7328289135402160641", "7550959958905328144", "7550979354717590017"), "editor_pro_gameplay", true, new C0FX9(this.LL, 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMattingFetcher@f0c9.innerFetchResource$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
