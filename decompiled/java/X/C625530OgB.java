package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.offlinevideo.OfflineVideoInfo;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625530OgB {
    public static final C625530OgB LIZ = new C625530OgB();
    public static long LIZIZ = 172800000;
    public static volatile String LIZJ = "";
    public static final IAccountUserService LIZLLL = C0XQ7.LJFF();
    public static final C01GW LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C625760OgY());

    public static InterfaceC625570OgF LIZLLL() {
        return (InterfaceC625570OgF) LJ.getValue();
    }

    public static long LJI() {
        String str = LIZJ;
        IAccountUserService iAccountUserService = LIZLLL;
        if (Intrinsics.LJFF(str, iAccountUserService.getCurSecUserId())) {
            return LIZIZ;
        }
        String curSecUserId = iAccountUserService.getCurSecUserId();
        if (curSecUserId == null) {
            return LIZIZ;
        }
        LIZJ = curSecUserId;
        C625470Og5.LL.getClass();
        long j = C625470Og5.LLILZIL - C625420Og0.LJIIIIZZ().getLong("key_last_enter_offline_detail_timestamp", System.currentTimeMillis()) > 172800000 ? 7776000000L : 172800000L;
        LIZIZ = j;
        return j;
    }

    public static List LIZ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJIJ(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static int LIZIZ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return 0;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJIIL(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static Object LJFF() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJJJI(C625470Og5.LLILZIL, jLJI, curSecUserId);
    }

    public static String LJII() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return null;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJJIJIL(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static Object LJIIIZ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJFF = interfaceC625570OgFLIZLLL.LJFF(jLJI, C625470Og5.LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJFF) {
            LIZ.getClass();
            arrayList.add(LJJ(c796910VNx));
        }
        return arrayList;
    }

    public static Object LJIIJJI() {
        int iLJJ;
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            iLJJ = 0;
        } else {
            long jLJI = LJI();
            C625470Og5.LL.getClass();
            iLJJ = interfaceC625570OgFLIZLLL.LJJ(jLJI, C625470Og5.LLILZIL, curSecUserId);
        }
        return C2286608xc.LJ(iLJJ);
    }

    public static int LJIIL() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return 0;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LIZIZ(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static Object LJIILJJIL() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJIIIIZZ = interfaceC625570OgFLIZLLL.LJIIIIZZ(jLJI, C625470Og5.LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJIIIIZZ) {
            LIZ.getClass();
            arrayList.add(LJJ(c796910VNx));
        }
        return arrayList;
    }

    public static Object LJIILLIIL() {
        int iLJIIIZ;
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            iLJIIIZ = 0;
        } else {
            long jLJI = LJI();
            C625470Og5.LL.getClass();
            iLJIIIZ = interfaceC625570OgFLIZLLL.LJIIIZ(jLJI, C625470Og5.LLILZIL, curSecUserId);
        }
        return C2286608xc.LJ(iLJIIIZ);
    }

    public static List LJIIZILJ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LIZLLL(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static List LJIJ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJ = interfaceC625570OgFLIZLLL.LJ(jLJI, C625470Og5.LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJ) {
            LIZ.getClass();
            arrayList.add(LJJ(c796910VNx));
        }
        return arrayList;
    }

    public static Object LJIJJ() {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJIILL(jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static Object LJIJJLI() {
        int iLJIIJJI;
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            iLJIIJJI = 0;
        } else {
            long jLJI = LJI();
            C625470Og5.LL.getClass();
            iLJIIJJI = interfaceC625570OgFLIZLLL.LJIIJJI(jLJI, C625470Og5.LLILZIL, curSecUserId);
        }
        return C2286608xc.LJ(iLJIIJJI);
    }

    public static Object LIZJ(int i) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJJIIZI = interfaceC625570OgFLIZLLL.LJJIIZI(i, jLJI, C625470Og5.LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJJIIZI) {
            LIZ.getClass();
            arrayList.add(LJJ(c796910VNx));
        }
        return arrayList;
    }

    public static Object LJ(int i) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        return interfaceC625570OgFLIZLLL.LJJIJL(i, jLJI, C625470Og5.LLILZIL, curSecUserId);
    }

    public static Object LJIIIIZZ(int i) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return null;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJIJJ = interfaceC625570OgFLIZLLL.LJIJJ(i, jLJI, C625470Og5.LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIJJ, 10));
        for (C796910VNx c796910VNx : listLJIJJ) {
            try {
                LIZ.getClass();
                Aweme awemeLJJ = LJJ(c796910VNx);
                C0N9C c0n9c = C0N9C.OFFLINE_MODE;
                String aid = awemeLJJ.getAid();
                if (aid == null) {
                    return null;
                }
                arrayList.add(new C0NHH(c0n9c, aid, null, awemeLJJ, "offline_mode", LJI(), c796910VNx.LIZIZ, c796910VNx));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return arrayList;
    }

    public static Aweme LJIILL(String str) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        Aweme awemeLJJ = null;
        if (curSecUserId == null) {
            return null;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        C796910VNx c796910VNxLJIILJJIL = interfaceC625570OgFLIZLLL.LJIILJJIL(jLJI, C625470Og5.LLILZIL, curSecUserId, str);
        if (c796910VNxLJIILJJIL != null) {
            try {
                LIZ.getClass();
                awemeLJJ = LJJ(c796910VNxLJIILJJIL);
                return awemeLJJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return awemeLJJ;
    }

    public static List LJIJI(List list) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List<C796910VNx> listLJJIJLIJ = interfaceC625570OgFLIZLLL.LJJIJLIJ(jLJI, C625470Og5.LLILZIL, curSecUserId, list);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJJIJLIJ) {
            LIZ.getClass();
            arrayList.add(LJJ(c796910VNx));
        }
        return arrayList;
    }

    public static Aweme LJJ(C796910VNx c796910VNx) {
        boolean zBooleanValue;
        Boolean bool;
        Boolean bool2 = null;
        Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(c796910VNx.LIZJ, null);
        if (awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme.getOfflineVideoInfo() == null) {
            C661502i5 c661502i5 = c796910VNx.LIZJ.offline_video_info;
            if (c661502i5 != null && (bool = c661502i5.ug_review_passed) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C661502i5 c661502i52 = c796910VNx.LIZJ.offline_video_info;
            if (c661502i52 != null) {
                bool2 = c661502i52.download_comment_enable;
            }
            awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme.setOfflineVideoInfo(new OfflineVideoInfo(true, zBooleanValue, bool2));
        } else {
            OfflineVideoInfo offlineVideoInfo = awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme.getOfflineVideoInfo();
            if (offlineVideoInfo != null) {
                offlineVideoInfo.setOfflineVideo(true);
                return awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme;
            }
        }
        return awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme;
    }

    public static Object LJJI(String str) {
        int iLJJIZ;
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            iLJJIZ = 0;
        } else {
            iLJJIZ = interfaceC625570OgFLIZLLL.LJJIZ(System.currentTimeMillis(), curSecUserId, str);
        }
        return C2286608xc.LJ(iLJJIZ);
    }

    public static Object LJIIJ(int i, int i2) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List listLJIIJ = interfaceC625570OgFLIZLLL.LJIIJ(i, jLJI, C625470Og5.LLILZIL, i2, curSecUserId);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJIIJ.iterator();
        while (it2.hasNext()) {
            Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = null;
            try {
                awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(((C796910VNx) it2.next()).LIZJ, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme != null) {
                arrayList.add(awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme);
            }
        }
        return arrayList;
    }

    public static Object LJIILIIL(int i, int i2) {
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = LIZLLL();
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = LJI();
        C625470Og5.LL.getClass();
        List listLJJIJIIJI = interfaceC625570OgFLIZLLL.LJJIJIIJI(i, jLJI, C625470Og5.LLILZIL, i2, curSecUserId);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJIJIIJI.iterator();
        while (it2.hasNext()) {
            Aweme awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = null;
            try {
                awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(((C796910VNx) it2.next()).LIZJ, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme != null) {
                arrayList.add(awemeCom$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme);
            }
        }
        return arrayList;
    }

    public static Object LJIL(String str, List list) {
        boolean zBooleanValue;
        Boolean bool;
        String curSecUserId = LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        if (!Intrinsics.LJFF(curSecUserId, str)) {
            return C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C5186020i c5186020i = (C5186020i) it2.next();
            String str2 = c5186020i.aweme_id;
            C661502i5 c661502i5 = c5186020i.offline_video_info;
            if (c661502i5 != null && (bool = c661502i5.ug_review_passed) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            arrayList.add(new C796910VNx(str, jCurrentTimeMillis, c5186020i, str2, false, false, Long.MAX_VALUE, "", 0.0f, zBooleanValue));
        }
        return LIZLLL().LJJIIZ(arrayList);
    }
}
