package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899580ZQu {
    public final Map<C14IR, C899590ZQv> LIZ = new LinkedHashMap();
    public C898900ZOe LIZIZ;
    public C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZJ;

    public final void LIZ(C14IR c14ir, Function1<? super C899590ZQv, Unit> function1) {
        Map<C14IR, C899590ZQv> map = this.LIZ;
        C899590ZQv c899590ZQv = new C899590ZQv();
        function1.invoke(c899590ZQv);
        map.put(c14ir, c899590ZQv);
    }
}
