package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MRDefaultOpenPushPermissionHandler$showIntroPanel$introPanel$3$1", f = "MRDefaultOpenPushPermissionHandler.kt", l = {}, m = "invokeSuspend")
public final class C0NRN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C610200NwY LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NRN(C610200NwY c610200NwY, Context context, InterfaceC1364105Vn<? super C0NRN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c610200NwY;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NRN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        C1C7U.LIZ("MRDefaultOpenPushPermissionHandler@1036.showIntroPanel$introPanel$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            BatchUpdatePushSwitchesResp batchUpdatePushSwitchesRespLIZ = C612100Nzc.LIZ(C19296410eQ.LIZIZ, "in_app_im_msg_req_push,0,im_msg_req_push,0", false, 4);
            C610200NwY c610200NwY = this.LL;
            Map<String, Integer> map = batchUpdatePushSwitchesRespLIZ.updatedSwitches;
            c610200NwY.getClass();
            if (map != null && (num = map.get("in_app_im_msg_req_push")) != null && num.intValue() == 0 && (num2 = map.get("im_msg_req_push")) != null && num2.intValue() == 0) {
                C610200NwY c610200NwY2 = this.LL;
                Context context = this.LLILLJJLI;
                c610200NwY2.getClass();
                C0CNO.LIZLLL(0L, new C494601wG(context, true));
            } else {
                C610200NwY c610200NwY3 = this.LL;
                Context context2 = this.LLILLJJLI;
                c610200NwY3.getClass();
                C0CNO.LIZLLL(0L, new C494601wG(context2, false));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C610200NwY c610200NwY4 = this.LL;
            Context context3 = this.LLILLJJLI;
            c610200NwY4.getClass();
            C0CNO.LIZLLL(0L, new C494601wG(context3, false));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "turn_off");
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_message_request_push_default_open_popup_click", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MRDefaultOpenPushPermissionHandler@1036.showIntroPanel$introPanel$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
