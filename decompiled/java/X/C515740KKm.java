package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515740KKm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C515710KKj LL;
    public final /* synthetic */ C518080KTm LLILLJJLI;
    public final /* synthetic */ C515770KKp LLILLL;
    public final /* synthetic */ HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> LLILZ;
    public final /* synthetic */ C0KJX LLILZIL;
    public final /* synthetic */ C0KH1 LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515740KKm(C515710KKj c515710KKj, C518080KTm c518080KTm, C515770KKp c515770KKp, HashMap map, C0KJX c0kjx, C0KH1 c0kh1, C515760KKo c515760KKo) {
        super(0);
        this.LL = c515710KKj;
        this.LLILLJJLI = c518080KTm;
        this.LLILLL = c515770KKp;
        this.LLILZ = map;
        this.LLILZIL = c0kjx;
        this.LLILZLL = c0kh1;
        this.LLIZ = c515760KKo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C515710KKj c515710KKj = this.LL;
        int i = this.LLILLJJLI.LIZIZ;
        C515770KKp c515770KKp = this.LLILLL;
        HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map = this.LLILZ;
        c515710KKj.LIZJ(i, c515770KKp, map, new C515680KKg(this.LLILZIL, map, this.LLILZLL), new C515800KKs(this.LLIZ));
        return Unit.LIZ;
    }
}
