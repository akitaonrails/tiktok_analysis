package X;

import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569330qwN extends C09AY implements Function0<HomePageDataViewModel> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569330qwN(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HomePageDataViewModel invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return C680080Qly.LIZIZ(c19egLIZ);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
