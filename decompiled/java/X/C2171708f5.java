package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel$timeoutCallback$1", f = "ProfilePlatformViewModel.kt", l = {340}, m = "invokeSuspend")
public final class C2171708f5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfilePlatformViewModel LLILLJJLI;
    public final /* synthetic */ AtomicInteger LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2171708f5(ProfilePlatformViewModel profilePlatformViewModel, AtomicInteger atomicInteger, InterfaceC1364105Vn<? super C2171708f5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profilePlatformViewModel;
        this.LLILLL = atomicInteger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2171708f5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformViewModel@a192.timeoutCallback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("ProfilePlatformViewModel@a192.timeoutCallback$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LLJIJIL) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfilePlatformView", "getSelfInfo timeout fallback triggered. reset variable.");
            this.LLILLJJLI.LLJIJIL = false;
            this.LLILLL.set(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformViewModel@a192.timeoutCallback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
