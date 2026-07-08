package X;

import com.lynx.tasm.LynxViewClient;
import java.util.Map;

/* JADX INFO: renamed from: X.0g4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151550g4X extends LynxViewClient {
    public final int $t;

    public static final void onTimingSetup$0(C1151550g4X c1151550g4X, Map map) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        if (1 - this.$t != 0) {
            super.LJJIFFI();
        } else {
            C20441214yg.LIZIZ("HammerSparkViewManager", "Lynx onRuntimeReady");
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        if (this.$t != 0) {
            super.onTimingSetup(map);
        } else {
            onTimingSetup$0(this, map);
        }
    }

    public C1151550g4X(int i) {
        this.$t = i;
    }
}
