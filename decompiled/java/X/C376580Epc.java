package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Epc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376580Epc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C376460EpQ LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376580Epc(C376460EpQ c376460EpQ, Function0 function0, Function2 function2, boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c376460EpQ;
        this.LLILLL = function0;
        this.LLILZ = function2;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z = this.LL;
        if (z) {
            this.LLILLJJLI.LJII(this.LLILLL, this.LLILZ, this.LLILZIL, z, true, false);
        }
        return Unit.LIZ;
    }
}
