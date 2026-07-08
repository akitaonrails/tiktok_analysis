package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import java.util.List;

/* JADX INFO: renamed from: X.0L0S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0S {
    public static final boolean LIZ(AIGCInfo aIGCInfo) {
        List<AlbumAigc> albumAigc = aIGCInfo.getAlbumAigc();
        if (albumAigc != null) {
            for (AlbumAigc albumAigc2 : albumAigc) {
                Integer aiType = albumAigc2.getAiType();
                if (aiType != null && aiType.intValue() == 5) {
                    if (albumAigc2 != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
