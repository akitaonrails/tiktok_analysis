package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jLT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277370jLT extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277370jLT(String str, String str2, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("original url: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", source: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", decoded url: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
