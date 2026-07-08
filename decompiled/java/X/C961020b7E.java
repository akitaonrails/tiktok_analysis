package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0b7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961020b7E {
    public static final <T, R extends Extra> EnumC961090b7L LIZIZ(BaseResponse<T, R> baseResponse) {
        if (u.LJJIIJZLJL(baseResponse.LIZIZ, "client_prefix_preload_cache", false)) {
            return EnumC961090b7L.PRELOAD_CACHE;
        }
        if (u.LJJIIJZLJL(baseResponse.LIZIZ, "client_prefix_click_cache", false)) {
            return EnumC961090b7L.CLICK_CACHE;
        }
        if (u.LJJIIJZLJL(baseResponse.LIZIZ, "client_prefix_last_cache", false)) {
            return EnumC961090b7L.LAST_CACHE;
        }
        if (u.LJJIIJZLJL(baseResponse.LIZIZ, "client_prefix_preload_network_hook", false)) {
            return EnumC961090b7L.NETWORK_PRELOAD;
        }
        return EnumC961090b7L.NETWORK_REAL;
    }

    public static final C11NZ LIZ(C11NZ c11nz, C960970b79 c960970b79) {
        C961040b7G c961040b7G = c960970b79.LJIILLIIL;
        if (c961040b7G == null) {
            C20441214yg.LIZIZ("CoHostNetworkCacheObservable", "doCoHostSaveCache, preloadConfig: null");
            return c11nz;
        }
        return c11nz.LJJIJIIJIL(new AfS151S0200000_15(c960970b79, c961040b7G, 2));
    }
}
