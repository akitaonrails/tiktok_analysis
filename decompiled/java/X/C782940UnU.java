package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0UnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782940UnU {
    public static final C782940UnU LIZ = new C782940UnU();

    public static boolean LIZ() {
        return (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || LIZIZ()) && ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isSupportFoldDevice();
    }

    public static boolean LIZIZ() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2();
    }

    public static boolean LIZJ() {
        return C20642515q3.LJFF().getConfiguration().orientation == 2;
    }
}
