package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.116D, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116D {
    public static String LIZ = "";
    public static NewFaceStickerListBean LIZIZ;
    public static Future<NewFaceStickerListBean> LIZJ;
    public static StickerPropAwemeList LIZLLL;
    public static Future<StickerPropAwemeList> LJ;

    public static void LIZ() {
        LIZ = "";
        LIZIZ = null;
        LIZLLL = null;
        LJ = null;
        LIZJ = null;
    }

    public static StickerPropAwemeList LIZIZ() {
        if (LIZ.length() == 0) {
            return null;
        }
        try {
            StickerPropAwemeList stickerPropAwemeList = LIZLLL;
            if (stickerPropAwemeList != null) {
                return stickerPropAwemeList;
            }
            Future<StickerPropAwemeList> future = LJ;
            StickerPropAwemeList stickerPropAwemeList2 = future != null ? future.get() : null;
            LIZLLL = stickerPropAwemeList2;
            return stickerPropAwemeList2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
