package X;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0pWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515150pWz {
    public static final C1515150pWz LIZ = new C1515150pWz();

    public static Retrofit LIZ(C1515200pX4 c1515200pX4) throws Throwable {
        if (C0X15.LIZ().enable) {
            try {
                InterfaceC1494860p0G interfaceC1494860p0G = (InterfaceC1494860p0G) Reflect.on(c1515200pX4).field("clientProvider", new Class[0]).get();
                InterfaceC1493760oyU interfaceC1493760oyU = interfaceC1494860p0G.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(interfaceC1494860p0G.getClass().getName()) || (interfaceC1493760oyU instanceof C1493780oyW)) {
                    return C2204961BRm.LLLLIIIILLL(c1515200pX4, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAKkuOQetSW7v0VI29a71N4kVmorNB9e9ngIaENxzBde", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Retrofit retrofitLLLLIIIILLL = C2204961BRm.LLLLIIIILLL(c1515200pX4, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAKkuOQetSW7v0VI29a71N4kVmorNB9e9ngIaENxzBde", null));
        List<InterfaceC1904907d9> list = retrofitLLLLIIIILLL.LJIIIIZZ;
        if (list != null) {
            list.add(new TTNetMonitorInterceptor());
            ListProtector.set(retrofitLLLLIIIILLL.LJIIIIZZ, 0, new BeforeHandleRequestInterceptor((InterfaceC1904907d9) ListProtector.get(retrofitLLLLIIIILLL.LJIIIIZZ, 0)));
            retrofitLLLLIIIILLL.LJIIIIZZ.add(new LastRequestInterceptor());
        }
        return retrofitLLLLIIIILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0pXG] */
    public final synchronized Retrofit LIZLLL(String str) {
        return LIZIZ(str, new InterfaceC1494860p0G() { // from class: X.0pXG
            @Override // X.InterfaceC1494860p0G
            public final InterfaceC1493760oyU get() {
                return new C1493530oy7();
            }
        });
    }

    public final synchronized Retrofit LJ(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        return LIZLLL(str);
    }

    public final synchronized Retrofit LIZIZ(String str, C1515320pXG c1515320pXG) {
        return LIZJ(null, null, c1515320pXG, str);
    }

    public final synchronized Retrofit LIZJ(List list, List list2, C1515320pXG c1515320pXG, String str) {
        ArrayList arrayList;
        Retrofit retrofitLIZ;
        C1515200pX4 c1515200pX4 = new C1515200pX4();
        c1515200pX4.LIZLLL(str);
        c1515200pX4.LIZIZ = c1515320pXG;
        c1515200pX4.LJI = new ExecutorC1490620otQ();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C2336109Dj.LJI());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c1515200pX4.LIZIZ((AbstractC2343909Gj) it2.next());
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                c1515200pX4.LIZ((C09S8) it3.next());
            }
        }
        retrofitLIZ = LIZ(c1515200pX4);
        retrofitLIZ.LJIIIIZZ.clear();
        return retrofitLIZ;
    }
}
