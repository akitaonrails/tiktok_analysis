package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager;
import com.ss.android.ugc.aweme.ad.feed.utils.FeedBackDialogManagerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0cZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017150cZl implements IFeedBackDialogManager {
    public static final C1017150cZl LIZIZ = new C1017150cZl();
    public final /* synthetic */ IFeedBackDialogManager LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZJ(Context context, Aweme aweme) {
        this.LIZ.LIZJ(context, aweme);
    }

    public C1017150cZl() {
        IFeedBackDialogManager iFeedBackDialogManager;
        Object objLIZ = C04TD.LIZ(IFeedBackDialogManager.class, false);
        if (objLIZ != null) {
            iFeedBackDialogManager = (IFeedBackDialogManager) objLIZ;
        } else {
            if (C04TD.LJLLLLLL == null) {
                synchronized (IFeedBackDialogManager.class) {
                    if (C04TD.LJLLLLLL == null) {
                        C04TD.LJLLLLLL = new FeedBackDialogManagerService();
                    }
                }
            }
            iFeedBackDialogManager = C04TD.LJLLLLLL;
        }
        this.LIZ = iFeedBackDialogManager;
    }
}
