package X;

import com.ss.android.ugc.aweme.comment.likelist.LikeListServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.like.ILikeListService;

/* JADX INFO: renamed from: X.04jS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1179604jS implements ILikeListService {
    public static final C1179604jS LIZIZ = new C1179604jS();
    public final /* synthetic */ ILikeListService LIZ;

    @Override // com.ss.android.ugc.aweme.like.ILikeListService
    public final Object LIZ(long j, long j2, Aweme aweme, String str) {
        return this.LIZ.LIZ(j, j2, aweme, str);
    }

    public C1179604jS() {
        ILikeListService iLikeListService;
        Object objLIZ = C04TD.LIZ(ILikeListService.class, false);
        if (objLIZ != null) {
            iLikeListService = (ILikeListService) objLIZ;
        } else {
            if (C04TD.LLJILJIL == null) {
                synchronized (ILikeListService.class) {
                    if (C04TD.LLJILJIL == null) {
                        C04TD.LLJILJIL = new LikeListServiceImpl();
                    }
                }
            }
            iLikeListService = C04TD.LLJILJIL;
        }
        this.LIZ = iLikeListService;
    }
}
