package X;

import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;

/* JADX INFO: renamed from: X.0HHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438620HHw {
    public static final C438620HHw LIZ = new C438620HHw();

    public static File LIZ(EnumC438630HHx enumC438630HHx) {
        String anywhereChannelPath;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null && (anywhereChannelPath = iMainService.getAnywhereChannelPath("story_thought_bg_res")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anywhereChannelPath);
            sbLIZ.append('/');
            sbLIZ.append(enumC438630HHx.getFileName());
            File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), C2188811AlT.LIZIZ(sbLIZ));
            if (fileLJFF != null && fileLJFF.exists()) {
                return fileLJFF;
            }
            return null;
        }
        return null;
    }

    public static void LIZIZ(EnumC438630HHx enumC438630HHx, SmartImageView smartImageView) {
        File fileLIZ = LIZ(enumC438630HHx);
        if (fileLIZ != null) {
            smartImageView.setImageURI(Uri.fromFile(fileLIZ));
            return;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(enumC438630HHx.getBackupUrl());
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }
}
