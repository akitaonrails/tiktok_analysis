package X;

import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.dynamic.DynamicAssemConfigTypeAdapter;
import com.google.gson.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C628830OlV extends C0SZ4<DynamicAssem> {
    public Map<String, C628830OlV> LLJILJIL = new LinkedHashMap();

    static {
        e eVar = new e();
        eVar.LIZJ(new DynamicAssemConfigTypeAdapter(), C13IQ.class);
        eVar.LIZ();
    }

    public final void LJII(String str, Function1<? super C628830OlV, Unit> function1) {
        Map<String, C628830OlV> map = this.LLJILJIL;
        C628830OlV c628830OlV = new C628830OlV();
        function1.invoke(c628830OlV);
        map.put(str, c628830OlV);
    }
}
