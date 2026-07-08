package X;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844860y6m extends C09AY implements Function1<InterfaceC1844880y6o, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ExploreRecommendTopicListComponent LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844860y6m(boolean z, ExploreRecommendTopicListComponent exploreRecommendTopicListComponent, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = exploreRecommendTopicListComponent;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1844880y6o interfaceC1844880y6o) {
        float value = interfaceC1844880y6o.getValue();
        if (this.LL) {
            float f = 1;
            float f2 = (f - value) / f;
            ConstraintLayout constraintLayoutUp = this.LLILLJJLI.Up();
            if (constraintLayoutUp != null) {
                ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = this.LLILLJJLI;
                int i = this.LLILLL;
                ViewGroup.LayoutParams layoutParams = constraintLayoutUp.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = exploreRecommendTopicListComponent.LLLII - ((int) (i * f2));
                    C786410Ut5.W5(constraintLayoutUp, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            float f3 = value / 1.0f;
            ConstraintLayout constraintLayoutUp2 = this.LLILLJJLI.Up();
            if (constraintLayoutUp2 != null) {
                ExploreRecommendTopicListComponent exploreRecommendTopicListComponent2 = this.LLILLJJLI;
                int i2 = this.LLILLL;
                ViewGroup.LayoutParams layoutParams2 = constraintLayoutUp2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = exploreRecommendTopicListComponent2.LLLII - ((int) (i2 * (1 - f3)));
                    C786410Ut5.W5(constraintLayoutUp2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLILLJJLI.LJJIJL().findViewById(R.id.yf7);
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, value);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLILLJJLI.LJJIJL().findViewById(R.id.yf8);
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1 - value);
        }
        return Unit.LIZ;
    }
}
