package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357660lQy {
    public static final void LIZJ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        String authorUid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        String authorUid2 = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C123100dR.LIZ(authorUid)) {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                LJIIIZ(abstractC1386130mAt, "item_author_type", CardStruct.IStatusCode.DEFAULT);
                return;
            }
            if (aweme != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            }
            if (Intrinsics.LJFF(authorUid2, curUser.getUid())) {
                LJIIIZ(abstractC1386130mAt, "item_author_type", "1");
            } else {
                LJIIIZ(abstractC1386130mAt, "item_author_type", "2");
            }
        }
    }

    public static final void LIZLLL(C2344009Gk c2344009Gk, Aweme aweme) {
        String authorUid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        String authorUid2 = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C123100dR.LIZ(authorUid)) {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                c2344009Gk.LJFF("item_author_type", CardStruct.IStatusCode.DEFAULT);
                return;
            }
            if (aweme != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            }
            if (Intrinsics.LJFF(authorUid2, curUser.getUid())) {
                c2344009Gk.LJFF("item_author_type", "1");
            } else {
                c2344009Gk.LJFF("item_author_type", "2");
            }
        }
    }

    public static final void LJ(C2344009Gk c2344009Gk, Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String str = C1357670lQz.LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            c2344009Gk.LJFF("share_link_id", str);
        }
        if (aid != null && aid.length() != 0) {
            for (Map.Entry entry : ((LinkedHashMap) C1375920luQ.LIZ(2, aid, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str3)) {
                    c2344009Gk.LJFF(str2, str3);
                }
            }
        }
        C1357670lQz.LIZIZ = "";
    }

    public static final void LJFF(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        if (aweme == null) {
            return;
        }
        try {
            abstractC1386130mAt.LIZLLL(C621180OYa.LIZIZ.LJFF(aweme), "item_type");
            C189200o6.m2constructorimpl(abstractC1386130mAt);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LJI(C2344009Gk c2344009Gk, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        try {
            c2344009Gk.LIZJ(C621180OYa.LIZIZ.LJFF(aweme), "item_type");
            C189200o6.m2constructorimpl(c2344009Gk);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(com.ss.android.ugc.aweme.feed.model.Aweme r2, X.AbstractC1386130mAt r3) {
        /*
            if (r2 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r2.mPaidContentInfo     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L15
            long r0 = r0.getCategory()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25
            boolean r0 = kotlin.text.a0.LJJJIL(r2)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
        L15:
            java.lang.String r2 = "0"
        L17:
            java.lang.String r1 = "series_category"
            r3.getClass()     // Catch: java.lang.Throwable -> L25
            X.08Dt r0 = X.InterfaceC1210900hcG.LIZ     // Catch: java.lang.Throwable -> L25
            r3.LJFF(r1, r2, r0)     // Catch: java.lang.Throwable -> L25
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1357660lQy.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, X.0mAt):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(X.C2344009Gk r2, com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r3.mPaidContentInfo     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L15
            long r0 = r0.getCategory()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L17
        L15:
            java.lang.String r1 = "0"
        L17:
            java.lang.String r0 = "series_category"
            r2.getClass()     // Catch: java.lang.Throwable -> L23
            r2.LJIIIIZZ(r0, r1)     // Catch: java.lang.Throwable -> L23
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1357660lQy.LJIIIIZZ(X.09Gk, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r2.equals("image_mode") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r2.equals("comment_story") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r2.equals("text_post") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r2.equals("story_photo") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r2.equals("text") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r2.equals("multi_photo") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r2.equals("photo") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        if (r2.equals("photo_canvas") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        if (r2.equals("story_note") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJIIJ(java.lang.String r2, java.util.Map r3) {
        /*
            java.lang.String r1 = ""
            if (r2 != 0) goto L5
            r2 = r1
        L5:
            if (r3 == 0) goto L16
            java.lang.String r0 = "content_type"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L16
            r1 = r0
        L16:
            int r0 = r2.length()
            if (r0 != 0) goto L1d
            r2 = r1
        L1d:
            int r0 = r2.length()
            if (r0 != 0) goto L2a
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_VIDEO
            int r0 = r0.getNum()
            return r0
        L2a:
            int r0 = r2.hashCode()
            switch(r0) {
                case -1442977273: goto L38;
                case -1106065643: goto L41;
                case -1037680526: goto L4a;
                case -918598040: goto L53;
                case 3556653: goto L5c;
                case 79554476: goto L65;
                case 106642994: goto L6e;
                case 1342715909: goto L77;
                case 1494335740: goto L80;
                default: goto L31;
            }
        L31:
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_VIDEO
            int r0 = r0.getNum()
            return r0
        L38:
            java.lang.String r0 = "image_mode"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L41:
            java.lang.String r0 = "comment_story"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L90
            goto L31
        L4a:
            java.lang.String r0 = "text_post"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L53:
            java.lang.String r0 = "story_photo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L90
            goto L31
        L5c:
            java.lang.String r0 = "text"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L65:
            java.lang.String r0 = "multi_photo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L6e:
            java.lang.String r0 = "photo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L77:
            java.lang.String r0 = "photo_canvas"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L31
        L80:
            java.lang.String r0 = "story_note"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L90
            goto L31
        L89:
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_PHOTO_VIDEO
            int r0 = r0.getNum()
            return r0
        L90:
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_STORY
            int r0 = r0.getNum()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1357660lQy.LJIIJ(java.lang.String, java.util.Map):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void LJIIIZ(T t, String str, Object obj) throws JSONException {
        if (t instanceof AbstractC1386130mAt) {
            if (obj instanceof String) {
                ((AbstractC1386130mAt) t).LJ(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                ((AbstractC1386130mAt) t).LIZLLL(((Number) obj).intValue(), str);
                return;
            } else if (obj instanceof Boolean) {
                ((AbstractC1386130mAt) t).LJI(str, ((Boolean) obj).booleanValue());
                return;
            } else {
                ((AbstractC1386130mAt) t).LJ(str, obj.toString());
                return;
            }
        }
        if (t instanceof C2241008qG) {
            if (obj instanceof String) {
                ((C2241008qG) t).LIZLLL(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                ((C2241008qG) t).LIZIZ((Integer) obj, str);
                return;
            } else if (obj instanceof Boolean) {
                ((C2241008qG) t).LIZ((Boolean) obj, str);
                return;
            } else {
                ((C2241008qG) t).LIZLLL(str, obj.toString());
                return;
            }
        }
        if (t instanceof C2344009Gk) {
            if (obj instanceof String) {
                ((C2344009Gk) t).LJFF(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                ((C2344009Gk) t).LIZJ(((Number) obj).intValue(), str);
                return;
            } else if (obj instanceof Boolean) {
                ((C2344009Gk) t).LJ(obj, str);
                return;
            } else {
                ((C2344009Gk) t).LJFF(str, obj.toString());
                return;
            }
        }
        if (t instanceof JSONObject) {
            if (obj instanceof String) {
                ((JSONObject) t).put(str, obj);
                return;
            }
            if (obj instanceof Integer) {
                ((JSONObject) t).put(str, ((Number) obj).intValue());
                return;
            } else if (obj instanceof Boolean) {
                ((JSONObject) t).put(str, ((Boolean) obj).booleanValue());
                return;
            } else {
                ((JSONObject) t).put(str, obj.toString());
                return;
            }
        }
        if (!(t instanceof Bundle)) {
            return;
        }
        if (obj instanceof String) {
            ((BaseBundle) t).putString(str, (String) obj);
        } else {
            if (!(obj instanceof Integer)) {
                return;
            }
            ((BaseBundle) t).putInt(str, ((Number) obj).intValue());
        }
    }

    public static final void LIZ(AbstractC1386130mAt abstractC1386130mAt, String str, Context context, C2189821An6 c2189821An6) {
        if (c2189821An6 == null) {
            c2189821An6 = C0SUC.LIZ(context);
        }
        if (str != null && C123100dR.LIZ(c2189821An6.getExternalShareAwemeId()) && Intrinsics.LJFF(str, c2189821An6.getExternalShareAwemeId())) {
            if (C123100dR.LIZ(c2189821An6.getExternalShareUrlUserId())) {
                abstractC1386130mAt.LJ("external_sharer_uid", c2189821An6.getExternalShareUrlUserId());
            }
            if (C123100dR.LIZ(c2189821An6.getExternalShareUserOId())) {
                abstractC1386130mAt.LJ("_oid", c2189821An6.getExternalShareUserOId());
            }
        }
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, Object obj) {
        if (str != null) {
            try {
                if (C123100dR.LIZ(str3) && Intrinsics.LJFF(str, str3) && C123100dR.LIZ(str2)) {
                    LJIIIZ(obj, str4, str2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
