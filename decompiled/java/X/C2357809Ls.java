package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2357809Ls extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C536080L0s LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357809Ls(int i, C118300cf c118300cf, C536080L0s c536080L0s) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c536080L0s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        int iFloatValue = (int) (f.floatValue() * this.LL);
        int i = iFloatValue - this.LLILLJJLI.element;
        if (i > 0) {
            this.LLILLL.LJI(i);
            this.LLILLJJLI.element = iFloatValue;
        }
        return Unit.LIZ;
    }
}
