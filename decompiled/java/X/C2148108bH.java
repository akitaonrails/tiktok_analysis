package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$updateSubscribe$1$1", f = "UnsubscribeChannelSettingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2148108bH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC2148408bK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148108bH(int i, Integer num, boolean z, InterfaceC2148408bK interfaceC2148408bK, InterfaceC1364105Vn<? super C2148108bH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = num;
        this.LLILLL = z;
        this.LLILZ = interfaceC2148408bK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2148108bH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C635440OwA.LIZIZ(this.LL, !this.LLILLL, this.LLILLJJLI);
        this.LLILZ.onSuccess();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
