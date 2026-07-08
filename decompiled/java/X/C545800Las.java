package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Las, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545800Las {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -2084521848: goto L9;
                case -1852497085: goto L14;
                case 107953784: goto L1f;
                case 1456113029: goto L28;
                default: goto L7;
            }
        L7:
            r1 = 0
        L8:
            return r1
        L9:
            java.lang.String r0 = "DOWNLOAD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "download"
            return r1
        L14:
            java.lang.String r0 = "SERVER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "server"
            return r1
        L1f:
            java.lang.String r1 = "quota"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L8
            goto L7
        L28:
            java.lang.String r0 = "IMAGE_UPLOAD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "upload"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545800Las.LIZJ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel LIZ(com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r18, com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus r19, X.C0LSZ r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545800Las.LIZ(com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel, com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus, X.0LSZ):com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel");
    }

    public static long LIZIZ(int i, long j, String str) {
        if (Intrinsics.LJFF(str, "FINISHED")) {
            return 0L;
        }
        if (i != 0 && j > 0) {
            return Math.max(10000L, j);
        }
        return 123000L;
    }
}
