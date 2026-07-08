package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213930hh9 extends C09AY implements Function2<Integer, SearchKeyFramePoint, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213930hh9(C2248671Czp c2248671Czp) {
        super(2);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SearchKeyFramePoint searchKeyFramePoint) {
        num.intValue();
        SearchKeyFramePoint searchKeyFramePoint2 = searchKeyFramePoint;
        C1213920hh8 c1213920hh8 = this.LL.LLIZ;
        if (c1213920hh8 != null) {
            Float fValueOf = null;
            if (searchKeyFramePoint2 == null) {
                TuxTextView tuxTextView = c1213920hh8.LL;
                if (tuxTextView != null) {
                    tuxTextView.setText("");
                }
                c1213920hh8.LLILLJJLI = null;
            } else {
                SearchKeyFramePoint searchKeyFramePoint3 = c1213920hh8.LLILLJJLI;
                if (searchKeyFramePoint3 != null) {
                    fValueOf = Float.valueOf(searchKeyFramePoint3.LIZIZ);
                }
                if (!Intrinsics.LIZLLL(fValueOf, searchKeyFramePoint2.LIZIZ)) {
                    TuxTextView tuxTextView2 = c1213920hh8.LL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(searchKeyFramePoint2.title);
                    }
                    c1213920hh8.LLILLJJLI = searchKeyFramePoint2;
                }
            }
        }
        return Unit.LIZ;
    }
}
