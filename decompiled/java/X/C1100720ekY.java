package X;

import com.bytedance.android.livesdk.livesetting.performance.Metrics2BizMapping;

/* JADX INFO: renamed from: X.0ekY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.performance.metrics.autoadaptive.tasks.StrategyAlgorithmTask", f = "StrategyAlgorithmTask.kt", l = {120}, m = "run")
public final class C1100720ekY extends AbstractC23140094w {
    public float LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Metrics2BizMapping LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C1100710ekX LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100720ekY(C1100710ekX c1100710ekX, InterfaceC1364105Vn<? super C1100720ekY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c1100710ekX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyAlgorithmTask@d9c6.run$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJI.LIZJ(this);
        C1C7U.LIZIZ("StrategyAlgorithmTask@d9c6.run$1");
        return objLIZJ;
    }
}
