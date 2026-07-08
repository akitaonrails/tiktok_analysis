package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager;

/* JADX INFO: renamed from: X.0DfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344660DfE {
    public static final /* synthetic */ C344660DfE LIZ = new C344660DfE();
    public static final BlockManager LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    static {
        /*
            X.0DfE r0 = new X.0DfE
            r0.<init>()
            X.C344660DfE.LIZ = r0
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1
            if (r1 == 0) goto L2c
            java.lang.String r0 = X.C344670DfF.LIZ
            java.lang.String r0 = X.C344670DfF.LIZ
            X.011f r1 = r1.LIZ(r0)
            if (r1 == 0) goto L2c
            java.lang.Class<com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager> r0 = com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager.class
            java.lang.Object r0 = r1.create(r0)
            com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager r0 = (com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager) r0
        L29:
            X.C344660DfE.LIZIZ = r0
            return
        L2c:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344660DfE.<clinit>():void");
    }

    public static C11O8 LIZ(String str, int i, String str2) {
        C11NZ<BaseResponse> c11nzLIZIZ;
        BlockManager blockManager = LIZIZ;
        if (blockManager != null && (c11nzLIZIZ = blockManager.LIZIZ(str, i, str2)) != null) {
            return c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        return null;
    }
}
