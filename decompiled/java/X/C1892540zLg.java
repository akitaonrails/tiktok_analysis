package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892540zLg extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> implements InterfaceC1141530foN {
    public Room LLILLL;
    public long LLILZ;
    public AnonymousClass0956 LLILZIL;
    public IFrameSlot.SlotViewModel LLILZLL;
    public C1892570zLj LLIZ;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "local_service";
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        C1892570zLj c1892570zLj = this.LLIZ;
        if (c1892570zLj != null) {
            return c1892570zLj;
        }
        C1892570zLj c1892570zLj2 = new C1892570zLj(false, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR, new AwS572S0100000_28(this, 887));
        this.LLIZ = c1892570zLj2;
        return c1892570zLj2;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.T_T_L_S_LIVE_CONTROL_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C1892570zLj c1892570zLj = this.LLIZ;
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
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
    }

    public final void LJJ(long j) {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        if (j < this.LLILZ) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL = null;
        this.LLILZ = j;
        IFrameSlot.SlotViewModel slotViewModel = this.LLILZLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.setValue(new Pair<>(Boolean.FALSE, "local_service"));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttls_live_product_card_close") && (slotViewModel = this.LLILZLL) != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.postValue(new Pair<>(Boolean.FALSE, "local_service"));
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        String idStr;
        boolean zLJFF;
        boolean zLJFF2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel;
        InterfaceC497601wk viewModelScope;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        Pair<Boolean, String> value2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData3;
        Pair<Boolean, String> value3;
        Object c098200Yq;
        if (iMessage instanceof TTLSLiveControlMessage) {
            TTLSLiveControlMessage tTLSLiveControlMessage = (TTLSLiveControlMessage) iMessage;
            String str = tTLSLiveControlMessage.roomId;
            Room room = this.LLILLL;
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
                            if (i == 6) {
                                try {
                                    if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(new JSONObject(((TTLSLiveControlMessage) iMessage).extra), "punish_type"), "2")) {
                                        LJJ(this.LLILZ);
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
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source", "silenceUpdate");
                        jSONObject2.put("pinTime", "");
                        jSONObject2.put("lastPinedTime", this.LLILZ);
                        jSONObject2.put("product_id", "");
                        jSONObject2.put("extra", "");
                        IFrameSlot.SlotViewModel slotViewModel2 = this.LLILZLL;
                        if (slotViewModel2 != null && (mutableLiveData3 = slotViewModel2.LL) != null && (value3 = mutableLiveData3.getValue()) != null) {
                            zLJFF = Intrinsics.LJFF(value3.first, Boolean.TRUE);
                        } else {
                            zLJFF = false;
                        }
                        jSONObject2.put("byFilter", !zLJFF);
                        jSONObject2.put("silenceUpdate", 1);
                        IFrameSlot.SlotViewModel slotViewModel3 = this.LLILZLL;
                        if (slotViewModel3 != null && (mutableLiveData2 = slotViewModel3.LL) != null && (value2 = mutableLiveData2.getValue()) != null) {
                            zLJFF2 = Intrinsics.LJFF(value2.first, Boolean.TRUE);
                        } else {
                            zLJFF2 = false;
                        }
                        jSONObject2.put("isVisible", !zLJFF2);
                        LJJI("StepRequestData", jSONObject2);
                        IFrameSlot.SlotViewModel slotViewModel4 = this.LLILZLL;
                        if (slotViewModel4 != null && (mutableLiveData = slotViewModel4.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (slotViewModel = this.LLILZLL) != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
                            C23250099c.LIZLLL(viewModelScope, null, null, new C1892590zLl(this, null), 3);
                            return;
                        }
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
        Room room = this.LLILLL;
        String strLIZIZ = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLILLL;
        if (room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
            string = "";
        }
        C1892570zLj c1892570zLj = this.LLIZ;
        if (c1892570zLj != null) {
            strLIZIZ = c1892570zLj.LIZIZ();
        }
        jSONObject.put("current_product_id", strLIZIZ);
        C1892650zLr.LIZ("ttls_rd_live_anchor_pin_card_step_event", jSONObject, str, idStr, string);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LJJI("StepSlotCreated", new JSONObject());
        this.LLILZLL = slotViewModel;
        LJJIFFI(1L, null, null, "onSlotCreated");
        C1548820qPI.LIZLLL("ttls_live_product_card_close", this);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) throws JSONException {
        Room room;
        Boolean boolValueOf;
        boolean z;
        Object obj = map.get("param_room");
        Boolean boolValueOf2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILLL = room;
        JSONObject jSONObject = new JSONObject();
        Room room2 = this.LLILLL;
        if (room2 != null) {
            boolValueOf = Boolean.valueOf(room2.existedTtlsGoods);
        } else {
            boolValueOf = null;
        }
        jSONObject.put("existedTtlsGoods", boolValueOf);
        Room room3 = this.LLILLL;
        if (room3 != null) {
            boolValueOf2 = Boolean.valueOf(room3.hasTtlsLivePermission);
        }
        jSONObject.put("hasTtlsLivePermission", boolValueOf2);
        Room room4 = this.LLILLL;
        boolean z2 = true;
        if (room4 != null && (room4.existedTtlsGoods || room4.hasTtlsLivePermission)) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("needShow", z);
        LJJI("StepPrepareToShow", jSONObject);
        Room room5 = this.LLILLL;
        if (room5 == null || (!room5.existedTtlsGoods && !room5.hasTtlsLivePermission)) {
            z2 = false;
        }
        interfaceC756140TlM.LIZ(z2);
    }

    public final void LJJIFFI(long j, String str, String str2, String str3) throws JSONException {
        String str4;
        boolean z;
        InterfaceC497601wk viewModelScope;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str3);
        jSONObject.put("pinTime", j);
        jSONObject.put("lastPinedTime", this.LLILZ);
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
        if (j < this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("byFilter", z);
        LJJI("StepRequestData", jSONObject);
        if (j < this.LLILZ) {
            return;
        }
        this.LLILZ = j;
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        IFrameSlot.SlotViewModel slotViewModel = this.LLILZLL;
        if (slotViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(viewModelScope, null, null, new C1892530zLf(this, str, str2, str3, j, null), 3);
        }
        this.LLILZIL = anonymousClass0956LIZLLL;
    }
}
