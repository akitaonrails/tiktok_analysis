package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023130cjP extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC1023360cjm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023130cjP(AbstractC1023360cjm abstractC1023360cjm) {
        super(0);
        this.LL = abstractC1023360cjm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commerce_dynamic_params_");
        sbLIZ.append(this.LL.getAdBizScene().LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
