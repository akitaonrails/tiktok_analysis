package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService$processInAppAlert$1", f = "MessageAlertToneService.kt", l = {118}, m = "invokeSuspend")
public final class C891220Yxk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageAlertToneService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891220Yxk(MessageAlertToneService messageAlertToneService, InterfaceC1364105Vn<? super C891220Yxk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageAlertToneService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891220Yxk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("MessageAlertToneService@8ee3.processInAppAlert$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C891050YxT c891050YxT = (C891050YxT) this.LLILLJJLI.LIZJ.getValue();
                this.LL = 1;
                obj = c891050YxT.LIZIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MessageAlertToneService@8ee3.processInAppAlert$1");
                    return objLJFF;
                }
            }
            List list = (List) obj;
            if (list != null && (str = (String) C13LP.LJJJLL(list)) != null) {
                MessageAlertToneService messageAlertToneService = this.LLILLJJLI;
                C20101413ky c20101413ky = (C20101413ky) messageAlertToneService.LIZIZ.getValue();
                EnumC891100YxY enumC891100YxY = EnumC891100YxY.IN_APP_TONE;
                String alertId = enumC891100YxY.getAlertId();
                Keva keva = (Keva) c20101413ky.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url_");
                sbLIZ.append(alertId);
                keva.storeString(C2188811AlT.LIZIZ(sbLIZ), str);
                ((C20101413ky) messageAlertToneService.LIZIZ.getValue()).LIZ(0L, str, enumC891100YxY.getAlertId(), false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downloadInAppMessageNotificationToneIfNeeded() called: error = ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageAlertToneService@8ee3.processInAppAlert$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
