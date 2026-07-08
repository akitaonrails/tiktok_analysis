package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C080000Rq extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ Map.Entry<String, Function0<Boolean>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C080000Rq(Map.Entry<String, ? extends Function0<Boolean>> entry) {
        super(0);
        this.LL = entry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return this.LL.getValue().invoke();
    }
}
