package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SHX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SHX {
    public static C1620050sGB LIZ(Context context, LifecycleOwner lifecycleOwner) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ instanceof C19EG) {
            feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of((C19EG) activityLIZ, C1620050sGB.LIZLLL).get(FeedPanelStateViewModel.class);
        } else {
            feedPanelStateViewModel = null;
        }
        return new C1620050sGB(feedPanelStateViewModel, context, new WeakReference(lifecycleOwner));
    }
}
