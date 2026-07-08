package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;

/* JADX INFO: renamed from: X.0S4L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4L {
    public static final boolean LIZ(Aweme aweme, IVideoGiftService iVideoGiftService) {
        if (aweme.isAd() || ComplianceServiceProvider.LJIL().LJJIJIIJIL() || !iVideoGiftService.LIZ(aweme) || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getGiftBagStatus() != 1 || aweme.getAuthor() == null) {
            return false;
        }
        return true;
    }
}
