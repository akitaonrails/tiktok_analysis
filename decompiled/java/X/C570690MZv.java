package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0MZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570690MZv {
    public static final C570690MZv LIZ = new C570690MZv();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4760));
    public static final ArrayList<Integer> LIZJ = C1697810uHb.LJ(0, 2, 5, 10, 11, 12);

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.draftInfoModel.isDraft || u4.LJLL(videoPublishEditModel) || C1428470nHB.LLIIIL(videoPublishEditModel) || C1428470nHB.LLIIIJ(videoPublishEditModel) || C1428470nHB.LJLIIL(videoPublishEditModel) || C1428470nHB.LJZ(videoPublishEditModel)) {
            return false;
        }
        if (C1428470nHB.LJZL(videoPublishEditModel)) {
            C1431780nMW.LIZ.getClass();
            if (C1431780nMW.LJI(videoPublishEditModel, null, null)) {
                return false;
            }
        }
        LIZ.getClass();
        if (!((Boolean) LIZIZ.getValue()).booleanValue() || videoPublishEditModel.getCreationMode() != 1) {
            return false;
        }
        return true;
    }
}
