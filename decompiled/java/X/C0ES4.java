package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0ES4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ES4 {
    public static final int LIZIZ = C366700EZg.LIZ(44.0d);
    public static final int LIZJ;
    public static final int LIZLLL;
    public final Context LIZ;

    static {
        int iLIZIZ = C0EJA.LJI() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74)) : C366700EZg.LIZ(62.0d);
        LIZJ = iLIZIZ;
        LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(330)) - iLIZIZ;
    }

    public final int LIZ() {
        int i;
        int i2;
        if (!((Boolean) C0B9A.LIZ.getValue()).booleanValue()) {
            return (int) (ScreenUtils.getFullScreenHeight(this.LIZ) * 0.58f);
        }
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(this.LIZ);
        if (((Boolean) C266990AdF.LIZ.getValue()).booleanValue()) {
            i = LIZIZ + ((int) (fullScreenHeight * 0.4f));
            i2 = LIZJ;
        } else {
            i = LIZIZ + ((int) (fullScreenHeight * 0.5f));
            i2 = LIZJ;
        }
        return i + i2;
    }

    public C0ES4(Context context) {
        this.LIZ = context;
    }
}
