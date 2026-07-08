package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575940r72 {
    public static final C1575940r72 LIZ = new C1575940r72();

    public static void LIZLLL(String str) {
        C909090ZlT.LIZ.getClass();
        if (C909090ZlT.LIZ().clickReEntranceEnabled) {
            C1575960r74.LL.LJ(str);
            for (EnumC1576090r7H enumC1576090r7H : EnumC1576090r7H.values()) {
                C1575960r74.LL.LJFF(str, enumC1576090r7H);
            }
        }
    }

    public static void LIZIZ(Context context, String str, String str2, String str3, String str4, String str5, List list) {
        C0Y8T c0y8tLIZ;
        List list2 = list;
        String str6 = str3;
        EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(str);
        if (enumC912680ZrGLJI.isGroup() && !C1576040r7C.LIZIZ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(context.getString(2131847971));
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (!enumC912680ZrGLJI.isGroup() || ((c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) != null && c0y8tLIZ.isMember())) {
            EnumC1575230r5t enumC1575230r5tLIZIZ = C1575210r5r.LLILLJJLI.LIZIZ(str);
            if (enumC1575230r5tLIZIZ == EnumC1575230r5t.STARTED && !Intrinsics.LJFF(str4, "menu_bar")) {
                if (str6 == null) {
                    str6 = "";
                }
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                C638790P3t.LIZ(context, new C638810P3v(enumC912680ZrGLJI, str4, list2, str2, str6, str, null, 192));
                LIZLLL(str);
                return;
            }
            if (enumC1575230r5tLIZIZ == EnumC1575230r5t.HIDE) {
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (activityLIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                    c1389890mGx2.LJIIJ(context.getString(2131847971));
                    c1389890mGx2.LJIIJJI();
                }
                C1575440r6E.LIZIZ("vibe_router_open_failed", C2097908Jt.LIZJ(new Pair("reason", "hide_state")));
                return;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//sharedfeed/intro");
            smartRouteBuildRoute.withParam("conversation_id", str);
            smartRouteBuildRoute.withParam("peer_uid", str2);
            smartRouteBuildRoute.withParam("vibe_feed_state", enumC1575230r5tLIZIZ.getValue());
            smartRouteBuildRoute.withParam("sec_uid", str6);
            smartRouteBuildRoute.withParam("entrance_type", str4);
            smartRouteBuildRoute.withParam("enter_method", str4);
            smartRouteBuildRoute.withParam("enter_from", str5);
            smartRouteBuildRoute.open(11001);
            LIZLLL(str);
        }
    }

    public static void LIZ(int i, Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//sharedfeed/digg_agg");
        smartRouteBuildRoute.withParam("peer_uid", str2);
        smartRouteBuildRoute.withParam("conversation_id", str);
        smartRouteBuildRoute.withParam("sec_uid", str3);
        smartRouteBuildRoute.withParam("like_count", i);
        smartRouteBuildRoute.withParam("feed_id", str4);
        smartRouteBuildRoute.withParam("entrance_type", str5);
        smartRouteBuildRoute.withParam("enter_from", str6);
        smartRouteBuildRoute.open();
    }
}
