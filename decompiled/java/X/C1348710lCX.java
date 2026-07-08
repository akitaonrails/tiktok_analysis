package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348710lCX {
    public static final C1348710lCX LIZ = new C1348710lCX();

    public static boolean LIZ() {
        if (ComplianceServiceProvider.LJFF().LJFF()) {
            return true;
        }
        return ((Number) C277870Aun.LIZ.getValue()).intValue() != 0 && ComplianceServiceProvider.LJFF().LIZJ(3);
    }

    public static String LIZIZ(Context context) {
        return C786410Ut5.j4(context.getString(2131829024), Arrays.copyOf(new Object[]{C2215181Bmu.LJFF.getValue().LIZIZ(ComplianceServiceProvider.LJFF().LJIIIZ(), Locale.getDefault()), context.getString(2131829022)}, 2));
    }

    public static void LIZJ(Context context, String str) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=comment_ban&roma_group_key=spark_page_comment_ban&roma_page_key=p").buildUpon();
        builderBuildUpon.appendQueryParameter("user_id", C461720I8s.LIZIZ());
        builderBuildUpon.appendQueryParameter("from_source", "17");
        builderBuildUpon.appendQueryParameter("enter_from", str);
        sparkContext.LJJLIIJ(builderBuildUpon.build().toString());
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(final android.app.Activity r3, final java.lang.String r4, final java.lang.String r5, final java.lang.String r6, final java.lang.String r7) {
        /*
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJFF()
            boolean r0 = r0.LJFF()
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJFF()
            r0.LIZIZ(r4)
            return
        L12:
            X.0lVi r2 = new X.0lVi
            r2.<init>()
            X.06g5 r1 = new X.06g5
            int r0 = r4.hashCode()
            switch(r0) {
                case -2017073297: goto L47;
                case 151883543: goto L41;
                case 270826473: goto L36;
                case 1643534250: goto L2b;
                default: goto L20;
            }
        L20:
            java.lang.String r0 = "comment_comment_feature_ban_phase_one_comment_page"
        L22:
            r1.<init>(r0)
            java.lang.String r0 = "comment_feature_ban_phase_one"
            com.bytedance.poplayer.core.PopupManager.LJIJ(r2, r0, r1)
            return
        L2b:
            java.lang.String r0 = "photo_cmt_popup"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "comment_comment_feature_ban_phase_one_photo_mode_detail"
            goto L22
        L36:
            java.lang.String r0 = "inbox_cmt_reply_popup"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "comment_comment_feature_ban_phase_one_inbox"
            goto L22
        L41:
            java.lang.String r0 = "reply_popup"
            r4.equals(r0)
            goto L20
        L47:
            java.lang.String r0 = "collect_page_reply"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "comment_comment_feature_ban_phase_one_comment_collect"
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348710lCX.LIZLLL(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
