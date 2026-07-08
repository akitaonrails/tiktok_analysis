package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718400SFy extends C0SGE {
    public boolean LIZJ;

    public C718400SFy(C718360SFu c718360SFu) {
        super(c718360SFu);
        InterfaceC718380SFw interfaceC718380SFw = new InterfaceC718380SFw() { // from class: X.0SFx
            @Override // X.InterfaceC718380SFw
            public final void LIZ(EnumC707450Rp1 enumC707450Rp1) {
                boolean z;
                C718400SFy c718400SFy = this.LIZ;
                if (enumC707450Rp1 == EnumC707450Rp1.SELECTED) {
                    z = true;
                } else {
                    z = false;
                }
                c718400SFy.LIZJ = z;
            }
        };
        C718370SFv c718370SFv = c718360SFu.LIZ;
        if (!((ArrayList) c718370SFv.LIZIZ).contains(interfaceC718380SFw)) {
            ((ArrayList) c718370SFv.LIZIZ).add(interfaceC718380SFw);
        }
    }

    @Override // X.C0SGE, X.C0SH2
    public final boolean LIZJ(VideoItemParams videoItemParams) {
        BannerCommonStruct bannerCommonStruct;
        Aweme aweme;
        Aweme aweme2;
        List<BannerCommonStruct> banners;
        BannerCommonStruct next;
        String str;
        boolean z = this.LIZJ;
        if (z) {
            this.LIZJ = false;
        }
        String str2 = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && (banners = aweme2.getBanners()) != null) {
            Iterator<BannerCommonStruct> it2 = banners.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BannerCommonKey bannerCommonKey = next.bannerKey;
                    if (bannerCommonKey != null) {
                        str = bannerCommonKey.componentKey;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "bottom_banner_promote_video_entrance")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            bannerCommonStruct = next;
        } else {
            bannerCommonStruct = null;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService == null) {
            return false;
        }
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        String str3 = this.LIZ.LJFF;
        if (bannerCommonStruct != null) {
            str2 = bannerCommonStruct.customizedInfo;
        }
        return iCommercePromoteService.LJIILJJIL(aweme, str3, str2, Boolean.valueOf(z));
    }

    @Override // X.C0SGE, X.C0SH2
    public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
        if (C0SG4.LIZ[bannerActionType.ordinal()] != 1) {
            C707460Rp2 c707460Rp2 = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("default action is not supported ");
            sbLIZ.append(bannerActionType);
            c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
