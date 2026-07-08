package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13R0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R0 extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        String strLJFF;
        HashMap map;
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        if (interfaceC20004513Ox == null || (strLJFF = interfaceC20004513Ox.LJFF("updatetime")) == null) {
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10009), 81));
            return;
        }
        try {
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 == null || (map = (HashMap) c13r7.LIZ.convertJsonToObj(strLJFF, HashMap.class)) == null) {
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(new IllegalStateException("local file destroy")), 81));
            } else {
                runOnMainThread(new AwS431S0200000_30(this, (C13R0) map, (HashMap<String, String>) 85));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(e), 81));
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 415));
    }

    public C13R0(C13RD c13rd, String str) {
        super(str, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
    }
}
