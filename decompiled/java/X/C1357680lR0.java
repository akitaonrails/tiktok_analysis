package X;

import java.util.ArrayList;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0lR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357680lR0 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(408));
    public static final ArrayList<Integer> LIZIZ = C1697810uHb.LJ(Integer.valueOf(EnumC1373410lqN.SHARE_USER.getNum()), Integer.valueOf(EnumC1373410lqN.SHARE_VIDEO.getNum()), Integer.valueOf(EnumC1373410lqN.SHARE_PHOTO_VIDEO.getNum()), Integer.valueOf(EnumC1373410lqN.SHARE_STORY.getNum()));

    public static boolean LIZ(int i) {
        int iIntValue = ((Number) LIZ.getValue()).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        return true;
                    }
                } else if (!LIZIZ.contains(Integer.valueOf(i))) {
                    return true;
                }
            } else {
                return LIZIZ.contains(Integer.valueOf(i));
            }
        }
        return false;
    }
}
