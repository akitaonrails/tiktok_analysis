package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0t3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650480t3G {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(456));

    public static final EnumC1448590nnd LIZ() {
        int i = ((Keva) LIZ.getValue()).getInt("default_camera_type", 2);
        return i != 1 ? i != 2 ? EnumC1448590nnd.RATIO_9_16 : EnumC1448590nnd.RATIO_9_16 : EnumC1448590nnd.RATIO_3_4;
    }
}
