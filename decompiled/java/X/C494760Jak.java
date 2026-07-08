package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel;

/* JADX INFO: renamed from: X.0Jak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494760Jak {
    public static final /* synthetic */ int LIZ = 0;

    public static BaseDetailShareVM LIZ(Context context, LifecycleOwner lifecycleOwner) {
        int iHashCode;
        SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory());
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("landscapefeed");
        if (context != null) {
            iHashCode = context.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        ViewModel viewModel = sharedViewModelProvider.get(lifecycle, C2188811AlT.LIZIZ(sbLIZ), LandscapeFeedViewModel.class);
        BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) viewModel;
        if (!baseDetailShareVM._initialized) {
            baseDetailShareVM.AQ2(lifecycleOwner);
        }
        return (BaseDetailShareVM) viewModel;
    }
}
