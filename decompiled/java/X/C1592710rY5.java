package X;

import android.content.Context;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592710rY5 extends C09AY implements Function0<Integer> {
    public final /* synthetic */ TabAnimationTransformerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592710rY5(TabAnimationTransformerV2 tabAnimationTransformerV2) {
        super(0);
        this.LL = tabAnimationTransformerV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context contextLIZ;
        C1592450rXf c1592450rXf = this.LL.LLILLL;
        if (c1592450rXf == null || (contextLIZ = c1592450rXf.getContext()) == null) {
            contextLIZ = C1BWL.LIZ();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, contextLIZ);
        return Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : 0);
    }
}
