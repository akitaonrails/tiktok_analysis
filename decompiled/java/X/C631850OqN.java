package X;

import com.ss.android.ugc.aweme.music.assem.report.compose.ReportDetailsFragmentCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631850OqN extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ReportDetailsFragmentCompose LL;
    public final /* synthetic */ C05P1<C597100NbQ> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631850OqN(ReportDetailsFragmentCompose reportDetailsFragmentCompose, C05P1<C597100NbQ> c05p1, String str, int i) {
        super(2);
        this.LL = reportDetailsFragmentCompose;
        this.LLILLJJLI = c05p1;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.MR(this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
