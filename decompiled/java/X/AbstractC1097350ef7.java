package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;

/* JADX INFO: renamed from: X.0ef7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1097350ef7 implements InterfaceC1097470efJ {
    @Override // X.InterfaceC1097470efJ
    public void LIZIZ(PreloadStrategyConfig preloadStrategyConfig) {
    }

    @Override // X.InterfaceC1097470efJ
    public final void LJ() {
    }

    @Override // X.InterfaceC1097470efJ
    public final void LJI(String str, long j) {
    }

    @Override // X.InterfaceC1097470efJ
    public boolean LJFF(PreloadStrategyConfig preloadStrategyConfig) {
        String str = preloadStrategyConfig.preCheckKey;
        if (!LIZLLL().isEmpty() && LIZLLL().containsKey(str)) {
            Boolean bool = LIZLLL().get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }
}
