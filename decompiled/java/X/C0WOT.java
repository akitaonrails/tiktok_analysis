package X;

import Y.ARunnableS18S1200000_13;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WOT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOT {
    public static Map<String, String> LIZIZ(List<C080U> list) {
        HashMap map = new HashMap();
        for (C080U c080u : list) {
            map.put(c080u.LIZ, c080u.LIZIZ);
        }
        return map;
    }

    public static void LIZ(Request request, Request request2, String str) {
        if (C0WRY.LIZ(NetworkComponent.INSTANCE.interceptorCheckSampleRate())) {
            C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS18S1200000_13(request, request2, str, 14));
        }
    }
}
