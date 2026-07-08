package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516070KLt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C515900KLc LL;
    public final /* synthetic */ C518150KTt LLILLJJLI;
    public final /* synthetic */ C516110KLx LLILLL;
    public final /* synthetic */ HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> LLILZ;
    public final /* synthetic */ C0KLA LLILZIL;
    public final /* synthetic */ C0KCK LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516070KLt(C515900KLc c515900KLc, C518150KTt c518150KTt, C516110KLx c516110KLx, HashMap map, C0KLA c0kla, C0KCK c0kck, AwS136S0400000_7 awS136S0400000_7) {
        super(0);
        this.LL = c515900KLc;
        this.LLILLJJLI = c518150KTt;
        this.LLILLL = c516110KLx;
        this.LLILZ = map;
        this.LLILZIL = c0kla;
        this.LLILZLL = c0kck;
        this.LLIZ = awS136S0400000_7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC1792020wjY enumC1792020wjY;
        C515900KLc c515900KLc = this.LL;
        C0KQW c0kqw = this.LLILLJJLI.LIZJ;
        int value = (c0kqw == null || (enumC1792020wjY = c0kqw.LIZ) == null) ? 0 : enumC1792020wjY.getValue();
        C516110KLx c516110KLx = this.LLILLL;
        HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map = this.LLILZ;
        c515900KLc.LIZLLL(value, c516110KLx, map, new AwS251S0300000_7(this.LLILZIL, (C0KLA) map, (HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>>) this.LLILZLL, (C0KCK) 13), new AwS551S0100000_7(this.LLIZ, (Function0<Unit>) 574));
        return Unit.LIZ;
    }
}
