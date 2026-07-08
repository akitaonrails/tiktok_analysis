package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20288114Zz extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ FeedSurvey LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ VerticalViewPager LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20288114Zz(FeedSurvey feedSurvey, Aweme aweme, VerticalViewPager verticalViewPager, int i, int i2, int i3, Context context) {
        super(1);
        this.LL = feedSurvey;
        this.LLILLJJLI = aweme;
        this.LLILLL = verticalViewPager;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        if (C123100dR.LIZ(this.LL.submitText)) {
            c1397630mTR2.LIZJ(0, this.LL.submitText, new C20287914Zx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ));
            ((C1397650mTT) ListProtector.get(c1397630mTR2.LJ, 0)).LIZIZ(false);
        }
        if (C123100dR.LIZ(this.LL.cancelText)) {
            c1397630mTR2.LIZJ(1, this.LL.cancelText, new C20288714a5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        }
        return Unit.LIZ;
    }
}
