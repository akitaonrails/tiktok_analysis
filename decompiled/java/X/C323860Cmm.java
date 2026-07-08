package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323860Cmm extends C09AY implements Function1<C1834780xqW, C1834780xqW> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323860Cmm(boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1834780xqW invoke(C1834780xqW c1834780xqW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Highlight not support music. isHighlightVideo:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isVideoGenerated: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", disable: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('.');
        return C1834780xqW.LIZ(c1834780xqW, null, null, null, null, null, null, null, null, null, null, null, null, new C491001vg(new C323870Cmn(-1L, -1L, C2188811AlT.LIZIZ(sbLIZ), new Exception())), null, null, null, null, null, null, 520191);
    }
}
