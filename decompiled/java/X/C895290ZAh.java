package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;

/* JADX INFO: renamed from: X.0ZAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895290ZAh {
    public static MultiViewModel LIZ(C19EG c19eg) {
        if (C286690BLn.LIZ()) {
            return (MultiViewModel) ViewModelProviders.of(c19eg, MultiViewModel.LLLILZ.getValue()).get(MultiViewModel.class);
        }
        InboxArchiveNoticeViewModel inboxArchiveNoticeViewModelLIZ = C895300ZAi.LIZ(c19eg, MultiViewModel.LLLILZ.getValue());
        if (inboxArchiveNoticeViewModelLIZ instanceof MultiViewModel) {
            return (MultiViewModel) inboxArchiveNoticeViewModelLIZ;
        }
        return null;
    }
}
