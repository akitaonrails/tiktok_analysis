package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.augur.AugurConfigRequestParam;
import com.ss.lyrax.augur.AugurConfigRequester;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1276100jJQ implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    public /* synthetic */ RunnableC1276100jJQ(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zUpdateRequestParams;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        C1C7U.LIZ("LyraxContextWrapper@131e.requestConfigWithABLabel$1L");
        if (!C1276090jJP.LIZ()) {
            C1C7U.LIZIZ("LyraxContextWrapper@131e.requestConfigWithABLabel$1L");
            return;
        }
        AtomicReference<AugurConfigRequester> atomicReference = C1276090jJP.LIZ;
        AugurConfigRequester augurConfigRequester = atomicReference.get();
        if (augurConfigRequester != null) {
            List<String> listLIZIZ = C1276090jJP.LIZIZ("", C1276090jJP.LIZLLL);
            AugurConfigRequestParam augurConfigRequestParam = new AugurConfigRequestParam();
            augurConfigRequestParam.setAbLabel(str == null ? "" : str);
            augurConfigRequestParam.setStarshipStrategyGroups(str2 != null ? str2 : "");
            augurConfigRequestParam.setStreamScene(listLIZIZ);
            zUpdateRequestParams = augurConfigRequester.updateRequestParams(augurConfigRequestParam);
            if (zUpdateRequestParams) {
                augurConfigRequester.requestConfigAsync(LivePreCreateNextRoomPlayer.ENABLE);
            }
        } else {
            zUpdateRequestParams = false;
        }
        if (C1267520j5a.LIZ()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("api", "requestConfigWithABLabel");
                jSONObject.put("augur_config_requester", atomicReference.get());
                jSONObject.put("need_notify", zUpdateRequestParams);
                jSONObject.put("ab_label", str);
                jSONObject.put("starship_strategy_groups", str2);
                AVLog.logKibana(5, "AugurConfigRequester", C786410Ut5.J3(jSONObject), null);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.logKibana(5, "AugurConfigRequester", "json parse error", null);
            }
        }
        C1C7U.LIZIZ("LyraxContextWrapper@131e.requestConfigWithABLabel$1L");
    }
}
