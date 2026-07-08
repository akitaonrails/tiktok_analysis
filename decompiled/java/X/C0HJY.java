package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarCreationStatusDataSource$1$1", f = "SocialAvatarCreationStatusServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0HJY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HJW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJY(C0HJW c0hjw, InterfaceC1364105Vn<? super C0HJY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hjw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HJY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HMN c0hmn = (C0HMN) this.LL.LJIIIZ.getValue();
        if (c0hmn != null) {
            c0hmn.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
