package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;

/* JADX INFO: renamed from: X.0XIB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIB<T, R> implements InterfaceC1487280oo2 {
    public static final C0XIB<T, R> LL = new C0XIB<>();

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        final String str = (String) obj;
        return new C11LE() { // from class: X.0XIA
            @Override // X.C11LE
            public final void subscribe(C11M9<? super CheckUserNameResponse> c11m9) {
                Object objFromJson = GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJII(), str, (Class<Object>) CheckUserNameResponse.class);
                if (objFromJson == null) {
                    objFromJson = new CheckUserNameResponse(null, null);
                }
                c11m9.onNext(objFromJson);
            }
        };
    }
}
