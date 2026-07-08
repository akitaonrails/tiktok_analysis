package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.model.message.PartnershipAnchorMessage;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01SI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01SI extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH {
    public final Context LLILLL;
    public boolean LLILZIL;
    public int LLILZLL;
    public Room LLJ;
    public C015T LLJI;
    public C01SK LLJIJIL;
    public boolean LLILZ = true;
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public final C515301zb LLJILJIL = new C515301zb(this, 1);

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "game_partnership";
    }

    public final Map<String, String> LJJ() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("live_traffic_source", this.LLILZIL ? "ad" : "normal");
        pairArr[1] = new Pair("is_host", "1");
        Room room = this.LLJ;
        pairArr[2] = new Pair("content_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        pairArr[3] = new Pair("is_landscape", CardStruct.IStatusCode.DEFAULT);
        pairArr[4] = new Pair("live_type", "video_live");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(Integer.valueOf(C001A.PARTNERSHIP_GAME_OFFLINE_MESSAGE.getIntType()), Integer.valueOf(C001A.PARTNERSHIP_PUNISH_MESSAGE.getIntType()), Integer.valueOf(C001A.PARTNERSHIP_ANCHOR_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDispose() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new AnonymousClass1818(new InterfaceC752610Tff() { // from class: X.01SJ
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                String str2;
                MutableLiveData<Boolean> mutableLiveData;
                Room room = this.LIZ.LLJ;
                if (room != null && C01SL.LIZ(room)) {
                    C01SI c01si = this.LIZ;
                    String str3 = c01si.LLIZLLLIL;
                    if (str3 != null && str3.length() != 0) {
                        C760370TsB c760370TsBLIZ = C0KYL.LIZ(c01si.LLIZLLLIL);
                        c760370TsBLIZ.LJIJJLI("bottom");
                        c760370TsBLIZ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), EnumC760350Ts9.DP);
                        c760370TsBLIZ.LJJII(c01si.LJJ());
                        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(C786410Ut5.N3(c01si.LLILLL), c760370TsBLIZ.LIZ().toString(), null);
                    } else if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
                        C01SI c01si2 = this.LIZ;
                        C01GU.LJI(c01si2.LLILLL, c01si2.LJJ());
                    }
                } else {
                    C766270U4b.LIZLLL(2131841778);
                }
                C01SI c01si3 = this.LIZ;
                c01si3.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
                c474500IjALIZ.LJJII("video_live", "live_type");
                IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) c01si3.LL;
                if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                    str2 = "icon";
                } else {
                    str2 = "add_partnership";
                }
                c474500IjALIZ.LJJII(str2, "btn_name");
                c474500IjALIZ.LJJII("host", "user_type");
                c474500IjALIZ.LJJII("live_detail", "page_name");
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LJJII(Integer.valueOf(c01si3.LLILZLL), "is_creator_code");
                c474500IjALIZ.LJJII(c01si3.LLIZ, "creator_code_type");
                c474500IjALIZ.LIZ();
            }
        });
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C015V.LJFF(this.LLJILJIL);
        Application application = (Application) C786410Ut5.N3(this.LLILLL);
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.LLJI);
        }
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C01SI(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        if (this.LLILZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
            c474500IjALIZ.LJJII("video_live", "live_type");
            c474500IjALIZ.LJJII("icon", "btn_name");
            c474500IjALIZ.LJJII("host", "user_type");
            c474500IjALIZ.LJJII("live_detail", "page_name");
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_grey");
            c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL), "is_creator_code");
            c474500IjALIZ.LJJII(this.LLIZ, "creator_code_type");
            c474500IjALIZ.LIZ();
            this.LLILZ = false;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        C01SK c01sk;
        Integer num;
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData2;
        if (iMessage == null) {
            return;
        }
        if (iMessage instanceof PartnershipGameOfflineMessage) {
            List<PartnershipGameOfflineMessage.OfflineGameInfo> list = ((PartnershipGameOfflineMessage) iMessage).offlineGameList;
            if (!list.isEmpty()) {
                if (((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).taskListLen <= 0 && (slotViewModel = (IIconSlot.SlotViewModel) this.LL) != null && (mutableLiveData2 = slotViewModel.LLILZ) != null) {
                    mutableLiveData2.postValue(Boolean.FALSE);
                }
                C766270U4b.LJIIJJI(((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).toastText);
                C389001fE.LIZ("gamePartnershipPunished", null, System.currentTimeMillis(), false);
                return;
            }
            return;
        }
        if (iMessage instanceof PartnershipPunishMessage) {
            PunishEventInfo punishEventInfo = ((PartnershipPunishMessage) iMessage).punishInfo;
            if (punishEventInfo == null || punishEventInfo.punishTypeId == null || (num = punishEventInfo.punishTypeId) == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue != 25 && iIntValue != 26) {
                return;
            }
            IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) this.LL;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZ) != null) {
                mutableLiveData.postValue(Boolean.FALSE);
            }
            C389001fE.LIZ("gamePartnershipPunished", null, System.currentTimeMillis(), false);
            return;
        }
        if (!(iMessage instanceof PartnershipAnchorMessage) || ((PartnershipAnchorMessage) iMessage).changeMode != 1 || (c01sk = this.LLJIJIL) == null) {
            return;
        }
        c01sk.invoke();
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        IIconSlot.SlotViewModel slotViewModel;
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel2;
        this.LLILLJJLI = interfaceC21213717zz;
        Boolean bool = Boolean.TRUE;
        slotViewModel2.LLLFFI = bool;
        slotViewModel2.LLJIJIL.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.ei2));
        slotViewModel2.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.ely));
        slotViewModel2.LLJILJILJ.setValue(C497740JfY.LJIJI(2131841828));
        slotViewModel2.LLJILLL.setValue(C497740JfY.LJIJI(2131841779));
        slotViewModel2.LLILZ.setValue(bool);
        Room room = this.LLJ;
        if (room == null || !C01SL.LIZ(room)) {
            slotViewModel2.LLLIIII = 0.5f;
        }
        Room room2 = this.LLJ;
        if (room2 != null && C01SL.LIZ(room2)) {
            ViewModel viewModel2 = this.LL;
            if ((viewModel2 instanceof IIconSlot.SlotViewModel) && (slotViewModel = (IIconSlot.SlotViewModel) viewModel2) != null) {
                slotViewModel.LLJZIJLIL = 1;
            }
        }
        this.LLJI = new C015T();
        Application application = (Application) C786410Ut5.N3(this.LLILLL);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.LLJI);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        Object obj = map.get("param_room");
        Object obj2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        Object obj3 = map.get("param_enter_from_effect_ad_bool");
        if (obj3 instanceof Boolean) {
            obj2 = obj3;
        }
        this.LLILZIL = Intrinsics.LJFF(obj2, Boolean.TRUE);
        this.LLJ = room;
        this.LLJIJIL = new C01SK(room, this, interfaceC756140TlM);
        if (C781520UlC.LJIIL(room) && C01SL.LIZ(room)) {
            C01SK c01sk = this.LLJIJIL;
            if (c01sk != null) {
                c01sk.invoke();
                return;
            }
            return;
        }
        interfaceC756140TlM.LIZ(false);
    }
}
