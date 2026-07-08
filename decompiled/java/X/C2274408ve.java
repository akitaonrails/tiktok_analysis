package X;

import com.ss.android.ugc.aweme.tools.music.ab.AIMusicFrameCountConfig;

/* JADX INFO: renamed from: X.08ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2274408ve {
    public static int[] LIZ(int i, int i2, int i3) {
        if (i3 <= 3 && !((AIMusicFrameCountConfig) C2275008vk.LIZIZ.getValue()).enable) {
            return null;
        }
        int i4 = i3 - 1;
        int i5 = (i2 - i) / i4;
        int[] iArr = new int[i3];
        iArr[0] = i;
        iArr[i4] = i2;
        int i6 = i3 - 2;
        int i7 = 1;
        if (1 <= i6) {
            while (true) {
                int i8 = i7 * i5;
                if (i8 > i2) {
                    i8 = i2;
                }
                iArr[i7] = i8 + i;
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        return iArr;
    }
}
