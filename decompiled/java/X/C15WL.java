package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15WL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WL extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ C0PSL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15WL(String str, Boolean bool, C0PSL c0psl) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = c0psl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("\nforward: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("pageShowParams: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
