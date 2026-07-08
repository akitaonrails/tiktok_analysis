package X;

import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07JF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07JF extends C09AY implements Function0<Integer> {
    public C07JF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJI;
        try {
            iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.new_user_vod_opt_delay_init_exp(), "new_user_vod_opt_delay_init_exp");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIJI = 0;
        }
        return Integer.valueOf(iLJIJI);
    }
}
