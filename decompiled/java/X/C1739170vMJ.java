package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739170vMJ {
    public final C0X9S<C1515820pY4<ShopChunkResponse>> LIZ;
    public final Map<String, Object> LIZIZ;
    public final boolean LIZJ;
    public final C1166490gSd LIZLLL;

    public final void LIZ() {
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", 10000), new Pair("is_retry", Boolean.valueOf(this.LIZJ))));
        this.LIZ.enqueue(new InterfaceC594300NSq<C1515820pY4<ShopChunkResponse>>() { // from class: X.0vMK
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<C1515820pY4<ShopChunkResponse>> c0x9s, Throwable th) {
                C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", -999), new Pair("is_retry", Boolean.valueOf(this.LL.LIZJ))));
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<C1515820pY4<ShopChunkResponse>> c0x9s, C0X52<C1515820pY4<ShopChunkResponse>> c0x52) {
                C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", 10001), new Pair("is_retry", Boolean.valueOf(this.LL.LIZJ))));
                C1515820pY4<ShopChunkResponse> c1515820pY4 = c0x52.LIZIZ;
                if (c1515820pY4 != null) {
                    c1515820pY4.LIZLLL(this.LL.LIZLLL);
                }
            }
        });
    }

    public C1739170vMJ(C0X9S<C1515820pY4<ShopChunkResponse>> c0x9s, Map<String, Object> map, boolean z) {
        this.LIZ = c0x9s;
        this.LIZIZ = map;
        this.LIZJ = z;
        this.LIZLLL = new C1166490gSd(map, z);
    }
}
