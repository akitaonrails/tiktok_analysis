package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05SW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05SW extends C09AY implements Function0<Float> {
    public final /* synthetic */ C05P1<C1396005dG> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SW(C05P1<C1396005dG> c05p1) {
        super(0);
        this.LL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(C13LZ.LIZLLL(this.LL.getValue().LIZIZ, 0.0f, 1.0f));
    }
}
