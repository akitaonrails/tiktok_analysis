package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.StreamIndex;

/* JADX INFO: renamed from: X.0jKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1276680jKM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[StreamIndex.values().length];
        LIZ = iArr;
        try {
            iArr[StreamIndex.STREAM_INDEX_MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_2ND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_3RD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_4TH.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_5TH.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_6TH.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[StreamIndex.STREAM_INDEX_7TH.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
    }
}
