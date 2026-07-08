package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136140ffg {
    public static final /* synthetic */ int LIZJ = 0;
    public final C20066713fN<C1136860fgq> LIZ;
    public boolean LIZIZ;

    public C1136140ffg() {
        new LinkedList();
        this.LIZ = new C20066713fN<>((Object) null);
    }

    public static int LIZ() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010 A[PHI: r0 r2 r6
      0x0010: PHI (r0v12 long) = (r0v4 long), (r0v13 long) binds: [B:17:0x0064, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]
      0x0010: PHI (r2v9 long) = (r2v4 long), (r2v10 long) binds: [B:17:0x0064, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]
      0x0010: PHI (r6v4 long) = (r6v2 long), (r6v5 long) binds: [B:17:0x0064, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC1136020ffU r8, X.C1135280feI r9, int r10, int r11) throws org.json.JSONException {
        /*
            r6 = 0
            if (r9 == 0) goto L4c
            long r2 = r9.LJIIL
            long r0 = r9.LJFF
            com.bytedance.android.live.base.model.user.User r4 = r9.LJIIJJI
            if (r4 == 0) goto L6f
            long r6 = r4.getId()
        L10:
            long r4 = r9.LIZIZ()
        L14:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "gift_id"
            org.json.JSONObject r3 = r8.put(r9, r2)
            java.lang.String r2 = "asset_id"
            org.json.JSONObject r1 = r3.put(r2, r0)
            java.lang.String r0 = "from_user"
            org.json.JSONObject r1 = r1.put(r0, r6)
            java.lang.String r0 = "to_user"
            org.json.JSONObject r1 = r1.put(r0, r4)
            java.lang.String r0 = "status"
            org.json.JSONObject r1 = r1.put(r0, r10)
            java.lang.String r0 = "can_find_resource"
            r1.put(r0, r11)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "lynx_preload_resource_download_status"
            X.C1CC2.LIZJ(r0, r8, r1, r2)
            return
        L4c:
            if (r8 == 0) goto L6b
            long r2 = r8.getGiftId()
            com.bytedance.android.livesdk.gift.assets.AssetsModel r0 = X.C1135870ffF.LJIILLIIL(r8)
            if (r0 == 0) goto L6d
            long r0 = r0.id
        L5a:
            X.0fgk r4 = r8.LJIILL()
            if (r4 == 0) goto L64
            long r6 = r4.getId()
        L64:
            if (r9 != 0) goto L10
            long r4 = X.C1135870ffF.LJIJI(r8)
            goto L14
        L6b:
            r2 = 0
        L6d:
            r0 = 0
        L6f:
            if (r8 == 0) goto L64
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136140ffg.LIZJ(X.0ffU, X.0feI, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c A[PHI: r0 r2 r4
      0x000c: PHI (r0v10 long) = (r0v3 long), (r0v11 long) binds: [B:19:0x0063, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]
      0x000c: PHI (r2v7 long) = (r2v3 long), (r2v8 long) binds: [B:19:0x0063, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]
      0x000c: PHI (r4v4 com.bytedance.android.live.base.model.user.User) = (r4v0 com.bytedance.android.live.base.model.user.User), (r4v5 com.bytedance.android.live.base.model.user.User) binds: [B:19:0x0063, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.android.livesdk.model.message.GiftMessage r8, X.C1135280feI r9, int r10, int r11) throws org.json.JSONException {
        /*
            r6 = 0
            if (r9 == 0) goto L53
            long r2 = r9.LJIIL
            long r0 = r9.LJFF
            com.bytedance.android.live.base.model.user.User r4 = r9.LJIIJJI
            if (r4 == 0) goto L5f
        Lc:
            long r6 = r4.getId()
        L10:
            if (r9 == 0) goto L4e
            long r4 = r9.LIZIZ()
        L16:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "gift_id"
            org.json.JSONObject r3 = r8.put(r9, r2)
            java.lang.String r2 = "asset_id"
            org.json.JSONObject r1 = r3.put(r2, r0)
            java.lang.String r0 = "from_user"
            org.json.JSONObject r1 = r1.put(r0, r6)
            java.lang.String r0 = "to_user"
            org.json.JSONObject r1 = r1.put(r0, r4)
            java.lang.String r0 = "status"
            org.json.JSONObject r1 = r1.put(r0, r10)
            java.lang.String r0 = "can_find_resource"
            r1.put(r0, r11)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "lynx_preload_resource_download_status"
            X.C1CC2.LIZJ(r0, r8, r1, r2)
            return
        L4e:
            long r4 = X.C1133680fbi.LIZIZ(r8)
            goto L16
        L53:
            if (r8 == 0) goto L69
            long r2 = r8.giftId
        L57:
            com.bytedance.android.livesdk.gift.assets.AssetsModel r0 = X.C1133680fbi.LIZJ(r8)
            if (r0 == 0) goto L66
            long r0 = r0.id
        L5f:
            if (r8 == 0) goto L10
            com.bytedance.android.live.base.model.user.User r4 = r8.fromUser
            if (r4 == 0) goto L10
            goto Lc
        L66:
            r0 = 0
            goto L5f
        L69:
            r2 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136140ffg.LIZLLL(com.bytedance.android.livesdk.model.message.GiftMessage, X.0feI, int, int):void");
    }

    public static void LIZIZ(int i, final int i2, final int i3, String str, final String str2) {
        String str3;
        C1138500fjU c1138500fjU = new C1138500fjU(null, false, true, "", -1L, null);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        final int i4 = 0;
        c1138500fjU.LIZ(false, new C1141050fnb(i, str3, null), false);
        final long j = 0L;
        final long j2 = 0L;
        final Integer numValueOf = Integer.valueOf(i);
        final long j3 = 0L;
        final long j4 = 0L;
        final Float fValueOf = Float.valueOf(0.0f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_effect_play_status");
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" error, errorCode:");
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" errorMsg:");
        sbLIZ2.append(str2);
        C20441214yg.LJ("ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
        C1138350fjF.LIZ(new Runnable() { // from class: X.0fjd
            public final /* synthetic */ C1138600fje LL = null;
            public final /* synthetic */ boolean LLILZ = false;
            public final /* synthetic */ long LLIZ = 0;
            public final /* synthetic */ String LLIZLLLIL = "";
            public final /* synthetic */ long LLJILJILJ = 0;
            public final /* synthetic */ String LLJILLL = "";

            public final void LIZ() throws JSONException {
                String str4;
                ResourceModel resourceModel;
                List<String> list;
                ResourceModel resourceModel2;
                List<String> list2;
                ConcurrentHashMap<String, String> concurrentHashMap;
                ConcurrentHashMap<String, String> concurrentHashMap2;
                JSONObject jSONObject = new JSONObject();
                C1138600fje c1138600fje = this.LL;
                jSONObject.put("effect_load_status", ((c1138600fje == null || !c1138600fje.LJFF) ? 0 : 1) ^ 1);
                C1138600fje c1138600fje2 = this.LL;
                jSONObject.put("tray_position", c1138600fje2 != null ? c1138600fje2.LJ : 0);
                jSONObject.put("error_code", numValueOf);
                String str5 = str2;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("error_msg", str5);
                jSONObject.put("is_from_player", this.LLILZ);
                C1135180fe8.LIZ(jSONObject);
                C1138600fje c1138600fje3 = this.LL;
                if (c1138600fje3 != null && (concurrentHashMap2 = c1138600fje3.LJIIZILJ) != null) {
                    for (Map.Entry<String, String> entry : concurrentHashMap2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                Integer num = numValueOf;
                if (num == null || num.intValue() != 0) {
                    jSONObject2.put("play_fail_toast_show", i2);
                }
                jSONObject2.put("error_code", numValueOf);
                String str6 = str2;
                jSONObject2.put("error_msg", str6 != null ? str6 : "");
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1138600fje c1138600fje4 = this.LL;
                jSONObject2.put("receive_play_end_dur", jCurrentTimeMillis - (c1138600fje4 != null ? c1138600fje4.LJI : 0L));
                C1138600fje c1138600fje5 = this.LL;
                jSONObject2.put("send_receive_im_dur", c1138600fje5 != null ? c1138600fje5.LJIIIIZZ : 0L);
                C1138600fje c1138600fje6 = this.LL;
                jSONObject2.put("before_queue_dur", c1138600fje6 != null ? c1138600fje6.LJIIIZ : 0L);
                C1138600fje c1138600fje7 = this.LL;
                jSONObject2.put("in_queue_dur", c1138600fje7 != null ? c1138600fje7.LJIIJ : 0L);
                Long l = j4;
                long jLongValue = l != null ? l.longValue() : 0L;
                C1138600fje c1138600fje8 = this.LL;
                jSONObject2.put("dequeue_first_frame_dur", (jLongValue - (c1138600fje8 != null ? c1138600fje8.LJIIJJI : 0L)) - C963140bAe.LIZLLL);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Long l2 = j4;
                jSONObject2.put("first_frame_play_end_dur", jCurrentTimeMillis2 - (l2 != null ? l2.longValue() : 0L));
                jSONObject2.put("effect_id", this.LLIZ);
                jSONObject2.put("player_type", this.LLIZLLLIL);
                jSONObject2.put("is_from_player", this.LLILZ);
                C1138600fje c1138600fje9 = this.LL;
                jSONObject2.put("effect_load_status", 1 ^ ((c1138600fje9 == null || !c1138600fje9.LJFF) ? 0 : 1));
                C1138600fje c1138600fje10 = this.LL;
                jSONObject2.put("tray_position", c1138600fje10 != null ? c1138600fje10.LJ : 0);
                jSONObject2.put("error_code", numValueOf);
                jSONObject2.put("first_frame_duration", j);
                Float f = fValueOf;
                jSONObject2.put("fps", (f == null || f.floatValue() <= 0.0f) ? null : Integer.valueOf((int) (fValueOf.floatValue() * 100)));
                jSONObject2.put("sourceFps", i4);
                jSONObject2.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                C1138600fje c1138600fje11 = this.LL;
                jSONObject2.put("downgrade_code", c1138600fje11 != null ? c1138600fje11.LJIILLIIL : 0);
                C1135180fe8.LIZ(jSONObject2);
                C1138600fje c1138600fje12 = this.LL;
                if (c1138600fje12 != null && (concurrentHashMap = c1138600fje12.LJIIZILJ) != null) {
                    for (Map.Entry<String, String> entry2 : concurrentHashMap.entrySet()) {
                        jSONObject2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("first_frame_duration", j);
                Float f2 = fValueOf;
                jSONObject3.put("fps", (f2 == null || f2.floatValue() <= 0.0f) ? null : Integer.valueOf((int) (fValueOf.floatValue() * 100)));
                C474500IjA c474500IjALIZ = C0IJT.LIZ(strLIZIZ);
                c474500IjALIZ.LJJIIJZLJL(jSONObject);
                c474500IjALIZ.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ.LJJIIJZLJL(jSONObject3);
                c474500IjALIZ.LJJII(Long.valueOf(this.LLIZ), "effect_id");
                c474500IjALIZ.LJJII(Long.valueOf(this.LLIZ), "asset_id");
                c474500IjALIZ.LJJII(Long.valueOf(this.LLJILJILJ), "gift_id");
                C1138600fje c1138600fje13 = this.LL;
                if (c1138600fje13 == null || (str4 = c1138600fje13.LJIIL) == null) {
                    str4 = "unknown";
                }
                c474500IjALIZ.LJJII(str4, "resources_format");
                c474500IjALIZ.LJJII(j, "first_frame_duration");
                c474500IjALIZ.LJJII(this.LLJILLL, "log_id");
                c474500IjALIZ.LJJII(j2, "msg_id");
                c474500IjALIZ.LJJII(numValueOf, "error_code");
                c474500IjALIZ.LJJII(str2, "error_msg");
                c474500IjALIZ.LJJII(str2, "error_domain");
                c474500IjALIZ.LJJII(this.LLIZLLLIL, "player_type");
                AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(this.LLIZ);
                c474500IjALIZ.LJJII((assetsModelLIZLLL == null || (resourceModel2 = assetsModelLIZLLL.resourceModel) == null || (list2 = resourceModel2.urlList) == null) ? null : C13LP.LJJJLL(list2), "resource_url");
                AssetsModel assetsModelLIZLLL2 = C1138640fji.LIZLLL(this.LLIZ);
                c474500IjALIZ.LJJII((assetsModelLIZLLL2 == null || (resourceModel = assetsModelLIZLLL2.resourceByteVC1Model) == null || (list = resourceModel.urlList) == null) ? null : C13LP.LJJJLL(list), "resource_bytevc1_url");
                c474500IjALIZ.LJJII(j3, "play_dur");
                c474500IjALIZ.LJJII(j4, "play_ms");
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "gift_type");
                Float f3 = fValueOf;
                c474500IjALIZ.LJJII((f3 == null || f3.floatValue() <= 0.0f) ? null : Integer.valueOf((int) (fValueOf.floatValue() * 100)), "fps");
                c474500IjALIZ.LJJII(Integer.valueOf(i4), "sourceFps");
                C1135180fe8.LIZIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL(), "overload_score");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                C1CC2.LJ(strLIZIZ, jSONObject, jSONObject3, jSONObject2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGiftVideoPlayerMonitor@155d.onVideoPlayEnd$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGiftVideoPlayerMonitor@155d.onVideoPlayEnd$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r13, X.C1135810ff9 r14, java.lang.Long r15, boolean r16, boolean r17) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136140ffg.LJ(int, X.0ff9, java.lang.Long, boolean, boolean):void");
    }
}
