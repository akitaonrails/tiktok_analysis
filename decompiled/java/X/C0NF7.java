package X;

import android.text.TextUtils;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NF7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NF7 {
    public static final C0NF7 LIZ = new C0NF7();

    public static int LIZIZ(int i, String str) {
        boolean z;
        int i2;
        if (2 <= i && i < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 1080;
        } else {
            i2 = 0;
        }
        if (10 <= i) {
            if (i < 19) {
                i2 = 720;
            }
            if (20 <= i) {
                if (i < 29) {
                    i2 = 540;
                }
                if (30 <= i) {
                    if (i < 39) {
                        i2 = 480;
                    }
                    if (40 <= i) {
                        if (i < 49) {
                            i2 = 360;
                        }
                        if (100000 <= i && i < 1000000) {
                            int i3 = (i / 10000) % 10;
                            if (i3 == 2) {
                                return 480;
                            }
                            if (i3 == 3) {
                                return 540;
                            }
                            if (i3 == 4) {
                                return 720;
                            }
                            if (i3 == 5) {
                                return 1080;
                            }
                        }
                    }
                }
            }
        }
        if (i2 != 0 || TextUtils.isEmpty(str)) {
            return i2;
        }
        if (a0.LJJIIZI(str, "1080", false)) {
            return 1080;
        }
        if (a0.LJJIIZI(str, "720", false)) {
            return 720;
        }
        if (a0.LJJIIZI(str, "540", false)) {
            return 540;
        }
        if (a0.LJJIIZI(str, "480", false)) {
            return 480;
        }
        if (a0.LJJIIZI(str, "360", false)) {
            return 360;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a8 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:125:0x02a2, B:127:0x02a8, B:128:0x02ac, B:130:0x02b2), top: B:327:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b2 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:125:0x02a2, B:127:0x02a8, B:128:0x02ac, B:130:0x02b2), top: B:327:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0628  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r21, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r22, X.EnumC587720N3i r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NF7.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0N3i, boolean):java.util.ArrayList");
    }
}
