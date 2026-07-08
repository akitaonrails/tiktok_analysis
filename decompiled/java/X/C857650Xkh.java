package X;

import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS154S0101000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Xkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857650Xkh extends AbstractC856710XjB {
    @Override // X.AbstractC856710XjB
    public final int LIZ() {
        return C0FPS.ECOMMERCE.getScene();
    }

    @Override // X.AbstractC856710XjB
    public final boolean LIZJ() {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZZIII();
    }

    @Override // X.AbstractC856710XjB
    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getHasShopAnchor() && !C857680Xkk.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC856710XjB
    public final void LJFF(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, AwS593S0100000_14 awS593S0100000_14) {
        PreCheckResult preCheckResult = this.LIZ;
        if (preCheckResult != null) {
            C858290Xlj.LIZ(fragmentManager, context, preCheckResult, videoPublishEditModel, "video_edit_page", "", LIZ(), null, awS593S0100000_14);
        }
    }

    @Override // X.AbstractC856710XjB
    public final void LJ(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, AwS154S0101000_14 awS154S0101000_14, AwS154S0101000_14 awS154S0101000_142) {
        C856830XjN.LIZLLL();
        C858290Xlj.LIZ.getClass();
        C856820XjM c856820XjM = C856820XjM.LIZ;
        Boolean bool = Boolean.FALSE;
        c856820XjM.getClass();
        C856820XjM.LIZIZ(this, videoPublishEditModel, bool, bool);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bmk, null, false);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS415S0200000_14(viewTd, awS154S0101000_14, 63));
        c0om1.LIZIZ(c1251150ifB);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.csy);
        if (c197039127h != null) {
            c197039127h.setButtonVariant(0);
            C786410Ut5.U8(c197039127h, new ACListenerS117S0200000_14(awS154S0101000_142, viewTd, 14));
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = viewTd;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC346360Dhy(viewTd, 1);
        tuxSheet2.show(fragmentManager, "showAuthorizeDialog");
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = videoPublishEditModel.getCreationId();
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        int iLIZ = LIZ();
        String musicId = videoPublishEditModel.getMusicId();
        boolean zLIZIZ = C857680Xkk.LIZIZ(videoPublishEditModel);
        c856790XjJ.getClass();
        C856790XjJ.LJIIIIZZ(iLIZ, i, zLIZIZ ? 1 : 0, creationId, str, strValueOf, strLJIILL, strLJIILIIL, musicId);
    }
}
