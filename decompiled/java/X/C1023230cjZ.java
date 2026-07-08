package X;

import com.bytedance.android.commercialize.track.dynamic.dsl.DslEventDynamicParamRule;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023230cjZ {
    public final C1008520cLq LIZ;
    public final Map<String, C1023300cjg> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());

    public C1023230cjZ(C1008520cLq c1008520cLq) {
        this.LIZ = c1008520cLq;
    }

    public final void LIZ(List<DslEventDynamicParamRule> list) {
        Map<String, C1023300cjg> map = this.LIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (DslEventDynamicParamRule dslEventDynamicParamRule : list) {
            String str = dslEventDynamicParamRule.paramName;
            if (str == null) {
                str = "";
            }
            Pair pair = new Pair(str, new C1023300cjg(dslEventDynamicParamRule));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        map.putAll(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0qly] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZIZ(X.C1022420ciG r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1023230cjZ.LIZIZ(X.0ciG):java.util.Map");
    }
}
