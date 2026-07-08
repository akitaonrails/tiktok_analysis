package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerUserCardWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerUserCardWidgetContainer$observeNoticeState$1$1", f = "FollowerUserCardWidgetContainer.kt", l = {187}, m = "invokeSuspend")
public final class C1889310zGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowerPageAbilityCenter$IFollowerWidgetContainerAbility LLILLJJLI;
    public final /* synthetic */ FollowerUserCardWidgetContainer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889310zGT(FollowerPageAbilityCenter$IFollowerWidgetContainerAbility followerPageAbilityCenter$IFollowerWidgetContainerAbility, FollowerUserCardWidgetContainer followerUserCardWidgetContainer, InterfaceC1364105Vn<? super C1889310zGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followerPageAbilityCenter$IFollowerWidgetContainerAbility;
        this.LLILLL = followerUserCardWidgetContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889310zGT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowerUserCardWidgetContainer@5711.observeNoticeState$1$1");
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
            C19335010ke c19335010ke = new C19335010ke(this.LLILLJJLI.Ea2(), 0);
            AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLL, 3);
            this.LL = 1;
            if (c19335010ke.collect(agS308S0100000_28, this) == objLJFF) {
                C1C7U.LIZIZ("FollowerUserCardWidgetContainer@5711.observeNoticeState$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowerUserCardWidgetContainer@5711.observeNoticeState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
