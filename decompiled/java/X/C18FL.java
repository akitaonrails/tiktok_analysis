package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FL extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC21251518En LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FL(String str, EnumC21251518En enumC21251518En) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC21251518En;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", result is ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" by super");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
