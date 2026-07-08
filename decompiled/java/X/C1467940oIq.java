package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467940oIq implements AVMDLNewFetcherMakerInterface {
    public static C1467940oIq LIZ;
    public static final List<WeakReference<InterfaceC1468880oKM>> LIZIZ = new ArrayList();

    public static C1467940oIq LIZ() {
        if (LIZ == null) {
            synchronized (C1467940oIq.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1467940oIq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static synchronized void LIZIZ(InterfaceC1468880oKM interfaceC1468880oKM) {
        if (interfaceC1468880oKM == null) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("FetcherMakerNew", "removeListener fetcherListener is null");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeListener ");
        sbLIZ.append(interfaceC1468880oKM);
        C1471660oOq.LIZJ("FetcherMakerNew", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            if (weakReference != null && weakReference.get() != null) {
                if (((InterfaceC1468880oKM) weakReference.get()) == interfaceC1468880oKM) {
                    it2.remove();
                }
            } else {
                it2.remove();
            }
        }
    }

    public static synchronized void LIZJ(InterfaceC1468880oKM interfaceC1468880oKM) {
        if (interfaceC1468880oKM == null) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("FetcherMakerNew", "storeListener fetcherListener is null");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeListener ");
        sbLIZ.append(interfaceC1468880oKM);
        C1471660oOq.LIZJ("FetcherMakerNew", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) LIZIZ).add(new WeakReference(interfaceC1468880oKM));
    }

    @Override // com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFetcher rawKey ");
        sbLIZ.append(str);
        sbLIZ.append(", fileKey ");
        sbLIZ.append(str2);
        sbLIZ.append(", engineId ");
        sbLIZ.append(str4);
        C1471660oOq.LIZJ("FetcherMakerNew", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (C1467940oIq.class) {
            Iterator it2 = ((ArrayList) LIZIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC1468880oKM interfaceC1468880oKM = (InterfaceC1468880oKM) ((WeakReference) it2.next()).get();
                if (interfaceC1468880oKM != null && TextUtils.equals(str4, interfaceC1468880oKM.getId())) {
                    C1468850oKJ c1468850oKJ = new C1468850oKJ(interfaceC1468880oKM);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("return fetcher to mdl ");
                    sbLIZ2.append(c1468850oKJ);
                    C1471660oOq.LIZJ("FetcherMakerNew", C2188811AlT.LIZIZ(sbLIZ2));
                    return c1468850oKJ;
                }
            }
            int i3 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("FetcherMakerNew", "getFetcher MDLFetcherListener is null");
            return null;
        }
    }
}
