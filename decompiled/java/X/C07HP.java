package X;

import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07HP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07HP extends C09AY implements Function0<Integer> {
    public C07HP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJI;
        try {
            iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.new_user_vod_opt_disable_volume_adjust(), "new_user_vod_opt_disable_volume_adjust");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIJI = 0;
        }
        return Integer.valueOf(iLJIJI);
    }
}
