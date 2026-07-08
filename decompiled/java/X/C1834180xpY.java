package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayTranscodeSetting;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplyPayload;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834180xpY implements InterfaceC486470J5x {
    public static final C1834180xpY LL = new C1834180xpY();
    public static Function2<? super Boolean, ? super JSONObject, Unit> LLILLJJLI;

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) throws JSONException {
        int i = wsChannelMsg.service;
        if (i == 50331702) {
            int i2 = wsChannelMsg.method;
            if (i2 == 1 || i2 == 2) {
                try {
                    LiveReplyPayload liveReplyPayload = (LiveReplyPayload) C08JS.LIZ(new String(wsChannelMsg.LIZ(), Charsets.UTF_8), LiveReplyPayload.class);
                    if (liveReplyPayload != null) {
                        LIZLLL(wsChannelMsg, liveReplyPayload);
                        C815730VzH.LIZ(new AwS428S0200000_27(wsChannelMsg, liveReplyPayload, 51));
                        return;
                    }
                    return;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        if (i == 134217737) {
            if (LiveReplayTranscodeSetting.INSTANCE.inReplayTranscode()) {
                int i3 = wsChannelMsg.method;
                if (i3 != 199) {
                    if (i3 == 200) {
                        LIZ(wsChannelMsg, true, true);
                    }
                } else {
                    LIZ(wsChannelMsg, false, true);
                }
            } else {
                int i4 = wsChannelMsg.method;
                if (i4 != 99) {
                    if (i4 == 100) {
                        LIZ(wsChannelMsg, true, false);
                    }
                } else {
                    LIZ(wsChannelMsg, false, false);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload", new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
            jSONObject.put("method_id", String.valueOf(wsChannelMsg.method));
            C389001fE.LIZ("live_replay_message_event", jSONObject, System.currentTimeMillis(), false);
            return;
        }
        if (i != 134217736) {
            return;
        }
        C815730VzH.LIZ(new AwS571S0100000_27(wsChannelMsg, 1029));
    }

    public static void LIZLLL(WsChannelMsg wsChannelMsg, LiveReplyPayload liveReplyPayload) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(liveReplyPayload.getRoomId()));
        String str2 = "1";
        if (C804420Vh2.LJI(C497740JfY.LJII())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_wifi", str);
        if (LiveReplayTranscodeSetting.INSTANCE.inReplayTranscode()) {
            if (wsChannelMsg.method != 200) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_process_success", str2);
            c2344009Gk.LIZLLL(liveReplyPayload.getTranscodeDuration(), "service_duration");
        }
        C20684815ws.LJIILLIIL("livesdk_live_replay_long_connection", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.common.wschannel.model.WsChannelMsg r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1834180xpY.LIZ(com.bytedance.common.wschannel.model.WsChannelMsg, boolean, boolean):void");
    }

    public static void LIZJ(long j, String str, boolean z) {
        boolean zLIZIZ;
        String url;
        InterfaceC1835200xrC c1835180xrA;
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        if (mapLIZIZ != null && mapLIZIZ.containsKey(String.valueOf(j))) {
            Map<String, String> mapLIZIZ2 = c20337914i1.LIZIZ();
            mapLIZIZ2.put(String.valueOf(j), str);
            c20337914i1.LJFF(mapLIZIZ2);
            C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
            String strValueOf = String.valueOf(j);
            c1834710xqPLIZJ.getClass();
            int iLIZLLL = C1834710xqP.LIZLLL(str, strValueOf);
            boolean zLJI = C804420Vh2.LJI(C497740JfY.LJII());
            C497740JfY.LJII();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            AnonymousClass0112 anonymousClass0112 = AnonymousClass0112.LIZ;
            String strValueOf2 = String.valueOf(j);
            anonymousClass0112.getClass();
            boolean zContains = ((HashSet) AnonymousClass0112.LIZIZ.getValue()).contains(strValueOf2);
            if (iLIZLLL != 2 && iLIZLLL != 4) {
                if (zLIZIZ && (zLJI || zContains)) {
                    C1834040xpK.LIZ(j);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    c2344009Gk.LIZLLL(j, "room_id");
                    C20684815ws.LJIILLIIL("livesdk_live_replay_download_start", c2344009Gk.LIZ);
                    C1834710xqP c1834710xqPLIZJ2 = C1834710xqP.LIZJ();
                    String strValueOf3 = String.valueOf(j);
                    c1834710xqPLIZJ2.getClass();
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        c1835180xrA = C1836420xtA.LJFF().LIZIZ.get(strValueOf3);
                    } else {
                        c1835180xrA = C1836420xtA.LJFF().LIZIZ.get(str);
                    }
                    C1834710xqP c1834710xqPLIZJ3 = C1834710xqP.LIZJ();
                    Activity topActivity = ActivityStack.getTopActivity();
                    String strValueOf4 = String.valueOf(j);
                    if (c1835180xrA == null) {
                        c1835180xrA = new C1835180xrA(str, String.valueOf(j));
                    }
                    c1834710xqPLIZJ3.getClass();
                    C1834710xqP.LJI(topActivity, 0, str, strValueOf4, c1835180xrA);
                    return;
                }
                if (!z) {
                    return;
                }
                C766270U4b.LIZLLL(2131842555);
                return;
            }
            C1834040xpK.LIZ(j);
            if (iLIZLLL != 4) {
                return;
            }
            C1834710xqP c1834710xqPLIZJ4 = C1834710xqP.LIZJ();
            String strValueOf5 = String.valueOf(j);
            c1834710xqPLIZJ4.getClass();
            C1836420xtA.LJFF().getClass();
            DownloadInfo downloadInfoLIZLLL = C1836420xtA.LIZLLL(strValueOf5);
            C1834710xqP c1834710xqPLIZJ5 = C1834710xqP.LIZJ();
            Activity topActivity2 = ActivityStack.getTopActivity();
            if (downloadInfoLIZLLL != null && (url = downloadInfoLIZLLL.getUrl()) != null) {
                str = url;
            }
            String strValueOf6 = String.valueOf(j);
            c1834710xqPLIZJ5.getClass();
            C1834710xqP.LJI(topActivity2, 1, str, strValueOf6, null);
        }
    }
}
