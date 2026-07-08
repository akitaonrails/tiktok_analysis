package X;

import android.util.JsonReader;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.StringReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593370NPb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (Intrinsics.LJFF(jsonReader.nextName(), str2)) {
                        String strNextString = jsonReader.nextString();
                        C2107108Nh.LIZ(jsonReader, null);
                        return strNextString;
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                C2107108Nh.LIZ(jsonReader, null);
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(jsonReader, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0069
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.Map LIZIZ(java.lang.String r8, java.util.List r9) {
        /*
            if (r8 == 0) goto L1f
            int r0 = r8.length()
            if (r0 == 0) goto L1f
            r0 = 0
        L9:
            if (r0 != 0) goto L76
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L76
            java.util.Set r7 = X.C13LP.LLIIJI(r9)
            int r6 = r7.size()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r6)
            goto L21
        L1f:
            r0 = 1
            goto L9
        L21:
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch: java.lang.Exception -> L71
            java.io.StringReader r0 = new java.io.StringReader     // Catch: java.lang.Exception -> L71
            r0.<init>(r8)     // Catch: java.lang.Exception -> L71
            r4.<init>(r0)     // Catch: java.lang.Exception -> L71
            r3 = 0
            r4.beginObject()     // Catch: java.lang.Throwable -> L61
        L2f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5d
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L61
            if (r0 == r6) goto L5d
            java.lang.String r2 = r4.nextName()     // Catch: java.lang.Throwable -> L61
            boolean r0 = r7.contains(r2)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L59
            android.util.JsonToken r1 = r4.peek()     // Catch: java.lang.Throwable -> L61
            android.util.JsonToken r0 = android.util.JsonToken.NULL     // Catch: java.lang.Throwable -> L61
            if (r1 == r0) goto L55
            java.lang.String r0 = r4.nextString()     // Catch: java.lang.Throwable -> L61
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L61
            goto L2f
        L55:
            r4.nextNull()     // Catch: java.lang.Throwable -> L61
            goto L2f
        L59:
            r4.skipValue()     // Catch: java.lang.Throwable -> L61
            goto L2f
        L5d:
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Exception -> L71
            return r5
        L61:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            r3 = r1
            goto L6a
        L69:
            r0 = move-exception
        L6a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L69
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Exception -> L71
            throw r0     // Catch: java.lang.Exception -> L71
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        L76:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593370NPb.LIZIZ(java.lang.String, java.util.List):java.util.Map");
    }

    public static double LIZJ(double d, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    d = CastDoubleProtector.parseDouble(a0.LJLIIIL(str).toString());
                    return d;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return d;
            }
        }
        return d;
    }
}
