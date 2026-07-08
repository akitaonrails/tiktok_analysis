package X;

import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem$observeGeneratingTaskState$1$1$1", f = "AITheaterSocialFakeGeneratingCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C551000LjG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AITheaterSocialFakeGeneratingUISlotAssem LL;
    public final /* synthetic */ C0MXN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551000LjG(AITheaterSocialFakeGeneratingUISlotAssem aITheaterSocialFakeGeneratingUISlotAssem, C0MXN c0mxn, InterfaceC1364105Vn<? super C551000LjG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aITheaterSocialFakeGeneratingUISlotAssem;
        this.LLILLJJLI = c0mxn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551000LjG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterSocialFakeGeneratingUISlotAssem@7d94.observeGeneratingTaskState$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Bp(C0MXF.EXPIRED, this.LLILLJJLI, null, -1L);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialFakeGeneratingUISlotAssem@7d94.observeGeneratingTaskState$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
