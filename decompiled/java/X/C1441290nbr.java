package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441290nbr {
    public static C348470DlN LIZ(VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return new C348470DlN(C1428470nHB.LJIIJ(videoPublishEditModel), videoPublishEditModel.getAutoEnhanceType(), z2, C1661700tLM.LIZ(), C1661700tLM.LIZIZ(), new C348480DlO(C0MH2.LIZ(videoPublishEditModel, z), C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228014Cw.VE_LENS_ONE_KEY_HDR, null, 12), C0MH2.LIZ(videoPublishEditModel, z)));
    }
}
