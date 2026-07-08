package X;

import Y.ARunnableS127S0100000_27;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeWSDelaySetting;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0peE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519640peE implements InterfaceC486470J5x, C0XEZ {
    public static volatile boolean LLILLJJLI;
    public static final C1519640peE LL = new C1519640peE();
    public static final String LLILLL = C1519640peE.class.getSimpleName();

    public final synchronized void LIZJ() {
        if (LLILLJJLI) {
            return;
        }
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LIZLLL(this);
        c2203431BLp.LJI(50331743, 503317431, this);
        LLILLJJLI = true;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        try {
            long value = LiveRechargeWSDelaySetting.INSTANCE.getValue();
            C1519640peE c1519640peE = LL;
            ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(wsChannelMsg, 34);
            c1519640peE.getClass();
            if (value > 0) {
                C2487409ou.LIZLLL(value, aRunnableS127S0100000_27);
            } else {
                aRunnableS127S0100000_27.run();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        C20441214yg.LIZIZ(LLILLL, c821280WJq.toString());
    }
}
