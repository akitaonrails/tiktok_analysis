package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704230Rjp extends C09AY implements Function0<HomePageViewPagerAbility> {
    public final /* synthetic */ C704220Rjo LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C704230Rjp(C704220Rjo c704220Rjo, Context context) {
        super(0);
        this.LL = c704220Rjo;
        this.LLILLJJLI = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.01wD, com.ss.android.ugc.aweme.base.HomePageViewPagerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HomePageViewPagerAbility invoke() {
        if (C297720Bli.LIZ()) {
            return this.LL.getHomePagerAbilityDi();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
        if (c19egLIZIZ != null) {
            return C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), HomePageViewPagerAbility.class, null);
        }
        return null;
    }
}
