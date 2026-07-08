package X;

import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.073b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17997073b extends C09AY implements Function0<Integer> {
    public C17997073b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJI;
        try {
            iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.new_user_vod_opt_harden_exp(), "new_user_vod_opt_harden_exp");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIJI = 0;
        }
        return Integer.valueOf(iLJIJI);
    }
}
