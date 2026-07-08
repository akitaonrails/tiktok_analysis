package X;

import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Set;

/* JADX INFO: renamed from: X.0MZY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZY {
    public static final C0MZY LIZ = new C0MZY();

    public static Set LIZIZ() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                return C0CHQ.LIZ().LJJIIJZLJL().getAllowListService().getPrefixAllowList();
            }
        }
        return C08CX.INSTANCE;
    }

    public static void LIZJ() {
        C0CHQ.LIZ().getApplicationService().getClass();
    }

    @InterfaceC1294060jmO
    public static final String LIZ(AwemeDraft awemeDraft) {
        String draftDir;
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        if (aVDraftExtras.isFastImport) {
            EditPreviewInfo editPreviewInfoLJ = C0MZ9.LJ(awemeDraft, false);
            if (editPreviewInfoLJ == null || (draftDir = editPreviewInfoLJ.getDraftDir()) == null) {
                return "";
            }
            return draftDir;
        }
        String strLIZJ = C08HM.LIZJ(aVDraftExtras.draftVideoPath);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1449640npK.LIZJ);
        sbLIZ.append(strLIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }
}
