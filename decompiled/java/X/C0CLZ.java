package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CLZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLZ extends C09AY implements Function0<SpringApiLimitConfig> {
    public C0CLZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ SpringApiLimitConfig invoke() {
        try {
            return C0CLW.LIZIZ.LIZ.getSpringApiLimitConfig();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
