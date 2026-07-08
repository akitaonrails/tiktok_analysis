package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubSuperFanOnlyLiveNotifySettings;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$1$2$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {}, m = "invokeSuspend")
public final class C494050JZb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ C470590Icr<Object> LLILLJJLI;
    public final /* synthetic */ Room LLILLL;
    public final /* synthetic */ DataChannel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494050JZb(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C470590Icr<Object> c470590Icr, Room room, DataChannel dataChannel, InterfaceC1364105Vn<? super C494050JZb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = c470590Icr;
        this.LLILLL = room;
        this.LLILZ = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C494050JZb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        long id;
        InterfaceC2262081DgM currentUser;
        int i;
        C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
        C470590Icr<Object> c470590Icr = this.LLILLJJLI;
        Room room = this.LLILLL;
        DataChannel dataChannel = this.LLILZ;
        subOnlyLiveSettingDialogVM.getClass();
        if (c470590Icr != null && c470590Icr.statusCode == 0) {
            boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel);
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus != null && roomAuthStatus.chatSubOnly) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.chatSubOnly = false;
                }
                C494680Jac.LJIJI(false);
                if (zKw0) {
                    i = 2131856596;
                } else {
                    i = 2131844454;
                }
                C766270U4b.LIZLLL(i);
            }
            InterfaceC1106030et7.f146v7.LJFF(Boolean.TRUE);
            room.liveSubOnly = 1L;
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.SUB_ONLY);
            C494680Jac.LJIJJ(true);
            Map<String, String> mapLIZ = C0KPJ.df.LIZ();
            if (mapLIZ == null) {
                mapLIZ = new HashMap<>();
            }
            C493830JYf c493830JYfLIZ = C0JYR.LIZ(mapLIZ);
            C494680Jac.LJIJJLI(c493830JYfLIZ.LJ, c493830JYfLIZ.LJFF);
            if (!SubVipSubOnlyLiveSetting.INSTANCE.isEnable()) {
                C494680Jac.LJIL(true);
            }
            subOnlyLiveSettingDialogVM.setState(new C0JZX());
            if (dataChannel != null) {
                dataChannel.FQ2(BroadcastEnableSubOnlyLiveEvent.class);
            }
            Boolean boolValueOf = null;
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "switch_sub_only_live"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(room.getId()));
            RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
            if (roomAuthStatus3 != null) {
                boolValueOf = Boolean.valueOf(roomAuthStatus3.isEnableGift());
            }
            jSONObject.put("gift_permission", boolValueOf);
            jSONObject.put("live_sub_only", C494680Jac.LJIILJJIL(room));
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "anchor_center_response_room_info"));
            if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).isAccompanimentPlaying() || ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).isBGMPlaying().booleanValue()) {
                IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                Boolean bool = Boolean.FALSE;
                iEffectService.pauseAccompanimentPlay(bool);
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).pauseBGM(bool);
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844221));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_conflict_toast_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_take");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            c474500IjALIZ2.LJJII("switch_to_sub_only_live", "sub_only_live_type");
            c474500IjALIZ2.LJJII(Long.valueOf(room.getId()), "room_id");
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                id = currentUser.getId();
            } else {
                id = 0;
            }
            c474500IjALIZ2.LJJII(Long.valueOf(id), "anchor_id");
            c474500IjALIZ2.LIZ();
        } else {
            subOnlyLiveSettingDialogVM.setState(new C0JZY());
            C766270U4b.LIZLLL(2131842705);
        }
        if (LiveFansClubSuperFanOnlyLiveNotifySettings.INSTANCE.getValue()) {
            C389001fE.LIZ("fan-club-manage-online-page-refresh", null, System.currentTimeMillis(), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
