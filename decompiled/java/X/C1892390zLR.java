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
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892390zLR extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH, InterfaceC1141530foN {
    public IIconSlot.SlotViewModel LLILLL;
    public boolean LLILZ;
    public Integer LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(648));
    public AnonymousClass0956 LLIZ;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "local_service";
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new IIconSlot() { // from class: X.0zLW
            @Override // com.bytedance.android.live.slot.IIconSlot
            public final /* bridge */ /* synthetic */ Animator.AnimatorListener LIZ() {
                return null;
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final /* bridge */ /* synthetic */ void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                final C1892390zLR c1892390zLR = this.LIZ;
                return new InterfaceC752610Tff() { // from class: X.0zLS
                    @Override // X.InterfaceC752610Tff
                    public final void LIZ(View view, String str) throws JSONException {
                        String str2;
                        String curUserId;
                        String str3;
                        Context context = c1892390zLR.LLILLJJLI.getContext();
                        TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel = TtlsLiveConfigSettings.LIZ().shopBagConfig;
                        if (shopBagConfigModel == null || (str2 = shopBagConfigModel.anchorBagClickJumpUrl) == null) {
                            str2 = "aweme://roma_redirect/?spark_page=ttls_live_creator_showcase";
                        }
                        SmartRouter.buildRoute(context, str2).open();
                        IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
                        if (iAccountUtilsServiceLIZ == null || (curUserId = iAccountUtilsServiceLIZ.getCurUserId()) == null) {
                            curUserId = "";
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (c1892390zLR.LLILZ) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("has_product", str3);
                        C1892640zLq.LIZ("ttls_live_shelf_icon_click", "", curUserId, "", CardStruct.IStatusCode.DEFAULT, "pre_live_page", jSONObject, new C1185050gwZ(PageFinder.via(c1892390zLR.LLILLJJLI.getContext())));
                        c1892390zLR.LJJI("StepClick", new JSONObject());
                    }
                };
            }
        };
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("ttls_live_showcase_list_change", this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public final void LJJ(int i) {
        boolean z;
        MutableLiveData<String> mutableLiveData;
        String strValueOf;
        IIconSlot.SlotViewModel slotViewModel = this.LLILLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            if (i > 99) {
                strValueOf = "99+";
            } else if (i > 0) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "";
            }
            mutableLiveData.postValue(strValueOf);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = z;
        this.LLILZIL = Integer.valueOf(i);
    }

    public final void LJJIFFI(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        LJJI("StepRequestToggle", jSONObject);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1892320zLK(this, str, null), 3);
    }

    public final void LJJII(String str) throws JSONException {
        InterfaceC497601wk viewModelScope;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        LJJI("StepRequestProductNum", jSONObject);
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        IIconSlot.SlotViewModel slotViewModel = this.LLILLL;
        if (slotViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(slotViewModel)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(viewModelScope, null, null, new C1892310zLJ(this, str, null), 3);
        }
        this.LLIZ = anonymousClass0956LIZLLL;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Integer numValueOf;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttls_live_showcase_list_change")) {
            LJJIFFI("onReceiveJsEvent");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (numValueOf = Integer.valueOf(interfaceC1107590evd.getInt("selected_num"))) != null && numValueOf != null) {
                LJJ(numValueOf.intValue());
            } else {
                LJJII("onReceiveJsEvent");
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) throws JSONException {
        Object obj;
        String curUserId;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exposure_scene", str);
        String str2 = "1";
        if (Intrinsics.LJFF(str, "before_live_dialog_item")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_in_sheet", obj);
        LJJI("StepExposure", jSONObject);
        IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
        if (iAccountUtilsServiceLIZ == null || (curUserId = iAccountUtilsServiceLIZ.getCurUserId()) == null) {
            curUserId = "";
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this.LLILZ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("has_product", obj2);
        if (!Intrinsics.LJFF(str, "before_live_dialog_item")) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_in_sheet", str2);
        C1892640zLq.LIZ("ttls_live_shelf_icon_show", "", curUserId, "", CardStruct.IStatusCode.DEFAULT, "pre_live_page", jSONObject2, new C1185050gwZ(PageFinder.via(this.LLILLJJLI.getContext())));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // X.C01SH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892390zLR.LJIILLIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJJI(String str, JSONObject jSONObject) {
        String curUserId;
        IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
        if (iAccountUtilsServiceLIZ == null || (curUserId = iAccountUtilsServiceLIZ.getCurUserId()) == null) {
            curUserId = "";
        }
        jSONObject.put("product_num", this.LLILZIL);
        C1892650zLr.LIZ("ttls_rd_live_guide_shopping_bag_step_event", jSONObject, str, null, curUserId);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) throws JSONException {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        LJJI("StepSlotCreated", new JSONObject());
        this.LLILLL = slotViewModel;
        slotViewModel.LLILZ.setValue(Boolean.TRUE);
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131857080));
        MutableLiveData<Drawable> mutableLiveData = slotViewModel.LLJ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_storefront_smile;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, interfaceC21213717zz.getContext());
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        mutableLiveData.setValue(c419910GdJ.LIZ(interfaceC21213717zz.getContext()));
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJIJIL;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_storefront_smile;
        mutableLiveData2.setValue(c419910GdJ2.LIZ(interfaceC21213717zz.getContext()));
        slotViewModel.LLJILLL.setValue(interfaceC21213717zz.getContext().getString(2131857074));
        LJJII("onSlotCreated");
        LJJIFFI("onSlotCreated");
        C1548820qPI.LIZLLL("ttls_live_showcase_list_change", this);
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) throws JSONException {
        boolean zBooleanValue;
        Boolean bool;
        Object obj = map.get("param_create_info_ttls_live_permission");
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hasTtlsLivePermission", zBooleanValue);
        jSONObject.put("needShow", zBooleanValue);
        LJJI("StepPrepareToShow", jSONObject);
        interfaceC756140TlM.LIZ(zBooleanValue);
    }
}
