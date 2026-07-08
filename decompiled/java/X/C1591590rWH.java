package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591590rWH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainTabStrip LL;
    public final /* synthetic */ C1592450rXf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591590rWH(MainTabStrip mainTabStrip, C1592450rXf c1592450rXf) {
        super(0);
        this.LL = mainTabStrip;
        this.LLILLJJLI = c1592450rXf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj;
        C1591980rWu c1591980rWu = this.LL.LLJJ;
        String string = (c1591980rWu == null || (obj = c1591980rWu.LJ) == null) ? null : obj.toString();
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        MainTabStrip mainTabStrip = this.LL;
        C324480Cnm.LIZ(string, c1592450rXf, mainTabStrip.LLILLL, mainTabStrip.LJII(), true, true);
        return Unit.LIZ;
    }
}
