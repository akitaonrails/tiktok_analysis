package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769080w8Y extends AbstractC1769070w8X {
    public C1769140w8e LJIIL;
    public InterfaceC20236714Gf<? super Unit> LJIILIIL;
    public InterfaceC20236714Gf<? super Unit> LJIILJJIL;
    public Long LJIILL;

    @Override // X.AbstractC1769070w8X
    public final EnumC1768880w8E LJ() {
        return EnumC1768880w8E.TAB_TOOLTIP;
    }

    @Override // X.InterfaceC1769490w9D
    public final void LIZ(EnumC1769260w8q enumC1769260w8q) {
        C1769140w8e c1769140w8e;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync TooltipTask===== hide");
        if (this.LJIIJ == EnumC1769280w8s.SHOWING && (c1769140w8e = this.LJIIL) != null) {
            LJII(EnumC1769280w8s.HIDING);
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== hide tooltip");
            this.LIZIZ.CI(new C1769140w8e(false, c1769140w8e.LIZIZ, c1769140w8e.LIZJ, c1769140w8e.LIZLLL, c1769140w8e.LJ, c1769140w8e.LJFF, c1769140w8e.LJI, (Map<String, ? extends Object>) c1769140w8e.LJII, enumC1769260w8q, c1769140w8e.LJIIIZ, c1769140w8e.LJIIJ, c1769140w8e.LJIIJJI));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf A[Catch: all -> 0x02fd, TryCatch #4 {all -> 0x02fd, blocks: (B:130:0x02e5, B:131:0x02e8, B:17:0x004d, B:81:0x019f, B:83:0x01bf, B:87:0x01cd, B:89:0x01d7, B:92:0x01dd, B:95:0x020c, B:104:0x0222, B:105:0x0224, B:107:0x022c, B:112:0x0235, B:113:0x0237, B:116:0x0253, B:118:0x025d, B:119:0x0266, B:121:0x027f, B:123:0x0285, B:124:0x0287, B:127:0x02de, B:77:0x016f), top: B:147:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c A[Catch: all -> 0x02fd, TRY_ENTER, TryCatch #4 {all -> 0x02fd, blocks: (B:130:0x02e5, B:131:0x02e8, B:17:0x004d, B:81:0x019f, B:83:0x01bf, B:87:0x01cd, B:89:0x01d7, B:92:0x01dd, B:95:0x020c, B:104:0x0222, B:105:0x0224, B:107:0x022c, B:112:0x0235, B:113:0x0237, B:116:0x0253, B:118:0x025d, B:119:0x0266, B:121:0x027f, B:123:0x0285, B:124:0x0287, B:127:0x02de, B:77:0x016f), top: B:147:0x002b }] */
    @Override // X.InterfaceC1769490w9D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.EnumC1768880w8E> r32) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1769080w8Y.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final Pair<Boolean, String> LJIIIZ(DiversionEntranceResCfg diversionEntranceResCfg) {
        Aweme awemeG3;
        if (!this.LIZIZ.K71()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: shop_tab_not_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.SHOP_TAB_NOT_SHOWING.getValue());
        }
        if (this.LIZIZ.LK1()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: inbox_tooltip_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.INBOX_TOOLTIP_SHOWING.getValue());
        }
        if (this.LIZIZ.Qt2()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: fyp_profile_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.FYP_PROFILE_SHOWING.getValue());
        }
        if (this.LIZIZ.Yh1()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: video_guide_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.VIDEO_GUIDE_SHOWING.getValue());
        }
        if (this.LIZIZ.Ge2()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: vsa_tooltip_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.VSA_TOOLTIP_SHOWING.getValue());
        }
        if (!this.LIZIZ.hh0() && this.LIZIZ.qb0()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: fyp_comment_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.FYP_COMMENT_SHOWING.getValue());
        }
        Boolean bool = diversionEntranceResCfg.avoidAdVideo;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && this.LIZIZ.ge2()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: home_tab_adsvideo_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.HOME_TAB_ADSVIDEO_SHOWING.getValue());
        }
        if (Intrinsics.LJFF(diversionEntranceResCfg.avoidSearchSugWord, bool2) && (awemeG3 = this.LIZIZ.G3()) != null && !C315220CXg.LIZ().LJLILLLLZI(awemeG3, true, true)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== show tooltip fail: home_tab_search_word_showing");
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.HOME_TAB_SEARCH_WORD_SHOWING.getValue());
        }
        if (this.LIZIZ.fc0()) {
            return new Pair<>(Boolean.FALSE, EnumC1768980w8O.UG_DELIVERY_LIMIT_IN_FYP.getValue());
        }
        return new Pair<>(bool2, null);
    }

    public C1769080w8Y(InterfaceC497601wk interfaceC497601wk, InterfaceC1769150w8f interfaceC1769150w8f, EnumC341090DYt enumC341090DYt, ReachCfgDataTransfer reachCfgDataTransfer, EnumC1768880w8E enumC1768880w8E, InterfaceC1769450w99 interfaceC1769450w99) {
        super(interfaceC497601wk, interfaceC1769150w8f, enumC341090DYt, reachCfgDataTransfer, enumC1768880w8E, interfaceC1769450w99);
    }
}
