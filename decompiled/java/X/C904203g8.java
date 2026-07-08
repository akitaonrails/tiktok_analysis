package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03g8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C904203g8 {
    public static boolean LJIIJ;
    public static final boolean LJIIJJI;
    public C894003eU LIZLLL;
    public boolean LJI;
    public Integer LJIIIIZZ;
    public final String LIZ = "1";
    public final String LIZIZ = "1";
    public final int LIZJ = 1;
    public Function2<? super C894003eU, ? super Integer, Unit> LJ = AFwS284S0000000_1.get$arr$(7);
    public Function2<? super String, ? super Integer, Unit> LJFF = AFwS284S0000000_1.get$arr$(6);
    public OcrStatus LJII = new OcrStatus("-1", "-1", "-1");
    public final C904303g9 LJIIIZ = new InterfaceC1722230uuz() { // from class: X.03g9
        @Override // X.InterfaceC1722230uuz
        public final void LIZ(int i, int i2, String str, C1715400ujy c1715400ujy, String str2) {
            String strLJJIFFI;
            C904203g8 c904203g8 = this.LIZ;
            if (i == c904203g8.LIZJ && c1715400ujy != null) {
                C895503ej c895503ejLJ = C904203g8.LJ(c1715400ujy.LJI);
                Function2<? super C894003eU, ? super Integer, Unit> function2 = this.LIZ.LJ;
                String str3 = c1715400ujy.LIZ;
                if (str3 != null) {
                    strLJJIFFI = u.LJJIFFI(str3, " ", "", false);
                } else {
                    strLJJIFFI = null;
                }
                C894003eU c894003eU = new C894003eU(strLJJIFFI, c895503ejLJ, c1715400ujy.LJII);
                this.LIZ.getClass();
                function2.invoke(c894003eU, 0);
            } else {
                Function2<? super String, ? super Integer, Unit> function22 = c904203g8.LJFF;
                if (str == null) {
                    str = "";
                }
                function22.invoke(str, 0);
            }
            C904203g8 c904203g82 = this.LIZ;
            if (!c904203g82.LJI) {
                c904203g82.LJII = new OcrStatus(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, "-1");
            }
            this.LIZ.LJI = true;
            C904203g8.LJIIJ = false;
        }
    };

    static {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test")) {
                z = false;
            }
        }
        LJIIJJI = z;
    }

    public static OcrStatus LIZIZ(C894003eU c894003eU) {
        String str;
        boolean z;
        String str2;
        String str3;
        Boolean boolValueOf;
        C922003j0 c922003j0;
        OcrStatus ocrStatus = new OcrStatus("-1", "-1", "-1");
        String str4 = c894003eU.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        C931003kS c931003kS = C932203ke.LIZ;
        C931603kY c931603kYLIZIZ = c931003kS.LIZIZ(str4);
        if (c931603kYLIZIZ != null) {
            str = c931603kYLIZIZ.LJI;
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str != null && str.length() != 0 && str4.length() != 0) {
            try {
                z = c931003kS.LJI(Boolean.FALSE, str, "eg_ccdc_global_card_number", str4).LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                z = true;
            }
        } else {
            z = false;
        }
        if (str4.length() != 0) {
            ocrStatus = OcrStatus.LIZ(ocrStatus, C893803eS.LIZ(z), null, 6);
        }
        C895503ej c895503ej = c894003eU.LIZIZ;
        c895503ej.getClass();
        if (str != null && str.length() != 0 && (((str2 = c895503ej.LIZ) != null && str2.length() != 0) || ((str3 = c895503ej.LIZIZ) != null && str3.length() != 0))) {
            try {
                C922003j0 c922003j0LJII = C932203ke.LIZ.LJII(str, c895503ej.LIZ, c895503ej.LIZIZ);
                if (c922003j0LJII.LJ == null) {
                    c922003j0LJII.LJ = new ArrayList();
                }
                List<C922003j0> list = c922003j0LJII.LJ;
                if (list != null) {
                    c922003j0 = (C922003j0) C13LP.LJJJLZIJ(0, list);
                } else {
                    c922003j0 = null;
                }
                if (c922003j0LJII.LIZ && c922003j0 != null && c922003j0.LIZ) {
                    z2 = true;
                }
                boolValueOf = Boolean.valueOf(z2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
                boolValueOf = Boolean.TRUE;
            }
            if (boolValueOf != null) {
                return OcrStatus.LIZ(ocrStatus, null, C893803eS.LIZ(boolValueOf.booleanValue()), 5);
            }
        }
        return ocrStatus;
    }

    public static C895503ej LJ(String str) {
        char[] charArray;
        Object c098200Yq;
        Object c098200Yq2;
        Object obj = null;
        if (str != null && (charArray = str.toCharArray()) != null) {
            ArrayList arrayList = new ArrayList();
            for (char c : charArray) {
                if ('0' <= c && c < ':') {
                    arrayList.add(Character.valueOf(c));
                }
            }
            char[] cArrLLFFF = C13LP.LLFFF(arrayList);
            if (cArrLLFFF != null) {
                String str2 = new String(cArrLLFFF);
                try {
                    c098200Yq = a0.LJJLIIIJLLLLLLLZ(str2, new IntRange(0, 1));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str3 = (String) c098200Yq;
                try {
                    c098200Yq2 = str2.substring(2, Math.min(str2.length(), 4));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                return new C895503ej((String) obj, str3);
            }
        }
        return new C895503ej(null, null);
    }

    public final OcrStatus LIZ(C894003eU c894003eU) {
        boolean z;
        OcrStatus ocrStatus = new OcrStatus("-1", "-1", "-1");
        C894003eU c894003eU2 = this.LIZLLL;
        if (c894003eU2 == null) {
            return ocrStatus;
        }
        String str = c894003eU2.LIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ocrStatus = OcrStatus.LIZ(ocrStatus, C893803eS.LIZ(Intrinsics.LJFF(str, c894003eU.LIZ)), null, 6);
        }
        if (c894003eU2.LIZIZ.LIZ()) {
            return OcrStatus.LIZ(ocrStatus, null, C893803eS.LIZ(Intrinsics.LJFF(c894003eU.LIZIZ, c894003eU2.LIZIZ)), 5);
        }
        return ocrStatus;
    }

    public final Boolean LIZJ(String str) {
        String str2;
        C894003eU c894003eU = this.LIZLLL;
        if (c894003eU != null && (str2 = c894003eU.LIZ) != null && str2.length() != 0) {
            return Boolean.valueOf(Intrinsics.LJFF(c894003eU.LIZ, str));
        }
        return null;
    }

    public final void LJFF(Function1<? super OcrStatus, OcrStatus> function1) {
        if (!this.LJI) {
            return;
        }
        this.LJII = function1.invoke(this.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C904203g8 c904203g8, Map map, int i) {
        C1723860uxc c1723860uxc;
        String str;
        String str2;
        String str3;
        Map map2 = null;
        if ((i & 1) != 0) {
            C914303hl.LIZ.getClass();
            Cashier cashier = C914303hl.LIZIZ;
            String str4 = "";
            if (cashier == null || (str = cashier.merchantId) == null) {
                str = "";
            }
            Cashier cashier2 = C914303hl.LIZIZ;
            if (cashier2 == null || (str2 = cashier2.merchantUserId) == null) {
                str2 = "";
            }
            Cashier cashier3 = C914303hl.LIZIZ;
            if (cashier3 != null && (str3 = cashier3.nonce) != null) {
                str4 = str3;
            }
            c1723860uxc = new C1723860uxc(0, str, str2, str4, c904203g8.LIZIZ, c904203g8.LIZ, null, null);
        } else {
            c1723860uxc = null;
        }
        int i2 = i & 2;
        if ((i & 4) == 0) {
            map2 = map;
        }
        try {
            C933503kr c933503kr = C933503kr.LIZ;
            C905103gH c905103gH = C905103gH.LIZIZ;
            C904303g9 c904303g9 = c904203g8.LJIIIZ;
            c933503kr.getClass();
            ((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LIZ(c1723860uxc, c905103gH, c904303g9, null, "tts", map2);
            LJIIJ = true;
            c904203g8.LJIIIIZZ = c1723860uxc.LIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c904203g8.LJFF.invoke("sdk didn't init!!", 0);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR19;
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, e, C03O0.LIZIZ);
            if (LJIIJJI) {
                throw e;
            }
        }
    }
}
