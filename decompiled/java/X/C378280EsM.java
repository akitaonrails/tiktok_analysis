package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;

/* JADX INFO: renamed from: X.0EsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378280EsM {
    public static final /* synthetic */ int LIZ = 0;

    public static VideoPublishEditModel LIZIZ() {
        if (!C364210EPr.LIZIZ) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!((Boolean) C273490Anj.LIZ.getValue()).booleanValue() || videoPublishEditModel == null || !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return true;
    }
}
