package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Tit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C754610Tit {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC754620Tiu.values().length];
        try {
            iArr[EnumC754620Tiu.LIVE_PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
