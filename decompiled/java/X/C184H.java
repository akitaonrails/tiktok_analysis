package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.184H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184H {
    public static final /* synthetic */ C184H LIZ = new C184H();

    public static int LIZ(int i) {
        if (i == 1) {
            return 2;
        }
        int i2 = 3;
        if (i != 2) {
            if (i == 3) {
                return 4;
            }
            if (i != 4) {
                i2 = 0;
                if (i != 5) {
                    if (i >= 100) {
                        return -1;
                    }
                    return LSPassThroughRecordSizeConfig.DEFAULT;
                }
            } else {
                return 1;
            }
        }
        return i2;
    }
}
