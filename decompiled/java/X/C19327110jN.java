package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS162S0100000_28;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19327110jN extends AbstractC1893000zMQ {
    public static final List<String> LLJILJILJ = C1697810uHb.LJIIJJI("tiktokv.com", "tiktokcdn.com", "byteoversea.com", "sgsnssdk.com", "isnssdk.com", "ibyteimg.com", "ibytedtos.com", "tiktok.com", "xzcs3zlph.com");
    public final C19327310jP LL;
    public TuxNavBar LLILLJJLI;
    public String LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(352));
    public SparkContext LLILZIL;
    public SparkActivity LLILZLL;
    public final Aweme LLIZ;
    public final Integer LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
    }

    public final void LIZIZ() {
        SparkContext sparkContext = this.LLILZIL;
        if (sparkContext == null) {
            sparkContext = null;
        }
        WebKitView webKitViewLIZ = C19327210jO.LIZ(sparkContext);
        String url = webKitViewLIZ != null ? webKitViewLIZ.getUrl() : null;
        SparkActivity sparkActivity = this.LLILZLL;
        C20145713s7.LIZJ((ClipboardManager) (sparkActivity != null ? C786410Ut5.M2(sparkActivity, "clipboard") : null), ClipData.newPlainText(url, url), CertProviderManagerKt.findCert("bpea-article_3d_party_webpage", 1476399124));
        SparkActivity sparkActivity2 = this.LLILZLL;
        if (sparkActivity2 != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(sparkActivity2);
            c1389890mGx.LJIIIZ(2131829543);
            c1389890mGx.LJIIJJI();
        }
        ArticleModeService.INSTANCE.getArticleLoggingService().logClickCopyLink();
    }

    public final void LJIJ() {
        String url;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        SparkContext sparkContext = this.LLILZIL;
        if (sparkContext == null) {
            sparkContext = null;
        }
        WebKitView webKitViewLIZ = C19327210jO.LIZ(sparkContext);
        if (webKitViewLIZ != null && (url = webKitViewLIZ.getUrl()) != null && url.length() != 0) {
            intent.setData(UriProtector.parse(url));
            Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(url));
            SparkActivity sparkActivity = this.LLILZLL;
            if (sparkActivity != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(sparkActivity, intent2, "Context_startActivity_1");
                C1701330uNH.LIZ(intent2, sparkActivity);
                C2204961BRm.LLLIZZ(sparkActivity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYYnH2SWQLUUeOXqNSZIUPG6HAPnadXM8mLHw1lTeHcslaH0=", null));
            }
        }
        this.LL.LIZJ.invoke();
        ArticleModeService.INSTANCE.getArticleLoggingService().logClickOpenOtherBrowser(this.LL.LIZIZ, this.LLJILJIL);
    }

    public C19327110jN(C19327310jP c19327310jP) {
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        this.LL = c19327310jP;
        Aweme aweme = c19327310jP.LIZ;
        this.LLIZ = aweme;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf = Integer.valueOf(imageList.size());
        } else {
            numValueOf = null;
        }
        this.LLIZLLLIL = numValueOf;
        this.LLJ = aweme.getRequestId();
        this.LLJI = C1381730m3n.LIZ(aweme);
        this.LLJIJIL = AwemeExtKt.getAuthorUid(aweme);
        this.LLJILJIL = aweme.getAid();
    }

    @Override // X.AbstractC1893000zMQ
    public final void LIZ(SparkContext sparkContext) {
        SparkActivity sparkActivity;
        this.LLILZIL = sparkContext;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ != null && (interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity)) {
            sparkActivity = (SparkActivity) interfaceC1059280dfiLJJIJLIJ;
        } else {
            sparkActivity = null;
        }
        this.LLILZLL = sparkActivity;
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.ra, C786410Ut5.ne(context), null);
        viewSd.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        this.LLILLJJLI = (TuxNavBar) viewSd.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZIZ = "back_btn";
        c1251150ifB.LJI = false;
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = "close_all_btn";
        c1251150ifB2.LJI = false;
        c0om1.LJ(c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB3.LIZIZ = "more";
        c1251150ifB3.LJI = false;
        c0om1.LIZIZ(c1251150ifB3);
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(true);
        }
        return viewSd;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        View viewLJII;
        View viewLJII2;
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            viewLJII = tuxNavBar.LJII("more");
        } else {
            viewLJII = null;
        }
        C12ES.LJIILL(4, viewLJII);
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 != null && (viewLJII2 = tuxNavBar2.LJII("more")) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 99), viewLJII2);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        int i;
        View viewLJII;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            viewLJII = tuxNavBar.LJII("close_all_btn");
        } else {
            viewLJII = null;
        }
        C12ES.LJIILL(i, viewLJII);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C12ES.LJIILL(i, this.LLILLJJLI);
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("close_all_btn")) != null) {
            C786410Ut5.I7(new ACListenerS119S0200000_16(onClickListener, this, 21), viewLJII);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        View viewLJII;
        String str2 = this.LLILLL;
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            String host = UriProtector.parse(str).getHost();
            if (host != null && host.length() != 0) {
                for (String str3 : LLJILJILJ) {
                    if (!Intrinsics.LJFF(host, str3)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('.');
                        sbLIZ.append(str3);
                        if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            C1250250idj c1250250idj = (C1250250idj) this.LLILZ.getValue();
            c1250250idj.LIZLLL = str;
            TuxNavBar tuxNavBar = this.LLILLJJLI;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
            TuxNavBar tuxNavBar2 = this.LLILLJJLI;
            if (tuxNavBar2 != null) {
                viewLJII = tuxNavBar2.LJII("more");
            } else {
                viewLJII = null;
            }
            C12ES.LJIILL(0, viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        this.LLILLL = str;
        C1250250idj c1250250idj = (C1250250idj) this.LLILZ.getValue();
        c1250250idj.LIZJ = str;
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }
}
