package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0udL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711290udL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711290udL(C1713750uhJ c1713750uhJ, String str, int i, String str2) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LIZLLL > 0) {
            C1708030uY5.LIZ.LIZ(this.LL.LJFF).LIZIZ(this.LLILLJJLI, null, this.LLILZ, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
