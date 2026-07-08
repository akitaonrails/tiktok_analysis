package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196550hF7 extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ InterfaceC1554640qYg LLILLJJLI;
    public final /* synthetic */ Class<? extends InterfaceC494301wD> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196550hF7(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC1554640qYg interfaceC1554640qYg, Class<? extends InterfaceC494301wD> cls) {
        super(0);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = interfaceC1554640qYg;
        this.LLILLL = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load ability for ");
        sbLIZ.append(this.LL.getHost());
        sbLIZ.append(", container is ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clazz is ");
        sbLIZ.append(this.LLILLL.getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
