package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303680BvK extends C09AY implements Function0<Integer> {
    public C303680BvK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Integer invoke() {
        Integer num;
        try {
            SettingsManager.LIZLLL().getClass();
            num = (Integer) SettingsManager.LJII("danmaku_input_max_num", int.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setting error: ");
            sbLIZ.append(th);
            C2344809Gs.LIZLLL(6, "EditPostAction", C2188811AlT.LIZIZ(sbLIZ));
        }
        int iIntValue = num != null ? num.intValue() : 30;
        return Integer.valueOf(iIntValue);
    }
}
