package X;

import com.ss.android.ugc.aweme.im.report.ReportUtils;

/* JADX INFO: renamed from: X.0Zr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.report.ReportUtils", f = "ReportUtils.kt", l = {190}, m = "applyDefaultSelectedMessages")
public final class C912530Zr1 extends AbstractC23140094w {
    public C912540Zr2 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ReportUtils LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912530Zr1(ReportUtils reportUtils, InterfaceC1364105Vn<? super C912530Zr1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = reportUtils;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportUtils@d61.applyDefaultSelectedMessages$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("ReportUtils@d61.applyDefaultSelectedMessages$1");
        return objLIZLLL;
    }
}
