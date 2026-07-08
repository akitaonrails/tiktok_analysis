package Y;

import X.C09JN;
import X.C1012040cRW;
import X.C1026350cob;
import X.C1C7U;
import X.InterfaceC1014040cUk;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public class AfS42S1200000_16 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS42S1200000_16 afS42S1200000_16, Object obj) {
        InterfaceC1014040cUk interfaceC1014040cUk = (InterfaceC1014040cUk) afS42S1200000_16.l1;
        Aweme aweme = (Aweme) afS42S1200000_16.l2;
        String str = afS42S1200000_16.s0;
        C1C7U.LIZ("AdOpenBaseUtils@abbc.useSystemBrowserOpenWebPage$1L");
        if (!((Boolean) obj).booleanValue() && interfaceC1014040cUk != null && aweme.getAwemeRawAd() != null) {
            interfaceC1014040cUk.LIZJ(aweme.getAwemeRawAd().getCreativeIdStr(), aweme.getAwemeRawAd().getLogExtra(), C1026350cob.LIZLLL(Integer.valueOf(C1012040cRW.LIZIZ().LJIIIIZZ)), str);
        }
        C1C7U.LIZIZ("AdOpenBaseUtils@abbc.useSystemBrowserOpenWebPage$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS42S1200000_16 r8, java.lang.Object r9) {
        /*
            java.lang.String r7 = "WishListManager@8a.loadUrl$2"
            X.C1C7U.LIZ(r7)
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r0 = r9.getSecond()
            X.0e7V r0 = (X.C1076510e7V) r0
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model.WishListGeckoResponse r0 = r0.LIZ
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model.LynxSchema r0 = r0.lynxSchema
            if (r0 == 0) goto L8b
            java.lang.String r5 = r0.renderUrl
            if (r5 == 0) goto L8b
            java.lang.Object r4 = r8.l1
            X.0e7S r4 = (X.C1076480e7S) r4
            java.lang.Object r3 = r8.l2
            com.bytedance.hybrid.spark.page.SparkFragment r3 = (com.bytedance.hybrid.spark.page.SparkFragment) r3
            java.lang.String r6 = r8.s0
            java.lang.String r2 = "aweme://lynxview"
            java.lang.String r1 = "aweme://lynxview/"
            r0 = 0
            java.lang.String r2 = kotlin.text.u.LJJIFFI(r5, r2, r1, r0)
            r5 = 1
            if (r6 == 0) goto L55
            int r0 = r6.length()
            if (r0 == 0) goto L55
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            java.lang.String r1 = "page_location"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r1)
            if (r0 == 0) goto L45
            int r0 = r0.length()
            if (r0 != 0) goto L55
        L45:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r6)
            android.net.Uri r2 = r0.build()
        L55:
            java.lang.String r6 = r2.toString()
            r4.LJI = r6
            X.0qEB r0 = r3.LLILLL
            if (r0 == 0) goto L8b
            com.bytedance.hybrid.spark.SparkContext r2 = r0.getSparkContext()
            if (r2 == 0) goto L8b
            X.0qEB r1 = r3.LLILLL
            if (r1 == 0) goto L84
            r2.LJJLIIJ(r6)
            com.ss.android.ugc.aweme.ad.experiment.AdForestData r0 = X.C1000150c8L.LIZ()
            boolean r0 = r0.enableLynxWishList
            if (r0 == 0) goto L79
            java.lang.String r0 = "use_forest"
            r2.LJJL(r0, r5)
        L79:
            X.0e7T r0 = new X.0e7T
            r0.<init>()
            r2.LJJJJLL(r0)
            r1.LJJIJ(r2)
        L84:
            X.0qEB r0 = r3.LLILLL
            if (r0 == 0) goto L8b
            r0.LJIIIIZZ()
        L8b:
            X.C1C7U.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS42S1200000_16.accept$1(Y.AfS42S1200000_16, java.lang.Object):void");
    }

    public static final void accept$2(AfS42S1200000_16 afS42S1200000_16, Object obj) {
        C1C7U.LIZ("FansClubViewModel@394b.showFansClubDialogFromCommentPanel$1");
        ((FansClubViewModel) afS42S1200000_16.l1).DQ2((LiveSheetFragment) afS42S1200000_16.l2, "-1", afS42S1200000_16.s0, false);
        C1C7U.LIZIZ("FansClubViewModel@394b.showFansClubDialogFromCommentPanel$1");
    }

    public AfS42S1200000_16(FansClubViewModel fansClubViewModel, LiveSheetFragment liveSheetFragment, int i) {
        this.$t = i;
        this.l1 = fansClubViewModel;
        this.l2 = liveSheetFragment;
        this.s0 = "comment_panel";
    }

    public AfS42S1200000_16(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
