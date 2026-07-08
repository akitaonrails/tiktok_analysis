package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveLayoutParamsStartCachingCallCountSetting;

/* JADX INFO: renamed from: X.0eTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090400eTu {
    public static boolean LIZIZ;
    public static final int LIZJ;
    public C1090390eTt<? extends ViewGroup.LayoutParams> LIZ;

    static {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        LIZIZ = c1119850fFP.LJIJJ;
        if (!c1119850fFP.LJIL && c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            c1119850fFP.LJIJJLI = LiveLayoutParamsStartCachingCallCountSetting.INSTANCE.getValue();
            c1119850fFP.LJIL = true;
        }
        LIZJ = c1119850fFP.LJIJJLI;
    }
}
