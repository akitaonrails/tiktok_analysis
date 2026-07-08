package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.api.EventTrackData;
import com.ss.android.ugc.aweme.ecommerce.anchor.api.RecommendProductApi;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706820uW8 {
    public static C099G LJ;
    public static AnonymousClass0956 LJFF;
    public static String LJI;
    public static List<String> LJII;
    public static EventTrackData LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C1706820uW8 LIZ = new C1706820uW8();
    public static final RecommendProductApi LIZIZ = (RecommendProductApi) C0NSL.LIZ().create(RecommendProductApi.class);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(61));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(62));
    public static String LJIIJ = "";
    public static C099F LJIIJJI = C090F.LIZIZ();
    public static EnumC1706810uW7 LJIIL = EnumC1706810uW7.LLILLJJLI;

    public static boolean LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z = false;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IBusinessDependencyService.class.getName(), anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_close_product_suggestions_");
            sbLIZ.append(LJFF());
            z = !Intrinsics.LJFF(((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).getReactNativeStorage(C2188811AlT.LIZIZ(sbLIZ), ""), "true");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static boolean LIZIZ() {
        Keva keva = C1257480ipO.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recommend_product_show_blue_bg");
        sbLIZ.append(LJFF());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LIZJ() {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJJZ()) {
            C21272618Mq.LIZ.getClass();
            if (C21272618Mq.LJIILJJIL() && LIZ()) {
                return true;
            }
        }
        LJIIIIZZ();
        return false;
    }

    public static int LIZLLL() {
        EventTrackData eventTrackData = LJIIIIZZ;
        if (eventTrackData == null || eventTrackData.hasEcomIntent == null) {
            return -1;
        }
        return (eventTrackData == null || !Intrinsics.LJFF(eventTrackData.hasEcomIntent, Boolean.TRUE)) ? 0 : 1;
    }

    public static Map LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> list = LJII;
        linkedHashMap.put("suggested_products", Integer.valueOf(list != null ? ((ArrayList) list).size() : 0));
        LIZ.getClass();
        linkedHashMap.put("is_suggestion_on", Integer.valueOf(LIZ() ? 1 : 0));
        linkedHashMap.put("ecommerce_intention", Integer.valueOf(LIZLLL()));
        linkedHashMap.put("is_blue_bg", Integer.valueOf(LJIIIZ ? 1 : 0));
        AnchorBizUtils.LIZ.getClass();
        linkedHashMap.put("ecommerce_type", Integer.valueOf(AnchorBizUtils.LJJJJZ() ? 1 : 0));
        return C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static void LJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> list = LJII;
        linkedHashMap.put("suggested_products", Integer.valueOf(list != null ? ((ArrayList) list).size() : 0));
        LIZ.getClass();
        linkedHashMap.put("is_suggestion_on", Integer.valueOf(LIZ() ? 1 : 0));
        linkedHashMap.put("ecommerce_intention", Integer.valueOf(LIZLLL()));
        linkedHashMap.put("is_blue_bg", Integer.valueOf(LJIIIZ ? 1 : 0));
        C1421105hJ.LIZJ("tiktokec_video_recommend_product_show", linkedHashMap);
    }

    public static void LJIIIIZZ() {
        C099G c099g = LJ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        LJ = null;
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJFF = null;
        LJI = null;
        LJII = null;
        LJIIIIZZ = null;
        LJIIIZ = false;
        LJIIJJI = C090F.LIZIZ();
    }

    public static String LJFF() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        return userId == null ? "" : userId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
    
        if (r12 > 0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r9
      0x002a: PHI (r9v4 java.lang.Object) = (r9v3 java.lang.Object), (r9v0 java.lang.Object) binds: [B:73:0x010e, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706820uW8.LJII(int, java.lang.String, X.05Vn):java.lang.Object");
    }
}
