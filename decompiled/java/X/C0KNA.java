package X;

import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0KNA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNA extends C0KNG<CheckSubOrderResultStruct> {
    public final /* synthetic */ C516190KMf LIZIZ;

    public C0KNA(C516190KMf c516190KMf) {
        this.LIZIZ = c516190KMf;
    }

    public final C11NZ<C470590Icr<CheckSubOrderResultStruct>> LJ(String str, String str2) {
        if (this.LIZIZ.LL == null) {
            return null;
        }
        C480460Ism.LIZ().getClass();
        return C510380Jzw.LJIILJJIL(((IapApi) C480460Ism.LIZLLL(IapApi.class)).checkSubOrder(str, str2), EnumC510330Jzr.GENERAL, this.LIZIZ.LL.LIZLLL, "sub/contract/status", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0());
    }
}
