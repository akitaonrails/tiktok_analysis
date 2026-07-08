package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplateApplier$apply$launchLyric$1$1$2", f = "LyricsRuleTemplateApplier.kt", l = {}, m = "invokeSuspend")
public final class C0MJ2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1415130mvf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJ2(C1415130mvf c1415130mvf, InterfaceC1364105Vn<? super C0MJ2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1415130mvf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MJ2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("LyricsRuleTemplateApplier@cea7.apply$launchLyric$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC366450EYh interfaceC366450EYh = this.LL.LIZJ;
        if (interfaceC366450EYh != null) {
            interfaceC366450EYh.NJ0(false);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("LyricsRuleTemplateApplier@cea7.apply$launchLyric$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
