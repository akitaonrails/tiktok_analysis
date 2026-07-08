package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.InviteAndShareConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.CampaignInfoModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18LI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LI {
    public static final C18LI LIZ = new C18LI();
    public static C18LJ LIZIZ;

    public static void LIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
        if (LIZIZ == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C18LL((InviteAndShareConfig) C18LK.LIZIZ.getValue(), interfaceC1392640mLO, null), 3);
    }

    public static String LIZIZ(String str) {
        C18LJ c18lj;
        CampaignInfoModel campaignInfoModel;
        if (str == null || (c18lj = LIZIZ) == null || !Intrinsics.LJFF(c18lj.LIZ, str) || (campaignInfoModel = c18lj.LIZIZ) == null) {
            return null;
        }
        return campaignInfoModel.campaignInfo;
    }

    public static Map LIZJ(Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return LIZLLL(aid);
    }

    public static Map LIZLLL(String str) {
        CampaignInfoModel campaignInfoModel;
        Map<String, String> map;
        if (str == null) {
            return C2097608Jq.LJ();
        }
        C18LJ c18lj = LIZIZ;
        if (c18lj != null && Intrinsics.LJFF(c18lj.LIZ, str) && (campaignInfoModel = c18lj.LIZIZ) != null && (map = campaignInfoModel.daInfo) != null) {
            return map;
        }
        return C2097608Jq.LJ();
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        if (aweme == null) {
            return false;
        }
        C18LJ c18lj = LIZIZ;
        if (c18lj != null) {
            str = c18lj.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, aweme.getAid());
    }

    public static void LJI(String str) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        IECommerceHostService iECommerceHostService3;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        String name3 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService3 != null) {
                    name = iECommerceHostService3.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService3).getChannel(), "local_test")) {
                return;
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z = true;
            } else {
                z = false;
            }
            String name6 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name3 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(((IApplicationDependencyService) iECommerceHostService2).getApplicationContext());
        c1233040iBy.LIZJ(str);
        c1233040iBy.LIZLLL();
    }

    public static void LJFF(String str, String str2, boolean z) {
        Type type;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(CampaignInfoModel.class));
            } else {
                type = new TypeToken<CampaignInfoModel>() { // from class: X.18LH
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
            if (!(objFromJson instanceof CampaignInfoModel)) {
                objFromJson = null;
            }
            CampaignInfoModel campaignInfoModel = (CampaignInfoModel) objFromJson;
            if (campaignInfoModel != null) {
                LIZIZ = new C18LJ(str, campaignInfoModel, z);
                LJI("found ec_campaign_info -> ".concat(str2));
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
