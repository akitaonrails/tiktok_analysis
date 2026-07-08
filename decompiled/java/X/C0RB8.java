package X;

import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.report.TUCReportMaskAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RB8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RB8 extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ FeedVideoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RB8(FeedVideoAssem feedVideoAssem) {
        super(1);
        this.LL = feedVideoAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        this.LL.getClass();
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLILLL = C13LE.LIZ(TUCReportMaskAssem.class);
        c0rtb2.LLJI = R.id.view_rootview;
        FeedVideoAssem feedVideoAssem = this.LL;
        C694070RKj c694070RKj = C694070RKj.LIZIZ;
        feedVideoAssem.getClass();
        c0rtb2.LLILZIL = FeedVideoAssem.ep(c694070RKj);
        return Unit.LIZ;
    }
}
