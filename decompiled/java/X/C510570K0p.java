package X;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCExclusiveContent;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510570K0p {
    public static final String LIZJ(PGCGetSubPrivilegeDetailResponse.Data data) {
        SubInfo subInfo = data.subInfo;
        if (subInfo != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
            return "subscribed_not_expired";
        }
        if (data.subScenario == 2) {
            return "subscribed_expired_grace_period";
        }
        return "not_subscribed";
    }

    public static final boolean LJFF(PGCGetSubPrivilegeDetailResponse.Data data) {
        PGCGetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission;
        if (!C0K7G.LJFF("can_recharge", true) || (subscribePermission = data.subscribePermission) == null || !subscribePermission.canSubscribe) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence LIZLLL(webcast.api.pgc_sub.PGCTemplateInfo r6, android.content.Context r7) {
        /*
            boolean r0 = X.C0K7G.LIZLLL()
            java.lang.String r5 = ""
            if (r0 == 0) goto L91
            webcast.api.pgc_sub.PGCTagInfo r0 = r6.tagInfo
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.newPromotionDesc
            if (r0 == 0) goto L21
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            r0 = 1
        L19:
            if (r0 != r1) goto L21
            r0 = 1
        L1c:
            if (r0 != 0) goto L91
            goto L23
        L1f:
            r0 = 0
            goto L19
        L21:
            r0 = 0
            goto L1c
        L23:
            webcast.api.pgc_sub.PGCTagInfo r0 = r6.tagInfo     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L2b
            java.lang.String r4 = r0.newPromotionDesc     // Catch: java.lang.Exception -> L84
            if (r4 != 0) goto L2c
        L2b:
            r4 = r5
        L2c:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L84
            if (r0 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L38
            return r5
        L38:
            r0 = 91
            r2 = 6
            int r0 = kotlin.text.a0.LJJIZ(r4, r0, r3, r3, r2)     // Catch: java.lang.Exception -> L84
            int r1 = r0 + 1
            r0 = 93
            int r0 = kotlin.text.a0.LJJIZ(r4, r0, r3, r3, r2)     // Catch: java.lang.Exception -> L84
            java.lang.String r6 = r4.substring(r1, r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "["
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r4, r0, r5, r3)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "]"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r0, r5, r3)     // Catch: java.lang.Exception -> L84
            int r4 = kotlin.text.a0.LJJJ(r0, r6, r3, r3, r2)     // Catch: java.lang.Exception -> L84
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder     // Catch: java.lang.Exception -> L84
            r3.<init>()     // Catch: java.lang.Exception -> L84
            r3.append(r0)     // Catch: java.lang.Exception -> L84
            int r1 = r6.length()     // Catch: java.lang.Exception -> L84
            int r1 = r1 + r4
            r0 = 500(0x1f4, float:7.0E-43)
            r2 = 33
            X.C511270K3h.LIZ(r3, r4, r1, r2, r0)     // Catch: java.lang.Exception -> L84
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Exception -> L84
            r0 = 2131107830(0x7f061ff6, float:1.782825E38)
            int r0 = X.C426930God.LIZ(r0, r7)     // Catch: java.lang.Exception -> L84
            r1.<init>(r0)     // Catch: java.lang.Exception -> L84
            int r0 = r6.length()     // Catch: java.lang.Exception -> L84
            int r0 = r0 + r4
            X.C786410Ut5.q2(r3, r1, r4, r0, r2)     // Catch: java.lang.Exception -> L84
            return r3
        L84:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "PrivilegeExt"
            java.util.Map r0 = X.C2097608Jq.LJ()
            X.C0K6D.LIZJ(r2, r1, r0)
        L91:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C510570K0p.LIZLLL(webcast.api.pgc_sub.PGCTemplateInfo, android.content.Context):java.lang.CharSequence");
    }

    public static final int LJ(PGCGetSubPrivilegeDetailResponse.Data data, SubPackagePrivilege subPackagePrivilege) {
        boolean z;
        int size = subPackagePrivilege.customizedBenefits.size();
        int iLJIILIIL = C0K51.LJIILIIL(Boolean.valueOf(C510580K0q.LIZ("", data)));
        PGCGetSubPrivilegeDetailResponse.Data.SubNoteInfo subNoteInfo = data.subNoteInfo;
        boolean z2 = true;
        int iLJIILIIL2 = 0;
        if (subNoteInfo != null && subNoteInfo.showNoteDetail) {
            z = true;
        } else {
            z = false;
        }
        int iLJIILIIL3 = iLJIILIIL + C0K51.LJIILIIL(Boolean.valueOf(z));
        PGCExclusiveContent pGCExclusiveContent = data.exclusiveContent;
        if (pGCExclusiveContent == null || !pGCExclusiveContent.shouldShowCreatorChatRoom) {
            z2 = false;
        }
        int iLJIILIIL4 = iLJIILIIL3 + C0K51.LJIILIIL(Boolean.valueOf(z2));
        if (C0K7G.LIZ()) {
            iLJIILIIL2 = C0K51.LJIILIIL(Boolean.valueOf(C0K0Z.LIZ(data)));
        }
        return size + iLJIILIIL4 + iLJIILIIL2;
    }

    public static final GradientDrawable LIZ(float f, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(i3, i2);
        return gradientDrawable;
    }
}
