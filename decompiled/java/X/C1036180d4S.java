package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0d4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036180d4S extends C09AY implements Function1<C1036260d4a, Unit> {
    public final /* synthetic */ AdWebSparkFragment LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036180d4S(AdWebSparkFragment adWebSparkFragment, float f) {
        super(1);
        this.LL = adWebSparkFragment;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1036260d4a c1036260d4a) {
        C1036260d4a c1036260d4a2 = c1036260d4a;
        c1036260d4a2.LIZ = this.LL.getString(2131858245);
        c1036260d4a2.LJ = new AwS560S0100000_16(this.LL, 804);
        c1036260d4a2.LIZIZ = Float.valueOf(this.LLILLJJLI * 18.0f);
        c1036260d4a2.LIZJ = Boolean.valueOf(!C0H4W.LIZ());
        c1036260d4a2.LIZLLL = Integer.valueOf((int) (96 * this.LLILLJJLI));
        return Unit.LIZ;
    }
}
