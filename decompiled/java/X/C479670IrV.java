package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479670IrV {
    public static final C479670IrV LIZ = new C479670IrV();
    public static String LIZIZ = "discover";
    public static String LIZJ = "";
    public static String LIZLLL = "none";
    public static boolean LJ;
    public static boolean LJFF;

    public static void LIZJ(String str) {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        Object obj;
        EnterRoomConfig.LogData logData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null) {
            HashMap map = new HashMap();
            boolean z3 = false;
            if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                z = LJFF;
            } else {
                z = false;
            }
            if (!MultiGuestTopLiveIterationPhase1Setting.isEnable() ? (str2 = enterRoomConfig.mLogData.topliveHomepageType) == null : !(!z ? (str2 = (logData = enterRoomConfig.mLogData).topLiveSource) != null || (str2 = logData.topliveHomepageType) != null : (str2 = enterRoomConfig.mLogData.topliveHomepageType) != null)) {
                str2 = "homepage_hot";
            }
            if (!MultiGuestTopLiveIterationPhase1Setting.isEnable() ? (str3 = enterRoomConfig.mLogData.liveTabSource) == null : !(!z ? (str3 = enterRoomConfig.mLogData.liveTabSource) != null : (str3 = enterRoomConfig.mRoomsData.enterMethod) != null)) {
                str3 = "toplive_icon";
            }
            if (Intrinsics.LJFF(LIZJ, "enter_toplive")) {
                str4 = "";
            } else {
                str4 = "discover";
                if (Intrinsics.LJFF("hangout", "discover")) {
                    str4 = "hangout";
                }
            }
            if (Intrinsics.LJFF("hangout", "hangout")) {
                C478920IqI.LIZ.getClass();
                C478930IqJ c478930IqJLJFF = C478920IqI.LJFF("MultiTopLivePlayTabVM#logTopLiveTopTabPageShow");
                if (c478930IqJLJFF != null) {
                    z2 = true;
                    if (c478930IqJLJFF.LIZJ) {
                        z3 = true;
                    }
                } else {
                    z2 = false;
                }
                String str5 = "1";
                if (z2) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("top_module_use_cache", obj);
                if (!z3) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("top_module_data_expired", str5);
                map.put("is_first_show", CardStruct.IStatusCode.DEFAULT);
            }
            map.put("enter_from_merge", str2);
            map.put("enter_method", str3);
            map.put("_param_live_platform", "live");
            Intrinsics.LJFF("hangout", "hangout");
            map.put("top_tab", "hangout");
            map.put("from_tab", str4);
            map.put("enter_tab_action", LIZJ);
            map.put("enter_toplive_source", LIZLLL);
            map.put("source", str);
            C20684815ws.LJIILLIIL("livesdk_toplive_top_tab_page_show", map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[Catch: all -> 0x011f, PHI: r5
      0x0027: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:11:0x001b, B:16:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056 A[PHI: r0
      0x0056: PHI (r0v43 long) = (r0v42 long), (r0v44 long) binds: [B:32:0x004e, B:34:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6 A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1 A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2 A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4 A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0011, B:8:0x0013, B:10:0x0019, B:12:0x001d, B:17:0x0027, B:19:0x002b, B:22:0x0031, B:24:0x0037, B:26:0x003d, B:31:0x004a, B:33:0x0050, B:40:0x005f, B:41:0x0065, B:44:0x0082, B:47:0x00aa, B:49:0x00ae, B:51:0x00b6, B:53:0x00bc, B:59:0x00c9, B:61:0x00d2, B:62:0x00d7, B:64:0x00dd, B:65:0x00e2, B:68:0x00ee, B:72:0x0103, B:74:0x0109, B:76:0x010f, B:69:0x00f4, B:71:0x00fe, B:56:0x00c1, B:77:0x0116), top: B:82:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479670IrV.LIZ(int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1 A[PHI: r0
      0x00c1: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v31 java.lang.String) binds: [B:31:0x00bd, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.bytedance.android.livesdkapi.session.EnterRoomConfig r5, java.lang.String r6, java.lang.String r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting.isEnable()
            java.lang.String r4 = "homepage_hot"
            if (r0 == 0) goto Lb9
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r5.mLogData
            java.lang.String r0 = r1.topLiveSource
            if (r0 != 0) goto Lb6
            java.lang.String r0 = r1.topliveHomepageType
            if (r0 != 0) goto Lc1
        L1a:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData
            java.lang.String r2 = r0.liveTabSource
            if (r2 != 0) goto L22
            java.lang.String r2 = "toplive_icon"
        L22:
            java.lang.String r1 = X.C479670IrV.LIZJ
            java.lang.String r0 = "enter_toplive"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r7 = ""
        L2e:
            java.lang.String r0 = "enter_from_merge"
            r3.put(r0, r4)
            java.lang.String r0 = "enter_method"
            r3.put(r0, r2)
            java.lang.String r1 = "_param_live_platform"
            java.lang.String r0 = "live"
            r3.put(r1, r0)
            java.lang.String r0 = "top_live_tab"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "is_hangout_new_user_for_metric"
            r1 = 1
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto Lb0
            X.C479670IrV.LJ = r1
            java.lang.String r1 = "1"
        L52:
            java.lang.String r0 = "is_hangout_new"
            r3.put(r0, r1)
            java.lang.String r0 = "top_tab"
            r3.put(r0, r6)
            java.lang.String r0 = "from_tab"
            r3.put(r0, r7)
            java.lang.String r1 = "enter_tab_action"
            java.lang.String r0 = X.C479670IrV.LIZJ
            r3.put(r1, r0)
            java.lang.String r1 = "enter_toplive_source"
            java.lang.String r0 = X.C479670IrV.LIZLLL
            r3.put(r1, r0)
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkRoomFragPerfOptSetting.isEnable()
            if (r0 == 0) goto Laa
            X.0INV r0 = X.C0IL2.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r1 = r0.LIZ()
            if (r1 == 0) goto Laa
            X.0IX5 r0 = X.C0IX5.LIZ
            java.lang.String r1 = r1.LIZLLL()
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0IWy> r0 = X.C0IX5.LIZJ
            java.lang.Object r2 = r0.get(r1)
            X.0IWy r2 = (X.C468020IWy) r2
            if (r2 == 0) goto Laa
            X.0IX6 r0 = r2.LIZJ
            int r0 = r0.LJIJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "stream_status"
            r3.put(r0, r1)
            X.0IX9 r0 = r2.LIZIZ
            int r0 = r0.LIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_room_api_state"
            r3.put(r0, r1)
        Laa:
            java.lang.String r0 = "livesdk_toplive_enter_top_tab"
            X.C20684815ws.LJIILLIIL(r0, r3)
            return
        Lb0:
            r0 = 0
            X.C479670IrV.LJ = r0
            java.lang.String r1 = "0"
            goto L52
        Lb6:
            r4 = r0
            goto L1a
        Lb9:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData
            java.lang.String r0 = r0.topliveHomepageType
            if (r0 != 0) goto Lc1
            goto L1a
        Lc1:
            r4 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479670IrV.LIZLLL(com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.lang.String, java.lang.String):void");
    }

    public static final void LIZIZ(EnterRoomConfig enterRoomConfig, String str, String str2, boolean z, boolean z2, long j, C479720Ira c479720Ira, C479710IrZ c479710IrZ, String str3, String str4, Map<String, String> map) {
        String str5;
        String str6;
        String str7;
        EnterRoomConfig.LogData logData;
        if (enterRoomConfig == null) {
            return;
        }
        HashMap map2 = new HashMap();
        if (!MultiGuestTopLiveIterationPhase1Setting.isEnable() ? (str5 = enterRoomConfig.mLogData.topliveHomepageType) == null : !((str5 = (logData = enterRoomConfig.mLogData).topLiveSource) != null || (str5 = logData.topliveHomepageType) != null)) {
            str5 = "homepage_hot";
        }
        String str8 = enterRoomConfig.mLogData.liveTabSource;
        if (str8 == null) {
            str8 = "toplive_icon";
        }
        if (str4 != null) {
            map2.put("enter_tab_action", str4);
        } else {
            map2.put("enter_tab_action", LIZJ);
        }
        map2.put("enter_toplive_source", LIZLLL);
        if (!z) {
            str6 = "slide";
        } else {
            str6 = "click";
        }
        if (z2) {
            str6 = "leave_toplive";
        }
        if (LJ) {
            LJ = false;
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_hangout_new", str7);
        map2.put("enter_from_merge", str5);
        map2.put("enter_method", str8);
        map2.put("_param_live_platform", "live");
        map2.put("top_tab", str2);
        map2.put("to_tab", str);
        map2.put("leave_tab_action", str6);
        map2.put("duration", String.valueOf(j));
        map2.put("source", str3);
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (Intrinsics.LJFF(str2, "hangout")) {
            if (c479720Ira != null) {
                map2.put("top_module_state", c479720Ira.LIZ);
                map2.put("top_module_total_duration", String.valueOf(c479720Ira.LIZIZ));
                map2.put("top_module_request_duration", String.valueOf(c479720Ira.LIZJ));
                map2.put("top_module_render_duration", String.valueOf(c479720Ira.LIZLLL));
                map2.put("top_module_cache_state", c479720Ira.LJ);
                map2.put("top_module_extra", c479720Ira.LJFF);
            }
            if (c479710IrZ != null) {
                map2.put("live_card_state", c479710IrZ.LIZ);
                map2.put("live_card_total_duration", String.valueOf(c479710IrZ.LIZIZ));
                map2.put("live_card_request_duration", String.valueOf(c479710IrZ.LIZJ));
                map2.put("live_card_render_duration", String.valueOf(c479710IrZ.LIZLLL));
                map2.put("live_card_cache_state", c479710IrZ.LJ);
                map2.put("live_card_extra", c479710IrZ.LJFF);
            }
        }
        C20684815ws.LJIILLIIL("livesdk_toplive_leave_top_tab", map2);
    }
}
