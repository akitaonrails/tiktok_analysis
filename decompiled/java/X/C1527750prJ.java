package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527750prJ extends C09AY implements Function0<List<? extends C0WYY>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ int LLILLJJLI = 50;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527750prJ(C1527670prB c1527670prB, int i) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0WYY> invoke() {
        return this.LL.LJLILLLLZI().LIZIZ(this.LLILLJJLI, this.LLILLL);
    }
}
