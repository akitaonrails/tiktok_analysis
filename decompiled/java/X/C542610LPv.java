package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542610LPv {
    public static int LIZ;

    public static final void LIZIZ(C0MVY c0mvy) {
        if (C297830Blt.LIZ()) {
            return;
        }
        C194353111z.LIZ.LJ(1017, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_VISIBLE_5S, LIZ);
        if (c0mvy == C0MVY.CLICK_CLOSE) {
            LIZIZ(C0MVY.DISMISS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[PHI: r2 r7 r14
      0x0097: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:26:0x0093, B:34:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r7v4 java.util.Iterator) = (r7v3 java.util.Iterator), (r7v5 java.util.Iterator) binds: [B:26:0x0093, B:34:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r14v2 X.0LPp) = (r14v0 X.0LPp), (r14v3 X.0LPp) binds: [B:26:0x0093, B:34:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[PHI: r0
      0x0104: PHI (r0v32 java.lang.Object) = (r0v23 java.lang.Object), (r0v1 java.lang.Object) binds: [B:37:0x00dd, B:46:0x0101] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00af -> B:33:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.C542550LPp r14, X.InterfaceC1364105Vn<? super X.C0LBJ> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542610LPv.LIZJ(X.0LPp, X.05Vn):java.lang.Object");
    }

    public static final void LIZLLL(C542550LPp c542550LPp, InterfaceC542470LPh interfaceC542470LPh) {
        Map mapLJ;
        C0LQ9 c0lq9 = C0LQ9.LIZ;
        CreativeModel creativeModel = c542550LPp.LIZIZ.LIZ;
        String str = c542550LPp.LIZJ.LIZLLL;
        str.toString();
        C0LQ3 c0lq3 = C0LQ3.RESTORE_START;
        if (str.length() > 0) {
            mapLJ = C2097908Jt.LIZJ(new Pair("restore_scene", str));
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        C0LQ9.LIZ(c0lq9, creativeModel, c0lq3, 1, 0, null, mapLJ, 56);
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C542460LPg(interfaceC542470LPh, c542550LPp, null), 3);
    }

    public static final Object LIZ(C542550LPp c542550LPp, CreativeLoadingDialog creativeLoadingDialog, ProgressDialogC1399790mWv progressDialogC1399790mWv, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0LQ0(c542550LPp, creativeLoadingDialog, progressDialogC1399790mWv, str, null));
    }
}
