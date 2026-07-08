package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.SelfFollowRelationSearchCell;

/* JADX INFO: renamed from: X.0iZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247350iZ3 implements C10EW {
    public final /* synthetic */ SelfFollowRelationSearchCell LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.C10EW
    public final C10EF LIZIZ() {
        return null;
    }

    @Override // X.C10EW
    public final void LIZJ() {
    }

    @Override // X.C10EW
    public final String LIZLLL() {
        return "";
    }

    public C1247350iZ3(User user, SelfFollowRelationSearchCell selfFollowRelationSearchCell) {
        this.LIZ = selfFollowRelationSearchCell;
        this.LIZIZ = user;
    }

    @Override // X.C10EW
    public final void LJ(int i, int i2) {
        if (i == 4) {
            this.LIZ.S5(i2);
            this.LIZIZ.setLivePushNotificationStatus(i2);
        }
    }
}
