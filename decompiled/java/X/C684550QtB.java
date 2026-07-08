package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684550QtB extends C09AY implements Function1<C684540QtA, C684540QtA> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684550QtB(int i, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C684540QtA invoke(C684540QtA c684540QtA) {
        C684540QtA c684540QtA2 = c684540QtA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.LL;
        boolean z = this.LLILLJJLI;
        linkedHashMap.putAll(c684540QtA2.LLILLJJLI);
        linkedHashMap.put(Integer.valueOf(i), Boolean.valueOf(z));
        return C684540QtA.LIZ(c684540QtA2, null, linkedHashMap, null, null, 0L, null, null, null, null, null, 1021);
    }
}
