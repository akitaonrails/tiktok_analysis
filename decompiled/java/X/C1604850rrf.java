package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604850rrf {
    public static final C01GW<C1604850rrf> LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(562));
    public Long LIZ;
    public ConcurrentHashMap<String, Object> LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZLLL = true;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
        if (concurrentHashMap != null) {
            Long l = this.LIZ;
            if (l != null) {
                concurrentHashMap.put("start_to_now", String.valueOf(System.currentTimeMillis() - l.longValue()));
            }
            ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZIZ;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.put("card_type", "video");
                C1768000w6o.LIZ.getClass();
                C1768000w6o.LIZIZ("rd_tiktokec_ec_feed_meaningful_render", concurrentHashMap2);
            }
            this.LIZIZ = null;
            this.LIZ = null;
        }
    }

    public final void LIZ(EnterRoomConfig enterRoomConfig, long j) {
        if (!this.LIZLLL && !this.LIZJ && Intrinsics.LJFF(enterRoomConfig.mECData.ecCommonExtraParam.get("order"), "1")) {
            this.LIZJ = true;
            ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
            if (concurrentHashMap != null) {
                Long l = this.LIZ;
                if (l != null) {
                    concurrentHashMap.put("start_to_now", String.valueOf(j - l.longValue()));
                }
                ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZIZ;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.put("card_type", "live");
                    C1768000w6o.LIZ.getClass();
                    C1768000w6o.LIZIZ("rd_tiktokec_ec_feed_meaningful_render", concurrentHashMap2);
                }
                this.LIZIZ = null;
                this.LIZ = null;
            }
        }
    }
}
