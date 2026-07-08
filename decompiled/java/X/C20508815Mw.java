package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.BcUsageConfirmThreshold;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;

/* JADX INFO: renamed from: X.15Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20508815Mw {
    public static final C20508815Mw LIZ = new C20508815Mw();

    public static TcmConfig LIZ() {
        C1403010mc7.LIZ.getCommerceService().getClass();
        return C305810Byl.LIZ();
    }

    public static boolean LIZIZ() {
        TcmConfig tcmConfigLIZ = LIZ();
        if (tcmConfigLIZ != null) {
            return tcmConfigLIZ.isTcmCreator();
        }
        return false;
    }

    public static boolean LIZJ() {
        TcmConfig tcmConfigLIZ;
        IFoundationAVServiceProxy iFoundationAVServiceProxy;
        TcmConfig tcmConfigLIZ2 = LIZ();
        return tcmConfigLIZ2 != null && tcmConfigLIZ2.getUseBcEntranceInPost() && (tcmConfigLIZ = LIZ()) != null && tcmConfigLIZ.isTcmCreator() && ((iFoundationAVServiceProxy = (IFoundationAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IFoundationAVServiceProxy.class, false, false, false, 14, null)) == null || iFoundationAVServiceProxy.complianceService() == null || !ComplianceServiceProvider.LJIJJ().LJJIIZ());
    }

    public static final boolean LIZLLL() {
        TcmConfig tcmConfigLIZ;
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        LIZ.getClass();
        TcmConfig tcmConfigLIZ2 = LIZ();
        return (tcmConfigLIZ2 == null || !tcmConfigLIZ2.getUseBcEntranceInPost() || (tcmConfigLIZ = LIZ()) == null || tcmConfigLIZ.isTcmCreator()) ? false : true;
    }

    public static boolean LJ() {
        BcUsageConfirmThreshold bcUsageConfirmThreshold;
        TcmConfig tcmConfigLIZ = LIZ();
        if (tcmConfigLIZ == null || (bcUsageConfirmThreshold = tcmConfigLIZ.getBcUsageConfirmThreshold()) == null) {
            return false;
        }
        return bcUsageConfirmThreshold.getApp();
    }
}
