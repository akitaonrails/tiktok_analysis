package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel;

/* JADX INFO: renamed from: X.0ZAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895300ZAi {
    public static InboxArchiveNoticeViewModel LIZ(LifecycleOwner lifecycleOwner, ViewModelProvider.Factory factory) {
        if (C286690BLn.LIZ()) {
            return null;
        }
        return (InboxArchiveNoticeViewModel) new SharedViewModelProvider(factory).get(lifecycleOwner.getLifecycle(), "inbox_share_vm", InboxArchiveNoticeViewModel.class);
    }
}
