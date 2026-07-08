package X;

import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7Y extends C09AY implements Function2<View, C643400PLm, C643400PLm> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C0H81 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Float LLILZIL;
    public final /* synthetic */ SearchKeyFramePoint LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H7Y(ImageView imageView, Aweme aweme, C0H81 c0h81, int i, Float f, SearchKeyFramePoint searchKeyFramePoint) {
        super(2);
        this.LL = imageView;
        this.LLILLJJLI = aweme;
        this.LLILLL = c0h81;
        this.LLILZ = i;
        this.LLILZIL = f;
        this.LLILZLL = searchKeyFramePoint;
    }

    @Override // kotlin.jvm.functions.Function2
    public final C643400PLm invoke(View view, C643400PLm c643400PLm) {
        ISearchContextAbility iSearchContextAbilityLIZ;
        View view2 = view;
        C643400PLm c643400PLm2 = c643400PLm;
        if (Intrinsics.LJFF(view2, this.LL)) {
            C435800H7a c435800H7a = new C435800H7a(this.LLILLJJLI, ((C0H7X) this.LLILLL).LIZ, "click_chapter", Integer.valueOf(this.LLILZ));
            Aweme aweme = this.LLILLJJLI;
            View viewLIZ = C0H7Z.LIZ(view2);
            Float fValueOf = null;
            if (viewLIZ != null) {
                iSearchContextAbilityLIZ = C0Q3E.LIZ(viewLIZ);
            } else {
                iSearchContextAbilityLIZ = null;
            }
            C650450PfH.LIZ(c435800H7a, viewLIZ, aweme, iSearchContextAbilityLIZ, false);
            c435800H7a.LJIILJJIL();
            Float f = this.LLILZIL;
            if (f != null) {
                SearchKeyFramePoint searchKeyFramePoint = this.LLILZLL;
                f.floatValue();
                fValueOf = Float.valueOf((searchKeyFramePoint.secondStart * 1000.0f) / f.floatValue());
            }
            return C643400PLm.LIZ(c643400PLm2, null, false, null, fValueOf, 229375);
        }
        return c643400PLm2;
    }
}
