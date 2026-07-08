package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202620hOu extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ Class<? extends InterfaceC494301wD> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202620hOu(InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends InterfaceC494301wD> cls) {
        super(0);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load ability, scope: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", host: ");
        sbLIZ.append(this.LL.getHost());
        sbLIZ.append(", clazz is ");
        sbLIZ.append(this.LLILLJJLI.getCanonicalName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
