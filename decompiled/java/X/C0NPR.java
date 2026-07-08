package X;

import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcStyleViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NPR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcStyleViewModel$onPrepared$1$1", f = "ProfileAigcStyleViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0NPR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileAigcStyleViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPR(ProfileAigcStyleViewModel profileAigcStyleViewModel, InterfaceC1364105Vn<? super C0NPR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileAigcStyleViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileAigcStyleViewModel@80f3.onPrepared$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS588S0100000_9(AIGCAvatarServiceImpl.LIZIZ().LIZ(), (List<InterfaceC1891350zJl>) 420));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAigcStyleViewModel@80f3.onPrepared$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
