package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.verify.FavoriteFakeWriteExpV2SettingModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613750O5l extends C09AY implements Function1<C613670O5d<C613760O5m>, C613670O5d<C613760O5m>> {
    public final /* synthetic */ AwemeCollectionAgent LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613750O5l(AwemeCollectionAgent awemeCollectionAgent, boolean z, String str, boolean z2) {
        super(1);
        this.LL = awemeCollectionAgent;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C613670O5d<C613760O5m> invoke(C613670O5d<C613760O5m> c613670O5d) {
        C613670O5d<C613760O5m> c613670O5d2 = c613670O5d;
        BaseResponse baseResponse = null;
        if (C189200o6.m8isSuccessimpl(c613670O5d2.LIZ)) {
            Object obj = c613670O5d2.LIZ;
            if (C189200o6.m7isFailureimpl(obj)) {
                obj = null;
            }
            C613760O5m c613760O5m = (C613760O5m) obj;
            if (c613760O5m != null) {
                baseResponse = c613760O5m.LIZ;
            }
            C1206780hVc.LIZJ("/aweme/v1/aweme/collect/", "net", baseResponse);
            this.LL.LJFF().LJ("AwemeCollectionAgent data result success");
            return c613670O5d2;
        }
        C1206780hVc.LIZIZ("/aweme/v1/aweme/collect/", C189200o6.m5exceptionOrNullimpl(c613670O5d2.LIZ));
        if (!((Boolean) C0BOD.LIZ.getValue()).booleanValue()) {
            this.LL.LJFF().LJ("AwemeCollectionAgent data result fail");
            return c613670O5d2;
        }
        boolean z = C189200o6.m5exceptionOrNullimpl(c613670O5d2.LIZ) instanceof C23112093u;
        if (this.LLILLJJLI) {
            if (z) {
                this.LL.LJFF().LJ("AwemeCollectionAgent data result fail(isApiServerError: true isNetworkAvailable: true)");
                return C613670O5d.LIZ(c613670O5d2, null, C613690O5f.LIZ(c613670O5d2.LIZIZ), 1);
            }
            if (((FavoriteFakeWriteExpV2SettingModel) C613840O5u.LIZIZ.getValue()).rollbackDisable) {
                this.LL.LJFF().LJ("AwemeCollectionAgent data result fail(isApiServerError: false isNetworkAvailable: true rollbackDisable: true)");
                C1440005kM.LIZ(new C2038707yj(this.LLILLL, this.LLILZ));
                C613760O5m c613760O5m2 = new C613760O5m(new BaseResponse());
                C189200o6.m2constructorimpl(c613760O5m2);
                return C613670O5d.LIZ(c613670O5d2, C189200o6.m1boximpl(c613760O5m2), null, 2);
            }
            this.LL.LJFF().LJ("AwemeCollectionAgent data result fail(isApiServerError: false isNetworkAvailable: true rollbackDisable: false)");
            return C613670O5d.LIZ(c613670O5d2, null, C613690O5f.LIZ(c613670O5d2.LIZIZ), 1);
        }
        if (z) {
            this.LL.LJFF().LJ("AwemeCollectionAgent data result fail(isApiServerError: true isNetworkAvailable: false)");
            return C613670O5d.LIZ(c613670O5d2, null, C613690O5f.LIZ(c613670O5d2.LIZIZ), 1);
        }
        this.LL.LJFF().LJ("AwemeCollectionAgent data result fail(isApiServerError: false isNetworkAvailable: false)");
        return c613670O5d2;
    }
}
