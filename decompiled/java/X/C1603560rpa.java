package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603560rpa {
    public String LIZ = "";
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public long LIZLLL;

    public final void LIZ() {
        this.LIZJ.put("duration", String.valueOf(System.currentTimeMillis() - this.LIZLLL));
    }

    public final void LJ() {
        if (this.LIZLLL > 0 && !this.LIZJ.containsKey("duration")) {
            LIZ();
        }
        try {
            if (this.LIZ.length() > 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(C2097608Jq.LJIIZILJ(this.LIZIZ));
                c2344009Gk.LJII(C2097608Jq.LJIIZILJ(this.LIZJ));
                C20684815ws.LJIILLIIL(this.LIZ, c2344009Gk.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(BaseResponse baseResponse) {
        Integer numValueOf;
        if (baseResponse != null && baseResponse.status_code == 0) {
            this.LIZIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        } else {
            this.LIZIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZIZ;
        Integer numValueOf2 = null;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.status_code);
        } else {
            numValueOf = null;
        }
        concurrentHashMap.put("status_code", String.valueOf(numValueOf));
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.LIZIZ;
        if (baseResponse != null) {
            numValueOf2 = Integer.valueOf(baseResponse.error_code);
        }
        concurrentHashMap2.put("error_code", String.valueOf(numValueOf2));
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZIZ.put(str, obj.toString());
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (obj != null) {
            this.LIZJ.put(str, obj.toString());
        }
    }
}
