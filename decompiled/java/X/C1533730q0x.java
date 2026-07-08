package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533730q0x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1533750q0z<C2027907wz> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Forest LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1533730q0x(C1533750q0z<C2027907wz> c1533750q0z, String str, String str2, Forest forest) {
        super(0);
        this.LL = c1533750q0z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = forest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [T] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.07wz] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ?? r5;
        LinkedHashMap linkedHashMap;
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1533790q13 c1533790q13LIZIZ;
        byte[] bArrLJIIIZ;
        String string;
        C1533750q0z c1533750q0z;
        C1533750q0z<C2027907wz> c1533750q0z2 = this.LL;
        if (c1533750q0z2.LIZ == null) {
            C1533720q0w c1533720q0w = C1533720q0w.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            Forest forest = this.LLILZ;
            synchronized (c1533720q0w) {
                String strLIZ = C1533720q0w.LIZ(str, str2);
                Map<String, C1533750q0z<C2027907wz>> map = C1533720q0w.LIZLLL;
                if (map == null || (c1533750q0z = (C1533750q0z) ((LinkedHashMap) map).get(strLIZ)) == null || (r5 = (C2027907wz) c1533750q0z.LIZ) == 0) {
                    r5 = 0;
                    r5 = 0;
                    r5 = 0;
                    r5 = 0;
                    try {
                        RequestParams requestParams = new RequestParams(EnumC1533980q1M.PRELOAD_CONFIG);
                        requestParams.accessKey = str;
                        requestParams.channel = str2;
                        requestParams.bundle = "spark-manifest.json";
                        requestParams.loadToMemory = true;
                        requestParams.needLocalFile = Boolean.FALSE;
                        requestParams.onlyLocal = true;
                        requestParams.disableGeckoStatics = true;
                        c1533910q1FCreateSyncRequest = forest.createSyncRequest("", requestParams);
                    } catch (Throwable th) {
                        th = th;
                        linkedHashMap = null;
                    }
                    if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && (bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ()) != null) {
                        JSONObject jSONObject = new JSONObject(new String(bArrLJIIIZ, Charsets.UTF_8));
                        linkedHashMap = new LinkedHashMap();
                        try {
                            JSONObject jSONObjectLIZ = C1294100jmS.LIZ("resources", jSONObject);
                            if (jSONObjectLIZ != null) {
                                Iterator<String> itKeys = jSONObjectLIZ.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    JSONObject jSONObjectLIZ2 = C1294100jmS.LIZ(next, jSONObjectLIZ);
                                    if (jSONObjectLIZ2 != null && (string = JSONObjectProtectorUtils.getString(jSONObjectLIZ2, "bundle")) != null) {
                                        linkedHashMap.put(next, new C1533510q0b(str, str2, string));
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C1490740otc c1490740otc = C1490740otc.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("error occurs when parseChannelSettings, ");
                            sbLIZ.append(th);
                            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, C1533720q0w.LIZIZ);
                            if (linkedHashMap != null) {
                            }
                            c1533750q0z2.LIZ = r5;
                            return Unit.LIZ;
                        }
                        C2027907wz c2027907wz = new C2027907wz();
                        c2027907wz.LIZJ(linkedHashMap);
                        r5 = c2027907wz;
                    }
                }
            }
            c1533750q0z2.LIZ = r5;
        }
        return Unit.LIZ;
    }
}
