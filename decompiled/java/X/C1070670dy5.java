package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0dy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070670dy5 {
    public static final C1070670dy5 LIZ = new C1070670dy5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(806));
    public static final Cert LIZJ = CertProviderManagerKt.findCert("bpea-find_friends_copy_link", 1476399137);

    public static void LIZ(Activity activity) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "find_friends_page");
        C20684815ws.LJIILLIIL("click_connect_now_banner", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//friends/connect_now");
        smartRouteBuildRoute.withParam("enter_from", "find_friends_page");
        smartRouteBuildRoute.withParam("enter_method", "click_connect_now_banner");
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C19EG r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1325105Gn
            if (r0 == 0) goto L62
            r4 = r13
            X.05Gn r4 = (X.C1325105Gn) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            java.lang.String r8 = "find_friends_page"
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L68
            X.C155000ia.LIZIZ(r1)
        L24:
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "enter_from"
            r1.LJIIIIZZ(r0, r8)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "click_share_qr_code"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.profile.util.IShareLinkService r5 = com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl.LJFF()
            com.bytedance.bpea.basics.Cert r0 = X.C1070670dy5.LIZJ
            com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA r1 = r5.LIZJ(r0, r2)
            r0 = 2131839076(0x7f114864, float:1.9311393E38)
            r6 = r12
            java.lang.String r7 = r6.getString(r0)
            r9 = 0
            r10 = 0
            r5.LIZIZ(r6, r7, r8, r9, r10)
            r0 = 2131829543(0x7f112327, float:1.9292058E38)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r4.LLILLL = r2
            java.lang.Object r0 = r5.LIZ(r6, r1, r0, r4)
            if (r0 != r3) goto L24
            return r3
        L62:
            X.05Gn r4 = new X.05Gn
            r4.<init>(r11, r13)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1070670dy5.LIZLLL(X.19EG, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(C1070670dy5 c1070670dy5, C19EG c19eg, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c1070670dy5.getClass();
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        boolean zLJ = c1076010e6h.LJIIJ().LJ();
        boolean zLIZIZ = c1076010e6h.LJIIJ().LIZIZ();
        if (zLJ && zLIZIZ) {
            C1910890zpH c1910890zpH = (C1910890zpH) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try to open contact list page, route context: ");
            sbLIZ.append(c19eg);
            c1910890zpH.LIZ("ffp_btn_utils", C2188811AlT.LIZIZ(sbLIZ));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//friends/contact");
            smartRouteBuildRoute.addFlags(536870912);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("enter_method", str2);
            smartRouteBuildRoute.open();
            return;
        }
        C1910890zpH c1910890zpH2 = (C1910890zpH) LIZIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("try to open contact suggest page, route context: ");
        sbLIZ2.append(c19eg);
        c1910890zpH2.LIZ("ffp_btn_utils", C2188811AlT.LIZIZ(sbLIZ2));
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c19eg, "//suggest/contact");
        smartRouteBuildRoute2.withParam("auth_platform", EnumC1070410dxf.CONTACT);
        smartRouteBuildRoute2.withParam("enter_from", str);
        smartRouteBuildRoute2.withParam("enter_method", str2);
        smartRouteBuildRoute2.withParam("enter_position", (String) null);
        smartRouteBuildRoute2.open();
    }

    public static void LIZJ(C1070670dy5 c1070670dy5, C19EG c19eg, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c1070670dy5.getClass();
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        boolean zLJ = c1076010e6h.LJII().LJ();
        boolean zLIZIZ = c1076010e6h.LJII().LIZIZ();
        if (zLJ && zLIZIZ) {
            C1910890zpH c1910890zpH = (C1910890zpH) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try to open facebook list page, route context: ");
            sbLIZ.append(c19eg);
            c1910890zpH.LIZ("ffp_btn_utils", C2188811AlT.LIZIZ(sbLIZ));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//friends/facebook");
            if (str == null) {
                str = "";
            }
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.open();
            return;
        }
        C1910890zpH c1910890zpH2 = (C1910890zpH) LIZIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("try to open facebook suggest page, route context: ");
        sbLIZ2.append(c19eg);
        c1910890zpH2.LIZ("ffp_btn_utils", C2188811AlT.LIZIZ(sbLIZ2));
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c19eg, "//suggest/facebook");
        smartRouteBuildRoute2.withParam("auth_platform", EnumC1070410dxf.FACEBOOK);
        smartRouteBuildRoute2.withParam("enter_from", str);
        smartRouteBuildRoute2.withParam("enter_method", str2);
        smartRouteBuildRoute2.withParam("enter_position", (String) null);
        smartRouteBuildRoute2.open();
    }
}
