package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.DigitalWellbeingManagerV2$updateDigitalWellbeingData$1", f = "DigitalWellbeingManagerV2.kt", l = {297}, m = "invokeSuspend")
public final class C20536215Xk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C20536215Xk(InterfaceC1364105Vn<? super C20536215Xk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20536215Xk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DigitalWellbeingManagerV2@ac05.updateDigitalWellbeingData$1");
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
            C20536115Xj.LIZ.getClass();
            SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
            DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
            DoNotDisturbSettings doNotDisturbSettingsLIZ = C20536115Xj.LIZ();
            int i2 = C20536115Xj.LIZIZ.getInt(C20536115Xj.LJI("screen_time_management_repeat_type"), 0);
            List listLIZJ = C20536115Xj.LIZJ();
            DigitalWellbeingBean digitalWellbeingBean = new DigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, sleepHourConfigSettingsLIZLLL, doNotDisturbSettingsLIZ, doNotDisturbSettingsLJFF, C2286608xc.LJ(i2), listLIZJ, new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            C1702780uPc c1702780uPc = new C1702780uPc(digitalWellbeingBean, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c1702780uPc) == objLJFF) {
                C1C7U.LIZIZ("DigitalWellbeingManagerV2@ac05.updateDigitalWellbeingData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DigitalWellbeingManagerV2@ac05.updateDigitalWellbeingData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C20536215Xk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
