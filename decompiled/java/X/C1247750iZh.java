package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247750iZh {
    public static final C1247750iZh LIZ = new C1247750iZh();

    public static Fragment LIZ(EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, int i, Function0 function0) {
        return ((IFriendsService) ServiceManager.get().getService(IFriendsService.class)).LJIILL(enumC1262450ixP, mufPageTrackInfo, i, function0);
    }
}
