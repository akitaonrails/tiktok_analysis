package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AwS43S2100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362810lZH implements InterfaceC1361740lXY<C1362460lYi> {
    public final C1362160lYE LIZ;

    public final void LIZJ() {
        String string;
        String string2;
        Bundle bundle;
        Bundle bundle2;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Bundle bundle3;
        C19EG c19eg;
        IExternalService iExternalService;
        IAvatarPublishStoryService iAvatarPublishStoryServiceAvatarService;
        Activity activityLIZIZ2;
        SharePackage sharePackage = this.LIZ.LIZIZ;
        Activity activityLIZ2 = null;
        if (Intrinsics.LJFF(sharePackage != null ? sharePackage.itemType : null, "aigc_avatar")) {
            C1364620lcC.LJII(C1364620lcC.LIZ);
            SharePackage sharePackage2 = this.LIZ.LIZIZ;
            if (sharePackage2 == null || (bundle3 = sharePackage2.extras) == null) {
                return;
            }
            String string3 = bundle3.getString("uncrop_avatar_path", "");
            String string4 = bundle3.getString("origin_no_crop_avatar_path", "");
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("is_aivatar", true);
            C786410Ut5.LJJJI("origin_avatar_url", string3, bundle4);
            C786410Ut5.LJJJI("origin_no_crop_avatar_path", string4, bundle4);
            C786410Ut5.LJJJI("enter_method", "share_panel_post", bundle4);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2);
            }
            if (!(activityLIZ2 instanceof C19EG) || (c19eg = (C19EG) activityLIZ2) == null || (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) == null || (iAvatarPublishStoryServiceAvatarService = iExternalService.avatarService()) == null) {
                return;
            }
            IAvatarPublishStoryService.DefaultImpls.publishDirectly$default(iAvatarPublishStoryServiceAvatarService, c19eg, bundle4, false, false, new AwS565S0100000_21(this, 1218), 8, null);
            return;
        }
        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LIZ.LIZIZ);
        if (awemeLJJIJIL == null) {
            return;
        }
        InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LJIILIIL();
        }
        InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            interfaceC1618460sDcLJIJJLI.LJIIJ(new C20271514Tp(activityLIZ, awemeLJJIJIL, this.LIZ.LIZJ, null, null, null, 0, C1375730lu7.LIZIZ.LJI(), null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031672));
        }
        SharePackage sharePackage3 = this.LIZ.LIZIZ;
        if (sharePackage3 == null || (bundle2 = sharePackage3.extras) == null || (string = bundle2.getString("share_to_story_entrance_icon")) == null) {
            string = "";
        }
        SharePackage sharePackage4 = this.LIZ.LIZIZ;
        if (sharePackage4 == null || (bundle = sharePackage4.extras) == null || (string2 = bundle.getString("share_to_story_enter_method")) == null) {
            string2 = "";
        }
        interfaceC1618460sDcLJIJJLI.LJI(awemeLJJIJIL, "share_to_story_click", new AwS43S2100000_21(this, string2, string, 1));
    }

    public C1362810lZH(C1362160lYE c1362160lYE) {
        this.LIZ = c1362160lYE;
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        LIZJ();
    }

    @Override // X.InterfaceC1361740lXY
    public final /* bridge */ /* synthetic */ void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
    }
}
