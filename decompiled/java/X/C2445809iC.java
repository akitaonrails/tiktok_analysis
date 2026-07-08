package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel$showComponent$2", f = "ProfileFollowingSuggestViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2445809iC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileFollowingSuggestViewModel LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2445809iC(ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel, Aweme aweme, InterfaceC1364105Vn<? super C2445809iC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileFollowingSuggestViewModel;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2445809iC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowingSuggestViewModel@1dfb.showComponent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        this.LL.vQ2().LIZ(C2444009hu.LIZ);
        this.LL.setState(new AwS582S0100000_3(this.LLILLJJLI, 34));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileFollowingSuggestViewModel@1dfb.showComponent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
