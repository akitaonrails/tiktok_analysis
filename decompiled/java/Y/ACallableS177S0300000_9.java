package Y;

import X.C0OD4;
import X.C0SZ8;
import X.C1017070cZd;
import X.C1474810oTv;
import X.C1480430ocz;
import X.C1594680rbG;
import X.C1B9C;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2251708rz;
import X.C2355109Kr;
import X.C329320Cva;
import X.C586580MzY;
import X.C612370O0d;
import X.C612400O0g;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.C794420VEi;
import X.C817250W4d;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS177S0300000_9 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS177S0300000_9 aCallableS177S0300000_9) {
        JSONObject jSONObject;
        String str;
        String string;
        Video video = (Video) aCallableS177S0300000_9.l0;
        C0SZ8 c0sz8 = (C0SZ8) aCallableS177S0300000_9.l1;
        C1480430ocz c1480430ocz = (C1480430ocz) aCallableS177S0300000_9.l2;
        C1C7U.LIZ("PlayerMonitorUtil@47e8.monitorVideoRenderReady$1L");
        JSONObject jSONObject2 = new JSONObject();
        try {
            C1B9C c1b9c = C612400O0g.LIZ;
            jSONObject2.put("netWorkQuality", c1b9c.LIZIZ().toString());
            jSONObject2.put("netWorkSpeed", (int) c1b9c.LIZJ());
            jSONObject2.put("playUrl", JsonParseUtils.LJ(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            C586580MzY.LIZIZ(jSONObject2);
            File fileLIZ = C2355109Kr.LIZ();
            if (fileLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(fileLIZ.getPath());
                sbLIZ.append("/");
                C2251708rz c2251708rz = C2251708rz.LIZ;
                String bitRatedRatioUri = video.getPlayAddr().getBitRatedRatioUri();
                c2251708rz.getClass();
                sbLIZ.append(C2251708rz.LIZ(bitRatedRatioUri));
                string = new C612370O0d(C2188811AlT.LIZIZ(sbLIZ)).toString();
            } else {
                string = "";
            }
            jSONObject2.put("file", string);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C1474810oTv.LJJIIJZLJL()) {
            C794420VEi.LIZIZ("type_log_play_succuss", "play_success", jSONObject2);
            C793770VBv.LJIIJJI("aweme_media_error_rate", 0, jSONObject2);
            if (VideoBitRateABManager.LJFF.LJFF()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            C793770VBv.LJIIJJI(str, 0, jSONObject2);
        }
        if (C1594680rbG.LIZIZ(c0sz8)) {
            try {
                jSONObject = new JSONObject(C786410Ut5.J3(jSONObject2));
                jSONObject.put("aweme_id", c0sz8.LJIIIIZZ().getAid());
                jSONObject.put("creative_id", c0sz8.LJIIIIZZ().getAwemeRawAd().getCreativeId());
                if (C1017070cZd.LLIZLLLIL(c0sz8.LJIIIIZZ())) {
                    jSONObject.put("is_topview", true);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                jSONObject = new JSONObject();
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (C1594680rbG.LIZJ(c0sz8)) {
                C329320Cva.LIZ(1, 0, c0sz8.LJIIIIZZ());
            }
        }
        if (C1594680rbG.LIZJ(c0sz8) && c1480430ocz != null) {
            long j = c1480430ocz.LIZJ / 1000;
            if (j <= 60 && j >= 7) {
                C329320Cva.LIZ(4, 0, c0sz8.LJIIIIZZ());
            } else {
                C329320Cva.LIZ(4, 1, c0sz8.LJIIIIZZ());
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("alarm_reason", "duration_alarm");
                    if (c0sz8.LJIIIIZZ() != null) {
                        jSONObject3.put("group_id", c0sz8.LJIIIIZZ().getAid());
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("ad_alarm");
                mobClickObtain.setLabelName("homepage_hot");
                mobClickObtain.setJsonObject(jSONObject3);
                C20684815ws.onEvent(mobClickObtain);
            }
        }
        C1C7U.LIZIZ("PlayerMonitorUtil@47e8.monitorVideoRenderReady$1L");
        return null;
    }

    public static final Object call$1(ACallableS177S0300000_9 aCallableS177S0300000_9) {
        C1C7U.LIZ("AddYoursDetailAwemeViewHolder@b925.mobAwemeShown$1");
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9((Bundle) aCallableS177S0300000_9.l1, (Aweme) aCallableS177S0300000_9.l2, 81);
        C0OD4 c0od4 = (C0OD4) aCallableS177S0300000_9.l0;
        C817250W4d.LIZIZ(c0od4.LLIZ, "add_yours_client_show", awS410S0200000_9, new AwS553S0100000_9(c0od4, 1703));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursDetailAwemeViewHolder@b925.mobAwemeShown$1");
        return unit;
    }

    public ACallableS177S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
