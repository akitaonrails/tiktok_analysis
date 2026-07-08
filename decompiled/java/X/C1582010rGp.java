package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;

/* JADX INFO: renamed from: X.0rGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582010rGp {
    public static final C1582010rGp LIZ = new C1582010rGp();

    public static boolean LIZ(IFeedFetchDataAbility iFeedFetchDataAbility, String str, String str2) {
        if (iFeedFetchDataAbility != null && !iFeedFetchDataAbility.LJJJJI()) {
            C2276411E8h.LIZIZ.LIZJ("feed", 5, "loadmore", "can't load more abort");
            return false;
        }
        MLCommonService.Companion.getClass();
        C0NAL.LIZ.onBeforeLoadMore(str);
        if (str2 != null) {
            if (iFeedFetchDataAbility == null) {
                return false;
            }
            return iFeedFetchDataAbility.EQ(str2);
        }
        if (iFeedFetchDataAbility == null) {
            return false;
        }
        return iFeedFetchDataAbility.LLLLL();
    }

    public static boolean LIZIZ(C1582010rGp c1582010rGp, IFeedFetchDataAbility iFeedFetchDataAbility, String str) {
        C1255920ims<?> c1255920imsKB1;
        c1582010rGp.getClass();
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        boolean zLJIILLIIL = false;
        if (awemeLLILZ != null) {
            if (iFeedFetchDataAbility != null && (c1255920imsKB1 = iFeedFetchDataAbility.KB1()) != null) {
                zLJIILLIIL = c1255920imsKB1.LJIILLIIL(awemeLLILZ);
            }
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" deleteItem :");
            sbLIZ.append(zLJIILLIIL);
            c2276411E8h.LIZJ("common_feed", 4, "IFeedFetchDataAbility", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zLJIILLIIL;
    }
}
