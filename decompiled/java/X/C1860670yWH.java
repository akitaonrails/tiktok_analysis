package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotSetting$fetchBotSetting$2", f = "TakoBotSetting.kt", l = {38}, m = "invokeSuspend")
public final class C1860670yWH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860670yWH(boolean z, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C1860670yWH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = function0;
        this.LLILZ = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860670yWH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotSetting@84d0.fetchBotSetting$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI || C1860520yW2.LIZ.LJIIIIZZ().botInfos.isEmpty()) {
                Function0<Unit> function0 = this.LLILLL;
                if (function0 != null) {
                    function0.invoke();
                }
                C1863980ybc c1863980ybc = C1863980ybc.LIZ;
                boolean zLIZ = C298860BnY.LIZ();
                this.LL = 1;
                obj = c1863980ybc.LJFF(zLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoBotSetting@84d0.fetchBotSetting$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoBotSetting@84d0.fetchBotSetting$2");
            return unit;
        }
        if (!(!((TakoBotSettingResponse) obj).botInfos.isEmpty())) {
            obj = null;
        }
        TakoBotSettingResponse takoBotSettingResponse = (TakoBotSettingResponse) obj;
        if (takoBotSettingResponse != null) {
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_bot_setting_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoBotSettingResponse));
            boolean z = takoBotSettingResponse.botDisclaimerIsAccepted;
            if (z) {
                C1860520yW2.LJJIIZI(z);
            }
            C1860660yWG.LIZ(takoBotSettingResponse);
        } else {
            C1860660yWG.LIZ(C1860520yW2.LIZ.LJIIIIZZ());
        }
        Function0<Unit> function02 = this.LLILZ;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotSetting@84d0.fetchBotSetting$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
