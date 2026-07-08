package X;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00V1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00V1 extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ Set<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00V1(Set<String> set) {
        super(1);
        this.LL = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(this.LL.contains(str));
    }
}
