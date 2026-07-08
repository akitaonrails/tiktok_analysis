package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1520205xI extends C09AY implements Function0<String> {
    public final /* synthetic */ Class<? extends T> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ InterfaceC494301wD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520205xI(InterfaceC494301wD interfaceC494301wD, Class cls, String str) {
        super(0);
        this.LL = cls;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC494301wD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try find ability for ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LL.getCanonicalName());
        sbLIZ.append(", tag ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", result > ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
