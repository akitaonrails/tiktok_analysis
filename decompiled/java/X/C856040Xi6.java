package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0Xi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856040Xi6 {
    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> list = PublishExtensionModel.fromContext(videoPublishEditModel).createAnchorInfos;
        if (list != null) {
            for (CreateAnchorInfo createAnchorInfo : list) {
                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(createAnchorInfo.getType()))) {
                    if (createAnchorInfo != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static VideoPublishViewModel LIZJ(AbstractC214814194y abstractC214814194y) {
        return (VideoPublishViewModel) C1659640tI2.LIZLLL(abstractC214814194y).LIZ(VideoPublishViewModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.C856060Xi8 r15) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C856040Xi6.LIZ(X.0Xi8):void");
    }
}
