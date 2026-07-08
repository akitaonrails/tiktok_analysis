package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1358705Tl extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C05P1<C1396005dG> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358705Tl(C05P1<C1396005dG> c05p1) {
        super(0);
        this.LL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1396005dG value = this.LL.getValue();
        return Boolean.valueOf(value.LJ == 0 && value.LIZIZ <= 0.001f && value.LIZJ <= 0.001f);
    }
}
