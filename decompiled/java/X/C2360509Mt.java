package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2360509Mt {
    public static final C2360509Mt LIZ = new C2360509Mt();

    public static String LIZ(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            if (Intrinsics.LJFF("content", uri.getScheme())) {
                return LIZJ(context, uri);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SystemShareActivity convertUriToPath exception = ");
            sbLIZ.append(Unit.LIZ);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static void LIZIZ(InputStream inputStream, C0VSV c0vsv) throws Throwable {
        byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
        while (true) {
            Throwable th = null;
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        c0vsv.flush();
                        c0vsv.close();
                        C2107108Nh.LIZ(c0vsv, null);
                        C2107108Nh.LIZ(inputStream, null);
                        inputStream.close();
                        return;
                    }
                    c0vsv.write(bArr, 0, i);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th = null;
                    }
                }
            } catch (Throwable th6) {
                try {
                    TryCatchGuardChecker.doCheck(th6);
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        th = th6;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStream, th);
                                throw th;
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r9, android.net.Uri r10) throws java.lang.Throwable {
        /*
            java.lang.String r2 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            r6 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            X.0WZX r9 = new X.0WZX     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkgBHcl94eCvr+tXu1OSmhh9cXX5s"
            r9.<init>(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            r4 = r10
            r7 = r6
            r8 = r6
            android.database.Cursor r1 = X.C2204961BRm.LJJJ(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            if (r1 == 0) goto L37
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            r1.close()
            return r0
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r1 = r6
        L31:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            goto L39
        L37:
            if (r1 == 0) goto L3c
        L39:
            r1.close()
        L3c:
            return r6
        L3d:
            r0 = move-exception
            r6 = r1
        L3f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L3f
        L45:
            if (r6 == 0) goto L4a
            r6.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2360509Mt.LIZJ(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(android.content.Context r8, android.net.Uri r9, com.ss.android.ugc.aweme.creative.model.CreativeInfo r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2360509Mt.LIZLLL(android.content.Context, android.net.Uri, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r0 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(android.content.Context r7, android.net.Uri r8, com.ss.android.ugc.aweme.creative.model.CreativeInfo r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2360509Mt.LJ(android.content.Context, android.net.Uri, com.ss.android.ugc.aweme.creative.model.CreativeInfo, boolean):java.lang.String");
    }
}
