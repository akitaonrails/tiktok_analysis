package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19661911wH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<Long, Unit> LLILZIL;
    public final /* synthetic */ C14XN LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19661911wH(boolean z, boolean z2, long j, int i, Function1<? super Long, Unit> function1, C14XN c14xn) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = function1;
        this.LLILZLL = c14xn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j;
        if (!this.LL) {
            if (this.LLILLJJLI) {
                j = (~(1 << this.LLILZ)) & this.LLILLL;
            } else {
                j = (1 << this.LLILZ) | this.LLILLL;
            }
            this.LLILZIL.invoke(Long.valueOf(j));
            this.LLILZLL.LJJIJIIJI();
        }
        return Unit.LIZ;
    }
}
