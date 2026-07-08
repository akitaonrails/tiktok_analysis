package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Srf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734570Srf extends C09AY implements Function2<FeedAvatarDefaultAssem, C291001Au<? extends C586100Mym>, Unit> {
    public C734570Srf() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C291001Au<? extends C586100Mym> c291001Au) {
        C586100Mym c586100Mym;
        String aid;
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        C291001Au<? extends C586100Mym> c291001Au2 = c291001Au;
        Object obj = null;
        if (c291001Au2 != null) {
            c586100Mym = (C586100Mym) c291001Au2.LIZ;
        } else {
            c586100Mym = null;
        }
        feedAvatarDefaultAssem2.getClass();
        if (c586100Mym != null) {
            boolean z = c586100Mym.LIZIZ;
            Aweme aweme = c586100Mym.LIZ;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            C724270Sb3 c724270Sb3 = feedAvatarDefaultAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            if (TextUtils.equals(aid, ((VideoItemParams) obj).getAweme().getAid()) && !z) {
                feedAvatarDefaultAssem2.zp();
            }
        }
        return Unit.LIZ;
    }
}
