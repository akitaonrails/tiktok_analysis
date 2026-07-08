package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0D2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility$quitImmersiveState$1", f = "ITakoAIBotUIAbility.kt", l = {}, m = "invokeSuspend")
public final class C332580D2a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoAIBotUIAbility LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332580D2a(TakoAIBotUIAbility takoAIBotUIAbility, InterfaceC1364105Vn<? super C332580D2a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoAIBotUIAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332580D2a(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TakoAIBotUIAbility@f0fb.quitImmersiveState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoEnterParams takoEnterParams = this.LL.LL;
        if (takoEnterParams != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = takoEnterParams.processId;
            String str2 = takoEnterParams.enterFrom;
            String str3 = takoEnterParams.enterMethod;
            String subProcessId = takoEnterParams.getSubProcessId();
            String subEnterMethod = takoEnterParams.getSubEnterMethod();
            if (subEnterMethod == null) {
                subEnterMethod = "";
            }
            String strValueOf = String.valueOf(takoEnterParams.botInfo.botId);
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", str);
            jSONObject.put("enter_from", str2);
            jSONObject.put("enter_method", str3);
            jSONObject.put("sub_process_id", subProcessId);
            jSONObject.put("sub_enter_method", subEnterMethod);
            jSONObject.put("bot_id", strValueOf);
            c20235014FoLIZ.LIZIZ("tikbot_screen_transition", jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIBotUIAbility@f0fb.quitImmersiveState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
