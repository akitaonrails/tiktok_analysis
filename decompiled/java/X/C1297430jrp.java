package X;

import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleWrapper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297430jrp implements InterfaceC1297440jrq {
    public final ConcurrentHashMap<String, LynxModuleWrapper> LIZ = new ConcurrentHashMap<>();
    public volatile InterfaceC1297320jre LIZIZ;

    @Override // X.InterfaceC1297440jrq
    public final void destroy() {
        Iterator<LynxModuleWrapper> it2 = this.LIZ.values().iterator();
        while (it2.hasNext()) {
            LynxModule lynxModule = it2.next().LIZ;
            if (lynxModule != null) {
                lynxModule.destroy();
            }
        }
        this.LIZ.clear();
    }

    @Override // X.InterfaceC1297440jrq
    public final InterfaceC1297320jre LIZ() {
        return this.LIZIZ;
    }

    public C1297430jrp(InterfaceC1297320jre interfaceC1297320jre) {
        this.LIZIZ = interfaceC1297320jre;
    }

    @Override // X.InterfaceC1297440jrq
    public final void LIZIZ(C1297480jru c1297480jru) {
        this.LIZIZ = c1297480jru;
        Iterator<LynxModuleWrapper> it2 = this.LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJ = c1297480jru;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    @Override // X.InterfaceC1297440jrq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.jsbridge.LynxModuleWrapper LIZJ(java.lang.String r15, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.C1297450jrr> r16) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297430jrp.LIZJ(java.lang.String, java.util.concurrent.ConcurrentHashMap):com.lynx.jsbridge.LynxModuleWrapper");
    }
}
