package X;

import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.channel.ClientPayload;
import com.ss.android.ugc.aweme.tako.channel.ServerPayload;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS114S1000000_30;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14FL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FL {
    public static boolean LIZ;
    public static AnonymousClass0956 LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static final C861640Xr8 LIZLLL;

    static {
        C861640Xr8 c861640Xr8 = null;
        if (C05BZ.LIZJ) {
            c861640Xr8 = new C861640Xr8(new C05BY(null), new C20100513kp(new C1939607ik(new IntRange(0, Integer.MAX_VALUE))));
        }
        LIZLLL = c861640Xr8;
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LJI(67108929, 2, new InterfaceC486470J5x() { // from class: X.14FO
            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                String str = C1863280yaU.LJIILLIIL;
                C1870240yli.LIZ(new AwS574S0100000_30(wsChannelMsg, 380), false);
                byte[] bArrDecode = Base64.decode(wsChannelMsg.LIZ(), 0);
                C1870240yli.LIZ(new AwS574S0100000_30(bArrDecode, 381), false);
                try {
                    ServerPayload serverPayload = (ServerPayload) C08JS.LIZ(new String(bArrDecode, Charsets.UTF_8), ServerPayload.class);
                    if (serverPayload.eventType == 1) {
                        boolean z = C14FL.LIZ;
                        C14FL.LIZIZ(serverPayload.event.lastInboxCursor);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String str2 = C1863280yaU.LJIILLIIL;
                    C1870240yli.LIZ(new AwS574S0100000_30(e, 382), false);
                }
            }
        });
        c2203431BLp.LIZLLL(new C0XEZ() { // from class: X.14FM
            @Override // X.C0XEZ
            public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
                String str = C1863280yaU.LJIILLIIL;
                C1870240yli.LIZ(new AwS567S0100000_23(c821280WJq, 200), false);
            }
        });
    }

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        String str = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS187S0000000_2.get$arr$(1251), false);
        if (C05BZ.LIZJ) {
            LIZ = true;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            Application application = contextLIZ instanceof Application ? (Application) contextLIZ : null;
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (c2203431BLp.isConnected()) {
                return;
            }
            if (application != null) {
                c2203431BLp.LJIIJ(application);
            }
            c2203431BLp.LJ("takows");
        }
    }

    public static void LIZIZ(long j) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863410yah(j, System.currentTimeMillis(), null), 3);
    }

    public static void LIZJ(TakoEnterParams takoEnterParams) {
        Map<String, String> commonParams;
        try {
            String strLIZLLL = C08JS.LIZLLL(new ClientPayload(1));
            String str = C1863280yaU.LJIILLIIL;
            C1870240yli.LIZ(new AwS114S1000000_30(strLIZLLL, 3), false);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            if (takoEnterParams != null) {
                commonParams = takoEnterParams.getCommonParams();
            } else {
                commonParams = null;
            }
            c1862330yYx.getClass();
            C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            C1862330yYx.LLII(jSONObject, commonParams);
            c20235014Fo.LIZIZ("tikbot_enter_page_keep_alive", jSONObject);
            C2203431BLp.LIZIZ.LJIIIIZZ(0L, System.currentTimeMillis(), 67108929, 1, strLIZLLL.getBytes(Charsets.UTF_8), "", "", null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = C1863280yaU.LJIILLIIL;
            C1870240yli.LIZ(new AwS574S0100000_30(e, 383), false);
        }
    }
}
