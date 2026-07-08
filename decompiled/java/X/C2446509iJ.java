package X;

import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09iJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel$showConditionControl$2$2$1", f = "ProfileFollowingSuggestViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2446509iJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileFollowingSuggestViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446509iJ(ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel, InterfaceC1364105Vn<? super C2446509iJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileFollowingSuggestViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2446509iJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowingSuggestViewModel@1dfb.showConditionControl$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel = this.LL;
        profileFollowingSuggestViewModel.setState(new AwS582S0100000_3(profileFollowingSuggestViewModel, 35));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileFollowingSuggestViewModel@1dfb.showConditionControl$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
