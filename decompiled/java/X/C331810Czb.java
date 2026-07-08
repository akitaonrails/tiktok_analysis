package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.recommend.RecommendSlotResolver$resolve$2", f = "RecommendSlotResolver.kt", l = {31, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 66}, m = "invokeSuspend")
public final class C331810Czb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC331870Czh>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<UcpRecommendationItem> LLILZ;
    public final /* synthetic */ Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331810Czb(List<UcpRecommendationItem> list, Function2<? super List<? extends AbstractC331870Czh>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function22, InterfaceC1364105Vn<? super C331810Czb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = function2;
        this.LLILZLL = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331810Czb c331810Czb = new C331810Czb(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c331810Czb.LLILLL = obj;
        return c331810Czb;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[PHI: r0
      0x00e6: PHI (r0v12 int) = (r0v11 int), (r0v20 int) binds: [B:26:0x0096, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331810Czb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC331870Czh>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
