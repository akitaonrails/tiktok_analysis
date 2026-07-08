package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.1BCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201141BCu<T> extends C09AY implements Function0<T> {
    public final /* synthetic */ C1057250dcR LL;
    public final /* synthetic */ AbstractC2201091BCp<?> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201141BCu(C1057250dcR c1057250dcR, AbstractC2201091BCp<?> abstractC2201091BCp) {
        super(0);
        this.LL = c1057250dcR;
        this.LLILLJJLI = abstractC2201091BCp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        T t;
        C1057250dcR c1057250dcR = this.LL;
        if (c1057250dcR == null) {
            t = (T) this.LLILLJJLI.LJIIIZ();
            if (t == null) {
                return null;
            }
        } else {
            t = (T) this.LLILLJJLI.LJIIJ(c1057250dcR);
            if (t == null) {
                return null;
            }
        }
        return t;
    }
}
