package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS109S0100000_9;
import android.text.TextUtils;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721190SQr {
    public static final C721190SQr LIZ = new C721190SQr();

    public static int LJIILJJIL(Aweme aweme) {
        if (aweme != null && !TextUtils.isEmpty(aweme.getDesc())) {
            return C0SUV.LIZ(aweme.getDesc()).length();
        }
        return 0;
    }

    @InterfaceC1294060jmO
    public static void LJIL(C0SRL c0srl) {
        Aweme aweme;
        int i;
        String str;
        if (c0srl != null && (aweme = c0srl.LIZJ) != null) {
            FullPageParam fullPageParam = new FullPageParam(aweme, c0srl.LJII, new ArrayList(), false);
            fullPageParam.setIsEnterGraphicDetail(c0srl.LJIIL.NR());
            C735740StY c735740StY = new C735740StY();
            c735740StY.LJJLIIIJLLLLLLLZ = "click";
            Aweme aweme2 = fullPageParam.getAweme();
            PostModeDetailParams postModeDetailParams = fullPageParam.getPostModeDetailParams();
            if (postModeDetailParams != null) {
                i = postModeDetailParams.pageType;
            } else {
                i = 0;
            }
            c735740StY.LJJIJIL(i, aweme2);
            PostModeDetailParams postModeDetailParams2 = fullPageParam.getPostModeDetailParams();
            if (postModeDetailParams2 == null || (str = postModeDetailParams2.eventType) == null) {
                str = "";
            }
            c735740StY.LJJLIIIJ = str;
            c735740StY.LJJLIIIJL = "graphic_detail";
            c735740StY.LJIILJJIL();
        }
    }

    public static void LJJI(Runnable runnable) {
        if (C0RR4.LIZ().enable && C0RR4.LIZ().optAsyncReportMob) {
            C20684815ws.LJFF().execute(new ARunnableS109S0100000_9(runnable, 82));
        } else {
            runnable.run();
        }
    }

    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String authorUid;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJFF("author_id", authorUid);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        Integer numValueOf;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
    }

    public static void LIZJ(C2344009Gk c2344009Gk, PostModeDetailParams postModeDetailParams) {
        String str;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        c2344009Gk.LJFF("enter_from", str);
    }

    public static void LIZLLL(C721190SQr c721190SQr, C2344009Gk c2344009Gk) {
        c721190SQr.getClass();
        c2344009Gk.LJFF("from_page", "graphic_detail");
    }

    public static void LJ(C2344009Gk c2344009Gk, Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJFF("group_id", aid);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C2344009Gk r2, com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            if (r3 == 0) goto L15
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r3.getPhotoModeImageInfo()
            if (r0 == 0) goto L15
            boolean r0 = r0.hasTitle()
            r1 = 1
            if (r0 != r1) goto L15
        Lf:
            java.lang.String r0 = "has_title"
            r2.LIZJ(r1, r0)
            return
        L15:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721190SQr.LJFF(X.09Gk, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LJI(C2344009Gk c2344009Gk, Aweme aweme) {
        if (aweme != null) {
            if (C720360SNm.LJI(aweme) || C720360SNm.LJIIJJI(aweme)) {
                c2344009Gk.LJFF("is_text_mode", "1");
            }
            if (C720360SNm.LJIIJJI(aweme)) {
                c2344009Gk.LJFF("is_text_trans_pic", "1");
            }
            if (C720360SNm.LJFF(aweme)) {
                c2344009Gk.LJFF("is_comment_to_post", "1");
            }
        }
    }

    public static void LJII(C2344009Gk c2344009Gk, Aweme aweme) {
        String strLIZIZ;
        if (aweme != null && (strLIZIZ = C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme))) != null) {
            c2344009Gk.LJFF("log_pb", strLIZIZ);
        }
    }

    public static void LJIIIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        if (aweme != null && C123100dR.LIZ(C1381730m3n.LIZ(aweme))) {
            c2344009Gk.LJFF("photo_content_type", C1381730m3n.LIZ(aweme));
        }
    }

    public static void LJIIJ(C2344009Gk c2344009Gk, Aweme aweme) {
        Integer numValueOf;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf = Integer.valueOf(imageList.size());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "pic_cnt");
    }

    public static void LJIIJJI(C2344009Gk c2344009Gk, Integer num) {
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue() + 1, "pic_location");
        }
    }

    public static void LJIIL(C2344009Gk c2344009Gk, Aweme aweme) {
        String strLJIJJ;
        if (aweme != null && (strLJIJJ = C735370Ssx.LJIJJ(aweme)) != null) {
            c2344009Gk.LJFF("request_id", strLJIJJ);
        }
    }

    public static void LJIIIIZZ(Object obj, String str, Object obj2) throws JSONException {
        if (obj instanceof AbstractC1386130mAt) {
            LJIILIIL((AbstractC1386130mAt) obj, str, obj2);
            return;
        }
        if (obj instanceof C2241008qG) {
            C2241008qG c2241008qG = (C2241008qG) obj;
            if (obj2 instanceof String) {
                c2241008qG.LIZLLL(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                c2241008qG.LIZIZ((Integer) obj2, str);
                return;
            }
            if (obj2 instanceof Boolean) {
                c2241008qG.LIZ((Boolean) obj2, str);
                return;
            }
            if (obj2 instanceof Long) {
                c2241008qG.LIZJ((Long) obj2, str);
                return;
            } else if (obj2 instanceof Float) {
                c2241008qG.LIZ.put(str, obj2);
                return;
            } else {
                if (!(obj2 instanceof Double)) {
                    return;
                }
                c2241008qG.LIZ.put(str, obj2);
                return;
            }
        }
        if (obj instanceof C0LAB) {
            ((C0LAB) obj).LIZLLL(obj2, str);
        } else if (obj instanceof C2344009Gk) {
            ((C2344009Gk) obj).LJ(obj2, str);
        } else {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            ((JSONObject) obj).put(str, obj2);
        }
    }

    public static void LJIILIIL(AbstractC1386130mAt abstractC1386130mAt, String str, Object obj) {
        if (obj instanceof String) {
            abstractC1386130mAt.LJ(str, (String) obj);
        } else if (obj instanceof Integer) {
            abstractC1386130mAt.LIZLLL(((Number) obj).intValue(), str);
        } else {
            if (!(obj instanceof Boolean)) {
                return;
            }
            abstractC1386130mAt.LJI(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(java.lang.String r5, X.C19EG r6, com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam r7) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.getAweme()
            if (r4 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.model.PostModeDetailParams r2 = r7.getPostModeDetailParams()
            if (r2 != 0) goto Le
            return
        Le:
            X.0m62 r3 = new X.0m62
            r3.<init>()
            r3.LJIJI(r4)
            r3.LJJIJL(r6)
            java.lang.String r0 = r2.exploreFromGroupId
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
        L1f:
            r3.LJJLIIIJJIZ = r0
            java.lang.String r0 = r2.eventType
            r3.LIZLLL = r0
            java.lang.String r0 = r2.enterMethod
            r3.LJJLIIIJILLIZJL = r0
            X.C729980SkG.LJII(r4)
            java.lang.String r0 = r4.getAid()
            r3.LJJLIIIJL = r0
            r3.LJJLIIIJLLLLLLLZ = r5
            java.lang.String r0 = r2.previousPage
            r3.LJJLJLI = r0
            X.1An6 r0 = X.C0SUC.LIZ(r6)
            java.lang.String r0 = r0.getPreviousPagePosition()
            r3.LJJLL = r0
            int r0 = r2.pageType
            java.lang.String r0 = X.C735370Ssx.LJIILJJIL(r0, r4)
            r3.LJIJ = r0
            int r0 = r2.pageType
            java.lang.String r1 = X.C735370Ssx.LJIJ(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L58
            r3.LJJLIIJ = r1
        L58:
            X.1An6 r0 = X.C0SUC.LIZ(r6)
            java.lang.String r0 = r0.getSearchId()
            r3.LJJIJLIJ = r0
            X.1An6 r0 = X.C0SUC.LIZ(r6)
            java.lang.String r0 = r0.getCategoryName()
            r3.LJLILLLLZI = r0
            java.lang.String r0 = "graphic_detail"
            r3.LJLJI = r0
            X.C735370Ssx.LIZJ(r4)
            X.C1348720lCY.LIZ(r4, r3)
            java.lang.String r1 = "aweme_type"
            int r0 = r4.getAwemeType()
            r3.LIZLLL(r0, r1)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r4.getPhotoModeImageInfo()
            if (r0 == 0) goto Lbd
            boolean r0 = r0.hasTitle()
            r1 = 1
            if (r0 != r1) goto Lbd
        L8c:
            java.lang.String r0 = "has_title"
            r3.LIZLLL(r1, r0)
            X.1ER1 r1 = X.C1ER1.LIZIZ
            java.lang.String r0 = r2.eventType
            java.util.Map r0 = r1.I(r4, r0)
            r3.LIZIZ(r0)
            java.lang.String r2 = r2.eventType
            r1 = 0
            java.lang.String r0 = "enter_music_detail"
            java.util.Map r0 = X.C666580QCq.LIZIZ(r4, r0, r2, r1)
            r3.LIZIZ(r0)
            X.1EE2 r0 = X.C1EE2.LIZIZ
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto Lb9
            java.lang.String r1 = "is_enter_graphic_detail"
            int r0 = r7.isEnterGraphicDetail()
            r3.LIZLLL(r0, r1)
        Lb9:
            r3.LJIILJJIL()
            return
        Lbd:
            r1 = 0
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721190SQr.LJIIZILJ(java.lang.String, X.19EG, com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam):void");
    }

    public static void LJIJI(Aweme aweme, PostModeDetailParams postModeDetailParams, String str) {
        String value;
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (postModeDetailParams != null && (postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) != null) {
            value = postModeEntranceMechanism.getValue();
        } else {
            value = null;
        }
        LIZJ(c2344009Gk, postModeDetailParams);
        LIZIZ(c2344009Gk, aweme);
        c2344009Gk.LJFF("enter_method", value);
        LJ(c2344009Gk, aweme);
        LIZ(c2344009Gk, aweme);
        LJII(c2344009Gk, aweme);
        LJIIJ(c2344009Gk, aweme);
        c2344009Gk.LJFF("event_element", str);
        LJJI(new ARunnableS109S0100000_9(c2344009Gk, 80));
    }

    public static void LJJ(Aweme aweme, PostModeDetailParams postModeDetailParams, String str, String str2) {
        String value;
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZJ(c2344009Gk, postModeDetailParams);
        LJIIJ(c2344009Gk, aweme);
        if (postModeDetailParams == null || (((postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) == null || (value = postModeEntranceMechanism.getValue()) == null) && (value = postModeDetailParams.enterMethod) == null)) {
            value = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aweme.getGroupId());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("enter_method", value);
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LJIIIIZZ("slide_to_status", str2);
        c2344009Gk.LJFF("slide_from_status", str);
        LJII(c2344009Gk, aweme);
        LJIIL(c2344009Gk, aweme);
        LJJI(new RunnableC514801zW(c2344009Gk, 61));
    }

    public final void LJIILLIIL(Aweme aweme, String str, String str2, C830490Whz c830490Whz) {
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        c2344009Gk.LJIIIIZZ("enter_method", "click_fav_button");
        c2344009Gk.LJ(Integer.valueOf(aweme.getAwemeType()), "aweme_type");
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c2344009Gk.LJII(C1ER1.LIZIZ.I(aweme, str));
        c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        C1366720lfa.LIZIZ(aweme, c2344009Gk, str, str2);
        C15WT.LIZIZ.LJFF(c2344009Gk, str, str2, aweme.getAid());
        LIZLLL(this, c2344009Gk);
        LJIIL(c2344009Gk, aweme);
        LJI(c2344009Gk, aweme);
        if (c830490Whz != null) {
            for (Map.Entry entry : c830490Whz.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        LJJI(new ARunnableS103S0100000_3(c2344009Gk, 57));
    }

    public final void LJIJ(Aweme aweme, String str, PostModeDetailParams postModeDetailParams, int i, C830490Whz c830490Whz) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(aweme.getAuthor()));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        c2344009Gk.LJIIIIZZ("enter_method", "click_fav_button");
        c2344009Gk.LJ(Integer.valueOf(aweme.getAwemeType()), "aweme_type");
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c2344009Gk.LJ(Boolean.valueOf(AwemeBizExtKt.isHighlighted(aweme)), "is_highlighted");
        c2344009Gk.LJ(Integer.valueOf(AwemeBizExtKt.getOriginalPos(aweme)), "rank_index");
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(requestId));
        c2344009Gk.LJIIIIZZ("explore_session_id", C15UA.LIZJ());
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        C2344009Gk c2344009Gk2 = (C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        c2344009Gk2.LJII(C1ER1.LIZIZ.I(aweme, str));
        c2344009Gk2.LIZJ(C720360SNm.LJII(aweme), "is_inspiration_added");
        c2344009Gk2.LIZJ(C720360SNm.LJIIJ(aweme), "is_photo_text_added");
        Map<String, String> mapLIZIZ = C1348720lCY.LIZIZ(aweme);
        if (mapLIZIZ != null) {
            c2344009Gk2.LJII(mapLIZIZ);
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        Object objLJJLIL = c1ee2.LJJLIL(aweme, c2344009Gk2);
        Long l = null;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.exploreFromGroupId;
        } else {
            str2 = null;
        }
        C1366720lfa.LIZIZ(aweme, objLJJLIL, str, str2);
        C1205210hT5.LIZ(aweme, objLJJLIL, str, "favourite_video");
        C2344009Gk c2344009Gk3 = (C2344009Gk) objLJJLIL;
        if (postModeDetailParams != null) {
            str3 = postModeDetailParams.btmPageId;
        } else {
            str3 = null;
        }
        C1893310zMv.LIZIZ.LJI(PageFinder.via(str3), c2344009Gk3, "favourite_video");
        C1489005sG.LIZ(aweme, c2344009Gk3);
        C15WT c15wt = C15WT.LIZIZ;
        if (postModeDetailParams != null) {
            str4 = postModeDetailParams.exploreFromGroupId;
        } else {
            str4 = null;
        }
        c15wt.LJFF(c2344009Gk, str, str4, aweme.getAid());
        if (postModeDetailParams != null) {
            l = postModeDetailParams.exploreTabId;
            str5 = postModeDetailParams.exploreTabName;
            str6 = postModeDetailParams.fromExplorePage;
        } else {
            str5 = null;
            str6 = null;
        }
        c15wt.LJIILIIL(c2344009Gk, str, l, str5, str6);
        LJFF(c2344009Gk, aweme);
        LJIIL(c2344009Gk, aweme);
        LIZLLL(this, c2344009Gk);
        LJI(c2344009Gk, aweme);
        if (c1ee2.LIZLLL()) {
            c2344009Gk.LIZJ(i, "is_enter_graphic_detail");
        }
        if (c830490Whz != null) {
            for (Map.Entry entry : c830490Whz.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        LJJI(new ARunnableS103S0100000_3(c2344009Gk, 27));
    }

    public static void LJIJJLI(C721190SQr c721190SQr, Aweme aweme, PostModeDetailParams postModeDetailParams, boolean z, Integer num, String str) {
        String str2;
        c721190SQr.getClass();
        String str3 = null;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.eventType;
            str3 = postModeDetailParams.exploreFromGroupId;
        } else {
            str2 = null;
        }
        LJIJJ(aweme, str2, str3, z, num, str, null);
    }

    public static void LJIJJ(Aweme aweme, String str, String str2, boolean z, Integer num, String str3, String str4) {
        String str5;
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, aweme);
        LIZIZ(c2344009Gk, aweme);
        c2344009Gk.LJFF("enter_from", str);
        if (str4 == null) {
            str4 = "graphic_detail";
        }
        c2344009Gk.LJFF("from_page", str4);
        LJ(c2344009Gk, aweme);
        LJIIJ(c2344009Gk, aweme);
        LJIIJJI(c2344009Gk, num);
        if (!z) {
            str5 = "on";
        } else {
            str5 = "off";
        }
        c2344009Gk.LJFF("to_status", str5);
        LJFF(c2344009Gk, aweme);
        LJII(c2344009Gk, aweme);
        LJIIIZ(c2344009Gk, aweme);
        LJIIL(c2344009Gk, aweme);
        c2344009Gk.LJFF("photo_view_status", str3);
        c2344009Gk.LJII(C1ER1.LIZIZ.I(aweme, str));
        C15WT c15wt = C15WT.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c15wt.LJFF(c2344009Gk, str, str2, aid);
        LJJI(new ARunnableS109S0100000_9(c2344009Gk, 81));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c A[PHI: r1
      0x014c: PHI (r1v21 java.lang.String) = (r1v17 java.lang.String), (r1v22 java.lang.String) binds: [B:74:0x014a, B:72:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1 A[PHI: r1
      0x01a1: PHI (r1v23 java.lang.String) = (r1v15 java.lang.String), (r1v24 java.lang.String) binds: [B:67:0x0137, B:65:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(X.C721190SQr r22, java.lang.String r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, com.ss.android.ugc.aweme.model.PostModeDetailParams r25, java.lang.Integer r26, java.lang.Double r27, java.lang.String r28, java.lang.String r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721190SQr.LJIILL(X.0SQr, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.String, int, int):void");
    }
}
