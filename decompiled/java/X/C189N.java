package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.189N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189N extends C09AY implements Function0<Object> {
    public C189N() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadBcmConfig from cache, success=");
        sbLIZ.append(!C18A2.LIZ.bcmInChain.isEmpty());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
