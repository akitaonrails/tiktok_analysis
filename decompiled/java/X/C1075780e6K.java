package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS272S0300000_28;

/* JADX INFO: renamed from: X.0e6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075780e6K {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LIZ(java.lang.String r6) {
        /*
            if (r6 == 0) goto L22
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Lb
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> Lb
            goto L17
        Lb:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L17:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 == 0) goto L1e
            r4 = 0
        L1e:
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 != 0) goto L27
        L22:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L27:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r4.keys()
        L30:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "business_extra"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L65
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r4.optString(r1)     // Catch: java.lang.Throwable -> L78
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r2 = r3.keys()     // Catch: java.lang.Throwable -> L78
        L51:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r3.optString(r1)     // Catch: java.lang.Throwable -> L78
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L78
            goto L51
        L65:
            boolean r0 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L72
            java.lang.String r0 = r4.optString(r1)     // Catch: java.lang.Throwable -> L78
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L78
        L72:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L78
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L78
            goto L30
        L78:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L30
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1075780e6K.LIZ(java.lang.String):java.util.Map");
    }

    public static final void LIZIZ(String str, EnumC1903600zdW enumC1903600zdW) {
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("platform", "contact");
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        String str4 = "on";
        if (c1076010e6h.LJIIJ().LJ()) {
            str2 = "on";
        } else {
            str2 = "unknown";
        }
        linkedHashMap.put("did_status", str2);
        if (!c1076010e6h.LJIIJ().LIZIZ()) {
            str4 = "off";
        }
        linkedHashMap.put("uid_status", str4);
        if (enumC1903600zdW == EnumC1903600zdW.TOP) {
            str3 = "top";
        } else {
            str3 = "bottom";
        }
        linkedHashMap.put("position", str3);
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public static final void LJ(int i, boolean z) {
        C2252408s6.LIZ(new C2000007sU(z, i));
    }

    public static final void LIZJ(BaseNotice baseNotice, BaseResponse baseResponse, Throwable th) {
        C2252408s6.LIZ(new AwS272S0300000_28(baseNotice, baseResponse, th, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.ss.android.ugc.aweme.profile.model.User r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            if (r7 == 0) goto Le
            int r0 = r7.getFollowStatus()
            if (r0 != 0) goto L84
            int r0 = r7.getFollowerStatus()
            if (r0 != 0) goto L96
        Le:
            java.lang.String r2 = ""
        L10:
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r3.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "follow_type"
            r3.LJIIIIZZ(r0, r2)
            java.lang.String r0 = "scene_type"
            r3.LJIIIIZZ(r0, r6)
            java.lang.String r0 = "action_type"
            r3.LJIIIIZZ(r0, r4)
            r2 = 0
            if (r7 == 0) goto L82
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.recType
        L36:
            java.lang.String r0 = "rec_type"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "enter_method"
            r3.LJIIIIZZ(r0, r5)
            if (r7 == 0) goto L80
            java.lang.String r1 = r7.getUid()
        L46:
            java.lang.String r0 = "to_user_id"
            r3.LJIIIIZZ(r0, r1)
            if (r7 == 0) goto L55
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r7.getMatchedFriendStruct()
            if (r0 == 0) goto L55
            java.lang.String r2 = r0.relationType
        L55:
            java.lang.String r0 = "relation_type"
            r3.LJIIIIZZ(r0, r2)
            if (r8 == 0) goto L9a
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L64:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.LJFF(r1, r0)
            goto L64
        L80:
            r1 = r2
            goto L46
        L82:
            r1 = r2
            goto L36
        L84:
            int r1 = r7.getFollowStatus()
            r0 = 1
            if (r1 == r0) goto L96
            int r1 = r7.getFollowStatus()
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r2 = "mutual"
            goto L10
        L96:
            java.lang.String r2 = "single"
            goto L10
        L9a:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "follow_recommend"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1075780e6K.LIZLLL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }
}
