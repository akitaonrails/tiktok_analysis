package X;

import com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyInteractionFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy.CheckupPrivacyInteractionFragment$onCreate$1", f = "CheckupPrivacyInteractionFragment.kt", l = {65}, m = "invokeSuspend")
public final class C1408000mkA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1408000mkA(InterfaceC1364105Vn<? super C1408000mkA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408000mkA(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C1C7U.LIZ("CheckupPrivacyInteractionFragment@ef53.onCreate$1");
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
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null) {
                this.LL = 1;
                obj = iPrivacySettingsDepService.LJJIJL("dm_setting_potential_connection", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CheckupPrivacyInteractionFragment@ef53.onCreate$1");
                    return objLJFF;
                }
            } else {
                bool = null;
                CheckupPrivacyInteractionFragment.LLIZ = bool;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CheckupPrivacyInteractionFragment@ef53.onCreate$1");
                return unit;
            }
        }
        bool = (Boolean) obj;
        CheckupPrivacyInteractionFragment.LLIZ = bool;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CheckupPrivacyInteractionFragment@ef53.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1408000mkA(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
