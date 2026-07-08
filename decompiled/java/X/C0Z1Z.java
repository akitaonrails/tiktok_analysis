package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.clientai.android.bitmap.ColorSeq;
import com.tiktok.clientai.android.bitmap.NormalizationType;
import com.tiktok.clientai.android.bitmap.OutputFormat;

/* JADX INFO: renamed from: X.0Z1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0Z1Z {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[NormalizationType.values().length];
        try {
            iArr[NormalizationType.SIMPLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[NormalizationType.IMAGENET.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[OutputFormat.values().length];
        try {
            iArr2[OutputFormat.HWC.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[ColorSeq.values().length];
        try {
            iArr3[ColorSeq.BGR.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZJ = iArr3;
    }
}
