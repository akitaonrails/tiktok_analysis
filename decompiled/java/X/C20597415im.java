package X;

import androidx.fragment.app.FragmentManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS308S0300000_31;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: renamed from: X.15im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20597415im extends C09AY implements Function0<FragmentManager> {
    public final /* synthetic */ C199Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20597415im(C199Y c199y) {
        super(0);
        this.LL = c199y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FragmentManager invoke() {
        if (this.LL.getEnableNavigation() && !this.LL.onlyOnePageWhenNavigationOpen()) {
            return C20622715mr.LIZ(super/*X.19EG*/.getSupportFragmentManager(), this.LL);
        }
        FragmentManager supportFragmentManager = super/*X.19EG*/.getSupportFragmentManager();
        C199Y c199y = this.LL;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        c199y.getAbility().LIZIZ(new AwS432S0200000_31(c199y, concurrentHashMap, 76));
        return new C824860WXk(supportFragmentManager, new AwS408S0200000_7(supportFragmentManager, c199y, 28), new AwS308S0300000_31(concurrentHashMap, c199y, supportFragmentManager, 2), new AwS240S0300000_31(concurrentHashMap, c199y, supportFragmentManager, 32));
    }
}
