package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10IL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IL extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10IL(int i, String str, String str2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Service] click uid mismatch strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" sender=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" current=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skip");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
