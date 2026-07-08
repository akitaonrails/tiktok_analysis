package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.personalization.TakoPersonalSignalConfigData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20235914Fx extends C09AY implements Function0<TakoPersonalSignalConfigData> {
    public C20235914Fx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TakoPersonalSignalConfigData invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            TakoPersonalSignalConfigData takoPersonalSignalConfigData = C20235814Fw.LIZ;
            TakoPersonalSignalConfigData takoPersonalSignalConfigData2 = (TakoPersonalSignalConfigData) c0c64LJIILLIIL.LJJII(TakoPersonalSignalConfigData.class, takoPersonalSignalConfigData, "tako_personal_signal_config", true);
            return takoPersonalSignalConfigData2 != null ? takoPersonalSignalConfigData2 : takoPersonalSignalConfigData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C20235814Fw.LIZ;
        }
    }
}
