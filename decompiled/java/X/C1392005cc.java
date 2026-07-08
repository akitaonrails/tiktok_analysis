package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.utils.SocialAvatarCache$clearCache$1", f = "SocialAvatarCache.kt", l = {}, m = "invokeSuspend")
public final class C1392005cc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1392005cc(InterfaceC1364105Vn<? super C1392005cc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392005cc(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCache@6895.clearCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C442910HYj.LIZ.setValue(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCache@6895.clearCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1392005cc(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
