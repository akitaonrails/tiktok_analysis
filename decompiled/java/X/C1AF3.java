package X;

import Y.ARunnableS132S0100000_32;
import Y.AfS202S0100000_33;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.social.model.AwemeInfoReq;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFYPCardPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedShowUniqueCardParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.UniqueCardParams;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveOptStreamJumpExp;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiInfos;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS84S0210000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.FeedCard;
import webcast.data.LinkedUserInfo;

/* JADX INFO: renamed from: X.1AF3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AF3 implements InterfaceC2175511ACf {
    public final C1AF7 LIZ;
    public Long LIZIZ;
    public Integer LIZJ;
    public long LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;
    public String LJIIIZ;
    public final InterfaceC968960bK2 LJIIJ;
    public final UniqueCardParams LJIIJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIIL;
    public Runnable LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public Rect LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public C945320ahu LJIJJLI;
    public Layout LJIL;
    public final List<LinkedUserInfo> LJJ;
    public final Map<String, Integer> LJJI;
    public final Map<String, Integer> LJJIFFI;
    public final Set<String> LJJII;
    public long LJJIII;
    public final C11NJ LJJIIJ;
    public C11JF LJJIIJZLJL;
    public C19487111Lx LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public ViewGroup LJJIJIL;
    public final C1AF6 LJJIJL;
    public final C01GW LJJIJLIJ;
    public final C01GW LJJIL;
    public C1AF4 LJJIZ;
    public Boolean LJJJ;
    public int LJJJI;

    @Override // X.InterfaceC2175511ACf
    public final int LJ() {
        return (int) this.LJIILJJIL;
    }

    @Override // X.InterfaceC2175511ACf
    public final boolean LJIIL() {
        return LinkMicFYPCardPerformanceOptSetting.INSTANCE.layoutOptEnable();
    }

    public final JSONArray LJIJJLI() throws JSONException {
        int iIntValue;
        FollowInfo followInfo;
        ImageModel avatarLarge;
        List urls;
        Object objLJJJLZIJ;
        ImageModel avatarThumb;
        List urls2;
        Object objLJJJLZIJ2;
        JSONArray jSONArray = new JSONArray();
        List<LinkedUserInfo> list = this.LJJ;
        ArrayList<LinkedUserInfo> arrayList = new ArrayList();
        int i = 0;
        for (LinkedUserInfo linkedUserInfo : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (i < 9) {
                arrayList.add(linkedUserInfo);
            }
            i = i2;
        }
        for (LinkedUserInfo linkedUserInfo2 : arrayList) {
            JSONObject jSONObject = new JSONObject();
            User user = linkedUserInfo2.userInfo;
            jSONObject.put("uid", user != null ? Long.valueOf(user.getId()) : null);
            jSONObject.put("linkmicId", linkedUserInfo2.linkmicId);
            jSONObject.put("nickName", C0KVU.LIZ(linkedUserInfo2.userInfo));
            JSONArray jSONArray2 = new JSONArray();
            User user2 = linkedUserInfo2.userInfo;
            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null && (urls2 = avatarThumb.getUrls()) != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, urls2)) != null) {
                jSONArray2.put(objLJJJLZIJ2);
            }
            User user3 = linkedUserInfo2.userInfo;
            if (user3 != null && (avatarLarge = user3.getAvatarLarge()) != null && (urls = avatarLarge.getUrls()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urls)) != null) {
                jSONArray2.put(objLJJJLZIJ);
            }
            jSONObject.put("avatarUrls", jSONArray2);
            User user4 = linkedUserInfo2.userInfo;
            jSONObject.put("relationship", (user4 == null || (followInfo = user4.getFollowInfo()) == null) ? 0L : followInfo.getFollowStatus());
            Integer num = (Integer) ((LinkedHashMap) this.LJJI).get(linkedUserInfo2.linkmicId);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = this.LJJJI;
                this.LJJJI = iIntValue + 1;
            }
            jSONObject.put("pos", iIntValue);
            jSONObject.put("muteAudio", false);
            jSONObject.put("muteVideo", false);
            jSONArray.put(jSONObject);
        }
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", "getLinkmicInfoArrJson origin size:" + ((ArrayList) this.LJJ).size() + " act size:" + jSONArray.length());
        return jSONArray;
    }

    public final boolean LJJI() {
        Integer num = this.LIZJ;
        return num != null && num.intValue() == 7;
    }

    public final boolean LJJIFFI() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIL;
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getVisibility() == 0;
    }

    public final void LJJII() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_mg_cover_type_show");
        c474500IjALIZ.LJJII(this.LJII, "enter_from_merge");
        c474500IjALIZ.LJJII("live_cell", "enter_method");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(this.LIZIZ, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZLLL), "anchor_id");
        c474500IjALIZ.LJJII(this.LJFF, "request_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJI), "follow_status");
        Integer num = this.LIZJ;
        c474500IjALIZ.LJJII((num == null || num.intValue() != 7) ? "video_live" : "voice_live", "live_type");
        c474500IjALIZ.LJJII("profile_voice", "mg_cover_type");
        c474500IjALIZ.LJJIIZI(this.LJIIIIZZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJJIJ() {
        if (Intrinsics.LJFF(this.LJJJ, Boolean.TRUE)) {
            LJJIII("preview");
            this.LJJJ = Boolean.FALSE;
        }
    }

    @Override // X.InterfaceC2175511ACf
    public final Map<String, String> LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreviewLogParams ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJJIJL);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJJIFFI()) {
            HashMap map = new HashMap();
            map.put("mg_cover_hide_reason", this.LJJIJL.LJFF);
            return map;
        }
        HashMap map2 = new HashMap();
        map2.put("mg_cover_type", "profile_voice");
        map2.put("mg_cover_show_duration", String.valueOf(this.LJJIJL.LIZJ));
        map2.put("mg_cover_load_duration", String.valueOf(this.LJJIJL.LIZIZ));
        map2.put("mg_cover_fetch_resource_duration", String.valueOf(this.LJJIJL.LIZLLL));
        map2.put("mg_cover_state", String.valueOf(this.LJJIJL.LIZ));
        map2.put("mg_cover_load_error_reason", this.LJJIJL.LJ);
        map2.put("mg_cover_style", String.valueOf(this.LJIILJJIL));
        return map2;
    }

    @Override // X.InterfaceC2175511ACf
    public final boolean LJFF() {
        return LJJIFFI();
    }

    public final void LJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideLoadingCoverAndStopCheckIfNeed ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJIILIIL != null);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        Runnable runnable = this.LJIILIIL;
        if (runnable != null) {
            runnable.run();
            this.LJIILIIL = null;
        }
        this.LJIJJLI = null;
        C11JF c11jf = this.LJJIIJZLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJJIIJZLJL = null;
        C19487111Lx c19487111Lx = this.LJJIIZ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJJIIZ = null;
    }

    public final void LJJIIJ() throws JSONException {
        SparkContext sparkContext;
        JSONArray jSONArrayLJIJJLI = LJIJJLI();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkmicInfoArr", jSONArrayLJIJJLI);
        Layout layout = this.LJIL;
        jSONObject.put("maxMicCount", layout != null ? layout.micCount : 9);
        jSONObject.put("roomId", String.valueOf(this.LIZIZ));
        jSONObject.put("isVoiceLive", LJJI());
        String str = this.LJ;
        if (str == null) {
            str = "";
        }
        jSONObject.put("roomTitle", str);
        String str2 = this.LJIIIZ;
        jSONObject.put("summary", str2 != null ? str2 : "");
        sparkContext.LJJIIJZLJL(jSONObject, "MGLinkmicInfoUpdate");
    }

    public final void LJJIIZ() {
        if (LJJIFFI()) {
            C1AF6 c1af6 = this.LJJIJL;
            if (c1af6.LJIIIIZZ) {
                c1af6.LIZ |= 16;
                c1af6.LIZJ = System.currentTimeMillis() - c1af6.LJI;
            }
        }
    }

    @Override // X.InterfaceC2175511ACf
    public final Map<String, String> LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC2175511ACf
    public final Long getRoomId() {
        return this.LIZIZ;
    }

    public C1AF3(C1ACZ c1acz) {
        this.LIZ = c1acz;
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LJJL(0, "1011", new InterfaceC1303160k14() { // from class: X.1AFA
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                }
            }, null);
        } else {
            c1303170k15Y22 = null;
        }
        this.LJIIJ = c1303170k15Y22;
        this.LJIIJJI = LinkMicFeedShowUniqueCardParamsSetting.getParams();
        this.LJJ = new ArrayList();
        this.LJJI = new LinkedHashMap();
        this.LJJIFFI = new LinkedHashMap();
        this.LJJII = new LinkedHashSet();
        this.LJJIIJ = new C11NJ();
        this.LJJIJL = new C1AF6();
        this.LJJIJLIJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3909));
        this.LJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 643));
        this.LJJJI = 10000;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LIZJ(int i) {
        this.LJI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Zub, X.1AF4, java.lang.Object] */
    @Override // X.InterfaceC2175511ACf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(kotlin.Pair<java.lang.Float, java.lang.Float> r21) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJI(kotlin.Pair):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r7.add(r5);
     */
    @Override // X.InterfaceC2175511ACf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJII(boolean):void");
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIIIZ(Integer num) {
        this.LIZJ = num;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIIJ(Long l) {
        this.LIZIZ = l;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIIJJI(long j) {
        this.LIZLLL = j;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIILL(FeedCard feedCard) throws JSONException {
        long j;
        String str;
        long j2 = 0;
        if (feedCard != null) {
            j = feedCard.previewCardStyle;
        } else {
            j = 0;
        }
        this.LJIILJJIL = j;
        if (feedCard != null) {
            j2 = feedCard.currentTime;
        }
        this.LJIILL = j2;
        boolean z = true;
        if (!this.LJJ.isEmpty()) {
            ((ArrayList) this.LJJ).clear();
        } else {
            z = false;
        }
        if (feedCard != null) {
            List<LinkedUserInfo> list = feedCard.linkedUserList;
            if (list != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linkedUserList size ");
                sbLIZ.append(list.size());
                C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
                ((ArrayList) this.LJJ).addAll(C13LP.LJLLLL(new C512401z8(43), list));
            }
            str = feedCard.aiLiveSummary;
        } else {
            str = null;
        }
        this.LJIIIZ = str;
        if (z) {
            this.LIZ.LIZLLL();
            LJJIIJ();
        }
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIILLIIL(Map<String, String> map) {
        this.LJIIIIZZ = map;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIIZILJ(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIJ(FrameLayout frameLayout) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoSizeChanged ");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJJIJIIJI);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveOptStreamJumpExp.INSTANCE.isEnable()) {
            return;
        }
        int i = this.LJJIIZI + 1;
        this.LJJIIZI = i;
        if (!this.LJJIJIIJI && this.LJIIZILJ && i >= 2) {
            LJIJI(frameLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(android.widget.FrameLayout r8) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkHandleView "
            r2.append(r0)
            java.lang.Long r0 = r7.LIZIZ
            r2.append(r0)
            java.lang.String r0 = " cardStyle:"
            r2.append(r0)
            long r0 = r7.LJIILJJIL
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r5 = "LinkMicFeedCoverViewManager"
            X.C20441214yg.LIZIZ(r5, r0)
            r6 = 1
            r7.LJJIJIIJI = r6
            boolean r0 = r7.LJJIFFI()
            if (r0 == 0) goto L2b
            return
        L2b:
            com.bytedance.android.livesdkapi.host.IHostAppContext r0 = X.C915980Zwa.LIZJ()
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L51
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkHandleView stack:"
            r1.append(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
        L51:
            long r1 = r7.LJIILJJIL
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L81
            boolean r0 = r7.LJJI()
            if (r0 != 0) goto Lab
            int r1 = r7.LJJIJ
            if (r1 == r6) goto Lab
            r0 = 2
            if (r1 != r0) goto L7a
            X.1AF6 r1 = r7.LJJIJL
            java.lang.String r0 = "not_area"
            r1.LJFF = r0
        L6c:
            java.lang.String r0 = "onResumeLinkMicLayout"
            X.C20441214yg.LIZIZ(r5, r0)
            r7.LJJ()
            X.1AF7 r0 = r7.LIZ
            r0.LJ()
        L79:
            return
        L7a:
            X.1AF6 r1 = r7.LJJIJL
            java.lang.String r0 = "not_sei"
            r1.LJFF = r0
            goto L6c
        L81:
            r3 = 2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb6
            boolean r0 = r7.LJJI()
            if (r0 != 0) goto Lab
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            long r0 = r7.LJIILL
            long r2 = r2 - r0
            long r3 = java.lang.Math.abs(r2)
            com.bytedance.android.livesdk.livesetting.linkmic.UniqueCardParams r0 = r7.LJIIJJI
            long r1 = r0.checkLinkmicRoomInterval
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lab
            X.1AF6 r1 = r7.LJJIJL
            java.lang.String r0 = "not_valid"
            r1.LJFF = r0
            goto L6c
        Lab:
            java.lang.String r0 = "show cover view"
            X.C20441214yg.LIZIZ(r5, r0)
            if (r8 == 0) goto L79
            r7.LJJIIZI(r8, r6)
            return
        Lb6:
            X.1AF6 r1 = r7.LJJIJL
            java.lang.String r0 = "not_multi"
            r1.LJFF = r0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJIJI(android.widget.FrameLayout):void");
    }

    public final void LJIL(LinkMicSei linkMicSei) throws JSONException {
        SparkContext sparkContext;
        if (LJJIFFI() && linkMicSei != null && linkMicSei.infos != null) {
            for (SeiInfos seiInfos : linkMicSei.infos) {
                Integer num = seiInfos.vol;
                if (num != null) {
                    int iIntValue = num.intValue();
                    String str = "";
                    if (iIntValue > 20) {
                        C19719512Dh.LIZ(this.LJJII).remove(seiInfos.linkMicId);
                        Map<String, Integer> map = this.LJJIFFI;
                        String str2 = seiInfos.linkMicId;
                        if (str2 != null) {
                            str = str2;
                        }
                        map.put(str, Integer.valueOf(iIntValue));
                    } else {
                        Set<String> set = this.LJJII;
                        String str3 = seiInfos.linkMicId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (!set.contains(str3)) {
                            Map<String, Integer> map2 = this.LJJIFFI;
                            String str4 = seiInfos.linkMicId;
                            if (str4 == null) {
                                str4 = "";
                            }
                            map2.put(str4, 0);
                            Set<String> set2 = this.LJJII;
                            String str5 = seiInfos.linkMicId;
                            if (str5 != null) {
                                str = str5;
                            }
                            set2.add(str);
                        }
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LJJIII > this.LJIIJJI.updateVolumeInterval) {
                this.LJJIII = jCurrentTimeMillis;
                if (!this.LJJIFFI.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : ((LinkedHashMap) this.LJJIFFI).entrySet()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("linkmicId", entry.getKey());
                        jSONObject.put("volume", ((Number) entry.getValue()).intValue());
                        jSONArray.put(jSONObject);
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("linkmicUserVolumes", jSONArray);
                        sparkContext.LJJIIJZLJL(jSONObject2, "MGLinkmicUserVolumeUpdate");
                    }
                    ((LinkedHashMap) this.LJJIFFI).clear();
                }
            }
        }
    }

    public final void LJJIII(String str) {
        SparkContext sparkContext;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendCardAppear ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("roomId", String.valueOf(this.LIZIZ));
            jSONObject.put("enterType", str);
            sparkContext.LJJIIJZLJL(jSONObject, "MGCardWillAppear");
        }
    }

    public final void LJJIIJZLJL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCheckSummaryCheck delay:");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJIIJZLJL == null) {
            InterfaceC420801kM interfaceC420801kMLJJLJ = C11NZ.LJJJJJL(j, this.LJIIJJI.checkLinkmicRoomInterval, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJIJIIJIL(new AfS202S0100000_33(this, 17)).LJJLJ();
            this.LJJIIJ.LIZ(interfaceC420801kMLJJLJ);
            this.LJJIIJZLJL = (C11JF) interfaceC420801kMLJJLJ;
        }
    }

    public final void LJJIJIIJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) throws JSONException {
        if (Intrinsics.LJFF(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getTag(), Boolean.TRUE)) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setTag(null);
            LJJIIJ();
        }
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext != null) {
            JSONObject jSONObject = new JSONObject();
            String str = this.LJIIIZ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("aiSummaryText", str);
            sparkContext.LJJIIJZLJL(jSONObject, "MGLiveAiSummaryUpdate");
        }
    }

    @Override // X.InterfaceC2175511ACf
    public final void setEnterFromMerge(String str) {
        this.LJII = str;
    }

    @Override // X.InterfaceC2175511ACf
    public final void setRequestId(String str) {
        this.LJFF = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r13, X.C945320ahu r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, X.0ahu):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    @Override // X.InterfaceC2175511ACf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C945320ahu r18, final android.widget.FrameLayout r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJIIIIZZ(X.0ahu, android.widget.FrameLayout):void");
    }

    @Override // X.InterfaceC2175511ACf
    public final void LJIILIIL(FrameLayout frameLayout, ARunnableS132S0100000_32 aRunnableS132S0100000_32) throws JSONException {
        Integer numValueOf;
        if (this.LJJJ == null) {
            this.LJJJ = Boolean.TRUE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("firstFrameShowCover ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(' ');
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            numValueOf = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJIFFI()) {
            aRunnableS132S0100000_32.run();
            LJJIJ();
            return;
        }
        this.LJIILIIL = aRunnableS132S0100000_32;
        if (!this.LJIIZILJ) {
            return;
        }
        if (this.LJJIJ == 0) {
            InterfaceC420801kM interfaceC420801kMLJIIZILJ = C11QJ.LL.LJ(this.LJIIJJI.firstFrameHideDelay, TimeUnit.MILLISECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJII(new C2189711Amv(this, frameLayout, 1)).LJIIZILJ();
            this.LJJIIJ.LIZ(interfaceC420801kMLJIIZILJ);
            this.LJJIIZ = (C19487111Lx) interfaceC420801kMLJIIZILJ;
            return;
        }
        LJIJI(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    @Override // X.InterfaceC2175511ACf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.widget.FrameLayout r10, boolean r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJIILJJIL(android.widget.FrameLayout, boolean):void");
    }

    public final void LJIJJ(ViewGroup viewGroup, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        View view = this.LJJIJIL;
        if (view != null) {
            view.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LJJIL.getValue());
            view.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LJJIL.getValue());
            Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(view));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                this.LJIIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                viewGroup.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC2189571Amh) this.LJJIJLIJ.getValue());
                viewGroup.addOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC2189571Amh) this.LJJIJLIJ.getValue());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.leftMargin = view.getLeft();
                layoutParams.rightMargin = (viewGroup.getWidth() - view.getWidth()) - view.getLeft();
                viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iIntValue + 1, layoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(android.widget.FrameLayout r20, boolean r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AF3.LJJIIZI(android.widget.FrameLayout, boolean):void");
    }

    public final void LJJIJIIJIL(Function0 function0, boolean z, boolean z2) {
        long jLongValue;
        long j;
        AwS84S0210000_33 awS84S0210000_33 = new AwS84S0210000_33(function0, (Function0<Unit>) z2, (boolean) this, (C1AF3) 1);
        C11NJ c11nj = this.LJJIIJ;
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        AwemeInfoReq awemeInfoReq = new AwemeInfoReq();
        Long l = this.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        awemeInfoReq.roomId = jLongValue;
        if (z) {
            j = 1;
        } else {
            j = 2;
        }
        awemeInfoReq.scene = j;
        awemeInfoReq.feedCardStyle = this.LJIILJJIL;
        c11nj.LIZ(multiLiveApi.getAwemeInfo(awemeInfoReq).LJFF(new C0UO0()).LJJIIZ(new C515801zg(this, awS84S0210000_33, 49), new C516201zk(this, 236)));
    }
}
