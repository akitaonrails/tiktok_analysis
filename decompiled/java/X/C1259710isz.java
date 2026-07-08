package X;

import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0isz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel$initGuideCreateWithEffect$3", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1259710isz extends C09AX implements Function2<C12E8, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ProfileViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259710isz(ProfileViewModel profileViewModel, InterfaceC1364105Vn<? super C1259710isz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1259710isz c1259710isz = new C1259710isz(this.LLILLJJLI, interfaceC1364105Vn);
        c1259710isz.LL = obj;
        return c1259710isz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileViewModel@d2d5.initGuideCreateWithEffect$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C12E8 c12e8 = (C12E8) this.LL;
        if (c12e8 != null) {
            this.LLILLJJLI.setState(new AwS614S0100000_35(c12e8, 214));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileViewModel@d2d5.initGuideCreateWithEffect$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C12E8 c12e8, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c12e8, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
