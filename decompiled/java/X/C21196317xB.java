package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21196317xB {
    public static final C21196317xB LIZ = new C21196317xB();
    public static long LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static long LJIIIZ;
    public static JSONObject LJIIJ;
    public static String LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;

    public static boolean LIZ(Long l) {
        if (l != null && l.longValue() != 0) {
            long j = LIZJ;
            if (j != 0 && j == l.longValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZJ(Long l) throws JSONException {
        if ((l == null || l.longValue() == 0 || LIZ(l)) && LJ) {
            C1421105hJ.LIZLLL("rd_tiktokec_entrance_exit", new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("anchor_show_type", "live_cart_tag"), new Pair("entrance_form", "live_cart"), new Pair("page_name", "live"), new Pair(Scene.SCENE_SERVICE, "bag"), new Pair("room_id", String.valueOf(Long.valueOf(LIZJ))), new Pair("duration", Long.valueOf(System.currentTimeMillis() - LIZIZ)), new Pair("user_type", LJIIIIZZ), new Pair("source", LJII), new Pair("has_report_preshow", Integer.valueOf(LJI ? 1 : 0)), new Pair("has_report_show", Integer.valueOf(LJFF ? 1 : 0)), new Pair("has_ec_perm", Integer.valueOf(LIZLLL ? 1 : 0)));
        }
        LIZIZ = 0L;
        LJIIIZ = 0L;
        LIZJ = 0L;
        LJ = false;
        LJI = false;
        LJFF = false;
        LIZLLL = false;
        LJII = null;
        LJIIIIZZ = EnumC21196517xD.AUDIENCE.getRoleStr();
        LJIIJ = null;
        LJIIJJI = null;
        LJIIL = false;
        LJIILIIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r11, com.bytedance.android.livesdkapi.depend.model.live.Room r12) throws org.json.JSONException {
        /*
            r3 = r11
            android.content.Context r6 = r3.getContext()
            long r0 = X.C21196317xB.LIZJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            LIZJ(r0)
            long r4 = r12.getId()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            return
        L19:
            long r0 = r12.getId()
            X.C21196317xB.LIZJ = r0
            com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct r0 = r12.getCommerceStruct()
            if (r0 == 0) goto L89
            int r1 = r0.commercePermission
            r0 = 1
            if (r1 != r0) goto L89
        L2a:
            X.C21196317xB.LIZLLL = r0
            long r0 = java.lang.System.currentTimeMillis()
            X.C21196317xB.LIZIZ = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService> r7 = com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService.class
            r8 = 0
            r4 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService r0 = (com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService) r0
            r2 = 0
            if (r0 == 0) goto L4a
            androidx.fragment.app.Fragment r1 = r0.LIZLLL(r3)
            if (r1 != 0) goto L5c
        L4a:
            boolean r0 = X.C07MW.LIZ()
            if (r0 == 0) goto L7a
            X.0mCc r0 = X.C520040KaQ.LIZIZ(r3)
            if (r0 == 0) goto L79
            androidx.lifecycle.LifecycleOwner r1 = r0.LJFF()
        L5a:
            if (r1 == 0) goto L79
        L5c:
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r3 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r5 = r4
            r6 = r4
            r7 = r11
            r8 = r12
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L79
            X.15v3 r2 = r0.k4()
            if (r2 == 0) goto L79
            r0 = 139(0x8b, float:1.95E-43)
            kotlin.jvm.internal.AFwS278S0000000_32 r0 = kotlin.jvm.internal.AFwS278S0000000_32.get$arr$(r0)
            r2.cb(r1, r0)
        L79:
            return
        L7a:
            if (r6 == 0) goto L87
            android.app.Activity r1 = X.C1388190mED.LIZ(r6)
        L80:
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L79
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            goto L5a
        L87:
            r1 = r2
            goto L80
        L89:
            r0 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21196317xB.LIZIZ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    public static void LIZLLL(String str, String str2, boolean z, boolean z2) {
        if (str != null && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) && Intrinsics.LJFF(String.valueOf(LIZJ), str)) {
            LJIIL = z;
            LJIILIIL = z2;
            LJIIJJI = str2;
        }
    }
}
