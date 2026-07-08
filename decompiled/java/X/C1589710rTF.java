package X;

import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589710rTF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ HomeViewPagerAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Bundle LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589710rTF(HomeViewPagerAssem homeViewPagerAssem, int i, Bundle bundle) {
        super(0);
        this.LL = homeViewPagerAssem;
        this.LLILLJJLI = i;
        this.LLILLL = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Hox hox = this.LL.LLJJIJI;
        if (hox != null) {
            hox.xQ2(this.LLILLJJLI, this.LLILLL, "HOME");
        }
        return Unit.LIZ;
    }
}
