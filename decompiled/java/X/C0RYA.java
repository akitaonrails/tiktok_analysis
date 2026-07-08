package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RYA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RYA extends C09AY implements Function0<Set<? extends String>> {
    public final /* synthetic */ C0RY9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RYA(C0RY9 c0ry9) {
        super(0);
        this.LL = c0ry9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<String> setLIZIZ = this.LL.LIZIZ();
        return (setLIZIZ == null || setLIZIZ.isEmpty()) ? this.LL.LIZJ() : this.LL.LIZIZ();
    }
}
