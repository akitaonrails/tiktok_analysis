package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.prefetch.UsLiveRoomFragmentObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21183617v8 {
    public static final /* synthetic */ int LIZ = 0;

    public static AnonymousClass0957 LIZ(long j) {
        AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957;
        AnonymousClass0957 anonymousClass09572 = (AnonymousClass0957) ((LinkedHashMap) C1733990vDx.LIZIZ).get(Long.valueOf(j));
        if (anonymousClass09572 != null) {
            return anonymousClass09572;
        }
        Iterator<UsLiveRoomFragmentObserver> it2 = UsLiveRoomFragmentObserver.LLILLJJLI.iterator();
        Object value = null;
        while (it2.hasNext()) {
            for (Map.Entry entry : ((LinkedHashMap) it2.next().LL).entrySet()) {
                if (((Number) entry.getKey()).longValue() == j) {
                    if (value == null) {
                        value = entry.getValue();
                    } else if (((C21183717v9) entry.getValue()).LIZ > ((C21183717v9) value).LIZ) {
                        value = entry.getValue();
                    }
                }
            }
        }
        C21183717v9 c21183717v9 = (C21183717v9) value;
        if (c21183717v9 == null || (anonymousClass0957 = c21183717v9.LIZIZ) == null) {
            return null;
        }
        return anonymousClass0957;
    }
}
