package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveUserPostHighlightSetting;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.0xqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834600xqE {
    public static int LIZ(C1833730xop c1833730xop) {
        float fLIZIZ;
        if (LiveUserPostHighlightSetting.INSTANCE.getValue()) {
            List<C1834580xqC> list = c1833730xop.LLILLL;
            if ((list instanceof Collection) && list.isEmpty()) {
                fLIZIZ = C497740JfY.LIZIZ(95.0f);
            } else {
                for (C1834580xqC c1834580xqC : list) {
                    if (c1834580xqC.LLILZLL.length() > 0 && c1834580xqC.LLJJJ > 0) {
                        fLIZIZ = C497740JfY.LIZIZ(105.0f);
                        break;
                    }
                }
                fLIZIZ = C497740JfY.LIZIZ(95.0f);
            }
        } else {
            fLIZIZ = C497740JfY.LIZIZ(95.0f);
        }
        return (int) fLIZIZ;
    }
}
