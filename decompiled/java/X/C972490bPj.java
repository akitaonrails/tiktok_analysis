package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972490bPj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EnumC2231831CWv LL;
    public final /* synthetic */ C964730bDD LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C972490bPj(EnumC2231831CWv enumC2231831CWv, C964730bDD c964730bDD, long j) {
        super(0);
        this.LL = enumC2231831CWv;
        this.LLILLJJLI = c964730bDD;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = C972500bPk.LIZ[this.LL.ordinal()];
        if (i == 1) {
            this.LLILLJJLI.LJJJJLI(this.LLILLL);
        } else if (i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on timer canceled of type:");
            sbLIZ.append(this.LL);
            sbLIZ.append(",  uid: ");
            sbLIZ.append(this.LLILLL);
            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "RustCrossTimer");
        } else {
            this.LLILLJJLI.LLLLLL(this.LLILLL);
        }
        return Unit.LIZ;
    }
}
