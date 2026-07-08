package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubManagementGetSubInfoUseSubscribeApiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.google.gson.n;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490480JLi implements C0JKY {
    @Override // X.C0JKY
    public final C11JN LLILL(int i, String str) {
        C11NZ<n> c11nzLJJJJZI;
        C11ON c11onLJJJJZI;
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if (LiveSubManagementGetSubInfoUseSubscribeApiSetting.INSTANCE.enable()) {
            C480460Ism.LIZ().getClass();
            c11nzLJJJJZI = ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, str, i).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Gu
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((BaseResponse) obj).data;
                }
            });
        } else {
            IHostPgcSubsService iHostPgcSubsService = (IHostPgcSubsService) C1161920gLG.LIZJ(IHostPgcSubsService.class);
            if (iHostPgcSubsService == null || (c11nzLJJJJZI = iHostPgcSubsService.getPgcSubscribeInfo(true, currentUser.getSecUid(), true, str, i)) == null) {
                C480460Ism.LIZ().getClass();
                c11nzLJJJJZI = ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, str, i).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Gv
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return ((BaseResponse) obj).data;
                    }
                });
            }
        }
        if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            c11onLJJJJZI = c11nzLJJJJZI.LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLh
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    n nVar = (n) obj;
                    C490290JKp.LIZ.getClass();
                    GetSubInfoResponse getSubInfoResponseLIZ = C490290JKp.LIZ(nVar);
                    if (getSubInfoResponseLIZ == null) {
                        getSubInfoResponseLIZ = new GetSubInfoResponse();
                    }
                    return new Pair(nVar, getSubInfoResponseLIZ);
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JKf
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Pair pair = (Pair) obj;
                    n nVar = (n) pair.getFirst();
                    Object second = pair.getSecond();
                    C490180JKe.LIZ(nVar);
                    return second;
                }
            });
        } else {
            c11onLJJJJZI = c11nzLJJJJZI.LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLg
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    n nVar = (n) obj;
                    C490180JKe.LIZ(nVar);
                    C490290JKp.LIZ.getClass();
                    GetSubInfoResponse getSubInfoResponseLIZ = C490290JKp.LIZ(nVar);
                    if (getSubInfoResponseLIZ == null) {
                        return new GetSubInfoResponse();
                    }
                    return getSubInfoResponseLIZ;
                }
            });
        }
        return c11onLJJJJZI.LJJIJIIJIL(new C09JN() { // from class: X.01fK
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$1");
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_status", 0);
                jSONObject.put("error_message", "");
                jSONObject.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUser().getId()));
                jSONObject.put("from_container", true);
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "REFRESH_SUB_MANAGEMENT"));
                C1C7U.LIZIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$1");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.01fJ
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                int errorCode;
                C1C7U.LIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$2");
                Throwable th = (Throwable) obj;
                String strLJIJI = C497740JfY.LJIJI(2131851936);
                if (th instanceof C501470JlZ) {
                    C501470JlZ c501470JlZ = (C501470JlZ) th;
                    errorCode = c501470JlZ.getErrorCode();
                    strLJIJI = c501470JlZ.getPrompt();
                } else {
                    errorCode = -1;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_status", errorCode);
                jSONObject.put("error_message", strLJIJI);
                jSONObject.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUser().getId()));
                jSONObject.put("from_container", true);
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "REFRESH_SUB_MANAGEMENT"));
                C1C7U.LIZIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$2");
            }
        });
    }
}
