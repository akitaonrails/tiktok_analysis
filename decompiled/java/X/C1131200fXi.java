package X;

import Y.ARunnableS117S0100000_17;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.clientai.LiveGiftPanelPredictOpenSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131200fXi {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final Function0<List<GiftPage>> LIZJ;
    public final Function0<Integer> LIZLLL;
    public final Handler LJ;
    public ARunnableS117S0100000_17 LJFF;
    public ARunnableS117S0100000_17 LJI;
    public C11JL LJII;
    public C11JL LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public boolean LJIIJJI;
    public volatile boolean LJIIL;

    public final void LIZ() {
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LJFF;
        if (aRunnableS117S0100000_17 != null) {
            this.LJ.removeCallbacks(aRunnableS117S0100000_17);
        }
        this.LJFF = null;
        ARunnableS117S0100000_17 aRunnableS117S0100000_172 = this.LJI;
        if (aRunnableS117S0100000_172 != null) {
            this.LJ.removeCallbacks(aRunnableS117S0100000_172);
        }
        this.LJI = null;
        C11JL c11jl = this.LJII;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LJII = null;
        C11JL c11jl2 = this.LJIIIIZZ;
        if (c11jl2 != null) {
            c11jl2.dispose();
        }
        this.LJIIIIZZ = null;
    }

    public final void LIZLLL() {
        if (!this.LJIIJJI || LiveGiftPanelPredictOpenSettings.INSTANCE.isTraining()) {
            return;
        }
        this.LJIIJJI = false;
        Long l = this.LJIIIZ;
        Long l2 = this.LJIIJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("predict_panel_open", l != null ? "1" : CardStruct.IStatusCode.DEFAULT);
            C189200o6.m2constructorimpl(jSONObject.putOpt("actual_panel_open", l2 == null ? CardStruct.IStatusCode.DEFAULT : "1"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("predict_time", l);
            C189200o6.m2constructorimpl(jSONObject2.putOpt("actual_time", l2));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.putOpt("predict_time", l);
            C189200o6.m2constructorimpl(jSONObject3.putOpt("actual_time", l2));
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putOpt("extra", jSONObject3);
        C1CC2.LIZJ("ttlive_gift_panel_predict_open_result", jSONObject, jSONObject2, jSONObject4);
    }

    public static long LIZIZ() {
        long jUptimeMillis = SystemClock.uptimeMillis() - C1135800ff8.LIZ;
        if (jUptimeMillis < 0) {
            return 0L;
        }
        return jUptimeMillis;
    }

    public static void LIZJ(ImageModel imageModel) {
        String str;
        List urls = imageModel.getUrls();
        if (urls != null && (str = (String) C13LP.LJJJLL(urls)) != null && !C1819620xS4.LIZJ(str)) {
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJIIZ();
        }
    }

    public C1131200fXi(DataChannel dataChannel, Room room, C5182020e c5182020e, AwS561S0100000_17 awS561S0100000_17) {
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        this.LIZJ = c5182020e;
        this.LIZLLL = awS561S0100000_17;
        Handler handlerLIZ = C473410IhP.LIZ();
        this.LJ = handlerLIZ;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LJFF;
        if (aRunnableS117S0100000_17 != null) {
            handlerLIZ.removeCallbacks(aRunnableS117S0100000_17);
        }
        long jRoomEnterDelayMs = LiveGiftPanelPredictOpenSettings.INSTANCE.roomEnterDelayMs() - LIZIZ();
        jRoomEnterDelayMs = jRoomEnterDelayMs < 0 ? 0L : jRoomEnterDelayMs;
        ARunnableS117S0100000_17 aRunnableS117S0100000_172 = new ARunnableS117S0100000_17(this, 236);
        this.LJFF = aRunnableS117S0100000_172;
        C786410Ut5.LJLIIL(jRoomEnterDelayMs, handlerLIZ, aRunnableS117S0100000_172);
    }
}
