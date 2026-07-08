package X;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891390zJp extends C09AY implements Function0<Executor> {
    public final /* synthetic */ C1891380zJo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891390zJp(C1891380zJo c1891380zJo) {
        super(0);
        this.LL = c1891380zJo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Executor invoke() {
        Executor executor;
        C20603715jn c20603715jnLJLZ = this.LL.LJ.LJLZ();
        return (c20603715jnLJLZ == null || (executor = c20603715jnLJLZ.LJII) == null) ? C786410Ut5.d4(2) : executor;
    }
}
