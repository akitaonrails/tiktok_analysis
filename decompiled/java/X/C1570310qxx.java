package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570310qxx extends C09AY implements Function0<ITabStrip> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570310qxx(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ITabStrip invoke() {
        C1570300qxw c1570300qxw = (C1570300qxw) this.LL.LLJIJIL.getValue();
        if (c1570300qxw != null) {
            return c1570300qxw.LLILLJJLI;
        }
        return null;
    }
}
