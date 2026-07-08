package X;

import Y.ARunnableS23S1200000_19;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS135S1200000_19;

/* JADX INFO: renamed from: X.13Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20013213Sg implements InterfaceC1387130mCV<String> {
    public static final int LJI = C0C64.LJIILLIIL().LJIJ(31744, 52428800, "disk_cache_size", true);
    public final C199596137q LIZ;
    public final C199596137q LIZIZ;
    public final C0W1V LIZJ;
    public final Map<String, ? extends Object> LIZLLL;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public final ExecutorService LJFF;

    @Override // X.InterfaceC1387130mCV
    public final void clear() {
        try {
            C844470XAv.LIZ.getClass();
            C2137908Zd.LIZJ.LIZLLL(LIZJ(C844470XAv.LIZ()).getAbsolutePath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1387130mCV
    public final Collection<Aweme> values() {
        return this.LIZ.LL.values();
    }

    public C20013213Sg() {
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "AwemeLruMemoryAndDiskCache";
        this.LJFF = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        C199593137n c199593137n = new C199593137n();
        c199593137n.LJFF(C137F.LLILLJJLI);
        c199593137n.LIZLLL(C0C64.LJIILLIIL().LJIJ(31744, 200, "weak_memory_cache_size", true));
        c199593137n.LJ(new AnonymousClass1385() { // from class: X.139U
            @Override // X.AnonymousClass1385
            public final void LIZJ(C199603137x<String, Aweme> c199603137x) throws Throwable {
                String key = c199603137x.getKey();
                Aweme value = c199603137x.getValue();
                if (value != null && !((Boolean) C1852707Nl.LJIIJ.getValue()).booleanValue()) {
                    this.LL.LIZLLL(value, key);
                }
            }
        });
        this.LIZIZ = c199593137n.LIZ();
        C199593137n c199593137n2 = new C199593137n();
        c199593137n2.LIZLLL(C0C64.LJIILLIIL().LJIJ(31744, 100, "memory_cache_size", true));
        c199593137n2.LJ(new AnonymousClass1385() { // from class: X.139T
            @Override // X.AnonymousClass1385
            public final void LIZJ(C199603137x<?, ?> c199603137x) throws Throwable {
                Object key = c199603137x.getKey();
                String str = (String) key;
                Aweme aweme = (Aweme) c199603137x.getValue();
                this.LL.LIZIZ.LL.put(str, aweme);
                if (!((Boolean) C1852707Nl.LJIIIZ.getValue()).booleanValue() && !((Boolean) C1852707Nl.LJIIJ.getValue()).booleanValue()) {
                    this.LL.LIZLLL(aweme, str);
                }
            }
        });
        this.LIZ = c199593137n2.LIZ();
        try {
            C844470XAv.LIZ.getClass();
            C0VSJ c0vsjLIZJ = LIZJ(C844470XAv.LIZ());
            if (c0vsjLIZJ.exists()) {
                C2137908Zd.LIZJ.LIZLLL(c0vsjLIZJ.getAbsolutePath());
            }
            if (!C1336210ksN.LIZ()) {
                C0W1V c0w1vLJIIZILJ = C0W1V.LJIIZILJ(c0vsjLIZJ, ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode(), LJI);
                this.LIZJ = c0w1vLJIIZILJ;
                Map<String, ? extends Object> map = (Map) C1965507mv.LIZJ(c0w1vLJIIZILJ, "lruEntries");
                this.LIZLLL = map;
                if (map != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("disk entries:");
                    sbLIZ.append(Integer.valueOf(map.size()));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("strong:");
            sbLIZ2.append(C0C64.LJIILLIIL().LJIJ(31744, 100, "memory_cache_size", true));
            sbLIZ2.append(" weak:");
            sbLIZ2.append(C0C64.LJIILLIIL().LJIJ(31744, 200, "weak_memory_cache_size", true));
            sbLIZ2.append(" disk:");
            sbLIZ2.append(LJI);
            C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C0VSJ LIZJ(Context context) {
        String path = C786410Ut5.w2(context).getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append(File.separator);
        sbLIZ.append("awemeCache");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZIZ(String str) {
        Object obj;
        C0W1V c0w1v = this.LIZJ;
        if (c0w1v == null || c0w1v.LLIZLLLIL == null) {
            return false;
        }
        try {
            if (((IMainService) ServiceManager.get().getService(IMainService.class)).isContainsKeyWithLruEntries()) {
                Map<String, ? extends Object> map = this.LIZLLL;
                if (map == null || (obj = map.get(str)) == null) {
                    return false;
                }
                return ((Boolean) C1965507mv.LIZJ(obj, "readable")).booleanValue();
            }
            try {
                C0W1V c0w1v2 = this.LIZJ;
                if (c0w1v2 == null) {
                    return false;
                }
                C0W1X c0w1xLJIILL = c0w1v2.LJIILL(str);
                if (c0w1xLJIILL == null) {
                    return false;
                }
                c0w1xLJIILL.close();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // X.InterfaceC1387130mCV
    public final boolean containsKey(String str) {
        String str2 = str;
        try {
            if (this.LIZ.LJIIIZ(str2) == null && this.LIZIZ.LJIIIZ(str2) == null) {
                if (LIZIZ(str2)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0078: MOVE (r2 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:16777336), block:B:30:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.137q] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.137q] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0W1V] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.137o, X.137o<K, V>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1387130mCV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme get(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            X.137q r0 = r6.LIZ
            java.lang.Object r5 = r0.LJIIIZ(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            if (r5 != 0) goto L27
            X.137q r0 = r6.LIZIZ
            java.lang.Object r5 = r0.LJIIIZ(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            if (r5 == 0) goto L28
            X.137q r0 = r6.LIZ
            X.137o<K, V> r0 = r0.LL
            r0.put(r7, r5)
            X.137q r0 = r6.LIZIZ
            r0.getClass()
            X.137o<K, V> r0 = r0.LL
            r0.remove(r7)
        L27:
            return r5
        L28:
            r4 = 0
            if (r5 != 0) goto L27
            X.0W1V r0 = r6.LIZJ
            r2 = 0
            if (r0 == 0) goto L50
            X.0W1X r0 = r0.LJIILL(r7)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7d
            if (r0 == 0) goto L50
            java.io.InputStream[] r0 = r0.LL     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7d
            r0 = r0[r4]     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7d
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7d
            java.lang.Object r5 = r1.readObject()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L77
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L77
            goto L52
        L46:
            r0 = move-exception
            goto L4a
        L48:
            r0 = move-exception
            r1 = r2
        L4a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L77
            X.C2260008tK.LIZ(r1)
        L50:
            r5 = r2
            goto L5e
        L52:
            X.C2260008tK.LIZ(r1)
            if (r5 == 0) goto L5e
            X.137q r0 = r6.LIZ
            X.137o<K, V> r0 = r0.LL
            r0.put(r7, r5)
        L5e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "get Aweme from diskCache， awemeId = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r1 = 4
            java.lang.String r0 = "AwemeLruCache"
            X.C2344809Gs.LIZLLL(r1, r0, r2)
            if (r5 != 0) goto L27
            goto L83
        L77:
            r0 = move-exception
            r2 = r1
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r0 = move-exception
            goto L79
        L7f:
            X.C2260008tK.LIZ(r2)
            throw r0
        L83:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lad
            r3.<init>()     // Catch: java.lang.Exception -> Lad
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> Lad
            r0.<init>()     // Catch: java.lang.Exception -> Lad
            java.lang.String r2 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Exception -> Lad
            int r1 = r2.length()     // Catch: java.lang.Exception -> Lad
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto L9d
            java.lang.String r2 = r2.substring(r4, r0)     // Catch: java.lang.Exception -> Lad
        L9d:
            java.lang.String r0 = "error_stack"
            r3.put(r0, r2)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "aid"
            r3.put(r0, r7)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "aweme_manager_get_aweme_is_null"
            X.C794240VDq.LIZJ(r0, r3)     // Catch: java.lang.Exception -> Lad
            return r5
        Lad:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20013213Sg.get(java.lang.Object):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1387130mCV
    public final void LIZ(Aweme aweme, Object obj) {
        this.LIZ.LL.put((K) obj, (V) aweme);
    }

    public final void LIZLLL(final Aweme aweme, final String str) throws Throwable {
        MessageQueue messageQueueMyQueue;
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread() && !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_async_put_aweme_disk_cache", true, true)) {
            LJ(aweme, str);
            return;
        }
        if (((Boolean) C304570Bwl.LIZIZ.getValue()).booleanValue()) {
            C786410Ut5.LJLIIL(300L, this.LJ, new ARunnableS23S1200000_19(this, aweme, str, 2));
            return;
        }
        if (((Boolean) C304570Bwl.LIZJ.getValue()).booleanValue()) {
            if (((Boolean) C1212404ok.LIZIZ.getValue()).booleanValue()) {
                messageQueueMyQueue = Looper.getMainLooper().getQueue();
            } else {
                messageQueueMyQueue = Looper.myQueue();
            }
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0hf4
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    ((IDowngradeApi) ServiceManager.get().getService(IDowngradeApi.class)).LIZLLL(new AwS135S1200000_19(this.LL, str, aweme, 3), ((Boolean) C2267951Dpp.LJFF.getValue()).booleanValue());
                    return false;
                }
            }, messageQueueMyQueue);
            return;
        }
        this.LJFF.submit(new ARunnableS23S1200000_19(this, aweme, str, 3));
    }

    public final void LJ(Aweme aweme, String str) throws Throwable {
        C0W1T c0w1tLJII;
        C0W1F c0w1fLIZIZ;
        ObjectOutputStream objectOutputStream;
        C0W1V c0w1v = this.LIZJ;
        if (c0w1v == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                c0w1tLJII = c0w1v.LJII(str);
                if (c0w1tLJII != null) {
                    c0w1fLIZIZ = c0w1tLJII.LIZIZ();
                } else {
                    c0w1fLIZIZ = null;
                }
                objectOutputStream = new ObjectOutputStream(c0w1fLIZIZ);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            objectOutputStream.writeObject(aweme);
            if (c0w1tLJII != null) {
                c0w1tLJII.LIZ();
            }
            C2260008tK.LIZ(objectOutputStream);
        } catch (Exception e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            TryCatchGuardChecker.doCheck(e);
            C2260008tK.LIZ(objectOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            TryCatchGuardChecker.doCheck(th);
            C2260008tK.LIZ(objectOutputStream2);
            throw th;
        }
    }
}
