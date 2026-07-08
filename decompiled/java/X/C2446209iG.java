package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel$hideComponent$2", f = "ProfileFollowingSuggestViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2446209iG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileFollowingSuggestViewModel LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446209iG(ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel, Aweme aweme, InterfaceC1364105Vn<? super C2446209iG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileFollowingSuggestViewModel;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2446209iG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowingSuggestViewModel@1dfb.hideComponent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS582S0100000_3(this.LLILLJJLI, 32));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileFollowingSuggestViewModel@1dfb.hideComponent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
