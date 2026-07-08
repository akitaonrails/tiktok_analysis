package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0OJS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJS {
    public static final C0OJS LIZ = new C0OJS();
    public static final Map<String, BulletinStyleStruct> LIZIZ = new LinkedHashMap();

    public static void LIZ(BulletinStyleStruct bulletinStyleStruct) {
        String str;
        if (bulletinStyleStruct != null && (str = bulletinStyleStruct.styleId) != null) {
            LIZIZ.put(str, bulletinStyleStruct);
            LIZ.getClass();
            IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
            if (iBulletinBoardDataService != null) {
                iBulletinBoardDataService.LJIIL(bulletinStyleStruct);
            }
        }
    }
}
