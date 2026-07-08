package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.io.File;

/* JADX INFO: renamed from: X.0MKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566620MKe {
    public static final C566620MKe LIZ = new C566620MKe();

    public static boolean LIZ(String str) {
        Object c098200Yq;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || c0vsj.length() <= 0) {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LIZLLL(ForwardMedia forwardMedia) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleMaterialRepo, onDownloadSuccess: aid = ");
        sbLIZ.append(forwardMedia.sourceId);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render_video_");
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C566040MHy.LIZ.getClass();
        String absolutePath = C566040MHy.LIZ(strLIZIZ).getAbsolutePath();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(absolutePath);
        sbLIZ2.append(File.separator);
        sbLIZ2.append("render_video_");
        sbLIZ2.append(str);
        sbLIZ2.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r8, int r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C317610Cch
            if (r0 == 0) goto L62
            r6 = r10
            X.0Cch r6 = (X.C317610Cch) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r1 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L6f
            int r9 = r6.LL
            java.lang.Object r3 = r6.LLILLL
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.00cf r0 = r6.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L2a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L38
            int r1 = r0.element
            int r1 = r1 + 1
            r0.element = r1
        L38:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r2 = (com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia) r2
            X.0MKe r1 = X.C566620MKe.LIZ
            r6.LLILLJJLI = r0
            r6.LLILLL = r3
            r6.LL = r9
            r6.LLILZLL = r4
            java.lang.Object r1 = r1.LJ(r9, r2, r6)
            if (r1 != r5) goto L2a
            return r5
        L55:
            X.C155000ia.LIZIZ(r1)
            X.00cf r0 = new X.00cf
            r0.<init>()
            java.util.Iterator r3 = r8.iterator()
            goto L38
        L62:
            X.0Cch r6 = new X.0Cch
            r6.<init>(r7, r10)
            goto L12
        L68:
            int r0 = r0.element
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C566620MKe.LIZIZ(java.util.List, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(final int r25, final com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r26, X.InterfaceC1364105Vn r27) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C566620MKe.LJ(int, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia, X.05Vn):java.lang.Object");
    }
}
