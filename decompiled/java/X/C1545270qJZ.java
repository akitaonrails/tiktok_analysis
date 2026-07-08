package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545270qJZ extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1547330qMt LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1545270qJZ(String str, InterfaceC1547330qMt interfaceC1547330qMt, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC1547330qMt;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("actionType: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", params: ");
        sbLIZ.append(this.LLILLJJLI.getParams());
        sbLIZ.append(", executeCallbackAction callBackAction: ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
