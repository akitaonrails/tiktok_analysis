package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$logEcAdVideo$1$2", f = "CommerceVideoDelegateKt.kt", l = {}, m = "invokeSuspend")
public final class C363101b3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ CommerceVideoDelegateKt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C363101b3(CommerceVideoDelegateKt commerceVideoDelegateKt, Aweme aweme, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = commerceVideoDelegateKt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363101b3(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.logEcAdVideo$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommerceVideoDelegateKt.LLLLZLLLI(this.LLILLJJLI, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.logEcAdVideo$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
