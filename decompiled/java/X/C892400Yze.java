package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Yze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.cache.ProfilePageModelStore$1$1", f = "ProfilePageModelStore.kt", l = {}, m = "invokeSuspend")
public final class C892400Yze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C892400Yze(InterfaceC1364105Vn<? super C892400Yze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892400Yze(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePageModelStore@45ba.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1250160ida.LIZ.getClass();
        C1250160ida.LIZ("load_page_model_switch_account", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePageModelStore@45ba.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C892400Yze(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
