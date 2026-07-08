package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AddressJumpType;

/* JADX INFO: renamed from: X.03zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C1026903zv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AddressJumpType.values().length];
        try {
            iArr[AddressJumpType.ADDRESS_EDIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AddressJumpType.ADDRESS_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
