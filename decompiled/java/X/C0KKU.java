package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KKU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KKU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C515770KKp LL;
    public final /* synthetic */ C0KJX LLILLJJLI;
    public final /* synthetic */ HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> LLILLL;
    public final /* synthetic */ C515700KKi LLILZ;
    public final /* synthetic */ C0KH1 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KKU(C515770KKp c515770KKp, C0KJX c0kjx, HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map, C515700KKi c515700KKi, C0KH1 c0kh1) {
        super(0);
        this.LL = c515770KKp;
        this.LLILLJJLI = c0kjx;
        this.LLILLL = map;
        this.LLILZ = c515700KKi;
        this.LLILZIL = c0kh1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C515770KKp c515770KKp = this.LL;
        c515770KKp.LIZJ = Boolean.TRUE;
        if (c515770KKp.LIZ()) {
            C0KJX c0kjx = this.LLILLJJLI;
            EnumC513490KBv enumC513490KBv = c0kjx.LJII;
            if (enumC513490KBv != EnumC513490KBv.PLAN_CHANGE) {
                C513500KBw.LJFF(c0kjx.LIZ, c0kjx.LIZJ, enumC513490KBv, this.LLILLL);
            }
            this.LLILLJJLI.LJIIJ.LIZIZ();
            this.LLILLJJLI.LJIIJ.LJ(this.LLILLL, this.LLILZIL);
            C513940KDo.LJIILL(this.LLILLL);
        }
        return Unit.LIZ;
    }
}
