package X;

import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0isy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel$initCSIBanners$3", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1259700isy extends C09AX implements Function2<C19720512Dr, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ProfileViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259700isy(ProfileViewModel profileViewModel, InterfaceC1364105Vn<? super C1259700isy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1259700isy c1259700isy = new C1259700isy(this.LLILLJJLI, interfaceC1364105Vn);
        c1259700isy.LL = obj;
        return c1259700isy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileViewModel@d2d5.initCSIBanners$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS614S0100000_35((C19720512Dr) this.LL, 211));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileViewModel@d2d5.initCSIBanners$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C19720512Dr c19720512Dr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c19720512Dr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
