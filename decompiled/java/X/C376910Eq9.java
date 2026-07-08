package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376910Eq9 {
    public static final C376910Eq9 LIZ = new C376910Eq9();
    public static C0EJ4 LIZIZ = new C376900Eq8();

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        return LIZIZ.LIZLLL(videoPublishEditModel);
    }

    public static final Boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        return LIZIZ.LIZIZ(videoPublishEditModel);
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        C376890Eq7.LIZ.getClass();
        if (C306670C0j.LIZ() && C376930EqB.LIZ()) {
            if ((!videoPublishEditModel.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor || !Intrinsics.LJFF(C376890Eq7.LJI(videoPublishEditModel), Boolean.TRUE)) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate && ((Boolean) C298980Bnk.LIZIZ(Boolean.TRUE, Boolean.valueOf(C0AYL.LIZ(Integer.valueOf(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()))))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        return LIZIZ.LIZ(videoPublishEditModel, z);
    }
}
