package X;

import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B5R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B5R extends C1B5H {
    public final /* synthetic */ C1B5S LLILLJJLI;

    public C1B5R(C1B5S c1b5s) {
        this.LLILLJJLI = c1b5s;
    }

    @Override // X.C1B5G
    public final void LJLLL(Map map, Map map2, Map map3) {
        SparseArray sparseArray = this.LLILLJJLI.LL;
        String str = C2199661B7c.LIZ;
        if (map != null && sparseArray != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
                }
            }
        }
        HashMap map4 = this.LLILLJJLI.LLILLJJLI;
        if (map2 != null && map4 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                if (entry2.getKey() != null) {
                    map4.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        List list = this.LLILLJJLI.LLILLL;
        if (map3 != null && list != null) {
            for (Map.Entry entry3 : map3.entrySet()) {
                if (entry3.getKey() != null) {
                    list.add(entry3.getValue());
                }
            }
        }
        ((C2199121B5a) this.LLILLJJLI.LLILZ).LIZ();
        ServiceConnectionC2199161B5e serviceConnectionC2199161B5e = this.LLILLJJLI.LLILZIL;
        synchronized (serviceConnectionC2199161B5e) {
            try {
                InterfaceC2199171B5f interfaceC2199171B5f = serviceConnectionC2199161B5e.LL;
                if (interfaceC2199171B5f != null) {
                    try {
                        interfaceC2199171B5f.d1(null);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    serviceConnectionC2199161B5e.LLILLL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
