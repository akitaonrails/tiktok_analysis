package X;

import android.content.Context;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1B3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198771B3r extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KQN LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2198771B3r(C0KQN c0kqn, Context context) {
        super(0);
        this.LL = c0kqn;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0KQN c0kqn = this.LL;
        Context context = this.LLILLJJLI;
        c0kqn.getClass();
        new C828330WeV(new ThirdPartyBizCert(C0KQN.LIZIZ)).LIZIZ(context, C0KQN.LIZ, new InterfaceC828360WeY() { // from class: X.1B3s
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context2, String str) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = str;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(C0KQN.LIZIZ);
                C1554300qY8.LIZIZ(context2, sparkThirdContext);
            }
        }, null);
        return Unit.LIZ;
    }
}
