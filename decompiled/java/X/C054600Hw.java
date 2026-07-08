package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054600Hw extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C054600Hw(String str, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("produceFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewProgressProduceSize= ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
