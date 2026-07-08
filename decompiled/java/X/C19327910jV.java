package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19327910jV extends AbstractC1066890drz {
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public final C1067330dsh LLJILJIL = new InterfaceC2217701Bqy() { // from class: X.0dsh
        @Override // X.InterfaceC2217701Bqy
        public final Context LIZJ(Context context) {
            return context;
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJIILLIIL(boolean z) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJIL(Activity activity, Context context) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJI(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIII(SparkActivity sparkActivity, boolean z) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIIJZLJL(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJJ(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJJJJ(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJJJLL(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJJJZI(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLIIIJJI(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
            return false;
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLL(SparkActivity sparkActivity) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void finish() {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void onActivityResult(int i, int i2, Intent intent) {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void onRestoreInstanceState(Bundle bundle) {
        }

        @Override // X.InterfaceC1163130gND
        public final void release() {
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJIJIIJI(SparkActivity sparkActivity) {
            this.LL.LLJIJIL = System.nanoTime() - this.LL.LLJIJIL;
        }

        @Override // X.InterfaceC2217701Bqy
        public final void LJJLJLI(SparkActivity sparkActivity) {
            C19327910jV c19327910jV = this.LL;
            if (c19327910jV.LLJIJIL != 0) {
                c19327910jV.LLJIJIL = System.nanoTime() - this.LL.LLJIJIL;
            }
        }
    };

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "webview";
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 717);
        return new C1400390mXt(awS572S0100000_28, awS572S0100000_28, awS572S0100000_28, null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C19327910jV();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ARTICLE_PHOTO_MODE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            LJJIJIIJI(c2344009Gk);
            LJJIIJ(c2344009Gk);
        }
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        c2344009Gk.LIZJ(LJIIZILJ().getAwemeType(), "aweme_type");
        String strLIZ = C1381730m3n.LIZ(LJIIZILJ());
        if (strLIZ != null) {
            c2344009Gk.LJFF("photo_content_type", strLIZ);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            LJJIJIIJI(c2344009Gk);
            super.p1(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, final C2344009Gk c2344009Gk) {
        String schema;
        Uri uri;
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        List<PhotoModeImageUrlModel> imageList;
        LJIILJJIL();
        try {
            if (C036E.LIZ.LIZIZ()) {
                InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
                final Integer numValueOf = null;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
                PhotoModeImageInfo photoModeImageInfo = LJIIZILJ().getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList.size());
                }
                AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && (uri = UriProtector.parse(schema)) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null) {
                    c2344009Gk.LJIIIZ("enter_from");
                    c2344009Gk.LJFF("enter_from", LJIJJLI());
                    c2344009Gk.LJIIIZ("group_id");
                    c2344009Gk.LJFF("group_id", LJIIZILJ().getAid());
                    c2344009Gk.LJIIIZ("author_id");
                    String authorUid = AwemeExtKt.getAuthorUid(LJIIZILJ());
                    if (authorUid == null) {
                        authorUid = "";
                    }
                    c2344009Gk.LJFF("author_id", authorUid);
                    c2344009Gk.LJIIIZ("music_id");
                    c2344009Gk.LJFF("music_id", C735370Ssx.LJIILIIL(LJIIZILJ()));
                    c2344009Gk.LJIIIZ("anchor_id");
                    c2344009Gk.LJFF("anchor_id", ((C1065100dp6) LJJJJJL()).LIZ());
                    c2344009Gk.LJIIIZ("anchor_name");
                    c2344009Gk.LJFF("anchor_name", ((C1065100dp6) LJJJJJL()).LIZIZ());
                    c2344009Gk.LJIIIZ("anchor_type");
                    c2344009Gk.LJFF("anchor_type", ((C1065100dp6) LJJJJJL()).LJ());
                    LJJIJIIJI(c2344009Gk);
                    LJJII(c2344009Gk, true, true);
                    Aweme awemeLJIIZILJ = LJIIZILJ();
                    anchorCommonStruct.getId();
                    ArticleModeService.INSTANCE.getArticleAnchorService().openRelatedArticle(activityLIZIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new C19327310jP(awemeLJIIZILJ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new AwS272S0300000_28(this, c2344009Gk, numValueOf, 9)), new AbstractC1539010q9T() { // from class: X.10jT
                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            if (C1324240kZ4.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
                                final C19327910jV c19327910jV = this.LLILLJJLI;
                                final String str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                                final C2344009Gk c2344009Gk2 = c2344009Gk;
                                final Integer num = numValueOf;
                                c19327910jV.getClass();
                                ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.10jS
                                    @Override // X.AbstractC2205961BVi
                                    public final void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                                        if (str2 != null && str2.length() != 0) {
                                            C19327910jV c19327910jV2 = c19327910jV;
                                            if (c19327910jV2.LLJ == 0) {
                                                c19327910jV2.LLJ = System.nanoTime();
                                                return;
                                            }
                                            Uri uri2 = UriProtector.parse(str2);
                                            Uri uri3 = UriProtector.parse(str);
                                            if (c19327910jV.LLJI == 0 && Intrinsics.LJFF(uri2.getHost(), uri3.getHost())) {
                                                c19327910jV.LLJI = System.nanoTime();
                                                ArticleModeService.INSTANCE.getArticleLoggingService().logEnterArticleDetail(c2344009Gk2, num);
                                            }
                                        }
                                    }
                                };
                            }
                        }
                    }, new AbstractC1542200qEc() { // from class: X.10jU
                        @Override // X.AbstractC1537870q7d
                        public final void onDestroy() {
                            long jNanoTime = System.nanoTime();
                            C19327910jV c19327910jV = this.LLILLJJLI;
                            long j = c19327910jV.LLJI;
                            long j2 = c19327910jV.LLJIJIL;
                            long j3 = (jNanoTime - j) - (jNanoTime - j2) > 0 ? (jNanoTime - j) - (jNanoTime - j2) : j2 > 0 ? (jNanoTime - j) - j2 : jNanoTime - j;
                            C2344009Gk c2344009Gk2 = c2344009Gk;
                            Integer num = numValueOf;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c19327910jV.LJJIJIIJIL(c2344009Gk2, num, timeUnit.toMillis(j3));
                            C19327910jV c19327910jV2 = this.LLILLJJLI;
                            long j4 = c19327910jV2.LLJ;
                            long j5 = c19327910jV2.LLJIJIL;
                            long j6 = (jNanoTime - j4) - (jNanoTime - j5) > 0 ? (jNanoTime - j4) - (jNanoTime - j5) : j5 > 0 ? (jNanoTime - j4) - j5 : jNanoTime - j4;
                            if (j4 != 0) {
                                ArticleModeService.INSTANCE.getArticleLoggingService().logMultiAnchorStayTime(c2344009Gk, timeUnit.toMillis(j6));
                            }
                            C19327910jV c19327910jV3 = this.LLILLJJLI;
                            c19327910jV3.LLJ = 0L;
                            c19327910jV3.LLJIJIL = 0L;
                        }
                    }, this.LLJILJIL);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C0XF1.LIZIZ(LJIILJJIL())) {
            C1389890mGx c1389890mGx = new C1389890mGx(LJIILJJIL());
            c1389890mGx.LJIIIZ(2131829441);
            c1389890mGx.LJIIJJI();
            return;
        }
        C1626990sRN.LIZIZ(LJIILJJIL());
    }

    public final void LJJIJIIJIL(C2344009Gk c2344009Gk, Integer num, long j) {
        if (this.LLJI != 0 && j >= 0) {
            ArticleModeService articleModeService = ArticleModeService.INSTANCE;
            articleModeService.getArticleLoggingService().logArticleDetailStaytime(c2344009Gk, num, Long.valueOf(j));
            articleModeService.getArticleLoggingService().logArticleDetailExit("back");
            this.LLJI = 0L;
        }
    }
}
