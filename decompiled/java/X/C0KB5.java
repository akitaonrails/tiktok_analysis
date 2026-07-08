package X;

import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.live.SubsServiceMainActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KB5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.SubsServiceMainActivityAssem$onCreate$1$1", f = "SubsServiceMainActivityAssem.kt", l = {}, m = "invokeSuspend")
public final class C0KB5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubsServiceMainActivityAssem LL;
    public final /* synthetic */ C0K77 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KB5(SubsServiceMainActivityAssem subsServiceMainActivityAssem, C0K77 c0k77, InterfaceC1364105Vn<? super C0KB5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subsServiceMainActivityAssem;
        this.LLILLJJLI = c0k77;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KB5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubsServiceMainActivityAssem@401a.onCreate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LL) {
            C0K77 c0k77 = this.LLILLJJLI;
            if (c0k77 != null) {
                c0k77.LJ();
            }
            DataChannelGlobal.LLILZ.CQ2(SubscribeSuccessEvent.class, this.LL, new C0KB6(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubsServiceMainActivityAssem@401a.onCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
