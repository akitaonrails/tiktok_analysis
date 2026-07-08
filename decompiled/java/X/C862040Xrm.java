package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.generalitem.BaseAccountPrivacyItemComponent$onRestrictionChangeListener$1$onChange$1", f = "BaseAccountPrivacyItemComponent.kt", l = {}, m = "invokeSuspend")
public final class C862040Xrm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC191963108b LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862040Xrm(AbstractC191963108b abstractC191963108b, InterfaceC1364105Vn<? super C862040Xrm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC191963108b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862040Xrm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAccountPrivacyItemComponent@9156.onRestrictionChangeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAccountPrivacyItemComponent@9156.onRestrictionChangeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
