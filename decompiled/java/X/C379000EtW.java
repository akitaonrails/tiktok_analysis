package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;

/* JADX INFO: renamed from: X.0EtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent", f = "EPAIGCPanelRootComponent.kt", l = {1363, 1367, 1390}, m = "faceDetectAndGenerateI2V")
public final class C379000EtW extends AbstractC23140094w {
    public AIGCGenerationParam LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C378920EtO LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C379000EtW(C378920EtO c378920EtO, InterfaceC1364105Vn<? super C379000EtW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c378920EtO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.faceDetectAndGenerateI2V$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objH2 = this.LLILZ.H2(null, null, this);
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.faceDetectAndGenerateI2V$1");
        return objH2;
    }
}
