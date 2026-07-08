package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TP5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TP5 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1674230tfZ LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AdFreeTrialPageInfo LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C20656615sK LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TP5(C1674230tfZ c1674230tfZ, Context context, AdFreeTrialPageInfo adFreeTrialPageInfo, int i, C20656615sK c20656615sK, Function0<Unit> function0, int i2) {
        super(2);
        this.LL = c1674230tfZ;
        this.LLILLJJLI = context;
        this.LLILLL = adFreeTrialPageInfo;
        this.LLILZ = i;
        this.LLILZIL = c20656615sK;
        this.LLILZLL = function0;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1));
        return Unit.LIZ;
    }
}
