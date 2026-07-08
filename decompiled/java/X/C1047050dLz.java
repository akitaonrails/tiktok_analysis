package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047050dLz extends AbstractC1893000zMQ {
    public TuxNavBar LL;
    public final String LLILLJJLI = "more";
    public SparkContext LLILLL;
    public C1250250idj LLILZ;

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r3 = this;
            X.0puj r1 = X.C1529870puj.LIZ
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LLILLL
            r2 = 0
            if (r0 != 0) goto L8
            r0 = r2
        L8:
            java.lang.String r0 = r0.containerId
            r1.getClass()
            X.0qEH r1 = X.C1529870puj.LJFF(r0)
            if (r1 == 0) goto L37
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
            if (r0 != 0) goto L18
            r1 = r2
        L18:
            if (r1 == 0) goto L37
            android.webkit.WebView r1 = (android.webkit.WebView) r1
        L1c:
            if (r1 == 0) goto L24
            java.lang.String r0 = r1.getUrl()
            if (r0 != 0) goto L2d
        L24:
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LLILLL
            if (r0 == 0) goto L29
            r2 = r0
        L29:
            java.lang.String r0 = r2.LJIJI()
        L2d:
            r2 = 0
            java.lang.String r1 = "target="
            boolean r1 = kotlin.text.a0.LJJIIZI(r0, r1, r2)
            if (r1 == 0) goto L53
            goto L39
        L37:
            r1 = r2
            goto L1c
        L39:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "target"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L53
            goto L51
        L46:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "profile_bio_link"
            X.C1720106oR.LIZJ(r0, r1)
        L51:
            java.lang.String r0 = ""
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047050dLz.LIZIZ():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() {
        /*
            r8 = this;
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            com.bytedance.hybrid.spark.SparkContext r0 = r8.LLILLL
            r4 = 0
            if (r0 != 0) goto Lb
            r0 = r4
        Lb:
            java.util.Map r6 = r0.LJJJ()
            java.lang.String r0 = "aweme_id"
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.LLILZ(r2)
            X.0puj r1 = X.C1529870puj.LIZ
            com.bytedance.hybrid.spark.SparkContext r0 = r8.LLILLL
            if (r0 != 0) goto L2e
            r0 = r4
        L2e:
            java.lang.String r0 = r0.containerId
            r1.getClass()
            X.0qEH r1 = X.C1529870puj.LJFF(r0)
            if (r1 == 0) goto Lb8
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
            if (r0 == 0) goto Lb8
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            if (r1 == 0) goto L47
            java.lang.String r5 = r1.getUrl()
            if (r5 != 0) goto L50
        L47:
            com.bytedance.hybrid.spark.SparkContext r0 = r8.LLILLL
            if (r0 == 0) goto L4c
            r4 = r0
        L4c:
            java.lang.String r5 = r4.LJIJI()
        L50:
            X.0qBS r0 = X.C1540240qBS.LIZ
            r0.getClass()
            int r4 = X.C1540240qBS.LIZIZ(r1)
            java.lang.String r1 = "report_type"
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r2 = r3.appendQueryParameter(r1, r0)
            java.lang.String r1 = "owner_id"
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r1, r0)
            java.lang.String r0 = "reported_url"
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r5)
            java.lang.String r1 = "page_depth"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            if (r7 == 0) goto La5
            java.lang.String r1 = r7.getAid()
            if (r1 != 0) goto La7
        La5:
            java.lang.String r1 = ""
        La7:
            java.lang.String r0 = "object_id"
            r2.appendQueryParameter(r0, r1)
            com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r1 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJJ()
            android.app.Activity r0 = X.C1537820q7Y.LIZLLL()
            r1.LIZIZ(r0, r3)
            return
        Lb8:
            r1 = r4
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047050dLz.LJIJ():void");
    }

    @Override // X.AbstractC1893000zMQ
    public final void LIZ(SparkContext sparkContext) {
        this.LLILLL = sparkContext;
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.ebz, C786410Ut5.ne(context), null);
        viewSd.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        this.LL = (TuxNavBar) viewSd.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZIZ = "back_btn";
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = "close_all_btn";
        c1251150ifB2.LJI = false;
        c0om1.LJ(c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_flag;
        c1251150ifB3.LIZIZ = "report_normal";
        c1251150ifB3.LJI = false;
        c0om1.LIZIZ(c1251150ifB3);
        C1251150ifB c1251150ifB4 = new C1251150ifB();
        c1251150ifB4.LIZLLL();
        c1251150ifB4.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB4.LIZIZ = this.LLILLJJLI;
        c1251150ifB4.LJI = false;
        c0om1.LIZIZ(c1251150ifB4);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        return this.LL;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        View viewLJII;
        View viewLJII2;
        int i = C1067670dtF.LIZ[enumC1067700dtI.ordinal()];
        View viewLJII3 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    TuxNavBar tuxNavBar = this.LL;
                    if (tuxNavBar != null) {
                        viewLJII3 = tuxNavBar.LJII("report_normal");
                    }
                    C12ES.LJIILL(8, viewLJII3);
                } else {
                    TuxNavBar tuxNavBar2 = this.LL;
                    if (tuxNavBar2 != null) {
                        viewLJII3 = tuxNavBar2.LJII(this.LLILLJJLI);
                    }
                    C12ES.LJIILL(0, viewLJII3);
                }
            } else {
                SparkContext sparkContext = this.LLILLL;
                if (sparkContext == null) {
                    sparkContext = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJIJI()), "need_report");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    SparkContext sparkContext2 = this.LLILLL;
                    if (sparkContext2 == null) {
                        sparkContext2 = null;
                    }
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = sparkContext2.LJJJ().get("need_report");
                }
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    TuxNavBar tuxNavBar3 = this.LL;
                    if (tuxNavBar3 != null) {
                        viewLJII3 = tuxNavBar3.LJII("report_normal");
                    }
                    C12ES.LJIILL(8, viewLJII3);
                } else {
                    TuxNavBar tuxNavBar4 = this.LL;
                    if (tuxNavBar4 != null) {
                        viewLJII3 = tuxNavBar4.LJII("report_normal");
                    }
                    C12ES.LJIILL(0, viewLJII3);
                }
            }
        } else {
            TuxNavBar tuxNavBar5 = this.LL;
            if (tuxNavBar5 != null) {
                viewLJII3 = tuxNavBar5.LJII("report_normal");
            }
            C12ES.LJIILL(8, viewLJII3);
        }
        TuxNavBar tuxNavBar6 = this.LL;
        if (tuxNavBar6 != null && (viewLJII2 = tuxNavBar6.LJII("report_normal")) != null) {
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 130), viewLJII2);
        }
        TuxNavBar tuxNavBar7 = this.LL;
        if (tuxNavBar7 != null && (viewLJII = tuxNavBar7.LJII(this.LLILLJJLI)) != null) {
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 131), viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        View viewLJII = null;
        if (z) {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                viewLJII = tuxNavBar.LJII("close_all_btn");
            }
            C12ES.LJIILL(0, viewLJII);
            return;
        }
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 != null) {
            viewLJII = tuxNavBar2.LJII("close_all_btn");
        }
        C12ES.LJIILL(8, viewLJII);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, this.LL);
        } else {
            C12ES.LJIILL(8, this.LL);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("back_btn")) != null) {
            C786410Ut5.I7(onClickListener, viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("close_all_btn")) != null) {
            C786410Ut5.I7(onClickListener, viewLJII);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        if (this.LLILZ == null) {
            this.LLILZ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLILZ;
        if (c1250250idj != null) {
            c1250250idj.LIZLLL = str;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        if (this.LLILZ == null) {
            this.LLILZ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLILZ;
        if (c1250250idj != null) {
            c1250250idj.LIZJ = str;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }
}
