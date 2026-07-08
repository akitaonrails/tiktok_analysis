package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429400nIg {
    public static final C1429400nIg LIZ = new C1429400nIg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(236));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(338));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(235));
    public static C1429360nIc LJ;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.draftInfoModel.isDraft && u4.LJII(videoPublishEditModel) && ((C1428470nHB.LJLIIL(videoPublishEditModel) || C1428470nHB.LJZL(videoPublishEditModel) || u4.LIZJ(videoPublishEditModel)) && ((Number) C267650AeJ.LIZ.getValue()).intValue() != 0 && ((Keva) LIZIZ.getValue()).getInt("key_cancel_count", 0) < 3)) {
            return true;
        }
        return false;
    }
}
