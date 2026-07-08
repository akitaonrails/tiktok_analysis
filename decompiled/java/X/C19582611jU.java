package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19582611jU {
    public static final C19582611jU LIZ = new C19582611jU();
    public static final WeakHashMap<Integer, WeakReference<C0P0T>> LIZIZ;

    static {
        new WeakHashMap();
        LIZIZ = new WeakHashMap<>();
    }

    public static void LIZIZ(C19EG c19eg, C705930RmZ c705930RmZ) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String strValueOf;
        String strValueOf2;
        String str5;
        VideoReplyStruct videoReplyStruct;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        String str6;
        String str7;
        VideoReplyStruct videoReplyStruct2;
        Long lValueOf;
        VideoReplyStruct videoReplyStruct3;
        VideoReplyStruct videoReplyStruct4;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r604.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r603.LIZJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r602.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LIZ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        int i = 0;
        if (c705930RmZ != null && (videoReplyStruct4 = c705930RmZ.LJIJ) != null && videoReplyStruct4.getCommentId() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str8 = "";
        if (z) {
            strValueOf = "";
        } else {
            if (c705930RmZ != null && (videoReplyStruct3 = c705930RmZ.LJIJ) != null) {
                lValueOf = Long.valueOf(videoReplyStruct3.getCommentId());
            } else {
                lValueOf = null;
            }
            strValueOf = String.valueOf(lValueOf);
        }
        c2344009Gk.LJIIIIZZ("reply_comment_id", strValueOf);
        if (c705930RmZ == null || (videoReplyStruct2 = c705930RmZ.LJIJ) == null || videoReplyStruct2.getAwemeId() == 0) {
            strValueOf2 = "";
        } else {
            strValueOf2 = String.valueOf(videoReplyStruct2.getAwemeId());
        }
        c2344009Gk.LJIIIIZZ("to_group_id", strValueOf2);
        if (c705930RmZ == null || (str5 = c705930RmZ.LJIJI) == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("reply_user_id", str5);
        c2344009Gk.LJIIIIZZ("target", "see_comments");
        c2344009Gk.LJIIIIZZ("sticker_type", "comment_reply");
        C20684815ws.LJIILLIIL("sticker_toast_click", c2344009Gk.LIZ);
        if (c705930RmZ != null) {
            videoReplyStruct = c705930RmZ.LJIJ;
        } else {
            videoReplyStruct = null;
        }
        if (videoReplyStruct == null) {
            try {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("stcker_awemeid_issue_error_rate", 1, null);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        VideoReplyStruct videoReplyStruct5 = c705930RmZ.LJIJ;
        if (videoReplyStruct5.getAwemeId() == 0) {
            strValueOf3 = "";
        } else {
            strValueOf3 = String.valueOf(videoReplyStruct5.getAwemeId());
        }
        if (videoReplyStruct5.getCommentId() == 0) {
            strValueOf4 = "";
        } else {
            strValueOf4 = String.valueOf(videoReplyStruct5.getCommentId());
        }
        if (videoReplyStruct5.getAliasCommentId() == 0) {
            strValueOf5 = "";
        } else {
            strValueOf5 = String.valueOf(videoReplyStruct5.getAliasCommentId());
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strValueOf3);
        smartRouteBuildRoute.withParam("refer", "click_comment_bubble");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf4);
        sbLIZ.append(',');
        sbLIZ.append(strValueOf5);
        smartRouteBuildRoute.withParam("cid", C2188811AlT.LIZIZ(sbLIZ));
        C0R60 c0r605 = c705930RmZ.LJIIZILJ;
        if (c0r605 != null && (str7 = c0r605.LIZ) != null) {
            str8 = str7;
        }
        smartRouteBuildRoute.withParam("video_from", str8);
        C0R60 c0r606 = c705930RmZ.LJIIZILJ;
        if (c0r606 != null) {
            str6 = c0r606.LIZLLL;
        } else {
            str6 = null;
        }
        smartRouteBuildRoute.withParam("last_group_id", str6);
        smartRouteBuildRoute.open();
        if (TextUtils.isEmpty(strValueOf3) || TextUtils.isEmpty(strValueOf4)) {
            i = 1;
        }
        try {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("stcker_awemeid_issue_error_rate", i, null);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZJ(C705930RmZ c705930RmZ, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String strValueOf;
        String strValueOf2;
        String str5;
        String str6;
        VideoReplyStruct videoReplyStruct;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Long lValueOf = null;
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r604.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r603.LIZJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r602.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LIZ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        String str7 = "";
        if (c705930RmZ == null || (videoReplyStruct = c705930RmZ.LJIJ) == null || videoReplyStruct.getAwemeId() == 0) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(videoReplyStruct.getAwemeId());
        }
        c2344009Gk.LJIIIIZZ("to_group_id", strValueOf);
        if (c705930RmZ != null) {
            VideoReplyStruct videoReplyStruct2 = c705930RmZ.LJIJ;
            if (videoReplyStruct2 != null && videoReplyStruct2.getCommentId() == 0) {
                strValueOf2 = "";
            } else {
                VideoReplyStruct videoReplyStruct3 = c705930RmZ.LJIJ;
                if (videoReplyStruct3 != null) {
                    lValueOf = Long.valueOf(videoReplyStruct3.getCommentId());
                }
                strValueOf2 = String.valueOf(lValueOf);
            }
        } else {
            strValueOf2 = String.valueOf(lValueOf);
        }
        c2344009Gk.LJIIIIZZ("reply_comment_id", strValueOf2);
        if (c705930RmZ != null && (str6 = c705930RmZ.LJIJI) != null) {
            str7 = str6;
        }
        c2344009Gk.LJIIIIZZ("reply_user_id", str7);
        if (i == 1) {
            str5 = "add_to_favorites";
        } else {
            str5 = "remove_from_favorites";
        }
        c2344009Gk.LJIIIIZZ("target", str5);
        c2344009Gk.LJIIIIZZ("sticker_type", "comment_reply");
        C20684815ws.LJIILLIIL("sticker_toast_click", c2344009Gk.LIZ);
    }

    public static void LIZLLL(Context context, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ) {
        String str;
        String str2;
        String str3;
        String str4;
        String uid;
        String str5;
        C0R60 c0r60;
        C0R60 c0r602;
        User user;
        String poiId;
        Unit unit;
        C0R60 c0r603;
        C0R60 c0r604;
        C0R60 c0r605;
        C0R60 c0r606;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str6 = null;
        if (c705930RmZ != null && (c0r606 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r606.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (c705930RmZ != null && (c0r605 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r605.LIZJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r604.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r603.LIZ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        try {
            HashMap map = (HashMap) C7740030o.LIZ().getGson().LJIIIIZZ(interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.04ZY
            }.getType());
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (C123100dR.LIZ((String) entry.getKey()) && C123100dR.LIZ((String) entry.getValue())) {
                        c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        PoiStickerStruct poiStickerStruct = interactStickerStruct.getPoiStickerStruct();
        if (poiStickerStruct != null && (poiId = poiStickerStruct.getPoiId()) != null) {
            c2344009Gk.LJFF("poi_id", poiId);
        }
        C20684815ws.LJIILLIIL("location_sticker_click", c2344009Gk.LIZ);
        try {
            String poiId2 = interactStickerStruct.getPoiStickerStruct().getPoiId();
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (c705930RmZ != null && (user = c705930RmZ.LIZJ) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(uid);
            C1367960lha.LIZ.getClass();
            if ((!C1367960lha.LIZ().LJJJJL() || zLIZJ) && C1367960lha.LIZ().LJLLJ()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://poi/detail");
                smartRouteBuildRoute.withParam("poi_id", poiId2);
                if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
                    str6 = c0r60.LIZ;
                }
                smartRouteBuildRoute.withParam("enter_from", str6);
                smartRouteBuildRoute.withParam("enter_method", "click_sticker");
                IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
                if (c705930RmZ == null || (str5 = c705930RmZ.LIZLLL) == null) {
                    str5 = "";
                }
                iPoiServiceLIZ.LJJLIIIJL(smartRouteBuildRoute, context, str5);
                smartRouteBuildRoute.open();
                return;
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//poi/map");
            smartRouteBuildRoute2.withParam("poi_id", poiId2);
            if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
                str6 = c0r602.LIZ;
            }
            smartRouteBuildRoute2.withParam("enter_from", str6);
            smartRouteBuildRoute2.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0J9f, X.11jX] */
    public static void LJFF(C19EG c19eg, C19582711jV c19582711jV, Function1 function1) {
        WeakReference<C0P0T> weakReference;
        C0P0T c0p0t;
        WeakHashMap<Integer, WeakReference<C0P0T>> weakHashMap = LIZIZ;
        if (weakHashMap.containsKey(Integer.valueOf(c19582711jV.LIZ)) && (weakReference = weakHashMap.get(Integer.valueOf(c19582711jV.LIZ))) != null && (c0p0t = weakReference.get()) != null) {
            c0p0t.dismiss();
        }
        C450860Hm8 c450860Hm8 = new C450860Hm8(c19eg);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJII = c19582711jV.LIZJ;
        PointF pointF = c19582711jV.LIZIZ;
        c450860Hm8.LIZ((int) pointF.x, (int) pointF.y);
        c450860Hm8.LJIIJ(new AwS608S0100000_29(c19582711jV, 228));
        final C0P0T c0p0tLIZIZ = ((AbstractC1391580mJg) function1.invoke(c450860Hm8)).LIZIZ();
        c19582711jV.LJ.invoke(c0p0tLIZIZ);
        weakHashMap.put(Integer.valueOf(c19582711jV.LIZ), new WeakReference<>(c0p0tLIZIZ));
        final ?? r1 = new InterfaceC487330J9f() { // from class: X.11jX
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                c0p0tLIZIZ.dismiss();
            }
        };
        c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.11jW
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                C487280J9a.LIZJ(r1);
            }
        });
        C487280J9a.LIZ(c19eg.hashCode(), r1);
        c0p0tLIZIZ.show();
    }

    public static void LIZ(String str, String str2, String str3, C705930RmZ c705930RmZ) {
        String str4;
        String str5;
        String str6;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str7 = null;
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r604.LIZLLL;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str5 = c0r603.LIZJ;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str5);
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str6 = c0r602.LJ;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str6);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str7 = c0r60.LIZ;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str7);
        c2344009Gk.LJIIIIZZ("powered_by", str);
        c2344009Gk.LJIIIIZZ("ngo_name", str2);
        c2344009Gk.LJIIIIZZ("sticker_type", "donation");
        c2344009Gk.LJIIIIZZ("fundraiser_id", str3);
        C20684815ws.LJIILLIIL("sticker_click", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    public static void LJ(Context context, HashMap map, C705930RmZ c705930RmZ, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String string;
        String str9;
        String str10;
        String string2;
        String str11;
        String string3;
        C0R60 c0r60;
        C0R60 c0r602;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://donation/pannel");
        smartRouteBuildRoute.withParam("enter_method", "sticker_click");
        String str12 = null;
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r602.LIZ;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("enter_from", str2);
        if (c705930RmZ != null) {
            str3 = c705930RmZ.LIZLLL;
        } else {
            str3 = null;
        }
        smartRouteBuildRoute.withParam("aweme_id", str3);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LJ;
        } else {
            str4 = null;
        }
        smartRouteBuildRoute.withParam("log_pb", str4);
        smartRouteBuildRoute.withParam("organization_id", str);
        if (map != 0) {
            str5 = (String) map.get("donation_name");
        } else {
            str5 = null;
        }
        smartRouteBuildRoute.withParam("ngo_name", str5);
        if (map != 0) {
            str6 = (String) map.get("organization_type");
        } else {
            str6 = null;
        }
        smartRouteBuildRoute.withParam("organization_type", str6);
        if (map != 0) {
            str7 = (String) map.get("fundraiser_id");
        } else {
            str7 = null;
        }
        smartRouteBuildRoute.withParam("fundraiser_id", str7);
        if (c705930RmZ != null) {
            str12 = c705930RmZ.LJ;
        }
        smartRouteBuildRoute.withParam("share_url", str12);
        if (map != 0 && (str11 = (String) map.get("fundraiser_owner_id")) != null && (string3 = a0.LJLIIIL(str11).toString()) != null && string3.length() > 0) {
            smartRouteBuildRoute.withParam("fundraiser_owner_id", string3);
        }
        if (c705930RmZ != null) {
            C0R60 c0r603 = c705930RmZ.LJIIZILJ;
            if (c0r603 != null && (str10 = c0r603.LIZJ) != null && (string2 = a0.LJLIIIL(str10).toString()) != null && string2.length() > 0) {
                smartRouteBuildRoute.withParam("author_id", string2);
            }
            C0R60 c0r604 = c705930RmZ.LJIIZILJ;
            if ((c0r604 != null && (str9 = c0r604.LIZLLL) != null && (string = a0.LJLIIIL(str9).toString()) != null && string.length() > 0) || ((str8 = c705930RmZ.LIZLLL) != null && (string = a0.LJLIIIL(str8).toString()) != null && string.length() > 0)) {
                smartRouteBuildRoute.withParam("group_id", string);
            }
        }
        if (map == 0) {
            map = C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null) {
                arrayList.add(new Pair(key, value));
            }
        }
        C1777680wMQ c1777680wMQLIZIZ = C19583911jh.LIZIZ(C2097608Jq.LJIILLIIL(arrayList));
        smartRouteBuildRoute.withParam("donation_sticker_type", String.valueOf(C19578711ir.LIZ(c1777680wMQLIZIZ.LIZ, c1777680wMQLIZIZ.LIZJ)));
        smartRouteBuildRoute.open();
    }

    public static void LJII(int i, int i2, int i3, C19EG c19eg) {
        if (i2 != 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getString(i));
            c1389890mGx.LJII(i3);
            c1389890mGx.LJFF(i2);
            c1389890mGx.LJIIJJI();
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
        c1389890mGx2.LJIIJ(c19eg.getString(i));
        c1389890mGx2.LJIIJJI();
    }
}
