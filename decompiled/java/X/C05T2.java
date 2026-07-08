package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05T2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05T2 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C05P1<C1396005dG> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T2(C05P1<C1396005dG> c05p1) {
        super(0);
        this.LL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.getValue().LIZLLL > 0);
    }
}
