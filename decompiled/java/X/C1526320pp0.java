package X;

import com.bytedance.sync.SyncSDK;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526320pp0 implements InterfaceC1526470ppF {
    public final InterfaceC1526470ppF LL;

    @Override // X.InterfaceC1526470ppF
    public final Map<String, String> getCommonParams() {
        Map<String, String> map;
        InterfaceC1526470ppF interfaceC1526470ppF = this.LL;
        if (interfaceC1526470ppF == null || (map = interfaceC1526470ppF.getCommonParams()) == null) {
            map = new HashMap<>();
        }
        map.put("bytesync_sdk_version", String.valueOf(-1));
        Collection<C1525690pnz> registeredBusinesses = SyncSDK.getRegisteredBusinesses();
        if (registeredBusinesses != null && !registeredBusinesses.isEmpty()) {
            for (C1525690pnz c1525690pnz : registeredBusinesses) {
                if (c1525690pnz != null) {
                    c1525690pnz.LIZ.getClass();
                }
            }
        }
        return map;
    }

    public C1526320pp0(InterfaceC1526470ppF interfaceC1526470ppF) {
        this.LL = interfaceC1526470ppF;
    }
}
