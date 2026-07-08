package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FI extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC21251518En LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FI(String str, String str2, EnumC21251518En enumC21251518En) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC21251518En;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(',');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" register\nreason: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
