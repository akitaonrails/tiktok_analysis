package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730040SkM {
    public static final C730040SkM LIZ = new C730040SkM();

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[PHI: r1
      0x003e: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:14:0x003c, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[PHI: r1
      0x0059: PHI (r1v9 java.lang.String) = (r1v2 java.lang.String), (r1v10 java.lang.String) binds: [B:7:0x0029, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.net.Uri r4) {
        /*
            java.lang.String r2 = r4.getLastPathSegment()
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1048"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "advertisement"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "to_user_id"
            r4.LJIIIIZZ(r0, r2)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L28
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L59
        L28:
            r1 = r2
            if (r3 != 0) goto L59
            r0 = 0
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJ(r0, r1)
            if (r3 == 0) goto L3b
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L3e
        L3b:
            r1 = r2
            if (r3 == 0) goto L45
        L3e:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L45
            r2 = r0
        L45:
            r4.LJIIIIZZ(r1, r2)
            java.lang.String r2 = "profile_entrance_id"
            long r0 = java.lang.System.currentTimeMillis()
            r4.LIZLLL(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L59:
            boolean r0 = r3.isConnected()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C730040SkM.LIZ(android.net.Uri):void");
    }

    public static final void LIZJ(String str) {
        Uri uri = UriProtector.parse(str);
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && host.length() != 0) {
            if (Intrinsics.LJFF(host, "profile")) {
                LIZ(uri);
            } else {
                if (!Intrinsics.LJFF(host, "user") || path == null || !u.LJJIIJZLJL(path, "/profile", false)) {
                    return;
                }
                LIZ(uri);
            }
        }
    }

    public static final void LIZIZ(Context context, String str) {
        C0SPE c0spe = new C0SPE(context.hashCode());
        c0spe.LIZJ = str;
        C1440005kM.LIZ(new C690450R6l());
        C1440005kM.LIZ(c0spe);
    }
}
