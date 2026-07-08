package X;

import com.bytedance.android.bcm.api.model.BcmParams;

/* JADX INFO: renamed from: X.0w5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766990w5B {
    public BcmParams LIZ;
    public BcmParams LIZIZ;
    public BcmParams LIZJ;

    public static void LIZ(C2217391BqT c2217391BqT, BcmParams bcmParams) {
        BcmParams bcmParams2 = (BcmParams) c2217391BqT.get();
        if (bcmParams2 == null) {
            bcmParams2 = new BcmParams();
        }
        bcmParams2.merge(bcmParams);
        c2217391BqT.set(bcmParams2);
    }
}
