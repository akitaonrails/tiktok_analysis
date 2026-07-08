package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565115dZ extends C09AY implements Function0<String> {
    public final /* synthetic */ C20565515dd LL;
    public final /* synthetic */ List<Double> LLILLJJLI;
    public final /* synthetic */ double LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20565115dZ(C20565515dd c20565515dd, List<Double> list, double d) {
        super(0);
        this.LL = c20565515dd;
        this.LLILLJJLI = list;
        this.LLILLL = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[getTransYRegularV1] tag ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(", results ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", result ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
