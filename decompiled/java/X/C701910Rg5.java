package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701910Rg5 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC703670Riv<C701270Rf3> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701910Rg5(long j, InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv, String str) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = interfaceC703670Riv;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        C700170RdH c700170RdH = this.LLILLJJLI.getState().LIZIZ;
        sbLIZ.append(c700170RdH != null ? c700170RdH.LIZLLL : null);
        sbLIZ.append(" --- reduce ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
