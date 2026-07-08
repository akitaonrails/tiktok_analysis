package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0St4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735440St4 extends AbstractC1386140mAu<C735440St4> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public Aweme LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public int LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public int LJJZZI;
    public Boolean LJJZZIII;
    public String LJL;
    public int LJLI;
    public boolean LJLIIIL;
    public String LJLIIL;
    public String LJLIL;

    public C735440St4() {
        super("click_more_button");
        this.LJJZZIII = Boolean.FALSE;
        this.LJLI = -1;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        Object c098200Yq;
        Object objOpt;
        Map<String, String> mapLJ;
        String str;
        String str2 = this.LJJLIIIJ;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str2, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJILLIZJL, c1210890hcF);
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(C735370Ssx.LJIJJ(this.LJJLIIIJJI));
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJFF(this.LJJLIIIJL, this.LJJLIIIJLJLI, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJFF("playlist_type", this.LJJLIIIJJIZ, InterfaceC1210900hcG.LIZ);
        }
        if (C1906580ziK.LIZIZ() != null && !TextUtils.isEmpty(C0SUC.LIZ(C1906580ziK.LIZIZ().LIZIZ()).getPlayListId())) {
            LJ("playlist_id", C0SUC.LIZ(C1906580ziK.LIZIZ().LIZIZ()).getPlayListId());
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJFF("log_pb", this.LJJLJ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJFF("prop_id", this.LJJLIIIJLLLLLLLZ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LJFF("effect_id", this.LJJLIIJ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJ("enter_method", this.LJJZ);
        }
        String str3 = "";
        if (this.LJJLIL != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJJLIL);
            sbLIZ.append("");
            LJFF("scene_id", C2188811AlT.LIZIZ(sbLIZ), InterfaceC1210900hcG.LIZ);
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        LJ("is_horizontal_screen", CardStruct.IStatusCode.DEFAULT);
        LIZLLL(this.LJJZZI, "is_landscape_screen");
        String str5 = this.LJJLJLI;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("previous_page", str5, c2082308Dt);
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJFF("impr_type", this.LJJLL, c2082308Dt);
        }
        LJ("is_casting", Boolean.toString(this.LJLIIIL));
        LJ("casting_session_id", this.LJLIIL);
        LJ("request_id", C735370Ssx.LJIJJ(this.LJJLIIIJJI));
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (this.LJJZZIII.booleanValue()) {
            LJ("story_type", "story");
        } else {
            LJ("story_type", "post");
        }
        if (!TextUtils.isEmpty(this.LJLIL)) {
            LJ("content_type", this.LJLIL);
        }
        int i = this.LJLI;
        if (i >= 0) {
            LIZLLL(i, "is_share_to_story");
        }
        Aweme aweme = this.LJJLIIIJJI;
        if (aweme != null) {
            aweme.getTrendingBarFYP();
            LIZLLL(this.LJJJJZ.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJJJZ), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJJJZ), "pic_cnt");
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            String strLIZ = C1381730m3n.LIZ(this.LJJLIIIJJI);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                LJ("photo_content_type", strLIZ);
            }
            LIZLLL(this.LJJLIIIJJI.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            C735480St8 c735480St8 = new Object() { // from class: X.0St8
            };
            HashMap map = (HashMap) this.LIZIZ;
            Aweme aweme2 = this.LJJLIIIJJI;
            c735480St8.getClass();
            IPoiAnchorServiceTemporary iPoiAnchorServiceTemporary = (IPoiAnchorServiceTemporary) ServiceManager.get().getService(IPoiAnchorServiceTemporary.class);
            if (iPoiAnchorServiceTemporary.LIZIZ()) {
                mapLJ = iPoiAnchorServiceTemporary.LIZLLL(aweme2);
            } else if (aweme2 == null) {
                mapLJ = C2097608Jq.LJ();
            } else {
                PoiAnchorData.Companion.getClass();
                PoiAnchorData poiAnchorDataLIZ = C735490St9.LIZ(aweme2, "default");
                if (poiAnchorDataLIZ == null) {
                    mapLJ = C2097608Jq.LJ();
                } else {
                    C735460St6.Companion.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Map<String, Object> mapLIZIZ = EcommerceAnchorService.LIZJ().LIZIZ(aweme2);
                    if (mapLIZIZ != null) {
                        linkedHashMap.putAll(mapLIZIZ);
                    }
                    linkedHashMap.put("aweme_type", Integer.valueOf(aweme2.getAwemeType()));
                    NearbyInfo nearbyInfo = aweme2.getNearbyInfo();
                    if (nearbyInfo != null && (str = nearbyInfo.eventTrack) != null) {
                        str3 = str;
                    }
                    linkedHashMap.put("event_track", str3);
                    linkedHashMap.put("follow_status", String.valueOf(AwemeExtKt.getFollowStatus(aweme2)));
                    linkedHashMap.put("publish_consume_Interval", String.valueOf(System.currentTimeMillis() - aweme2.getCreateTime()));
                    List<AnchorCommonStruct> anchors = aweme2.getAnchors();
                    Integer numValueOf = Integer.valueOf((anchors == null || anchors.size() <= 1) ? 0 : 1);
                    String aid = aweme2.getAid();
                    String authorUid = AwemeExtKt.getAuthorUid(aweme2);
                    String strLJIILIIL = C735370Ssx.LJIILIIL(aweme2);
                    String logPbString = aweme2.getLogPbString();
                    if (logPbString == null) {
                        logPbString = null;
                    } else if (logPbString.length() == 0) {
                        logPbString = C584850Mwl.LIZ.LIZIZ(aweme2.getRequestId());
                    }
                    C735460St6 c735460St6 = new C735460St6(numValueOf, aid, authorUid, strLJIILIIL, logPbString, linkedHashMap);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJ(poiAnchorDataLIZ.poiDeviceSameCity, "poi_device_samecity");
                    c2344009Gk.LJIIIIZZ("poi_id", poiAnchorDataLIZ.poiId);
                    c2344009Gk.LJIIIIZZ("poi_city", poiAnchorDataLIZ.poiCityCode);
                    c2344009Gk.LJIIIIZZ("poi_region_code", poiAnchorDataLIZ.poiRegionCode);
                    c2344009Gk.LJFF("poi_info_source", poiAnchorDataLIZ.poiInfoSource);
                    String str6 = poiAnchorDataLIZ.collectInfo;
                    if (str6 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str6);
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                                    c2344009Gk.LJFF(next, objOpt.toString());
                                }
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                    String str7 = c735460St6.logPb;
                    if (str7 != null && str7.length() > 0) {
                        c2344009Gk.LJFF("log_pb", str7);
                    }
                    Map<String, Object> map2 = c735460St6.extraParam;
                    if (map2 != null) {
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            if (!Intrinsics.LJFF(entry.getKey(), "event_track") && !Intrinsics.LJFF(entry.getKey(), "follow_status") && !Intrinsics.LJFF(entry.getKey(), "publish_consume_Interval")) {
                                c2344009Gk.LJ(entry.getValue(), entry.getKey());
                            }
                        }
                    }
                    c2344009Gk.LJ(c735460St6.multiAnchor, "multi_anchor");
                    c2344009Gk.LJIIIIZZ("author_id", c735460St6.authorId);
                    c2344009Gk.LJIIIIZZ("group_id", c735460St6.groupId);
                    c2344009Gk.LJIIIIZZ("music_id", c735460St6.musicId);
                    C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                    Application applicationLIZ = C1BWL.LIZ();
                    c19741112Lp.getClass();
                    c2344009Gk.LIZJ(C19741112Lp.LIZLLL(applicationLIZ, "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0, "enable_location");
                    mapLJ = c2344009Gk.LIZ;
                }
            }
            if (!mapLJ.isEmpty()) {
                map.putAll(mapLJ);
            }
            LIZIZ(C735450St5.LIZ(this.LJJLIIIJJI, this.LIZLLL));
            C1612650s4F.LIZIZ(this, this.LJJLIIIJJI);
            if (this.LJJLIIIJJI.isStreaksPost()) {
                str4 = "1";
            }
            LJ("is_streaks_story", str4);
            if (this.LJJLIIIJJI.getMobParams() != null && !TextUtils.isEmpty(this.LJJLIIIJJI.getMobParams().get("playlist_session_id"))) {
                LJ("playlist_session_id", this.LJJLIIIJJI.getMobParams().get("playlist_session_id"));
            }
        }
        if (TextUtils.isEmpty(this.LJL)) {
            return;
        }
        LJ("story_collection_id", this.LJL);
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        super.LJIJI(aweme);
        this.LJJLIIIJJI = aweme;
        this.LJJLIIIJ = aweme.getAid();
        this.LJJLL = C735370Ssx.LJI(aweme);
    }
}
