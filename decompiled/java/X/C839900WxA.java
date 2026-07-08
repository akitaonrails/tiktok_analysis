package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0WxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839900WxA {
    public static final C839900WxA LIZ = new C839900WxA();

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0037
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZIZ(java.io.InputStream r4, java.lang.String r5) {
        /*
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L8
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L8
            goto L14
        L8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L14:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L1f
            r3 = r1
        L1f:
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3
            r2 = 0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = X.C08KC.LIZJ(r0)     // Catch: java.lang.Throwable -> L2f
            X.C2107108Nh.LIZ(r4, r2)
            return r0
        L2f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            r2 = r1
            goto L38
        L37:
            r0 = move-exception
        L38:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
            X.C2107108Nh.LIZ(r4, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C839900WxA.LIZIZ(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static InputStream LIZ(InputStream inputStream, String str, String str2) {
        Charset charsetForName = Charsets.UTF_8;
        try {
            charsetForName = Charset.forName(str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return new SequenceInputStream(new ByteArrayInputStream(str.getBytes(charsetForName)), inputStream);
    }
}
