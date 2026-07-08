package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063080dlq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CommerceIBEService LL;
    public final /* synthetic */ IBEInfo LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ EnumC1063200dm2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063080dlq(CommerceIBEService commerceIBEService, IBEInfo iBEInfo, Activity activity, int i, Aweme aweme, Integer num, EnumC1063200dm2 enumC1063200dm2) {
        super(0);
        this.LL = commerceIBEService;
        this.LLILLJJLI = iBEInfo;
        this.LLILLL = activity;
        this.LLILZ = i;
        this.LLILZIL = aweme;
        this.LLILZLL = num;
        this.LLIZ = enumC1063200dm2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, new C1057930ddX(this.LLILLJJLI, new C1063150dlx(this.LLILZ, this.LLILZIL.getAid(), this.LLILZLL, this.LLIZ.getValue(), false, 16)), AFwS252S0000000_16.get$arr$(80), AFwS204S0000000_16.get$arr$(87));
        return Unit.LIZ;
    }
}
