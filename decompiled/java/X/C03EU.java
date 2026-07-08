package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03EU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EU {
    public static final float LIZ(String str) {
        IECommerceHostService iECommerceHostService;
        float f;
        float fLIZIZ;
        boolean z;
        String name;
        int iLIZLLL = C958103op.LIZLLL();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        float dimension = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext().getResources().getDimension(R.dimen.f607oc);
        if (!Intrinsics.LJFF(str, "ul")) {
            f = iLIZLLL;
            fLIZIZ = 2 * dimension;
        } else {
            f = iLIZLLL - (2 * dimension);
            fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        return f - fLIZIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZIZ(String str) {
        switch (str.hashCode()) {
            case -42298471:
                if (!str.equals("sub_title")) {
                    return 0;
                }
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            case 3735:
                if (!str.equals("ul")) {
                    return 0;
                }
                break;
            case 3556653:
                if (!str.equals("text")) {
                    return 0;
                }
                break;
            case 110371416:
                if (!str.equals("title")) {
                    return 0;
                }
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            case 1307197699:
                if (!str.equals("specification")) {
                    return 0;
                }
                break;
            default:
                return 0;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZJ(java.lang.String r6, java.lang.String r7) {
        /*
            float r2 = LIZ(r7)
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto Lb
            return r1
        Lb:
            int r3 = r7.hashCode()
            r0 = 3735(0xe97, float:5.234E-42)
            if (r3 == r0) goto L68
            r0 = 3556653(0x36452d, float:4.983932E-39)
            if (r3 == r0) goto L5f
            r0 = 110371416(0x6942258, float:5.5721876E-35)
            if (r3 == r0) goto L49
            r0 = 1307197699(0x4dea4103, float:4.9126614E8)
            if (r3 != r0) goto L2a
            java.lang.String r0 = "specification"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L71
        L2a:
            r4 = 0
        L2b:
            int r3 = r6.length()
            int r3 = r3 * r4
            int r0 = (int) r2
            if (r3 < r0) goto L48
            int r1 = r6.length()
            int r1 = r1 * r4
            int r1 = r1 / r0
            int r0 = r6.length()
            int r4 = r4 * r0
            float r3 = (float) r4
            float r0 = (float) r1
            float r0 = r0 * r2
            float r3 = r3 - r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L48
            int r1 = r1 + 1
        L48:
            return r1
        L49:
            java.lang.String r0 = "title"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L2b
        L5f:
            java.lang.String r0 = "text"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L71
            goto L2a
        L68:
            java.lang.String r0 = "ul"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L71
            goto L2a
        L71:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03EU.LIZJ(java.lang.String, java.lang.String):int");
    }
}
