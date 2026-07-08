package X;

import com.ss.android.ugc.aweme.feed.ui.RecFriendDialogNUJSwipeUpControllerImpl;
import com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController;

/* JADX INFO: renamed from: X.0rSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589380rSi implements IRecFriendDialogNUJSwipeUpController {
    public static final C1589380rSi LIZIZ = new C1589380rSi();
    public final /* synthetic */ IRecFriendDialogNUJSwipeUpController LIZ;

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C1589380rSi() {
        IRecFriendDialogNUJSwipeUpController iRecFriendDialogNUJSwipeUpController;
        Object objLIZ = C04TD.LIZ(IRecFriendDialogNUJSwipeUpController.class, false);
        if (objLIZ != null) {
            iRecFriendDialogNUJSwipeUpController = (IRecFriendDialogNUJSwipeUpController) objLIZ;
        } else {
            if (C04TD.z0 == null) {
                synchronized (IRecFriendDialogNUJSwipeUpController.class) {
                    if (C04TD.z0 == null) {
                        C04TD.z0 = new RecFriendDialogNUJSwipeUpControllerImpl();
                    }
                }
            }
            iRecFriendDialogNUJSwipeUpController = C04TD.z0;
        }
        this.LIZ = iRecFriendDialogNUJSwipeUpController;
    }
}
