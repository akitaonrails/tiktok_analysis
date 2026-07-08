package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0puv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529990puv {
    public static AbstractC1530000puw LIZ = new AbstractC1530000puw() { // from class: X.0puu
        @Override // X.AbstractC1530000puw
        public final boolean isEngineSupportKeepCacheForTime() {
            return false;
        }

        @Override // X.AbstractC1530000puw
        public final boolean preloadBytesToEngine(String str, String str2, EnumC1533980q1M enumC1533980q1M, Map<String, ? extends Object> map, JSONObject jSONObject, Long l, byte[] bArr, Long l2) {
            return false;
        }

        @Override // X.AbstractC1530000puw
        public final boolean preloadLocalFileToEngine(String str, String str2, JSONObject jSONObject, String str3, Long l) {
            return false;
        }

        @Override // X.AbstractC1530000puw
        public final boolean preloadOnlineResourceToEngine(C1533900q1E c1533900q1E, C1533790q13 c1533790q13, Long l) {
            return false;
        }

        @Override // X.AbstractC1530000puw
        public final void release(C1533900q1E c1533900q1E) {
        }
    };
}
