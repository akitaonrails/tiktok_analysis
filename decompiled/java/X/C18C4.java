package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18C4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C4 extends C09AY implements Function0<Object> {
    public final /* synthetic */ C21244318Bt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18C4(C21244318Bt c21244318Bt) {
        super(0);
        this.LL = c21244318Bt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("btm=");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" bcm=");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(" pageFinder=");
        sbLIZ.append(C18BA.LIZ(this.LL.LIZIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
