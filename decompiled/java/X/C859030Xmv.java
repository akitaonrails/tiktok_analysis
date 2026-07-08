package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$preLoadMenuInfo$1$1$1", f = "I18nMyProfileFragment.kt", l = {}, m = "invokeSuspend")
public final class C859030Xmv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C859030Xmv(InterfaceC1364105Vn<? super C859030Xmv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859030Xmv(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nMyProfileFragment@e77a.preLoadMenuInfo$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1246850iYF c1246850iYF = C1246850iYF.LIZ;
        if (C1246850iYF.LIZIZ != null) {
            c1246850iYF.getClass();
        } else {
            c1246850iYF.getClass();
            C1246850iYF.LIZ("preload");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.preLoadMenuInfo$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C859030Xmv(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
