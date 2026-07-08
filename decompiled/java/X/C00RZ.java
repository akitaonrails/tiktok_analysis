package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00RZ extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00RZ(boolean z, String str) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsMinMiniOspSession ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
