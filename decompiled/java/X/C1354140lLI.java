package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0lLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354140lLI implements InterfaceC2753014t {
    public final C1350320lF8 LL;
    public final Object LLILLJJLI;
    public final WeakReference<Activity> LLILLL;
    public final WeakReference<Fragment> LLILZ;
    public final WeakReference<VideoShrinkAbility> LLILZIL;
    public final WeakReference<RootCellCommonAbility> LLILZLL;

    public C1354140lLI(Activity activity, Fragment fragment, VideoShrinkAbility videoShrinkAbility, RootCellComponent rootCellComponent, C1350320lF8 c1350320lF8, C1349800lEI c1349800lEI) {
        this.LL = c1350320lF8;
        this.LLILLJJLI = c1349800lEI;
        this.LLILLL = new WeakReference<>(activity);
        this.LLILZ = new WeakReference<>(fragment);
        this.LLILZIL = new WeakReference<>(videoShrinkAbility);
        this.LLILZLL = new WeakReference<>(rootCellComponent);
    }
}
