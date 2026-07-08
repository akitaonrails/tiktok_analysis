package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0NBW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBW {
    public final Map<String, List<WeakReference<InterfaceC583260MuC>>> LIZ = new HashMap();
    public final ExecutorService LIZIZ = C807400Vlq.LIZLLL(new ThreadFactory() { // from class: X.0NBV
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new BPEAThread(runnable, "TTDataCenter");
        }
    });

    public static C0NBW LIZIZ() {
        C0NBW c0nbw = C0NBX.LIZ;
        boolean z = C589720NBa.LIZ;
        synchronized (C0NBY.class) {
            try {
                if (C0NBY.LIZ) {
                    return c0nbw;
                }
                C0NBY.LIZ = true;
                C0NBZ c0nbz = (C0NBZ) Class.forName("com.ttkmedia.amjet.ttdatacenter.TTDataCenterBridge").newInstance();
                C0NBY.LIZIZ = c0nbz;
                c0nbz.LIZIZ(z);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return c0nbw;
        }
    }

    public static void LIZJ() {
        synchronized (C0NBY.class) {
            C0NBZ c0nbz = C0NBY.LIZIZ;
            if (c0nbz != null) {
                c0nbz.LIZ();
            }
        }
    }

    public final void LIZLLL(final InterfaceC583260MuC interfaceC583260MuC) {
        if (interfaceC583260MuC == null) {
            return;
        }
        this.LIZIZ.execute(new Runnable() { // from class: X.0MuB
            public final void LIZ() {
                List<String> listLIZ;
                C0NBW c0nbw = this.LLILLJJLI;
                InterfaceC583260MuC interfaceC583260MuC2 = interfaceC583260MuC;
                c0nbw.getClass();
                if (interfaceC583260MuC2 == null || (listLIZ = interfaceC583260MuC2.LIZ()) == null || listLIZ.size() <= 0) {
                    return;
                }
                for (String str : listLIZ) {
                    List arrayList = (List) ((HashMap) c0nbw.LIZ).get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((Reference) it2.next()).get() == interfaceC583260MuC2) {
                                break;
                            }
                        } else {
                            arrayList.add(new WeakReference(interfaceC583260MuC2));
                            break;
                        }
                    }
                    ((HashMap) c0nbw.LIZ).put(str, arrayList);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTDataCenter@404.registerReceiver$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTDataCenter@404.registerReceiver$1");
            }
        });
    }

    public final void LIZ(final Object obj, final String str) {
        this.LIZIZ.execute(new Runnable() { // from class: X.0MuD
            public final void LIZ() {
                C0NBW c0nbw = this.LLILLL;
                String str2 = str;
                Object obj2 = obj;
                List list = (List) ((HashMap) c0nbw.LIZ).get(str2);
                if (list == null || list.size() <= 0) {
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC583260MuC interfaceC583260MuC = (InterfaceC583260MuC) ((Reference) it2.next()).get();
                    if (interfaceC583260MuC != null) {
                        interfaceC583260MuC.LIZIZ(obj2, str2);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTDataCenter@404.broadcast$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTDataCenter@404.broadcast$1");
            }
        });
    }
}
