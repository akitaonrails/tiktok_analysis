package X;

import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM$showComponent$2", f = "FollowingHvrLabelInFypVM.kt", l = {}, m = "invokeSuspend")
public final class C2443909ht extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowingHvrLabelInFypVM LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443909ht(FollowingHvrLabelInFypVM followingHvrLabelInFypVM, Aweme aweme, InterfaceC1364105Vn<? super C2443909ht> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followingHvrLabelInFypVM;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2443909ht(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingHvrLabelInFypVM@ee2c.showComponent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI = this.LLILLJJLI.getAid();
        this.LL.vQ2().LIZ(C2444009hu.LIZ);
        this.LL.setState(new AwS582S0100000_3(this.LLILLJJLI, 167));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingHvrLabelInFypVM@ee2c.showComponent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
