package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FX extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FX(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", nativeState is not resumed, result is true");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
