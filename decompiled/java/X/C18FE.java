package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FE extends C09AY implements Function0<Object> {
    public final /* synthetic */ C118300cf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FE(C118300cf c118300cf) {
        super(0);
        this.LL = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre ");
        sbLIZ.append(this.LL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
