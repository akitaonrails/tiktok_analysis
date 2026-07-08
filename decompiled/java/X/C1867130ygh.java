package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.HybridShortStartConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867130ygh extends C09AY implements Function0<Boolean> {
    public C1867130ygh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            HybridShortStartConfigModel hybridShortStartConfigModel = C1867150ygj.LIZ;
            HybridShortStartConfigModel hybridShortStartConfigModel2 = (HybridShortStartConfigModel) c0c64LJIILLIIL.LJJIIJ(true, "hybrid_short_start", 31744, HybridShortStartConfigModel.class, hybridShortStartConfigModel, 2);
            z = hybridShortStartConfigModel2 != null ? hybridShortStartConfigModel2.optBullet : hybridShortStartConfigModel.optBullet;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = C1867150ygj.LIZ.optBullet;
        }
        return Boolean.valueOf(z);
    }
}
