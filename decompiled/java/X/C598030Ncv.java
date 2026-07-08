package X;

import android.os.Looper;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ncv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598030Ncv {
    public static final C598030Ncv LIZ = new C598030Ncv();

    public static void LIZJ(String str) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pin_product_data", str);
        jSONObject.put("data", jSONObject2);
        iEventCenter.LIZ("ec_audience_message_event", C786410Ut5.J3(jSONObject));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[Catch: all -> 0x005d, TryCatch #5 {all -> 0x005d, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:36:0x0051, B:30:0x0045, B:32:0x004a, B:33:0x004d, B:11:0x0013, B:13:0x001e, B:16:0x002d, B:27:0x0040, B:28:0x0043, B:14:0x0021), top: B:47:0x0003, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.C0X52 r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L10
            X.08fh r0 = r4.LIZ     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L10
            com.bytedance.retrofit2.mime.TypedInput r0 = r0.LJ     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L10
            java.io.InputStream r1 = r0.in()     // Catch: java.lang.Throwable -> L5d
            goto L11
        L10:
            r1 = r3
        L11:
            if (r1 == 0) goto L4e
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            if (r0 == 0) goto L21
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            goto L29
        L21:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            r2 = r1
        L29:
            java.lang.String r0 = X.C08KC.LIZJ(r2)     // Catch: java.lang.Throwable -> L31
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            goto L4f
        L31:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
            r1 = r3
        L3a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r0 = move-exception
            goto L3a
        L40:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
            throw r0     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L49
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            goto L4e
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L4e:
            r0 = r3
        L4f:
            if (r0 == 0) goto L61
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "data"
            java.lang.String r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Throwable -> L5d
            return r3
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598030Ncv.LIZLLL(X.0X52):java.lang.String");
    }

    public static void LIZ(C0X52 c0x52, String str, boolean z) {
        if (C294680Bgo.LIZ() && str != null && str.length() != 0) {
            if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                LIZIZ(c0x52, str, z);
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C0NSJ(c0x52, str, z, null), 3);
            }
        }
    }

    public static void LIZIZ(C0X52 c0x52, String str, boolean z) {
        TypedInput typedInput;
        InputStream inputStreamIn;
        BufferedReader bufferedReader;
        if (c0x52 != null) {
            try {
                C2175508fh c2175508fh = c0x52.LIZ;
                if (c2175508fh != null && (typedInput = c2175508fh.LJ) != null && (inputStreamIn = typedInput.in()) != null) {
                    try {
                        try {
                            Reader inputStreamReader = new InputStreamReader(inputStreamIn, Charsets.UTF_8);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            try {
                                String strLIZJ = C08KC.LIZJ(bufferedReader);
                                C2107108Nh.LIZ(bufferedReader, null);
                                if (strLIZJ != null) {
                                    String string = JSONObjectProtectorUtils.getString(new JSONObject(strLIZJ), "data");
                                    if (z) {
                                        LIZ.getClass();
                                        LIZJ(string);
                                    }
                                    C212391189t.LIZ.getClass();
                                    C212391189t.LIZIZ("pin_product", str, string);
                                }
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
                                                try {
                                                    break;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    return;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        C2107108Nh.LIZ(bufferedReader, th);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = null;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    }
                }
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
            }
        }
    }
}
