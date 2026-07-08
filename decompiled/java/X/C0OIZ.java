package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIZ {
    public static BulletinAccountEditResponse LIZ(String str) {
        String first;
        BulletinAccountEditResponse second;
        if (str == null) {
            return null;
        }
        Pair<String, BulletinAccountEditResponse> pair = BulletinProfileViewModel.LLJLLL;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (!Intrinsics.LJFF(first, str)) {
            return null;
        }
        Pair<String, BulletinAccountEditResponse> pair2 = BulletinProfileViewModel.LLJLLL;
        if (pair2 != null) {
            second = pair2.getSecond();
        } else {
            second = null;
        }
        BulletinProfileViewModel.LLJLLL = null;
        return second;
    }
}
