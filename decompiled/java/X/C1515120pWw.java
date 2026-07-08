package X;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0pWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515120pWw {
    public static volatile CopyOnWriteArrayList<InterfaceC1904907d9> LIZ = new CopyOnWriteArrayList<>();
    public static final C08I7<String, Retrofit> LIZIZ;
    public static final C08I7<String, Retrofit> LIZJ;

    public static synchronized void LIZIZ(InterfaceC1904907d9 interfaceC1904907d9) {
        LIZJ(interfaceC1904907d9);
    }

    static {
        Retrofit.LJIIIZ = LIZ;
        LIZIZ = new C08I7<>(10);
        LIZJ = new C08I7<>(10);
    }

    public static Retrofit LIZ(C1515200pX4 c1515200pX4) throws Throwable {
        if (C0X15.LIZ().enable) {
            try {
                InterfaceC1494860p0G interfaceC1494860p0G = (InterfaceC1494860p0G) Reflect.on(c1515200pX4).field("clientProvider", new Class[0]).get();
                InterfaceC1493760oyU interfaceC1493760oyU = interfaceC1494860p0G.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(interfaceC1494860p0G.getClass().getName()) || (interfaceC1493760oyU instanceof C1493780oyW)) {
                    return C2204961BRm.LLLLIIIILLL(c1515200pX4, new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDF0IszYPuCKcZ7IexBiPMwI5wu", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Retrofit retrofitLLLLIIIILLL = C2204961BRm.LLLLIIIILLL(c1515200pX4, new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDF0IszYPuCKcZ7IexBiPMwI5wu", null));
        List<InterfaceC1904907d9> list = retrofitLLLLIIIILLL.LJIIIIZZ;
        if (list != null) {
            list.add(new TTNetMonitorInterceptor());
            ListProtector.set(retrofitLLLLIIIILLL.LJIIIIZZ, 0, new BeforeHandleRequestInterceptor((InterfaceC1904907d9) ListProtector.get(retrofitLLLLIIIILLL.LJIIIIZZ, 0)));
            retrofitLLLLIIIILLL.LJIIIIZZ.add(new LastRequestInterceptor());
        }
        return retrofitLLLLIIIILLL;
    }

    public static void LIZJ(InterfaceC1904907d9 interfaceC1904907d9) {
        synchronized (C1515120pWw.class) {
            if (interfaceC1904907d9 != null) {
                if (!LIZ.contains(interfaceC1904907d9)) {
                    LIZ.add(interfaceC1904907d9);
                }
                C2211308lT.LIZLLL(LIZIZ, interfaceC1904907d9);
                C2211308lT.LIZLLL(LIZJ, interfaceC1904907d9);
            }
        }
        if (((Boolean) C310450CEx.LJ.getValue()).booleanValue()) {
            C2211308lT.LIZLLL(TTRetrofit.LIZ, interfaceC1904907d9);
        }
    }

    public static void LIZLLL(InterfaceC1904907d9 interfaceC1904907d9) {
        synchronized (C1515120pWw.class) {
            if (interfaceC1904907d9 != null) {
                if (LIZ.contains(interfaceC1904907d9)) {
                    LIZ.remove(interfaceC1904907d9);
                    C2211308lT.LJ(LIZIZ, interfaceC1904907d9);
                    C2211308lT.LJ(LIZJ, interfaceC1904907d9);
                }
            }
        }
        if (((Boolean) C310450CEx.LJ.getValue()).booleanValue()) {
            C2211308lT.LJ(TTRetrofit.LIZ, interfaceC1904907d9);
        }
    }

    public static synchronized Retrofit LJ(String str) {
        return LJFF(str, null, null, null, new InterfaceC1494860p0G() { // from class: X.0pXK
            @Override // X.InterfaceC1494860p0G
            public final InterfaceC1493760oyU get() {
                return new C1493530oy7();
            }
        });
    }

    public static synchronized Retrofit LJIIL(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        C08I7<String, Retrofit> c08i7 = LIZJ;
        Retrofit retrofitLIZIZ = c08i7.LIZIZ(str);
        if (retrofitLIZIZ != null) {
            return retrofitLIZIZ;
        }
        Retrofit retrofitLJ = LJ(str);
        c08i7.LIZLLL(str, retrofitLJ);
        return retrofitLJ;
    }

    public static synchronized Retrofit LJIILIIL(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        C08I7<String, Retrofit> c08i7 = LIZIZ;
        Retrofit retrofitLIZIZ = c08i7.LIZIZ(str);
        if (retrofitLIZIZ != null) {
            return retrofitLIZIZ;
        }
        Retrofit retrofitLJIIIIZZ = LJIIIIZZ(str, null);
        c08i7.LIZLLL(str, retrofitLJIIIIZZ);
        return retrofitLJIIIIZZ;
    }

    public static synchronized <S> S LJII(Retrofit retrofit, Class<S> cls) {
        if (retrofit != null) {
            return (S) retrofit.LIZ(cls);
        }
        return null;
    }

    public static synchronized Retrofit LJIIIIZZ(String str, List list) {
        return LJFF(str, list, null, null, new InterfaceC1494860p0G() { // from class: X.0pXJ
            @Override // X.InterfaceC1494860p0G
            public final InterfaceC1493760oyU get() {
                return new C1493530oy7();
            }
        });
    }

    public static synchronized Object LJIIIZ(Class cls, String str) {
        return LJII(LJIILIIL(str), cls);
    }

    public static C080U LJIIJ(String str, List list) {
        if (list != null && !C2093608Ic.LJ(str)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    return c080u;
                }
            }
        }
        return null;
    }

    public static String LJIIJJI(String str, List list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    return c080u.LIZIZ;
                }
            }
            return "";
        }
        return null;
    }

    public static synchronized Retrofit LJFF(String str, List list, C2336109Dj c2336109Dj, C2396409aE c2396409aE, InterfaceC1494860p0G interfaceC1494860p0G) {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = null;
        if (c2336109Dj != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(c2336109Dj);
        } else {
            arrayList2 = null;
        }
        if (c2396409aE != null) {
            arrayList = new ArrayList();
            arrayList.add(c2396409aE);
        }
        return LJI(list, arrayList2, arrayList, interfaceC1494860p0G, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x00cf, LOOP:0: B:13:0x0033->B:15:0x0039, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x00cf, LOOP:1: B:20:0x004f->B:22:0x0055, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[Catch: all -> 0x00cf, LOOP:3: B:46:0x00b9->B:48:0x00bf, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001d, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:13:0x0033, B:15:0x0039, B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:25:0x0067, B:27:0x006d, B:28:0x0072, B:30:0x0078, B:33:0x0084, B:37:0x008e, B:34:0x0089, B:40:0x009c, B:42:0x00a0, B:44:0x00a8, B:45:0x00ad, B:46:0x00b9, B:48:0x00bf, B:49:0x00c9, B:39:0x0094), top: B:55:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.bytedance.retrofit2.Retrofit LJI(java.util.List<X.InterfaceC1904907d9> r8, java.util.List<X.AbstractC2343909Gj> r9, java.util.List<X.C09S8> r10, X.InterfaceC1494860p0G r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515120pWw.LJI(java.util.List, java.util.List, java.util.List, X.0p0G, java.lang.String):com.bytedance.retrofit2.Retrofit");
    }
}
