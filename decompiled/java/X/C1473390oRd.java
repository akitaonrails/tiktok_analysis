package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473390oRd {
    public final C1473400oRe LIZ;

    public C1473390oRd(C1473400oRe c1473400oRe) {
        this.LIZ = c1473400oRe;
    }

    public final void LIZ(JSONObject jSONObject) {
        String str;
        int i;
        String str2;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str3;
        boolean z;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        String str10;
        String str11;
        JSONArray jSONArrayOptJSONArray4;
        JSONArray jSONArrayOptJSONArray5;
        JSONObject jSONObjectOptJSONObject2;
        String str12;
        JSONObject jSONObjectOptJSONObject3;
        String str13;
        JSONArray jSONArrayOptJSONArray6;
        JSONArray jSONArrayOptJSONArray7;
        if (jSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray("PlayInfoList");
        if ((jSONArrayOptJSONArray8 == null || jSONArrayOptJSONArray8.length() <= 0) && TextUtils.isEmpty(jSONObject.optString("VideoID")) && TextUtils.isEmpty(jSONObject.optString("Vid"))) {
            if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                if (jSONObject.optInt("version") == 3) {
                    this.LIZ.LIZ = 3;
                } else {
                    this.LIZ.LIZ = 1;
                }
            }
        } else if (jSONObject.optInt("Version") == 4) {
            this.LIZ.LIZ = 4;
        } else {
            this.LIZ.LIZ = 2;
        }
        C1473400oRe c1473400oRe = this.LIZ;
        int i3 = c1473400oRe.LIZ;
        if (i3 != 1 && i3 != 3) {
            if (i3 == 2) {
                c1473400oRe.LJJLL = jSONObject.optInt("Status");
                this.LIZ.LJJLJ = jSONObject.optString("VideoID");
                this.LIZ.LJJZZI = jSONObject.optString("CoverUrl");
                this.LIZ.LJJZ = jSONObject.optInt("Duration");
                this.LIZ.LJJZZIII = jSONObject.optString("MediaType");
                this.LIZ.LJLIIL = jSONObject.optInt("TotalCount");
                this.LIZ.LJJ = jSONObject.optBoolean("EnableSSL");
                this.LIZ.LJJI = jSONObject.optBoolean("EnableAdaptive");
                if (this.LIZ.LJJZZIII.equals("video")) {
                    this.LIZ.LJL = 0;
                } else if (this.LIZ.LJJZZIII.equals("audio")) {
                    this.LIZ.LJL = 1;
                }
                if (jSONObject.has("Seekts")) {
                    this.LIZ.getClass();
                    C801580VcS.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "Seekts"));
                }
                if (jSONObject.has("BigThumbs") && (jSONArrayOptJSONArray7 = jSONObject.optJSONArray("BigThumbs")) != null && jSONArrayOptJSONArray7.length() > 0) {
                    this.LIZ.LJLIIIL = new ArrayList();
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray7.length(); i4++) {
                        try {
                            C1473440oRi c1473440oRi = new C1473440oRi();
                            c1473440oRi.LIZLLL = this.LIZ.LIZ;
                            c1473440oRi.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray7, i4));
                            ((ArrayList) this.LIZ.LJLIIIL).add(c1473440oRi);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                if (jSONObject.has("SubtitleInfoList") && (jSONArrayOptJSONArray6 = jSONObject.optJSONArray("SubtitleInfoList")) != null && jSONArrayOptJSONArray6.length() > 0) {
                    this.LIZ.LJJIL = new ArrayList();
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray6.length(); i5++) {
                        C1469130oKl c1469130oKl = new C1469130oKl();
                        c1469130oKl.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray6, i5));
                        ((ArrayList) this.LIZ.LJJIL).add(c1469130oKl);
                    }
                }
                if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
                    this.LIZ.LJJLJLI = new ArrayList();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < jSONArrayOptJSONArray8.length()) {
                        C1473400oRe c1473400oRe2 = this.LIZ;
                        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray8, i6);
                        C1473400oRe c1473400oRe3 = this.LIZ;
                        int i8 = c1473400oRe3.LJL;
                        if (c1473400oRe3.LJJJJIZL) {
                            str13 = c1473400oRe3.LJJJJ;
                        } else {
                            str13 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ = c1473400oRe2.LIZIZ(i8, str13, jSONObject2);
                        c1474520oTSLIZIZ.LJJJJJ = i7;
                        ((ArrayList) this.LIZ.LJJLJLI).add(c1474520oTSLIZIZ);
                        i6++;
                        i7++;
                    }
                }
                if (jSONObject.has("AdaptiveInfo") && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    C1473400oRe c1473400oRe4 = this.LIZ;
                    C1473410oRf c1473410oRf = new C1473410oRf();
                    c1473400oRe4.LJLI = c1473410oRf;
                    c1473410oRf.LIZ = jSONObjectOptJSONObject3.optString("AdaptiveType");
                    c1473410oRf.LIZIZ = jSONObjectOptJSONObject3.optString("MainPlayUrl");
                    c1473410oRf.LIZJ = jSONObjectOptJSONObject3.optString("BackupPlayUrl");
                    C1473400oRe c1473400oRe5 = this.LIZ;
                    c1473400oRe5.LJI = c1473400oRe5.LJLI.LIZ(215);
                    C1473400oRe c1473400oRe6 = this.LIZ;
                    c1473400oRe6.LJJIIZI = c1473400oRe6.LJLI.LIZ(108);
                    C1473400oRe c1473400oRe7 = this.LIZ;
                    c1473400oRe7.LJJIJ = c1473400oRe7.LJLI.LIZ(109);
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(this.LIZ.LJJIIZI)) {
                        arrayList.add(this.LIZ.LJJIIZI);
                    }
                    if (!TextUtils.isEmpty(this.LIZ.LJJIJ)) {
                        arrayList.add(this.LIZ.LJJIJ);
                    }
                    this.LIZ.LJJIJIIJI = new String[arrayList.size()];
                    arrayList.toArray(this.LIZ.LJJIJIIJI);
                }
            } else if (i3 == 4) {
                c1473400oRe.LJJIJIIJIL = jSONObject.optInt("Status");
                this.LIZ.LJIJJ = jSONObject.optString("Vid");
                this.LIZ.LJLJL = jSONObject.optString("PosterUrl");
                this.LIZ.LJJIJIL = jSONObject.optInt("Duration");
                this.LIZ.LJJJIL = jSONObject.optString("FileType");
                this.LIZ.LJLJLJ = jSONObject.optInt("TotalCount");
                this.LIZ.LJJ = jSONObject.optBoolean("EnableSSL");
                this.LIZ.LJJI = jSONObject.optBoolean("EnableAdaptive");
                this.LIZ.LJLIL = jSONObject.optString("BarrageMaskUrl");
                if (jSONObject.has("BarrageMaskInfo")) {
                    C1473400oRe c1473400oRe8 = this.LIZ;
                    C1471650oOp c1471650oOp = new C1471650oOp();
                    c1473400oRe8.LJJIJL = c1471650oOp;
                    c1471650oOp.LIZIZ(jSONObject.optJSONObject("BarrageMaskInfo"));
                    C1473400oRe c1473400oRe9 = this.LIZ;
                    c1473400oRe9.LJLIL = c1473400oRe9.LJJIJL.LJFF(1);
                    C1473400oRe c1473400oRe10 = this.LIZ;
                    c1473400oRe10.LJLJJL = c1473400oRe10.LJJIJL.LIZLLL(7);
                    C1473400oRe c1473400oRe11 = this.LIZ;
                    c1473400oRe11.LJLJJI = c1473400oRe11.LJJIJL.LJFF(3);
                    C1473400oRe c1473400oRe12 = this.LIZ;
                    c1473400oRe12.LJLJJLL = c1473400oRe12.LJJIJL.LJ();
                }
                if (this.LIZ.LJJJIL.equals("video")) {
                    this.LIZ.LJJJJL = 0;
                } else if (this.LIZ.LJJJIL.equals("audio")) {
                    this.LIZ.LJJJJL = 1;
                }
                if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
                    this.LIZ.LJJIII = new ArrayList();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < jSONArrayOptJSONArray8.length()) {
                        C1473400oRe c1473400oRe13 = this.LIZ;
                        JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray8, i9);
                        C1473400oRe c1473400oRe14 = this.LIZ;
                        int i11 = c1473400oRe14.LJJJJL;
                        if (c1473400oRe14.LJJJJIZL) {
                            str12 = c1473400oRe14.LJJJJ;
                        } else {
                            str12 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ2 = c1473400oRe13.LIZIZ(i11, str12, jSONObject3);
                        c1474520oTSLIZIZ2.LJJJJJ = i10;
                        ((ArrayList) this.LIZ.LJJIII).add(c1474520oTSLIZIZ2);
                        i9++;
                        i10++;
                    }
                    C1473400oRe c1473400oRe15 = this.LIZ;
                    c1473400oRe15.LJJJJZI = ((C1474520oTS) ListProtector.get(c1473400oRe15.LJJIII, 0)).LJJJIL;
                    C1473400oRe c1473400oRe16 = this.LIZ;
                    c1473400oRe16.LJJJLIIL = ((C1474520oTS) ListProtector.get(c1473400oRe16.LJJIII, 0)).LJJJJ;
                }
                if (jSONObject.has("AdaptiveInfo") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    C1473400oRe c1473400oRe17 = this.LIZ;
                    C1473410oRf c1473410oRf2 = new C1473410oRf();
                    c1473400oRe17.LJLJLLL = c1473410oRf2;
                    c1473410oRf2.LIZ = jSONObjectOptJSONObject2.optString("AdaptiveType");
                    c1473410oRf2.LIZIZ = jSONObjectOptJSONObject2.optString("MainPlayUrl");
                    c1473410oRf2.LIZJ = jSONObjectOptJSONObject2.optString("BackupPlayUrl");
                    C1473400oRe c1473400oRe18 = this.LIZ;
                    c1473400oRe18.LJI = c1473400oRe18.LJLJLLL.LIZ(215);
                    C1473400oRe c1473400oRe19 = this.LIZ;
                    c1473400oRe19.LJJIIZI = c1473400oRe19.LJLJLLL.LIZ(108);
                    C1473400oRe c1473400oRe20 = this.LIZ;
                    c1473400oRe20.LJJIJ = c1473400oRe20.LJLJLLL.LIZ(109);
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(this.LIZ.LJJIIZI)) {
                        arrayList2.add(this.LIZ.LJJIIZI);
                    }
                    if (!TextUtils.isEmpty(this.LIZ.LJJIJ)) {
                        arrayList2.add(this.LIZ.LJJIJ);
                    }
                    this.LIZ.LJJIJIIJI = new String[arrayList2.size()];
                    arrayList2.toArray(this.LIZ.LJJIJIIJI);
                }
                if (jSONObject.has("SubtitleInfoList") && (jSONArrayOptJSONArray5 = jSONObject.optJSONArray("SubtitleInfoList")) != null && jSONArrayOptJSONArray5.length() > 0) {
                    this.LIZ.LJJIL = new ArrayList();
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray5.length(); i12++) {
                        C1469130oKl c1469130oKl2 = new C1469130oKl();
                        c1469130oKl2.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray5, i12));
                        ((ArrayList) this.LIZ.LJJIL).add(c1469130oKl2);
                    }
                }
                if (jSONObject.has("ThumbInfoList") && (jSONArrayOptJSONArray4 = jSONObject.optJSONArray("ThumbInfoList")) != null && jSONArrayOptJSONArray4.length() > 0) {
                    this.LIZ.LJJIJLIJ = new ArrayList();
                    for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                        C1473440oRi c1473440oRi2 = new C1473440oRi();
                        c1473440oRi2.LIZLLL = this.LIZ.LIZ;
                        c1473440oRi2.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray4, i13));
                        ((ArrayList) this.LIZ.LJJIJLIJ).add(c1473440oRi2);
                    }
                }
            }
        } else {
            if (i3 == 1) {
                c1473400oRe.LJJJJI = jSONObject.optString("fallback_api");
                String strOptString = jSONObject.optString("key_seed");
                if (!TextUtils.isEmpty(strOptString)) {
                    this.LIZ.LJJJJ = strOptString;
                }
            } else {
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("fallback_api");
                if (jSONObjectOptJSONObject4 != null) {
                    this.LIZ.LJJJJI = jSONObjectOptJSONObject4.optString("fallback_api");
                    String strOptString2 = jSONObjectOptJSONObject4.optString("key_seed");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.LIZ.LJJJJ = strOptString2;
                    }
                }
            }
            this.LIZ.LJJIJIL = jSONObject.optInt("video_duration");
            this.LIZ.LJJIJIIJIL = jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            this.LIZ.LJJ = jSONObject.optBoolean("enable_ssl");
            this.LIZ.LJJI = jSONObject.optBoolean("enable_adaptive");
            this.LIZ.LJIJJ = jSONObject.optString("video_id");
            this.LIZ.LJJII = jSONObject.optInt("popularity_level");
            this.LIZ.LJJJIL = jSONObject.optString("media_type");
            this.LIZ.LJJJJZ = jSONObject.optString("optimal_decoding_mode");
            this.LIZ.LJLJI = jSONObject.optLong("url_expire");
            this.LIZ.LJIJJLI = jSONObject.optString("validate");
            this.LIZ.LJIL = jSONObject.optString("auto_definition");
            this.LIZ.LJJIFFI = jSONObject.optString("video_name");
            this.LIZ.LJIJI = jSONObject.optString("user_id");
            this.LIZ.LJIJ = jSONObject.optBoolean("mb_refactor", false);
            this.LIZ.LJLLJ = (float) jSONObject.optDouble("vq_score", 0.0d);
            this.LIZ.LJLLL = (float) jSONObject.optDouble("sr_score", 0.0d);
            C1473400oRe c1473400oRe21 = this.LIZ;
            if (c1473400oRe21.LIZ == 1) {
                String strOptString3 = jSONObject.optString("barrage_mask_url");
                if (!TextUtils.isEmpty(strOptString3)) {
                    C1473400oRe c1473400oRe22 = this.LIZ;
                    if (c1473400oRe22.LJJJJIZL) {
                        str11 = c1473400oRe22.LJJJJ;
                    } else {
                        str11 = null;
                    }
                    c1473400oRe22.LJLIL = C795730VJj.LIZJ(strOptString3, str11);
                }
                String strOptString4 = jSONObject.optString("effect_barrage_url");
                if (!TextUtils.isEmpty(strOptString4)) {
                    C1473400oRe c1473400oRe23 = this.LIZ;
                    if (c1473400oRe23.LJJJJIZL) {
                        str10 = c1473400oRe23.LJJJJ;
                    } else {
                        str10 = null;
                    }
                    c1473400oRe23.LJLILLLLZI = C795730VJj.LIZJ(strOptString4, str10);
                }
            } else {
                c1473400oRe21.LJLIL = jSONObject.optString("barrage_mask_url");
                this.LIZ.LJLILLLLZI = jSONObject.optString("effect_barrage_url");
            }
            String strOptString5 = jSONObject.optString("video_meta");
            if (!TextUtils.isEmpty(strOptString5)) {
                try {
                    JSONObject jSONObject4 = new JSONObject(strOptString5);
                    this.LIZ.LJJ = jSONObject4.optBoolean("enable_ssl");
                    this.LIZ.LJJI = jSONObject4.optBoolean("enable_adaptive");
                    JSONObject jSONObjectOptJSONObject5 = jSONObject4.optJSONObject("barrage_mask_info");
                    if (jSONObjectOptJSONObject5 != null) {
                        C1473400oRe c1473400oRe24 = this.LIZ;
                        C1471650oOp c1471650oOp2 = new C1471650oOp();
                        c1473400oRe24.LJJIJL = c1471650oOp2;
                        c1471650oOp2.LIZ(jSONObjectOptJSONObject5);
                        C1473400oRe c1473400oRe25 = this.LIZ;
                        if (c1473400oRe25.LIZ == 1) {
                            String strLJFF = c1473400oRe25.LJJIJL.LJFF(1);
                            if (!TextUtils.isEmpty(strLJFF)) {
                                C1473400oRe c1473400oRe26 = this.LIZ;
                                if (c1473400oRe26.LJJJJIZL) {
                                    str = c1473400oRe26.LJJJJ;
                                } else {
                                    str = null;
                                }
                                c1473400oRe26.LJLIL = C795730VJj.LIZJ(strLJFF, str);
                            }
                        } else {
                            c1473400oRe25.LJLIL = c1473400oRe25.LJJIJL.LJFF(1);
                        }
                        C1473400oRe c1473400oRe27 = this.LIZ;
                        c1473400oRe27.LJLJJL = c1473400oRe27.LJJIJL.LIZLLL(7);
                        C1473400oRe c1473400oRe28 = this.LIZ;
                        c1473400oRe28.LJLJJI = c1473400oRe28.LJJIJL.LJFF(3);
                        C1473400oRe c1473400oRe29 = this.LIZ;
                        c1473400oRe29.LJLJJLL = c1473400oRe29.LJJIJL.LJ();
                    }
                    JSONObject jSONObjectOptJSONObject6 = jSONObject4.optJSONObject("volume");
                    if (jSONObjectOptJSONObject6 != null) {
                        if (jSONObjectOptJSONObject6.has("loudness") || jSONObjectOptJSONObject6.has("peak")) {
                            try {
                                this.LIZ.LJJJJZI = (float) jSONObjectOptJSONObject6.optDouble("loudness");
                                this.LIZ.LJJJLIIL = (float) jSONObjectOptJSONObject6.optDouble("peak");
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                int i14 = C2187451AjH.LIZ;
                                C1471660oOq.LIZIZ("VideoRef", "parse video meta error");
                            }
                        }
                        if (jSONObjectOptJSONObject6.has("version")) {
                            this.LIZ.LJJLIIIIJ = jSONObjectOptJSONObject6.optInt("version");
                        }
                        if (jSONObjectOptJSONObject6.has("loudness_range")) {
                            this.LIZ.LJJJLL = (float) jSONObjectOptJSONObject6.optDouble("loudness_range");
                        }
                        if (jSONObjectOptJSONObject6.has("loudness_range_start")) {
                            this.LIZ.LJJJLZIJ = (float) jSONObjectOptJSONObject6.optDouble("loudness_range_start");
                        }
                        if (jSONObjectOptJSONObject6.has("loudness_range_end")) {
                            this.LIZ.LJJJZ = (float) jSONObjectOptJSONObject6.optDouble("loudness_range_end");
                        }
                        if (jSONObjectOptJSONObject6.has("maximum_momentary_loudness")) {
                            this.LIZ.LJJL = (float) jSONObjectOptJSONObject6.optDouble("maximum_momentary_loudness");
                        }
                        if (jSONObjectOptJSONObject6.has("maximum_short_term_loudness")) {
                            this.LIZ.LJJLI = (float) jSONObjectOptJSONObject6.optDouble("maximum_short_term_loudness");
                        }
                        try {
                            if (jSONObjectOptJSONObject6.has("volume_info_json")) {
                                this.LIZ.LJJLIIIJ = jSONObjectOptJSONObject6.optString("volume_info_json");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            int i142 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("VideoRef", "parse video meta error");
                        }
                    }
                    if (jSONObject4.has("seek_ts")) {
                        this.LIZ.getClass();
                        C801580VcS.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject4, "seek_ts"));
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (this.LIZ.LJJJIL.equals("video")) {
                this.LIZ.LJJJJL = 0;
            } else if (this.LIZ.LJJJIL.equals("audio")) {
                this.LIZ.LJJJJL = 1;
            }
            if (jSONObject.has("subtitle_langs") && (jSONArrayOptJSONArray3 = jSONObject.optJSONArray("subtitle_langs")) != null && jSONArrayOptJSONArray3.length() > 0) {
                this.LIZ.LJJLIIIJJI = new int[jSONArrayOptJSONArray3.length()];
                for (int i15 = 0; i15 < jSONArrayOptJSONArray3.length(); i15++) {
                    this.LIZ.LJJLIIIJJI[i15] = jSONArrayOptJSONArray3.optInt(i15);
                }
            }
            if (jSONObject.has("subtitle_infos") && (jSONArrayOptJSONArray2 = jSONObject.optJSONArray("subtitle_infos")) != null && jSONArrayOptJSONArray2.length() > 0) {
                this.LIZ.LJJIL = new ArrayList();
                for (int i16 = 0; i16 < jSONArrayOptJSONArray2.length(); i16++) {
                    C1469130oKl c1469130oKl3 = new C1469130oKl();
                    c1469130oKl3.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray2, i16));
                    ((ArrayList) this.LIZ.LJJIL).add(c1469130oKl3);
                }
            }
            this.LIZ.LJIILLIIL = jSONObject.optBoolean("has_embedded_subtitle");
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("depth_estimation");
            if (jSONObjectOptJSONObject7 != null) {
                this.LIZ.LJJIZ = (float) jSONObjectOptJSONObject7.optDouble("const_depth");
            }
            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("subtitle_position");
            if (jSONObjectOptJSONObject8 != null) {
                this.LIZ.LJJJ = (float) jSONObjectOptJSONObject8.optDouble("x");
                this.LIZ.LJJJI = (float) jSONObjectOptJSONObject8.optDouble("y");
            }
            C1473400oRe c1473400oRe30 = this.LIZ;
            if (c1473400oRe30.LIZ == 1) {
                JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("video_list");
                if (jSONObjectOptJSONObject9 != null) {
                    this.LIZ.LJJIII = new ArrayList();
                    String[] strArr = {"video_1", "video_2", "video_3", "video_4", "video_5", "video_6", "video_7", "video_8"};
                    int i17 = 0;
                    i = 0;
                    do {
                        String str14 = strArr[i17];
                        if (jSONObjectOptJSONObject9.has(str14)) {
                            C1473400oRe c1473400oRe31 = this.LIZ;
                            JSONObject jSONObject5 = JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject9, str14);
                            C1473400oRe c1473400oRe32 = this.LIZ;
                            int i18 = c1473400oRe32.LJJJJL;
                            if (c1473400oRe32.LJJJJIZL) {
                                str9 = c1473400oRe32.LJJJJ;
                            } else {
                                str9 = null;
                            }
                            C1474520oTS c1474520oTSLIZIZ3 = c1473400oRe31.LIZIZ(i18, str9, jSONObject5);
                            C1473400oRe c1473400oRe33 = this.LIZ;
                            c1474520oTSLIZIZ3.LJJIIJZLJL = c1473400oRe33.LJJIJIL;
                            c1474520oTSLIZIZ3.LJJJJJ = i;
                            ((ArrayList) c1473400oRe33.LJJIII).add(c1474520oTSLIZIZ3);
                            i++;
                        }
                        i17++;
                    } while (i17 < 8);
                } else {
                    i = 0;
                }
            } else {
                c1473400oRe30.LJJIII = new ArrayList();
                JSONArray jSONArrayOptJSONArray9 = jSONObject.optJSONArray("video_list");
                if (jSONArrayOptJSONArray9 != null && jSONArrayOptJSONArray9.length() > 0) {
                    int i19 = 0;
                    i = 0;
                    while (i19 < jSONArrayOptJSONArray9.length()) {
                        C1473400oRe c1473400oRe34 = this.LIZ;
                        JSONObject jSONObject6 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray9, i19);
                        C1473400oRe c1473400oRe35 = this.LIZ;
                        int i20 = c1473400oRe35.LJJJJL;
                        if (c1473400oRe35.LJJJJIZL) {
                            str2 = c1473400oRe35.LJJJJ;
                        } else {
                            str2 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ4 = c1473400oRe34.LIZIZ(i20, str2, jSONObject6);
                        c1474520oTSLIZIZ4.LJJJJJ = i;
                        ((ArrayList) this.LIZ.LJJIII).add(c1474520oTSLIZIZ4);
                        i19++;
                        i++;
                    }
                } else {
                    i = 0;
                }
            }
            this.LIZ.LJJJJLI = jSONObject.optJSONObject("dns_info");
            this.LIZ.LJJJJLL = jSONObject.optLong("dns_time");
            JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("dynamic_video");
            if (jSONObjectOptJSONObject10 != null) {
                C1473400oRe c1473400oRe36 = this.LIZ;
                if (c1473400oRe36.LIZ == 1) {
                    String strOptString6 = jSONObjectOptJSONObject10.optString("main_url");
                    if (!TextUtils.isEmpty(strOptString6)) {
                        C1473400oRe c1473400oRe37 = this.LIZ;
                        if (c1473400oRe37.LJJJJIZL) {
                            str8 = c1473400oRe37.LJJJJ;
                        } else {
                            str8 = null;
                        }
                        c1473400oRe37.LJJIIZI = C795730VJj.LIZJ(strOptString6, str8);
                    }
                    String strOptString7 = jSONObjectOptJSONObject10.optString("backup_url_1");
                    if (!TextUtils.isEmpty(strOptString7)) {
                        C1473400oRe c1473400oRe38 = this.LIZ;
                        if (c1473400oRe38.LJJJJIZL) {
                            str7 = c1473400oRe38.LJJJJ;
                        } else {
                            str7 = null;
                        }
                        c1473400oRe38.LJJIJ = C795730VJj.LIZJ(strOptString7, str7);
                    }
                } else {
                    c1473400oRe36.LJJIIZI = jSONObjectOptJSONObject10.optString("main_url");
                    this.LIZ.LJJIJ = jSONObjectOptJSONObject10.optString("backup_url");
                }
                this.LIZ.LJI = jSONObjectOptJSONObject10.optString("dynamic_type");
                this.LIZ.LJJIIJ = new ArrayList();
                JSONArray jSONArrayOptJSONArray10 = jSONObjectOptJSONObject10.optJSONArray("dynamic_video_list");
                if (jSONArrayOptJSONArray10 != null && jSONArrayOptJSONArray10.length() > 0) {
                    int i21 = 0;
                    while (i21 < jSONArrayOptJSONArray10.length()) {
                        C1473400oRe c1473400oRe39 = this.LIZ;
                        JSONObject jSONObject7 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray10, i21);
                        C1473400oRe c1473400oRe40 = this.LIZ;
                        if (c1473400oRe40.LJJJJIZL) {
                            str6 = c1473400oRe40.LJJJJ;
                        } else {
                            str6 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ5 = c1473400oRe39.LIZIZ(0, str6, jSONObject7);
                        c1474520oTSLIZIZ5.LJJJJJ = i;
                        ((ArrayList) this.LIZ.LJJIIJ).add(c1474520oTSLIZIZ5);
                        i21++;
                        i++;
                    }
                }
                JSONArray jSONArrayOptJSONArray11 = jSONObjectOptJSONObject10.optJSONArray("dynamic_dubbed_audios");
                if (jSONArrayOptJSONArray11 != null && jSONArrayOptJSONArray11.length() > 0) {
                    this.LIZ.LJJIIJZLJL = new ArrayList();
                    int i22 = 0;
                    z = false;
                    while (i22 < jSONArrayOptJSONArray11.length()) {
                        C1473400oRe c1473400oRe41 = this.LIZ;
                        JSONObject jSONObject8 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray11, i22);
                        C1473400oRe c1473400oRe42 = this.LIZ;
                        if (c1473400oRe42.LJJJJIZL) {
                            str5 = c1473400oRe42.LJJJJ;
                        } else {
                            str5 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ6 = c1473400oRe41.LIZIZ(1, str5, jSONObject8);
                        c1474520oTSLIZIZ6.LJJJJJ = i;
                        ((ArrayList) this.LIZ.LJJIIJ).add(c1474520oTSLIZIZ6);
                        ((ArrayList) this.LIZ.LJJIIJZLJL).add(c1474520oTSLIZIZ6);
                        i22++;
                        i++;
                        z = true;
                    }
                } else {
                    z = false;
                }
                JSONArray jSONArrayOptJSONArray12 = jSONObjectOptJSONObject10.optJSONArray("dynamic_audio_list");
                if (jSONArrayOptJSONArray12 != null && jSONArrayOptJSONArray12.length() > 0) {
                    this.LIZ.LJJIIZ = new ArrayList();
                    int i23 = Integer.MAX_VALUE;
                    int i24 = 0;
                    while (i24 < jSONArrayOptJSONArray12.length()) {
                        C1473400oRe c1473400oRe43 = this.LIZ;
                        JSONObject jSONObject9 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray12, i24);
                        C1473400oRe c1473400oRe44 = this.LIZ;
                        if (c1473400oRe44.LJJJJIZL) {
                            str4 = c1473400oRe44.LJJJJ;
                        } else {
                            str4 = null;
                        }
                        C1474520oTS c1474520oTSLIZIZ7 = c1473400oRe43.LIZIZ(1, str4, jSONObject9);
                        int i25 = i + 1;
                        c1474520oTSLIZIZ7.LJJJJJ = i;
                        if (z && i23 > (i2 = c1474520oTSLIZIZ7.LJIILL)) {
                            this.LIZ.LJIIZILJ[1] = i;
                            i23 = i2;
                        }
                        ((ArrayList) this.LIZ.LJJIIJ).add(c1474520oTSLIZIZ7);
                        ((ArrayList) this.LIZ.LJJIIZ).add(c1474520oTSLIZIZ7);
                        i24++;
                        i = i25;
                    }
                }
                if (((ArrayList) this.LIZ.LJJIIJ).size() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    if (!TextUtils.isEmpty(this.LIZ.LJJIIZI)) {
                        arrayList3.add(this.LIZ.LJJIIZI);
                    }
                    if (!TextUtils.isEmpty(this.LIZ.LJJIJ)) {
                        arrayList3.add(this.LIZ.LJJIJ);
                    }
                    this.LIZ.LJJIJIIJI = new String[arrayList3.size()];
                    arrayList3.toArray(this.LIZ.LJJIJIIJI);
                }
            }
            if (jSONObject.has("barrage_mask_info")) {
                C1473400oRe c1473400oRe45 = this.LIZ;
                C1471650oOp c1471650oOp3 = new C1471650oOp();
                c1473400oRe45.LJJIJL = c1471650oOp3;
                c1471650oOp3.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "barrage_mask_info"));
                C1473400oRe c1473400oRe46 = this.LIZ;
                if (c1473400oRe46.LIZ == 1) {
                    String strLJFF2 = c1473400oRe46.LJJIJL.LJFF(1);
                    if (!TextUtils.isEmpty(strLJFF2)) {
                        C1473400oRe c1473400oRe47 = this.LIZ;
                        if (c1473400oRe47.LJJJJIZL) {
                            str3 = c1473400oRe47.LJJJJ;
                        } else {
                            str3 = null;
                        }
                        c1473400oRe47.LJLIL = C795730VJj.LIZJ(strLJFF2, str3);
                    }
                } else {
                    c1473400oRe46.LJLIL = c1473400oRe46.LJJIJL.LJFF(1);
                }
                C1473400oRe c1473400oRe48 = this.LIZ;
                c1473400oRe48.LJLJJL = c1473400oRe48.LJJIJL.LIZLLL(7);
                C1473400oRe c1473400oRe49 = this.LIZ;
                c1473400oRe49.LJLJJI = c1473400oRe49.LJJIJL.LJFF(3);
                C1473400oRe c1473400oRe50 = this.LIZ;
                c1473400oRe50.LJLJJLL = c1473400oRe50.LJJIJL.LJ();
            }
            if (jSONObject.has("seek_ts")) {
                this.LIZ.getClass();
                C801580VcS.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "seek_ts"));
            }
            if (jSONObject.has("big_thumbs") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("big_thumbs")) != null && jSONArrayOptJSONArray.length() > 0) {
                this.LIZ.LJJIJLIJ = new ArrayList();
                for (int i26 = 0; i26 < jSONArrayOptJSONArray.length(); i26++) {
                    C1473440oRi c1473440oRi3 = new C1473440oRi();
                    c1473440oRi3.LIZLLL = this.LIZ.LIZ;
                    c1473440oRi3.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i26));
                    ((ArrayList) this.LIZ.LJJIJLIJ).add(c1473440oRi3);
                }
            }
            if (jSONObject.has("volume") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("volume")) != null) {
                if (jSONObjectOptJSONObject.has("loudness") || jSONObjectOptJSONObject.has("peak")) {
                    this.LIZ.LJJJJZI = (float) jSONObjectOptJSONObject.optDouble("loudness");
                    this.LIZ.LJJJLIIL = (float) jSONObjectOptJSONObject.optDouble("peak");
                }
                if (jSONObjectOptJSONObject.has("version")) {
                    this.LIZ.LJJLIIIIJ = jSONObjectOptJSONObject.optInt("version");
                }
                if (jSONObjectOptJSONObject.has("loudness_range")) {
                    this.LIZ.LJJJLL = (float) jSONObjectOptJSONObject.optDouble("loudness_range");
                }
                if (jSONObjectOptJSONObject.has("loudness_range_start")) {
                    this.LIZ.LJJJLZIJ = (float) jSONObjectOptJSONObject.optDouble("loudness_range_start");
                }
                if (jSONObjectOptJSONObject.has("loudness_range_end")) {
                    this.LIZ.LJJJZ = (float) jSONObjectOptJSONObject.optDouble("loudness_range_end");
                }
                if (jSONObjectOptJSONObject.has("maximum_momentary_loudness")) {
                    this.LIZ.LJJL = (float) jSONObjectOptJSONObject.optDouble("maximum_momentary_loudness");
                }
                if (jSONObjectOptJSONObject.has("maximum_short_term_loudness")) {
                    this.LIZ.LJJLI = (float) jSONObjectOptJSONObject.optDouble("maximum_short_term_loudness");
                }
                if (jSONObjectOptJSONObject.has("volume_info_json")) {
                    this.LIZ.LJJLIIIJ = jSONObjectOptJSONObject.optString("volume_info_json");
                }
            }
            this.LIZ.LJJLIIIJILLIZJL = jSONObject.optString("full_screen_strategy");
            if (jSONObject.has("video_style")) {
                C1473400oRe c1473400oRe51 = this.LIZ;
                C1468490oJj c1468490oJj = new C1468490oJj();
                c1473400oRe51.LJJLIIIJJIZ = c1468490oJj;
                c1468490oJj.LIZ(jSONObject.optJSONObject("video_style"));
            }
            if (jSONObject.has("pallas_vid_labels")) {
                this.LIZ.LJJLIIIJLJLI = jSONObject.optString("pallas_vid_labels");
            }
            if (jSONObject.has("pallas_did_labels")) {
                this.LIZ.LJJLIIIJLLLLLLLZ = jSONObject.optString("pallas_did_labels");
            }
        }
        List<C1474520oTS> listLJIIJ = this.LIZ.LJIIJ();
        if (listLJIIJ != null && listLJIIJ.size() > 0) {
            Iterator<C1474520oTS> it2 = listLJIIJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1474520oTS next = it2.next();
                if (next.LJFF() == 0) {
                    C1473400oRe c1473400oRe52 = this.LIZ;
                    c1473400oRe52.LJL = 0;
                    c1473400oRe52.LJJJJL = 0;
                    break;
                } else if (next.LJFF() == 1) {
                    C1473400oRe c1473400oRe53 = this.LIZ;
                    c1473400oRe53.LJL = 1;
                    c1473400oRe53.LJJJJL = 1;
                }
            }
        }
        if (jSONObject.has("did_profile_labels")) {
            this.LIZ.LJLL = jSONObject.optString("did_profile_labels");
        }
        if (jSONObject.has("vid_profile_labels")) {
            this.LIZ.LJLLI = jSONObject.optString("vid_profile_labels");
        }
        if (jSONObject.has("trans_params")) {
            this.LIZ.LJLLILLLL = jSONObject.optString("trans_params");
        }
        C1473400oRe c1473400oRe54 = this.LIZ;
        c1473400oRe54.LJIIIIZZ = c1473400oRe54.LJIIL();
        C1473400oRe c1473400oRe55 = this.LIZ;
        c1473400oRe55.LIZIZ = new EnumC2281151EQn[c1473400oRe55.LIZJ.size()];
        C1473400oRe c1473400oRe56 = this.LIZ;
        c1473400oRe56.LIZJ.toArray(c1473400oRe56.LIZIZ);
        C1473400oRe c1473400oRe57 = this.LIZ;
        c1473400oRe57.LJ = new String[c1473400oRe57.LIZLLL.size()];
        C1473400oRe c1473400oRe58 = this.LIZ;
        c1473400oRe58.LIZLLL.toArray(c1473400oRe58.LJ);
        if (TextUtils.isEmpty(this.LIZ.LJJLIIJ)) {
            C1473400oRe c1473400oRe59 = this.LIZ;
            c1473400oRe59.LJJLIIJ = c1473400oRe59.LJIIIIZZ(2);
        }
    }
}
