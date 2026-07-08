package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.TopTabLayoutAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591970rWt extends C09AY implements Function0<AbstractC1591090rVT> {
    public final /* synthetic */ TopTabLayoutAbility LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591970rWt(TopTabLayoutAbility topTabLayoutAbility) {
        super(0);
        this.LL = topTabLayoutAbility;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1591090rVT invoke() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.LLILZ);
        TopTabLayoutAbility topTabLayoutAbility = this.LL;
        if (c19egLIZIZ != null) {
            return C1591880rWk.LIZIZ.LJIILL(c19egLIZIZ).y01();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find activity by context ");
        sbLIZ.append(topTabLayoutAbility.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
