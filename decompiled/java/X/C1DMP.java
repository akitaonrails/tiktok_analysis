package X;

import aj7.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DMP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DMP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ b LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DMP(b bVar, int i, long j, long j2, String str) {
        super(0);
        this.LL = bVar;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        b.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
