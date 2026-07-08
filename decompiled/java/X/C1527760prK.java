package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527760prK extends C09AY implements Function0<List<C801520VcM>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL = 100;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527760prK(C1527670prB c1527670prB, String str) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<C801520VcM> invoke() {
        return this.LL.LJLJI().LIZLLL(this.LLILLL, this.LLILLJJLI);
    }
}
