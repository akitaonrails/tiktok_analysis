package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08KC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KC {
    public static final Sequence<String> LIZIZ(BufferedReader bufferedReader) {
        C08KD c08kd = new C08KD(bufferedReader);
        if (!(c08kd instanceof C08F6)) {
            return new C08F6(c08kd);
        }
        return c08kd;
    }

    public static final String LIZJ(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void LIZ(java.io.Reader r3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r4) {
        /*
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            r2 = 0
            kotlin.sequences.Sequence r0 = LIZIZ(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        Lb:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L1d
            r4.invoke(r0)     // Catch: java.lang.Throwable -> L1d
            goto Lb
        L19:
            X.C2107108Nh.LIZ(r3, r2)
            return
        L1d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L22
        L22:
            r0 = move-exception
            r2 = r1
            goto L26
        L25:
            r0 = move-exception
        L26:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L25
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08KC.LIZ(java.io.Reader, kotlin.jvm.functions.Function1):void");
    }
}
