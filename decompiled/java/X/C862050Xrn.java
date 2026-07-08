package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tpsc.privacy.business.components.base.AccountPrivacySettingItemModel$onRestrictionChangeListener$1$onChange$1", f = "AccountPrivacySettingItemModel.kt", l = {}, m = "invokeSuspend")
public final class C862050Xrn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C109T LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862050Xrn(C109T c109t, InterfaceC1364105Vn<? super C862050Xrn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c109t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862050Xrn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountPrivacySettingItemModel@9fe6.onRestrictionChangeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountPrivacySettingItemModel@9fe6.onRestrictionChangeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
