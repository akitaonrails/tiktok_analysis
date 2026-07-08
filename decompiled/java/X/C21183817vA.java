package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.prefetch.LiveRoomFragmentObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17vA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21183817vA {
    public static final /* synthetic */ int LIZ = 0;

    public static AnonymousClass0957 LIZ(long j) {
        AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957;
        AnonymousClass0957 anonymousClass09572 = (AnonymousClass0957) ((LinkedHashMap) C1733990vDx.LIZIZ).get(Long.valueOf(j));
        if (anonymousClass09572 != null) {
            return anonymousClass09572;
        }
        Iterator<LiveRoomFragmentObserver> it2 = LiveRoomFragmentObserver.LLILLJJLI.iterator();
        Object value = null;
        while (it2.hasNext()) {
            for (Map.Entry entry : ((LinkedHashMap) it2.next().LL).entrySet()) {
                if (((Number) entry.getKey()).longValue() == j) {
                    if (value == null) {
                        value = entry.getValue();
                    } else if (((C21183917vB) entry.getValue()).LIZ > ((C21183917vB) value).LIZ) {
                        value = entry.getValue();
                    }
                }
            }
        }
        C21183917vB c21183917vB = (C21183917vB) value;
        if (c21183917vB == null || (anonymousClass0957 = c21183917vB.LIZIZ) == null) {
            return null;
        }
        return anonymousClass0957;
    }
}
