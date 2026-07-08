package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.request_combine.request.CombineComplianceOptRequest$doSuccessHeavyTask$1", f = "CombineComplianceRequest.kt", l = {}, m = "invokeSuspend")
public final class C0CRC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SettingCombineModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRC(SettingCombineModel settingCombineModel, InterfaceC1364105Vn<? super C0CRC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = settingCombineModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SettingCombineDataModel data;
        ComplianceSettingCombineModel complianceSettingCombineModel;
        ComplianceSetting complianceSetting;
        C1C7U.LIZ("CombineComplianceOptRequest@f748.doSuccessHeavyTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SettingCombineModel settingCombineModel = this.LL;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (complianceSettingCombineModel = data.complianceSetting) != null && (complianceSetting = complianceSettingCombineModel.getComplianceSetting()) != null) {
            ComplianceServiceProvider.LJJI().LJJIIZI(0, null, "", "", C2097908Jt.LIZJ(new Pair("scenario", "app_launch")));
            ComplianceServiceProvider.LJJI().LJIIIZ(complianceSetting);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CombineComplianceOptRequest@f748.doSuccessHeavyTask$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CombineComplianceOptRequest@f748.doSuccessHeavyTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
