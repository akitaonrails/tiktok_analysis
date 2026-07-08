package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570280qxu extends C09AY implements Function0<C1570300qxw> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570280qxu(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1570300qxw invoke() {
        IMFAbility iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IMFAbility.class, null);
        if (iMFAbility != null) {
            return iMFAbility.Q61();
        }
        return null;
    }
}
