package X;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.slide.LiveSlideUpGuideRefactorSetting;

/* JADX INFO: renamed from: X.0IQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466240IQc {
    public static final boolean LIZ = LiveSlideUpGuideRefactorSetting.INSTANCE.getValue();

    public static boolean LIZ() {
        C1305440k4k c1305440k4kLIZIZ;
        if (LIZ) {
            return false;
        }
        C466230IQb c466230IQbLIZJ = C466230IQb.LIZJ();
        c466230IQbLIZJ.getClass();
        Context contextLJII = C497740JfY.LJII();
        return (contextLJII == null || (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) == null || !c466230IQbLIZJ.LL || c466230IQbLIZJ.LLJJIII == null || c466230IQbLIZJ.LLIZ || !c1305440k4kLIZIZ.LJ(C466230IQb.LIZJ().LIZLLL())) ? false : true;
    }

    public static void LIZIZ() {
        if (LIZ) {
            C0IQV.LL.LIZLLL();
        } else {
            C466230IQb.LIZJ().LJIIJ();
        }
    }
}
