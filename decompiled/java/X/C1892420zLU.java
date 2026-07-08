package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892420zLU extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC756370Tlj {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(647));
    public Room LLILZ;
    public boolean LLILZIL;
    public IIconSlot.SlotViewModel LLILZLL;
    public InterfaceC1892740zM0 LLIZ;
    public long LLIZLLLIL;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "local_service";
    }

    public final String LJJ() {
        Long lValueOf;
        Room room = this.LLILZ;
        return (room == null || (lValueOf = Long.valueOf(room.ttlsLiveType)) == null) ? "" : lValueOf.longValue() == 1 ? "joined_author_live" : lValueOf.longValue() == 2 ? "merchants_live" : "";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        return Collections.singletonList(EnumC742820TBw.TTLS_LIVE_PRODUCT_NUMBER);
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new IIconSlot() { // from class: X.0zLV
            @Override // com.bytedance.android.live.slot.IIconSlot
            public final /* bridge */ /* synthetic */ Animator.AnimatorListener LIZ() {
                return null;
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final /* bridge */ /* synthetic */ void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                final C1892420zLU c1892420zLU = this.LIZ;
                return new InterfaceC752610Tff() { // from class: X.0zLT
                    @Override // X.InterfaceC752610Tff
                    public final void LIZ(View view, String str) throws JSONException {
                        String idStr;
                        String str2;
                        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
                        String string;
                        String idStr2;
                        String str3;
                        Room room = c1892420zLU.LLILZ;
                        if (room != null && (idStr2 = room.getIdStr()) != null) {
                            Context context = c1892420zLU.LLILLJJLI.getContext();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel = TtlsLiveConfigSettings.LIZ().shopBagConfig;
                            if (shopBagConfigModel == null || (str3 = shopBagConfigModel.anchorBagClickJumpUrl) == null) {
                                str3 = "aweme://roma_redirect/?spark_page=ttls_live_creator_showcase";
                            }
                            sbLIZ.append(str3);
                            sbLIZ.append("&room_id=");
                            sbLIZ.append(idStr2);
                            SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
                        }
                        Room room2 = c1892420zLU.LLILZ;
                        String str4 = "";
                        if (room2 == null || (idStr = room2.getIdStr()) == null) {
                            idStr = "";
                        }
                        Room room3 = c1892420zLU.LLILZ;
                        if (room3 != null && (interfaceC2262081DgMAuthor = room3.author()) != null && (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) != null) {
                            str4 = string;
                        }
                        String strLJJ = c1892420zLU.LJJ();
                        JSONObject jSONObject = new JSONObject();
                        if (c1892420zLU.LLILZIL) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("has_product", str2);
                        C1892640zLq.LIZ("ttls_live_shelf_icon_click", idStr, str4, strLJJ, "1", "room_page", jSONObject, new C1185050gwZ(PageFinder.via(c1892420zLU.LLILLJJLI.getContext())));
                        c1892420zLU.LJJI("StepClick", new JSONObject());
                    }
                };
            }
        };
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.T_T_L_S_LIVE_CONTROL_MESSAGE.getIntType()));
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // X.InterfaceC756370Tlj
    public final void LJIIIZ(InterfaceC1892740zM0 interfaceC1892740zM0) {
        if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            return;
        }
        this.LLIZ = interfaceC1892740zM0;
    }

    public final void LJJIFFI(String str) throws JSONException {
        InterfaceC497601wk viewModelScope;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        LJJI("StepRequestData", jSONObject);
        IIconSlot.SlotViewModel slotViewModel = this.LLILZLL;
        if (slotViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
            C23250099c.LIZLLL(viewModelScope, null, null, new C1892380zLQ(this, str, null), 3);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) throws JSONException {
        String idStr;
        String string;
        Object obj;
        Object obj2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Room room = this.LLILZ;
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLILZ;
        if (room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
            string = "";
        }
        String strLJJ = LJJ();
        JSONObject jSONObject = new JSONObject();
        String str2 = "1";
        if (this.LLILZIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("has_product", obj);
        if (Intrinsics.LJFF(str, "before_live_dialog_item")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_in_sheet", obj2);
        C1892640zLq.LIZ("ttls_live_shelf_icon_show", idStr, string, strLJJ, "1", "room_page", jSONObject, new C1185050gwZ(PageFinder.via(this.LLILLJJLI.getContext())));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("exposure_scene", str);
        if (!Intrinsics.LJFF(str, "before_live_dialog_item")) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_in_sheet", str2);
        LJJI("StepExposure", jSONObject2);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) throws JSONException {
        String idStr;
        long j;
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
                if (tTLSLiveControlMessage.actionType == 0) {
                    CommonMessageData commonMessageData = tTLSLiveControlMessage.baseMessage;
                    if (commonMessageData != null) {
                        j = commonMessageData.createTime;
                    } else {
                        j = 0;
                    }
                    this.LLIZLLLIL = j;
                    LJJIFFI("LS_ACTION_TYPE_LIVE_PRODUCT_NUMBER_CHANGE");
                }
                try {
                    C326830CrZ.LIZ("ttls_live_message", new JSONObject(((Gson) this.LLILLL.getValue()).LJIILL(iMessage)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2276471E8n.LIZIZ.LIZJ("ttls-live", e, "LSDuringLiveShopBagWidget", "onMessage===send js message error==");
                }
            }
        }
    }

    public final void LJJI(String str, JSONObject jSONObject) throws JSONException {
        String idStr;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        String string;
        Room room = this.LLILZ;
        String str2 = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        Room room2 = this.LLILZ;
        if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null && (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) != null) {
            str2 = string;
        }
        jSONObject.put("has_product", this.LLILZIL);
        C1892650zLr.LIZ("ttls_rd_live_anchor_shopping_bag_step_event", jSONObject, str, idStr, str2);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        Boolean boolValueOf;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        JSONObject jSONObject = new JSONObject();
        Room room = this.LLILZ;
        if (room != null) {
            boolValueOf = Boolean.valueOf(room.existedTtlsGoods);
        } else {
            boolValueOf = null;
        }
        jSONObject.put("existedTtlsGoods", boolValueOf);
        LJJI("StepSlotCreated", jSONObject);
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        Room room2 = this.LLILZ;
        if (room2 != null && room2.existedTtlsGoods) {
            slotViewModel.LLJZIJLIL = 1;
        }
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131857080));
        MutableLiveData<Drawable> mutableLiveData = slotViewModel.LLJ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_storefront_smile;
        mutableLiveData.setValue(new C20743516Fd(c419910GdJ.LIZ(interfaceC21213717zz.getContext())));
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJI;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_storefront_smile;
        mutableLiveData2.setValue(new C20743516Fd(c419910GdJ2.LIZ(interfaceC21213717zz.getContext())));
        slotViewModel.LLJIJIL.setValue(new TuxIconDrawable(interfaceC21213717zz.getContext(), R.raw.icon_storefront_smile));
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131857074));
        this.LLILZLL = slotViewModel;
        LJJIFFI("onSlotCreated");
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) throws JSONException {
        Room room;
        boolean z;
        Boolean boolValueOf;
        boolean z2;
        Object obj = map.get("param_room");
        Boolean boolValueOf2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILZ = room;
        boolean z3 = true;
        if (room != null && room.existedTtlsGoods) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        JSONObject jSONObject = new JSONObject();
        Room room2 = this.LLILZ;
        if (room2 != null) {
            boolValueOf = Boolean.valueOf(room2.existedTtlsGoods);
        } else {
            boolValueOf = null;
        }
        jSONObject.put("existedTtlsGoods", boolValueOf);
        Room room3 = this.LLILZ;
        if (room3 != null) {
            boolValueOf2 = Boolean.valueOf(room3.hasTtlsLivePermission);
        }
        jSONObject.put("hasTtlsLivePermission", boolValueOf2);
        Room room4 = this.LLILZ;
        if (room4 != null && (room4.existedTtlsGoods || room4.hasTtlsLivePermission)) {
            z2 = true;
        } else {
            z2 = false;
        }
        jSONObject.put("needShow", z2);
        LJJI("StepPrepareToShow", jSONObject);
        Room room5 = this.LLILZ;
        if (room5 == null || (!room5.existedTtlsGoods && !room5.hasTtlsLivePermission)) {
            z3 = false;
        }
        interfaceC756140TlM.LIZ(z3);
    }
}
