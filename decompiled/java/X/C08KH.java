package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.08KH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KH {
    public static Charset LIZJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Charset.forName(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = charsetDefaultCharset;
        }
        return (Charset) c098200Yq;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x001a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final java.lang.String LIZIZ(java.io.InputStream r3, java.lang.String r4) {
        /*
            r2 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L12
            java.nio.charset.Charset r0 = LIZJ(r4)     // Catch: java.lang.Throwable -> L12
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = X.C08KC.LIZJ(r1)     // Catch: java.lang.Throwable -> L12
            X.C2107108Nh.LIZ(r3, r2)
            return r0
        L12:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L17
        L17:
            r0 = move-exception
            r2 = r1
            goto L1b
        L1a:
            r0 = move-exception
        L1b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1a
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08KH.LIZIZ(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static final C1957407lc LIZ(int i, InputStream inputStream, String str) throws Throwable {
        Throwable th = null;
        try {
            C1957407lc c1957407lc = new C1957407lc(new C08VX(i, new InputStreamReader(inputStream, LIZJ(str)), null));
            C2107108Nh.LIZ(inputStream, null);
            return c1957407lc;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStream, th);
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        }
    }
}
