package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;

/* JADX INFO: renamed from: X.0nb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1440790nb3<R extends BaseCompileConfigParams> implements InterfaceC1440780nb2<R> {
    public final InterfaceC1440780nb2<R> LIZ;

    public abstract void LIZ(R r);

    @Override // X.InterfaceC1440780nb2
    public final R execute() {
        R r = (R) this.LIZ.execute();
        r.setCurStage(getStage());
        r.setCurStrategyName(getName());
        r.setCurPriority(getPriority());
        LIZ(r);
        return r;
    }

    public AbstractC1440790nb3(InterfaceC1440780nb2<R> interfaceC1440780nb2) {
        this.LIZ = interfaceC1440780nb2;
    }
}
