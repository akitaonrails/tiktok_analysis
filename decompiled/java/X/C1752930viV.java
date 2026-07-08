package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS10S0302000_26;

/* JADX INFO: renamed from: X.0viV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752930viV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1752920viU LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ Feed LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752930viV(int i, int i2, Feed feed, C1752920viU c1752920viU, Map map) {
        super(0);
        this.LL = c1752920viU;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = map;
        this.LLILZIL = feed;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ECBaseFragment eCBaseFragment = this.LL.LL;
        C049K c049k = new C049K();
        C1752920viU c1752920viU = this.LL;
        C1748720vbi.LIZIZ(eCBaseFragment, c049k, new AwS10S0302000_26(this.LLILLJJLI, this.LLILLL, this.LLILZIL, c1752920viU, this.LLILZ, 3));
        return Unit.LIZ;
    }
}
