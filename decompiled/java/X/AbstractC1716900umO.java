package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.ABTestInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0umO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1716900umO implements InterfaceC1717200ums {
    public String LIZIZ;
    public Boolean LIZJ;
    public InterfaceC1717160umo LIZLLL;
    public final HashMap<String, String> LIZ = new HashMap<>();
    public final List<WeakReference<C19EG>> LJ = new ArrayList();

    @Override // X.InterfaceC1717200ums
    public void LJIIIIZZ(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
    }

    @Override // X.InterfaceC1717200ums
    public void LJIIJJI() {
    }

    @Override // X.InterfaceC1717200ums
    public final void LIZJ() {
        Iterator<WeakReference<C19EG>> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            C19EG c19eg = it2.next().get();
            if (c19eg != null) {
                c19eg.finish();
            }
        }
        ((ArrayList) this.LJ).clear();
    }

    @Override // X.InterfaceC1717200ums
    public final InterfaceC1717160umo LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1717200ums
    public final List<WeakReference<C19EG>> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1717200ums
    public final Boolean LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1717200ums
    public final String LJIIIZ() {
        return this.LIZIZ;
    }

    public AbstractC1716900umO(Map<String, ABTestInfo> map) {
        if (map != null) {
            for (Map.Entry<String, ABTestInfo> entry : map.entrySet()) {
                String key = entry.getKey();
                ABTestInfo value = entry.getValue();
                if (C1948507kB.LIZ(value.bucketId)) {
                    this.LIZ.put(key, value.bucketId);
                }
            }
        }
    }

    @Override // X.InterfaceC1717200ums
    public final void LIZIZ(Boolean bool) {
        this.LIZJ = bool;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJIIJ(InterfaceC1717160umo interfaceC1717160umo) {
        this.LIZLLL = interfaceC1717160umo;
    }
}
