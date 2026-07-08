package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701920Rg6 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC703670Riv<C701270Rf3> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701920Rg6(long j, InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv, String str, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = interfaceC703670Riv;
        this.LLILLL = str;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        C700170RdH c700170RdH = this.LLILLJJLI.getState().LIZIZ;
        sbLIZ.append(c700170RdH != null ? c700170RdH.LIZLLL : null);
        sbLIZ.append(" --- reduce ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" end, duration: ");
        sbLIZ.append(this.LL - this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
