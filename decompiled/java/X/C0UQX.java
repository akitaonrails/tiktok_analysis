package X;

import Y.ARunnableS33S1200000_31;
import Y.ARunnableS5S1100100_20;
import android.os.BaseBundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel;
import com.bytedance.android.livesdk.broadcast.PreviewPromoteTopicChannel;
import com.bytedance.android.livesdk.chatroom.model.RoomTag;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePushStreamLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableLogReportOptSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UQX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQX {
    public static long LIZ;

    public static final void LJII() {
        AVLog.setLevel(LivePushStreamLogLevelSetting.INSTANCE.getValue());
        final C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        final String str = EnumC1143310frF.PushStream.info;
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(C465520INi.LIZ.XD1()));
        AVLog.setupLogKibanaDevice(new InterfaceC1269880j9O() { // from class: X.0jBG
            @Override // X.InterfaceC1269880j9O
            public final /* synthetic */ void LIZJ(String str2, String str3, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1269880j9O
            public final void LIZLLL(String str2, JSONObject jSONObject) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS5S1100100_20(str2, System.currentTimeMillis(), jSONObject, 0));
            }

            @Override // X.InterfaceC1269880j9O
            public final void LIZ(final int i, final String str2, final String str3, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("print() called with: level = ");
                sbLIZ.append(i);
                sbLIZ.append(", tag = ");
                sbLIZ.append(str2);
                sbLIZ.append(", msg = ");
                sbLIZ.append(str3);
                sbLIZ.append(", p3 = ");
                sbLIZ.append(th);
                C20441214yg.LIZIZ("preview_log", C2188811AlT.LIZIZ(sbLIZ));
                final long jNativeNanoTime = TimeUtils.nativeNanoTime() / ((long) 1000000);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0jBE
                    public final void LIZ() {
                        JSONObject jSONObjectLIZIZ = C0UQX.LIZIZ(jCurrentTimeMillis);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("clockMs", jNativeNanoTime);
                            jSONObject.put("level", i);
                            jSONObject.put("tag", str2);
                            jSONObject.put("msg", str3);
                            jSONObjectLIZIZ.put("event_key", "live_sdk_log").put("message", C786410Ut5.J3(jSONObject));
                            jSONObjectLIZIZ.put("livecore_event_index", AbstractC1273900jFs.LL.incrementAndGet());
                            jSONObjectLIZIZ.put("livecore_app_alive_uuid", AbstractC1273900jFs.LLILLJJLI);
                            if (TTLHEnableLogReportOptSettings.INSTANCE.enabled()) {
                                jSONObjectLIZIZ.put("live_stream_session_id", C1269340j8W.LJZI);
                            }
                            C0UQX.LJJIJIIJI(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$print$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$print$1");
                    }
                });
            }

            @Override // X.InterfaceC1269880j9O
            public final void LIZIZ(final int i, final String str2, final String str3, final String str4, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("print() called with: level = ");
                sbLIZ.append(i);
                sbLIZ.append(", tag = ");
                sbLIZ.append(str2);
                sbLIZ.append(", event = ");
                sbLIZ.append(str3);
                sbLIZ.append(", msg = ");
                sbLIZ.append(str4);
                sbLIZ.append(", p4 = ");
                sbLIZ.append(th);
                C20441214yg.LIZIZ("preview_log", C2188811AlT.LIZIZ(sbLIZ));
                final long jNativeNanoTime = TimeUtils.nativeNanoTime() / ((long) 1000000);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0jBF
                    public final void LIZ() {
                        JSONObject jSONObjectLIZIZ = C0UQX.LIZIZ(jCurrentTimeMillis);
                        if (jSONObjectLIZIZ != null) {
                            try {
                                if (u.LJIJI(str3, "bw_probe", false)) {
                                    jSONObjectLIZIZ.put("clockMs", jNativeNanoTime);
                                    jSONObjectLIZIZ.put("level", i);
                                    jSONObjectLIZIZ.put("tag", str2);
                                    JSONObject jSONObject = new JSONObject(str4);
                                    Iterator<String> itKeys = jSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        jSONObjectLIZIZ.put(next, jSONObject.get(next));
                                    }
                                } else {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("clockMs", jNativeNanoTime);
                                    jSONObject2.put("level", i);
                                    jSONObject2.put("tag", str2);
                                    jSONObject2.put("msg", str4);
                                    jSONObjectLIZIZ.put("message", C786410Ut5.J3(jSONObject2));
                                }
                                jSONObjectLIZIZ.put("event_key", str3);
                                jSONObjectLIZIZ.put("livecore_event_index", AbstractC1273900jFs.LL.incrementAndGet());
                                jSONObjectLIZIZ.put("livecore_app_alive_uuid", AbstractC1273900jFs.LLILLJJLI);
                                C0UQX.LJJIJIIJI(jSONObjectLIZIZ);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$print$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$print$2");
                    }
                });
            }
        });
        AVLog.setupLogIODevice(new InterfaceC1269880j9O() { // from class: X.1500
            @Override // X.InterfaceC1269880j9O
            public final /* synthetic */ void LIZJ(String str2, String str3, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1269880j9O
            public final /* synthetic */ void LIZLLL(String str2, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1269880j9O
            public final void LIZ(int i, String str2, String str3, Throwable th) {
                JSONObject jSONObject = new JSONObject();
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    jSONObject.put("sdktag", str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("sdkmsg", str3);
                    if (th != null) {
                        jSONObject.put("throwable", th);
                    }
                    switch (i) {
                        case 2:
                        case 3:
                            c1143300frELJIIJJI.LIZJ(str, jSONObject);
                            break;
                        case 4:
                            C1143300frE c1143300frE = c1143300frELJIIJJI;
                            String str4 = str;
                            c1143300frE.getClass();
                            if (!TextUtils.isEmpty(str4)) {
                                AbstractC1143290frD.LJIIIIZZ(new ARunnableS33S1200000_31(c1143300frE, jSONObject, str4, 2));
                            }
                            break;
                        case 5:
                            C1143300frE c1143300frE2 = c1143300frELJIIJJI;
                            String str5 = str;
                            c1143300frE2.getClass();
                            if (!TextUtils.isEmpty(str5)) {
                                AbstractC1143290frD.LJIIIIZZ(new ARunnableS33S1200000_31(c1143300frE2, jSONObject, str5, 3));
                            }
                            break;
                        case 6:
                        case 7:
                            C1143300frE c1143300frE3 = c1143300frELJIIJJI;
                            String str6 = str;
                            c1143300frE3.getClass();
                            if (!TextUtils.isEmpty(str6)) {
                                AbstractC1143290frD.LJIIIIZZ(new ARunnableS33S1200000_31(c1143300frE3, jSONObject, str6, 4));
                            }
                            break;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    HashMap map = new HashMap();
                    map.put("errtag", e.getClass());
                    map.put("AVLog.ILogFilter", e.getMessage());
                    c1143300frELJIIJJI.LJ("", map);
                }
            }

            @Override // X.InterfaceC1269880j9O
            public final void LIZIZ(int i, String str2, String str3, String str4, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (str3 == null) {
                    str3 = "";
                }
                sbLIZ.append(str3);
                sbLIZ.append(' ');
                if (str4 == null) {
                    str4 = "";
                }
                sbLIZ.append(str4);
                LIZ(i, str2, C2188811AlT.LIZIZ(sbLIZ), th);
            }
        });
    }

    public static final void LIZ(C474500IjA c474500IjA) {
        String string;
        Integer numLIZ = InterfaceC772190UQv.o4.LIZ();
        if (numLIZ != null && numLIZ.intValue() > 0 && (string = numLIZ.toString()) != null) {
            c474500IjA.LJJII(string, "final_anchor_type");
        }
    }

    public static final JSONObject LIZIZ(long j) {
        new JSONObject();
        try {
            return new JSONObject().put("product_line", "live").put("version", "preview_version").put("live_sdk_version", "preview_version").put("report_version", 5).put("timestamp", j).put("mode", "push").put("project_key", "live-stream-sdk");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static final String LIZJ(DataChannel dataChannel) {
        String str;
        String str2 = (String) DataChannelGlobal.LLILZ.gg0(C931040aKs.class);
        String str3 = null;
        if (dataChannel != null) {
            str = (String) dataChannel.gg0(C0UNN.class);
            str3 = (String) dataChannel.gg0(C772030UQf.class);
        } else {
            str = null;
        }
        return LIZLLL(dataChannel, str2, str, str3);
    }

    public static final String LJ(StreamUrl streamUrl) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = "";
        try {
            JSONObject jSONObjectLIZJ = streamUrl.LIZJ();
            if (jSONObjectLIZJ == null || (jSONObjectOptJSONObject = jSONObjectLIZJ.optJSONObject("PushBase")) == null) {
                return "";
            }
            strOptString = jSONObjectOptJSONObject.optString("vCodec");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public static final int LJFF(LiveMode liveMode) {
        String strName;
        Gson gson = C19748512Ol.LIZIZ;
        Map<String, String> mapLIZIZ = InterfaceC772190UQv.i3.LIZIZ();
        if (liveMode != null) {
            strName = liveMode.name();
        } else {
            strName = null;
        }
        RoomTag roomTag = (RoomTag) GsonProtectorUtils.fromJson(gson, mapLIZIZ.get(strName), RoomTag.class);
        if (roomTag != null) {
            return roomTag.id;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r1
      0x0011: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x000f, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI(com.bytedance.ies.sdk.datachannel.DataChannel r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto Le
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewTitleChannel.class
            java.lang.Object r1 = r3.gg0(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L11
        Le:
            r1 = r2
            if (r3 == 0) goto L20
        L11:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel.class
            java.lang.Object r0 = r3.gg0(r0)
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r0 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r0
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.mTitle
            if (r0 == 0) goto L20
            r2 = r0
        L20:
            int r0 = r1.length()
            if (r0 != 0) goto L2f
            int r0 = r2.length()
            if (r0 != 0) goto L2f
            java.lang.String r0 = "default"
            return r0
        L2f:
            int r0 = r1.length()
            if (r0 != 0) goto L3e
            int r0 = r2.length()
            if (r0 <= 0) goto L3e
            java.lang.String r0 = "none"
            return r0
        L3e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L47
            java.lang.String r0 = "last_title"
            return r0
        L47:
            java.lang.String r0 = "new_title"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQX.LJI(com.bytedance.ies.sdk.datachannel.DataChannel):java.lang.String");
    }

    public static final void LJIJJ(DataChannel dataChannel) {
        Boolean boolValueOf;
        String str;
        LiveMode liveMode;
        LiveMode liveMode2;
        String strLIZ = null;
        if (dataChannel != null && (liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode2));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
            str = "live_detail";
        } else {
            str = "outside";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cover_modify_click");
        c474500IjALIZ.LJIILL("click");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIL(boolean z) throws JSONException {
        boolean zBooleanValue;
        C760160Trq c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_fetch_pc_mode_all");
        c760160TrqLIZJ.LJ("preview");
        Boolean boolValueOf = Boolean.valueOf(z);
        JSONObject jSONObject = c760160TrqLIZJ.LIZIZ;
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        jSONObject.put("support_pc_mode", zBooleanValue);
        c760160TrqLIZJ.LJI = true;
        c760160TrqLIZJ.LJIIIZ();
    }

    public static final void LJJIJIIJI(JSONObject jSONObject) {
        try {
            jSONObject.put("live_platform_version", C465680INy.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("StreamLog", th);
        }
        ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1().B0(jSONObject, true);
    }

    public static final void LJIIJ(DataChannel dataChannel, String str) {
        String str2;
        if (dataChannel != null) {
            dataChannel.zW(LiveEducationTouchChannel.class, Boolean.TRUE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_education_touch");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "touch_type");
        String str3 = (String) DataChannelGlobal.LLILZ.gg0(C931040aKs.class);
        if (dataChannel != null) {
            str2 = (String) dataChannel.gg0(C0UNN.class);
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(LIZLLL(dataChannel, str3, str2, null), "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIILJJIL(DataChannel dataChannel, boolean z) {
        String strLIZ;
        String str;
        LiveMode liveMode;
        if (dataChannel != null) {
            dataChannel.zW(LiveEducationTouchChannel.class, Boolean.FALSE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_bottom");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (z) {
            str = "more";
        } else {
            str = "less";
        }
        c474500IjALIZ.LJJII(str, "icon_name");
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIFFI(DataChannel dataChannel, String str) {
        Long lValueOf;
        LiveMode liveMode;
        RoomCreateInfo roomCreateInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_enter_room");
        c474500IjALIZ.LJIJJLI(dataChannel);
        String strLIZ = null;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
            lValueOf = Long.valueOf(roomCreateInfo.mLastRoomId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIIJ(LiveMode liveMode, DataChannel dataChannel) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_practice_learn_more_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (liveMode == LiveMode.SCREEN_RECORD) {
            str = "gaming_livetake_page";
        } else {
            str = "live_take_page";
        }
        c474500IjALIZ.LJJII(str, "page_name");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJIJL();
    }

    public static final void LJIILIIL(int i, DataChannel dataChannel, boolean z) {
        String strLIZ;
        String str;
        LiveMode liveMode;
        if (dataChannel != null) {
            dataChannel.zW(LiveEducationTouchChannel.class, Boolean.FALSE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_more_less");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (z) {
            str = "more";
        } else {
            str = "less";
        }
        c474500IjALIZ.LJJII(str, "icon_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "have_red_dot");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIILLIIL(int i, String str, long j) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_room_create_info_from_preview", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII("normal", "enter_from");
        c474500IjALIZIZ.LJJII("normal", "is_smooth");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_success");
        c474500IjALIZIZ.LJJII(0, "cache");
        c474500IjALIZIZ.LJJII(str, "error");
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZIZ.LIZ();
    }

    public static final void LJIIZILJ(DataChannel dataChannel, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_take_title_write");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJJII(str, "streaming_type");
        if (z) {
            str2 = "audio_live";
        } else {
            str2 = "video_live";
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIJ(long j, DataChannel dataChannel, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_brightness_detect");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_dark_scene");
        c474500IjALIZ.LJJII(Long.valueOf(j), "exposure_detect_result");
        c474500IjALIZ.LJIILJJIL("live_take_page");
        c474500IjALIZ.LIZ();
    }

    public static final void LJJ(DataChannel dataChannel, int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_one_account_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "context_version");
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIIZ(DataChannel dataChannel, String str, String str2) {
        Object objGg0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_safety_edu_pop_up");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0UNN.class);
        } else {
            objGg0 = null;
        }
        c474500IjALIZ.LJJII(objGg0, "enter_from");
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r4.equals("live_invite_cohost") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r4.equals("inner_match_campaign_remind") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r4.equals("push") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r4.equals("game_rewards_inbox") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r4.equals("toplive_hangout_golive") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r4.equals("inner_match_campaign_start") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if (r4.equals("inner_push") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r4.equals("match_campaign_remind") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r4.equals("match_campaign_start") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        if (r4.equals("notification_page") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        return r4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            if (r2 == 0) goto L13
            java.lang.Class<X.0UQh> r0 = X.C772050UQh.class
            java.lang.Object r1 = r2.gg0(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L13
            boolean r0 = X.C1533950q1J.LJ(r1)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = "click_plus"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            java.lang.String r2 = "camera"
            java.lang.String r1 = "notification_page"
            if (r0 == 0) goto L26
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r0 == 0) goto L26
            return r2
        L26:
            if (r4 == 0) goto L2f
            int r0 = r4.hashCode()
            switch(r0) {
                case -1572049565: goto L8b;
                case -1300962313: goto L3a;
                case -551740559: goto L43;
                case 3452698: goto L4c;
                case 42893342: goto L55;
                case 460755477: goto L5e;
                case 814845046: goto L67;
                case 823500643: goto L70;
                case 1650888858: goto L79;
                case 2132823597: goto L82;
                default: goto L2f;
            }
        L2f:
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L39
            if (r3 != 0) goto L92
        L39:
            return r2
        L3a:
            java.lang.String r0 = "live_invite_cohost"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L43:
            java.lang.String r0 = "inner_match_campaign_remind"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L4c:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L55:
            java.lang.String r0 = "game_rewards_inbox"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L5e:
            java.lang.String r0 = "toplive_hangout_golive"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L67:
            java.lang.String r0 = "inner_match_campaign_start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L70:
            java.lang.String r0 = "inner_push"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L79:
            java.lang.String r0 = "match_campaign_remind"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L82:
            java.lang.String r0 = "match_campaign_start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L91
            goto L2f
        L8b:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L2f
        L91:
            return r4
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQX.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_widget_base_monitor");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str3, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "widget_name");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIILL(long j, DataChannel dataChannel, String str, String str2) {
        long id;
        String strLIZ;
        LiveMode liveMode;
        InterfaceC2262081DgM currentUser;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_multi_device_resume_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "resume_room_id");
        c474500IjALIZ.LJJII(1, "cross_device_continue");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "resume_live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIJJLI(LiveMode liveMode, String str, String str2, boolean z) {
        String strName;
        String str3;
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_open_room");
        c760160TrqLIZ.LIZLLL("title", str);
        c760160TrqLIZ.LIZLLL("cover", str2);
        if (liveMode != null) {
            strName = liveMode.name();
        } else {
            strName = null;
        }
        c760160TrqLIZ.LIZLLL("live_mode", strName);
        c760160TrqLIZ.LIZIZ(InterfaceC766480U4w.LIZ.LIZIZ(), "filter_position");
        if (z) {
            str3 = "front";
        } else {
            str3 = "back";
        }
        c760160TrqLIZ.LIZLLL("camera_type", str3);
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJII.LIZIZ(), "beauty_skin");
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJIIIIZZ.LIZIZ(), "big_eyes");
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJIIIZ.LIZIZ(), "face_lift");
        c760160TrqLIZ.LJIIIZ();
    }

    public static final void LJJI(String str, DataChannel dataChannel, LiveMode liveMode, LiveMode liveMode2) {
        String strLIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_one_account_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(3, "context_version");
        String strLIZ2 = null;
        if (liveMode != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "start_live_type");
        if (liveMode2 != null) {
            strLIZ2 = C354201Zc.LIZ(liveMode2);
        }
        c474500IjALIZ.LJJII(strLIZ2, "end_live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIJ(boolean z, LiveMode liveMode, String str, DataChannel dataChannel) {
        String str2;
        Object obj;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        float fFloatValue = InterfaceC766480U4w.LJI.LIZIZ().floatValue() * 100.0f;
        float fFloatValue2 = InterfaceC766480U4w.LJII.LIZIZ().floatValue() * 100.0f;
        float fFloatValue3 = InterfaceC766480U4w.LJIIIIZZ.LIZIZ().floatValue() * 100.0f;
        float fFloatValue4 = InterfaceC766480U4w.LJIIIZ.LIZIZ().floatValue() * 100.0f;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_take_edit_features");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("click");
        if (z) {
            str2 = "audio_live";
        } else {
            str2 = "video_live";
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII(liveMode.logStreamingType, "streaming_type");
        c474500IjALIZ.LJJII(str, "anchor_id");
        int iLJFF = LJFF(liveMode);
        String str3 = "1";
        String strValueOf4 = CardStruct.IStatusCode.DEFAULT;
        if (iLJFF != -1) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_tag");
        if (C354201Zc.LIZIZ(liveMode) || (fFloatValue == 0.0f && fFloatValue2 == 0.0f && fFloatValue3 == 0.0f && fFloatValue4 == 0.0f)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_beauty");
        if (C354201Zc.LIZIZ(liveMode)) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(fFloatValue);
        }
        c474500IjALIZ.LJJII(strValueOf, "beauty_white");
        if (C354201Zc.LIZIZ(liveMode)) {
            strValueOf2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf2 = String.valueOf(fFloatValue2);
        }
        c474500IjALIZ.LJJII(strValueOf2, "beauty_skin");
        if (C354201Zc.LIZIZ(liveMode)) {
            strValueOf3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf3 = String.valueOf(fFloatValue3);
        }
        c474500IjALIZ.LJJII(strValueOf3, "beauty_bigeye");
        if (!C354201Zc.LIZIZ(liveMode)) {
            strValueOf4 = String.valueOf(fFloatValue4);
        }
        c474500IjALIZ.LJJII(strValueOf4, "beauty_facethin");
        c474500IjALIZ.LIZ();
        C759970TrX.LIZJ("ttlive_open_room").LJIIIZ();
    }

    public static final void LJIJI(DataChannel dataChannel, String str, String str2, String str3, Long l) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_banner_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("toast", "enter_from");
        c474500IjALIZ.LJJII("general", "appeal_type");
        c474500IjALIZ.LJJII(str, "record_id");
        c474500IjALIZ.LJJII(str2, "violation_type");
        c474500IjALIZ.LJJII(str3, "violation_reason");
        c474500IjALIZ.LJJII(l, "violation_anchor_id");
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        if (liveMode != null) {
            str4 = liveMode.logStreamingType;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJ(str4);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJII(com.bytedance.ies.sdk.datachannel.DataChannel r5, webcast.api.room.EntranceConditionsPopup r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            if (r5 == 0) goto La
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r1 = r5.gg0(r0)
            if (r1 != 0) goto Lc
        La:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        Lc:
            java.lang.String r0 = "livesdk_live_requirement"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            r4.LJIJJLI(r5)
            if (r9 == 0) goto L1d
            int r0 = r9.length()
            if (r0 != 0) goto L23
        L1d:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r1 != r0) goto L63
            java.lang.String r9 = "gaming_livetake_page"
        L23:
            java.lang.String r0 = "page_name"
            r4.LJJII(r9, r0)
            java.lang.String r0 = "action_type"
            r4.LJJII(r7, r0)
            X.C770730ULf.LIZLLL(r4)
            if (r8 == 0) goto L37
            java.lang.String r0 = "leave_type"
            r4.LJJII(r8, r0)
        L37:
            java.util.List<webcast.api.room.EntranceConditionsPopup$Condition> r1 = r6.conditions
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L48:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()
            webcast.api.room.EntranceConditionsPopup$Condition r0 = (webcast.api.room.EntranceConditionsPopup.Condition) r0
            java.lang.String r1 = r0.name
            boolean r0 = r0.match
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.LJJII(r0, r1)
            r3.add(r4)
            goto L48
        L63:
            java.lang.String r9 = "live_take_page"
            goto L23
        L66:
            r4.LJJIJL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQX.LJJII(com.bytedance.ies.sdk.datachannel.DataChannel, webcast.api.room.EntranceConditionsPopup, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void LJJIIJZLJL(String str, DataChannel dataChannel, C772320URi c772320URi, C772320URi c772320URi2, long j) {
        String idStr;
        Long lValueOf;
        String strLIZ;
        LiveMode streamType;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((room != null && room.isGameLiveStreamType()) || Intrinsics.LJFF(str, "show")) {
            C0UWG.LIZ(C497740JfY.LJII(), linkedHashMap);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_back_to_live");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LiveMode streamType2 = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJIJIIJIL(idStr);
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJII(String.valueOf(lValueOf));
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LJ(str);
        if (C771670UOv.LJFF) {
            c474500IjALIZ.LJJII("cross_device", "resume_type");
        }
        if (room != null) {
            streamType2 = room.getStreamType();
        }
        if (streamType2 == LiveMode.SCREEN_RECORD && c772320URi != null && c772320URi2 != null) {
            c474500IjALIZ.LJJII(Long.valueOf(j), "last_live_duration");
            c474500IjALIZ.LJJII(Integer.valueOf(c772320URi.LIZIZ), "last_live_orientation");
            c474500IjALIZ.LJJII(Integer.valueOf(c772320URi2.LIZIZ), "continue_live_orientation");
        }
        if (!linkedHashMap.isEmpty()) {
            c474500IjALIZ.LJJIIZI(linkedHashMap);
        }
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIIZI(DataChannel dataChannel, String str, String str2, String str3, Long l) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_banner_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILL("show");
        c474500IjALIZ.LJJII(str, "record_id");
        c474500IjALIZ.LJJII(str2, "violation_type");
        c474500IjALIZ.LJJII(str3, "violation_reason");
        c474500IjALIZ.LJJII(l, "violation_anchor_id");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIIZ(final DataChannel dataChannel, final boolean z, final String str, final String str2, final String str3, final int i) {
        final int iIntValue;
        final LiveMode liveMode;
        String str4;
        String str5;
        final boolean zBooleanValue;
        Boolean boolValueOf;
        final String str6;
        final String str7;
        boolean z2;
        boolean z3;
        Boolean bool;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Integer num = (Integer) dataChannelGlobal.gg0(C930720aKM.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -2;
        }
        Boolean boolValueOf2 = null;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        String str8 = (String) dataChannelGlobal.gg0(C931040aKs.class);
        if (dataChannel != null) {
            str4 = (String) dataChannel.gg0(C0UNN.class);
            str5 = (String) dataChannel.gg0(C772030UQf.class);
        } else {
            str4 = null;
            str5 = null;
        }
        final String strLIZLLL = LIZLLL(dataChannel, str8, str4, str5);
        boolean zContains = false;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C750200Tbm.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!User.sSubPermission || iIntValue == -2) {
            iIntValue = -1;
        }
        C758920Tpq c758920Tpq = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
        if (c758920Tpq != null && liveMode != null) {
            if (liveMode == LiveMode.VIDEO) {
                C758940Tps c758940Tps = c758920Tpq.LIZ;
                if (!c758940Tps.LJFF && 2 != c758940Tps.LJ) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolValueOf = Boolean.valueOf(z3);
            } else {
                C758940Tps c758940Tps2 = c758920Tpq.LIZ;
                int i2 = c758940Tps2.LIZJ;
                if (!c758940Tps2.LIZLLL && 2 != i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str6 = "setting";
        } else {
            str6 = "default";
        }
        C758920Tpq c758920Tpq2 = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
        if (c758920Tpq2 != null) {
            if (liveMode == LiveMode.VIDEO) {
                C758940Tps c758940Tps3 = c758920Tpq2.LIZ;
                if (c758940Tps3.LJFF || 2 == c758940Tps3.LJ) {
                    zContains = true;
                }
            } else {
                zContains = C1697810uHb.LJIIJJI(2, 1).contains(Integer.valueOf(c758920Tpq2.LIZ.LIZJ));
            }
            boolValueOf2 = Boolean.valueOf(zContains);
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0UQY
            public final /* synthetic */ boolean LLILZ = false;

            public final void LIZ() {
                DataChannel dataChannel2 = dataChannel;
                Object obj = strLIZLLL;
                LiveMode liveMode2 = liveMode;
                boolean z4 = this.LLILZ;
                int i3 = iIntValue;
                Object obj2 = str6;
                Object obj3 = str7;
                boolean z5 = z;
                boolean z6 = zBooleanValue;
                Object obj4 = str;
                Object obj5 = str2;
                Object obj6 = str3;
                int i4 = i;
                String str9 = (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(C758400Tp0.class), Boolean.TRUE)) ? "unfold" : "fold";
                C474500IjA c474500IjALIZ = C0IJT.LIZ("live_action");
                c474500IjALIZ.LJIJJLI(dataChannel2);
                c474500IjALIZ.LJIILL("click");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LJIILJJIL("live_action");
                c474500IjALIZ.LJIILIIL("action");
                InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
                if (interfaceC474510IjB != null) {
                    interfaceC474510IjB.LJIJJ(dataChannel2);
                }
                c474500IjALIZ.LJJII(obj, "enter_from");
                Object obj7 = CardStruct.IStatusCode.DEFAULT;
                if (z5) {
                    c474500IjALIZ.LJJII("1", "is_practice");
                    c474500IjALIZ.LJJII(obj4, "trymode_show_type");
                    c474500IjALIZ.LJJII(obj5, "trymode_click_type");
                    if (C474650IjP.LIZ()) {
                        c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C930990aKn.class), "has_enter_trymode");
                    }
                    c474500IjALIZ.LJJII(C474650IjP.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, "is_new_anchor");
                    if (Intrinsics.LJFF(obj4, "countdown_end")) {
                        c474500IjALIZ.LJJII(obj6, "trymode_countdown_type");
                        c474500IjALIZ.LJJII(Integer.valueOf(i4), "trymode_countdown_window");
                    }
                }
                c474500IjALIZ.LJJIIZI(dataChannel2 != null ? (Map) dataChannel2.gg0(C750470TcD.class) : null);
                c474500IjALIZ.LJJIIZI(dataChannel2 != null ? (Map) dataChannel2.gg0(C750490TcF.class) : null);
                c474500IjALIZ.LJJIIZI(dataChannel2 != null ? (Map) dataChannel2.gg0(C750480TcE.class) : null);
                c474500IjALIZ.LJJII(C474650IjP.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, "is_new_anchor");
                c474500IjALIZ.LJJII(liveMode2 != null ? C354201Zc.LIZ(liveMode2) : null, "live_type");
                c474500IjALIZ.LJJII("1", "is_pc_guidance");
                c474500IjALIZ.LJJII(z4 ? "1" : CardStruct.IStatusCode.DEFAULT, "is_application_needed");
                if (C494680Jac.LIZJ()) {
                    obj7 = "1";
                }
                c474500IjALIZ.LJJII(obj7, "is_subscriber_only_live");
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_opt_in");
                c474500IjALIZ.LJJII("default", "toggle_setting");
                c474500IjALIZ.LJJII(obj2, "toggle_setting");
                c474500IjALIZ.LJJII(obj3, "is_gaming_toggle");
                c474500IjALIZ.LJJII(str9, "bottom_status");
                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z6)) ? 1 : 0), "is_dark_scene");
                if (dataChannel2 != null) {
                    C772120UQo c772120UQo = (C772120UQo) dataChannel2.gg0(C771530UOh.class);
                    if (c772120UQo != null) {
                        if (c772120UQo.LIZJ.length() > 0) {
                            c474500IjALIZ.LJJII(c772120UQo.LIZJ, "rule_id");
                        }
                        if (c772120UQo.LIZ.length() > 0) {
                            c474500IjALIZ.LJJII(c772120UQo.LIZ, "push_from");
                        }
                    }
                    Object objGg0 = dataChannel2.gg0(C772040UQg.class);
                    if (objGg0 != null) {
                        c474500IjALIZ.LJJII(objGg0, "template_id_str");
                    }
                    Boolean bool2 = (Boolean) dataChannel2.gg0(C771500UOe.class);
                    if (bool2 != null && bool2.booleanValue()) {
                        c474500IjALIZ.LJJII("outapp_push", "push_from");
                    }
                    Object objGg02 = dataChannel2.gg0(C772100UQm.class);
                    if (objGg02 != null) {
                        c474500IjALIZ.LJJII(objGg02, "live_tab_show_type");
                    }
                    BaseBundle baseBundle = (BaseBundle) dataChannel2.gg0(C772020UQe.class);
                    if (baseBundle != null) {
                        c474500IjALIZ.LJJII(baseBundle.getString("push_from"), "push_from");
                        c474500IjALIZ.LJJII(baseBundle.getString("rank_enter_type"), "rank_enter_type");
                    }
                    Object objGg03 = dataChannel2.gg0(C0UJC.class);
                    if (objGg03 != null) {
                        c474500IjALIZ.LJJII(objGg03, "text_type");
                    }
                    Pair pair = (Pair) dataChannel2.gg0(PreviewPromoteTopicChannel.class);
                    if (pair != null) {
                        c474500IjALIZ.LJJII(pair.getFirst(), "live_take_topic");
                    }
                }
                C0UQX.LIZ(c474500IjALIZ);
                c474500IjALIZ.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreviewLogHelperKt@d15e.logLiveAction$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreviewLogHelperKt@d15e.logLiveAction$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[PHI: r0
      0x0050: PHI (r0v337 java.lang.Boolean) = (r0v332 java.lang.Boolean), (r0v338 java.lang.Boolean) binds: [B:132:0x01e5, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a40 A[PHI: r5
      0x0a40: PHI (r5v9 java.lang.Integer) = (r5v8 java.lang.Integer), (r5v12 java.lang.Integer) binds: [B:204:0x0334, B:208:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0ae9  */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [int] */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(com.bytedance.android.livesdkapi.depend.model.live.Room r34, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r35, com.bytedance.ies.sdk.datachannel.DataChannel r36, int r37, boolean r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQX.LJIIJJI(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, com.bytedance.ies.sdk.datachannel.DataChannel, int, boolean, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
