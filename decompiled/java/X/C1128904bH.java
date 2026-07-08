package X;

import com.bytedance.android.starship.strategy.CppAllowMapConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1128904bH extends C09AY implements Function0<CppAllowMapConfig> {
    public C1128904bH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CppAllowMapConfig invoke() {
        try {
            return (CppAllowMapConfig) C0C64.LJIILLIIL().LJJIIJ(true, "starship_cpp_allow_map", 31744, CppAllowMapConfig.class, C1128804bG.LIZ, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1128804bG.LIZ;
        }
    }
}
