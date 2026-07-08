package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: renamed from: X.01GD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01GD {
    public final Context LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C11NJ LIZLLL;

    public final void LIZ(final int i, final User user) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).anchorOrModeratorMuteGuest(this.LIZJ, this.LIZIZ, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), Long.valueOf(user.getId()), i, null, null).LJIILIIL(new C0UO0()), this.LIZLLL, new C09JN() { // from class: X.01GC
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                GuestMicCameraManageResponse.ResponseData responseData;
                C1C7U.LIZ("VoiceManager@67c9.manageGuestAudio$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (GuestMicCameraManageResponse.ResponseData) baseResponse.data) != null && responseData.ratelimit) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C01GD c01gd = this.LL;
                    User user2 = user;
                    int i2 = (int) ((GuestMicCameraManageResponse.ResponseData) baseResponse.data).expirationTime;
                    c01gd.getClass();
                    C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755578, i2, C0KVU.LIZ(user2), Integer.valueOf(i2)));
                } else {
                    C01GD c01gd2 = this.LL;
                    int i3 = i;
                    User user3 = user;
                    c01gd2.getClass();
                    if (i3 != 0) {
                        if (i3 == 2) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843476, C0KVU.LIZ(user3)));
                        }
                    } else {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843535, C0KVU.LIZ(user3)));
                    }
                }
                C1C7U.LIZIZ("VoiceManager@67c9.manageGuestAudio$1");
            }
        }, new C515801zg(this, user, 48), null, null, 56);
    }

    public C01GD(Context context, long j, long j2, C11NJ c11nj) {
        this.LIZ = context;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c11nj;
    }
}
