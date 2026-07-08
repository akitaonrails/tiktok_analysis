package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434850nRT {
    public static final /* synthetic */ int LIZ = 0;

    public static C1434860nRU LIZ(VideoPublishEditModel videoPublishEditModel, C1D82 c1d82, C1D82 c1d822, C1D82 c1d823) {
        boolean z;
        C1D82 c1d824;
        C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(388), EnumC1434770nRL.UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL);
        if (C0L1C.LIZ() && videoPublishEditModel.isSaveLocal()) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_after_moderation", true, false);
        boolean zIsSaveLocalWithWaterMark = videoPublishEditModel.isSaveLocalWithWaterMark();
        if (zLJIIIZ && zIsSaveLocalWithWaterMark) {
            c1d824 = new C1D82(AFwS210S0000000_22.get$arr$(386), EnumC1434770nRL.ORIGINAL_FRAME_UPLOAD);
            if (c1d823 != null) {
                c1d824.LIZ(c1d823);
            }
            c1d824.LIZ(c1d822);
            c1d824.LIZ(c1d82);
            if (z) {
                c1d824.LIZ(c1d825);
            }
        } else {
            c1d824 = null;
        }
        C1D82 c1d826 = new C1D82(AFwS210S0000000_22.get$arr$(387), EnumC1434770nRL.SAVE_LOCAL);
        if (z) {
            c1d825.LIZ(c1d82, c1d822);
            c1d826.LIZ(c1d825);
        } else {
            c1d826.LIZ(c1d82, c1d822);
        }
        return new C1434860nRU(c1d825, c1d826, c1d824);
    }
}
