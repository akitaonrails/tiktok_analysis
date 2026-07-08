package X;

import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08f7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel$getSelfInfo$1$4", f = "ProfilePlatformViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2171908f7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfilePlatformViewModel LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2171908f7(ProfilePlatformViewModel profilePlatformViewModel, Exception exc, InterfaceC1364105Vn<? super C2171908f7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profilePlatformViewModel;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2171908f7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformViewModel@a192.getSelfInfo$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS582S0100000_3(this.LLILLJJLI, 8));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformViewModel@a192.getSelfInfo$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
