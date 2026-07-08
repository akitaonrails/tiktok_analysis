package X;

import java.util.List;

/* JADX INFO: renamed from: X.0ZTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900380ZTw {
    public static C900390ZTx LIZ(String str, int[] iArr, int i, List list, boolean z, int i2) {
        C0YM2 c0ym2;
        boolean z2 = z;
        List list2 = list;
        if ((i2 & 8) != 0) {
            list2 = C13BV.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        } else {
            c0ym2 = null;
        }
        C0YNW c0ynw = (C0YNW) C0YUC.LIZ(c0ym2);
        c0ynw.getClass();
        return new C900390ZTx(str, iArr, i, list2, c0ynw.LIZ, z2);
    }
}
