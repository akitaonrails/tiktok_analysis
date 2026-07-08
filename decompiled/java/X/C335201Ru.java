package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.message.ECLiveMessageCenter$onReceive$2", f = "ECLiveMessageCenter.kt", l = {}, m = "invokeSuspend")
public final class C335201Ru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMessage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335201Ru(IMessage iMessage, InterfaceC1364105Vn<? super C335201Ru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335201Ru(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLiveMessageCenter@8057.onReceive$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMessage iMessage = this.LL;
        try {
            JSONObject jSONObject = new JSONObject(C1741890vQh.LJIIIIZZ(iMessage));
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message_type", iMessage.getMethodName());
            jSONObject2.put("data", jSONObject);
            iEventCenter.LIZ("ec_content_message_event", C786410Ut5.J3(jSONObject2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveMessageCenter@8057.onReceive$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
