package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;

/* JADX INFO: renamed from: X.09pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2489809pI {
    public static final /* synthetic */ int LIZ = 0;

    public static File LIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(creativeInfo, EnumC20228214Cy.PHOTO_MODE, "buffer", true);
    }

    public static File LIZIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(creativeInfo, EnumC20228214Cy.PHOTO_MODE, "edit_temp", true);
    }

    public static File LIZJ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(creativeInfo, EnumC20228214Cy.PHOTO_MODE, "origin", true);
    }

    public static File LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return C2298308zV.LIZ(videoPublishEditModel, EnumC20228014Cw.SAVE_TO_LOCAL, "watermarks");
    }
}
