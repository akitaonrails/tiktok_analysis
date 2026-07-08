package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07WD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WD extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07WD(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[deleteItemInternal], ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
