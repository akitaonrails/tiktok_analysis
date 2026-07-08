package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0ncr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441910ncr {
    public static final C1441910ncr LIZ = new C1441910ncr();

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String strLIZIZ;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        if (str2 == null) {
            return null;
        }
        C141Q.LIZ.getClass();
        if (C141Q.LJII(str2)) {
            C20187213yo.LIZ.getClass();
            if (C20187213yo.LIZIZ.containsKey(str2)) {
                return null;
            }
            IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
            if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                strLIZIZ = interfaceC1662290tMJLIZJ.LIZIZ(str2, -1, str, videoPublishEditModel.mShootWay, Integer.valueOf(videoPublishEditModel.getMMusicType()), C1428470nHB.LJIILL(videoPublishEditModel), "", videoPublishEditModel.getMMusicUrlKey(str2));
            } else {
                strLIZIZ = null;
            }
            if (C123100dR.LIZ(strLIZIZ)) {
                return strLIZIZ;
            }
        }
        return null;
    }
}
