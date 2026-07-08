package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.artifact.AIGCWorkflowArtifactFactoryImpl;

/* JADX INFO: renamed from: X.09En, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.artifact.AIGCWorkflowArtifactFactoryImpl", f = "AIGCWorkflowArtifactFactoryImpl.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 144}, m = "getValue")
public final class C2339109En extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCWorkflowArtifactFactoryImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2339109En(AIGCWorkflowArtifactFactoryImpl aIGCWorkflowArtifactFactoryImpl, InterfaceC1364105Vn<? super C2339109En> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIGCWorkflowArtifactFactoryImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowArtifactFactoryImpl@9f6e.getValue$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowArtifactFactoryImpl@9f6e.getValue$1");
        return objLIZIZ;
    }
}
