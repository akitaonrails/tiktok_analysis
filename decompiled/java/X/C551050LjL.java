package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS51S2100000_8;

/* JADX INFO: renamed from: X.0LjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551050LjL extends C09AY implements Function1<C552780Lm8, Unit> {
    public final /* synthetic */ C545520LaQ<C550580Lia<Object>> LL;
    public final /* synthetic */ Function2<C552780Lm8, Object, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C551050LjL(C545520LaQ<C550580Lia<Object>> c545520LaQ, Function2<? super C552780Lm8, Object, Unit> function2, boolean z, CreativeInfo creativeInfo, boolean z2) {
        super(1);
        this.LL = c545520LaQ;
        this.LLILLJJLI = function2;
        this.LLILLL = z;
        this.LLILZ = creativeInfo;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C552780Lm8 c552780Lm8) {
        C552780Lm8 c552780Lm82 = c552780Lm8;
        String str = c552780Lm82.LIZ;
        c552780Lm82.LIZIZ = (AIGCWorkflowConfig) new AwS51S2100000_8((AbstractC551020LjI) this.LL, (AbstractC551020LjI<C550580Lia<Object>>) "", "", (String) 1).invoke();
        C551040LjK c551040LjK = new C551040LjK(this.LL, str, this.LLILLL);
        C551080LjO c551080LjO = new C551080LjO();
        c551040LjK.invoke(c551080LjO);
        c552780Lm82.LIZJ.putAll(c551080LjO.LIZ);
        c552780Lm82.LIZ(new C551090LjP(this.LLILZ, this.LLILZIL, this.LLILLL));
        this.LLILLJJLI.invoke(c552780Lm82, this.LL.LJI.LIZJ);
        return Unit.LIZ;
    }
}
