package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.data.ProfileMenuModelStore$1$1", f = "ProfileMenuModelStore.kt", l = {}, m = "invokeSuspend")
public final class C859020Xmu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C859020Xmu(InterfaceC1364105Vn<? super C859020Xmu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859020Xmu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileMenuModelStore@9dca.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1246850iYF.LIZ.getClass();
        C1246850iYF.LIZ("load_page_model_switch_account_menu");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileMenuModelStore@9dca.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C859020Xmu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
