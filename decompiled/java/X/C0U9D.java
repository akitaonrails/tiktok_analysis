package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U9D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9D {
    public static LiveEffect LIZ;

    public static void LIZJ() {
        LiveEffect liveEffect = LIZ;
        if (liveEffect != null) {
            liveEffect.LLJLILLLLZIIL(C0U9E.NORMAL);
        }
        LIZ = null;
    }

    public static boolean LIZIZ(LiveEffect liveEffect) {
        if (liveEffect.LJLIIL().length() > 0) {
            C767780U9w c767780U9w = C767780U9w.LIZ;
            if (!C767780U9w.LIZIZ(liveEffect) && !InterfaceC766480U4w.LJJIJ.LIZIZ().contains(liveEffect.getResourceId())) {
                long jLIZ = C158B.LIZ();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                if (jLIZ / j > liveEffect.LJJIIZ() && C158B.LIZ() / j < liveEffect.LLIIL()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static LiveEffect LIZ(List list, boolean z) {
        Object next;
        if (LIZ == null && z) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (LIZIZ((LiveEffect) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveEffect liveEffect = (LiveEffect) next;
            if (liveEffect != null) {
                liveEffect.LLJLILLLLZIIL(C0U9E.RECOMMEND_STICKER);
            }
            LIZ = liveEffect;
        } else {
            C767780U9w c767780U9w = C767780U9w.LIZ;
            if (C767780U9w.LIZIZ(LIZ)) {
                LIZJ();
            }
        }
        return LIZ;
    }
}
