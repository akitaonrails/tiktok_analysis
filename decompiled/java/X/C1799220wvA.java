package X;

import Y.ARunnableS96S0200000_27;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799220wvA {
    public final InterfaceC1799230wvB LIZ;
    public final Handler LIZIZ;
    public final Object LIZJ;
    public final Map<C1898107c3, C1781330wSJ> LIZLLL;
    public final Map<C1898107c3, List<InterfaceC1799250wvD>> LJ;

    public C1799220wvA() {
        InterfaceC1799230wvB interfaceC1799230wvB;
        C1499850p8J c1499850p8JCreateBuilder;
        InterfaceC1799230wvB.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null) {
            interfaceC1799230wvB = null;
        } else {
            c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
            interfaceC1799230wvB = (InterfaceC1799230wvB) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1799230wvB.class);
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = interfaceC1799230wvB;
        this.LIZIZ = bPEAHandler;
        this.LIZJ = new Object();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
    }

    public static String LIZJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public final void LIZ(C1898107c3 c1898107c3, C1781330wSJ c1781330wSJ) {
        List<InterfaceC1799250wvD> listRemove;
        synchronized (this.LIZJ) {
            if (c1781330wSJ != null) {
                try {
                    this.LIZLLL.put(c1898107c3, c1781330wSJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            listRemove = this.LJ.remove(c1898107c3);
            if (listRemove == null) {
                listRemove = C13BV.INSTANCE;
            }
        }
        Iterator<InterfaceC1799250wvD> it2 = listRemove.iterator();
        while (it2.hasNext()) {
            LIZIZ(it2.next(), c1781330wSJ);
        }
    }

    public final void LIZIZ(InterfaceC1799250wvD interfaceC1799250wvD, C1781330wSJ c1781330wSJ) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC1799250wvD.LIZ(c1781330wSJ);
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS96S0200000_27(interfaceC1799250wvD, c1781330wSJ, 28));
        }
    }
}
