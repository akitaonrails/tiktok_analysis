package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SQK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQK implements IPhotoModeLogUtil {
    public static final C0SQK LIZ = new C0SQK();

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    public final C0SFO getSbLogger(String str, boolean z, boolean z2) {
        return new C716860SAa(str, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logBackToFeed(com.ss.android.ugc.aweme.model.PostModeEgressEtData r17, java.lang.String r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, java.lang.String r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SQK.logBackToFeed(com.ss.android.ugc.aweme.model.PostModeEgressEtData, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    public final void logMultiPhotoSlide(String str, String str2, Aweme aweme, int i, String str3, int i2, Map<String, String> map) {
        getClass();
        LIZIZ(str, str2, aweme, i, str3, null, false, i2, map, null, false, null, -1L, 1, null, null, null, "", null, null);
    }

    public static void LIZ(C0SQK c0sqk, Aweme aweme, long j, long j2, String str, double d, double d2, String str2, HashMap map, HashMap map2, int i) {
        int size;
        String string;
        EnumC1479760obu playerType;
        List<PhotoModeImageUrlModel> imageList;
        HashMap map3 = map;
        String str3 = str2;
        String str4 = null;
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            map3 = null;
        }
        if ((i & 512) != 0) {
            map2 = null;
        }
        c0sqk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZLLL(j + j2, "duration");
        c2344009Gk.LIZLLL(j, "play_duration");
        c2344009Gk.LJIIIIZZ("from_page", str3);
        c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        c2344009Gk.LJIIIIZZ("log_pb", aweme.getLogPbString());
        c2344009Gk.LIZLLL(j2, "post_stay_duration");
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(aweme.getAuthor()));
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LJIIIIZZ("is_fullscreen", "1");
        c2344009Gk.LJIIIIZZ("is_long", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("has_cla", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("has_tts", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("start_volumn_value", String.valueOf(d));
        c2344009Gk.LJIIIIZZ("end_volumn_value", String.valueOf(d2));
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        if (c0n0yLJLJJI != null && (playerType = c0n0yLJLJJI.getPlayerType()) != null) {
            string = playerType.toString();
        } else {
            string = null;
        }
        c2344009Gk.LJIIIIZZ("player_type", string);
        c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (c1er1.LJJJLL(str)) {
            C487540JAa.LIZ(c2344009Gk, c1er1.fetchSearchParams(str, ""));
            c2344009Gk.LJII(c1er1.I(aweme, str));
        }
        C0SQM.LIZ.getClass();
        IExploreFeedService iExploreFeedService = C0SQM.LIZIZ;
        if (iExploreFeedService != null) {
            if (map3 != null) {
                str4 = (String) map3.get("explore_innerfeed_entrance_group_id");
            }
            iExploreFeedService.LJFF(c2344009Gk, str, str4, aweme.getAid());
        }
        if (map3 != null) {
            map3.remove("explore_innerfeed_entrance_group_id");
        }
        C721190SQr.LIZ.getClass();
        c2344009Gk.LIZJ(C721190SQr.LJIILJJIL(aweme), "no_hashtag_description_length");
        c2344009Gk.LIZJ(0, "dark_mode_flag");
        c2344009Gk.LJI(map3);
        if (C123100dR.LIZ(C1381730m3n.LIZ(aweme))) {
            c2344009Gk.LJFF("photo_content_type", C1381730m3n.LIZ(aweme));
        }
        if (C720360SNm.LJI(aweme)) {
            c2344009Gk.LJFF("is_text_mode", "1");
        }
        if (C720360SNm.LJIIJJI(aweme)) {
            c2344009Gk.LJFF("is_text_trans_pic", "1");
            c2344009Gk.LJFF("is_text_mode", "1");
        }
        if (C720360SNm.LJFF(aweme)) {
            c2344009Gk.LJFF("is_comment_to_post", "1");
        }
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                c2344009Gk.LIZLLL(((Number) entry.getValue()).longValue(), (String) entry.getKey());
            }
        }
        C20684815ws.LJIILLIIL("post_stay_time", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    public final void logPinchZoom(String str, Aweme aweme, int i, long j, boolean z, Integer num, boolean z2, Float f, Boolean bool, Boolean bool2, Boolean bool3, String str2) {
        logPinchZoom(str, aweme, i, j, z, num, z2, f, bool, bool2, bool3, str2, null, null);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeLogUtil
    public final void logPinchZoom(final String str, final Aweme aweme, final int i, final long j, final boolean z, final Integer num, final boolean z2, final Float f, final Boolean bool, final Boolean bool2, final Boolean bool3, final String str2, final Float f2, final String str3) {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0SQN
            /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x020e A[PHI: r15
              0x020e: PHI (r15v5 int) = (r15v4 int), (r15v8 int) binds: [B:75:0x020a, B:27:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
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
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 542
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0SQN.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PhotoModeLogUtil@3033.logPinchZoom$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PhotoModeLogUtil@3033.logPinchZoom$1");
            }
        });
    }

    public static void LIZIZ(final String str, final String str2, final Aweme aweme, final int i, final String str3, final Integer num, final boolean z, int i2, final Map map, final HashMap map2, final boolean z2, final String str4, final Long l, final int i3, final Long l2, final String str5, final String str6, final String str7, final Long l3, final String str8) {
        String str9;
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0SQO
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
            public final void LIZ() {
                List<PhotoModeImageUrlModel> imageList;
                PhotoModeImageUrlModel photoModeImageUrlModel;
                Object c098200Yq;
                Object objOpt;
                Set<Map.Entry<String, String>> setEntrySet;
                List<PhotoModeImageUrlModel> imageList2;
                C0SQK c0sqk = C0SQK.LIZ;
                String str10 = str;
                String str11 = str2;
                Aweme aweme2 = aweme;
                int i4 = i;
                String str12 = str3;
                Integer num2 = num;
                boolean z3 = z;
                Map<String, String> map3 = map;
                HashMap map4 = map2;
                boolean z4 = z2;
                String str13 = str4;
                Long l4 = l;
                int i5 = i3;
                Long l5 = l2;
                String str14 = str5;
                String str15 = str6;
                String str16 = str7;
                Long l6 = l3;
                String str17 = str8;
                c0sqk.getClass();
                if (i4 < C0ST8.LIZJ(aweme2)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str10);
                    c2344009Gk.LJIIIIZZ("enter_method", str11);
                    c2344009Gk.LIZJ(aweme2.getAwemeType(), "aweme_type");
                    c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme2));
                    PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
                    c2344009Gk.LIZJ((photoModeImageInfo == null || (imageList2 = photoModeImageInfo.getImageList()) == null) ? 0 : imageList2.size(), "pic_cnt");
                    c2344009Gk.LIZJ(i4 + 1, "pic_location");
                    c2344009Gk.LJIIIIZZ("action_type", str12);
                    c2344009Gk.LIZJ(z4 ? 1 : 0, "is_restart");
                    c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme2));
                    c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme2)));
                    c2344009Gk.LJIIIIZZ("first_manual_click_duration", String.valueOf(l4));
                    c2344009Gk.LIZJ(i5, "photo_coverage");
                    c2344009Gk.LJFF("photo_view_status", str17);
                    if (num2 != null) {
                        c2344009Gk.LIZJ(num2.intValue(), "has_title");
                    }
                    if (z3) {
                        c2344009Gk.LJFF("from_page", "graphic_detail");
                    } else {
                        c2344009Gk.LJFF("from_page", "");
                    }
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    if (c1er1.LJJJLL(str10)) {
                        C487540JAa.LIZ(c2344009Gk, c1er1.fetchSearchParams(str10, ""));
                        if (map3 != null) {
                            C487540JAa.LIZ(c2344009Gk, map3);
                        }
                        Map<String, String> mapI = c1er1.I(aweme2, str10);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : mapI.entrySet()) {
                            if (entry.getValue().length() > 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        c2344009Gk.LJII(linkedHashMap);
                        if (l6 != null) {
                            c2344009Gk.LIZLLL(l6.longValue(), "slide_duration");
                        }
                    }
                    if (z3 && map3 != null && (setEntrySet = map3.entrySet()) != null) {
                        Iterator<T> it2 = setEntrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            c2344009Gk.LJFF((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    if (C123100dR.LIZ(C1381730m3n.LIZ(aweme2))) {
                        c2344009Gk.LJFF("photo_content_type", C1381730m3n.LIZ(aweme2));
                    }
                    PoiAnchorData.Companion.getClass();
                    PoiAnchorData poiAnchorDataLIZ = C735490St9.LIZ(aweme2, "photo_util");
                    if (poiAnchorDataLIZ != null) {
                        String str18 = poiAnchorDataLIZ.collectInfo;
                        if (str18 != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(str18);
                                c2344009Gk.LJFF("collect_info", str18);
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
                        String str19 = poiAnchorDataLIZ.poiId;
                        if (str19 != null) {
                            c2344009Gk.LJFF("poi_id", str19);
                        }
                    }
                    if (C720360SNm.LJI(aweme2)) {
                        c2344009Gk.LJFF("is_text_mode", "1");
                    }
                    if (C720360SNm.LJIIJJI(aweme2)) {
                        c2344009Gk.LJFF("is_text_trans_pic", "1");
                        c2344009Gk.LJFF("is_text_mode", "1");
                    }
                    if (C720360SNm.LJFF(aweme2)) {
                        c2344009Gk.LJFF("is_comment_to_post", "1");
                    }
                    C0SQM.LIZ.getClass();
                    IExploreFeedService iExploreFeedService = C0SQM.LIZIZ;
                    if (iExploreFeedService != null) {
                        iExploreFeedService.LJFF(c2344009Gk, str10, str13, aweme2.getAid());
                    }
                    C721190SQr.LIZ.getClass();
                    c2344009Gk.LJI(C735370Ssx.LJJI(aweme2));
                    if (map4 != null) {
                        c2344009Gk.LJI(map4);
                    }
                    if (iExploreFeedService != null) {
                        iExploreFeedService.LJIILIIL(c2344009Gk, str10, l5, str14, str15);
                    }
                    if (C281430B1h.LIZ()) {
                        PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
                        String str20 = (photoModeImageInfo2 == null || (imageList = photoModeImageInfo2.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i4, imageList)) == null) ? null : photoModeImageUrlModel.ocrLanguage;
                        ICLATranslatabilityService iCLATranslatabilityService = C0SQQ.LIZ;
                        boolean zLJII = iCLATranslatabilityService.LJII(i4, aweme2);
                        boolean zLJIIIZ = iCLATranslatabilityService.LJIIIZ(i4, aweme2, null);
                        c2344009Gk.LIZJ(zLJII ? 1 : 0, "is_photo_text_translatable_currentphoto");
                        c2344009Gk.LIZJ(zLJIIIZ ? 1 : 0, "is_photo_text_translated_currentphoto");
                        c2344009Gk.LJIIIIZZ("photo_text_source_lang_currentphoto", str20);
                        c2344009Gk.LIZJ(C123100dR.LIZ(str20) ? 1 : 0, "has_photo_text_currentphoto");
                        c2344009Gk.LJFF("target_lang", C1839820xye.LIZ().LIZ());
                    }
                    CommentService.LIZ.getClass();
                    Map contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme2, str10);
                    if (contentRecReasonParams != null) {
                        c2344009Gk.LJII(contentRecReasonParams);
                    }
                    C1EE2.LIZIZ.LJJLIL(aweme2, c2344009Gk);
                    if (C123100dR.LIZ(str16)) {
                        IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
                        if (iFriendsTabV3Service != null) {
                            iFriendsTabV3Service.Ou(c2344009Gk, new C1360330lVH(str16, null, null, null, 14));
                        }
                        c2344009Gk.LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(aweme2.getRequestId()));
                    }
                    C20684815ws.LJIILLIIL("multi_photo_slide", c2344009Gk.LIZ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PhotoModeLogUtil@3033.logPhotoSlide$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PhotoModeLogUtil@3033.logPhotoSlide$1");
            }
        });
        if (AwemeExtKt.isAdTraffic(aweme)) {
            int iLJI = C1009740cNo.LJI(aweme);
            int i4 = i * iLJI;
            int i5 = iLJI + i4;
            while (true) {
                str9 = "manual";
                if (i4 >= i5) {
                    break;
                }
                IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
                int i6 = i + 1;
                i4++;
                if (!TextUtils.equals(str2, "manual_click")) {
                    str9 = "auto";
                }
                iAdPhotoModeService.LJIIJJI(aweme, i6, str9, i4, i2);
            }
            IAdPhotoModeService iAdPhotoModeService2 = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
            if (!TextUtils.equals(str2, "manual_click")) {
                str9 = "auto";
            }
            iAdPhotoModeService2.LJJIIJZLJL(i, i2, aweme, str9, str3);
        }
    }
}
