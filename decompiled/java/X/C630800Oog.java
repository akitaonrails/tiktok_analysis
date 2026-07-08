package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.assem.BulletinMusicDetailAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Oog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630800Oog {
    public static List LIZ(MusicDetail musicDetail) {
        Pair<Boolean, List<MusicOwnerInfo>> pairLIZIZ;
        Music music = musicDetail.music;
        if (music == null) {
            return C13BV.INSTANCE;
        }
        if (C630310Ont.LIZIZ(music)) {
            pairLIZIZ = C630970Oox.LIZ(music);
        } else {
            pairLIZIZ = C630970Oox.LIZIZ(music);
        }
        return pairLIZIZ.getSecond();
    }

    public static int LIZIZ(MusicDetail musicDetail) {
        String secUid;
        String secUid2;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String str = "";
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
            secUid = "";
        }
        MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) C13LP.LJJJLL(LIZ(musicDetail));
        if (musicOwnerInfo != null && (secUid2 = musicOwnerInfo.getSecUid()) != null) {
            str = secUid2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(secUid);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return BulletinMusicDetailAssem.LLJJJJJIL.getValue().getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
