package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552780Lm8 {
    public AIGCWorkflowConfig LIZIZ;
    public final String LIZ = UUID.randomUUID().toString();
    public final Map<String, InterfaceC1406105et> LIZJ = new LinkedHashMap();
    public final Map<String, C552890LmJ<?, ?, ?, ?>> LIZLLL = new LinkedHashMap();
    public final List<C551510Lk5> LJ = new ArrayList();
    public final C552980LmS LJFF = new C552980LmS(0);
    public final C552850LmF LJI = new C552850LmF(0);

    public final <R> R LIZ(Function1<? super C552770Lm7, ? extends R> function1) {
        C552770Lm7 c552770Lm7 = new C552770Lm7();
        R rInvoke = function1.invoke(c552770Lm7);
        this.LIZLLL.putAll(c552770Lm7.LIZ);
        return rInvoke;
    }
}
