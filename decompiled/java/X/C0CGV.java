package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CGV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGV extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CGV(String str, C118300cf c118300cf, C259800zU<String> c259800zU) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPageBtmWithSchemaFailedMultiMatched\nschema: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("\nmatchCounts: ");
        sbLIZ.append(this.LLILLJJLI.element);
        sbLIZ.append("\npageBtm: ");
        sbLIZ.append(this.LLILLL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
