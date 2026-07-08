package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H67, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H67 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Class<? extends T> LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H67(InterfaceC665370Q7z interfaceC665370Q7z, Class cls, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = cls;
        this.LLILLL = interfaceC665370Q7z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", clazz: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scope: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
