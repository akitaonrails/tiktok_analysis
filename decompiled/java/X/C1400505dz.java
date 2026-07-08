package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1400505dz {
    public static final boolean LIZ(Aweme aweme) {
        return TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
    }
}
