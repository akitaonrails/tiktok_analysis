package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1358605Tk extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C05P1<C1396005dG> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358605Tk(C05P1<C1396005dG> c05p1) {
        super(0);
        this.LL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getValue().LJ);
    }
}
