package Y;

import X.C09JN;
import X.C1183570guB;
import X.C1183620guG;
import X.C1188750h2X;
import X.C1C7U;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AfS37S1000000_18 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS37S1000000_18(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS37S1000000_18 afS37S1000000_18, Object obj) {
        String curUserId;
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$4");
        List<CollectionDetail> list = ((CollectionListResponse) obj).items;
        if (list != null) {
            String str = afS37S1000000_18.s0;
            for (CollectionDetail collectionDetail : list) {
                if (str == null) {
                    curUserId = collectionDetail.uid;
                    if (curUserId == null) {
                        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                        if (accountUserServiceLJIIJ != null) {
                            curUserId = accountUserServiceLJIIJ.getCurUserId();
                        } else {
                            curUserId = null;
                        }
                    }
                } else {
                    curUserId = str;
                }
                collectionDetail.uid = curUserId;
                VideoCollectionListViewModel.LLIZLLLIL.put(String.valueOf(collectionDetail.id), collectionDetail);
            }
        }
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$4");
    }

    public static final void accept$1(AfS37S1000000_18 afS37S1000000_18, Object obj) {
        C1C7U.LIZ("PoiSlashPreload@10e1.preload$observable$2");
        if (C1183570guB.LIZ()) {
            C1188750h2X.LIZ.getClass();
            C1183620guG c1183620guGLIZ = C1188750h2X.LJII.LIZ(afS37S1000000_18.s0);
            if (c1183620guGLIZ != null) {
                c1183620guGLIZ.LIZIZ = Boolean.FALSE;
            }
        }
        C1C7U.LIZIZ("PoiSlashPreload@10e1.preload$observable$2");
    }
}
