package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776090wJr implements InterfaceC1585190rLx {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        switch (this.$t) {
            case 0:
                p1$0(this, str, str2);
                break;
            case 1:
                p1$1(this, str, str2);
                break;
            case 2:
                p1$2(this, str, str2);
                break;
            case 3:
                p1$3(this, str, str2);
                break;
            case 4:
                p1$4(this, str, str2);
                break;
            case 5:
                p1$5(this, str, str2);
                break;
        }
    }

    public C1776090wJr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void p1$0(C1776090wJr c1776090wJr, String str, String str2) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopTab Tooltip TooltipAvoid onTabChange from: ");
        sbLIZ.append(str);
        sbLIZ.append(" to: ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        ((CustomDotAssem) c1776090wJr.l0).m183do().LLIZLLLIL = str2;
        if (Intrinsics.LJFF("SHOP_MALL", str2)) {
            ((CustomDotAssem) c1776090wJr.l0).m183do().CQ2();
        }
    }

    public static final void p1$1(C1776090wJr c1776090wJr, String str, String str2) {
        if (Intrinsics.LJFF("Shop", str2)) {
            ((CustomDotAssem) c1776090wJr.l0).m183do().CQ2();
        }
    }

    public static final void p1$2(C1776090wJr c1776090wJr, String str, String str2) {
        ((EcVideoGuideAssem) c1776090wJr.l0).getClass();
        if (((EcVideoGuideAssem) c1776090wJr.l0).LLLILZJ && Intrinsics.LJFF(str, "HOME")) {
            EcVideoGuideAssem ecVideoGuideAssem = (EcVideoGuideAssem) c1776090wJr.l0;
            ecVideoGuideAssem.Bp(EnumC1770130wAF.TAB_SWITCH, ecVideoGuideAssem.LLLIZZ);
        }
    }

    public static final void p1$3(C1776090wJr c1776090wJr, String str, String str2) {
        ((EcVideoGuideAssem) c1776090wJr.l0).getClass();
        if (((EcVideoGuideAssem) c1776090wJr.l0).LLLILZJ && Intrinsics.LJFF(str, "For You")) {
            EcVideoGuideAssem ecVideoGuideAssem = (EcVideoGuideAssem) c1776090wJr.l0;
            ecVideoGuideAssem.Bp(EnumC1770130wAF.TAB_SWITCH, ecVideoGuideAssem.LLLIZZ);
        }
    }

    public static final void p1$4(C1776090wJr c1776090wJr, String str, String str2) {
        ((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).getClass();
        if (((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).LLLILZLLLI && Intrinsics.LJFF(str, "HOME")) {
            ((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).Bp(EnumC1770140wAG.TAB_SWITCH);
        }
    }

    public static final void p1$5(C1776090wJr c1776090wJr, String str, String str2) {
        ((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).getClass();
        if (((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).LLLILZLLLI && Intrinsics.LJFF(str, "For You")) {
            ((EcSearchNoCartFeedVideoGuideAssem) c1776090wJr.l0).Bp(EnumC1770140wAG.TAB_SWITCH);
        }
    }
}
