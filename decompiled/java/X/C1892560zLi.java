package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892560zLi extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> implements InterfaceC1141530foN {
    public Room LLILZ;
    public long LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public IFrameSlot.SlotViewModel LLIZ;
    public C1892570zLj LLIZLLLIL;
    public final /* synthetic */ C1892620zLo LLILLL = new C1892620zLo();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(688));

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "local_service";
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        C1892570zLj c1892570zLj = this.LLIZLLLIL;
        if (c1892570zLj != null) {
            return c1892570zLj;
        }
        C1892570zLj c1892570zLj2 = new C1892570zLj(true, EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR, new AwS572S0100000_28(this, 980));
        this.LLIZLLLIL = c1892570zLj2;
        return c1892570zLj2;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.T_T_L_S_LIVE_CONTROL_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C1892570zLj c1892570zLj = this.LLIZLLLIL;
        if (c1892570zLj != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1892570zLj.LLILZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            c1892570zLj.LLILZ = null;
        }
        C1548820qPI.LJIIIIZZ("ttls_live_product_card_close", this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
    }

    public final void LJJ(long j) {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        if (j < this.LLILZIL) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = null;
        this.LLILZIL = j;
        IFrameSlot.SlotViewModel slotViewModel = this.LLIZ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.setValue(new Pair<>(Boolean.FALSE, "local_service"));
        }
        C1706660uVs.LIZ();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttls_live_product_card_close")) {
            C742170T9j.LIZ(new AwS572S0100000_28(this, 981));
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        String idStr;
        boolean zLJFF;
        boolean zLJFF2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        int iIntValue;
        InterfaceC497601wk viewModelScope;
        Integer num;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        Pair<Boolean, String> value2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData3;
        Pair<Boolean, String> value3;
        Object c098200Yq;
        if (iMessage instanceof TTLSLiveControlMessage) {
            TTLSLiveControlMessage tTLSLiveControlMessage = (TTLSLiveControlMessage) iMessage;
            String str = tTLSLiveControlMessage.roomId;
            Room room = this.LLILZ;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            if (Intrinsics.LJFF(str, idStr)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_type", tTLSLiveControlMessage.actionType);
                LJJI("StepReceiveLiveMessage", jSONObject);
                int i = tTLSLiveControlMessage.actionType;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i == 7) {
                                    LJJIFFI(this.LLILZIL + 1, null, null, "setRoomBannedState");
                                    return;
                                }
                                return;
                            }
                            try {
                                if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(new JSONObject(((TTLSLiveControlMessage) iMessage).extra), "punish_type"), "2")) {
                                    LJJ(this.LLILZIL);
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m1boximpl(c098200Yq);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source", "silenceUpdate");
                        jSONObject2.put("pinTime", "");
                        jSONObject2.put("lastPinedTime", this.LLILZIL);
                        jSONObject2.put("product_id", "");
                        jSONObject2.put("extra", "");
                        IFrameSlot.SlotViewModel slotViewModel = this.LLIZ;
                        if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LL) != null && (value3 = mutableLiveData3.getValue()) != null) {
                            zLJFF = Intrinsics.LJFF(value3.first, Boolean.TRUE);
                        } else {
                            zLJFF = false;
                        }
                        jSONObject2.put("byFilter", !zLJFF);
                        jSONObject2.put("silenceUpdate", 1);
                        IFrameSlot.SlotViewModel slotViewModel2 = this.LLIZ;
                        if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LL) != null && (value2 = mutableLiveData2.getValue()) != null) {
                            zLJFF2 = Intrinsics.LJFF(value2.first, Boolean.TRUE);
                        } else {
                            zLJFF2 = false;
                        }
                        jSONObject2.put("isVisible", !zLJFF2);
                        LJJI("StepRequestData", jSONObject2);
                        IFrameSlot.SlotViewModel slotViewModel3 = this.LLIZ;
                        if (slotViewModel3 == null || (mutableLiveData = slotViewModel3.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
                            return;
                        }
                        Random random = (Random) this.LLJ.getValue();
                        TtlsLiveConfigSettings.PopCardConfigModel popCardConfigModel = TtlsLiveConfigSettings.LIZ().popCardConfig;
                        if (popCardConfigModel != null && (num = popCardConfigModel.requestDelayRange) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = LSPassThroughRecordSizeConfig.DEFAULT;
                        }
                        long jNextInt = random.nextInt(iIntValue);
                        IFrameSlot.SlotViewModel slotViewModel4 = this.LLIZ;
                        if (slotViewModel4 == null || (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel4)) == null) {
                            return;
                        }
                        C23250099c.LIZLLL(viewModelScope, null, null, new C1892580zLk(jNextInt, this, null), 3);
                        return;
                    }
                    LJJ(tTLSLiveControlMessage.productUnpinTime);
                    return;
                }
                LJJIFFI(tTLSLiveControlMessage.productPinTime, tTLSLiveControlMessage.productId, tTLSLiveControlMessage.extra, "LS_ACTION_TYPE_SET_POP_PRODUCT");
            }
        }
    }

    public final void LJJI(String str, JSONObject jSONObject) throws JSONException {
        String idStr;
        String string;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Room room = this.LLILZ;
        String strLIZIZ = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLILZ;
        if (room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
            string = "";
        }
        C1892570zLj c1892570zLj = this.LLIZLLLIL;
        if (c1892570zLj != null) {
            strLIZIZ = c1892570zLj.LIZIZ();
        }
        jSONObject.put("current_product_id", strLIZIZ);
        C1892660zLs.LIZ("ttls_rd_live_audience_pin_card_step_event", jSONObject, str, idStr, string);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        String string;
        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LJJI("StepSlotCreated", new JSONObject());
        this.LLIZ = slotViewModel;
        Room room = this.LLILZ;
        if (room != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderLIZ = C520160Kac.LIZ(interfaceC21213717zz.getContext());
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("ttls_room_id", room.getIdStr());
            InterfaceC2262081DgM interfaceC2262081DgMAuthor = room.author();
            if (interfaceC2262081DgMAuthor == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
                string = "";
            }
            bcmParams.put("ttls_live_author_id", string);
            btmSDK.setBcmPageParams(pageFinderLIZ, bcmParams, Boolean.FALSE);
        }
        LJJIFFI(1L, null, null, "onSlotCreated");
        C1548820qPI.LIZLLL("ttls_live_product_card_close", this);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        Object obj = map.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        boolean z = false;
        if (room == null) {
            interfaceC756140TlM.LIZ(false);
            return;
        }
        this.LLILZ = room;
        this.LLILLL.LIZIZ(map);
        Room room2 = this.LLILZ;
        if (room2 != null && (room2.existedTtlsGoods || room2.hasTtlsLivePermission)) {
            z = true;
        }
        interfaceC756140TlM.LIZ(z);
    }

    public final void LJJIFFI(long j, String str, String str2, String str3) throws JSONException {
        String str4;
        boolean z;
        int iIntValue;
        InterfaceC497601wk viewModelScope;
        Integer num;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str3);
        jSONObject.put("pinTime", j);
        jSONObject.put("lastPinedTime", this.LLILZIL);
        String str5 = "";
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        jSONObject.put("product_id", str4);
        if (str2 != null) {
            str5 = str2;
        }
        jSONObject.put("extra", str5);
        if (j < this.LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("byFilter", z);
        jSONObject.put("silenceUpdate", CardStruct.IStatusCode.DEFAULT);
        LJJI("StepRequestData", jSONObject);
        if (j < this.LLILZIL) {
            return;
        }
        this.LLILZIL = j;
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Random random = (Random) this.LLJ.getValue();
        TtlsLiveConfigSettings.PopCardConfigModel popCardConfigModel = TtlsLiveConfigSettings.LIZ().popCardConfig;
        if (popCardConfigModel != null && (num = popCardConfigModel.requestDelayRange) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        long jNextInt = random.nextInt(iIntValue);
        IFrameSlot.SlotViewModel slotViewModel = this.LLIZ;
        if (slotViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(viewModelScope, null, null, new C1892550zLh(this, jNextInt, str, str2, str3, j, null), 3);
        }
        this.LLILZLL = anonymousClass0956LIZLLL;
    }
}
