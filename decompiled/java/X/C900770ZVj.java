package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.TryEffectMobViewModel;

/* JADX INFO: renamed from: X.0ZVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900770ZVj {
    public static TryEffectMobViewModel LIZ(Fragment fragment) {
        return (TryEffectMobViewModel) ViewModelProviders.of(fragment).get(TryEffectMobViewModel.class);
    }
}
