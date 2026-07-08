package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18GA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GA extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18GA(String str, String str2, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("neither view nor fragment\nschema: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("\npage: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\ndefaultPageBtm: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
