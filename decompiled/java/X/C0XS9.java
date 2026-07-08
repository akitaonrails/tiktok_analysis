package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0XS9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XS9 implements IEffectNetWorker {
    public static String LIZ(InputStream inputStream) {
        C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZJ(inputStream));
        try {
            String strLJJLIIIJILLIZJL = c1496670p3B.LJJLIIIJILLIZJL(StandardCharsets.UTF_8);
            c1496670p3B.close();
            return strLJJLIIIJILLIZJL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c1496670p3B.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static String LIZIZ(C0X52 c0x52) {
        String str = "";
        if (C0IKQ.LIZIZ(c0x52.LIZ.LIZLLL)) {
            for (C080U c080u : c0x52.LIZ.LIZLLL) {
                if ("x-tt-logid".equalsIgnoreCase(c080u.LIZ)) {
                    str = c080u.LIZIZ;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072 A[Catch: IOException -> 0x01a4, Exception -> 0x01b0, TryCatch #2 {IOException -> 0x01a4, Exception -> 0x01b0, blocks: (B:3:0x000d, B:5:0x002b, B:7:0x004a, B:8:0x0062, B:10:0x0072, B:12:0x0078, B:13:0x0080, B:15:0x0086, B:23:0x00af, B:24:0x00c1, B:26:0x00c7, B:28:0x00db, B:29:0x00f0, B:31:0x00f6, B:32:0x00fe, B:34:0x0104, B:36:0x0116, B:46:0x0164, B:47:0x0173, B:49:0x0179, B:50:0x018c, B:52:0x019c, B:37:0x011e, B:39:0x0124, B:40:0x0131, B:42:0x0140, B:44:0x0152, B:45:0x015b, B:18:0x008f), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[Catch: IOException -> 0x01a4, Exception -> 0x01b0, TryCatch #2 {IOException -> 0x01a4, Exception -> 0x01b0, blocks: (B:3:0x000d, B:5:0x002b, B:7:0x004a, B:8:0x0062, B:10:0x0072, B:12:0x0078, B:13:0x0080, B:15:0x0086, B:23:0x00af, B:24:0x00c1, B:26:0x00c7, B:28:0x00db, B:29:0x00f0, B:31:0x00f6, B:32:0x00fe, B:34:0x0104, B:36:0x0116, B:46:0x0164, B:47:0x0173, B:49:0x0179, B:50:0x018c, B:52:0x019c, B:37:0x011e, B:39:0x0124, B:40:0x0131, B:42:0x0140, B:44:0x0152, B:45:0x015b, B:18:0x008f), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e A[Catch: IOException -> 0x01a4, Exception -> 0x01b0, TryCatch #2 {IOException -> 0x01a4, Exception -> 0x01b0, blocks: (B:3:0x000d, B:5:0x002b, B:7:0x004a, B:8:0x0062, B:10:0x0072, B:12:0x0078, B:13:0x0080, B:15:0x0086, B:23:0x00af, B:24:0x00c1, B:26:0x00c7, B:28:0x00db, B:29:0x00f0, B:31:0x00f6, B:32:0x00fe, B:34:0x0104, B:36:0x0116, B:46:0x0164, B:47:0x0173, B:49:0x0179, B:50:0x018c, B:52:0x019c, B:37:0x011e, B:39:0x0124, B:40:0x0131, B:42:0x0140, B:44:0x0152, B:45:0x015b, B:18:0x008f), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179 A[Catch: IOException -> 0x01a4, Exception -> 0x01b0, TryCatch #2 {IOException -> 0x01a4, Exception -> 0x01b0, blocks: (B:3:0x000d, B:5:0x002b, B:7:0x004a, B:8:0x0062, B:10:0x0072, B:12:0x0078, B:13:0x0080, B:15:0x0086, B:23:0x00af, B:24:0x00c1, B:26:0x00c7, B:28:0x00db, B:29:0x00f0, B:31:0x00f6, B:32:0x00fe, B:34:0x0104, B:36:0x0116, B:46:0x0164, B:47:0x0173, B:49:0x0179, B:50:0x018c, B:52:0x019c, B:37:0x011e, B:39:0x0124, B:40:0x0131, B:42:0x0140, B:44:0x0152, B:45:0x015b, B:18:0x008f), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c A[Catch: IOException -> 0x01a4, Exception -> 0x01b0, TRY_LEAVE, TryCatch #2 {IOException -> 0x01a4, Exception -> 0x01b0, blocks: (B:3:0x000d, B:5:0x002b, B:7:0x004a, B:8:0x0062, B:10:0x0072, B:12:0x0078, B:13:0x0080, B:15:0x0086, B:23:0x00af, B:24:0x00c1, B:26:0x00c7, B:28:0x00db, B:29:0x00f0, B:31:0x00f6, B:32:0x00fe, B:34:0x0104, B:36:0x0116, B:46:0x0164, B:47:0x0173, B:49:0x0179, B:50:0x018c, B:52:0x019c, B:37:0x011e, B:39:0x0124, B:40:0x0131, B:42:0x0140, B:44:0x0152, B:45:0x015b, B:18:0x008f), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bd  */
    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream execute(com.ss.android.ugc.effectmanager.common.EffectRequest r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XS9.execute(com.ss.android.ugc.effectmanager.common.EffectRequest):java.io.InputStream");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void executeChunked(com.ss.android.ugc.effectmanager.common.EffectRequest r16, com.ss.android.ugc.effectmanager.common.ChunkResponseCallback r17) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XS9.executeChunked(com.ss.android.ugc.effectmanager.common.EffectRequest, com.ss.android.ugc.effectmanager.common.ChunkResponseCallback):void");
    }
}
