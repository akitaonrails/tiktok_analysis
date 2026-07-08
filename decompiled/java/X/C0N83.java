package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N83, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N83 extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0N23 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N83(String str, C0N23 c0n23) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c0n23;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", vl= ");
        sbLIZ.append(this.LLILLJJLI.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
