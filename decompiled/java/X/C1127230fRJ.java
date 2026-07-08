package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127230fRJ extends C09AY implements Function1<C1132120fZC, Unit> {
    public final /* synthetic */ C1128710fTh LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1127230fRJ(C1128710fTh c1128710fTh, long j, int i, boolean z) {
        super(1);
        this.LL = c1128710fTh;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1132120fZC c1132120fZC) {
        this.LL.LLF(this.LLILLJJLI, this.LLILLL, this.LLILZ, true, c1132120fZC);
        return Unit.LIZ;
    }
}
