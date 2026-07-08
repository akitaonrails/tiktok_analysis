package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinSetFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S0400000_26;

/* JADX INFO: renamed from: X.0upy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719120upy extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PinSetRouteArg LLILLL;
    public final /* synthetic */ PinSetFragment LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719120upy(String str, String str2, PinSetRouteArg pinSetRouteArg, PinSetFragment pinSetFragment, C259800zU<String> c259800zU, Map<String, String> map) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = pinSetRouteArg;
        this.LLILZ = pinSetFragment;
        this.LLILZIL = c259800zU;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        c1397630mTR2.LIZJ(0, this.LL, new AwS121S0400000_26(this.LLILLL, this.LLILZ, this.LLILZLL, this.LLILZIL, 0));
        String str = this.LLILLJJLI;
        PinSetFragment pinSetFragment = this.LLILZ;
        c1397630mTR2.LIZJ(1, str, new AwS121S0400000_26(this.LLILLL, pinSetFragment, this.LLILZLL, this.LLILZIL, 1));
        return Unit.LIZ;
    }
}
