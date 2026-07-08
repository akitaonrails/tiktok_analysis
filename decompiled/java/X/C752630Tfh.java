package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Tfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752630Tfh extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ TTPlusCardData LLILLJJLI;
    public final /* synthetic */ C05P1<Boolean> LLILLL;
    public final /* synthetic */ C05P1<Boolean> LLILZ;
    public final /* synthetic */ C05P1<Boolean> LLILZIL;
    public final /* synthetic */ C05P1<Boolean> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752630Tfh(Context context, TTPlusCardData tTPlusCardData, C05P1<Boolean> c05p1, C05P1<Boolean> c05p12, C05P1<Boolean> c05p13, C05P1<Boolean> c05p14, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = tTPlusCardData;
        this.LLILLL = c05p1;
        this.LLILZ = c05p12;
        this.LLILZIL = c05p13;
        this.LLILZLL = c05p14;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = function03;
        this.LLJI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667030tTx.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1));
        return Unit.LIZ;
    }
}
