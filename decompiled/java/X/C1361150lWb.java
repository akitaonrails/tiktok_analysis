package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ClickReportDanmakuEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.DanmakuShowEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.LikeDanmakuCancelEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.LikeDanmakuEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361150lWb {
    public static final C1361150lWb LIZ = new C1361150lWb();

    public static void LIZJ(IDanmakuData iDanmakuData, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", iDanmakuData.v1());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_danmaku");
        c2344009Gk.LJIIIIZZ("group_id", iDanmakuData.getAid());
        c2344009Gk.LJIIIIZZ("object_id", iDanmakuData.x1());
        c2344009Gk.LJIIIIZZ("object_type", "one_liner");
        C20684815ws.LJIILLIIL("click_report", c2344009Gk.LIZ);
    }

    public static void LJFF(Aweme aweme, String str, EnumC255700yp enumC255700yp) {
        String authorUid;
        String uid;
        boolean z;
        String str2;
        String string;
        String aid;
        String authorUid2;
        String str3;
        String uid2;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        String str4 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        if (curUser != null) {
            uid = curUser.getUid();
        } else {
            uid = null;
        }
        boolean zEquals = TextUtils.equals(authorUid, uid);
        Object obj = C1361160lWc.LIZIZ().getAll().get("danmaku_allow_show");
        Object obj2 = C1361160lWc.LIZIZ().getAll().get("strategy_control_danmaku_show_default_off");
        if (obj == null && obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        Pair pair = new Pair(Boolean.valueOf(z), obj2);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            str2 = "low_active_user";
        } else {
            str2 = "user_setting";
        }
        Object second = pair.getSecond();
        if (second == null || (string = second.toString()) == null) {
            string = "none";
        }
        boolean zLIZ = C1361160lWc.LIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C0SXF.LJJIFFI(null, Boolean.FALSE, str));
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme == null || (authorUid2 = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid2 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid2);
        if (curUser != null && (uid2 = curUser.getUid()) != null) {
            str4 = uid2;
        }
        c2344009Gk.LJIIIIZZ("user_id", str4);
        c2344009Gk.LIZJ(zEquals ? 1 : 0, "is_author");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (zLIZ) {
            str3 = "show";
        } else {
            str3 = "hide";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c2344009Gk.LJIIIIZZ("control_value", string);
        c2344009Gk.LIZJ(enumC255700yp.getValue(), "is_landscape_screen");
        C20684815ws.LJIILLIIL("danmaku_status", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[PHI: r5
      0x0055: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:12:0x0027, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.AbstractC207072161e r8, java.util.List r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, final java.lang.String r11) {
        /*
            X.0lWb r0 = X.C1361150lWb.LIZ
            r0.getClass()
            X.0076 r2 = new X.0076
            java.lang.String r1 = ""
            if (r10 == 0) goto L11
            java.lang.String r3 = r10.getAid()
            if (r3 != 0) goto L12
        L11:
            r3 = r1
        L12:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C1383770m75.LIZ()
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            java.lang.String r4 = r0.getCurUserId()
            if (r10 == 0) goto L26
            java.lang.String r5 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r10)
            if (r5 != 0) goto L55
        L26:
            r5 = r1
            if (r10 != 0) goto L55
            r1 = 0
        L2a:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C1383770m75.LIZ()
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            java.lang.String r0 = r0.getCurUserId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.LJII(r2)
            java.util.Iterator r1 = r9.iterator()
        L45:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r1.next()
            X.04zy r0 = (X.InterfaceC1282004zy) r0
            r8.LJII(r0)
            goto L45
        L55:
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r10)
            goto L2a
        L5a:
            r8.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1361150lWb.LJI(X.161e, java.util.List, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public static void LIZLLL(Aweme aweme, String str, String str2, String str3, EnumC255700yp enumC255700yp) {
        LJI(new ClickReportDanmakuEvent(), Collections.singletonList(new C00I8(enumC255700yp.getValue(), str2, str3, 2)), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, X.EnumC1361140lWa r7, X.EnumC1361130lWZ r8, X.EnumC255700yp r9) {
        /*
            X.0078 r4 = new X.0078
            java.lang.String r3 = r7.getValue()
            java.lang.String r2 = r8.getValue()
            if (r5 == 0) goto L2e
            boolean r0 = r5.isSupportDanmaku()
            r1 = 1
            if (r0 != r1) goto L2e
        L13:
            int r0 = r9.getValue()
            r4.<init>(r3, r2, r1, r0)
            com.ss.android.ugc.aweme.eventtrack.eventfiles.ShowDanmakuOptionsEvent r3 = new com.ss.android.ugc.aweme.eventtrack.eventfiles.ShowDanmakuOptionsEvent
            r3.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r4)
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r0 = X.C0SXF.LJJIFFI(r1, r0, r6)
            LJI(r3, r2, r5, r0)
            return
        L2e:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1361150lWb.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.0lWa, X.0lWZ, X.00yp):void");
    }

    public static void LIZ(Aweme aweme, String str, String str2, boolean z, boolean z2, String str3, EnumC255700yp enumC255700yp) {
        AbstractC207072161e likeDanmakuCancelEvent;
        if (z2) {
            likeDanmakuCancelEvent = new LikeDanmakuEvent();
        } else {
            likeDanmakuCancelEvent = new LikeDanmakuCancelEvent();
        }
        LJI(likeDanmakuCancelEvent, Collections.singletonList(new C00I8(str2, z ? 1 : 0, str3, enumC255700yp.getValue())), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
    }

    public static void LJ(Aweme aweme, String str, int i, String str2, String str3, EnumC255700yp enumC255700yp, boolean z) {
        DanmakuShowEvent danmakuShowEvent = new DanmakuShowEvent();
        List listSingletonList = Collections.singletonList(new C00I9(i, 0, 0, str2, str3, enumC255700yp.getValue(), 12));
        if (!z) {
            str = C0SXF.LJJIFFI(null, Boolean.FALSE, str);
        }
        LJI(danmakuShowEvent, listSingletonList, aweme, str);
    }

    public static void LJII(Aweme aweme, String str, boolean z, int i, long j, boolean z2, boolean z3, boolean z4) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2237408pg(str, aweme, z, i, j, z3, z2, z4, null), 2);
    }
}
