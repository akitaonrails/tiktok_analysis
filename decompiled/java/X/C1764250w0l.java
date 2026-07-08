package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorDataVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorItemData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import g1c.AjS22S0300000_26;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS9S0220000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764250w0l extends AbstractC1764240w0k<C1764270w0n, TabIndicatorDataVO> implements InterfaceC1764720w1W {
    @Override // X.AbstractC1764240w0k
    public final FrameLayout.LayoutParams LJIIJJI() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) C0H9H.LIZ(20));
        layoutParams.gravity = 8388693;
        float f = 16;
        layoutParams.bottomMargin = (int) C0H9H.LIZ(f);
        layoutParams.rightMargin = (int) C0H9H.LIZ(f);
        return layoutParams;
    }

    @Override // X.AbstractC1764240w0k
    public final boolean LJIILIIL(TabIndicatorDataVO tabIndicatorDataVO) {
        Integer numValueOf;
        Object objLIZ;
        String str;
        C04G1 c04g1Mw;
        C04FY c04fy;
        List<TabIndicatorItemData> list;
        int iIntValue;
        TabIndicatorDataVO tabIndicatorDataVO2 = tabIndicatorDataVO;
        C1764270w0n c1764270w0n = (C1764270w0n) this.LL;
        ISeaListHelper iSeaListHelperLJIIL = LJIIL();
        if (iSeaListHelperLJIIL != null) {
            numValueOf = Integer.valueOf(iSeaListHelperLJIIL.sz());
        } else {
            numValueOf = null;
        }
        c1764270w0n.LL = tabIndicatorDataVO2;
        int i = 0;
        if (c1764270w0n.LLILLJJLI == -1) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            c1764270w0n.LLILLJJLI = iIntValue;
        }
        if (c1764270w0n.LLILZIL.getChildCount() != 0) {
            C786410Ut5.LJJJJJL(c1764270w0n.LLILZIL);
        }
        TabIndicatorDataVO tabIndicatorDataVO3 = c1764270w0n.LL;
        if (tabIndicatorDataVO3 != null && (list = tabIndicatorDataVO3.tabData) != null) {
            int i2 = 0;
            for (TabIndicatorItemData tabIndicatorItemData : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    TabIndicatorItemData tabIndicatorItemData2 = tabIndicatorItemData;
                    C1764260w0m c1764260w0m = new C1764260w0m(c1764270w0n.getContext());
                    c1764260w0m.LLJJJJ = tabIndicatorItemData2;
                    c1764260w0m.LLJJJJJIL = i2;
                    C786410Ut5.I7(new AjS22S0300000_26(c1764270w0n, c1764260w0m, tabIndicatorItemData2, 7), c1764260w0m);
                    c1764270w0n.LLILZIL.addView(c1764260w0m, new FrameLayout.LayoutParams(-2, -1));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c1764270w0n.setTabPosition(c1764270w0n.LLILLJJLI);
        List<TabIndicatorItemData> list2 = tabIndicatorDataVO2.tabData;
        if (list2 != null) {
            for (TabIndicatorItemData tabIndicatorItemData3 : list2) {
                int i4 = i + 1;
                if (i >= 0) {
                    TabIndicatorItemData tabIndicatorItemData4 = tabIndicatorItemData3;
                    PageStateContext pageStateContext = (PageStateContext) this.LLILZLL.getValue();
                    if (pageStateContext != null) {
                        objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
                    } else {
                        objLIZ = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(objLIZ, 2);
                    ISeaListHelper iSeaListHelperLJIIL2 = LJIIL();
                    if (iSeaListHelperLJIIL2 != null && (c04g1Mw = iSeaListHelperLJIIL2.Mw()) != null && (c04fy = c04g1Mw.LJIJJLI) != null) {
                        str = c04fy.LIZ;
                    } else {
                        str = null;
                    }
                    boolean zLJFF2 = Intrinsics.LJFF(str, "video_style");
                    if (i < ((C1764270w0n) this.LL).getRealChildCount()) {
                        C1748720vbi.LJFF(((C1764270w0n) this.LL).LLILZIL.getChildAt(i), new C049X(), new AwS570S0100000_26(tabIndicatorItemData4, 1404), new AwS9S0220000_26(this, zLJFF, zLJFF2, tabIndicatorItemData4, 2));
                    }
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return true;
    }

    public C1764250w0l(C1764190w0f c1764190w0f, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1764270w0n c1764270w0n = new C1764270w0n(c1764190w0f.getContext());
        super(c1764270w0n, interfaceC665370Q7z);
        c1764270w0n.setClickStrategy(new AwS640S0100000_26(this, 110));
    }

    @Override // X.InterfaceC1764720w1W
    public final void LLJLL(int i, EnumC1764120w0Y enumC1764120w0Y) {
        ((C1764270w0n) this.LL).setTabPosition(i);
    }
}
