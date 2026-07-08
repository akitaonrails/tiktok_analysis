package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0htG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel$handleDiscard$1", f = "ProfileAigcAvatarViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1221440htG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileAigcAvatarViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221440htG(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, InterfaceC1364105Vn<? super C1221440htG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileAigcAvatarViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1221440htG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.handleDiscard$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            ((IAIGCAvatarService) this.LL.LLILLL.getValue()).ar(EnumC1221320ht4.SOCIAL, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.handleDiscard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
