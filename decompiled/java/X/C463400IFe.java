package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterDeferOptSetting;

/* JADX INFO: renamed from: X.0IFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463400IFe {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        int iValue = LiveEnterDeferOptSetting.INSTANCE.value();
        if ((iValue & 1) != 0 && (i & iValue) != 0) {
            return true;
        }
        return false;
    }
}
