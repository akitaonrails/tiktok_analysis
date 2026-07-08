package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.livesetting.message.LiveGamePauseSeiConfigSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ud0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776440Ud0 implements InterfaceC1077710e9R {
    public final InterfaceC777290UeN LIZ;
    public volatile Boolean LIZIZ;
    public volatile Boolean LIZJ;
    public volatile long LIZLLL;
    public C11LS LJ;

    @Override // X.InterfaceC1077710e9R
    public final void LIZIZ() {
        C11LS c11ls;
        LiveGamePauseSeiConfigSetting liveGamePauseSeiConfigSetting = LiveGamePauseSeiConfigSetting.INSTANCE;
        if (liveGamePauseSeiConfigSetting.getValue().isAudienceEnable() && liveGamePauseSeiConfigSetting.getValue().getImFallbackEnable() && (c11ls = this.LJ) != null) {
            c11ls.dispose();
        }
    }

    @Override // X.InterfaceC1077710e9R
    public final boolean LIZLLL() {
        return LiveGamePauseSeiConfigSetting.INSTANCE.getValue().isAudienceEnable() && this.LIZIZ != null;
    }

    public final void LJFF() {
        LiveGamePauseSeiConfigSetting liveGamePauseSeiConfigSetting = LiveGamePauseSeiConfigSetting.INSTANCE;
        if (liveGamePauseSeiConfigSetting.getValue().isAudienceEnable() && liveGamePauseSeiConfigSetting.getValue().getImFallbackEnable()) {
            long timeInterval = liveGamePauseSeiConfigSetting.getValue().getTimeInterval();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i = C11NN.LL;
            this.LJ = (C11LS) C11NN.LJI(0L, timeInterval, timeUnit, C11S5.LIZIZ).LJIIZILJ(C11S5.LIZ()).LJIILIIL(new AfS181S0100000_12(this, 166), new C09JN() { // from class: X.0T78
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameLivePauseHelper@7792.startFallbackChecker$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fallback checker error, message: ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C20441214yg.LJ("GameLivePauseHelper", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("GameLivePauseHelper@7792.startFallbackChecker$2");
                }
            });
        }
    }

    public C776440Ud0(C776710UdR c776710UdR) {
        this.LIZ = c776710UdR;
    }

    @Override // X.InterfaceC1077710e9R
    public final void LIZ(boolean z) {
        this.LIZJ = Boolean.valueOf(z);
    }

    @Override // X.InterfaceC1077710e9R
    public final void LIZJ(C945320ahu c945320ahu) {
        if (!LiveGamePauseSeiConfigSetting.INSTANCE.getValue().isAudienceEnable()) {
            return;
        }
        try {
            String str = c945320ahu.LIZIZ;
            if (str == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("live_stream_sei_pause")) {
                this.LIZLLL = System.currentTimeMillis();
                LJ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "live_stream_sei_pause"));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveSeiMessage error, message: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("GameLivePauseHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("pause_live");
        if (Intrinsics.LJFF(strOptString, "1")) {
            Boolean bool = this.LIZIZ;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                return;
            }
            this.LIZIZ = bool2;
            ((C776710UdR) this.LIZ).LIZ.PR();
            return;
        }
        if (Intrinsics.LJFF(strOptString, CardStruct.IStatusCode.DEFAULT)) {
            Boolean bool3 = this.LIZIZ;
            Boolean bool4 = Boolean.FALSE;
            if (Intrinsics.LJFF(bool3, bool4)) {
                return;
            }
            this.LIZIZ = bool4;
            ((C776710UdR) this.LIZ).LIZ.RR();
        }
    }
}
