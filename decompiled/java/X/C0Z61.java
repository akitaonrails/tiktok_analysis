package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z61, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics$onSendMessage$1", f = "IMNewMessageAnalytics.kt", l = {155, 164}, m = "invokeSuspend")
public final class C0Z61 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1493105sv LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ InterfaceC1493105sv LLILZIL;
    public final /* synthetic */ C0YC9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z61(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv, C0YC9 c0yc9, InterfaceC1364105Vn<? super C0Z61> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c869590Y9l;
        this.LLILZIL = interfaceC1493105sv;
        this.LLILZLL = c0yc9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z61(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1493105sv interfaceC1493105sv;
        String str;
        InterfaceC1493105sv interfaceC1493105sv2;
        String str2;
        C1C7U.LIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str2 = (String) this.LLILLJJLI;
                    interfaceC1493105sv2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    interfaceC1493105sv2.sendEvent(str2, (Map) obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = (String) this.LLILLJJLI;
                interfaceC1493105sv = this.LL;
                C155000ia.LIZIZ(obj);
                interfaceC1493105sv.sendEvent(str, (Map) obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            int msgStatus = this.LLILZ.getMsgStatus();
            if (msgStatus != 1) {
                if (msgStatus != 2) {
                    if (msgStatus == 3) {
                        C869590Y9l c869590Y9l = this.LLILZ;
                        c869590Y9l.addLocalExt("r:retry_local_ext_map", C051M.LJ(C901060ZWm.LIZ(c869590Y9l), false));
                    }
                } else {
                    if (C901060ZWm.LIZ(this.LLILZ).containsKey("intercept_report_send_message")) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
                        return unit;
                    }
                    interfaceC1493105sv2 = this.LLILZIL;
                    IMNewMessageAnalytics iMNewMessageAnalytics = IMNewMessageAnalytics.LIZIZ;
                    C869590Y9l c869590Y9l2 = this.LLILZ;
                    C0YC9 c0yc9 = this.LLILZLL;
                    this.LL = interfaceC1493105sv2;
                    str2 = "send_message_response";
                    this.LLILLJJLI = "send_message_response";
                    this.LLILLL = 2;
                    obj = iMNewMessageAnalytics.LIZLLL(c869590Y9l2, new C891480YyA(), c0yc9, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
                        return objLJFF;
                    }
                    interfaceC1493105sv2.sendEvent(str2, (Map) obj);
                }
            } else {
                if (C901060ZWm.LIZ(this.LLILZ).containsKey("intercept_report_send_message")) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
                    return unit2;
                }
                interfaceC1493105sv = this.LLILZIL;
                IMNewMessageAnalytics iMNewMessageAnalytics2 = IMNewMessageAnalytics.LIZIZ;
                C869590Y9l c869590Y9l3 = this.LLILZ;
                this.LL = interfaceC1493105sv;
                str = "send_message";
                this.LLILLJJLI = "send_message";
                this.LLILLL = 1;
                obj = iMNewMessageAnalytics2.LIZLLL(c869590Y9l3, new C891480YyA(), null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
                    return objLJFF;
                }
                interfaceC1493105sv.sendEvent(str, (Map) obj);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.onSendMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
