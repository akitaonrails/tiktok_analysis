package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.livesetting.pcs.TTLivePcsEventInterceptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.google.gson.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SMBSetupInfoResponse;
import webcast.api.sub.UpdateSMBSetupInfoRequest;

/* JADX INFO: renamed from: X.1ERM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERM extends C09AY implements Function0<C518540KVg> {
    public C1ERM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0KVg] */
    @Override // kotlin.jvm.functions.Function0
    public final C518540KVg invoke() {
        return new InterfaceC1103460eoy() { // from class: X.0KVg
            @Override // X.InterfaceC1103460eoy
            public final void LIZIZ() {
                List<InterfaceC518600KVm> list = C518550KVh.LIZ;
                if (TTLivePcsEventInterceptSetting.INSTANCE.enable()) {
                    C20441214yg.LIZIZ("TTLivePcsEventInterceptor", "TTLivePcsEventInterceptor started");
                    ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).iL1(C518550KVh.LIZIZ);
                }
            }

            @Override // X.InterfaceC1103460eoy
            public final C388001f4 LIZJ() {
                return new C388001f4();
            }

            @Override // X.InterfaceC1103460eoy
            public final void LIZ() {
            }

            @Override // X.InterfaceC1103460eoy
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1103460eoy
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1103460eoy
            public final void LJII(Map<String, ? extends Object> map) {
                Object obj;
                String str;
                if (map != null) {
                    obj = map.get("source");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = "creator_tools_page";
                }
                C480460Ism.LIZ().getClass();
                C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getSubscribeInfo(true, UserService.getInstance().user().getCurrentUser().getSecUid(), true, str, 0).LJIILIIL(new C0UO0()), str, "/sub/privilege/get_sub_info/", null, 12).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00ph
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        T t = ((BaseResponse) obj2).data;
                        if (t != null) {
                            HashMap<String, n> map2 = C199200pi.LIZ;
                            map2.clear();
                            map2.put(String.valueOf(UserService.getInstance().user().getCurrentUserId()), t);
                        }
                        return Unit.LIZ;
                    }
                }).LJJLJ();
            }

            @Override // X.InterfaceC1103460eoy
            public final boolean LJI(String str, String str2) {
                if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
                    C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
                    if (C1103520ep4.LIZJ(str2, str) == null) {
                        return true;
                    }
                    return false;
                }
                if (C518520KVe.LIZIZ.LIZIZ(str2, str) == null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1103460eoy
            public final C11NZ<C470590Icr<SMBSetupInfoResponse.ResponseData>> getSMBOneStopSetupState(String str, boolean z) {
                C480460Ism.LIZ().getClass();
                return C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getSMBOneStopSetupState(str, z), null, "/sub/upsell/one_stop_shop_setup/info", null, 13).LJIILIIL(new C0UO0());
            }

            @Override // X.InterfaceC1103460eoy
            public final C11NZ LJFF(int i, int i2, String str) {
                UpdateSMBSetupInfoRequest updateSMBSetupInfoRequest = new UpdateSMBSetupInfoRequest();
                updateSMBSetupInfoRequest.secAnchorId = str;
                updateSMBSetupInfoRequest.scene = i;
                updateSMBSetupInfoRequest.updatedTask = i2;
                C480460Ism.LIZ().getClass();
                return C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).updateSMBOneStopSetupState(updateSMBSetupInfoRequest), null, "/sub/upsell/one_stop_shop_setup/update/", null, 13).LJIILIIL(new C0UO0());
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1103460eoy
            public final void LJ(String str, String str2, SMBPreviewResponse.ResponseData responseData, String str3) {
                if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
                    C1103520ep4.LIZ.LJFF(str2, str, new C1822320xWQ(responseData));
                    return;
                }
                C1822300xWO c1822300xWOLIZLLL = C1822290xWN.LIZLLL(responseData);
                List listLIZ = C1822290xWN.LIZ(responseData, str3, null);
                C518520KVe c518520KVe = C518520KVe.LIZIZ;
                Object c1784870wY1 = new C1784870wY1(listLIZ, c1822300xWOLIZLLL, responseData);
                c518520KVe.getClass();
                String strLIZ = AbstractC518510KVd.LIZ(str2, str);
                if (strLIZ == null) {
                    return;
                }
                c518520KVe.LIZ.put(strLIZ, (TYPE) c1784870wY1);
            }
        };
    }
}
