package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.DescriptionDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRQ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ DescriptionDetail LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TRQ(DescriptionDetail descriptionDetail, Context context, Function0<Unit> function0, int i) {
        super(2);
        this.LL = descriptionDetail;
        this.LLILLJJLI = context;
        this.LLILLL = function0;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667030tTx.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
