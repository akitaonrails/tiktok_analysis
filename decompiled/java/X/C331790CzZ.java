package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.recommend.RecommendSlotResolver$resolve$2$1$1$1$updatedSlot$1", f = "RecommendSlotResolver.kt", l = {44}, m = "invokeSuspend")
public final class C331790CzZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC331870Czh>, Object> {
    public int LL;
    public final /* synthetic */ UcpRecommendationItem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<AbstractC331870Czh> LLILZ;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331790CzZ(UcpRecommendationItem ucpRecommendationItem, int i, List<AbstractC331870Czh> list, Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function2, InterfaceC1364105Vn<? super C331790CzZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ucpRecommendationItem;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331790CzZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c08lm;
        C1C7U.LIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C331780CzY c331780CzY = new C331780CzY(this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(12000L, c331780CzY, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6 = (C189200o6) obj;
        if (c189200o6 != null) {
            c098200Yq = c189200o6.m10unboximpl();
        } else {
            c098200Yq = new C098200Yq(new Exception("PDP recommend enrich timed out after 12000ms"));
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            UcpRecommendationItem ucpRecommendationItem = (UcpRecommendationItem) obj2;
            if (ucpRecommendationItem == null) {
                ucpRecommendationItem = this.LLILLJJLI;
            }
            c08lm = new C0D0F(ucpRecommendationItem, this.LLILLL);
        } else {
            c08lm = new C08LM(((AbstractC331870Czh) ListProtector.get(this.LLILZ, this.LLILLL)).getSlotKey(), this.LLILLL, false);
        }
        C1C7U.LIZIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1");
        return c08lm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC331870Czh> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
