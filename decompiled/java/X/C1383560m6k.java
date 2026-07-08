package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import java.util.List;

/* JADX INFO: renamed from: X.0m6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383560m6k {
    public static IDownloadService LIZIZ;
    public static final C1383560m6k LIZ = new C1383560m6k();
    public static Integer LIZJ = -1;

    public static final void LIZ(List<String> list, String str, String str2, AbstractC1383500m6e abstractC1383500m6e) {
        List<String> listSubList;
        Integer numValueOf = null;
        if (list.isEmpty()) {
            if (abstractC1383500m6e != null) {
                abstractC1383500m6e.LIZIZ(null, null, null);
                return;
            }
            return;
        }
        if (list.size() > 1) {
            listSubList = list.subList(1, list.size());
        } else {
            listSubList = C13BV.INSTANCE;
        }
        C1401800maA c1401800maA = new C1401800maA(abstractC1383500m6e, 0);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        IDownloadService downloadService = downloadServiceManager.getDownloadService();
        LIZIZ = downloadService;
        if (downloadService != null) {
            AbstractC2199801B7q abstractC2199801B7qWith = downloadService.with((String) ListProtector.get(list, 0));
            abstractC2199801B7qWith.LJIIIIZZ = listSubList;
            abstractC2199801B7qWith.LIZJ = str2;
            abstractC2199801B7qWith.LJ = str;
            abstractC2199801B7qWith.LJII = 3;
            abstractC2199801B7qWith.LJIJJ = 3;
            abstractC2199801B7qWith.LJIIJ = "duet_react_video";
            abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
            abstractC2199801B7qWith.LJIIL = c1401800maA;
            numValueOf = Integer.valueOf(abstractC2199801B7qWith.LIZJ());
        }
        LIZJ = numValueOf;
    }
}
