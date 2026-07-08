package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS51S2100000_8;
import kotlin.jvm.internal.AwS7S0220000_8;

/* JADX INFO: renamed from: X.0LjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551060LjM extends C09AY implements Function1<C552780Lm8, Unit> {
    public final /* synthetic */ C545510LaP<C550580Lia<Object>> LL;
    public final /* synthetic */ Function2<C552780Lm8, Object, Unit> LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C550560LiY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C551060LjM(C545510LaP<C550580Lia<Object>> c545510LaP, Function2<? super C552780Lm8, Object, Unit> function2, CreativeInfo creativeInfo, boolean z, boolean z2, C550560LiY c550560LiY) {
        super(1);
        this.LL = c545510LaP;
        this.LLILLJJLI = function2;
        this.LLILLL = creativeInfo;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c550560LiY;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C552780Lm8 c552780Lm8) {
        C552780Lm8 c552780Lm82 = c552780Lm8;
        String str = c552780Lm82.LIZ;
        c552780Lm82.LIZIZ = (AIGCWorkflowConfig) new AwS51S2100000_8((AbstractC551020LjI) this.LL, (AbstractC551020LjI<C550580Lia<Object>>) "", "", (String) 1).invoke();
        AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8((C545510LaP) this.LL, (C545510LaP<C550580Lia<Object>>) str, (String) 17);
        C551080LjO c551080LjO = new C551080LjO();
        awS122S1100000_8.invoke(c551080LjO);
        c552780Lm82.LIZJ.putAll(c551080LjO.LIZ);
        c552780Lm82.LIZ(new AwS7S0220000_8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 1));
        this.LLILLJJLI.invoke(c552780Lm82, this.LL.LJIIJ.LIZJ);
        return Unit.LIZ;
    }
}
