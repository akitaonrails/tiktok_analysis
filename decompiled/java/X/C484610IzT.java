package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.strategycenter.TTMStrategyRule;
import com.tiktok.strategycenter.TTMStrategyRunCallBack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.room.StrategyTrigger;

/* JADX INFO: renamed from: X.0IzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484610IzT {
    public final StrategyTrigger LIZ;
    public final boolean LIZIZ;
    public final Handler LIZJ;
    public Function1<? super Long, Unit> LIZLLL;

    public final void LIZIZ() {
        StrategyTrigger strategyTrigger = this.LIZ;
        if (strategyTrigger.triggerByCep) {
            if (!this.LIZIZ) {
                C472880IgY.LIZ.put(strategyTrigger.triggerId, strategyTrigger);
                return;
            }
            TTMStrategyCenter tTMStrategyCenter = TTMStrategyCenter.getInstance();
            StrategyTrigger strategyTrigger2 = this.LIZ;
            tTMStrategyCenter.registerBizCepRule("live_increase_sdk", new TTMStrategyRule(strategyTrigger2.cepRuleName, strategyTrigger2.cepExpression));
            TTMStrategyCenter.getInstance().registerBizCepCallback("live_increase_sdk", this.LIZ.cepRuleName, new TTMStrategyRunCallBack() { // from class: X.0IzX
                @Override // com.tiktok.strategycenter.TTMStrategyRunCallBack
                public final void run(TTMStrategyResult tTMStrategyResult) {
                    this.LIZ.LIZ(tTMStrategyResult);
                }
            });
        }
    }

    public final void LIZ(TTMStrategyResult tTMStrategyResult) {
        Function1<? super Long, Unit> function1;
        if (tTMStrategyResult != null && tTMStrategyResult.getError() == null && tTMStrategyResult != null && tTMStrategyResult.isSuccess() && (function1 = this.LIZLLL) != null) {
            function1.invoke(0L);
        }
    }

    public C484610IzT(StrategyTrigger strategyTrigger, boolean z) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = strategyTrigger;
        this.LIZIZ = z;
        this.LIZJ = bPEAHandler;
    }
}
