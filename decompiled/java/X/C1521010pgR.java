package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS247S0300000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521010pgR extends AbstractC1521020pgS {
    public static final C1521010pgR LIZ = new C1521010pgR();
    public static final C2142308aL<String, JSONObject> LIZIZ = new C2142308aL<>(AFwS231S0000000_3.get$arr$(116));

    public static JSONObject LIZLLL(String str) {
        C2142308aL<String, JSONObject> c2142308aL = LIZIZ;
        c2142308aL.getClass();
        AwS247S0300000_3 awS247S0300000_3 = new AwS247S0300000_3((Object) null, (Object) c2142308aL, (C2142308aL<Object, Object>) str, (Object) 3);
        Object objInvoke = ((ConcurrentHashMap) c2142308aL.LLILLJJLI).get(str);
        if (objInvoke == null) {
            objInvoke = awS247S0300000_3.invoke();
            if (c2142308aL.LLILLL.size() > 64) {
                ((ConcurrentHashMap) c2142308aL.LLILLJJLI).remove(ListProtector.remove(c2142308aL.LLILLL, 0));
                int i = C2187451AjH.LIZ;
                C1521730phb.LJI("CircularMap", "Reach the limited of circular map, remove the oldest item");
            }
            c2142308aL.LLILLL.add(str);
            ((ConcurrentHashMap) c2142308aL.LLILLJJLI).put(str, objInvoke);
            if (objInvoke == null) {
                objInvoke = awS247S0300000_3.invoke();
            }
        }
        return (JSONObject) objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0517  */
    @Override // X.AbstractC1521020pgS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1521040pgU r17) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1521010pgR.LIZ(X.0pgU):boolean");
    }
}
