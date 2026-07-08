package X;

import com.ss.android.ugc.aweme.im.strategy.api.StrategyApi;
import com.ss.android.ugc.aweme.im.strategy.exp.StrategyApiTimeoutOptSettingsData;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201971BFz {
    public static final /* synthetic */ C2201971BFz LIZ = new C2201971BFz();
    public static final C01GW<StrategyApi> LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(84));

    public static Object LIZ(String[] strArr, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1493620oyG c1493620oyG;
        String strLJ = C051M.LJ(strArr, false);
        StrategyApiTimeoutOptSettingsData strategyApiTimeoutOptSettingsData = (StrategyApiTimeoutOptSettingsData) C07K0.LIZ.getValue();
        if (strategyApiTimeoutOptSettingsData != null) {
            c1493620oyG = new C1493620oyG();
            c1493620oyG.LIZJ = strategyApiTimeoutOptSettingsData.timeoutConnection;
            c1493620oyG.LIZLLL = strategyApiTimeoutOptSettingsData.timeoutRead;
            c1493620oyG.LJ = strategyApiTimeoutOptSettingsData.timeoutWrite;
        } else {
            c1493620oyG = null;
        }
        return LIZIZ.getValue().getStrategyConfig(strLJ, c1493620oyG, interfaceC1364105Vn);
    }
}
