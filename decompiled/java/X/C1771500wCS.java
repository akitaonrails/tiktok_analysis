package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section.ECMixMallSectionDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0wCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771500wCS implements InterfaceC1772020wDI {
    public static final AtomicBoolean LJII = new AtomicBoolean(true);
    public final ShopMallMixViewModel LIZ;
    public volatile C099F LIZLLL;
    public volatile C099F LJ;
    public C1771430wCL LJFF;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(301));
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2899));

    @Override // X.InterfaceC1772020wDI
    public final void LIZIZ() {
        C099F c099f;
        C099F c099f2;
        C099F c099f3 = this.LJ;
        if (c099f3 == null || c099f3.isCompleted() || (c099f = this.LJ) == null || c099f.isCancelled() || (c099f2 = this.LJ) == null) {
            return;
        }
        c099f2.LJJLIIIJILLIZJL(Unit.LIZ);
    }

    @Override // X.InterfaceC1772020wDI
    public final void LIZLLL() {
        C099F c099f;
        C099F c099f2;
        C099F c099f3 = this.LIZLLL;
        if (c099f3 == null || c099f3.isCompleted() || (c099f = this.LIZLLL) == null || c099f.isCancelled() || (c099f2 = this.LIZLLL) == null) {
            return;
        }
        c099f2.LJJLIIIJILLIZJL(Unit.LIZ);
    }

    @Override // X.InterfaceC1772020wDI
    public final C13BV LIZ() {
        return C13BV.INSTANCE;
    }

    public C1771500wCS(ShopMallMixViewModel shopMallMixViewModel) {
        this.LIZ = shopMallMixViewModel;
    }

    public static String LJFF(String str) {
        boolean z;
        int iLJJIZ;
        char cCharAt;
        int i;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String[] strArr = {"\"aweme_id\"", "\\\"aweme_id\\\"", "\"item_id\"", "\\\"item_id\\\""};
        for (int i2 = 0; i2 < 4; i2++) {
            String str2 = strArr[i2];
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
            if (iLJJJ >= 0 && (iLJJIZ = a0.LJJIZ(str, ':', iLJJJ + str2.length(), false, 4)) >= 0) {
                do {
                    iLJJIZ++;
                    if (iLJJIZ >= str.length()) {
                        break;
                    }
                } while (C1244080iTm.LJ(str.charAt(iLJJIZ)));
                if (iLJJIZ >= str.length()) {
                    continue;
                } else if (str.charAt(iLJJIZ) == '\\' && (i = iLJJIZ + 1) < str.length() && str.charAt(i) == '\"') {
                    int i3 = iLJJIZ + 2;
                    int iLJJJ2 = a0.LJJJ(str, "\\\"", i3, false, 4);
                    if (iLJJJ2 > i3) {
                        return str.substring(i3, iLJJJ2);
                    }
                } else if (str.charAt(iLJJIZ) == '\"') {
                    int i4 = iLJJIZ + 1;
                    int iLJJIZ2 = a0.LJJIZ(str, '\"', i4, false, 4);
                    if (iLJJIZ2 > i4) {
                        return str.substring(i4, iLJJIZ2);
                    }
                } else {
                    int i5 = iLJJIZ;
                    while (i5 < str.length() && (cCharAt = str.charAt(i5)) != ',' && cCharAt != '}' && !C1244080iTm.LJ(cCharAt)) {
                        i5++;
                    }
                    if (i5 > iLJJIZ) {
                        return str.substring(iLJJIZ, i5);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII(X.C1772630wEH r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJII(X.0wEH):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIIIIZZ(X.C1772630wEH r2) {
        /*
            if (r2 == 0) goto L4c
            X.0wG1 r0 = r2.LIZIZ()
            if (r0 == 0) goto L44
            java.util.List<X.0wEN> r1 = r0.LJJIII
            int r0 = r0.LJJIFFI
            if (r0 >= 0) goto Lf
            r0 = 0
        Lf:
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            X.0wEN r0 = (X.C1772690wEN) r0
            if (r0 == 0) goto L44
            java.util.List<? extends X.0wFD> r0 = r0.LIZJ
            if (r0 == 0) goto L44
        L1b:
            X.07ik r1 = new X.07ik
            r1.<init>(r0)
            r0 = 512(0x200, float:7.17E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            X.08QU r1 = X.C09RB.LJIJI(r1, r0)
            r0 = 513(0x201, float:7.19E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            X.08QU r2 = X.C09RB.LJIIIZ(r1, r0)
            r0 = 514(0x202, float:7.2E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r1 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            X.08QP r0 = new X.08QP
            r0.<init>(r2, r1)
            java.util.List r0 = X.C09RB.LJJII(r0)
            return r0
        L44:
            X.0wEN r0 = r2.LIZLLL
            if (r0 == 0) goto L4c
            java.util.List<? extends X.0wFD> r0 = r0.LIZJ
            if (r0 != 0) goto L1b
        L4c:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIIIIZZ(X.0wEH):java.util.List");
    }

    public static ECMixMallPageDTO LJIIJ(ECMixMallPageDTO eCMixMallPageDTO) {
        int iIntValue;
        boolean z;
        List<ECMixMallSectionDTO> listLIZJ;
        String str;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        if (eCMixMallPageDTO == null) {
            return null;
        }
        try {
            List<ECMixMallSectionDTO> listLIZIZ = eCMixMallPageDTO.LIZIZ();
            if (listLIZIZ == null) {
                return eCMixMallPageDTO;
            }
            Map<String, ECMixMallItemInfoDTO> map = eCMixMallPageDTO.itemsInfo;
            Integer num = C1771440wCM.LIZLLL().feedFirstStepItemCount;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
            Integer num2 = C1771440wCM.LIZLLL().removeMediaCardFromCache;
            if (num2 != null && num2.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            Iterator<ECMixMallSectionDTO> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ArrayList<ECMixMallItemDTO> arrayList = it2.next().items;
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ECMixMallItemDTO eCMixMallItemDTO : arrayList) {
                        ECMixMallItemDTO eCMixMallItemDTO2 = eCMixMallItemDTO;
                        if (!z || (eCMixMallItemDTO2 != null && (str = eCMixMallItemDTO2.type) != null && (map == null || (eCMixMallItemInfoDTO = map.get(str)) == null || eCMixMallItemInfoDTO.config == null))) {
                            arrayList2.add(eCMixMallItemDTO);
                        }
                    }
                    List listLL = C13LP.LL(arrayList2, iIntValue);
                    arrayList.clear();
                    arrayList.addAll(listLL);
                }
            }
            if (C1569410qwV.LIZ.webcastLruDiskOpt == 1 && (listLIZJ = eCMixMallPageDTO.LIZJ()) != null) {
                Iterator<ECMixMallSectionDTO> it3 = listLIZJ.iterator();
                while (it3.hasNext()) {
                    it3.next().webcastLruCacheList = null;
                }
            }
            return eCMixMallPageDTO;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                EnumC1771210wBz enumC1771210wBz = EnumC1771210wBz.CROP_ONLINE_DATA;
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "crop online data error before save";
                }
                C1768370w7P.LIZ(thM5exceptionOrNullimpl, enumC1771210wBz, message, null);
            }
            return null;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void loadShopTabSparkView(C1435405jc c1435405jc) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.n LJIIIZ(com.google.gson.n r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIIIZ(com.google.gson.n, boolean):com.google.gson.n");
    }

    public final boolean LJI(EnumC1771830wCz enumC1771830wCz, C1771590wCb c1771590wCb) {
        C1769810w9j.LIZ.getClass();
        Integer numLIZIZ = C1769810w9j.LIZIZ();
        if (numLIZIZ == null || numLIZIZ.intValue() <= 0 || enumC1771830wCz != EnumC1771830wCz.REFRESH || !Intrinsics.LJFF(c1771590wCb.LJFF, "first_fetch")) {
            return false;
        }
        C599820Nfo.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkSaveOnlineDataForMergeRender, cacheExist=");
        sbLIZ.append(this.LIZ.LLILLL.LJJJLZIJ);
        sbLIZ.append(", pageCacheRenderAllEnd=");
        sbLIZ.append(this.LIZ.LLILLL.LJIILIIL);
        sbLIZ.append(',');
        C2188811AlT.LIZIZ(sbLIZ);
        C599820Nfo.LIZLLL();
        if (!this.LIZ.LLILLL.LJJJLZIJ || this.LIZ.LLILLL.LJIILIIL >= 0) {
            return false;
        }
        return true;
    }

    public static void LJIIZILJ(C1771590wCb c1771590wCb, String str, boolean z) {
        EnumC1771600wCc enumC1771600wCc;
        String str2;
        String str3 = c1771590wCb.LJI;
        if (Intrinsics.LJFF(str3, "cold_start")) {
            enumC1771600wCc = EnumC1771600wCc.FIRST_REQUEST;
        } else if (!Intrinsics.LJFF(str3, "fail_retry")) {
            return;
        } else {
            enumC1771600wCc = EnumC1771600wCc.ERROR_RETRY;
        }
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        String strLIZJ = C1767800w6U.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "other";
        }
        int value = enumC1771600wCc.getValue();
        c1767950w6j.getClass();
        HashMap map = new HashMap();
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "mall");
        map.put("previous_page", strLIZJ);
        map.put("enter_from", C1767950w6j.LJFF());
        map.put("api_type", "mall_area");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_success", str2);
        map.put("request_type", Integer.valueOf(value));
        if (str != null && str.length() > 0) {
            map.put("fail_reason", str);
        }
        C1767950w6j.LJIILLIIL("tiktokec_enter_mall_result", map);
    }

    public final void LJIIL(EnumC1771830wCz enumC1771830wCz, C1771590wCb c1771590wCb, AbstractC1771170wBv abstractC1771170wBv) {
        C1772630wEH c1772630wEH;
        if (!((Boolean) this.LJI.getValue()).booleanValue()) {
            return;
        }
        EnumC1771830wCz enumC1771830wCz2 = EnumC1771830wCz.REFRESH;
        if ((enumC1771830wCz == enumC1771830wCz2 && Intrinsics.LJFF(c1771590wCb.LJFF, "first_fetch") && ((abstractC1771170wBv instanceof C1771140wBs) || (abstractC1771170wBv instanceof C1771640wCg))) || (enumC1771830wCz == enumC1771830wCz2 && Intrinsics.LJFF(c1771590wCb.LJFF, "fetch") && Intrinsics.LJFF(c1771590wCb.LJI, "global_refresh") && (abstractC1771170wBv instanceof C1771140wBs))) {
            if (abstractC1771170wBv instanceof C1771140wBs) {
                c1772630wEH = ((C1771140wBs) abstractC1771170wBv).LIZ;
            } else if (abstractC1771170wBv instanceof C1771640wCg) {
                c1772630wEH = ((C1771640wCg) abstractC1771170wBv).LIZ;
            } else {
                return;
            }
            C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
            if (c1773710wG1LIZIZ == null) {
                return;
            }
            String str = ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ.LJJIII, c1773710wG1LIZIZ.LJJ)).LIZLLL;
            String strLIZ = C1767800w6U.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            this.LJFF = new C1771430wCL(str, strLIZ);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("save load more info tab id: ");
            sbLIZ.append(str);
            sbLIZ.append(", diversionParams: ");
            sbLIZ.append(strLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("loadMore", strLIZIZ);
            return;
        }
        if (enumC1771830wCz == enumC1771830wCz2 && Intrinsics.LJFF(c1771590wCb.LJI, "pull")) {
            this.LJFF = null;
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("loadMore", "pull refresh reset load more diversion");
        }
    }

    public final void LJIILJJIL(C1772630wEH c1772630wEH, boolean z, String str) {
        C948503nH.LJI(this.LIZ, C2126308Ur.LIZ, new C1774790wHl(c1772630wEH, z, str, null));
        EcomLynxVideoPlayerSettings.LIZ.getClass();
        if (!EcomLynxVideoPlayerSettings.LIZ()) {
            return;
        }
        C948503nH.LJI(this.LIZ, C0PEM.LIZJ, new C1771510wCT(c1772630wEH, z, str, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C1772630wEH r6, X.C1771590wCb r7, X.InterfaceC1773310wFN r8) {
        /*
            r5 = this;
            r2 = 1
            java.lang.String r4 = "cold_start"
            if (r6 == 0) goto L34
            java.lang.String r0 = r7.LJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L34
            X.0wBU r0 = X.C1770900wBU.LIZ
            r0.getClass()
            X.0R21 r3 = X.C1770900wBU.LJIIJJI(r6)
            com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel r1 = r5.LIZ
            X.0R21 r0 = r1.LLIZ
            if (r0 == r3) goto L34
            r1.LLIZ = r3
            X.0wCY r0 = X.EnumC1771560wCY.SWITCH_ACCOUNT
        L20:
            X.0Nfh r4 = r8.LIZ()
            java.lang.String r3 = "request_type"
            java.lang.String r2 = r0.getValue()
            X.0Nfe r1 = X.EnumC599720Nfe.NATIVE
            java.util.Map r0 = X.C2097608Jq.LJ()
            r4.LJ(r3, r2, r1, r0)
            return
        L34:
            java.lang.String r1 = r7.LJI
            int r0 = r1.hashCode()
            switch(r0) {
                case -408413369: goto L56;
                case 3452485: goto L5f;
                case 406851143: goto L6a;
                case 410437272: goto L75;
                case 1192190452: goto L80;
                default: goto L3d;
            }
        L3d:
            com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel r0 = r5.LIZ
            X.0vPh r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L91
            int[] r1 = X.C1741280vPi.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L8e
            r0 = 2
            if (r1 == r0) goto L8b
            r0 = 3
            if (r1 != r0) goto L91
            X.0wCY r0 = X.EnumC1771560wCY.BACK_FROM_SPLIT_SCREEN
            goto L20
        L56:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L3d
            X.0wCY r0 = X.EnumC1771560wCY.COLD_START
            goto L20
        L5f:
            java.lang.String r0 = "pull"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            X.0wCY r0 = X.EnumC1771560wCY.PULL_DOWN
            goto L20
        L6a:
            java.lang.String r0 = "fail_retry"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            X.0wCY r0 = X.EnumC1771560wCY.FAIL_RETRY
            goto L20
        L75:
            java.lang.String r0 = "click_bottom_tab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            X.0wCY r0 = X.EnumC1771560wCY.RE_CLICK_MALL_TAB
            goto L20
        L80:
            java.lang.String r0 = "click_top_tab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            X.0wCY r0 = X.EnumC1771560wCY.RE_CLICK_MALL_TAB
            goto L20
        L8b:
            X.0wCY r0 = X.EnumC1771560wCY.BACK_FROM_SUBPAGE
            goto L20
        L8e:
            X.0wCY r0 = X.EnumC1771560wCY.BACK_FROM_TAB
            goto L20
        L91:
            X.0wCY r0 = X.EnumC1771560wCY.OTHER
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIJI(X.0wEH, X.0wCb, X.0wFN):void");
    }

    public static Unit LJIILLIIL(EnumC1771830wCz enumC1771830wCz, C1771590wCb c1771590wCb, AbstractC1771170wBv abstractC1771170wBv, InterfaceC1773310wFN interfaceC1773310wFN) {
        C1772670wEL c1772670wELLJII;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ;
        C1772630wEH c1772630wEHC82;
        C1773710wG1 c1773710wG1LIZIZ;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ2;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ3;
        C1772630wEH c1772630wEHC822;
        C1773710wG1 c1773710wG1LIZIZ2;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ4;
        if (enumC1771830wCz == EnumC1771830wCz.REFRESH && Intrinsics.LJFF(c1771590wCb.LJFF, "first_fetch") && interfaceC1773310wFN != null && (c1772670wELLJII = interfaceC1773310wFN.LJII()) != null && c1772670wELLJII.LIZ() == 1) {
            if (abstractC1771170wBv instanceof C1771140wBs) {
                if (interfaceC1773310wFN != null && (interfaceC1772680wEMLJIIIZ3 = interfaceC1773310wFN.LJIIIZ()) != null && (c1772630wEHC822 = interfaceC1772680wEMLJIIIZ3.c82()) != null && (c1773710wG1LIZIZ2 = c1772630wEHC822.LIZIZ()) != null) {
                    C1771140wBs c1771140wBs = (C1771140wBs) abstractC1771170wBv;
                    C1773710wG1 c1773710wG1LIZIZ3 = c1771140wBs.LIZ.LIZIZ();
                    if (c1773710wG1LIZIZ3 == null) {
                        return Unit.LIZ;
                    }
                    if (Intrinsics.LJFF(((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ2.LJJIII, c1773710wG1LIZIZ2.LJJ)).LIZLLL, ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ3.LJJIII, c1773710wG1LIZIZ3.LJJ)).LIZLLL) && (interfaceC1772680wEMLJIIIZ4 = interfaceC1773310wFN.LJIIIZ()) != null) {
                        interfaceC1772680wEMLJIIIZ4.jy1(c1771140wBs.LIZ);
                    }
                } else {
                    return Unit.LIZ;
                }
            } else if (abstractC1771170wBv instanceof C1771640wCg) {
                if (interfaceC1773310wFN != null && (interfaceC1772680wEMLJIIIZ = interfaceC1773310wFN.LJIIIZ()) != null && (c1772630wEHC82 = interfaceC1772680wEMLJIIIZ.c82()) != null && (c1773710wG1LIZIZ = c1772630wEHC82.LIZIZ()) != null) {
                    C1771640wCg c1771640wCg = (C1771640wCg) abstractC1771170wBv;
                    C1773710wG1 c1773710wG1LIZIZ4 = c1771640wCg.LIZ.LIZIZ();
                    if (c1773710wG1LIZIZ4 == null) {
                        return Unit.LIZ;
                    }
                    if (Intrinsics.LJFF(((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ.LJJIII, c1773710wG1LIZIZ.LJJ)).LIZLLL, ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ4.LJJIII, c1773710wG1LIZIZ4.LJJ)).LIZLLL) && (interfaceC1772680wEMLJIIIZ2 = interfaceC1773310wFN.LJIIIZ()) != null) {
                        interfaceC1772680wEMLJIIIZ2.jy1(c1771640wCg.LIZ);
                    }
                } else {
                    return Unit.LIZ;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1772020wDI
    public final InterfaceC346201Wa LIZJ(InterfaceC1773310wFN interfaceC1773310wFN, EnumC1771830wCz enumC1771830wCz, C1773140wF6 c1773140wF6, C1771590wCb c1771590wCb, AwS121S0400000_26 awS121S0400000_26) {
        return C09IC.LJIL(new C2325381G0q(new C1331105Iv(null), C09IC.LJ(new C1771340wCC(this, interfaceC1773310wFN, c1773140wF6, c1771590wCb, enumC1771830wCz, null, awS121S0400000_26)), 0), C2126308Ur.LIZIZ);
    }

    @Override // X.InterfaceC1772020wDI
    public final void LJ(InterfaceC1773310wFN interfaceC1773310wFN, EnumC1771830wCz enumC1771830wCz, C1773140wF6 c1773140wF6, C1771590wCb c1771590wCb, C1772010wDH c1772010wDH) {
        C948503nH.LJI(this.LIZ, C2126308Ur.LIZIZ, new C1771450wCN(this, interfaceC1773310wFN, c1773140wF6, c1771590wCb, enumC1771830wCz, null, c1772010wDH));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:22:0x0075, B:24:0x0079, B:25:0x007d, B:19:0x0060), top: B:119:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, X.0wBv] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.0wCQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC1773310wFN r25, X.C1771590wCb r26, X.C1773140wF6 r27, com.google.gson.n r28, X.InterfaceC1364105Vn<? super X.AbstractC1771170wBv> r29) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIILIIL(X.0wFN, X.0wCb, X.0wF6, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024b A[Catch: all -> 0x0261, TRY_LEAVE, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0252 A[Catch: all -> 0x0281, TryCatch #1 {all -> 0x0281, blocks: (B:30:0x00d4, B:34:0x00df, B:47:0x0111, B:50:0x012f, B:61:0x014c, B:76:0x0188, B:139:0x024e, B:141:0x0252, B:150:0x0264), top: B:183:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[Catch: all -> 0x0283, TRY_LEAVE, TryCatch #3 {all -> 0x0283, blocks: (B:26:0x00be, B:28:0x00ca), top: B:186:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[Catch: all -> 0x0261, TRY_ENTER, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111 A[Catch: all -> 0x0281, TRY_ENTER, TryCatch #1 {all -> 0x0281, blocks: (B:30:0x00d4, B:34:0x00df, B:47:0x0111, B:50:0x012f, B:61:0x014c, B:76:0x0188, B:139:0x024e, B:141:0x0252, B:150:0x0264), top: B:183:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e A[Catch: all -> 0x0261, TRY_ENTER, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b0 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:29:0x00ce, B:32:0x00db, B:38:0x00e7, B:40:0x00ed, B:42:0x0100, B:45:0x0108, B:49:0x0125, B:52:0x0139, B:54:0x013d, B:57:0x0143, B:63:0x0156, B:65:0x015c, B:68:0x016f, B:70:0x0175, B:72:0x017b, B:74:0x0181, B:78:0x018e, B:80:0x0192, B:83:0x0198, B:86:0x019e, B:88:0x01a2, B:90:0x01a6, B:91:0x01aa, B:93:0x01b0, B:95:0x01ba, B:97:0x01c8, B:102:0x01d4, B:104:0x01dc, B:105:0x01de, B:110:0x01ed, B:111:0x01f3, B:113:0x01f7, B:117:0x01ff, B:119:0x0203, B:121:0x0209, B:125:0x0221, B:126:0x0227, B:128:0x022b, B:132:0x0233, B:134:0x0237, B:136:0x0245, B:135:0x0240, B:138:0x024b, B:143:0x0258, B:146:0x025e), top: B:185:0x00ce }] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [T] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, X.0wBv] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [T] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0wCQ] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [T] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [T] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC1773310wFN r25, X.C1771590wCb r26, X.C1773140wF6 r27, com.google.gson.n r28, X.InterfaceC1364105Vn<? super X.AbstractC1771170wBv> r29) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIILL(X.0wFN, X.0wCb, X.0wF6, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148 A[PHI: r6
      0x0148: PHI (r6v2 int) = (r6v1 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:61:0x0144, B:26:0x0057, B:28:0x0061, B:30:0x0067, B:32:0x006b, B:34:0x006f, B:36:0x0077, B:38:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(long r14, X.C1771590wCb r16, X.InterfaceC1773310wFN r17, int r18, java.lang.String r19, X.AbstractC1771170wBv r20) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIJ(long, X.0wCb, X.0wFN, int, java.lang.String, X.0wBv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC1773310wFN r17, X.EnumC1771830wCz r18, X.C1771590wCb r19, X.C1773140wF6 r20, com.google.gson.n r21, X.C094D r22, kotlin.jvm.functions.Function1 r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771500wCS.LJIIJJI(X.0wFN, X.0wCz, X.0wCb, X.0wF6, com.google.gson.n, X.094D, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
