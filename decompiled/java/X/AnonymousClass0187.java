package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0187, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0187 {
    public static final Uri LIZIZ(String str) {
        Object c098200Yq;
        if (str == null) {
            return Uri.EMPTY;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        return (Uri) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[Catch: all -> 0x0159, TryCatch #7 {all -> 0x0159, blocks: (B:4:0x0004, B:9:0x0022, B:12:0x0029, B:14:0x002d, B:30:0x0050, B:21:0x003c, B:28:0x004a, B:31:0x0055, B:36:0x0071, B:39:0x0078, B:44:0x0092, B:47:0x0099, B:51:0x00b1, B:54:0x00b8, B:59:0x00d2, B:62:0x00d9, B:64:0x00dd, B:70:0x00ea, B:75:0x00f5, B:79:0x0121, B:82:0x0128, B:87:0x0142, B:90:0x0149, B:92:0x014e, B:86:0x0137, B:78:0x0116, B:58:0x00c7, B:50:0x00a6, B:43:0x0087, B:35:0x0066, B:8:0x0017, B:76:0x010b, B:48:0x009b, B:33:0x005b, B:84:0x012c, B:56:0x00bc, B:41:0x007c, B:6:0x000c), top: B:118:0x0004, inners: #0, #1, #2, #3, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0187.LIZ(android.net.Uri, java.lang.String):java.lang.String");
    }
}
