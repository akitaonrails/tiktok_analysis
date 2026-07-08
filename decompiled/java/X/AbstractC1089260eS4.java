package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyInitDefaultSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0eS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1089260eS4<T> implements InterfaceC1089740eSq {
    public final C1089780eSu LIZ;
    public final DataChannel LIZIZ;
    public final C1089860eT2<T> LIZJ;
    public Strategy LIZLLL;
    public final boolean LJ = LiveAdaptStrategyInitDefaultSetting.INSTANCE.getValue();

    public abstract String LIZLLL();

    public abstract String LJ();

    public abstract void LJI(T t);

    @Override // X.InterfaceC1089740eSq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1089740eSq
    public final Strategy LIZIZ() {
        try {
            Strategy strategyLIZIZ = C1089660eSi.LIZIZ(LIZLLL(), LJ());
            this.LIZLLL = strategyLIZIZ;
            return strategyLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    @Override // X.InterfaceC1089740eSq
    public final void LIZ(C1089610eSd c1089610eSd) {
        if (this.LJ) {
            LJFF(c1089610eSd);
        }
    }

    @Override // X.InterfaceC1089740eSq
    public final void LIZJ(C1089610eSd c1089610eSd) {
        LJFF(c1089610eSd);
    }

    public final void LJFF(C1089610eSd c1089610eSd) {
        String str;
        String str2;
        C1089860eT2<T> c1089860eT2 = this.LIZJ;
        String str3 = c1089610eSd.LIZ;
        Strategy strategy = this.LIZLLL;
        String str4 = null;
        if (strategy != null) {
            str = strategy.decisionKey;
        } else {
            str = null;
        }
        T tLIZ = c1089860eT2.LIZ(str3, str);
        if (tLIZ != null) {
            String string = tLIZ.toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Strategy strategy2 = this.LIZLLL;
            if (strategy2 != null) {
                str4 = strategy2.decisionKey;
            }
            sbLIZ.append(str4);
            sbLIZ.append(':');
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
            Strategy strategy3 = this.LIZLLL;
            if (strategy3 != null) {
                C1089780eSu c1089780eSu = this.LIZ;
                String str5 = strategy3.name;
                Map<String, String> map = c1089610eSd.LIZIZ;
                if (c1089610eSd.LIZJ) {
                    str2 = strategy3.decisionKey;
                } else {
                    str2 = str5;
                }
                ((ArrayList) c1089780eSu.LIZ.LIZJ).add(new C1089730eSp(str5, string, str2, map));
            }
            LJI(tLIZ);
        }
    }

    public AbstractC1089260eS4(InterfaceC1089790eSv interfaceC1089790eSv, C1089780eSu c1089780eSu, DataChannel dataChannel, C1089860eT2 c1089860eT2) {
        this.LIZ = c1089780eSu;
        this.LIZIZ = dataChannel;
        this.LIZJ = c1089860eT2;
    }
}
