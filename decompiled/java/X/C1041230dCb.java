package X;

import android.webkit.WebResourceResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0dCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041230dCb implements InterfaceC1041260dCe {
    public static volatile C1041230dCb LIZIZ;
    public final Set<InterfaceC1041260dCe> LIZ = new LinkedHashSet();

    public static C1041230dCb LIZLLL() {
        if (LIZIZ == null) {
            synchronized (C1041230dCb.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1041230dCb();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZJ() {
        if (C086I.LIZIZ(this.LIZ)) {
            return;
        }
        Iterator<InterfaceC1041260dCe> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1041260dCe next = it2.next();
            if ((next instanceof AbstractC1043470dGD) && ((AbstractC1043470dGD) next).LIZ) {
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC1041260dCe
    public final WebResourceResponse LIZ(String str) {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            try {
                hashSet.addAll(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        WebResourceResponse webResourceResponseLIZ = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext() && (webResourceResponseLIZ = ((InterfaceC1041260dCe) it2.next()).LIZ(str)) == null) {
        }
        return webResourceResponseLIZ;
    }

    public final void LIZIZ(AbstractC1043470dGD abstractC1043470dGD) {
        synchronized (this) {
            try {
                this.LIZ.add(abstractC1043470dGD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
