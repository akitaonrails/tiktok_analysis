package X;

import Y.ARunnableS10S1000000_17;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.live.uikit.setting.LiveTooltipDurationSetting;
import com.bytedance.android.live.uikit.setting.LiveTooltipHotspotOptBlockListSetting;
import com.bytedance.android.live.uikit.setting.LiveTooltipHotspotOptSetting;
import com.bytedance.android.live.uikit.setting.LiveTooltipLeakFixSetting;
import com.bytedance.android.live.uikit.setting.LiveTooltipTouchOutsideDismissSetting;
import com.bytedance.android.live.uikit.util.LiveTooltipOnDialogFixSetting;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonPreferenceBubbleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMustBubbleOptimizeAndroidSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTooltipDebugSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltip;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltipAlogSetting;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveNotifySlardarSampleRateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113800f5e {
    public static boolean LIZIZ;
    public static Handler LIZJ;
    public static long LIZLLL;
    public static C0UX8 LJ;
    public static boolean LJFF;
    public static C1113840f5i LJII;
    public static final boolean LJIIJJI;
    public static final boolean LJIIL;
    public static final HashMap<String, Queue<C1113850f5j>> LJIILIIL;
    public static C11JF LJIILJJIL;
    public static final Map<String, C1102230emz> LJIILL;
    public static final C1113800f5e LIZ = new C1113800f5e();
    public static final HashMap<String, Queue<C1113840f5i>> LJI = new HashMap<>();
    public static boolean LJIIIIZZ = true;
    public static final HashMap<C0UX8, HashSet<Object>> LJIIIZ = new HashMap<>();
    public static final HashMap<C0UX8, DataChannel> LJIIJ = new HashMap<>();

    public static void LJIJ() {
        LJII = null;
        if (LiveTooltipLeakFixSetting.INSTANCE.enable()) {
            ((LinkedHashMap) LJIILL).clear();
        }
    }

    static {
        LiveTooltipAlogSetting liveTooltipAlogSetting = LiveTooltipAlogSetting.INSTANCE;
        LiveTooltip value = liveTooltipAlogSetting.getValue();
        boolean z = false;
        LJIIJJI = value != null && value.tooltipAlogControl == 1;
        LiveTooltip value2 = liveTooltipAlogSetting.getValue();
        if (value2 != null && value2.tooltipActivityCheck == 1) {
            z = true;
        }
        LJIIL = z;
        LJIILIIL = new HashMap<>();
        LJIILL = new LinkedHashMap();
        C1119700fFA.LIZJ = true;
        LiveTooltipTouchOutsideDismissSetting.INSTANCE.enable();
        C1119700fFA.LIZIZ = new InterfaceC1102490enP() { // from class: X.0eml
            @Override // X.InterfaceC1102490enP
            public final void LIZ(C1119660fF6 c1119660fF6) throws JSONException {
                C1113780f5c c1113780f5c;
                Map map;
                C1102080emk c1102080emk;
                C1CC3 c1cc3MN2;
                Object obj = c1119660fF6.LJJIII;
                if ((obj instanceof String) && obj != null) {
                    C1102230emz c1102230emz = (C1102230emz) ((LinkedHashMap) C1113800f5e.LJIILL).get(obj);
                    C1102070emj c1102070emj = C1102070emj.LIZ;
                    DataChannel dataChannel = C1113800f5e.LJIIJ.get(C1113800f5e.LJ);
                    if (c1102230emz != null) {
                        c1113780f5c = c1102230emz.LJFF;
                    } else {
                        c1113780f5c = null;
                    }
                    c1102070emj.getClass();
                    if (dataChannel != null && c1113780f5c != null && c1102230emz != null && (map = (Map) ((LinkedHashMap) C1102070emj.LIZIZ).get(dataChannel)) != null && (c1102080emk = (C1102080emk) map.get(c1102230emz.LIZ)) != null && AbstractC19994813Le.Default.nextDouble() < LiveNotifySlardarSampleRateSetting.getValue() && (c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2()) != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("notify_type", c1102080emk.LIZIZ.getKey());
                        jSONObject.put("component_type", c1102080emk.LIZJ.getKey());
                        jSONObject.put("business_type", c1102230emz.LIZ);
                        jSONObject.put("sub_business_type", c1102230emz.LIZIZ());
                        jSONObject.put("component_id", (Object) null);
                        jSONObject.put("consume_type", C245700xD.LIZ(c1102230emz).getKey());
                        jSONObject.put("user_type", C1102070emj.LJ(dataChannel));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("issue_timestamp", c1102230emz.LIZIZ);
                        jSONObject2.put("duration_from_issue_ms", c1102080emk.LJIIJJI());
                        jSONObject2.put("duration_from_enter_ms", c1102080emk.LJIIZILJ());
                        jSONObject2.put("avoid_count", c1102080emk.LJIIJ);
                        jSONObject2.put("active_count", c1102080emk.LJIILL);
                        jSONObject2.put("recover_count", c1102080emk.LJIJJLI);
                        jSONObject2.put("route_count", c1102080emk.LJIJJ);
                        jSONObject2.put("total_avoid_duration_ms", c1102080emk.LJIIJJI);
                        jSONObject2.put("total_active_duration_ms", c1102080emk.LJIJI);
                        jSONObject2.put("avoid_duration_ms", c1102080emk.LJIILIIL);
                        jSONObject2.put("issue_receive_duration_ms", c1102080emk.LJJ());
                        jSONObject2.put("receive_ready_duration_ms", c1102080emk.LJII - c1102080emk.LJFF);
                        c1cc3MN2.LJIL("notify_component", "ttlive_livesdk_tooltip_content_clicked", jSONObject, jSONObject2, new JSONObject());
                    }
                }
            }
        };
    }

    public static void LJIIIIZZ() {
        C20441214yg.LJ("[Message]", "toolStandardManager enqueuePendingTooltip");
        HashMap<String, Queue<C1113850f5j>> map = LJIILIIL;
        C0UX8 c0ux8 = LJ;
        Queue<C1113850f5j> queue = map.get(c0ux8 != null ? c0ux8.page : null);
        if (queue != null) {
            for (C1113850f5j c1113850f5j : queue) {
                LJII(c1113850f5j.LIZ, c1113850f5j.LIZIZ, c1113850f5j.LIZJ, c1113850f5j.LIZLLL, c1113850f5j.LJ, c1113850f5j.LJFF, c1113850f5j.LJI, c1113850f5j.LJII);
            }
            queue.clear();
        }
    }

    public static boolean LJIILIIL() {
        C1119760fFG c1119760fFGLIZ;
        C1119740fFE c1119740fFE;
        C1113840f5i c1113840f5i = LJII;
        if (c1113840f5i == null) {
            return false;
        }
        long j = c1113840f5i.LJIIIZ;
        return j > 0 && (c1119760fFGLIZ = C1113870f5l.LIZ.LIZ(j)) != null && (c1119740fFE = c1119760fFGLIZ.LJ) != null && c1119740fFE.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113800f5e.LJIIZILJ():void");
    }

    public static void LIZ(String str) {
        Queue<C1113840f5i> queue = LJI.get(str);
        if (queue != null) {
            for (C1113840f5i c1113840f5i : queue) {
                c1113840f5i.LIZ.LJ();
                if (LJIIJJI) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("discardedTooltip : ");
                    String str2 = c1113840f5i.LJFF;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("LiveTooltip", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            queue.clear();
        }
        Queue<C1113850f5j> queue2 = LJIILIIL.get(str);
        if (queue2 != null) {
            Iterator<T> it2 = queue2.iterator();
            while (it2.hasNext()) {
                ((C1113850f5j) it2.next()).LIZ.LJ();
            }
            queue2.clear();
        }
    }

    public static void LIZJ(EnumC1120860fH2 enumC1120860fH2) {
        C1113840f5i c1113840f5i = LJII;
        if (c1113840f5i != null && Intrinsics.LJFF(c1113840f5i.LJFF, enumC1120860fH2.getKey())) {
            C1119700fFA.LIZ(4, c1113840f5i.LJIIIZ);
            c1113840f5i.LIZ.LJ();
        }
    }

    public static final void LIZLLL(View view) {
        C1113840f5i c1113840f5i = LJII;
        if (c1113840f5i != null && c1113840f5i.LIZ.LIZJ() && Intrinsics.LJFF(c1113840f5i.LIZ.LIZIZ.getRootView(), view)) {
            C1119700fFA.LIZ(10, c1113840f5i.LJIIIZ);
            C1119660fF6 c1119660fF6 = c1113840f5i.LIZ;
            if (c1119660fF6 != null) {
                c1119660fF6.LJ();
            }
        }
    }

    public static void LJIIJ(String str) {
        double dDoubleValue;
        if (str == null) {
            return;
        }
        C0JT6<Map<String, Double>> c0jt6 = InterfaceC1106030et7.C5;
        Map<String, Double> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
            c0jt6.LIZJ(mapLIZ);
        }
        Double d = mapLIZ.get(str);
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        mapLIZ.put(str, Double.valueOf(dDoubleValue + 1.0d));
        c0jt6.LIZJ(c0jt6.LIZ());
    }

    public static boolean LJIIL(LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig) {
        if (liveMessagePlatformBubbleConfig.priority <= 0 && LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() != 1) {
            return true;
        }
        if ((liveMessagePlatformBubbleConfig.scene == 2 && LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() == 1) || LiveTooltipDebugSetting.INSTANCE.getValue().getAllClose()) {
            return true;
        }
        return false;
    }

    public static void LJIILJJIL(C0UX8 c0ux8) {
        LJIILL("leave_page", c0ux8.page);
        LJIIJ.remove(c0ux8);
        LIZ(c0ux8.page);
        HashSet<Object> hashSet = LJIIIZ.get(c0ux8);
        if (hashSet != null) {
            hashSet.clear();
        }
        if (c0ux8 == LJ && LJII != null) {
            LIZIZ(c0ux8, 9);
            LJII = null;
        }
        if (LiveTooltipLeakFixSetting.INSTANCE.enable()) {
            ((LinkedHashMap) LJIILL).clear();
        }
    }

    public static void LIZIZ(C0UX8 c0ux8, int i) {
        C1113840f5i c1113840f5i;
        if (c0ux8 == LJ && (c1113840f5i = LJII) != null) {
            C1119700fFA.LIZ(i, c1113840f5i.LJIIIZ);
            C1119660fF6 c1119660fF6 = c1113840f5i.LIZ;
            if (c1119660fF6 != null) {
                c1119660fF6.LJ();
            }
        }
    }

    public static Map LJIIIZ(C1113840f5i c1113840f5i, C1102230emz c1102230emz) {
        String string;
        String str;
        Map<String, String> extras;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1102230emz == null || (extras = c1102230emz.getExtras()) == null || !extras.containsKey("content")) {
            CharSequence charSequenceLIZ = c1113840f5i.LIZ.LIZ();
            if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("content", string);
        }
        linkedHashMap.put("position", c1113840f5i.LIZJ);
        if (C500260Jjc.LJJIIZ(c1113840f5i.LJII)) {
            linkedHashMap.put("target_id", c1113840f5i.LJII);
        }
        long j = c1113840f5i.LJIIIIZZ;
        if (j > 0) {
            linkedHashMap.put("period_id", String.valueOf(j));
        }
        if (c1113840f5i.LIZ.LIZJ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_panel", str);
        return linkedHashMap;
    }

    public static void LJIILL(String str, String str2) {
        Queue<C1113840f5i> queue = LJI.get(str2);
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                LJIJI((C1113840f5i) it2.next(), str2, str);
            }
        }
    }

    public static void LJIILLIIL(C1113840f5i c1113840f5i, String str) {
        C474500IjA c474500IjALIZ;
        String string;
        InterfaceC1102150emr interfaceC1102150emr;
        if (LJFF) {
            c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_bubble_show");
        } else {
            c474500IjALIZ = C0IJT.LIZ("livesdk_audience_bubble_show");
        }
        CharSequence charSequenceLIZ = c1113840f5i.LIZ.LIZ();
        if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "content");
        c474500IjALIZ.LJIJJ(c1113840f5i.LJIIJ);
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LJJII(c1113840f5i.LIZJ, "position");
        c474500IjALIZ.LJJII(c1113840f5i.LJFF, "content_id");
        if (C500260Jjc.LJJIIZ(c1113840f5i.LJII)) {
            c474500IjALIZ.LJJII(c1113840f5i.LJII, "target_id");
        }
        long j = c1113840f5i.LJIIIIZZ;
        if (j > 0) {
            c474500IjALIZ.LJJII(Long.valueOf(j), "period_id");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(c1113840f5i.LIZ.LIZJ() ? 1 : 0), "is_panel");
        c474500IjALIZ.LIZ();
        c1113840f5i.LJ = System.currentTimeMillis();
        C1102230emz c1102230emz = (C1102230emz) ((LinkedHashMap) LJIILL).get(c1113840f5i.LJFF);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = LJIIJ.get(LJ);
        if (c1102230emz != null) {
            interfaceC1102150emr = c1102230emz.LJFF;
        } else {
            interfaceC1102150emr = null;
        }
        c1102070emj.LJIIJ(dataChannel, interfaceC1102150emr, c1102230emz, LJIIIZ(c1113840f5i, c1102230emz));
    }

    public static boolean LJIL(int i, String str) {
        double dDoubleValue;
        Double d;
        if (LiveTooltipDebugSetting.INSTANCE.getValue().getBusinessCheck() && i != -1) {
            double d2 = i;
            Map<String, Double> mapLIZ = InterfaceC1106030et7.C5.LIZ();
            if (mapLIZ != null && (d = mapLIZ.get(str)) != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            if (d2 <= dDoubleValue) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJJ(C1113840f5i c1113840f5i, String str) {
        c1113840f5i.LJIIIZ = C1119700fFA.LIZIZ(c1113840f5i.LIZ);
        LJII = c1113840f5i;
        LJIILLIIL(c1113840f5i, str);
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.z5;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        InterfaceC1106030et7.y5.LJFF(Long.valueOf(System.currentTimeMillis()));
        C20337914i1<Map<String, Double>> c20337914i12 = InterfaceC1106030et7.B5;
        c20337914i12.LIZIZ().put(c1113840f5i.LIZJ, Double.valueOf(System.currentTimeMillis()));
        c20337914i12.LIZJ();
        LJIIJ(c1113840f5i.LJFF);
    }

    public static boolean LJJI(int i, String str) {
        double dDoubleValue;
        LiveTooltipDebugSetting liveTooltipDebugSetting = LiveTooltipDebugSetting.INSTANCE;
        if (liveTooltipDebugSetting.getValue().getOutdatedVersion() > 0) {
            i = liveTooltipDebugSetting.getValue().getOutdatedVersion();
        }
        Double d = InterfaceC1106030et7.A5.LIZIZ().get(str);
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        int shortVersionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getShortVersionCode();
        if (dDoubleValue > 0.0d && ((double) shortVersionCode) - dDoubleValue >= i * 100 && i > 0) {
            return true;
        }
        return false;
    }

    public static void LJIIJJI(Handler handler, C0UX8 c0ux8, DataChannel dataChannel) {
        LIZIZ = true;
        LIZJ = handler;
        LIZLLL = System.currentTimeMillis();
        LJ = c0ux8;
        LJFF = c0ux8.isAnchor;
        LJI.put(c0ux8.page, new PriorityQueue(5, new Comparator() { // from class: X.0eqF
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C1113840f5i) obj).LIZIZ - ((C1113840f5i) obj2).LIZIZ;
            }
        }));
        LJIILIIL.put(c0ux8.page, new LinkedList());
        if (LJII != null) {
            LJII = null;
        }
        if (dataChannel != null) {
            LJIIJ.put(c0ux8, dataChannel);
        }
    }

    public static void LJIJI(C1113840f5i c1113840f5i, String str, String str2) {
        String string;
        CharSequence charSequenceLIZ = c1113840f5i.LIZ.LIZ();
        String str3 = "";
        if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
            string = "";
        }
        C0IR5 c0ir5 = c1113840f5i.LJIIJ;
        String str4 = c1113840f5i.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - c1113840f5i.LIZLLL;
        String str5 = c1113840f5i.LJFF;
        if (str5 != null) {
            str3 = str5;
        }
        LJIJJ(string, c0ir5, str, str4, str2, jCurrentTimeMillis, str3, c1113840f5i.LJII, c1113840f5i.LIZ.LIZJ(), c1113840f5i.LJIIIIZZ);
    }

    public final void LJ(C1119660fF6 c1119660fF6, EnumC1120860fH2 enumC1120860fH2, DataChannel dataChannel) {
        String key = enumC1120860fH2.getKey();
        String position = enumC1120860fH2.getPosition();
        String targetId = enumC1120860fH2.getTargetId();
        long periodId = enumC1120860fH2.getPeriodId();
        getClass();
        LJFF(c1119660fF6, key, dataChannel, null, position, targetId, periodId, 0L);
    }

    public static void LJIJJLI(String str, EnumC1120860fH2 enumC1120860fH2, String str2, String str3) {
        String str4;
        String str5 = str2;
        if (str5 == null) {
            str5 = "";
        }
        C0UX8 c0ux8 = LJ;
        if (c0ux8 == null || (str4 = c0ux8.page) == null) {
            str4 = "";
        }
        LJIJJ(str5, null, str4, enumC1120860fH2.getPosition(), str, 0L, enumC1120860fH2.getKey(), str3, false, enumC1120860fH2.getPeriodId());
    }

    public static void LJFF(C1119660fF6 c1119660fF6, String str, DataChannel dataChannel, C1102240en0 c1102240en0, String str2, String str3, long j, long j2) {
        C0IR5 c0ir5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueueInformationTooltip key : ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveTooltip", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel != null) {
            c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
        } else {
            c0ir5 = null;
        }
        String strLJII = LJII(c1119660fF6, str, c0ir5, c1102240en0, str2, str3, j, j2);
        if (strLJII != null && strLJII.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enqueueInformationTooltip failed : ");
            sbLIZ2.append(strLJII);
            C20441214yg.LJ("LiveTooltip", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static String LJII(final C1119660fF6 c1119660fF6, String str, C0IR5 c0ir5, C1102240en0 c1102240en0, String str2, String str3, long j, long j2) {
        String str4;
        C474500IjA c474500IjALIZ;
        String string;
        boolean z;
        boolean z2;
        InterfaceC1102150emr interfaceC1102150emr;
        double dDoubleValue;
        String string2;
        Context context;
        C19EG c19egLJ;
        final String str5 = str;
        long j3 = j2;
        String str6 = str2;
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        InterfaceC1102150emr interfaceC1102150emr2 = null;
        final String str7 = null;
        if (!C782850UnL.LIZIZ()) {
            C20441214yg.LJ("LiveTooltip", "toolStandardManager config not init");
            C0UX8 c0ux8 = LJ;
            if (c0ux8 != null) {
                str7 = c0ux8.page;
            }
            final C1113850f5j c1113850f5j = new C1113850f5j(c1119660fF6, str5, c0ir5, c1102240en0, str6, str3, j, j3);
            Queue<C1113850f5j> queue = LJIILIIL.get(str7);
            if (queue != null) {
                queue.offer(c1113850f5j);
            }
            View view = c1119660fF6.LIZIZ;
            if (view != null) {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0f5k
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        Queue<C1113850f5j> queue2 = C1113800f5e.LJIILIIL.get(str7);
                        if (queue2 != null) {
                            queue2.remove(c1113850f5j);
                        }
                        View view3 = c1119660fF6.LIZIZ;
                        if (view3 != null) {
                            view3.removeOnAttachStateChangeListener(this);
                        }
                    }
                });
            }
            C11JF c11jf = LJIILJJIL;
            if (c11jf == null || c11jf.isDisposed()) {
                LJIILJJIL = (C11JF) C782850UnL.LJ().LJJLL(new C09JN() { // from class: X.0f5g
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("TooltipStandardManager@a4d5.enqueueInformationTooltipInternal$2");
                        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                        C1113800f5e.LJIIIIZZ();
                        C1C7U.LIZIZ("TooltipStandardManager@a4d5.enqueueInformationTooltipInternal$2");
                    }
                }, new C09JN() { // from class: X.0f5h
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("TooltipStandardManager@a4d5.enqueueInformationTooltipInternal$3");
                        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                        C1113800f5e.LJIIIIZZ();
                        C1C7U.LIZIZ("TooltipStandardManager@a4d5.enqueueInformationTooltipInternal$3");
                    }
                });
                return "config not init, will enqueue after init";
            }
            return "config not init, will enqueue after init";
        }
        if (LJIIL && (context = c1119660fF6.LIZ) != null && (c19egLJ = C500260Jjc.LJ(context)) != null && c19egLJ.isFinishing()) {
            return "activity isFinishing";
        }
        LiveMessagePlatformBubbleConfig value = LiveMessagePlatformCommonPreferenceBubbleSetting.INSTANCE.getValue(str5);
        if (value == null) {
            return "key is not config";
        }
        int i = value.priority;
        int i2 = value.lifetime;
        if (C500260Jjc.LJJIIZ(value.position)) {
            str6 = value.position;
        }
        int i3 = value.showCount;
        if (j3 <= 0 || !C500260Jjc.LJJIIZI(value.strategyScene) || !C500260Jjc.LJJIIZI(value.strategyDecisionKey)) {
            j3 = value.showDuration;
        }
        boolean zLJIIL = LJIIL(value);
        C0UX8 c0ux82 = LJ;
        String str8 = "";
        if (c0ux82 == null || (str4 = c0ux82.page) == null) {
            str4 = "";
        }
        if (LJFF) {
            c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_bubble_call");
        } else {
            c474500IjALIZ = C0IJT.LIZ("livesdk_bubble_call");
        }
        CharSequence charSequenceLIZ = c1119660fF6.LIZ();
        if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "content");
        c474500IjALIZ.LJIJJ(c0ir5);
        if (str4.length() > 0) {
            c474500IjALIZ.LJJII(str4, "event_page");
        }
        if (C500260Jjc.LJJIIZ(str3)) {
            c474500IjALIZ.LJJII(str3, "target_id");
        }
        if (j > 0) {
            c474500IjALIZ.LJJII(String.valueOf(j), "period_id");
        }
        c474500IjALIZ.LJJII(str6, "position");
        c474500IjALIZ.LJJII(str5, "content_id");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZLLL), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(c1119660fF6.LIZJ() ? 1 : 0), "is_panel");
        c474500IjALIZ.LIZ();
        Queue<C1113840f5i> queue2 = LJI.get(str4);
        final String str9 = str6;
        final C1113840f5i c1113840f5i = new C1113840f5i(value, c1119660fF6, i, str6, System.currentTimeMillis(), str5, c0ir5, zLJIIL);
        c1113840f5i.LJII = str3;
        c1113840f5i.LJIIIIZZ = j;
        if (LJIIL(value) && LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C1102230emz c1102230emz = new C1102230emz(str5, value, c1113840f5i, C963140bAe.LIZIZ(), z, new WeakReference(c1119660fF6.LIZIZ), c1102240en0);
        Map<String, C1102230emz> map = LJIILL;
        map.put(str5, c1102230emz);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        HashMap<C0UX8, DataChannel> map2 = LJIIJ;
        DataChannel dataChannel = map2.get(LJ);
        C1113780f5c c1113780f5c = c1102230emz.LJFF;
        c1102070emj.getClass();
        C1102070emj.LJJIII(dataChannel, c1113780f5c, c1102230emz);
        final InterfaceC254900yh interfaceC254900yhLIZIZ = c1119660fF6.LIZIZ();
        final String str10 = str4;
        c1119660fF6.LJI(new InterfaceC254900yh() { // from class: X.0f5f
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC254900yh
            public final void x1(int i4) {
                C0KAJ c0kaj;
                C1113780f5c c1113780f5c2;
                Object[] objArr;
                C474500IjA c474500IjALIZ2;
                String string3;
                C474500IjA c474500IjALIZ3;
                String string4;
                if (i4 != 1) {
                    if (i4 != 3) {
                        if (i4 != 6 && i4 != 7 && i4 != 8) {
                            c0kaj = C0KAJ.AUTO_TERMINATE;
                        } else {
                            c0kaj = C0KAJ.MANUALLY_ROUTE;
                        }
                    } else {
                        c0kaj = C0KAJ.MANUALLY_CLOSE;
                    }
                } else {
                    c0kaj = C0KAJ.AUTO_TIMEOUT;
                }
                Map<String, C1102230emz> map3 = C1113800f5e.LJIILL;
                C1102230emz c1102230emz2 = (C1102230emz) ((LinkedHashMap) map3).get(c1113840f5i.LJFF);
                C1102070emj c1102070emj2 = C1102070emj.LIZ;
                DataChannel dataChannel2 = C1113800f5e.LJIIJ.get(C1113800f5e.LJ);
                if (c1102230emz2 != null) {
                    c1113780f5c2 = c1102230emz2.LJFF;
                } else {
                    c1113780f5c2 = null;
                }
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                Map mapLJIIIZ = C1113800f5e.LJIIIZ(c1113840f5i, c1102230emz2);
                String str11 = "icon";
                if (i4 == 6) {
                    objArr = "icon";
                } else {
                    objArr = "self";
                }
                mapLJIIIZ.put("click_pos", objArr);
                C1102070emj.LJIILJJIL(c1102070emj2, dataChannel2, c1113780f5c2, c1102230emz2, c0kaj, mapLJIIIZ, null, 96);
                map3.remove(c1113840f5i.LJFF);
                if (C1113800f5e.LJFF) {
                    c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_bubble_duration");
                } else {
                    c474500IjALIZ2 = C0IJT.LIZ("livesdk_bubble_duration");
                }
                switch (i4) {
                    case 1:
                        c474500IjALIZ2.LJJII("no_action", "reason");
                        break;
                    case 2:
                        c474500IjALIZ2.LJJII("pointer_remove", "reason");
                        break;
                    case 3:
                        c474500IjALIZ2.LJJII("click_outside", "reason");
                        break;
                    case 4:
                    case 5:
                    default:
                        c474500IjALIZ2.LJJII("other", "reason");
                        break;
                    case 6:
                        c474500IjALIZ2.LJJII("click_pointer", "reason");
                        break;
                    case 7:
                    case 8:
                        c474500IjALIZ2.LJJII("click_bubble", "reason");
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        c474500IjALIZ2.LJJII("leave_room", "reason");
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        c474500IjALIZ2.LJJII("leave_page", "reason");
                        break;
                }
                c474500IjALIZ2.LJIJJ(c1113840f5i.LJIIJ);
                CharSequence charSequenceLIZ2 = c1113840f5i.LIZ.LIZ();
                String str12 = "";
                if (charSequenceLIZ2 == null || (string3 = charSequenceLIZ2.toString()) == null) {
                    string3 = "";
                }
                c474500IjALIZ2.LJJII(string3, "content");
                if (C500260Jjc.LJJIIZ(c1113840f5i.LJII)) {
                    c474500IjALIZ2.LJJII(c1113840f5i.LJII, "target_id");
                }
                long j4 = c1113840f5i.LJIIIIZZ;
                if (j4 > 0) {
                    c474500IjALIZ2.LJJII(Long.valueOf(j4), "period_id");
                }
                c474500IjALIZ2.LJJII(str10, "event_page");
                c474500IjALIZ2.LJJII(str9, "position");
                c474500IjALIZ2.LJJII(str5, "content_id");
                c474500IjALIZ2.LJJII(Long.valueOf(System.currentTimeMillis() - c1113840f5i.LJ), "duration");
                c474500IjALIZ2.LJJII(Integer.valueOf(c1113840f5i.LIZ.LIZJ() ? 1 : 0), "is_panel");
                c474500IjALIZ2.LIZ();
                InterfaceC254900yh interfaceC254900yh = interfaceC254900yhLIZIZ;
                if (interfaceC254900yh != null) {
                    interfaceC254900yh.x1(i4);
                }
                if (i4 != 6 && i4 != 7 && i4 != 8) {
                    return;
                }
                if (C1113800f5e.LJFF) {
                    c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_bubble_click");
                    c474500IjALIZ3.LJJII(str10, "event_page");
                } else {
                    c474500IjALIZ3 = C0IJT.LIZ("livesdk_audience_bubble_click");
                }
                c474500IjALIZ3.LJIJJ(c1113840f5i.LJIIJ);
                if (C500260Jjc.LJJIIZ(c1113840f5i.LJII)) {
                    c474500IjALIZ3.LJJII(c1113840f5i.LJII, "target_id");
                }
                long j5 = c1113840f5i.LJIIIIZZ;
                if (j5 > 0) {
                    c474500IjALIZ3.LJJII(Long.valueOf(j5), "period_id");
                }
                if (i4 != 6) {
                    str11 = "self";
                }
                c474500IjALIZ3.LJJII(str11, "click_pos");
                c474500IjALIZ3.LJJII(str10, "event_page");
                c474500IjALIZ3.LJJII(str9, "position");
                c474500IjALIZ3.LJJII(str5, "content_id");
                CharSequence charSequenceLIZ3 = c1113840f5i.LIZ.LIZ();
                if (charSequenceLIZ3 != null && (string4 = charSequenceLIZ3.toString()) != null) {
                    str12 = string4;
                }
                c474500IjALIZ3.LJJII(str12, "content");
                c474500IjALIZ3.LJJII(Integer.valueOf(c1113840f5i.LIZ.LIZJ() ? 1 : 0), "is_panel");
                c474500IjALIZ3.LIZ();
            }
        });
        if (LiveTooltipHotspotOptSetting.INSTANCE.enable() && !LiveTooltipHotspotOptBlockListSetting.INSTANCE.isBlocked(str5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1119660fF6.LJJ = z2;
        if (!Intrinsics.LJFF(str5, EnumC1120860fH2.GIFT_COMBO_LONG_PRESS.getKey())) {
            c1119660fF6.LJII(LiveTooltipTouchOutsideDismissSetting.INSTANCE.enable());
            c1119660fF6.LJIIIIZZ();
            if (LiveTooltipDurationSetting.INSTANCE.enable()) {
                c1119660fF6.LJFF(j3);
            } else {
                c1119660fF6.LJFF(Mp4ScreenVideoLoadTimeout.CONTROL);
            }
        }
        LiveTooltipDebugSetting liveTooltipDebugSetting = LiveTooltipDebugSetting.INSTANCE;
        if (liveTooltipDebugSetting.getValue().getChangeColor()) {
            c1119660fF6.LJIJ = C497740JfY.LJFF(R.color.a99);
        }
        if (zLJIIL || (c1119660fF6.LIZJ() && LiveTooltipOnDialogFixSetting.INSTANCE.getValue())) {
            C1102230emz c1102230emz2 = (C1102230emz) ((LinkedHashMap) map).get(str5);
            DataChannel dataChannel2 = map2.get(LJ);
            if (c1102230emz2 != null) {
                interfaceC1102150emr = c1102230emz2.LJFF;
            } else {
                interfaceC1102150emr = null;
            }
            c1102070emj.LJJI(dataChannel2, interfaceC1102150emr, c1102230emz2, LJIIIZ(c1113840f5i, c1102230emz2));
            if (LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() == 0 || (c1119660fF6.LIZJ() && LiveTooltipOnDialogFixSetting.INSTANCE.getValue())) {
                LJJ(c1113840f5i, str4);
            }
            return null;
        }
        if (LJIL(i3, str5)) {
            CharSequence charSequenceLIZ2 = c1119660fF6.LIZ();
            if (charSequenceLIZ2 == null || (string2 = charSequenceLIZ2.toString()) == null) {
                string2 = "";
            }
            if (str9 == null) {
                str9 = "";
            }
            if (str5 != null) {
                str8 = str5;
            }
            LJIJJ(string2, c0ir5, str4, str9, "frequency_count_limit", 0L, str8, str3, c1119660fF6.LIZJ(), j);
            return "frequency_count_limit";
        }
        if (LJJI(i2, str5)) {
            return "versionOutdated";
        }
        if (!Intrinsics.LJFF(str5, EnumC1120860fH2.GIFT_TEAM_CHALLENGE_UNLOCK.getKey()) && liveTooltipDebugSetting.getValue().getPositionCheck() && str9.length() != 0) {
            Double d = InterfaceC1106030et7.B5.LIZIZ().get(str9);
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            if (C770620UKu.LIZ(System.currentTimeMillis(), (long) dDoubleValue)) {
                return "samePositionCheck";
            }
        }
        HashMap<Long, MsgNotifyQuota> map3 = C1102420enI.LIZ;
        C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(1, map2.get(LJ), str9, value.skipWatchEarlyFc, value.skipContinuousWatchFc);
        if (!c512940K9sLIZLLL.LIZ) {
            C1102230emz c1102230emz3 = (C1102230emz) ((LinkedHashMap) map).get(str5);
            DataChannel dataChannel3 = map2.get(LJ);
            if (c1102230emz3 != null) {
                interfaceC1102150emr2 = c1102230emz3.LJFF;
            }
            c1102070emj.LJIILL(dataChannel3, interfaceC1102150emr2, c1102230emz3, c512940K9sLIZLLL.LIZIZ);
            map.remove(str5);
            return "FrequencyControlled";
        }
        if (queue2 != null && queue2.size() == 0) {
            Handler handler = LIZJ;
            if (handler != null) {
                C786410Ut5.LJLIIL(500L, handler, new ARunnableS10S1000000_17(str4, 0));
            }
            if (LJIIJJI) {
                C20441214yg.LIZIZ("LiveTooltip", "startTooltipDelay");
            }
        }
        if (LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enqueue: tooltipType.key:");
            if (str5 == null) {
                str5 = "";
            }
            sbLIZ.append(str5);
            C20441214yg.LIZIZ("LiveTooltip", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (queue2 != null) {
            queue2.add(c1113840f5i);
        }
        if (liveTooltipDebugSetting.getValue().getPageCheck() && !LIZIZ) {
            LJIILL("priority_limit", str4);
            LIZ(str4);
        }
        return null;
    }

    public static void LJIJJ(String str, C0IR5 c0ir5, String str2, String str3, String str4, long j, String str5, String str6, boolean z, long j2) {
        C474500IjA c474500IjALIZ;
        if (LJFF) {
            c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_bubble_abortion");
        } else {
            c474500IjALIZ = C0IJT.LIZ("livesdk_bubble_abortion");
        }
        c474500IjALIZ.LJJII(str, "content");
        c474500IjALIZ.LJIJJ(c0ir5);
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(str3, "position");
        c474500IjALIZ.LJJII(str4, "reason");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(str5, "content_id");
        if (C500260Jjc.LJJIIZ(str6)) {
            c474500IjALIZ.LJJII(str6, "target_id");
        }
        if (j2 > 0) {
            c474500IjALIZ.LJJII(String.valueOf(j2), "period_id");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_panel");
        c474500IjALIZ.LIZ();
    }
}
