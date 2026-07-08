package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659360Pte {
    public static final String LIZ(Aweme aweme) {
        int totalProductAnchors;
        int iLJJJJIZL = 0;
        if (aweme != null) {
            totalProductAnchors = AwemeBizExtKt.getTotalProductAnchors(aweme);
        } else {
            totalProductAnchors = 0;
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null) {
            iLJJJJIZL = iEcomSearchService.LJJJJIZL();
        }
        if (totalProductAnchors <= 0) {
            return "";
        }
        if (iLJJJJIZL == 1) {
            return "search_video_top_icon";
        }
        if (totalProductAnchors == 1) {
            return "search_video_single_anchor";
        }
        return "search_video_multi_anchor";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L47
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAnimatedCover()
            if (r0 != 0) goto L19
        Lf:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDynamicCover()
        L19:
            boolean r2 = LIZJ(r0)
            if (r4 == 0) goto L45
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAiDynamicCover()
        L29:
            boolean r1 = LIZJ(r0)
            if (r4 == 0) goto L39
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getAiDynamicCoverBak()
        L39:
            boolean r0 = LIZJ(r3)
            if (r2 != 0) goto L49
            if (r1 != 0) goto L49
            if (r0 != 0) goto L49
            r0 = 0
            return r0
        L45:
            r0 = r3
            goto L29
        L47:
            r0 = r3
            goto L19
        L49:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659360Pte.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final boolean LIZJ(UrlModel urlModel) {
        List<String> urlList;
        String str;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null || !C703302op.LIZ(str)) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(View view, Aweme aweme, final C653660PkS c653660PkS, Map map) {
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        String str = c653660PkS.LJIIIIZZ;
        if (str.length() == 0) {
            return;
        }
        String str2 = c653660PkS.LJIJI;
        if (str2.length() == 0) {
            str2 = c653660PkS.LJJLIIIJILLIZJL;
        }
        C654720PmA<C659810PuN> c654720PmA = new C654720PmA<C659810PuN>(c653660PkS) { // from class: X.0PuN
            {
                LJJIL();
            }
        };
        c654720PmA.LJJIIZI(c653660PkS.LJIIJ);
        c654720PmA.LJJIJ(c653660PkS.LJFF);
        c654720PmA.LJIJJ(str);
        c654720PmA.LJJIIZ(Integer.valueOf(c653660PkS.LJIILL));
        c654720PmA.LJJIJIIJI(str2);
        if (aweme != null) {
            c654720PmA.LJIL(C735370Ssx.LIZJ(aweme));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                numValueOf = Integer.valueOf(imageList.size());
            } else {
                numValueOf = null;
            }
            c654720PmA.LJJIIJZLJL(numValueOf);
        }
        String str3 = c653660PkS.LJIIIZ;
        if (str3.length() > 0) {
            c654720PmA.LJIIZILJ("enter_method", str3);
        }
        String str4 = c653660PkS.LJJIJIIJIL;
        if (str4 != null) {
            c654720PmA.LJJII(str4);
        }
        Integer num = c653660PkS.LJIILLIIL;
        if (num != null) {
            c654720PmA.LJIIZILJ("universal_rank", String.valueOf(num.intValue()));
            c654720PmA.LJIIZILJ("insert_type", c653660PkS.LJIIZILJ);
        }
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654720PmA, view, str2, null);
        }
        C645930PVf.LIZ(c654720PmA);
        c654720PmA.LJIJ(map);
        c654720PmA.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.String r11, X.C653660PkS r12, android.view.View r13, X.C0OBO r14, java.lang.String r15, int r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659360Pte.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.0PkS, android.view.View, X.0OBO, java.lang.String, int, java.util.Map):void");
    }
}
