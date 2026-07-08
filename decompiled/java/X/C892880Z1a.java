package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.clientai.android.bitmap.ColorSeq;
import com.tiktok.clientai.android.bitmap.OutputFormat;

/* JADX INFO: renamed from: X.0Z1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C892880Z1a {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ColorSeq.values().length];
        try {
            iArr[ColorSeq.BGR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        OutputFormat.values();
        try {
            OutputFormat.HWC.ordinal();
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            OutputFormat.CHW.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
