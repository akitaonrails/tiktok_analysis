package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.058N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.DraftBoxGuideHelper$markDraftBoxGuideShow$1", f = "DraftBoxGuideHelper.kt", l = {}, m = "invokeSuspend")
public final class C058N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C058N(InterfaceC1364105Vn<? super C058N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C058N(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxGuideHelper@4103.markDraftBoxGuideShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIILLIIL("show_profile_draft_box_guide", new C0LAB().LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxGuideHelper@4103.markDraftBoxGuideShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C058N(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
