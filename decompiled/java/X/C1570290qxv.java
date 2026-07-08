package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570290qxv extends C09AY implements Function0<InterfaceC1589690rTD> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570290qxv(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1589690rTD invoke() {
        InterfaceC1589690rTD interfaceC1589690rTD;
        C1570300qxw c1570300qxw = (C1570300qxw) this.LL.LLJIJIL.getValue();
        if (c1570300qxw != null && (interfaceC1589690rTD = c1570300qxw.LL) != null) {
            return interfaceC1589690rTD;
        }
        IMFAbility iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IMFAbility.class, null);
        if (iMFAbility != null) {
            return iMFAbility.en1();
        }
        return null;
    }
}
