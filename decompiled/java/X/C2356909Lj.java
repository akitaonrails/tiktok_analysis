package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2356909Lj extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0L7R LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356909Lj(int i, C118300cf c118300cf, boolean z, C0L7R c0l7r) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = z;
        this.LLILZ = c0l7r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        int iFloatValue = (int) (f.floatValue() * this.LL);
        int i = iFloatValue - this.LLILLJJLI.element;
        if (i > 0) {
            if (!this.LLILLL) {
                this.LLILZ.LJJJJZ(i);
            }
            this.LLILLJJLI.element = iFloatValue;
        }
        return Unit.LIZ;
    }
}
