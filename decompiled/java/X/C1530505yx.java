package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMChatListAnalytics$logMessagingToolPanelShow$1", f = "IMChatListAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1530505yx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530505yx(List<String> list, InterfaceC1364105Vn<? super C1530505yx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1530505yx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("IMChatListAnalytics@cbf8.logMessagingToolPanelShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_types", C13LP.LJJLIIIJ(this.LL, ",", null, null, 0, null, null, 62));
        C0Z7V c0z7vLJIILJJIL = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL();
        if (c0z7vLJIILJJIL == null || (strLIZIZ = c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ())) == null) {
            strLIZIZ = "";
        }
        linkedHashMap.put("account_type", strLIZIZ);
        C885310YoD.LIZ.getClass();
        C885310YoD.LJIJJ().sendEvent("inbox_messaging_tools_popup_show", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListAnalytics@cbf8.logMessagingToolPanelShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
