package X;

import Y.ARunnableS127S0100000_27;
import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.s;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplyQuickPostPayload;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightDoneEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.json.JSONObject;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835140xr6 implements InterfaceC486470J5x {
    public static final C1835140xr6 LL = new C1835140xr6();
    public static final Set<Integer> LLILLJJLI = new LinkedHashSet();
    public static AnonymousClass0956 LLILLL;
    public static int LLILZ;
    public static boolean LLILZIL;

    public static void LJ(String str) {
        if (!LLILLJJLI.isEmpty() && LLILZ <= 10) {
            LLILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1408600ml8(str, null), 3);
        }
    }

    public static void LJI(int i) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZ = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        }
        if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
            C786410Ut5.LJLIIL(3500L, C0CAU.LIZ, new ARunnableS127S0100000_27(c1389890mGx, 59));
        }
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        LiveReplyQuickPostPayload liveReplyQuickPostPayload;
        String string;
        String string2;
        Set<Integer> set = LLILLJJLI;
        boolean z = false;
        if (set.contains(Integer.valueOf(wsChannelMsg.service)) && wsChannelMsg.service == 16778115 && wsChannelMsg.method == 2) {
            try {
                JSONObject jSONObject = new JSONObject(new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
                String strOptString = jSONObject.optString("fragment_id");
                int iOptInt = jSONObject.optInt("generate_result");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fragment_id", strOptString);
                if (iOptInt != 0) {
                    if (iOptInt == 1) {
                        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                        LJFF(1, linkedHashMap);
                        LJI(2131852402);
                    }
                    DataChannelGlobal.LLILZ.FQ2(GeneralHighlightDoneEvent.class, new Pair(strOptString, Boolean.valueOf(z)));
                    LJIIIIZZ(16778115);
                    return;
                }
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                LJFF(1, linkedHashMap);
                z = true;
                DataChannelGlobal.LLILZ.FQ2(GeneralHighlightDoneEvent.class, new Pair(strOptString, Boolean.valueOf(z)));
                LJIIIIZZ(16778115);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (set.contains(Integer.valueOf(wsChannelMsg.service)) && wsChannelMsg.service == 134217736) {
            CopyOnWriteArrayList<PostConfigModel> copyOnWriteArrayList = C1833880xp4.LIZ;
            try {
                liveReplyQuickPostPayload = (LiveReplyQuickPostPayload) C08JS.LIZ(new String(wsChannelMsg.LIZ(), Charsets.UTF_8), LiveReplyQuickPostPayload.class);
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                liveReplyQuickPostPayload = null;
            }
            int i = wsChannelMsg.method;
            String str = "";
            if (i == 3) {
                if (liveReplyQuickPostPayload != null && (string2 = Long.valueOf(liveReplyQuickPostPayload.getFragmentId()).toString()) != null) {
                    str = string2;
                }
                LIZ(str, true);
                LJIIIIZZ(134217736);
                return;
            }
            if (i == 4) {
                if (liveReplyQuickPostPayload != null && (string = Long.valueOf(liveReplyQuickPostPayload.getFragmentId()).toString()) != null) {
                    str = string;
                }
                LIZ(str, false);
                LJIIIIZZ(134217736);
            }
        }
    }

    public final void LJIIIIZZ(int i) {
        Set<Integer> set = LLILLJJLI;
        set.remove(Integer.valueOf(i));
        if (set.isEmpty()) {
            C2203431BLp.LIZIZ.LJIIIZ(this);
            AnonymousClass0956 anonymousClass0956 = LLILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LLILLL = null;
            LLILZ = 0;
        }
    }

    public static void LIZ(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fragment_id", str);
        if (z) {
            LJI(2131855481);
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
        } else {
            LJI(2131855480);
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
        }
        LJFF(3, linkedHashMap);
    }

    public static AnonymousClass0956 LIZJ(String str, Function2 function2) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01MQ(str, null, function2), 3);
    }

    public static void LIZLLL(Map map, LiveFragmentDetail liveFragmentDetail) {
        C19EG c19eg;
        Activity activityLIZIZ;
        if (LLILZIL) {
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZ = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            HighlightPreviewClipFragment highlightPreviewClipFragment = new HighlightPreviewClipFragment(map, liveFragmentDetail);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = highlightPreviewClipFragment;
            tuxSheet.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(2);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0xr7
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1835140xr6 c1835140xr6 = C1835140xr6.LL;
                    C1835140xr6.LLILZIL = false;
                }
            };
            tuxSheet2.show(c19eg.getSupportFragmentManager(), "highlight_preview_clip");
            LLILZIL = true;
        }
    }

    public static void LJFF(int i, Map map) {
        if (map.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        jSONObject.put(Scene.SCENE_SERVICE, "delete");
                    }
                } else {
                    jSONObject.put(Scene.SCENE_SERVICE, "post");
                }
            } else {
                jSONObject.put(Scene.SCENE_SERVICE, "preview");
            }
        } else {
            jSONObject.put(Scene.SCENE_SERVICE, "generating");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        for (String str : linkedHashMap.keySet()) {
            jSONObject.put(str, linkedHashMap.get(str));
        }
        C389001fE.LIZ("highlight_general_popup_event", jSONObject, System.currentTimeMillis(), false);
    }

    public final void LJII(int i, String str) {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (!c2203431BLp.isConnected()) {
            c2203431BLp.LJ("live_host");
        }
        Set<Integer> set = LLILLJJLI;
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        set.add(Integer.valueOf(i));
        c2203431BLp.LJI(16778115, 2, this);
        LJ(str);
    }
}
