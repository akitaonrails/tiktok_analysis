package X;

import android.app.Activity;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.topic.movie.IMovieTokService;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0O4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613440O4g implements InterfaceC21285318Rn {
    public static boolean LJIIIIZZ;
    public Boolean LIZIZ;
    public int LJ;
    public final IMovieTokService<?, ?, ?> LIZ = MovieTokServiceImpl.LJ();
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";

    @Override // X.InterfaceC21284718Rh
    public final void LIZIZ() {
        LJIIIIZZ = false;
    }

    @Override // X.InterfaceC21285318Rn
    public final boolean LIZ(AnchorCommonStruct anchorCommonStruct) {
        String extra = null;
        if (anchorCommonStruct != null) {
            extra = anchorCommonStruct.getExtra();
        }
        boolean zOptBoolean = false;
        if (extra == null || extra.length() == 0) {
            return false;
        }
        if (anchorCommonStruct != null) {
            try {
                String extra2 = anchorCommonStruct.getExtra();
                if (extra2 != null) {
                    zOptBoolean = new JSONObject(extra2).optBoolean("is_collected", false);
                    return zOptBoolean;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LIZLLL("topic", e);
            }
        }
        return zOptBoolean;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LIZLLL(Aweme aweme) {
        LJIIZILJ(aweme);
    }

    @Override // X.InterfaceC1067170dsR
    public final void LJII(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
            this.LJII = anchorCommonStruct.getExtra();
        }
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel("tiktok_ogc_promotion_lynx")))), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIIIZZ(C0O4M c0o4m) {
        if (c0o4m != null) {
            C0O4L.LIZJ(C0O4K.MOVIE, c0o4m);
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIILIIL(C0O4M c0o4m) {
        if (c0o4m != null) {
            C0O4L.LIZ(C0O4K.MOVIE, c0o4m);
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final String LJIILJJIL(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct != null) {
            try {
                String extra = anchorCommonStruct.getExtra();
                if (extra == null || extra.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return new JSONObject(anchorCommonStruct.getExtra()).optString("third_id", "");
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    @Override // X.InterfaceC21284718Rh
    public final Boolean LJIILLIIL(String str) {
        if (str != null) {
            return C0O4L.LIZIZ(C0O4K.MOVIE, str);
        }
        return null;
    }

    public final void LJIIZILJ(Aweme aweme) {
        ArrayList arrayList;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        List<AnchorCommonStruct> anchors;
        int size = 0;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        } else {
            arrayList = null;
        }
        this.LJFF = aweme.getGroupId();
        if (arrayList != null) {
            size = arrayList.size();
        }
        this.LJ = size;
        String str = "";
        if (arrayList == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(901), 30)) == null) {
            strLJJLIIIJ = "";
        }
        this.LIZJ = strLJJLIIIJ;
        if (arrayList == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(902), 31)) == null) {
            strLJJLIIIJ2 = "";
        }
        this.LIZLLL = strLJJLIIIJ2;
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null && (strLJJLIIIJ3 = C13LP.LJJLIIIJ(anchors2, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(903), 31)) != null) {
            str = strLJJLIIIJ3;
        }
        this.LJI = str;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJFF(Aweme aweme, boolean z) {
        String str;
        if (aweme != null) {
            LJIIZILJ(aweme);
        }
        if (!LJIIIIZZ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z) {
                str = "movies";
            } else {
                str = "links";
            }
            c2344009Gk.LJIIIIZZ("panel_type", str);
            c2344009Gk.LIZJ(this.LJ, "movie_num");
            c2344009Gk.LJIIIIZZ("group_id", this.LJFF);
            c2344009Gk.LJIIIIZZ("movie_id", this.LIZJ);
            c2344009Gk.LJIIIIZZ("movie_title", this.LIZLLL);
            C20684815ws.LJIILLIIL("movie_panel_show", c2344009Gk.LIZ);
            LJIIIIZZ = true;
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIL(Boolean bool, String str) {
        if (str != null && bool != null) {
            bool.booleanValue();
            C0O4L.LIZLLL(C0O4K.MOVIE, str, bool.booleanValue());
        }
    }

    public static final void LJIJ(AnchorCommonStruct anchorCommonStruct, String str, boolean z) {
        Integer numValueOf;
        Double dValueOf;
        String str2 = "";
        if (anchorCommonStruct != null) {
            try {
                String extra = anchorCommonStruct.getExtra();
                if (extra != null && extra.length() != 0) {
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                    String strOptString = jSONObject.optString("third_id", "");
                    String keyword = anchorCommonStruct.getKeyword();
                    if (keyword != null) {
                        str2 = keyword;
                    }
                    String strOptString2 = jSONObject.optString("title", str2);
                    UrlModel thumbnail = anchorCommonStruct.getThumbnail();
                    int iOptInt = jSONObject.optInt("year", -1);
                    if (iOptInt <= 0) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(iOptInt);
                    }
                    double dOptDouble = jSONObject.optDouble("imdb_rating", -1.0d);
                    if (dOptDouble <= 0.0d) {
                        dValueOf = null;
                    } else {
                        dValueOf = Double.valueOf(dOptDouble);
                    }
                    C1440005kM.LIZ(new C613490O4l(new MovieDetail(strOptString, strOptString2, numValueOf, dValueOf, null, thumbnail, null).LIZ(), z));
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LIZJ(C2344009Gk c2344009Gk, String str, Aweme aweme) {
        String authorUid;
        String aid;
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", this.LJI);
        c2344009Gk.LIZJ(this.LJ, "movie_num");
        c2344009Gk.LJIIIIZZ("movie_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("movie_title", this.LIZLLL);
        return c2344009Gk;
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LJ(C2344009Gk c2344009Gk, String str, Aweme aweme) {
        String authorUid;
        String aid;
        if (aweme != null) {
            LJIIZILJ(aweme);
        }
        if (c2344009Gk == null) {
            c2344009Gk = new C2344009Gk();
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", this.LJI);
        c2344009Gk.LIZJ(this.LJ, "movie_num");
        c2344009Gk.LJIIIIZZ("movie_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("movie_title", this.LIZLLL);
        return c2344009Gk;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIJ(String str, Aweme aweme, AnchorCommonStruct anchorCommonStruct) {
        String authorUid;
        String aid;
        String keyword;
        if (aweme != null) {
            LJIIZILJ(aweme);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String logExtra = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("group_id", this.LJFF);
        c2344009Gk.LJIIIIZZ("movie_id", LJIILJJIL(anchorCommonStruct));
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        } else {
            keyword = null;
        }
        c2344009Gk.LJIIIIZZ("movie_title", keyword);
        if (anchorCommonStruct != null) {
            logExtra = anchorCommonStruct.getLogExtra();
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(logExtra);
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
        c2344009Gk.LJIIIIZZ("category", "movie");
        C20684815ws.LJIILLIIL("enter_topic_detail", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIILL(AnchorCommonStruct anchorCommonStruct, String str, boolean z) {
        InterfaceC346201Wa interfaceC346201WaLIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.valueOf(z);
        }
        if (!z) {
            interfaceC346201WaLIZ = this.LIZ.LIZLLL(str);
        } else {
            interfaceC346201WaLIZ = this.LIZ.LIZ(str);
        }
        C23250099c.LIZLLL(c054gLIZ, null, null, new C613070O2v(interfaceC346201WaLIZ, this, str, !z, anchorCommonStruct, null), 3);
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIJJI(Activity activity, AnchorCommonStruct anchorCommonStruct, String str, C2344009Gk c2344009Gk) {
        boolean z;
        String str2;
        String str3;
        String str4;
        Map<String, String> map;
        String str5;
        Map<String, String> map2;
        Map<String, String> map3;
        String str6;
        Map<String, String> map4;
        Map<String, String> map5;
        C327850CtD.LIZIZ("movie_detail_page");
        SparkContext sparkContext = new SparkContext();
        String strLIZIZ = null;
        if (anchorCommonStruct != null) {
            strLIZIZ = anchorCommonStruct.getSchema();
        }
        int i = 0;
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!Boolean.valueOf(true ^ z).booleanValue() || strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("//topic/movie?movie_id=");
            sbLIZ.append(LJIILJJIL(anchorCommonStruct));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sparkContext.LJJLIIJ(strLIZIZ);
        String str7 = "";
        if (c2344009Gk == null || (map5 = c2344009Gk.LIZ) == null || (str2 = (String) ((HashMap) map5).get("anchor_id")) == null) {
            str2 = "";
        }
        sparkContext.LJJJZ("anchor_id", str2);
        if (str == null) {
            str = "";
        }
        sparkContext.LJJJZ("enter_from", str);
        if (c2344009Gk == null || (map4 = c2344009Gk.LIZ) == null || (str3 = (String) ((HashMap) map4).get("author_id")) == null) {
            str3 = "";
        }
        sparkContext.LJJJZ("author_id", str3);
        if (c2344009Gk != null && (map3 = c2344009Gk.LIZ) != null && (str6 = (String) ((HashMap) map3).get("multi_anchor")) != null) {
            i = CastIntegerProtector.parseInt(str6);
        }
        sparkContext.LJJJLZIJ(i, "multi_anchor");
        if (c2344009Gk == null || (map2 = c2344009Gk.LIZ) == null || (str4 = (String) ((HashMap) map2).get("click_method")) == null) {
            str4 = "";
        }
        sparkContext.LJJJZ("click_method", str4);
        if (c2344009Gk != null && (map = c2344009Gk.LIZ) != null && (str5 = (String) ((HashMap) map).get("group_id")) != null) {
            str7 = str5;
        }
        sparkContext.LJJJZ("from_group_id", str7);
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0O4h
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                HashMap map6 = new HashMap();
                map6.put("copyright_promotion_entity_info", this.LLILLJJLI.LJII);
                interfaceC1531560pxS.LIZLLL(map6);
            }
        });
        C1541950qED.LIZJ.getClass();
        new C1541950qED(activity, sparkContext).LIZIZ();
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LJI(C2344009Gk c2344009Gk, String str, Aweme aweme, String str2, AnchorCommonStruct anchorCommonStruct) {
        String keyword;
        String authorUid;
        String aid;
        if (c2344009Gk == null) {
            c2344009Gk = new C2344009Gk();
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        } else {
            keyword = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_entry", keyword);
        String str3 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("click_type", "app_page");
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", "movie");
        c2344009Gk.LIZJ(this.LJ, "movie_num");
        c2344009Gk.LJIIIIZZ("movie_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("movie_title", this.LIZLLL);
        C1E95 c1e95 = C1E95.LIZIZ;
        if (c1e95.LJIILL()) {
            c2344009Gk.LIZJ(c1e95.LJJIFFI(C735370Ssx.LIZJ(aweme)), "spammy_tag_cnt");
        }
        return c2344009Gk;
    }
}
