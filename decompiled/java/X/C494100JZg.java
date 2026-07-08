package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.SubSplitStatus;

/* JADX INFO: renamed from: X.0JZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494100JZg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C494220JZs LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C20743716Ff LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494100JZg(C494220JZs c494220JZs, Context context, C20743716Ff c20743716Ff, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(0);
        this.LL = c494220JZs;
        this.LLILLJJLI = context;
        this.LLILLL = c20743716Ff;
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        User owner;
        final C494220JZs c494220JZs = this.LL;
        Context context = this.LLILLJJLI;
        final C20743716Ff c20743716Ff = this.LLILLL;
        final ViewGroup viewGroup = this.LLILZ;
        final ViewGroup viewGroup2 = this.LLILZIL;
        c494220JZs.getClass();
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(c494220JZs.LIZJ);
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(zKw0 ? 2131856630 : 2131842845);
        c782110Um9.LJII(2131844226);
        c782110Um9.LJIILIIL(2131842841, new InterfaceC743640TFa() { // from class: X.0JZf
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                long id;
                liveDialog.dismiss();
                final C494220JZs c494220JZs2 = c494220JZs;
                final C20743716Ff c20743716Ff2 = c20743716Ff;
                final ViewGroup viewGroup3 = viewGroup;
                final ViewGroup viewGroup4 = viewGroup2;
                final DataChannel dataChannel = c494220JZs2.LIZJ;
                C480460Ism.LIZ().getClass();
                RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C480460Ism.LIZLLL(RoomSwitchApi.class);
                Room room = c494220JZs2.LIZIZ;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                C510380Jzw.LJIILJJIL(roomSwitchApi.updateSwitch(id, 10, true, 0L), EnumC510330Jzr.GENERAL, C494220JZs.class.getSimpleName(), "sub_only_live/switch/update", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0JZc
                    @Override // X.C09JN
                    public final void accept(Object obj) throws JSONException {
                        SubSplitStatus subSplitStatus;
                        boolean z;
                        Long lValueOf;
                        Boolean boolValueOf;
                        int i;
                        long id2;
                        InterfaceC2262081DgM currentUser;
                        RoomAuthStatus roomAuthStatus;
                        ViewGroup viewGroup5;
                        RoomAuthStatus roomAuthStatus2;
                        int i2;
                        RoomAuthStatus roomAuthStatus3;
                        User owner2;
                        SubscribeInfo subscribeInfo;
                        C1C7U.LIZ("SubOnlyLiveSettingController@9139.callUpdateBtnLiveSubOnlyApi$1");
                        Long lValueOf2 = null;
                        if (((BaseResponse) obj).statusCode == 0) {
                            IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
                            Room room2 = c494220JZs2.LIZIZ;
                            if (room2 != null && (owner2 = room2.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null) {
                                subSplitStatus = subscribeInfo.subSplitStatus;
                            } else {
                                subSplitStatus = null;
                            }
                            if (!iFansClubService.pY1(subSplitStatus) && !((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            Room room3 = c494220JZs2.LIZIZ;
                            if (room3 != null && (roomAuthStatus2 = room3.getRoomAuthStatus()) != null && roomAuthStatus2.chatSubOnly) {
                                Room room4 = c494220JZs2.LIZIZ;
                                if (room4 != null && (roomAuthStatus3 = room4.getRoomAuthStatus()) != null) {
                                    roomAuthStatus3.chatSubOnly = false;
                                }
                                C494680Jac.LJIJI(false);
                                if (z) {
                                    i2 = 2131856596;
                                } else {
                                    i2 = 2131844454;
                                }
                                C766270U4b.LIZLLL(i2);
                            }
                            InterfaceC1106030et7.f146v7.LJFF(Boolean.TRUE);
                            Room room5 = c494220JZs2.LIZIZ;
                            if (room5 != null) {
                                room5.liveSubOnly = 1L;
                            }
                            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
                            C0U3P.LIZLLL(C0U3Q.SUB_ONLY);
                            C20743716Ff c20743716Ff3 = c20743716Ff2;
                            if (c20743716Ff3 != null) {
                                c20743716Ff3.setChecked(true);
                            }
                            C494680Jac.LJIJJ(true);
                            C494680Jac.LJIL(true);
                            C494220JZs c494220JZs3 = c494220JZs2;
                            c494220JZs3.LIZIZ(c20743716Ff2, false, new C494130JZj(c494220JZs3));
                            ViewGroup viewGroup6 = viewGroup3;
                            if (viewGroup6 != null) {
                                C786410Ut5.LJLLLLLL(0, viewGroup6);
                            }
                            if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && (viewGroup5 = viewGroup4) != null) {
                                C500260Jjc.LLFFF(viewGroup5);
                            }
                            DataChannel dataChannel2 = dataChannel;
                            if (dataChannel2 != null) {
                                dataChannel2.FQ2(BroadcastEnableSubOnlyLiveEvent.class);
                            }
                            C389001fE.LIZ("switch_sub_only_live", null, System.currentTimeMillis(), false);
                            JSONObject jSONObject = new JSONObject();
                            C494220JZs c494220JZs4 = c494220JZs2;
                            Room room6 = c494220JZs4.LIZIZ;
                            if (room6 != null) {
                                lValueOf = Long.valueOf(room6.getId());
                            } else {
                                lValueOf = null;
                            }
                            jSONObject.put("room_id", String.valueOf(lValueOf));
                            Room room7 = c494220JZs4.LIZIZ;
                            if (room7 != null && (roomAuthStatus = room7.getRoomAuthStatus()) != null) {
                                boolValueOf = Boolean.valueOf(roomAuthStatus.isEnableGift());
                            } else {
                                boolValueOf = null;
                            }
                            jSONObject.put("gift_permission", boolValueOf);
                            jSONObject.put("live_sub_only", C494680Jac.LJIILJJIL(c494220JZs4.LIZIZ));
                            C389001fE.LIZ("anchor_center_response_room_info", jSONObject, System.currentTimeMillis(), false);
                            if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).isAccompanimentPlaying() || ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).isBGMPlaying().booleanValue()) {
                                IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                                Boolean bool = Boolean.FALSE;
                                iEffectService.pauseAccompanimentPlay(bool);
                                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).pauseBGM(bool);
                                if (z) {
                                    i = 2131856613;
                                } else {
                                    i = 2131844221;
                                }
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_conflict_toast_show");
                                c474500IjALIZ.LJIJJLI(dataChannel);
                                c474500IjALIZ.LIZ();
                            }
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_take");
                            c474500IjALIZ2.LJIJJLI(dataChannel);
                            c474500IjALIZ2.LJJII("switch_to_sub_only_live", "sub_only_live_type");
                            Room room8 = c494220JZs2.LIZIZ;
                            if (room8 != null) {
                                lValueOf2 = Long.valueOf(room8.getId());
                            }
                            c474500IjALIZ2.LJJII(lValueOf2, "room_id");
                            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                                id2 = currentUser.getId();
                            } else {
                                id2 = 0;
                            }
                            c474500IjALIZ2.LJJII(Long.valueOf(id2), "anchor_id");
                            c474500IjALIZ2.LIZ();
                        } else {
                            C20743716Ff c20743716Ff4 = c20743716Ff2;
                            if (c20743716Ff4 != null) {
                                c20743716Ff4.setChecked(false);
                            }
                            c494220JZs2.LIZIZ(c20743716Ff2, true, null);
                            C766270U4b.LIZLLL(2131842705);
                        }
                        C1C7U.LIZIZ("SubOnlyLiveSettingController@9139.callUpdateBtnLiveSubOnlyApi$1");
                    }
                }, new C09JN() { // from class: X.0JZk
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubOnlyLiveSettingController@9139.callUpdateBtnLiveSubOnlyApi$2");
                        C20743716Ff c20743716Ff3 = c20743716Ff2;
                        if (c20743716Ff3 != null) {
                            c20743716Ff3.setChecked(false);
                        }
                        c494220JZs2.LIZIZ(c20743716Ff2, true, null);
                        C766270U4b.LIZLLL(2131842705);
                        C1C7U.LIZIZ("SubOnlyLiveSettingController@9139.callUpdateBtnLiveSubOnlyApi$2");
                    }
                });
                C494220JZs c494220JZs3 = c494220JZs;
                c494220JZs3.LIZ(c494220JZs3.LIZJ, "open");
            }
        });
        c782110Um9.LJIIJ(2131844245, new InterfaceC743640TFa() { // from class: X.0JZl
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                C20743716Ff c20743716Ff2 = c20743716Ff;
                if (c20743716Ff2 != null) {
                    c20743716Ff2.setChecked(false);
                }
                c494220JZs.LIZIZ(c20743716Ff, true, null);
                liveDialog.dismiss();
                C494220JZs c494220JZs2 = c494220JZs;
                c494220JZs2.LIZ(c494220JZs2.LIZJ, "cancel");
            }
        });
        c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0JZm
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C20743716Ff c20743716Ff2 = c20743716Ff;
                if (c20743716Ff2 != null) {
                    c20743716Ff2.setChecked(false);
                }
                c494220JZs.LIZIZ(c20743716Ff, true, null);
            }
        };
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_popup_show");
        c474500IjALIZ.LJIJJLI(c494220JZs.LIZJ);
        c474500IjALIZ.LJJII(c494220JZs.LIZ, "show_entrance");
        c474500IjALIZ.LJJII(c494220JZs.LIZ, "click_position");
        Room room = c494220JZs.LIZIZ;
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getOwnerUserId()) : null, "anchor_id");
        Room room2 = c494220JZs.LIZIZ;
        c474500IjALIZ.LJJII(Integer.valueOf(((room2 == null || (owner = room2.getOwner()) == null || !owner.isAnchorHasSubQualification()) ? 0 : 1) ^ 1), "is_opt_in");
        c474500IjALIZ.LIZ();
        c494220JZs.LIZIZ(c20743716Ff, false, null);
        return Unit.LIZ;
    }
}
