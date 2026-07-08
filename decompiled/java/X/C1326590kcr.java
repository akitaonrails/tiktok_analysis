package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageDiskCacheData;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImgDisableMemCacheData;

/* JADX INFO: renamed from: X.0kcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326590kcr {
    public static final C1325710kbR LIZ(String str) {
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C1326840kdG.LIZ.LIZLLL(str, false).LIZ));
        LIZIZ(c1325700kbQLIZLLL, null);
        EcomImgDisableMemCacheData ecomImgDisableMemCacheData = C1326310kcP.LIZ;
        if (ecomImgDisableMemCacheData.enable && C13LP.LJJJJ(C1334150kp3.LJ(c1325700kbQLIZLLL.LIZ), ecomImgDisableMemCacheData.sceneList)) {
            c1325700kbQLIZLLL.LJIILLIIL = false;
        }
        return c1325700kbQLIZLLL.LIZ();
    }

    public static final void LIZIZ(C1325700kbQ c1325700kbQ, String str) {
        C1199304md.LIZ.getClass();
        if (C1199304md.LIZJ.getValue().booleanValue()) {
            EcomImageDiskCacheData ecomImageDiskCacheData = C1199304md.LIZIZ;
            if (ecomImageDiskCacheData.enableFirstScreenOperationCache) {
                String string = c1325700kbQ.LIZ.toString();
                String strLJ = C1334150kp3.LJ(c1325700kbQ.LIZ);
                if (strLJ == null) {
                    strLJ = "";
                }
                String str2 = LIZJ(string, strLJ, str).LLILLJJLI;
                if (str2 != null) {
                    c1325700kbQ.LJIJI = str2;
                    c1325700kbQ.LJI = EnumC1325560kbC.CUSTOM;
                    return;
                }
                return;
            }
            if (C770702zh.LIZIZ(str)) {
                return;
            }
            String strLJ2 = C1334150kp3.LJ(c1325700kbQ.LIZ);
            if (C1199304md.LIZIZ() > 0 && C13LP.LJJJJ(strLJ2, ecomImageDiskCacheData.operationList)) {
                c1325700kbQ.LJIJI = "ecom_operation_cache";
                c1325700kbQ.LJI = EnumC1325560kbC.CUSTOM;
            } else {
                if (C1199304md.LIZ() <= 0) {
                    return;
                }
                c1325700kbQ.LJIJI = "ecom_main_cache";
                c1325700kbQ.LJI = EnumC1325560kbC.CUSTOM;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC1326600kcs LIZJ(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = r7.length()
            if (r0 != 0) goto L2b
            r0 = 1
        L7:
            java.lang.String r6 = "ecom_disk_cache_route"
            if (r0 != 0) goto L2d
            java.lang.Object r5 = X.C1066210dqt.LIZ(r7, r6)
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L2d
            if (r5 == 0) goto L2d
            X.0kcs[] r4 = X.EnumC1326600kcs.values()
            int r3 = r4.length
            r2 = 0
        L1b:
            if (r2 >= r3) goto L2d
            r1 = r4[r2]
            java.lang.String r0 = r1.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L28
            return r1
        L28:
            int r2 = r2 + 1
            goto L1b
        L2b:
            r0 = 0
            goto L7
        L2d:
            java.lang.String r0 = "ecom_operation_cache"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 != 0) goto Lba
            java.lang.String r0 = "operation"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 != 0) goto Lba
            java.lang.String r0 = "ecom_main_cache"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 != 0) goto Lb7
            X.0kcs r0 = X.EnumC1326600kcs.LLILZ
            java.lang.String r1 = "main"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r1)
            if (r1 != 0) goto Lb7
            X.0kcs r2 = X.EnumC1326600kcs.LLILLL
            java.lang.String r1 = "default"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r1)
            if (r1 == 0) goto L6f
            r0 = r2
        L5a:
            if (r0 == 0) goto L78
        L5c:
            int r1 = r7.length()
            if (r1 == 0) goto L6e
            java.lang.String r1 = r0.LL
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r1)
            java.lang.String r1 = "log"
            X.C1066210dqt.LIZLLL(r7, r1, r2)
        L6e:
            return r0
        L6f:
            if (r9 == 0) goto L78
            int r1 = r9.length()
            if (r1 <= 0) goto L78
            goto L5a
        L78:
            X.04md r0 = X.C1199304md.LIZ
            r0.getClass()
            long r1 = X.C1199304md.LIZIZ()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.image.EcomImageDiskCacheData r0 = X.C1199304md.LIZIZ
            java.util.List<java.lang.String> r0 = r0.operationList
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L94
        L91:
            X.0kcs r0 = X.EnumC1326600kcs.LLILZIL
            goto L5c
        L94:
            long r1 = X.C1199304md.LIZIZ()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto La9
            X.0kcn r1 = X.C1326580kcq.LIZ
            X.0kcn r0 = X.EnumC1326550kcn.FIRST_REFRESH_CACHE
            if (r1 == r0) goto L91
            X.0kcp r1 = X.C1326580kcq.LIZIZ
            X.0kcp r0 = X.EnumC1326570kcp.IDLE
            if (r1 == r0) goto La9
            goto L91
        La9:
            long r1 = X.C1199304md.LIZ()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            X.0kcs r0 = X.EnumC1326600kcs.LLILZ
            goto L5c
        Lb4:
            X.0kcs r0 = X.EnumC1326600kcs.LLILLL
            goto L5c
        Lb7:
            X.0kcs r0 = X.EnumC1326600kcs.LLILZ
            goto L5a
        Lba:
            X.0kcs r0 = X.EnumC1326600kcs.LLILZIL
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326590kcr.LIZJ(java.lang.String, java.lang.String, java.lang.String):X.0kcs");
    }
}
