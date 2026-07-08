package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.01Hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C308901Hr implements InterfaceC919460a2C {
    public final long LIZ;
    public final long LIZIZ;
    public final C11NJ LIZJ;

    @Override // X.InterfaceC919460a2C
    public final void LIZ(Context context, LinkPlayerInfo linkPlayerInfo, int i) {
    }

    public C308901Hr(long j, long j2, C11NJ c11nj) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c11nj;
    }

    @Override // X.InterfaceC919460a2C
    public final void LIZIZ(final Context context, LinkPlayerInfo linkPlayerInfo, int i) {
        final User user;
        InterfaceC921620a5g interfaceC921620a5g;
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            final String strLIZIZ = null;
            if ((objLJIIIZ instanceof InterfaceC917530Zz5) && (interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ) != null) {
                strLIZIZ = interfaceC921620a5g.LIZIZ(user.getId());
            }
            if (i != 1) {
                if (i == 2) {
                    LIZJ(0, user, context);
                    C922800a7a.LIZ(0, 2, strLIZIZ, C920830a4P.LJI, "toast_show", false, user.getId());
                    return;
                }
                return;
            }
            if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                LIZJ(2, user, context);
                C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "panel_click", false, user.getId());
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843487, C0KVU.LIZ(user));
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843486));
            c782110Um9.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hs
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                    this.LIZ.LIZJ(2, user, context);
                    C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "click", false, user.getId());
                }
            });
            c782110Um9.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.01Ht
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
            C922800a7a.LIZ(0, 1, strLIZIZ, C920830a4P.LJI, "show", false, user.getId());
        }
    }

    public final void LIZJ(final int i, final User user, Context context) {
        C480460Ism.LIZ().getClass();
        this.LIZJ.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).anchorOrModeratorMuteGuest(this.LIZIZ, this.LIZ, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), Long.valueOf(user.getId()), i, null, Long.valueOf(UserService.getInstance().user().getCurrentUserId())).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.01Hq
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                GuestMicCameraManageResponse.ResponseData responseData;
                C1C7U.LIZ("VoiceChatModeratorMuteGuestManager@c530.manageGuestAudio$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (GuestMicCameraManageResponse.ResponseData) baseResponse.data) != null && responseData.ratelimit) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C308901Hr c308901Hr = this.LL;
                    User user2 = user;
                    int i2 = (int) ((GuestMicCameraManageResponse.ResponseData) baseResponse.data).expirationTime;
                    c308901Hr.getClass();
                    C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755578, i2, C0KVU.LIZ(user2), Integer.valueOf(i2)));
                } else {
                    C308901Hr c308901Hr2 = this.LL;
                    int i3 = i;
                    User user3 = user;
                    c308901Hr2.getClass();
                    if (i3 != 0) {
                        if (i3 == 2) {
                            if (!C01HE.LIZJ()) {
                                C01I3.LJ(2131843135, C0KVU.LIZ(user3));
                            } else {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843476, C0KVU.LIZ(user3)));
                            }
                        }
                    } else {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843535, C0KVU.LIZ(user3)));
                    }
                }
                C1C7U.LIZIZ("VoiceChatModeratorMuteGuestManager@c530.manageGuestAudio$1");
            }
        }, new C516701zp(this, user, context, 0)));
    }
}
