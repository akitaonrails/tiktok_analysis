package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693580RIm extends C09AY implements Function0<NarrowScreenOptConfig> {
    public C693580RIm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final NarrowScreenOptConfig invoke() {
        try {
            return (NarrowScreenOptConfig) C0C64.LJIILLIIL().LJJII(NarrowScreenOptConfig.class, C693570RIl.LIZ, "narrow_screen_adaption_exp", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new NarrowScreenOptConfig(0, 100, false);
        }
    }
}
