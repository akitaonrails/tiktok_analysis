package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13R1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R1 extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final ConcurrentHashMap<String, String> LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        String strConvertObjToJson;
        InterfaceC20004513Ox interfaceC20004513Ox;
        HashMap map = new HashMap();
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZJ;
        if (concurrentHashMap != null) {
            map.putAll(concurrentHashMap);
        }
        try {
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(map)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                interfaceC20004513Ox.LJIIJ("updatetime", strConvertObjToJson, "");
            }
            runOnMainThread(new AwS574S0100000_30(this, 435));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(e), 104));
            C13SS c13ss = C13SS.LIZ;
            String strValueOf = String.valueOf(e);
            c13ss.getClass();
            C13SS.LIZIZ("WriteUpdateTagTask", strValueOf, null);
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 430));
    }

    public C13R1(C13RD c13rd, String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        super(str, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = concurrentHashMap;
    }
}
