package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSendMsgUxAnalytics$report$1", f = "IMSendMsgUxAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C903790Zcv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C903830Zcz LL;
    public final /* synthetic */ EnumC903800Zcw LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C903780Zcu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903790Zcv(C903830Zcz c903830Zcz, EnumC903800Zcw enumC903800Zcw, long j, C903780Zcu c903780Zcu, InterfaceC1364105Vn<? super C903790Zcv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c903830Zcz;
        this.LLILLJJLI = enumC903800Zcw;
        this.LLILLL = j;
        this.LLILZ = c903780Zcu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C903790Zcv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("IMSendMsgUxAnalytics@2e9c.report$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("ux_type", String.valueOf(this.LL.LJFF.getValue()));
        c830490Whz.put("result", String.valueOf(this.LLILLJJLI.getValue()));
        c830490Whz.put("msg_id", this.LL.LIZLLL);
        c830490Whz.put("msg_type", String.valueOf(this.LL.LIZJ));
        c830490Whz.put("duration", String.valueOf(this.LLILLL - this.LL.LIZIZ));
        C903830Zcz c903830Zcz = this.LL;
        c830490Whz.put("send_to_notify", String.valueOf(c903830Zcz.LJ - c903830Zcz.LIZIZ));
        c830490Whz.put("notify_to_ui", String.valueOf(this.LLILLL - this.LL.LJ));
        if (this.LLILZ.LIZJ.invoke().booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_ws_connected", str);
        c830490Whz.put("network_level", String.valueOf(this.LLILZ.LIZLLL.invoke().intValue()));
        c830490Whz.put("cpu_usage", String.valueOf(this.LLILZ.LJ.invoke().doubleValue()));
        this.LLILZ.LIZ.sendEvent("im_ux_send_msg", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSendMsgUxAnalytics@2e9c.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
