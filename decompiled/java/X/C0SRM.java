package X;

import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SRM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRM extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ double LL;
    public final /* synthetic */ C0SRZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SRM(double d, C0SRZ c0srz) {
        super(1);
        this.LL = d;
        this.LLILLJJLI = c0srz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        PostModeDetailFragment postModeDetailFragment;
        if (f.floatValue() >= this.LL) {
            C1590400rUM c1590400rUMLH = this.LLILLJJLI.LH();
            CommonPageFragment commonPageFragmentLJJIJLIJ = null;
            if (c1590400rUMLH != null) {
                commonPageFragmentLJJIJLIJ = c1590400rUMLH.LJJIJLIJ("PostModeDetailFragment");
            }
            if ((commonPageFragmentLJJIJLIJ instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) commonPageFragmentLJJIJLIJ) != null) {
                postModeDetailFragment.aS(false);
            }
        }
        return Unit.LIZ;
    }
}
