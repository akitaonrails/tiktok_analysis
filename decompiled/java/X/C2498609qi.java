package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$clipVideoAndGenerate$1$resolvedPath$1", f = "EPAIGCPanelRootComponent.kt", l = {}, m = "invokeSuspend")
public final class C2498609qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C378920EtO LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ AIGCGenerationParam LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498609qi(C378920EtO c378920EtO, Activity activity, AIGCGenerationParam aIGCGenerationParam, InterfaceC1364105Vn<? super C2498609qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c378920EtO;
        this.LLILLJJLI = activity;
        this.LLILLL = aIGCGenerationParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2498609qi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$resolvedPath$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strM5 = this.LL.M5(this.LLILLJJLI, this.LLILLL.imagePath);
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$resolvedPath$1");
        return strM5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
