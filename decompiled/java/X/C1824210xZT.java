package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xZT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824210xZT extends C09AY implements Function1<C474500IjA, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824210xZT(String str, int i, int i2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C474500IjA c474500IjA) {
        C474500IjA c474500IjA2 = c474500IjA;
        boolean zLJFF = Intrinsics.LJFF(this.LL, "custom");
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        if (zLJFF) {
            c474500IjA2.LJJII(Integer.valueOf(i), "sku_cnt");
            c474500IjA2.LJJII(Integer.valueOf(i2), "sku_index");
        }
        return Unit.LIZ;
    }
}
