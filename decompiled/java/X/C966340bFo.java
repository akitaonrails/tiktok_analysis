package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966340bFo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966340bFo(C966020bFI c966020bFI) {
        super(0);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966020bFI c966020bFI = this.LL;
        C1AZW.LIZIZ(c966020bFI.LJJ, c966020bFI.LJ, "clear all link states", null, null);
        C966020bFI c966020bFI2 = this.LL;
        c966020bFI2.LJ().LL();
        c966020bFI2.LJIJI(0);
        return Unit.LIZ;
    }
}
