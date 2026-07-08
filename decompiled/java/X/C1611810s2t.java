package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611810s2t {
    public static final C01GW<ISeriesCommonETService> LJJIIJZLJL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(561));
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public Boolean LJIJI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public DramaExtraTrackingParams LJJIII;
    public boolean LJJIIJ;
    public String LIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIJJ = "";
    public String LJIJJLI = "";
    public String LJJII = "";

    public final void LIZJ() throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (Intrinsics.LJFF(this, C1611670s2f.LIZJ) || this.LIZJ != 0) {
            return;
        }
        this.LIZJ = SystemClock.elapsedRealtime();
        LIZIZ(this, "callStartActivity");
    }

    public final void LJ() throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (Intrinsics.LJFF(this, C1611670s2f.LIZJ) || this.LJIILIIL != 0) {
            return;
        }
        this.LJIILIIL = SystemClock.elapsedRealtime();
        LIZIZ(this, "detailNetworkSuccessEnd");
    }

    public final void LJFF() throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (Intrinsics.LJFF(this, C1611670s2f.LIZJ) || this.LJIILLIIL != 0) {
            return;
        }
        this.LJIILLIIL = SystemClock.elapsedRealtime();
        LIZIZ(this, "setDataStart");
    }

    public final void LJII() throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (Intrinsics.LJFF(this, C1611670s2f.LIZJ) || this.LJIIL != 0) {
            return;
        }
        this.LJIIL = SystemClock.elapsedRealtime();
        LIZIZ(this, "videoNetworkSuccessEnd");
    }

    public final void LJIIIIZZ() throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (Intrinsics.LJFF(this, C1611670s2f.LIZJ) || this.LJIIZILJ != 0) {
            return;
        }
        this.LJIIZILJ = SystemClock.elapsedRealtime();
        LIZIZ(this, "videoPlayStart");
    }

    public final void LIZ(EnumC1611820s2u enumC1611820s2u) {
        String str;
        Boolean boolIsFromSeriesDiscover;
        Boolean boolIsAutoProcceedToInnerfeed;
        String str2;
        C1611670s2f.LIZ.getClass();
        if (!Intrinsics.LJFF(this, C1611670s2f.LIZJ) && (str = this.LIZ) != null && (!TextUtils.isEmpty(str))) {
            Map<String, C1611810s2t> map = C1611670s2f.LIZIZ;
            C1611810s2t c1611810s2t = (C1611810s2t) ((LinkedHashMap) map).get(str);
            if (c1611810s2t != null) {
                long j = c1611810s2t.LIZIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("collection_id", c1611810s2t.LIZ);
                c2344009Gk.LJFF("enter_from", c1611810s2t.LJIJJLI);
                c2344009Gk.LJFF("series_enter_entrance", c1611810s2t.LJJII);
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(Boolean.valueOf(c1611810s2t.LJIL)), "is_from_bottom_banner");
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(Boolean.valueOf(c1611810s2t.LJJ)), "is_from_sdp");
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(Boolean.valueOf(c1611810s2t.LJJI)), "is_from_anchor");
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(Boolean.valueOf(c1611810s2t.LJJIFFI)), "series_category");
                long jLIZJ = C1611670s2f.LIZJ(c1611810s2t.LIZJ, j);
                long jLIZJ2 = C1611670s2f.LIZJ(c1611810s2t.LIZLLL, j);
                long jLIZJ3 = C1611670s2f.LIZJ(c1611810s2t.LJII, j);
                long jLIZJ4 = C1611670s2f.LIZJ(0L, j);
                long jLIZJ5 = C1611670s2f.LIZJ(c1611810s2t.LJ, j);
                long jLIZJ6 = C1611670s2f.LIZJ(c1611810s2t.LJFF, j);
                long jLIZJ7 = C1611670s2f.LIZJ(c1611810s2t.LJI, j);
                long jLIZJ8 = C1611670s2f.LIZJ(c1611810s2t.LJIIIIZZ, j);
                long jLIZJ9 = C1611670s2f.LIZJ(c1611810s2t.LJIIIZ, j);
                long jLIZJ10 = C1611670s2f.LIZJ(c1611810s2t.LJIILLIIL, j);
                long jLIZJ11 = C1611670s2f.LIZJ(0L, j);
                long jLIZJ12 = C1611670s2f.LIZJ(0L, j);
                c2344009Gk.LIZLLL(jLIZJ, "start_activity");
                c2344009Gk.LIZLLL(jLIZJ2, "activity_create");
                c2344009Gk.LIZLLL(jLIZJ4, "video_network_preload");
                c2344009Gk.LIZLLL(jLIZJ3, "detail_network_preload");
                c2344009Gk.LIZLLL(jLIZJ5, "fragment_create");
                c2344009Gk.LIZLLL(jLIZJ6, "fragment_create_view");
                c2344009Gk.LIZLLL(jLIZJ7, "fragment_view_created");
                c2344009Gk.LIZLLL(jLIZJ8, "detail_api_call");
                c2344009Gk.LIZLLL(jLIZJ9, "video_api_call");
                c2344009Gk.LIZLLL(jLIZJ10, "set_data");
                c2344009Gk.LIZLLL(jLIZJ11, "viewPreDraw");
                c2344009Gk.LIZLLL(jLIZJ12, "surfaceAvailable");
                DramaExtraTrackingParams dramaExtraTrackingParams = c1611810s2t.LJJIII;
                if (dramaExtraTrackingParams != null) {
                    boolIsFromSeriesDiscover = dramaExtraTrackingParams.isFromSeriesDiscover();
                } else {
                    boolIsFromSeriesDiscover = null;
                }
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(boolIsFromSeriesDiscover), "is_from_series_discover");
                DramaExtraTrackingParams dramaExtraTrackingParams2 = c1611810s2t.LJJIII;
                if (dramaExtraTrackingParams2 != null) {
                    boolIsAutoProcceedToInnerfeed = dramaExtraTrackingParams2.isAutoProcceedToInnerfeed();
                } else {
                    boolIsAutoProcceedToInnerfeed = null;
                }
                c2344009Gk.LIZJ(C1611670s2f.LIZLLL(boolIsAutoProcceedToInnerfeed), "is_auto_procceed_to_innerfeed");
                C1611670s2f.LIZ(c2344009Gk, c1611810s2t);
                long j2 = c1611810s2t.LJIIL;
                if (j2 != 0) {
                    long jLIZJ13 = C1611670s2f.LIZJ(j2, j);
                    long jLIZJ14 = C1611670s2f.LIZJ(c1611810s2t.LJIIL, c1611810s2t.LJIIIZ);
                    c2344009Gk.LIZLLL(jLIZJ13, "video_api_success");
                    c2344009Gk.LIZLLL(jLIZJ14, "video_api_duration");
                }
                long j3 = c1611810s2t.LJIILIIL;
                if (j3 != 0) {
                    long jLIZJ15 = C1611670s2f.LIZJ(j3, j);
                    long jLIZJ16 = C1611670s2f.LIZJ(c1611810s2t.LJIILIIL, c1611810s2t.LJIIIIZZ);
                    c2344009Gk.LIZLLL(jLIZJ15, "detail_api_success");
                    c2344009Gk.LIZLLL(jLIZJ16, "detail_api_duration");
                }
                c2344009Gk.LIZLLL(C1611670s2f.LIZJ(c1611810s2t.LJIIZILJ, j), "first_frame_render");
                c2344009Gk.LIZLLL(C1611670s2f.LIZJ(c1611810s2t.LJIJ, j), "first_series_locked");
                if (Intrinsics.LJFF(c1611810s2t.LJIJI, Boolean.TRUE)) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJFF("is_from_share_aweme", str2);
                String str3 = c1611810s2t.LJIJJ;
                if (str3 != null) {
                    c2344009Gk.LJFF("share_aweme_from", str3);
                }
                int i = C1611840s2w.LIZ[enumC1611820s2u.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        long jLIZJ17 = C1611670s2f.LIZJ(c1611810s2t.LJIILJJIL, j);
                        long jLIZJ18 = C1611670s2f.LIZJ(c1611810s2t.LJIILJJIL, c1611810s2t.LJIIIZ);
                        c2344009Gk.LIZLLL(jLIZJ17, "video_api_failed");
                        c2344009Gk.LIZLLL(jLIZJ18, "video_api_duration");
                        c2344009Gk.LJFF("error_code", c1611810s2t.LJIIJ);
                        c2344009Gk.LJFF("error_message", c1611810s2t.LJIIJJI);
                    }
                } else {
                    long jLIZJ19 = C1611670s2f.LIZJ(c1611810s2t.LJIILL, j);
                    long jLIZJ20 = C1611670s2f.LIZJ(c1611810s2t.LJIILL, c1611810s2t.LJIIIIZZ);
                    c2344009Gk.LIZLLL(jLIZJ19, "detail_api_failed");
                    c2344009Gk.LIZLLL(jLIZJ20, "detail_api_duration");
                    c2344009Gk.LJFF("error_code", c1611810s2t.LJIIJ);
                    c2344009Gk.LJFF("error_message", c1611810s2t.LJIIJJI);
                }
                c2344009Gk.LJFF("stage", enumC1611820s2u.getStage());
                C1163504gr.LIZIZ.onEventV3("series_enter_inner_feed_monitor", c2344009Gk.LIZ);
                map.remove(str);
            }
        }
    }

    public static void LIZIZ(C1611810s2t c1611810s2t, String str) throws JSONException {
        c1611810s2t.getClass();
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("stage", str);
        jSONObject.putOpt("page_type", "detail_page");
        c1163504gr.onEventV3("mini_drama_page_stage", jSONObject);
    }

    public final void LIZLLL(String str, String str2) throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (!Intrinsics.LJFF(this, C1611670s2f.LIZJ) && this.LJIILL == 0) {
            this.LJIILL = SystemClock.elapsedRealtime();
            if (str == null) {
                str = "";
            }
            this.LJIIJ = str;
            if (str2 == null) {
                str2 = "";
            }
            this.LJIIJJI = str2;
            LIZIZ(this, "detailNetworkFailedEnd");
        }
    }

    public final void LJI(String str, String str2) throws JSONException {
        C1611670s2f.LIZ.getClass();
        if (!Intrinsics.LJFF(this, C1611670s2f.LIZJ) && this.LJIILJJIL == 0) {
            this.LJIILJJIL = SystemClock.elapsedRealtime();
            if (str == null) {
                str = "";
            }
            this.LJIIJ = str;
            if (str2 == null) {
                str2 = "";
            }
            this.LJIIJJI = str2;
            LIZIZ(this, "videoNetworkFailedEnd");
        }
    }
}
