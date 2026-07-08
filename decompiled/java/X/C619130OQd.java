package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAudioInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import java.util.List;

/* JADX INFO: renamed from: X.0OQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619130OQd {
    public static boolean LIZ;

    public static final void LIZ() {
        if (LIZ) {
            return;
        }
        C619040OPu.LIZIZ("text", new TypeToken<String>() { // from class: X.0OQf
        });
        C619040OPu.LIZIZ("links", new TypeToken<List<? extends String>>() { // from class: X.0OQe
        });
        C619040OPu.LIZIZ("images", new TypeToken<List<? extends BulletinImage>>() { // from class: X.0OQc
        });
        C619040OPu.LIZIZ("poll", new TypeToken<BulletinPoll>() { // from class: X.0OQg
        });
        C619040OPu.LIZIZ("forward_aweme", new TypeToken<Aweme>() { // from class: X.0OQh
        });
        C619040OPu.LIZIZ("lynx_card", new TypeToken<BulletinCardInfo>() { // from class: X.0OQi
        });
        C619040OPu.LIZIZ("live_room", new TypeToken<BulletinCardInfo>() { // from class: X.0OQj
        });
        C619040OPu.LIZIZ("inlineMsg", new TypeToken<String>() { // from class: X.0OQk
        });
        C619040OPu.LIZIZ("voice", new TypeToken<List<? extends BulletinAudioInfo>>() { // from class: X.0OPn
        });
        LIZ = true;
    }
}
