package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import lnn.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0noa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449180noa implements InterfaceC1625220sOW {
    public static final C01GW<Boolean> LJIIJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4193));
    public final ShortVideoContext LIZ;
    public final InterfaceC1449160noY LIZIZ;
    public final Function0<q> LIZJ;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(431));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 992));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(433));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 991));
    public String LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 990));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(432));

    @Override // X.InterfaceC1625220sOW
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZJ() {
        C201955140j.LIZLLL(C20012313Rx.LIZIZ, "AVStickerMobHelper", "onDiscoverShow");
    }

    @Override // X.InterfaceC1625220sOW
    public final InterfaceC1623120sL8 LJIIIZ() {
        return (C1449330nop) this.LJI.getValue();
    }

    public final q LJIJI() {
        return (q) this.LJFF.getValue();
    }

    public final boolean LJIL() {
        MutableLiveData mutableLiveDataNu;
        InterfaceC1623190sLF interfaceC1623190sLFU = LJIJI().U();
        if (interfaceC1623190sLFU == null || (mutableLiveDataNu = interfaceC1623190sLFU.nu()) == null) {
            return false;
        }
        return Intrinsics.LJFF(mutableLiveDataNu.getValue(), Boolean.TRUE);
    }

    public static void LJIILLIIL(HashMap map, Effect effect) {
        DraftEffect draftEffect;
        String propStatus;
        if ((effect instanceof DraftEffect) && (draftEffect = (DraftEffect) effect) != null && (propStatus = draftEffect.getPropStatus()) != null && propStatus.length() > 0) {
            map.put("prop_status", propStatus);
        }
    }

    public static void LJIIZILJ(HashMap map, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music == null || (str = (String) C13LP.LJJJLL(music)) == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (C1624200sMs.LJIILL(effect)) {
            map.put("music_selected_from", "prop_music_bind");
        } else {
            map.put("music_selected_from", "prop_music_soft_bind");
        }
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZIZ(String str, boolean z) {
        String str2;
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(this.LIZ, new Pair("enter_method", str));
        ShortVideoContext shortVideoContext = this.LIZ;
        if (!shortVideoContext.cameraComponentModel.isEditorProRecordMode && !shortVideoContext.LJJJJIZL() && !this.LIZ.LJJJIL() && !this.LIZ.cameraComponentModel.editorProRecordUsedForPip) {
            if (z) {
                str2 = "middle_page";
            } else {
                str2 = "start_page";
            }
            mapLIZ.put("shoot_page_type", str2);
        }
        C1449260noi.LJ("prop_panel_open", mapLIZ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJ(int i, long j) {
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(this.LIZ, new Pair("duration", String.valueOf(j)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i)));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enter_prop_tab_add_attrs", true, false)) {
            mapLIZ.put("entry_point", LJIJI().C0().LJJJJZ());
            mapLIZ.put("cold_at_user_action", LJIJI().C0().LJIILIIL());
        }
        C1449260noi.LJ("tool_performance_enter_prop_tab", mapLIZ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJJI(final String str, final String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobTabClick, categoryKey = ");
        sbLIZ.append(str);
        sbLIZ.append(", tabName = ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        C201955140j.LIZLLL(C20012313Rx.LIZIZ, "AVStickerMobHelper", C2188811AlT.LIZIZ(sbLIZ));
        final String strLIZJ = C1449370not.LIZJ(LJIJI().C0());
        C15O7.LIZJ(new Callable() { // from class: X.0noc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("AVStickerMobHelper@8dc2.mobTabClick$1");
                if (Intrinsics.LJFF(str2, "none") && C0CHQ.LIZ().getAccountService().LIZ()) {
                    Effect effectLIZIZ = C1624010sMZ.LIZIZ(this.LJIJI());
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("shoot_way", this.LIZ.shootWay);
                    c0lab.LJ("enter_from", "video_shoot_page");
                    c0lab.LJ("creation_id", this.LIZ.getCreationId());
                    c0lab.LJ("effect_id", effectLIZIZ != null ? effectLIZIZ.getEffectId() : null);
                    c0lab.LJ("effect_name", effectLIZIZ != null ? effectLIZIZ.getName() : null);
                    int i = this.LIZ.draftId;
                    if (i != 0) {
                        c0lab.LIZ(i, "draft_id");
                    }
                    C1449260noi.LJ("remove_effect", c0lab.LIZ);
                } else {
                    Pair<String, String> pairLIZLLL = C1449370not.LIZLLL(this.LJIJI().C0(), strLIZJ);
                    ShortVideoContext shortVideoContext = this.LIZ;
                    Pair[] pairArr = new Pair[1];
                    String str3 = str2;
                    if (str3 == null) {
                        str3 = "";
                    }
                    pairArr[0] = new Pair("tab_name", str3);
                    HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, pairArr);
                    mapLIZ.put("shoot_page", this.LIZ.isStory ? "story_shoot_page" : "video_shoot_page");
                    ShortVideoContext shortVideoContext2 = this.LIZ;
                    mapLIZ.put("shoot_tab_name", shortVideoContext2.isStory ? "story" : shortVideoContext2.LJIJJLI());
                    mapLIZ.put("prop_cnt", String.valueOf(C1449370not.LIZIZ(this.LJIJI().C0(), strLIZJ)));
                    mapLIZ.put("filter_prop_cnt", pairLIZLLL.getFirst());
                    mapLIZ.put("filter_prop_list", pairLIZLLL.getSecond());
                    String str4 = this.LIZ.creativeModel.initialModel.dmCameraModel.enterDM;
                    if (str4 != null && str4.length() > 0) {
                        mapLIZ.put("enter_dm", str4);
                    }
                    String str5 = this.LIZ.creativeModel.initialModel.dmCameraModel.searchSessionId;
                    if (str5 != null) {
                        mapLIZ.put("search_session_id", str5);
                    }
                    if (this.LIZ.creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
                        mapLIZ.put("is_chat_page_icon_effect", "1");
                    }
                    String str6 = str;
                    if (C13LP.LJJJJ(str6, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
                        str6 = "trending";
                    }
                    mapLIZ.put("tab_key", str6);
                    C1449260noi.LJ("click_prop_tab", mapLIZ);
                    if (C2176908fv.LIZ().contains(str)) {
                        mapLIZ.put("creation_id", this.LIZ.getCreationId());
                        String str7 = this.LIZ.enterFrom;
                        if (str7 == null) {
                            str7 = "";
                        }
                        mapLIZ.put("enter_from", str7);
                        String str8 = this.LIZ.shootWay;
                        mapLIZ.put("shoot_way", str8 != null ? str8 : "");
                        mapLIZ.put("is_photo_mode", this.LIZ.LJJIJIL());
                        C1449260noi.LJ("mobile_effect_create_tab_entry", mapLIZ);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AVStickerMobHelper@8dc2.mobTabClick$1");
                return unit;
            }
        });
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIL(long j, String str) {
        C1449260noi.LJ("tool_performance_effect_use_info", C1449260noi.LIZ(this.LIZ, new Pair("duration", String.valueOf(j)), new Pair("effect_id", str)));
    }

    public final HashMap<String, String> LJIJ(Effect effect, String str) {
        String strLJJLIIIJ;
        List<String> v2Tags;
        ShortVideoContext shortVideoContext = this.LIZ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_method", str);
        pairArr[1] = new Pair("prop_id", effect.getEffectId());
        pairArr[2] = new Pair("effect_name", effect.getName());
        String parentId = effect.getParentId();
        String str2 = "";
        if (parentId == null) {
            parentId = "";
        }
        pairArr[3] = new Pair("parent_pop_id", parentId);
        pairArr[4] = new Pair("prop_index", effect.getGradeKey());
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, pairArr);
        EffectLabel effectLabel = effect.getEffectLabel();
        if (effectLabel == null || (v2Tags = effectLabel.getV2Tags()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        mapLIZ.put("prop_category", strLJJLIIIJ);
        String recommend_reason = effect.getRecommend_reason();
        if (recommend_reason == null) {
            recommend_reason = "";
        }
        mapLIZ.put("prop_panel_model_recall_type", recommend_reason);
        String recommendRuleTags = effect.getRecommendRuleTags();
        if (recommendRuleTags == null) {
            recommendRuleTags = "";
        }
        mapLIZ.put("prop_panel_model_recommend_tags", recommendRuleTags);
        String strLJFF = DiyPropParser.LJFF(effect);
        if (C123100dR.LIZ(strLJFF)) {
            mapLIZ.put("met_parent_template_resource_id", strLJFF);
        }
        String str3 = this.LIZ.enterFrom;
        if (str3 != null) {
            str2 = str3;
        }
        if (str2.length() > 0) {
            mapLIZ.put("shoot_enter_from", str2);
        }
        mapLIZ.putAll(C1905107dB.LIZ(effect));
        if (C212600rs.LIZ()) {
            mapLIZ.put("prop_panel_delivery_source", String.valueOf(effect.getFrom_source()));
        }
        return mapLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1449180noa(ShortVideoContext shortVideoContext, InterfaceC1449160noY interfaceC1449160noY, Function0<? extends q> function0) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = interfaceC1449160noY;
        this.LIZJ = function0;
    }

    public final String LJIJJ(Bundle bundle, String str, boolean z) {
        String str2 = (String) new AwS601S0100000_22(bundle, 751).invoke("tab_key");
        if (str2 != null && ((Boolean) this.LJ.getValue()).booleanValue()) {
            return str2;
        }
        if (z) {
            return "carousel";
        }
        if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
            return "trending";
        }
        return str;
    }

    public final String LJIJJLI(Bundle bundle, String str, boolean z) {
        String str2 = (String) new AwS601S0100000_22(bundle, 752).invoke("tab_name");
        if (str2 != null && ((Boolean) this.LJ.getValue()).booleanValue()) {
            return str2;
        }
        if (z) {
            return "carousel";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    @Override // X.InterfaceC1625220sOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.effectmanager.effect.model.Effect r14, boolean r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449180noa.LJI(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean, java.lang.String, java.util.Map):void");
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJFF(Effect effect, int i, String str, String str2, Bundle bundle) {
        String string;
        String strLJIJJLI;
        String strLJIIIZ;
        if (C1449290nol.LIZ(effect)) {
            return;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (bundle == null || (string = bundle.getString("carousel_open", CardStruct.IStatusCode.DEFAULT)) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJIIIIZZ = string;
        boolean zLJFF = Intrinsics.LJFF(string, "1");
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(this.LIZ, new Pair[0]);
        Pair[] pairArr = new Pair[10];
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            strLJIJJLI = "story";
        } else {
            strLJIJJLI = shortVideoContext.LJIJJLI();
        }
        pairArr[0] = new Pair("shoot_tab_name", strLJIJJLI);
        pairArr[1] = new Pair("resource_id", effect.getResourceId());
        pairArr[2] = new Pair("tab_key", LJIJJ(bundle, str2, zLJFF));
        if (Intrinsics.LJFF(this.LIZ.LJIIIZ(), effect.getEffectId())) {
            str3 = "1";
        }
        pairArr[3] = new Pair("is_default_prop", str3);
        if (this.LIZ.LJIIIZ() == null) {
            strLJIIIZ = "";
        } else {
            strLJIIIZ = this.LIZ.LJIIIZ();
        }
        pairArr[4] = new Pair("from_prop_id", strLJIIIZ);
        pairArr[5] = new Pair("from_prop_resource_id", this.LIZ.creativeModel.propFromGroupModel.fromPropResourceId);
        pairArr[6] = new Pair("prop_id", effect.getEffectId());
        pairArr[7] = new Pair("tab_name", LJIJJLI(bundle, str, zLJFF));
        pairArr[8] = new Pair("impr_position", String.valueOf(i));
        pairArr[9] = new Pair("carousel_open", string);
        mapLIZ.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        C1449260noi.LJ("prop_apply", mapLIZ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZLLL(Effect effect, String str, Bundle bundle, String str2, String str3, String str4) {
        String string;
        String string2;
        if (C1449290nol.LIZ(effect)) {
            return;
        }
        effect.getResourceId();
        AVETParameter aVETParameterLJ = this.LIZ.LJ();
        String contentSource = aVETParameterLJ.getContentSource();
        String contentType = aVETParameterLJ.getContentType();
        String strLJIJJLI = this.LIZ.LJIJJLI();
        HashMap<String, String> mapLJIJ = LJIJ(effect, str);
        mapLJIJ.put("shoot_tab_name", strLJIJJLI);
        if (contentSource != null) {
            mapLJIJ.put("content_source", contentSource);
        }
        if (contentType != null) {
            mapLJIJ.put("content_type", contentType);
        }
        if (bundle == null || (string = bundle.getString("action_type")) == null || string.length() <= 0) {
            string = "panel_empty_prop";
        }
        mapLJIJ.put("action_type", string);
        if (bundle == null || (string2 = bundle.getString("carousel_open")) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("carousel_open", string2);
        if (C1449600npG.LJFF(effect) || C1624200sMs.LIZLLL(effect)) {
            C0LXN.LIZ.getClass();
            C0LXN.LIZ(effect, mapLJIJ);
        }
        String str5 = "trending";
        if (!C13LP.LJJJJ(str4, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
            str5 = str4;
        }
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(315);
        if (!((Boolean) this.LJIIJ.getValue()).booleanValue()) {
            LJIILL(mapLJIJ, str5, str3, str2, effect, null);
        } else {
            C1449230nof c1449230nof = new C1449230nof(this.LIZ.creativeModel, "prop_remove", new C1281704zv(mapLJIJ));
            aFwS261S0000000_22.invoke(c1449230nof);
            c1449230nof.LIZ();
        }
        String strLIZJ = C1629100sUm.LIZJ(effect);
        if (strLIZJ != null) {
            mapLJIJ.put("fav_source", strLIZJ);
        }
        C1449260noi.LJ("prop_remove", mapLJIJ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILIIL(Effect effect, int i, String str, String str2, long j, Bundle bundle) {
        String string;
        String strLJIJJLI;
        if (C1449290nol.LIZ(effect)) {
            return;
        }
        String str3 = "";
        if (bundle == null || (string = bundle.getString("enter_method")) == null) {
            string = "";
        }
        HashMap<String, String> mapLJIJ = LJIJ(effect, string);
        mapLJIJ.put("impr_position", String.valueOf(i));
        mapLJIJ.put("carousel_open", this.LJIIIIZZ);
        String str4 = "1";
        String str5 = "carousel";
        if (Intrinsics.LJFF(mapLJIJ.get("carousel_open"), "1")) {
            str = "carousel";
        }
        mapLJIJ.put("tab_name", str);
        mapLJIJ.put("duration", String.valueOf(j));
        if (!Intrinsics.LJFF(mapLJIJ.get("carousel_open"), "1")) {
            if (str2 == null) {
                str2 = "";
            }
            str5 = "trending";
            if (!C13LP.LJJJJ(str2, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
                str5 = str2;
            }
        }
        mapLJIJ.put("tab_key", str5);
        mapLJIJ.put("resource_id", effect.getResourceId());
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            strLJIJJLI = "story";
        } else {
            strLJIJJLI = shortVideoContext.LJIJJLI();
        }
        mapLJIJ.put("shoot_tab_name", strLJIJJLI);
        if (!Intrinsics.LJFF(this.LIZ.LJIIIZ(), effect.getEffectId())) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_default_prop", str4);
        String strLJIIIZ = this.LIZ.LJIIIZ();
        if (strLJIIIZ != null) {
            str3 = strLJIIIZ;
        }
        mapLJIJ.put("from_prop_id", str3);
        mapLJIJ.put("from_prop_resource_id", this.LIZ.creativeModel.propFromGroupModel.fromPropResourceId);
        C1449260noi.LJ("prop_apply_time", mapLJIJ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, LinearLayoutManager linearLayoutManager) throws JSONException {
        long jLJIJJLI;
        String str4;
        if (!u.LJIJI(LJIJI().C0().LJIIJ(), str2, false)) {
            return;
        }
        if (this.LIZ.isCarouselOpen && (LJIJI().C0().LJJLIIIJL() > 0 || LJIJI().C0().LJJLIIIJLLLLLLLZ() > 0)) {
            str4 = "tool_performance_record_effect_carousel";
            if (LJIJI().C0().LJJLIIIJL() > 0) {
                jLJIJJLI = LJIJI().C0().LJJLIIIJL();
            } else {
                jLJIJJLI = LJIJI().C0().LJJLIIIJLLLLLLLZ();
            }
        } else if (LJIJI().C0().LJJLIIIJLLLLLLLZ() > 0) {
            jLJIJJLI = LJIJI().C0().LJJLIIIJLLLLLLLZ();
            str4 = "tool_performance_record_effect_first_tab";
        } else {
            if (LJIJI().C0().LJIJJLI() <= 0) {
                return;
            }
            jLJIJJLI = LJIJI().C0().LJIJJLI();
            str4 = "tool_performance_record_effect_switch_tab";
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tab_id", str);
        jSONObject.put("tab_name", str3);
        jSONObject.put("average_duration", i);
        jSONObject.put("first_screen_effect_count", iFindLastVisibleItemPosition);
        jSONObject.put("icon_load_fail_count", i2);
        jSONObject.put("duration", System.currentTimeMillis() - jLJIJJLI);
        C2341909Fp.LIZIZ(str4, jSONObject);
        LJIJI().C0().LJJLI(0L);
        LJIJI().C0().LJJIIZ(0L);
        LJIJI().C0().LJJJLZIJ();
    }

    public final void LJIILL(HashMap<String, String> map, String str, String str2, String str3, Effect effect, PropFromGroupModel propFromGroupModel) {
        String strLIZJ;
        String strLIZJ2;
        map.put("resource_id", effect.getResourceId());
        map.put("tab_name", str2);
        map.put("tab_key", str);
        map.put("impr_position", str3);
        String recId = effect.getRecId();
        if (recId == null) {
            recId = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("prop_rec_id", recId);
        map.put("is_prop_panel_cache", String.valueOf(effect.is_cached_data() ? 1 : 0));
        if (propFromGroupModel == null) {
            propFromGroupModel = this.LIZ.creativeModel.propFromGroupModel;
        }
        C1934507hv.LIZ(new C1449040noM(map), propFromGroupModel, effect.getEffectId());
        if (((Boolean) this.LJIIIZ.getValue()).booleanValue() && str != null && (Intrinsics.LJFF(str, "sticker_category:favorite") || a0.LJJIIZI(str, "carousel_fav", false))) {
            String str4 = "";
            if (C1448960noE.LIZ()) {
                boolean zLJFF = C1629100sUm.LJFF(effect);
                boolean zLIZLLL = C1629100sUm.LIZLLL(effect);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add favorite source recentSticker = ");
                sbLIZ.append(zLJFF);
                sbLIZ.append(", favoriteSticker = ");
                sbLIZ.append(zLIZLLL);
                C201955140j.LIZLLL(C20012313Rx.LIZIZ, "AVStickerMobHelper", C2188811AlT.LIZIZ(sbLIZ));
                if ((zLJFF || zLIZLLL) && (strLIZJ2 = C1629100sUm.LIZJ(effect)) != null) {
                    str4 = strLIZJ2;
                }
                map.put("fav_source", str4);
            } else {
                if ((C1629100sUm.LJFF(effect) || C1629100sUm.LJFF(effect)) && (strLIZJ = C1629100sUm.LIZJ(effect)) != null) {
                    str4 = strLIZJ;
                }
                map.put("fav_source", str4);
            }
        }
        C1448620nng.LIZIZ(new C1449270noj(map), effect.getEffectId(), this.LIZ.creativeModel.feedPropPinModel);
        map.put("effect_source", C1449140noW.LIZ(effect));
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZ(Effect effect, boolean z, String str, String str2, int i, Bundle bundle, PropFromGroupModel propFromGroupModel) {
        LJJ(effect, z, str, str2, "click_main_panel", i, false, bundle, "prop_auto_click", propFromGroupModel);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJII(int i, Bundle bundle, PropFromGroupModel propFromGroupModel, Effect effect, String str, String str2, String str3, String str4) {
        Object obj;
        String str5;
        String string;
        if (!C1449290nol.LIZ(effect)) {
            boolean zLJFF = Intrinsics.LJFF(str4, "slide_bar");
            String str6 = CardStruct.IStatusCode.DEFAULT;
            if (zLJFF) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            boolean zLJFF2 = Intrinsics.LJFF(obj, "1");
            String effectId = effect.getEffectId();
            if (str2 == null) {
                str5 = "";
            } else {
                str5 = str2;
            }
            String strLJIJJ = LJIJJ(bundle, str5, zLJFF2);
            if (bundle != null && (string = bundle.getString("is_default_on_shoot_page")) != null) {
                str6 = string;
            }
            if (this.LIZIZ.LIZ(effectId, strLJIJJ, str6, C1629100sUm.LIZJ(effect), effect.getLogId())) {
                C23250099c.LIZLLL(this.LIZLLL, null, null, new C1449190nob(this, effect, str2, bundle, str4, str, i, str3, propFromGroupModel, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJ(Effect effect, boolean z, String str, String str2, String str3, int i, boolean z2, Bundle bundle, PropFromGroupModel propFromGroupModel) {
        LJJ(effect, z, str, str2, str3, i, z2, bundle, "prop_click", propFromGroupModel);
    }

    public final void LJJ(Effect effect, boolean z, String str, String str2, String str3, int i, boolean z2, Bundle bundle, String str4, PropFromGroupModel propFromGroupModel) {
        String string;
        String str5;
        String str6;
        String str7;
        String str8;
        String strLJIJJLI;
        String string2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String string3;
        String string4;
        String string5;
        String string6;
        String str16 = str2;
        String str17 = str;
        if (C1449290nol.LIZ(effect)) {
            return;
        }
        if (bundle != null) {
            string = bundle.getString("carousel_open");
        } else {
            string = null;
        }
        String str18 = "1";
        boolean zLJFF = Intrinsics.LJFF(string, "1");
        if (str17 == null) {
            str17 = "";
        }
        String strLJIJJLI2 = LJIJJLI(bundle, str17, zLJFF);
        if (str16 == null) {
            str16 = "";
        }
        String strLJIJJ = LJIJJ(bundle, str16, zLJFF);
        HashMap<String, String> mapLJIJ = LJIJ(effect, str3);
        if (!z) {
            mapLJIJ.remove("parent_pop_id");
        }
        if (LJIL()) {
            mapLJIJ.put("after_search", "1");
        }
        if (C1624200sMs.LJIIIIZZ(effect)) {
            mapLJIJ.put("order", String.valueOf(i - 1));
        }
        if (z2) {
            mapLJIJ.put("prop_selected_from", "outer_rec");
        } else {
            mapLJIJ.put("prop_selected_from", "other");
        }
        if (LJIJI().RB1()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_vc_voice_on", str5);
        C1449220noe.LIZIZ((C1449240nog) this.LJII.getValue(), this.LIZ.creativeModel, effect, strLJIJJLI2, strLJIJJ, i);
        String strValueOf = String.valueOf(i);
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(316);
        if (!((Boolean) this.LJIIJ.getValue()).booleanValue()) {
            LJIILL(mapLJIJ, strLJIJJ, strLJIJJLI2, strValueOf, effect, propFromGroupModel);
        } else {
            C1449230nof c1449230nof = new C1449230nof(this.LIZ.creativeModel, str4, new C1281704zv(mapLJIJ));
            aFwS261S0000000_22.invoke(c1449230nof);
            c1449230nof.LIZ();
        }
        if (C1624550sNR.LIZLLL(effect) || C1624550sNR.LJ(effect)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_lalaland_effect", str6);
        String effectId = effect.getEffectId();
        if (effect.isBusiness()) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_commercial_prop", str7);
        if (this.LIZ.isStory) {
            str8 = "story_shoot_page";
        } else {
            str8 = "video_shoot_page";
        }
        mapLJIJ.put("shoot_page", str8);
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            strLJIJJLI = "story";
        } else {
            strLJIJJLI = shortVideoContext.LJIJJLI();
        }
        mapLJIJ.put("shoot_tab_name", strLJIJJLI);
        if (C1624570sNT.LJIILJJIL(effect)) {
            mapLJIJ.put("is_original_prop", "1");
            mapLJIJ.put("prop_author_id", effect.getDesignerId());
        } else {
            mapLJIJ.put("is_original_prop", CardStruct.IStatusCode.DEFAULT);
        }
        if (bundle != null) {
            String string7 = bundle.getString("prop_tab_name");
            if (string7 != null && string7.length() != 0) {
                if (!Intrinsics.LJFF(string7, "prop_search") && !Intrinsics.LJFF(string7, "prop_recommend")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prop_panel_");
                    sbLIZ.append(string7);
                    mapLJIJ.put("prop_selected_from", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    mapLJIJ.put("prop_selected_from", string7);
                }
            }
            String string8 = bundle.getString("prop_tab_order");
            if (string8 != null && string8.length() != 0) {
                mapLJIJ.put("prop_tab_order", string8);
            }
            String string9 = bundle.getString("enter_method");
            if (string9 != null && string9.length() != 0) {
                mapLJIJ.put("enter_method", string9);
            }
        }
        if (bundle != null && (string6 = bundle.getString("search_id")) != null && string6.length() != 0) {
            mapLJIJ.put("search_id", string6);
        }
        if (bundle != null) {
            String string10 = bundle.getString("search_method");
            if (string10 != null && string10.length() != 0) {
                mapLJIJ.put("search_method", string10);
            }
            String string11 = bundle.getString("is_panel_unfold");
            if (string11 != null && string11.length() != 0) {
                mapLJIJ.put("is_panel_unfold", string11);
            }
        }
        if (bundle != null) {
            string2 = bundle.getString("is_auto_applied");
        } else {
            string2 = null;
        }
        if (Intrinsics.LJFF(string2, "1")) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_auto_applied", str9);
        this.LIZ.creativeModel.recordEffectModel.isAutoApplied = Intrinsics.LJFF(str9, "1");
        if (bundle != null && (string5 = bundle.getString("tab_id")) != null && string5.length() != 0) {
            mapLJIJ.put("tab_id", string5);
        }
        if (bundle != null && (string4 = bundle.getString("prop_selected_from_trending")) != null && C123100dR.LIZ(string4)) {
            mapLJIJ.put("prop_selected_from_trending", string4);
        }
        if (string != null && string.length() != 0) {
            str10 = string;
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("carousel_open", str10);
        if (Intrinsics.LJFF(string, "1")) {
            mapLJIJ.put("prop_selected_from_trending", CardStruct.IStatusCode.DEFAULT);
            String string12 = bundle.getString("prop_selected_from");
            if (!C123100dR.LIZ(string12)) {
                string12 = "";
            }
            mapLJIJ.put("prop_selected_from", string12);
            mapLJIJ.put("prop_position", String.valueOf(i));
        }
        String strLIZJ = C1629100sUm.LIZJ(effect);
        if (strLIZJ != null) {
            mapLJIJ.put("fav_source", strLIZJ);
        }
        if (C1624570sNT.LJIIIZ(effect)) {
            str11 = "1";
        } else {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_avatar", str11);
        InterfaceC1448230nn3 interfaceC1448230nn3LJJIIJZLJL = C1ER1.LIZIZ.LJJIIJZLJL();
        String strLJIL = interfaceC1448230nn3LJJIIJZLJL.LJIL();
        if (strLJIL != null && strLJIL.length() > 0) {
            mapLJIJ.put("effect_session_id", strLJIL);
        }
        String latestSearchId = interfaceC1448230nn3LJJIIJZLJL.getLatestSearchId();
        if (Intrinsics.LJFF(mapLJIJ.get("search_id"), CardStruct.IStatusCode.DEFAULT) && latestSearchId != null) {
            mapLJIJ.put("search_id", latestSearchId);
        }
        interfaceC1448230nn3LJJIIJZLJL.LIZLLL(new C682370Qpf(mapLJIJ.get("search_id"), effectId, effect.getDoc_id(), i - 1, this.LIZ.getCreationId(), mapLJIJ.get("search_method")));
        if (bundle != null && (string3 = bundle.getString("carousel_action_method")) != null) {
            mapLJIJ.put("carousel_action_method", string3);
        }
        mapLJIJ.put("camera", C1449260noi.LIZIZ(C0CHQ.LIZ().LJJIIZI().LJJJJZI(1)));
        if (C1449600npG.LJII(effect) || C1446840nko.LJ(effect)) {
            mapLJIJ.put("template_id", effect.getId());
            mapLJIJ.put("template_name", effect.getName());
            mapLJIJ.put("is_existing_effect", CardStruct.IStatusCode.DEFAULT);
            mapLJIJ.put("is_pro_template", CardStruct.IStatusCode.DEFAULT);
            mapLJIJ.put("is_photo_mode", this.LIZ.LJJIJIL());
            mapLJIJ.put("user_entry_method", this.LIZ.creativeModel.mecReportModel.LIZ);
            C1449260noi.LJ("click_mobile_effect_template", mapLJIJ);
        }
        if (effect instanceof MobileEffect) {
            mapLJIJ.put("is_mobile_effect", "1");
            mapLJIJ.put("is_ame_data", "1");
            mapLJIJ.put("prop_status", String.valueOf(((MobileEffect) effect).getModerationStatus()));
        } else if (C1449600npG.LJII(effect)) {
            mapLJIJ.put("is_mobile_effect", CardStruct.IStatusCode.DEFAULT);
            mapLJIJ.put("is_ame_data", CardStruct.IStatusCode.DEFAULT);
        }
        LJIILLIIL(mapLJIJ, effect);
        if (effect.getSource() == 102 && !C1446840nko.LJ(effect)) {
            str12 = "1";
        } else {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_self_created_ame_createtab", str12);
        LJIIZILJ(mapLJIJ, effect);
        String str19 = this.LIZ.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str19 != null && str19.length() > 0) {
            mapLJIJ.put("enter_dm", str19);
        }
        String str20 = this.LIZ.creativeModel.initialModel.dmCameraModel.searchSessionId;
        if (str20 != null) {
            mapLJIJ.put("search_session_id", str20);
        }
        if (this.LIZ.creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
            mapLJIJ.put("is_chat_page_icon_effect", "1");
        }
        if (C1624550sNR.LIZIZ(effect)) {
            mapLJIJ.put("style_id", effectId);
        }
        if (C1446840nko.LIZJ(effect)) {
            mapLJIJ.put("aigc_template_resource_id", effect.getResourceId());
        }
        if (C1449600npG.LJFF(effect) || C1624200sMs.LIZLLL(effect)) {
            C0LXN.LIZ.getClass();
            C0LXN.LIZ(effect, mapLJIJ);
        }
        if (C1624200sMs.LJ(effect)) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_aigc_prop", str13);
        C1665200tR0.LIZ.getClass();
        mapLJIJ.put("is_met_music_reuse", String.valueOf(C1665200tR0.LIZJ(effect) ? 1 : 0));
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str14 = "1";
        } else {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("is_login", str14);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str15 = "1";
        } else {
            str15 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("has_camera_permission", str15);
        if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str18 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIJ.put("has_microphone_permission", str18);
        C523280Kfe.LIZ.getClass();
        mapLJIJ.put("has_upload_permission", C523280Kfe.LIZIZ());
        C1449260noi.LJ(str4, mapLJIJ);
    }
}
