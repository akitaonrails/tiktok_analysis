package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972480bPi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EnumC2231831CWv LL;
    public final /* synthetic */ C964730bDD LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C972480bPi(EnumC2231831CWv enumC2231831CWv, C964730bDD c964730bDD, long j) {
        super(0);
        this.LL = enumC2231831CWv;
        this.LLILLJJLI = c964730bDD;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = C972510bPl.LIZ[this.LL.ordinal()];
        if (i == 1) {
            this.LLILLJJLI.LLIIZ(this.LLILLL);
        } else if (i == 2) {
            this.LLILLJJLI.LLIZ(this.LLILLL);
        } else if (i == 3 || i == 4) {
            C964730bDD c964730bDD = this.LLILLJJLI;
            String.valueOf(this.LLILLL);
            c964730bDD.getClass();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on timeOut of type:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", and uid is ");
            sbLIZ.append(this.LLILLL);
            C1304630k3R.LJII(6, C2188811AlT.LIZIZ(sbLIZ), "RustCrossTimer");
        }
        return Unit.LIZ;
    }
}
