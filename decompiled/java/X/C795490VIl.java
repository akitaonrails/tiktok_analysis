package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.trace.FcpTraceDiskCacheItem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0VIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795490VIl {
    public static final C795490VIl LIZ = new C795490VIl();
    public static final long LIZIZ = System.currentTimeMillis();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(440));

    public static Keva LIZJ() {
        return (Keva) LIZJ.getValue();
    }

    public static Set LJ() {
        Object c098200Yq;
        byte[] bytes = LIZJ().getBytes("fcp_trace_disk_cache_item_keys", null);
        if (bytes == null) {
            return new LinkedHashSet();
        }
        try {
            c098200Yq = LIZ(bytes);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = linkedHashSet;
        }
        return (Set) c098200Yq;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x001f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.Set LIZ(byte[] r3) {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L27
            r0.<init>(r3)     // Catch: java.lang.Exception -> L27
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L27
            r3.<init>(r0)     // Catch: java.lang.Exception -> L27
            r2 = 0
            java.lang.Object r0 = r3.readObject()     // Catch: java.lang.Throwable -> L17
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L27
            java.util.Set r0 = X.C19719512Dh.LIZLLL(r0)     // Catch: java.lang.Exception -> L27
            return r0
        L17:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            r2 = r1
            goto L20
        L1f:
            r0 = move-exception
        L20:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L27
            throw r0     // Catch: java.lang.Exception -> L27
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C795490VIl.LIZ(byte[]):java.util.Set");
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp_trace_disk_cache_item_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static byte[] LJI(Object obj) throws Throwable {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            Throwable th = null;
            try {
                objectOutputStream.writeObject(obj);
                C2107108Nh.LIZ(objectOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(objectOutputStream, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new byte[0];
        }
    }

    public final synchronized FcpTraceDiskCacheItem LIZIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        byte[] bytes = LIZJ().getBytes(LIZLLL(str), null);
        try {
            if (bytes == null) {
                return null;
            }
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bytes));
                try {
                    Object object = objectInputStream.readObject();
                    C2107108Nh.LIZ(objectInputStream, null);
                    c098200Yq = (FcpTraceDiskCacheItem) object;
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(objectInputStream, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(objectInputStream, th);
                        throw th;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (FcpTraceDiskCacheItem) obj;
    }

    public final synchronized void LJFF(String str) {
        Set setLJ = LJ();
        setLJ.remove(str);
        LIZJ().storeBytes("fcp_trace_disk_cache_item_keys", LJI(setLJ));
        LIZJ().erase(LIZLLL(str));
    }
}
