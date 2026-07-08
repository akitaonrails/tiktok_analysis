package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedStatusUpdateViewModel;

/* JADX INFO: renamed from: X.0rw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607560rw2 {
    public static final CollabFeedStatusUpdateViewModel LIZ(Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.INITIALIZED) <= 0) {
            return null;
        }
        return (CollabFeedStatusUpdateViewModel) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, CollabFeedStatusUpdateViewModel.class);
    }
}
