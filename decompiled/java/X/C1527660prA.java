package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527660prA extends C09AY implements Function0<List<? extends C0WYW>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ Set<Long> LLILLJJLI;
    public final /* synthetic */ EnumC1527270pqX LLILLL;
    public final /* synthetic */ int LLILZ = 100;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527660prA(C1527670prB c1527670prB, Set set, EnumC1527270pqX enumC1527270pqX, int i, long j) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = set;
        this.LLILLL = enumC1527270pqX;
        this.LLILZIL = i;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0WYW> invoke() {
        return this.LL.LJLILLLLZI().LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }
}
