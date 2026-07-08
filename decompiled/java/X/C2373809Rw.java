package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.hybridkit.task.IFetchJSBNetApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2373809Rw implements InterfaceC2373909Rx {
    public static final C2373809Rw LIZ = new C2373809Rw();

    public static final C1493620oyG LIZJ(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("timeout")) != null) {
            long j = CastLongProtector.parseLong(str);
            if (j > 0) {
                C1493620oyG c1493620oyG = new C1493620oyG();
                c1493620oyG.LIZJ = j;
                c1493620oyG.LIZLLL = j;
                c1493620oyG.LJ = j;
                return c1493620oyG;
            }
            return null;
        }
        return null;
    }

    public static final List<C080U> LIZLLL(Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C080U(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC2373909Rx
    public final void LIZIZ(String str, Map<String, String> map, boolean z, Map<String, String> map2, InterfaceC2373409Rs interfaceC2373409Rs) {
        Object c098200Yq;
        String strAddCommonParams = str;
        C2501609rC c2501609rC = new C2501609rC(interfaceC2373409Rs, 3);
        try {
            c098200Yq = (IFetchJSBNetApi) C09S2.LIZJ(IFetchJSBNetApi.class, strAddCommonParams);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IFetchJSBNetApi iFetchJSBNetApi = (IFetchJSBNetApi) c098200Yq;
        if (iFetchJSBNetApi == null) {
            interfaceC2373409Rs.LIZIZ(new NullPointerException("Create request service failed"));
            return;
        }
        if (z) {
            strAddCommonParams = AppLog.addCommonParams(strAddCommonParams, true);
        }
        iFetchJSBNetApi.fetchGet(strAddCommonParams, false, LIZLLL(map), null, LIZJ(map2)).enqueue(c2501609rC);
    }

    @Override // X.InterfaceC2373909Rx
    public final void LIZ(String str, Map<String, String> map, String str2, JSONObject jSONObject, boolean z, Map<String, String> map2, InterfaceC2373409Rs interfaceC2373409Rs) {
        Object c098200Yq;
        String strAddCommonParams = str;
        C2501609rC c2501609rC = new C2501609rC(interfaceC2373409Rs, 3);
        try {
            c098200Yq = (IFetchJSBNetApi) C09S2.LIZJ(IFetchJSBNetApi.class, strAddCommonParams);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IFetchJSBNetApi iFetchJSBNetApi = (IFetchJSBNetApi) c098200Yq;
        if (iFetchJSBNetApi == null) {
            interfaceC2373409Rs.LIZIZ(new NullPointerException("Create request service failed"));
            return;
        }
        if (z) {
            strAddCommonParams = AppLog.addCommonParams(strAddCommonParams, true);
        }
        iFetchJSBNetApi.fetchPost(strAddCommonParams, false, LIZLLL(map), new TypedByteArray(str2, C786410Ut5.J3(jSONObject).getBytes(Charsets.UTF_8), new String[0]), LIZJ(map2)).enqueue(c2501609rC);
    }
}
