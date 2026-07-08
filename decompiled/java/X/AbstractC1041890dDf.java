package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1041890dDf {
    public final Map<Class<?>, Function1<?, C978103s3<?>>> LIZ = new LinkedHashMap();

    public abstract List<InterfaceC1041910dDh<?>> LIZ();

    public static void LIZIZ(AbstractC1041890dDf abstractC1041890dDf, Class cls, Object obj) {
        Function1 function1 = (Function1) ((LinkedHashMap) abstractC1041890dDf.LIZ).get(cls);
        if (function1 != null && C19719512Dh.LJFF(1, function1) && function1.invoke(obj) != null) {
            Iterator<InterfaceC1041910dDh<?>> it2 = abstractC1041890dDf.LIZ().iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(null, null);
            }
        } else {
            Iterator<InterfaceC1041910dDh<?>> it3 = abstractC1041890dDf.LIZ().iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(cls, obj);
            }
        }
    }
}
