package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926130aCx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Integer, Integer, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C926130aCx(C926080aCs c926080aCs, int i, int i2) {
        super(0);
        this.LL = c926080aCs;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
