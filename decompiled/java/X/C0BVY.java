package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BVY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BVY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(360));

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        C01GW c01gw = LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            return false;
        }
        if (((Number) c01gw.getValue()).intValue() == 1 && videoPublishEditModel != null && videoPublishEditModel.getMusicId() != null && videoPublishEditModel.getMusicId().length() > 0) {
            return false;
        }
        return true;
    }
}
