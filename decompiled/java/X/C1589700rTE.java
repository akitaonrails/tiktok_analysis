package X;

import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589700rTE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589700rTE(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C21600219g8 c21600219g8Vo = this.LL.Vo();
        if (c21600219g8Vo != null) {
            Object objOo = this.LL.Oo();
            c21600219g8Vo.LJJIJ(objOo instanceof C1581690rGJ ? (PagerAdapter) objOo : null, true);
        }
        return Unit.LIZ;
    }
}
