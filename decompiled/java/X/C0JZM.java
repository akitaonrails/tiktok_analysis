package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.SubSplitStatus;

/* JADX INFO: renamed from: X.0JZM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JZM extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ C410401ig LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JZM(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C410401ig c410401ig, Context context, boolean z) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = c410401ig;
        this.LLILLL = context;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        SubSplitStatus subSplitStatus;
        int i;
        User owner;
        SubscribeInfo subscribeInfo;
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        Room room = this.LL.vQ2().LLILLJJLI;
        if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            subSplitStatus = subscribeInfo.subSplitStatus;
        } else {
            subSplitStatus = null;
        }
        boolean zPY1 = iFansClubService.pY1(subSplitStatus);
        if (this.LLILLJJLI.LLILLJJLI) {
            if (!C494680Jac.LJIILJJIL(this.LL.vQ2().LLILLJJLI)) {
                this.LL.setState(new C0JZP(this.LLILZ));
            } else {
                C782110Um9 c782110Um9 = new C782110Um9(this.LLILLL);
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131842234);
                if (zPY1) {
                    i = 2131856607;
                } else {
                    i = 2131842233;
                }
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(i));
                String strLJIJI = C497740JfY.LJIJI(2131842231);
                final SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
                final boolean z = this.LLILZ;
                c782110Um9.LJIILJJIL(strLJIJI, new InterfaceC743640TFa() { // from class: X.0JZL
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        String str;
                        long id;
                        liveDialog.dismiss();
                        final SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM2 = subOnlyLiveSettingDialogVM;
                        final boolean z2 = z;
                        subOnlyLiveSettingDialogVM2.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_use_music_click");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(subOnlyLiveSettingDialogVM2.vQ2().LL, "click_position");
                        if (z2) {
                            str = "turn_on";
                        } else {
                            str = "turn_off";
                        }
                        c474500IjALIZ.LJJII(str, "click_type");
                        c474500IjALIZ.LIZ();
                        C480460Ism.LIZ().getClass();
                        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C480460Ism.LIZLLL(RoomSwitchApi.class);
                        Room room2 = subOnlyLiveSettingDialogVM2.vQ2().LLILLJJLI;
                        if (room2 != null) {
                            id = room2.getId();
                        } else {
                            id = 0;
                        }
                        roomSwitchApi.updateSwitch(id, 12, z2, 0L).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.01id
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.onMusicLiveSwitch$1");
                                if (((BaseResponse) obj).statusCode == 0) {
                                    Room room3 = subOnlyLiveSettingDialogVM2.vQ2().LLILLJJLI;
                                    if (room3 != null) {
                                        room3.liveSubOnlyUseMusic = 1L;
                                    }
                                    C0KPJ.Ve.LIZJ(Boolean.TRUE);
                                    subOnlyLiveSettingDialogVM2.setState(new C410301if(z2));
                                } else {
                                    subOnlyLiveSettingDialogVM2.setState(new C410201ie(z2));
                                    C766270U4b.LIZLLL(2131842705);
                                }
                                C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.onMusicLiveSwitch$1");
                            }
                        }, new C09JN() { // from class: X.0JZO
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.onMusicLiveSwitch$2");
                                subOnlyLiveSettingDialogVM2.setState(new C0JZR(z2));
                                C766270U4b.LIZLLL(2131842705);
                                C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.onMusicLiveSwitch$2");
                            }
                        });
                        subOnlyLiveSettingDialogVM.yQ2(true);
                    }
                });
                String strLJIJI2 = C497740JfY.LJIJI(2131842232);
                final SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM2 = this.LL;
                c782110Um9.LJIIJJI(strLJIJI2, new InterfaceC743640TFa() { // from class: X.0JZQ
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                        subOnlyLiveSettingDialogVM2.setState(new C0JZS());
                        subOnlyLiveSettingDialogVM2.yQ2(false);
                    }
                });
                final SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM3 = this.LL;
                c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0JZN
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        Long lValueOf;
                        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM4 = subOnlyLiveSettingDialogVM3;
                        subOnlyLiveSettingDialogVM4.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_use_music_popup_show");
                        c474500IjALIZ.LJIL();
                        Room room2 = subOnlyLiveSettingDialogVM4.vQ2().LLILLJJLI;
                        if (room2 != null) {
                            lValueOf = Long.valueOf(room2.getOwnerUserId());
                        } else {
                            lValueOf = null;
                        }
                        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                        c474500IjALIZ.LJJII(subOnlyLiveSettingDialogVM4.vQ2().LL, "click_position");
                        c474500IjALIZ.LIZ();
                    }
                };
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
