package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309310CAn extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC309290CAl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C309310CAn(AbstractC309290CAl abstractC309290CAl) {
        super(0);
        this.LL = abstractC309290CAl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZJ());
        sbLIZ.append("_keva_value_preload");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
