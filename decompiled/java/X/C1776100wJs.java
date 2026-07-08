package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem$setUpAutoScroll$1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0wJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776100wJs implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrolled$1(C1776100wJs c1776100wJs, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) throws Throwable {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
        }
    }

    public static final void onPageScrollStateChanged$0(C1776100wJs c1776100wJs, int i) {
        if (i != 0) {
            if (i == 1) {
                ((SeaPdpBlackLightActivity) c1776100wJs.l0).LLJI = true;
                return;
            }
            return;
        }
        ((SeaPdpBlackLightActivity) c1776100wJs.l0).LLJI = false;
    }

    public static final void onPageScrollStateChanged$1(C1776100wJs c1776100wJs, int i) {
        EcTrendingBannerAssem$setUpAutoScroll$1 ecTrendingBannerAssem$setUpAutoScroll$1;
        if (i != 0) {
            if (i == 1 && (ecTrendingBannerAssem$setUpAutoScroll$1 = ((EcTrendingBannerAssem) c1776100wJs.l0).LLJJ) != null) {
                ecTrendingBannerAssem$setUpAutoScroll$1.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        ((EcTrendingBannerAssem) c1776100wJs.l0).Ho();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$0(X.C1776100wJs r11, int r12) throws java.lang.Throwable {
        /*
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity) r0
            X.0w1K r0 = r0.LLILZLL
            r4 = 0
            if (r0 == 0) goto L77
            java.util.List<X.0w1o> r0 = r0.LIZIZ
            if (r0 == 0) goto L77
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r12, r0)
            X.0w1o r0 = (X.C1764900w1o) r0
            if (r0 == 0) goto L77
            X.0w1p r1 = r0.LIZLLL
        L17:
            X.0w1p r0 = X.EnumC1764910w1p.VIDEO
            r2 = 1
            if (r1 == r0) goto L5e
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy> r5 = com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy r0 = (com.ss.android.ugc.aweme.ecommerce.api.SeaPdpDetailFragmentApiProxy) r0
            if (r0 == 0) goto L2f
            r0.LLLLLLLLLL()
        L2f:
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity) r0
            X.0w1K r0 = r0.LLILZLL
            if (r0 == 0) goto L7d
            java.util.List<X.0w1o> r0 = r0.LIZIZ
            if (r0 == 0) goto L7d
            java.util.Iterator r5 = r0.iterator()
            r3 = 0
        L40:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            if (r3 < 0) goto L79
            X.0w1o r0 = (X.C1764900w1o) r0
            androidx.fragment.app.Fragment r1 = r0.LJIIIZ
            if (r1 == 0) goto L5a
            if (r3 != r12) goto L5c
            r0 = 1
        L57:
            r1.setUserVisibleHint(r0)
        L5a:
            r3 = r2
            goto L40
        L5c:
            r0 = 0
            goto L57
        L5e:
            X.0w4Y r1 = X.C1766600w4Y.LIZ
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity) r0
            X.0w1K r0 = r0.LLILZLL
            if (r0 == 0) goto L75
            X.0w1C r0 = r0.LIZJ
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.LJFF
        L6e:
            r1.getClass()
            X.C1766600w4Y.LJIIIZ(r0, r2)
            goto L2f
        L75:
            r0 = r4
            goto L6e
        L77:
            r1 = r4
            goto L17
        L79:
            X.C1697810uHb.LJIJI()
            throw r4
        L7d:
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity) r0
            X.0vVF r3 = r0.LLIZ
            if (r3 == 0) goto Lb5
            java.lang.Object r0 = r11.l1
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb6
            java.util.Iterator r2 = r0.iterator()
        L8f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L8f
            r4 = r1
        La3:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Lb6
            int r0 = r4.intValue()
            if (r12 != r0) goto Lb6
            r0 = 1065353216(0x3f800000, float:1.0)
        Laf:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setAlpha(r0)
        Lb5:
            return
        Lb6:
            r0 = 0
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776100wJs.onPageSelected$0(X.0wJs, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$1(X.C1776100wJs r8, int r9) {
        /*
            r4 = 0
            r1 = 1
            if (r9 != 0) goto L6a
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            X.19g3 r1 = r0.LLJILJIL
            if (r1 == 0) goto L17
            java.lang.Object r0 = r8.l1
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r1.LLFFF(r0, r4)
        L17:
            java.lang.Object r0 = r8.l1
            java.util.List r0 = (java.util.List) r0
            int r9 = r0.size()
        L1f:
            int r4 = r9 + (-1)
        L21:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            X.0Ggg r0 = r0.LLJILJILJ
            if (r0 == 0) goto L2c
            r0.setSelectedIndex(r4)
        L2c:
            X.0vSk r1 = X.C1743160vSk.LIZ
            java.lang.Object r0 = r8.l1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame r2 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame) r2
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel r0 = r0.Go()
            com.bytedance.android.btm.api.model.PageFinder r5 = r0.LLILZLL
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel r0 = r0.Go()
            X.0vSC r0 = r0.LL
            r7 = 0
            if (r0 == 0) goto L68
            java.lang.String r6 = r0.LJIIIIZZ
        L51:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel r0 = r0.Go()
            X.0vSC r0 = r0.LL
            if (r0 == 0) goto L5f
            java.lang.String r7 = r0.LJFF
        L5f:
            java.lang.String r3 = "tiktokec_banner_show"
            r1.getClass()
            X.C1743160vSk.LIZ(r2, r3, r4, r5, r6, r7)
            return
        L68:
            r6 = r7
            goto L51
        L6a:
            java.lang.Object r0 = r8.l1
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r0 = r0 + 1
            if (r9 != r0) goto L81
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem) r0
            X.19g3 r0 = r0.LLJILJIL
            if (r0 == 0) goto L81
            r0.LLFFF(r1, r4)
        L81:
            java.lang.Object r0 = r8.l1
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r0 = r0 + 1
            if (r9 != r0) goto L1f
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776100wJs.onPageSelected$1(X.0wJs, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1776100wJs(Object obj, SeaPdpBlackLightActivity seaPdpBlackLightActivity, List<Integer> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = seaPdpBlackLightActivity;
    }

    public static final void onPageScrolled$0(C1776100wJs c1776100wJs, int i, float f, int i2) {
        Object next;
        SeaPdpBlackLightActivity seaPdpBlackLightActivity = (SeaPdpBlackLightActivity) c1776100wJs.l0;
        List list = (List) c1776100wJs.l1;
        if (list == null) {
            seaPdpBlackLightActivity.getClass();
            return;
        }
        C1744710vVF c1744710vVF = seaPdpBlackLightActivity.LLIZ;
        if (c1744710vVF == null || list.isEmpty()) {
            return;
        }
        float f2 = i + f;
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                float fAbs = Math.abs(f2 - ((Number) next).intValue());
                do {
                    Object next2 = it2.next();
                    float fAbs2 = Math.abs(f2 - ((Number) next2).intValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it2.hasNext());
            }
        }
        if (((Integer) next) == null) {
            return;
        }
        float fIntValue = f2 - r6.intValue();
        float fLIZLLL = 0.0f;
        if (fIntValue >= -1.0f && fIntValue <= 1.0f) {
            fLIZLLL = C13LZ.LIZLLL(1 - Math.abs(fIntValue), 0.0f, 1.0f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1744710vVF);
        c1744710vVF.setAlpha(fLIZLLL);
    }
}
