package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FDL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.template.ui.CaptionTemplateListComponent$fetchData$2$1$1", f = "CaptionTemplateListComponent.kt", l = {}, m = "invokeSuspend")
public final class C0FDL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FDW LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EffectChannelResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDL(C0FDW c0fdw, boolean z, EffectChannelResponse effectChannelResponse, InterfaceC1364105Vn<? super C0FDL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0fdw;
        this.LLILLJJLI = z;
        this.LLILLL = effectChannelResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FDL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTemplateListComponent@1430.fetchData$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FDW c0fdw = this.LL;
        c0fdw.C5(this.LLILLJJLI, c0fdw.K4(this.LLILLL.getAll_category_effects()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTemplateListComponent@1430.fetchData$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
