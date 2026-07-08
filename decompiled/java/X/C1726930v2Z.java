package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sticker.question.QaStickerPresenter$handlerAddYoursClickEvent$1$1", f = "QaStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C1726930v2Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19579911j3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726930v2Z(C19579911j3 c19579911j3, InterfaceC1364105Vn<? super C1726930v2Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19579911j3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726930v2Z(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QaStickerPresenter@9a4e.handlerAddYoursClickEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19579911j3 c19579911j3 = this.LL;
        c19579911j3.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(c19579911j3.LIZIZ);
        c1389890mGx.LJIIIZ(2131845725);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QaStickerPresenter@9a4e.handlerAddYoursClickEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
