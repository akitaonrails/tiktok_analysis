package X;

import com.bytedance.android.livesdk.billboard.BillboardService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0152, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0152 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BillboardService LL;
    public final /* synthetic */ C2757014x LLILLJJLI;
    public final /* synthetic */ C011V LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0152(BillboardService billboardService, C2757014x c2757014x, C011V c011v, Long l) {
        super(0);
        this.LL = billboardService;
        this.LLILLJJLI = c2757014x;
        this.LLILLL = c011v;
        this.LLILZ = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, true);
        return Unit.LIZ;
    }
}
