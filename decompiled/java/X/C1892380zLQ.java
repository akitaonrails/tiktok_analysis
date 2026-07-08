package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewData;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSDuringLiveShopBagWidget$updateProductsAlertNumText$2", f = "LSDuringLiveShopBagWidget.kt", l = {238}, m = "invokeSuspend")
public final class C1892380zLQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1892420zLU LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892380zLQ(C1892420zLU c1892420zLU, String str, InterfaceC1364105Vn<? super C1892380zLQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892420zLU;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892380zLQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Integer numLJ;
        String str;
        Integer numLJ2;
        String str2;
        int iIntValue;
        boolean z2;
        int iIntValue2;
        boolean zBooleanValue;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        Integer num;
        Map<EnumC742820TBw, MutableLiveData<Object>> map;
        int iIntValue3;
        Integer num2;
        Integer num3;
        Object objLJI = obj;
        C1C7U.LIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1892370zLP c1892370zLP = new C1892370zLP(this.LLILLJJLI, null);
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c1892370zLP);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2");
                    return objLJFF;
                }
            }
            ProductOverviewResponse productOverviewResponse = (ProductOverviewResponse) objLJI;
            if (productOverviewResponse == null || productOverviewResponse.status_code != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1892420zLU c1892420zLU = this.LLILLJJLI;
                ProductOverviewData productOverviewData = productOverviewResponse.data;
                if (productOverviewData != null && (num3 = productOverviewData.productNum) != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1892420zLU.LLILZIL = z2;
                IIconSlot.SlotViewModel slotViewModel = this.LLILLJJLI.LLILZLL;
                if (slotViewModel != null && (map = slotViewModel.LLJJIJIIJIL) != null) {
                    MutableLiveData mutableLiveData2 = (MutableLiveData) ((ConcurrentHashMap) map).get(EnumC742820TBw.TTLS_LIVE_PRODUCT_NUMBER);
                    if (mutableLiveData2 != null) {
                        ProductOverviewData productOverviewData2 = productOverviewResponse.data;
                        if (productOverviewData2 != null && (num2 = productOverviewData2.productNum) != null) {
                            iIntValue3 = num2.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        mutableLiveData2.postValue(C2286608xc.LJ(iIntValue3));
                    }
                }
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                    C1892420zLU c1892420zLU2 = this.LLILLJJLI;
                    ProductOverviewData productOverviewData3 = productOverviewResponse.data;
                    if (productOverviewData3 != null && (num = productOverviewData3.productNum) != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    InterfaceC1892740zM0 interfaceC1892740zM0 = c1892420zLU2.LLIZ;
                    if (interfaceC1892740zM0 != null) {
                        EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
                        IIconSlot.SlotViewModel slotViewModel2 = c1892420zLU2.LLILZLL;
                        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZ) != null && (value = mutableLiveData.getValue()) != null) {
                            zBooleanValue = value.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        interfaceC1892740zM0.LIZ(new C1892750zM1("local_service", enumC756810TmR, zBooleanValue, iIntValue2, c1892420zLU2.LLIZLLLIL));
                    }
                }
            } else {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateProductsAlertNumText===network error===status_code=");
                if (productOverviewResponse == null) {
                    numLJ = null;
                } else {
                    numLJ = C2286608xc.LJ(productOverviewResponse.status_code);
                }
                sbLIZ.append(numLJ);
                sbLIZ.append("===msg=");
                if (productOverviewResponse == null) {
                    str = null;
                } else {
                    str = productOverviewResponse.message;
                }
                sbLIZ.append(str);
                c2276471E8n.LIZ("ttls-live", "LSDuringLiveShopBagWidget", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1892420zLU c1892420zLU3 = this.LLILLJJLI;
            JSONObject jSONObject = new JSONObject();
            String str3 = this.LLILLL;
            jSONObject.put("by_catch", 0);
            jSONObject.put("source", str3);
            if (productOverviewResponse != null) {
                numLJ2 = C2286608xc.LJ(productOverviewResponse.status_code);
            } else {
                numLJ2 = null;
            }
            jSONObject.put("response_status_code", numLJ2);
            if (productOverviewResponse != null) {
                str2 = productOverviewResponse.message;
            } else {
                str2 = null;
            }
            jSONObject.put("response_message", str2);
            c1892420zLU3.LJJI("StepRequestResponse", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1892420zLU c1892420zLU4 = this.LLILLJJLI;
            JSONObject jSONObject2 = new JSONObject();
            String str4 = this.LLILLL;
            jSONObject2.put("by_catch", 1);
            jSONObject2.put("source", str4);
            jSONObject2.put("catch_e_message", e.getMessage());
            c1892420zLU4.LJJI("StepRequestResponse", jSONObject2);
            C2276471E8n.LIZIZ.LIZJ("ttls-live", e, "LSDuringLiveShopBagWidget", "updateProductsAlertNumText===network error==");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
