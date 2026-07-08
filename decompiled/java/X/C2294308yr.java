package X;

import com.bytedance.byted_bach_sdk.BachAlgorithmSystem;
import com.bytedance.byted_bach_sdk.buffer.AlgorithmResultUnion;
import com.bytedance.byted_bach_sdk.buffer.BachAlgorithmOutput;
import com.bytedance.byted_bach_sdk.buffer.BachObject;
import com.bytedance.byted_bach_sdk.input.BachBitmapInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.08yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2294308yr {
    public final BachAlgorithmSystem LIZ;
    public final String LIZIZ;

    public final C2262108tf LIZ(BachBitmapInput bachBitmapInput) {
        String str;
        HashMap<String, BachObject>[] mapArr;
        HashMap map;
        BachObject bachObject;
        AlgorithmResultUnion algorithmResultUnion;
        HashMap<String, BachObject>[] mapArr2;
        HashMap map2;
        BachObject bachObject2;
        AlgorithmResultUnion algorithmResultUnion2;
        synchronized (this.LIZ) {
            try {
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(" start");
                C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
                BachAlgorithmSystem.BachErrorCode bachErrorCodeExecute = this.LIZ.execute(bachBitmapInput);
                if (C2294608yu.LIZ(this.LIZIZ)) {
                    return LIZIZ(bachBitmapInput);
                }
                this.LIZ.enable("nh_script", true);
                C2262108tf c2262108tf = null;
                str = null;
                str = null;
                str = null;
                str = null;
                String str2 = null;
                if (bachErrorCodeExecute == BachAlgorithmSystem.BachErrorCode.NO_ERROR) {
                    BachAlgorithmOutput result = this.LIZ.getResult("nh_script");
                    if (result != null && (mapArr2 = result.m_dataMap) != null && (map2 = (HashMap) C13LQ.LJJIIZ(0, mapArr2)) != null && (bachObject2 = (BachObject) map2.get("algResult")) != null && (algorithmResultUnion2 = bachObject2.valueResult) != null) {
                        str = algorithmResultUnion2.stringVal;
                    } else {
                        str = null;
                    }
                    BachAlgorithmOutput result2 = this.LIZ.getResult("nh_script");
                    if (result2 != null && (mapArr = result2.m_dataMap) != null && (map = (HashMap) C13LQ.LJJIIZ(0, mapArr)) != null && (bachObject = (BachObject) map.get("algResult_face")) != null && (algorithmResultUnion = bachObject.valueResult) != null) {
                        str2 = algorithmResultUnion.stringVal;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append(" end");
                    C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ2));
                    c2262108tf = new C2262108tf(str, str2);
                }
                return c2262108tf;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C2262108tf LIZIZ(BachBitmapInput bachBitmapInput) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        C201955140j.LJIIIIZZ(c0mj8, "BachInstanceManager", "bach execute with cache and get result with native");
        this.LIZ.enable("nh_script", false);
        BachAlgorithmSystem.BachErrorCode bachErrorCodeExecute = this.LIZ.execute(bachBitmapInput);
        C2262108tf c2262108tfLIZIZ = C2294608yu.LIZIZ(this.LIZ, this.LIZIZ);
        if (bachErrorCodeExecute == BachAlgorithmSystem.BachErrorCode.NO_ERROR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" end");
            C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
            return c2262108tfLIZIZ;
        }
        return null;
    }

    public C2294308yr(BachAlgorithmSystem bachAlgorithmSystem, String str) {
        this.LIZ = bachAlgorithmSystem;
        this.LIZIZ = str;
    }
}
