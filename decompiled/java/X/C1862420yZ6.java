package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.personalization.TakoInteractMessageSignal;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862420yZ6 {
    public static final C1862420yZ6 LIZ = new C1862420yZ6();
    public static final IAccountService LIZIZ;
    public static String LIZJ;
    public static final HashMap<String, C1862630yZR> LIZLLL;

    static {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        LIZIZ = iAccountService;
        String curUserId = iAccountService.LJIIJ().getCurUserId();
        if (curUserId.length() == 0) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ = curUserId;
        LIZLLL = new HashMap<>();
    }

    public static void LIZ(String str, String str2, String str3) {
        if (!C20235814Fw.LIZ()) {
            return;
        }
        HashMap<String, C1862630yZR> map = LIZLLL;
        C1862630yZR c1862630yZR = map.get(LIZJ);
        if (c1862630yZR == null) {
            c1862630yZR = new C1862630yZR(null);
            map.put(LIZJ, c1862630yZR);
        }
        Map<String, LruCache<String, TakoInteractMessageSignal>> map2 = c1862630yZR.LIZ;
        LruCache<String, TakoInteractMessageSignal> lruCache = map2.get(str);
        if (lruCache == null) {
            lruCache = new LruCache<>(C20235814Fw.LIZIZ().takoInteractMessageCount);
            map2.put(str, lruCache);
        }
        LruCache<String, TakoInteractMessageSignal> lruCache2 = lruCache;
        TakoInteractMessageSignal takoInteractMessageSignal = lruCache2.get(str2);
        if (takoInteractMessageSignal == null) {
            takoInteractMessageSignal = new TakoInteractMessageSignal(str2, null, null, null, null, null, null, null);
            lruCache2.put(str2, takoInteractMessageSignal);
        }
        if (Intrinsics.LJFF(str3, EnumC1858730yT9.LIKE.getType())) {
            takoInteractMessageSignal.isLike = Boolean.TRUE;
            takoInteractMessageSignal.isDislike = null;
            return;
        }
        if (Intrinsics.LJFF(str3, EnumC1858730yT9.DISLIKE.getType())) {
            takoInteractMessageSignal.isDislike = Boolean.TRUE;
            takoInteractMessageSignal.isLike = null;
            return;
        }
        if (!Intrinsics.LJFF(str3, EnumC1858730yT9.CANCEL_LIKE.getType()) && !Intrinsics.LJFF(str3, EnumC1858730yT9.CANCEL_DISLIKE.getType())) {
            if (Intrinsics.LJFF(str3, EnumC1858730yT9.COPY.getType())) {
                takoInteractMessageSignal.isCopy = Boolean.TRUE;
                return;
            }
            if (Intrinsics.LJFF(str3, EnumC1858730yT9.SELECT_TEXT.getType())) {
                takoInteractMessageSignal.isSelectText = Boolean.TRUE;
                return;
            }
            if (Intrinsics.LJFF(str3, EnumC1858730yT9.DELETE.getType())) {
                takoInteractMessageSignal.isDelete = Boolean.TRUE;
                return;
            } else if (Intrinsics.LJFF(str3, EnumC1858730yT9.REPORT.getType())) {
                takoInteractMessageSignal.isReport = Boolean.TRUE;
                return;
            } else {
                if (!Intrinsics.LJFF(str3, EnumC1858730yT9.SHARE.getType())) {
                    return;
                }
                takoInteractMessageSignal.isShare = Boolean.TRUE;
                return;
            }
        }
        lruCache2.remove(str2);
    }
}
