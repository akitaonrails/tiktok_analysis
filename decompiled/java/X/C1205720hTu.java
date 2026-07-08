package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchViewModel$performAIChatStreamRequest$1$1", f = "EcAISearchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1205720hTu extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC1156400gCM<? extends n>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcAISearchViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205720hTu(EcAISearchViewModel ecAISearchViewModel, InterfaceC1364105Vn<? super C1205720hTu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecAISearchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1205720hTu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcAISearchViewModel@cbd8.performAIChatStreamRequest$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcAISearchViewModel.yQ2(this.LL, "net_flow_started_io", null, 6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcAISearchViewModel@cbd8.performAIChatStreamRequest$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AbstractC1156400gCM<? extends n>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
