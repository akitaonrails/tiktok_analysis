package com.bytedance.android.live.liveinteract.competition.service;

import X.AbstractC962030b8r;
import X.C15438062q;
import X.C20441214yg;
import X.C474500IjA;
import X.C915980Zwa;
import X.C950220apo;
import X.C954460awe;
import X.C955400ayA;
import X.C955690ayd;
import X.C973690bRf;
import X.C974280bSc;
import X.C974430bSr;
import X.C975230bU9;
import X.C981480beE;
import X.C982390bfh;
import X.C982710bgD;
import X.C982790bgL;
import X.C985690bl1;
import X.C986510bmL;
import X.EnumC964170bCJ;
import X.EnumC974260bSa;
import X.EnumC974400bSo;
import X.InterfaceC974370bSl;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS664S0100000_15;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class LiveCompetitionExternalServiceImpl implements ILiveCompetitionExternalService {
    public InterfaceC974370bSl LL = new InterfaceC974370bSl() { // from class: X.0bSp
        public int LIZ = 0;

        @Override // X.InterfaceC974370bSl
        public final boolean LIZJ(EnumC919170a1j enumC919170a1j, EnumC919170a1j enumC919170a1j2, boolean z, int i) {
            return false;
        }

        @Override // X.InterfaceC974370bSl
        public final boolean LIZLLL(CohostContentGuideInfo cohostContentGuideInfo) {
            return false;
        }

        @Override // X.InterfaceC974370bSl
        public final boolean LJ(int i, String str, boolean z, boolean z2, boolean z3) {
            return false;
        }

        @Override // X.InterfaceC974370bSl
        public final int LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC974370bSl
        public final void LIZ(int i) {
            this.LIZ = i;
        }
    };

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final EnumC964170bCJ IJ2() {
        C974280bSc c974280bSc = EnumC974260bSa.Companion;
        EnumC974260bSa enumC974260bSaJV1 = C915980Zwa.LIZIZ().JV1(false);
        c974280bSc.getClass();
        return C974280bSc.LIZIZ(enumC974260bSaJV1);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void Y41() {
        new C982790bgL().LJJJJJ(EnumC974400bSo.FE_GAME_READY);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final boolean Al1() {
        return C915980Zwa.LIZIZ().Dn0().isValid();
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final JSONArray gg() throws JSONException {
        List<C982390bfh> list;
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        JSONArray jSONArray = null;
        jSONArray = null;
        if (c981480beEM91 != null && (list = c981480beEM91.LJIILJJIL) != null) {
            if (list.isEmpty()) {
                return null;
            }
            jSONArray = new JSONArray();
            for (C982390bfh c982390bfh : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("team_id", c982390bfh.LIZ);
                jSONObject.put("score", c982390bfh.LIZIZ);
                jSONArray.put(jSONObject);
                JSONArray jSONArray2 = new JSONArray();
                jSONObject.put("users", jSONArray2);
                List<C982710bgD> list2 = c982390bfh.LJI;
                if (list2 != null) {
                    for (C982710bgD c982710bgD : list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("user_id", String.valueOf(c982710bgD.LIZ));
                        jSONObject2.put("score", c982710bgD.LIZJ);
                        jSONArray2.put(jSONObject2);
                    }
                }
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final boolean kg2() {
        return C915980Zwa.LIZIZ().Dn0().isCatchBean();
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final long lr() {
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null) {
            return c981480beEM91.LJIIIZ;
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final boolean v91() {
        return C915980Zwa.LIZIZ().Dn0().isTakeTheStage();
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final InterfaceC974370bSl o20() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void HG2(C986510bmL c986510bmL) {
        this.LL = c986510bmL;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final Map<String, String> Im1(Map<String, String> map) {
        long j;
        boolean z;
        Object obj;
        Long lValueOf;
        String str;
        C974430bSr c974430bSr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C915980Zwa.LIZ().Al1()) {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            ArrayList<Number> arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
            Iterator<C954460awe> it2 = listLLILZLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            linkedHashMap.put("channel_id", String.valueOf(C915980Zwa.LJII().getChannelId()));
            linkedHashMap.put("current_connection_cnts", String.valueOf(arrayList.size()));
            linkedHashMap.put("connection_type", C915980Zwa.LIZLLL().getConnectionType());
            linkedHashMap.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
            C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM91 != null && (c974430bSr = c981480beEM91.LJJIJIIJIL) != null) {
                j = c974430bSr.LIZJ;
            } else {
                j = 0;
            }
            linkedHashMap.put("performer_id", String.valueOf(j));
            if (map != null && (str = map.get("to_anchor_id")) != null && str.equals(String.valueOf(j))) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_to_current_performer", obj);
            linkedHashMap.put("click_period", C973690bRf.LJIILJJIL());
            C955400ayA.LJJIIJZLJL(linkedHashMap, C950220apo.LIZJ(), "match_common_params");
            if (arrayList.size() <= 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_multi", str2);
            C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM912 != null) {
                lValueOf = Long.valueOf(c981480beEM912.LJIIIZ);
            } else {
                lValueOf = null;
            }
            linkedHashMap.put("pk_id", String.valueOf(lValueOf));
            linkedHashMap.put("sub_match_type", C973690bRf.LJIILL(false));
            if (arrayList.size() == 2) {
                for (Number number : arrayList) {
                    long jLongValue = number.longValue();
                    Room roomLIZJ = C950220apo.LIZJ();
                    if (roomLIZJ == null || jLongValue != roomLIZJ.getOwnerUserId()) {
                        linkedHashMap.put("opposite_anchor_id", String.valueOf(number.longValue()));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            C985690bl1.LIZ.getClass();
            linkedHashMap.put("game_resource_status", String.valueOf(C985690bl1.LJ));
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final String Kq0(long j) {
        String str;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL == null || (str = c954460aweLLILL.LJIIJJI) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void Wz0(C474500IjA c474500IjA) {
        long j;
        String str;
        String str2;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C20441214yg.LIZIZ("CoHostAppLog", "addTakeStageCatchBeansAudienceAppLog");
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null) {
            j = c981480beEM91.LJIIIZ;
        } else {
            j = 0;
        }
        c474500IjA.LJJII(String.valueOf(j), "pk_id");
        if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
            str = "take_stage";
        } else if (C915980Zwa.LIZIZ().Dn0().isCatchBean()) {
            str = "catch_bean";
        } else {
            str = "";
        }
        c474500IjA.LJJII(str, "connection_type");
        c474500IjA.LJJII(C973690bRf.LJIILJJIL(), "click_period");
        c474500IjA.LJJII(String.valueOf(C915980Zwa.LIZLLL().getChannelId()), "channel_id");
        c474500IjA.LJJII(C915980Zwa.LIZLLL().Ti2(), "sub_match_type");
        c474500IjA.LJJII(C915980Zwa.LIZLLL().oE2(), "core_connection_type");
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if (arrayList.size() > 2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str2, "is_multi");
        c474500IjA.LJJII(String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()), "current_connection_cnts");
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void cZ1(n nVar) {
        String string;
        C982790bgL c982790bgL = new C982790bgL();
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        if (setLJJIJIL != null) {
            for (String str : setLJJIJIL) {
                k kVarLJJIIZ = nVar.LJJIIZ(str);
                if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
                    string = "";
                }
                AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, str, string, true);
            }
        }
        c982790bgL.LJIJJLI("beans_game_log");
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void dH(Map<String, String> map) {
        long j;
        String str;
        String str2;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C20441214yg.LIZIZ("CoHostAppLog", "addTakeStageCatchBeansAudienceAppLog");
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null) {
            j = c981480beEM91.LJIIIZ;
        } else {
            j = 0;
        }
        map.put("pk_id", String.valueOf(j));
        String str3 = "";
        if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
            str = "take_stage";
        } else if (!C915980Zwa.LIZIZ().Dn0().isCatchBean()) {
            str = "";
        } else {
            str = "catch_bean";
        }
        map.put("connection_type", str);
        int i = C955690ayd.LIZJ[C915980Zwa.LIZIZ().JV1(false).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str3 = "victory_lap";
                }
            } else {
                str3 = "final_call";
            }
        } else {
            str3 = "performance";
        }
        map.put("click_period", str3);
        map.put("channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId()));
        map.put("sub_match_type", C915980Zwa.LIZLLL().Ti2());
        map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if (arrayList.size() > 2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_multi", str2);
        map.put("current_connection_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void q12(n nVar) {
        String string;
        C982790bgL c982790bgL = new C982790bgL();
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        if (setLJJIJIL != null) {
            for (String str : setLJJIJIL) {
                k kVarLJJIIZ = nVar.LJJIIZ(str);
                if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
                    string = "";
                }
                AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, str, string, true);
            }
        }
        c982790bgL.LJIJJLI("game_interaction");
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void qF0(long j) {
        C982790bgL c982790bgL = new C982790bgL();
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "process_duration", Long.valueOf(j), true);
        c982790bgL.LJIJJLI("game_process_avatar_receive_message");
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void vN2(String str) {
        new C982790bgL().LJJJJJ(EnumC974400bSo.FE_DOWNLOAD_AVATAR);
        C982790bgL c982790bgL = new C982790bgL();
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "avatar_url", str, true);
        c982790bgL.LJIJJLI("game_avatar_download_start");
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void AJ0(LifecycleOwner lifecycleOwner, DataChannel dataChannel, AwS626S0100000_12 awS626S0100000_12) {
        C975230bU9.LJI(dataChannel, lifecycleOwner, new AwS664S0100000_15(awS626S0100000_12, 11));
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService
    public final void Fb1(long j, int i, String str, String str2, boolean z) {
        C982790bgL c982790bgL = new C982790bgL();
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "avatar_url", str, true);
        c982790bgL.LJIIL(Integer.valueOf(i), "error_code", true);
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "error_reason", str2, true);
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "is_use_cache", Integer.valueOf(z ? 1 : 0), true);
        AbstractC962030b8r.LJIIJ(c982790bgL.LIZLLL, "client_process_latency", Long.valueOf(j), true);
        c982790bgL.LJIJJLI("game_avatar_download_status");
    }
}
