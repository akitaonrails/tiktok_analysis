package X;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.BTMModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ContainerStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemData;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.RightFixedItemData;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItemBorder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774420wHA extends AbstractC1773460wFc<C1774040wGY> implements InterfaceC1772610wEF {
    public final ViewGroup LLJJIJI;
    public final C1774480wHG LLJJIJIIJIL;
    public C1775090wIF LLJJIJIL;
    public C1774040wGY LLJJJ;
    public final C1774470wHF LLJJJIL;
    public final C1774450wHD LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C1768170w75 LLJJL;
    public final InterfaceC1774150wGj LLJJLIIIJLLLLLLLZ;
    public ContainerStyle LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public C1774040wGY LLJLLL;
    public boolean LLJZ;
    public final ViewOnLayoutChangeListenerC1775800wJO LLJZIJLIL;

    public final void C6() {
        C1774040wGY c1774040wGY;
        TabBarCardItem tabBarCardItem;
        C1775090wIF c1775090wIF;
        FixedItemData fixedItemDataLIZ;
        String str;
        String str2;
        Set linkedHashSet;
        C1775090wIF c1775090wIF2 = this.LLJJIJIL;
        if (!this.LLJLLIL || !this.LLJLL || c1775090wIF2 == null || c1775090wIF2.getVisibility() != 0 || this.LLJJIJI.getHeight() <= 1 || (c1774040wGY = this.LLJJJ) == null || (tabBarCardItem = c1774040wGY.LJJ) == null || (c1775090wIF = this.LLJJIJIL) == null || !c1775090wIF.LJI() || (fixedItemDataLIZ = tabBarCardItem.LIZ()) == null || (str = fixedItemDataLIZ.schema) == null) {
            return;
        }
        BTMModel bTMModel = tabBarCardItem.rightFixedItemBTM;
        if (bTMModel == null || (str2 = bTMModel.btm) == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('|');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null) {
            Object objLIZLLL = this.LL.LIZ().LIZLLL("mix_mall_feed_tab_bar_cate_icon_exposure_keys", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            if (!C19719512Dh.LJIIIIZZ(objLIZLLL) || (linkedHashSet = (Set) objLIZLLL) == null) {
                linkedHashSet = new LinkedHashSet();
                this.LL.LIZ().LJ("mix_mall_feed_tab_bar_cate_icon_exposure_keys", linkedHashSet, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
            if (linkedHashSet.add(strLIZIZ)) {
                this.LL.LIZ().LJ("mix_mall_feed_tab_bar_cate_icon_exposure_keys", linkedHashSet, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                J6("tiktokec_module_show");
            }
        }
    }

    public final Map<String, String> v6() {
        String string;
        Object objLIZLLL = this.LL.LIZ().LIZLLL("page_name", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        String string2 = objLIZLLL != null ? objLIZLLL.toString() : null;
        String str = "";
        if (string2 == null) {
            string2 = "";
        }
        if (a0.LJJJIL(string2)) {
            string2 = "mall";
        }
        Object objLIZLLL2 = this.LL.LIZ().LIZLLL("enter_from", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        if (objLIZLLL2 != null && (string = objLIZLLL2.toString()) != null) {
            str = string;
        }
        if (a0.LJJJIL(str)) {
            str = string2;
        }
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("previous_page", string2), new Pair("enter_from", str), new Pair("enter_method", "mall_click"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapLJII.entrySet()) {
            if (!a0.LJJJIL((String) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final View w6() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    public final void J6(String str) {
        String str2;
        TabBarCardItem tabBarCardItem;
        BTMModel bTMModel;
        TabBarCardItem tabBarCardItem2;
        RightFixedItemData rightFixedItemData;
        Pair[] pairArr = new Pair[1];
        C1774040wGY c1774040wGY = this.LLJJJ;
        if (c1774040wGY == null || (tabBarCardItem2 = c1774040wGY.LJJ) == null || (rightFixedItemData = tabBarCardItem2.rightFixedItemData) == null || (str2 = rightFixedItemData.moduleName) == null) {
            str2 = "cate_icon";
        }
        pairArr[0] = new Pair("module_name", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1774040wGY c1774040wGY2 = this.LLJJJ;
        if (c1774040wGY2 != null && (tabBarCardItem = c1774040wGY2.LJJ) != null && (bTMModel = tabBarCardItem.rightFixedItemBTM) != null) {
            String str3 = bTMModel.btm;
            if (str3 != null) {
                mapLJIIJ.put("btm", str3);
            }
            Map<String, ?> map = bTMModel.bcm;
            if (map != null) {
                mapLJIIJ.put("bcm", map);
            }
            Map<String, ?> map2 = bTMModel.btmUnitParams;
            if (map2 != null) {
                mapLJIIJ.put("btm_unit_params", map2);
            }
        }
        InterfaceC1773850wGF interfaceC1773850wGF = (InterfaceC1773850wGF) this.LL.LIZJ().getService(InterfaceC1773850wGF.class);
        if (interfaceC1773850wGF != null) {
            interfaceC1773850wGF.LJFF(new C1774950wI1(str, mapLJIIJ, 1, 0, null, 100).LIZ(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0295 A[PHI: r8 r13
      0x0295: PHI (r8v48 float) = (r8v38 float), (r8v49 float) binds: [B:433:0x063b, B:171:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r13v17 int) = (r13v12 int), (r13v18 int) binds: [B:433:0x063b, B:171:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0615 A[PHI: r14
      0x0615: PHI (r14v13 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle) = 
      (r14v11 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
      (r14v15 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
     binds: [B:415:0x060a, B:219:0x0356] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x061e A[PHI: r17
      0x061e: PHI (r17v3 X.0wHJ) = (r17v2 X.0wHJ), (r17v5 X.0wHJ), (r17v5 X.0wHJ) binds: [B:422:0x061a, B:268:0x03f2, B:270:0x03f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x063a A[PHI: r8
      0x063a: PHI (r8v38 float) = (r8v37 float), (r8v49 float), (r8v49 float), (r8v49 float) binds: [B:430:0x0636, B:166:0x0283, B:168:0x0287, B:170:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x063f A[PHI: r8 r13
      0x063f: PHI (r8v39 float) = (r8v38 float), (r8v48 float) binds: [B:433:0x063b, B:173:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x063f: PHI (r13v13 int) = (r13v12 int), (r13v17 int) binds: [B:433:0x063b, B:173:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0644 A[PHI: r8 r12 r13
      0x0644: PHI (r8v40 float) = (r8v39 float), (r8v47 float) binds: [B:436:0x0640, B:176:0x029d] A[DONT_GENERATE, DONT_INLINE]
      0x0644: PHI (r12v10 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle) = 
      (r12v9 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
      (r12v13 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
     binds: [B:436:0x0640, B:176:0x029d] A[DONT_GENERATE, DONT_INLINE]
      0x0644: PHI (r13v14 int) = (r13v13 int), (r13v16 int) binds: [B:436:0x0640, B:176:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0655 A[PHI: r11
      0x0655: PHI (r11v49 int) = (r11v48 int), (r11v53 int) binds: [B:443:0x0651, B:147:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x065a A[PHI: r9 r11
      0x065a: PHI (r9v28 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle) = 
      (r9v27 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
      (r9v41 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ItemStyle)
     binds: [B:446:0x0656, B:150:0x025b] A[DONT_GENERATE, DONT_INLINE]
      0x065a: PHI (r11v50 int) = (r11v49 int), (r11v52 int) binds: [B:446:0x0656, B:150:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a  */
    @Override // X.AbstractC1773460wFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.AbstractC1773210wFD r32) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1774420wHA.P5(X.0wFD):void");
    }

    @Override // X.AbstractC1773460wFc
    public final void e6(boolean z) {
        int measuredHeight;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabBar onStickyChanged = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("santa", strLIZIZ);
        u6(z);
        Object objLIZLLL = this.LL.LIZ().LIZLLL("bff_page_tab", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        if (!(objLIZLLL instanceof Boolean)) {
            objLIZLLL = null;
        }
        if (Intrinsics.LJFF(objLIZLLL, Boolean.TRUE)) {
            measuredHeight = 0;
        } else {
            measuredHeight = this.itemView.getMeasuredHeight();
        }
        InterfaceC1774150wGj interfaceC1774150wGj = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1774150wGj != null) {
            interfaceC1774150wGj.LJIIL(measuredHeight, z);
        }
    }

    @Override // X.AbstractC1773460wFc
    public final void onVisibilityChanged(boolean z) {
        super.onVisibilityChanged(z);
        this.LLJLLIL = z;
        if (z) {
            C6();
        }
    }

    @Override // X.InterfaceC1772610wEF
    public final View u5(String str) {
        BTMModel bTMModel;
        View view;
        String str2;
        Map<String, ?> map;
        Map<String, ?> map2;
        TabBarCardItem tabBarCardItem;
        List<BTMModel> list;
        String string;
        String str3;
        Map<String, ?> map3;
        TabBarCardItem tabBarCardItem2;
        BTMModel bTMModel2;
        C1775090wIF c1775090wIF = this.LLJJIJIL;
        int i = 0;
        Map<String, ?> map4 = null;
        if (Intrinsics.LJFF(str, "feed_tab_bar_cate_icon") && c1775090wIF != null && c1775090wIF.LJI()) {
            C1774040wGY c1774040wGY = this.LLJJJ;
            if (c1774040wGY != null && (tabBarCardItem2 = c1774040wGY.LJJ) != null && (bTMModel2 = tabBarCardItem2.rightFixedItemBTM) != null) {
                str3 = bTMModel2.btm;
                map3 = bTMModel2.bcm;
                map4 = bTMModel2.btmUnitParams;
            } else {
                str3 = null;
                map3 = null;
            }
            C1771960wDC.LIZJ(c1775090wIF, str3, map3, map4);
            return c1775090wIF;
        }
        Iterator<TabItem> it2 = this.LLJJJIL.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                TabItem next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    Integer num = next.id;
                    if (num != null) {
                        string = num.toString();
                    } else {
                        string = null;
                    }
                    if (Intrinsics.LJFF(string, str)) {
                        break;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                i = -1;
                break;
            }
        }
        C1774040wGY c1774040wGY2 = this.LLJJJ;
        if (c1774040wGY2 != null && (tabBarCardItem = c1774040wGY2.LJJ) != null && (list = tabBarCardItem.tabsBTM) != null) {
            bTMModel = (BTMModel) C13LP.LJJJLZIJ(i, list);
        } else {
            bTMModel = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLJJIJIIJIL.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        if (bTMModel != null) {
            str2 = bTMModel.btm;
            map = bTMModel.bcm;
            map2 = bTMModel.btmUnitParams;
        } else {
            str2 = null;
            map = null;
            map2 = null;
        }
        C1771960wDC.LIZJ(view, str2, map, map2);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            return null;
        }
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    public final void u6(boolean z) {
        ItemStyle itemStyle;
        int iIntValue;
        TabItemBorder tabItemBorder;
        float fLIZIZ;
        int iLIZIZ;
        String str;
        int iIntValue2;
        Integer numValueOf;
        ItemStyle itemStyle2;
        ItemStyle itemStyle3;
        String str2;
        ContainerStyle containerStyle = this.LLJL;
        ItemStyle itemStyle4 = null;
        numLIZ = null;
        numLIZ = null;
        Integer numLIZ = null;
        if (z) {
            if (containerStyle != null) {
                itemStyle2 = containerStyle.light;
                itemStyle3 = containerStyle.dark;
            } else {
                itemStyle2 = null;
                itemStyle3 = null;
            }
            if (this.LLJLIL) {
                if (itemStyle3 != null) {
                    str2 = itemStyle3.stickBgColor;
                    if (str2 == null) {
                        str2 = itemStyle3.bgColor;
                        if (str2 != null) {
                        }
                    }
                    numLIZ = Integer.valueOf(C1774710wHd.LIZ(str2));
                }
            } else if (itemStyle2 != null) {
                str2 = itemStyle2.stickBgColor;
                if (str2 == null) {
                    str2 = itemStyle2.bgColor;
                    if (str2 != null) {
                    }
                }
                numLIZ = Integer.valueOf(C1774710wHd.LIZ(str2));
            }
        } else {
            if (containerStyle != null) {
                itemStyle4 = containerStyle.light;
                itemStyle = containerStyle.dark;
            } else {
                itemStyle = null;
            }
            numLIZ = C1771960wDC.LIZ(itemStyle4, itemStyle, this.LLJLIL);
        }
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        if (containerStyle != null && (tabItemBorder = containerStyle.border) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Float f = tabItemBorder.cornerRadius;
            if (f != null) {
                fLIZIZ = C418440Gaw.LIZIZ(f);
            } else {
                fLIZIZ = 0.0f;
            }
            gradientDrawable.setCornerRadius(fLIZIZ);
            Float f2 = tabItemBorder.borderWidth;
            if (f2 != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(f2));
            } else {
                iLIZIZ = 0;
            }
            ItemStyle itemStyle5 = containerStyle.light;
            ItemStyle itemStyle6 = containerStyle.dark;
            if (this.LLJLIL) {
                if (itemStyle6 != null) {
                    str = itemStyle6.borderColor;
                    if (str == null && (numValueOf = Integer.valueOf(C1774710wHd.LIZ(str))) != null) {
                        iIntValue2 = numValueOf.intValue();
                    }
                    gradientDrawable.setStroke(iLIZIZ, iIntValue2);
                    gradientDrawable.setColor(iIntValue);
                    this.LLJJIJI.setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable}));
                }
                iIntValue2 = 0;
                gradientDrawable.setStroke(iLIZIZ, iIntValue2);
                gradientDrawable.setColor(iIntValue);
                this.LLJJIJI.setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable}));
            } else {
                if (itemStyle5 != null) {
                    str = itemStyle5.borderColor;
                    if (str == null) {
                    }
                }
                iIntValue2 = 0;
                gradientDrawable.setStroke(iLIZIZ, iIntValue2);
                gradientDrawable.setColor(iIntValue);
                this.LLJJIJI.setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable}));
            }
        } else {
            this.LLJJIJI.setBackgroundColor(iIntValue);
        }
        C1775090wIF c1775090wIF = this.LLJJIJIL;
        if (c1775090wIF != null) {
            c1775090wIF.LLJJI = iIntValue;
            c1775090wIF.LJIIL();
        }
    }

    public C1774420wHA(ViewGroup viewGroup, final InterfaceC1773310wFN interfaceC1773310wFN) {
        super(viewGroup, interfaceC1773310wFN);
        this.LLJJIJI = viewGroup;
        C1774480wHG c1774480wHG = (C1774480wHG) viewGroup.findViewById(R.id.gij);
        this.LLJJIJIIJIL = c1774480wHG;
        C1774470wHF c1774470wHF = new C1774470wHF();
        this.LLJJJIL = c1774470wHF;
        C1774450wHD c1774450wHD = new C1774450wHD(c1774480wHG);
        this.LLJJJJ = c1774450wHD;
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(743));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1240));
        C1768170w75 c1768170w75 = new C1768170w75(interfaceC1773310wFN, c1774470wHF);
        this.LLJJL = c1768170w75;
        this.LLJZIJLIL = new ViewOnLayoutChangeListenerC1775800wJO(this, 1);
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        c1774480wHG.addItemDecoration(new C0DXR() { // from class: X.0wHB
            /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
            @Override // X.C0DXR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C21673919s1 r10) {
                /*
                    r6 = this;
                    super.LIZIZ(r7, r8, r9, r10)
                    int r5 = r9.getChildAdapterPosition(r8)
                    X.0wHA r0 = r6.LL
                    X.0wGY r0 = r0.LLJJJ
                    r4 = 0
                    if (r0 == 0) goto L61
                    com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem r0 = r0.LJJ
                    if (r0 == 0) goto L61
                    com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabStyle r0 = r0.style
                    if (r0 == 0) goto L61
                    com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.ContainerStyle r3 = r0.container
                    if (r3 == 0) goto L1e
                    java.lang.Float r0 = r3.itemHGap
                    if (r0 != 0) goto L23
                L1e:
                    r0 = 0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L23:
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r2 = X.C814420VxA.LIZIZ(r0)
                    if (r5 != 0) goto L5c
                    X.0wHg r1 = new X.0wHg
                    if (r3 == 0) goto L5a
                    java.util.List<java.lang.Float> r0 = r3.inset
                L33:
                    r1.<init>(r0)
                    float r0 = r1.LIZIZ()
                    int r0 = (int) r0
                    r7.left = r0
                L3d:
                    X.0wHA r0 = r6.LL
                    X.0wHF r0 = r0.LLJJJIL
                    int r0 = r0.getItemCount()
                    int r0 = r0 + (-1)
                    if (r5 != r0) goto L63
                    X.0wHg r0 = new X.0wHg
                    if (r3 == 0) goto L4f
                    java.util.List<java.lang.Float> r4 = r3.inset
                L4f:
                    r0.<init>(r4)
                    float r0 = r0.LIZJ()
                    int r0 = (int) r0
                    r7.right = r0
                    return
                L5a:
                    r0 = r4
                    goto L33
                L5c:
                    int r0 = r2 / 2
                    r7.left = r0
                    goto L3d
                L61:
                    r3 = r4
                    goto L1e
                L63:
                    int r0 = r2 / 2
                    r7.right = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1774430wHB.LIZIZ(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
            }
        });
        c1774480wHG.setClickPayload("click");
        c1774480wHG.setAdapter(c1774470wHF);
        ((HashSet) c1774480wHG.LLJILJILJ).add(new InterfaceC1774590wHR() { // from class: X.0wDA
            /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0189 A[PHI: r10
              0x0189: PHI (r10v3 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem) = 
              (r10v2 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
              (r10v5 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
             binds: [B:76:0x0185, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1774590wHR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r23, int r24, java.lang.Object r25) {
                /*
                    Method dump skipped, instruction units count: 426
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1771940wDA.LIZ(int, int, java.lang.Object):void");
            }
        });
        interfaceC1773310wFN.LIZJ().LIZ(C1774450wHD.class, c1774450wHD);
        interfaceC1773310wFN.LIZJ().LIZ(C1768160w74.class, new C1768160w74(c1768170w75));
        this.LLJJLIIIJLLLLLLLZ = (InterfaceC1774150wGj) interfaceC1773310wFN.LIZJ().getService(InterfaceC1774150wGj.class);
    }

    public static String D6(Uri uri, Map map) {
        Object c098200Yq;
        boolean z;
        String string;
        boolean z2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams");
        try {
            c098200Yq = C1741890vQh.LIZJ(uri, "trackParams");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        HashMap map2 = (HashMap) c098200Yq;
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            z = false;
        } else {
            z = true;
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            if (string != null && !a0.LJJJIL(string)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                map2.put(key, value);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return C1741890vQh.LJIIIIZZ(map2);
    }

    public final void z6(ContainerStyle containerStyle, boolean z, boolean z2) {
        Number number;
        int iMax;
        Integer numValueOf = Integer.valueOf(this.LLJJIJI.getWidth());
        int i = 0;
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            if (containerStyle == null || (number = containerStyle.height) == null) {
                number = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(number));
            C1775090wIF c1775090wIF = this.LLJJIJIL;
            int i2 = 4;
            if (z2 && c1775090wIF != null) {
                int iLJIIIZ = c1775090wIF.LJIIIZ();
                if (z) {
                    iMax = Math.max(iIntValue - iLJIIIZ, 0);
                } else {
                    iMax = 0;
                }
                C1774480wHG c1774480wHG = this.LLJJIJIIJIL;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMax, iLIZIZ);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1774480wHG);
                c1774480wHG.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLJIIIZ, iLIZIZ);
                layoutParams2.leftMargin = iMax;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1775090wIF);
                c1775090wIF.setLayoutParams(layoutParams2);
                C1774480wHG c1774480wHG2 = this.LLJJIJIIJIL;
                if (z) {
                    i2 = 0;
                }
                int visibility = c1774480wHG2.getVisibility();
                c1774480wHG2.setVisibility(i2);
                C1602160rnK.LIZIZ(visibility, i2, c1774480wHG2);
                C786410Ut5.LLI(0, c1775090wIF);
                return;
            }
            C1774480wHG c1774480wHG3 = this.LLJJIJIIJIL;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, iLIZIZ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1774480wHG3);
            c1774480wHG3.setLayoutParams(layoutParams3);
            C1774480wHG c1774480wHG4 = this.LLJJIJIIJIL;
            if (!z) {
                i = 4;
            }
            int visibility2 = c1774480wHG4.getVisibility();
            c1774480wHG4.setVisibility(i);
            C1602160rnK.LIZIZ(visibility2, i, c1774480wHG4);
            if (c1775090wIF != null) {
                C786410Ut5.LLI(8, c1775090wIF);
            }
        }
    }
}
