package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQP implements InterfaceC1051760dTa {
    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        UserGetApi.LIZ.getClass();
        ((UserGetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(UserGetApi.class)).getSelf().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0XQQ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("UpdateAccountInfoMethod@5e24.call$1");
                UserGetResponse userGetResponse = (UserGetResponse) obj;
                if (userGetResponse.user != null) {
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJIL(userGetResponse.user);
                }
                C1C7U.LIZIZ("UpdateAccountInfoMethod@5e24.call$1");
            }
        }, new C09JN() { // from class: X.0XQO
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("UpdateAccountInfoMethod@5e24.call$2");
                C1C7U.LIZIZ("UpdateAccountInfoMethod@5e24.call$2");
            }
        });
    }
}
