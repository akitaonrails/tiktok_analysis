package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146320fw6 extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1146270fw1 LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146320fw6(boolean z, boolean z2, C1146270fw1 c1146270fw1, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c1146270fw1;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        C1146270fw1 c1146270fw1;
        int iIntValue = num.intValue();
        if (this.LL) {
            if (this.LLILLJJLI && (c1146270fw1 = this.LLILLL) != null) {
                if (!this.LLILZ) {
                    iIntValue = -iIntValue;
                }
                c1146270fw1.LJIIL(iIntValue);
            }
        } else {
            C1146270fw1 c1146270fw12 = this.LLILLL;
            if (c1146270fw12 != null) {
                if (!this.LLILZ) {
                    iIntValue = -iIntValue;
                }
                c1146270fw12.LJIIL(iIntValue);
            }
        }
        return Unit.LIZ;
    }
}
