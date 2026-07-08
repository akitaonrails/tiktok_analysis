package X;

import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration;
import com.ss.android.ugc.aweme.share.business.config.IncentiveAwemeShareConfiguration;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0loS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372220loS {
    public static final C1372220loS LIZ = new C1372220loS();

    public static ShareConfiguration LIZ(Aweme aweme, AwemeSharePackage awemeSharePackage) {
        AbstractC1372690lpD abstractC1372690lpD;
        String string = awemeSharePackage.extras.getString("panel_source");
        boolean z = awemeSharePackage.extras.getBoolean("is_referral", false);
        C1372210loR c1372210loR = C1372210loR.LIZ;
        ShareOperationInfo shareOperationInfo = aweme.getShareOperationInfo();
        c1372210loR.getClass();
        C1372210loR.LIZ(shareOperationInfo);
        C1372210loR.LIZLLL(shareOperationInfo, z);
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
        if (C1895800zQw.LJIIL(aweme) && Intrinsics.LJFF(string, "share_panel")) {
            abstractC1372690lpD = IncentiveAwemeShareConfiguration.LLILLL;
        } else {
            abstractC1372690lpD = AwemeShareConfiguration.LLILLJJLI;
        }
        ShareConfiguration<BaseSharePackage> shareConfigurationLJJI = C621180OYa.LIZ.LJJI(abstractC1372690lpD);
        if (shareConfigurationLJJI == null) {
            return new AwemeShareConfiguration();
        }
        return shareConfigurationLJJI;
    }
}
