package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0m1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380270m1R {
    public static final C1380270m1R LIZ = new C1380270m1R();
    public static final String LIZIZ = ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIJJ();

    public static void LIZ(Uri.Builder builder, String str) {
        boolean z;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null && curUser.isDisciplineMember()) {
            z = true;
        } else {
            z = false;
        }
        Uri uri = UriProtector.parse(str);
        if (builder != null) {
            builder.scheme(uri.getScheme());
            builder.authority(uri.getAuthority());
            builder.path(uri.getPath());
        }
        if (SharePrefCache.inst().getIsFirstReportVideo().LIZ().booleanValue() && !z) {
            if (builder != null) {
                builder.appendQueryParameter("isFirst", "1");
            } else {
                return;
            }
        } else if (builder == null) {
            return;
        }
        builder.appendQueryParameter("no_hw", "1");
    }

    public static void LIZIZ(Activity activity, Uri.Builder builder, Bundle bundle) {
        boolean z;
        C589830NBl c589830NBl = C589830NBl.LIZ;
        if (builder != null) {
            z = true;
        } else {
            z = false;
        }
        c589830NBl.getClass();
        C589830NBl.LIZ("report_url_null_check_ri", null, z);
        if (builder == null) {
            return;
        }
        LIZ(builder, "https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html");
        Uri uriBuild = builder.build();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("url", String.valueOf(uriBuild), bundle2);
        bundle2.putBoolean("show_load_dialog", false);
        bundle2.putBoolean("hide_nav_bar", true);
        C786410Ut5.LJJJI("status_bar_color", u.LJJIFFI(activity.getResources().getString(R.color.ao), "#", "", false), bundle2);
        bundle2.putLong("enter_time", System.currentTimeMillis());
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        InterfaceC1381130m2p interfaceC1381130m2pConvertToReportConfig = ReportConfigUtils.INSTANCE.convertToReportConfig(builder, bundle);
        IReportService.LIZ.getClass();
        C06UM.LIZ().report(new AwS600S0100000_21(interfaceC1381130m2pConvertToReportConfig, 436));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8  */
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
    public static void LIZJ(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, android.content.Context r19, java.lang.String r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1380270m1R.LIZJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, android.content.Context, java.lang.String, int, java.lang.String):void");
    }
}
