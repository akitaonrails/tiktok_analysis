package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NBL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBL extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NBL(String str, String str2, String str3, String str4) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" -- recordClickProxy#");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
