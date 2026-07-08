package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem;
import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0huA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem$doExecute$1$1$1$1$onResult$1", f = "WalletCommonStepAssem.kt", l = {}, m = "invokeSuspend")
public final class C1222000huA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WalletCommonStepAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222000huA(WalletCommonStepAssem walletCommonStepAssem, InterfaceC1364105Vn<? super C1222000huA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = walletCommonStepAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1222000huA(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1$1$onResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = WalletCommonStepFragment._pnsPageId;
        InterfaceC1221990hu9 interfaceC1221990hu9 = WalletCommonStepFragment.LLJ.get(this.LL.Ho().LL);
        if (interfaceC1221990hu9 != null) {
            interfaceC1221990hu9.onSuccess();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "EV_SUCCESS");
        jSONObject.put("update_setting", true);
        jSONObject.put("show_toast", true);
        new C1548870qPN().LJ("PA_SDK_EVENTS", C786410Ut5.J3(jSONObject));
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1$1$onResult$1");
        return unit;
    }
}
