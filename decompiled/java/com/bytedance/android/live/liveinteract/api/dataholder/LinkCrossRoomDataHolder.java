package com.bytedance.android.live.liveinteract.api.dataholder;

import X.AbstractC924260a9w;
import X.C098J;
import X.C0K04;
import X.C13BV;
import X.C1CC2;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C354201Zc;
import X.C497700JfU;
import X.C500260Jjc;
import X.C501590Jll;
import X.C930940aKi;
import X.C943870afZ;
import X.C945320ahu;
import X.C951420ark;
import X.C955540ayO;
import X.EnumC470470Icf;
import X.EnumC768840UDy;
import X.EnumC944980ahM;
import X.EnumC955660aya;
import X.InterfaceC500940Jki;
import X.InterfaceC948500an2;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostUserInfo;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "LINK_CROSS_DATA_HOLDER")
public final class LinkCrossRoomDataHolder extends AbstractC924260a9w {
    public static LinkCrossRoomDataHolder LJLLI;
    public static long LJLLILLLL;
    public static Rect LJLLJ;
    public static final Set<Long> LJLLL;
    public static final boolean LJLLLL;
    public static final C098J<Long, CohostABInfo> LJLLLLLL;
    public static Rect LJLZ;
    public final long LIZ;
    public DataChannel LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public C945320ahu LJII;
    public C945320ahu LJIIIIZZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public String LJIJJ;
    public Room LJIJJLI;
    public RivalExtraInfo LJIL;
    public Room LJJ;
    public RivalExtraInfo LJJI;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public C943870afZ LJJIIZI;
    public C951420ark LJJIJ;
    public String LJJIJLIJ;
    public long LJJJ;
    public String LJJJI;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public Map<String, String> LJJJJJ;
    public EnumC955660aya LJJJJJL;
    public EnumC955660aya LJJJJL;
    public EnumC955660aya LJJJJLI;
    public EnumC955660aya LJJJJLL;
    public final List<Object> LJJJJZ;
    public String LJJJJZI;
    public String LJJJLIIL;
    public String LJJJLL;
    public boolean LJJJLZIJ;
    public Integer LJJJZ;
    public String LJJL;
    public int LJJLI;
    public long LJJLIIIIJ;
    public long LJJLIIIJ;
    public GiftGalleryBadgeInfo LJJLIIIJILLIZJL;
    public long LJJLIIIJJI;
    public long LJJLIIIJJIZ;
    public TagV2 LJJLIIIJL;
    public JoinGroupMessageExtra.RivalExtra LJJLIIIJLJLI;
    public long LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public String LJJLIL;
    public boolean LJJLJ;
    public boolean LJJLJLI;
    public boolean LJJLL;
    public int LJJZ;
    public final Map<Long, Long> LJJZZI;
    public List<Long> LJJZZIII;
    public final Map<Long, String> LJL;
    public List<Long> LJLI;
    public Map<C955540ayO, Map<Long, Long>> LJLIIIL;
    public final Map<String, String> LJLIIL;
    public final Map<Long, Map<String, String>> LJLIL;
    public final Map<String, String> LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, String> LJLJL;
    public ActivePlaybook LJLJLJ;
    public Map<String, String> LJLJLLL;
    public boolean LJLL;
    public C955540ayO LJFF = C955540ayO.LIZIZ;
    public String LJI = "";
    public final ConcurrentHashMap<Long, EnumC470470Icf> LJIIIZ = new ConcurrentHashMap<>();
    public Map<Long, ? extends Map<Long, CohostUserInfo>> LJIILIIL = C2097608Jq.LJ();
    public RivalsListsData.TopHostInfo LJJIFFI = RivalsListsData.TopHostInfo.LIZ;
    public final Map<Long, Map<String, String>> LJJII = new LinkedHashMap();
    public String LJJIJIIJI = "";
    public String LJJIJIIJIL = "";
    public String LJJIJIL = "";
    public String LJJIJL = "";
    public final Map<Long, String> LJJIL = new LinkedHashMap();
    public final Map<Long, SurfaceView> LJJIZ = new HashMap();
    public String LJJJIL = "";

    static {
        new ConcurrentHashMap();
        LJLLL = new LinkedHashSet();
        LJLLLL = true;
        LJLLLLLL = new C098J<>(10);
    }

    public final EnumC944980ahM LIZIZ() {
        EnumC944980ahM enumC944980ahM;
        DataChannel dataChannel = this.LIZIZ;
        return (dataChannel == null || (enumC944980ahM = (EnumC944980ahM) dataChannel.gg0(LinkerStateChannel.class)) == null) ? EnumC944980ahM.DISABLED : enumC944980ahM;
    }

    public final void LIZJ(String str) {
        long ownerUserId;
        long currentUserId;
        DataChannel dataChannel;
        String strLIZ;
        int i;
        LiveMode streamType;
        String idStr;
        long currentUserId2;
        String strName;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset source:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LinkCrossRoomDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        String idStr2 = CardStruct.IStatusCode.DEFAULT;
        if (room != null) {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject, "event_id", "data_reset");
            LIZ(jSONObject, "reset_source", str);
            LIZ(jSONObject, "channel_id", Long.valueOf(this.LIZLLL));
            if (Room.isValid(room)) {
                idStr = room.getIdStr();
            } else {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ(jSONObject, "room_id", idStr);
            LIZ(jSONObject, "live_type", C354201Zc.LIZ(room.getStreamType()));
            long ownerUserId2 = room.getOwnerUserId();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId2 = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId2 = 0;
            }
            LIZ(jSONObject, "anchor_id", Long.valueOf(ownerUserId2));
            LIZ(jSONObject, "guest_anchor_id", Long.valueOf(this.LJ));
            String strLIZIZ = C501590Jll.LIZIZ(String.valueOf(currentUserId2));
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            LIZ(jSONObject, "current_user_id", strLIZIZ);
            LIZ(jSONObject, "link_mic_id", "");
            LIZ(jSONObject, "rtc_join_channel_advance", 0L);
            LIZ(jSONObject, "server_auto_joinchannel", Boolean.TRUE);
            EnumC944980ahM enumC944980ahMLIZIZ = LIZIZ();
            if (enumC944980ahMLIZIZ == null || (strName = enumC944980ahMLIZIZ.name()) == null) {
                strName = "";
            }
            LIZ(jSONObject, "link_state", strName);
            LIZ(jSONObject, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            LIZ(jSONObject, "network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()));
            LIZ(jSONObject, "invite_type", this.LJFF);
            LIZ(jSONObject, "need_wait_rtc_joinchannel_succeed", CardStruct.IStatusCode.DEFAULT);
            if (ownerUserId2 == currentUserId2) {
                str2 = "ttlive_client_anchor_link_mic_monitor";
            } else {
                str2 = "ttlive_client_audience_link_mic_monitor";
            }
            C1CC2.LJIIIIZZ(str2, 1, jSONObject);
        }
        this.LJJIJ = null;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null) {
            currentUserId = interfaceC500940JkiUser2.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        if (ownerUserId != currentUserId) {
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_co_host_identify", 0.2d)) {
                JSONObject jSONObject2 = new JSONObject();
                EnumC470470Icf enumC470470Icf = this.LJIIIZ.get(Long.valueOf(this.LIZLLL));
                if (enumC470470Icf != null) {
                    C0K04.LJ("channel_id", this.LIZLLL, jSONObject2);
                    if (Room.isValid(room2)) {
                        idStr2 = room2.getIdStr();
                    }
                    C0K04.LJFF("room_id", idStr2, jSONObject2);
                    if (room2 != null && (streamType = room2.getStreamType()) != null) {
                        strLIZ = C354201Zc.LIZ(streamType);
                    } else {
                        strLIZ = null;
                    }
                    C0K04.LJFF("live_type", strLIZ, jSONObject2);
                    C0K04.LJ("anchor_id", ownerUserId, jSONObject2);
                    C0K04.LJ("current_user_id", currentUserId, jSONObject2);
                    C0K04.LJFF("identify_status", enumC470470Icf.getValue(), jSONObject2);
                    long j = this.LJIIJJI;
                    if (j > 0) {
                        long j2 = this.LJIIL;
                        if (j2 > 0) {
                            C0K04.LJ("enter_room_time", j2 - j, jSONObject2);
                        }
                    }
                    C0K04.LJ("time", System.currentTimeMillis() - this.LJIIJ, jSONObject2);
                    if (enumC470470Icf == EnumC470470Icf.SUCCESS) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C1CC2.LJIIIIZZ("ttlive_client_co_host_identify", i, jSONObject2);
                    this.LJIIIZ.remove(Long.valueOf(this.LIZLLL));
                }
            } else {
                this.LJIIIZ.remove(Long.valueOf(this.LIZLLL));
            }
        }
        this.LJIIIZ.clear();
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LIZJ = false;
        if (C500260Jjc.LJIJI(this.LIZIZ) && (dataChannel = this.LIZIZ) != null) {
            dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
        }
        C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.CO_HOST);
        this.LJI = "";
        if (!TextUtils.isEmpty("")) {
            try {
                JSONObject jSONObject3 = new JSONObject("");
                if (jSONObject3.has("live_rtc_engine_config")) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("live_rtc_engine_config");
                        if (jSONObjectOptJSONObject.has("rtc_vendor")) {
                            jSONObjectOptJSONObject.optInt("rtc_vendor");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this.LJJJ = 0L;
        this.LJJJI = null;
        this.LJJJIL = "";
        this.LJIJJ = null;
        this.LJJIIJZLJL = false;
        this.LJJIII = false;
        this.LJFF = C955540ayO.LIZIZ;
        ((HashMap) this.LJJIZ).clear();
        TextUtils.isEmpty(null);
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = RivalsListsData.TopHostInfo.LIZ;
        ((LinkedHashMap) this.LJJII).clear();
        this.LJII = null;
        this.LJJJJJ = null;
        this.LJJLI = 0;
        this.LJJIJIIJI = "";
        this.LJJIJIIJIL = "";
        LIZIZ();
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(LinkerStateChannel.class, EnumC944980ahM.DISABLED);
        }
        this.LJJJJ = false;
        EnumC955660aya enumC955660aya = this.LJJJJJL;
        EnumC955660aya enumC955660aya2 = EnumC955660aya.IDLE;
        if (enumC955660aya != enumC955660aya2) {
            this.LJJJJLL = enumC955660aya;
        }
        this.LJJJJJL = enumC955660aya2;
        this.LJJJJL = enumC955660aya2;
        this.LJJJJLI = enumC955660aya2;
        this.LJJL = "";
        this.LJJJZ = 0;
        this.LJJLIIIJJI = 0L;
        this.LJJLIIIJJIZ = 0L;
        this.LJJLIIIJLLLLLLLZ = 0L;
        this.LJJLIIJ = 0;
        this.LJJLIL = "";
        this.LJJLJ = false;
        this.LJJLJLI = false;
        this.LJJLL = false;
        this.LJJZ = 0;
        ((LinkedHashMap) this.LJJIL).clear();
        this.LJJIJLIJ = null;
        this.LJLJJL = 0L;
        this.LJLJJI = 0L;
        this.LJLIIIL = new LinkedHashMap();
        this.LJLJJLL = 0L;
        this.LJLL = false;
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public LinkCrossRoomDataHolder(long j, DataChannel dataChannel) {
        this.LIZ = j;
        this.LIZIZ = dataChannel;
        EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
        this.LJJJJJL = enumC955660aya;
        this.LJJJJL = enumC955660aya;
        this.LJJJJLI = enumC955660aya;
        this.LJJJJLL = enumC955660aya;
        this.LJJJJZ = new ArrayList();
        this.LJJJLL = "";
        this.LJJJZ = 0;
        this.LJJLIL = "";
        this.LJJZZI = new HashMap();
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJZZIII = c13bv;
        this.LJL = new LinkedHashMap();
        this.LJLI = c13bv;
        this.LJLIIIL = new LinkedHashMap();
        this.LJLIIL = new LinkedHashMap();
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJL = new LinkedHashMap();
        this.LJLJLLL = new LinkedHashMap();
    }

    public static void LIZ(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
