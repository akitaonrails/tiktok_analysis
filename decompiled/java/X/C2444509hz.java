package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel$showComponent$2", f = "FYPFollowingSuggestViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2444509hz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FYPFollowingSuggestViewModel LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444509hz(FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel, Aweme aweme, InterfaceC1364105Vn<? super C2444509hz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fYPFollowingSuggestViewModel;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2444509hz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FYPFollowingSuggestViewModel@e671.showComponent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        this.LL.vQ2().LIZ(C2444009hu.LIZ);
        this.LL.setState(new AwS582S0100000_3(this.LLILLJJLI, 33));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.showComponent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
