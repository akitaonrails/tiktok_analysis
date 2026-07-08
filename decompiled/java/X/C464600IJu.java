package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464600IJu {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> LIZJ(java.lang.String r11) {
        /*
            r6 = 0
            r10 = 1
            if (r11 == 0) goto Lb
            int r0 = r11.length()     // Catch: org.json.JSONException -> L98
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r5 = "EnterRoomByLandscapeHelp"
            r9 = 0
            if (r0 == 0) goto L19
            java.lang.String r0 = "streamData is null when get video resolution"
            X.C20441214yg.LJ(r5, r0)     // Catch: org.json.JSONException -> L98
            return r9
        L19:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L98
            r1.<init>(r11)     // Catch: org.json.JSONException -> L98
            java.lang.String r0 = "data"
            org.json.JSONObject r7 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L98
            java.lang.String r1 = "origin"
            java.lang.String r0 = "ld"
            java.lang.String[] r8 = new java.lang.String[]{r1, r0}     // Catch: org.json.JSONException -> L98
            r4 = 0
        L2d:
            r1 = r8[r4]     // Catch: org.json.JSONException -> L98
            if (r7 == 0) goto L8c
            org.json.JSONObject r0 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> L98
            if (r0 == 0) goto L8c
            org.json.JSONObject r1 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> L98
            if (r1 == 0) goto L8c
            java.lang.String r0 = "main"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L98
            if (r2 == 0) goto L8c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L98
            java.lang.String r0 = "sdk_params"
            java.lang.String r0 = r2.optString(r0)     // Catch: org.json.JSONException -> L98
            r1.<init>(r0)     // Catch: org.json.JSONException -> L98
            java.lang.String r0 = "resolution"
            java.lang.String r3 = r1.optString(r0)     // Catch: org.json.JSONException -> L98
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L98
            if (r0 != 0) goto L8c
            r1 = 120(0x78, float:1.68E-43)
            r0 = 6
            int r2 = kotlin.text.a0.LJJIZ(r3, r1, r6, r6, r0)     // Catch: org.json.JSONException -> L98
            if (r2 <= 0) goto L8c
            int r0 = r3.length()     // Catch: org.json.JSONException -> L98
            int r0 = r0 - r10
            if (r2 >= r0) goto L8c
            java.lang.String r1 = r3.substring(r6, r2)     // Catch: org.json.JSONException -> L98
            int r0 = r2 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch: org.json.JSONException -> L98
            kotlin.Pair r2 = new kotlin.Pair     // Catch: org.json.JSONException -> L98
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: org.json.JSONException -> L98
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L98
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r3)     // Catch: org.json.JSONException -> L98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L98
            r2.<init>(r1, r0)     // Catch: org.json.JSONException -> L98
            goto L97
        L8c:
            int r4 = r4 + 1
            r0 = 2
            if (r4 < r0) goto L2d
            java.lang.String r0 = "return video resolution is null"
            X.C20441214yg.LJ(r5, r0)
            return r9
        L97:
            return r2
        L98:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464600IJu.LIZJ(java.lang.String):kotlin.Pair");
    }

    public static final boolean LJFF(Room room) {
        String streamData;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        if (room != null && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
            streamData = pullData.getStreamData();
        } else {
            streamData = null;
        }
        if (streamData == null || room.getStreamUrl().liveCoreSDKData.getPullData().getStreamData().length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(C19EG c19eg, EnterRoomConfig enterRoomConfig, Pair pair) {
        if (c19eg != null && pair != null) {
            if (enterRoomConfig == null) {
                C20441214yg.LJ("EnterRoomByLandscapeHelp", "return false, config is null");
                return false;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            boolean zLJJII = C500260Jjc.LJJII(enterRoomConfig.mRoomsData.enterRoomOrientation);
            if (!C500260Jjc.LJJII(C497740JfY.LIZ)) {
                return false;
            }
            if ((!enterRoomConfig.mRoomsData.needLandInteractFragment && !zLJJII) || ((Number) pair.getFirst()).intValue() <= ((Number) pair.getSecond()).intValue()) {
                return false;
            }
            return true;
        }
        C20441214yg.LJ("EnterRoomByLandscapeHelp", "return false, activity or pair is null");
        return false;
    }

    public static final void LIZLLL(C19EG c19eg, EnterRoomConfig enterRoomConfig, Pair pair) {
        String str;
        if (enterRoomConfig != null && LIZ(c19eg, enterRoomConfig, pair)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_keep_landscape_play");
            Map<String, String> map = enterRoomConfig.mRoomsData.gameLiveExtra;
            String str2 = null;
            if (map != null) {
                str = map.get("from_room_id");
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "from_room_id");
            c474500IjALIZ.LJJII(Long.valueOf(enterRoomConfig.mRoomsData.roomId), "to_room_id");
            Map<String, String> map2 = enterRoomConfig.mRoomsData.gameLiveExtra;
            if (map2 != null) {
                str2 = map2.get("landscape_enter_from");
            }
            c474500IjALIZ.LJJII(str2, Scene.SCENE_SERVICE);
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r4, X.C19EG r5, com.bytedance.android.livesdkapi.session.EnterRoomConfig r6, kotlin.Pair r7, boolean r8) {
        /*
            r2 = 0
            if (r4 == 0) goto L9
            X.0IJx r1 = X.C468250IXv.LIZLLL(r4, r2)
            if (r1 != 0) goto Lb
        L9:
            X.0IJx r1 = X.EnumC464630IJx.NORMAL
        Lb:
            X.0IJx r0 = X.EnumC464630IJx.NORMAL
            r3 = 1
            if (r1 == r0) goto L11
            return r3
        L11:
            java.lang.String r1 = "EnterRoomByLandscapeHelp"
            if (r5 == 0) goto L62
            if (r7 == 0) goto L62
            if (r6 != 0) goto L28
            java.lang.String r0 = "return false, config is null"
            X.C20441214yg.LJ(r1, r0)
        L1e:
            r0 = 1
        L1f:
            boolean r0 = X.C500260Jjc.LJJII(r0)
            if (r0 == 0) goto L68
            int r0 = X.C497740JfY.LIZ
            return r0
        L28:
            boolean r0 = X.C464610IJv.LIZ()
            if (r0 == 0) goto L5b
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r6.mRoomsData
            java.lang.String r1 = r0.actionType
            java.lang.String r0 = "draw"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L5b
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJII(r0)
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r7.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r7.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 <= r0) goto L1e
        L58:
            int r0 = X.C497740JfY.LIZ
            goto L1f
        L5b:
            boolean r0 = LIZ(r5, r6, r7)
            if (r0 == 0) goto L1e
            goto L58
        L62:
            java.lang.String r0 = "return false, activity or pair is null"
            X.C20441214yg.LJ(r1, r0)
            goto L1e
        L68:
            if (r4 == 0) goto L78
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r4.getRoomAuthStatus()
            if (r0 == 0) goto L78
            boolean r0 = r0.isEnableLandscape()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L78:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 == 0) goto L89
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJII(r0)
            if (r0 == 0) goto L89
            int r0 = X.C497740JfY.LIZ
            return r0
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464600IJu.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, X.19EG, com.bytedance.android.livesdkapi.session.EnterRoomConfig, kotlin.Pair, boolean):int");
    }

    public static final void LJ(long j, int i, int i2, String str, EnterRoomConfig enterRoomConfig) {
        String str2;
        String str3;
        String str4;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("landscape_slide_configure");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "width");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "height");
        String str5 = null;
        if (enterRoomConfig != null && (roomsData4 = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData4.serverLogId;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "log_id");
        c474500IjALIZ.LJJII(str, "from");
        if (enterRoomConfig != null && (roomsData3 = enterRoomConfig.mRoomsData) != null) {
            str3 = roomsData3.actionType;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "action_type");
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
            str4 = roomsData2.enterFromMerge;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "enter_from_merge");
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str5 = roomsData.enterMethod;
        }
        c474500IjALIZ.LJJII(str5, "enter_method");
        c474500IjALIZ.LIZ();
    }
}
