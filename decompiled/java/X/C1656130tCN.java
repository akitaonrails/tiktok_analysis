package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656130tCN extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C1656090tCJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656130tCN(C1656090tCJ c1656090tCJ, boolean z, int[] iArr, String str, long j, long j2, int i, String str2) {
        super(1);
        this.LL = c1656090tCJ;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        this.LL.LJII.LIZ();
        C1656090tCJ c1656090tCJ = this.LL;
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        c1656090tCJ.LIZIZ(iIntValue, str, this.LLILZLL, null, j, this.LLILZIL, j2);
        return Unit.LIZ;
    }
}
