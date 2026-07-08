package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.report.ReportReviewStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Orb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632610Orb extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C632090Oql LL;
    public final /* synthetic */ ReportReviewStatus LLILLJJLI;
    public final /* synthetic */ C05P1<C631220OpM> LLILLL;
    public final /* synthetic */ Function1<C632090Oql, Unit> LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C632610Orb(C632090Oql c632090Oql, ReportReviewStatus reportReviewStatus, C05P1<C631220OpM> c05p1, Function1<? super C632090Oql, Unit> function1, Fragment fragment, int i) {
        super(2);
        this.LL = c632090Oql;
        this.LLILLJJLI = reportReviewStatus;
        this.LLILLL = c05p1;
        this.LLILZ = function1;
        this.LLILZIL = fragment;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668890tWx.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
